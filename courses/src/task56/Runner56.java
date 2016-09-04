/*
Дана текстовая строка, состоящая из заглавных латинских букв.
Требуется найти подстроку из трёх букв, которая встречается
в данной строке чаще всего. Например, в строке
DEFDEFABCABCZABCDEFDEF чаще всего (4 раза) встречается подстрока DEF.
 */

package task56;

public class Runner56 {
    public static void main(String[] args) {

        Finder aFinder = new Finder("DEFDEFABCABCZABCDEFDEF");
        String out = aFinder.findMoreSubstr();
        System.out.println(out);

    }
}