package me.whiteship.chapter01.item05.springioc;

import me.whiteship.chapter01.item05.Dictionary;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@Primary
@Qualifier("testDictionary")
public class TestDictionary implements Dictionary {
    @Override
    public boolean contains(String word) {
        System.out.println("TestDictionary: " + word);
        return true;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
