package me.whiteship.chapter01.item01;

import java.util.*;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

    public static Order primeOrder(Product product) {
        Order order = new Order();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static Order urgentOrder(Product product) {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    public static void main(String[] args) {

        Order order = new Order();
        if (order.orderStatus == OrderStatus.DELIVERED) {
            System.out.println("delivered");
        }

        System.out.println("===== [values] 사용법 =====");
        for (OrderStatus orderStatus : OrderStatus.values()) {
            System.out.println(orderStatus);
        }

        System.out.println("===== [valueOf] 사용법 =====");
        System.out.println(OrderStatus.valueOf("DELIVERED"));

        System.out.println("===== [EnumSet] 사용법 =====");
        EnumSet<OrderStatus> orderStatuses = EnumSet.allOf(OrderStatus.class);
        EnumSet<OrderStatus> es = EnumSet.copyOf(orderStatuses);
        System.out.println("EnumSet.allOf() - " + es);

        es = EnumSet.noneOf(OrderStatus.class);
        System.out.println("EnumSet.noneOf - " + es);

        es = EnumSet.of(OrderStatus.PREPARING, OrderStatus.SHIPPED);
        System.out.println("EnumSet.of - " + es);

        es = EnumSet.complementOf(es);
        System.out.println("EnumSet.complementOf - " + es);

        es = EnumSet.range(OrderStatus.PREPARING, OrderStatus.DELIVERED);
        System.out.println("EnumSet.range - " + es);

        System.out.println("===== [EnumMap] 사용법 =====");
        EnumMap<OrderStatus, String> orderStatusObjectEnumMap = new EnumMap<>(OrderStatus.class);
        orderStatusObjectEnumMap.put(OrderStatus.PREPARING, "First");
        orderStatusObjectEnumMap.put(OrderStatus.SHIPPED, "Second");
        System.out.println(orderStatusObjectEnumMap);
    }
}
