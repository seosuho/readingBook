package me.whiteship.chapter01.item05.springioc;

import me.whiteship.chapter01.item05.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpellChecker {

    // Default는 @Primary로 설정되어 있는 빈이 주입되고 @Qualifier로 설정해서 테스트 코드의 경우 다른 빈이 주입되도록 설정할수도 있음
//    @Qualifier("testDictionary")
    @Autowired
    private Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }
}
