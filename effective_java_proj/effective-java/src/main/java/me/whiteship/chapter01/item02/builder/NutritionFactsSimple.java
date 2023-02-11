package me.whiteship.chapter01.item02.builder;

import lombok.Builder;

@Builder
// 코드 2-3 빌더 패턴 - 점층적 생성자 패턴과 자바빈즈 패턴의 장점만 취했다. (17~18쪽)
public class NutritionFactsSimple {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static void main(String[] args) {
        NutritionFactsSimple nutritionFactsSimple = new NutritionFactsSimpleBuilder()
                .servingSize(10)
                .calories(5)
                .build();
        System.out.println(nutritionFactsSimple.servingSize);
    }
}
