/*
Дан текст. Найти сумму имеющихся в нем цифр
 */

package task510;

public class Runner510 {

    public static void main(String[] args) {

        SumNumbers aSumNumbers = new SumNumbers("1111DEFD22EFABCABCZABC7D4EF9DE1F7");
        int out = aSumNumbers.calcSum();
        System.out.println(out);
    }
}
