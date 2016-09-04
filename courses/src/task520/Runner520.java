/*
Отредактировать заданное предложение, удаляя из него слова, которые встречаются в предложении n раз.
 */

package task520;

public class Runner520 {

    public static void main(String[] args) {

        EditText aEditText = new EditText("Маленький маленький маленький мальчик мальчик бульдозер достал - школу школу школу случайно с землею сравнял!");
        System.out.println(aEditText.editSentence());
    }
}
