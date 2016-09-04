package task515;

import java.util.HashMap;
import java.util.Map;

public class Decryption {

    private String encrText;

    public Decryption(String encrText){
        super();
        if ((encrText.length()%2) != 0){
            throw new RuntimeException("Проверьте зашифрованную строку");
        }
        this.encrText = encrText;
    }

    public void Decrypt(){

        Map<String, String> hm = new HashMap<>();
        hm.put("01", "а");
        hm.put("02", "б");
        hm.put("03", "в");
        hm.put("12", "к");
        hm.put("13", "л");
        hm.put("00", " ");
//Тут и все другие буквы русского алфавита, только их не видно =)

        for(int i = 0; i < encrText.length(); i=i+2){
            System.out.print(hm.get(encrText.substring(i, i+2)));
        }
    }








}