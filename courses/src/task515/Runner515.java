/*
В сообщении, состоящем из одних русских букв и пробелов,
каждую букву заменили ее порядковым номером в русском алфавите (А — 1, Б — 2, ..., Я — 33),
а пробел — нулем. Требуется по заданной последовательности цифр найти зашифрованной сообщение
 */

package task515;

public class Runner515 {

    public static void main(String[] args) {
        try{
            Decryption aDecryption = new Decryption("0101010002030012130001");
            aDecryption.Decrypt();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

}
