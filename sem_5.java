import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class sem_5 {

    public static void main(String[] args) {
        task0();
        System.out.println(task1("paper", "title"));
        System.out.println(task3("<{a}+{(d*3)}>"));
        System.out.println(task3("{a+]}{(d*3)}"));

    }

    static void task0() {
        /*
         * <aside>
         * 📔 **Текст задачи:**
         * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников
         * организации.
         * 
         * 123456 Иванов
         * 
         * 321456 Васильев
         * 
         * 234561 Петрова
         * 
         * 234432 Иванов
         * 
         * 654321 Петрова
         * 
         * 345678 Иванов
         * 
         * Вывести данные по сотрудникам с фамилией Иванов.
         * 
         * </aside>
         */
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");
        System.out.println(passports.getByLastName("Иванов"));
        System.out.println(passports.getByPassNum("321456"));
        System.out.println(passports.getAll());
    }

    static boolean task1(String str1, String str2) {
        /*
         * <aside>
         * 📔 **Текст задачи:**
         * Даны 2 строки, написать метод, который вернет true, если эти строки являются
         * изоморфными и false, если нет.
         * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую
         * букву во втором слове, при этом
         * 
         * 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с
         * сохранением порядка следования. (Например, add - egg изоморфны)
         * 2. буква может не меняться, а остаться такой же. (Например, note - code)
         * 
         * Пример 1:
         * 
         * Input: s = "foo", t = "bar"
         * 
         * Output: false
         * 
         * Пример 2:
         * 
         * Input: s = "paper", t = "title"
         * p=t
         * a=i
         * e=l
         * r=e
         * Output: true
         * 
         * </aside>
         */
        if (str1.length() != str2.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i] != map.get(c1[i]))
                    return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }

    static boolean task3(String str) {
        /*
         * <aside>
         * 📔 **Текст задачи:**
         * Написать программу, определяющую правильность расстановки скобок в выражении.
         * 
         * Пример 1: (a+(d*3)) - истина
         * 
         * Пример 2: [a+(1*3) - ложь
         * 
         * Пример 3: [6+(3*3)] - истина
         * 
         * Пример 4: {a}[+]{(d*3)} - истина
         * 
         * Пример 5: <{a}+{(d*3)}> - истина
         * 
         * Пример 6: {a+]}{(d*3)} - ложь
         * 
         * </aside>
         */
        HashMap<Character, Character> newMap = createMap();
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (newMap.containsKey(c[i])) {
                stack.push(c[i]);
            }
            if (newMap.containsValue(c[i])) {
                if (stack.isEmpty() || c[i] != newMap.get(stack.pop())) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

    static HashMap<Character, Character> createMap() {
        HashMap<Character, Character> newMap = new HashMap<>();
        newMap.put('(', ')');
        newMap.put('[', ']');
        newMap.put('<', '>');
        newMap.put('{', '}');
        return newMap;
    }
}
