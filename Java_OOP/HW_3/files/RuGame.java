package Java_OOP.HW_3.files;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char i = 'а'; i <= 'я'; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
