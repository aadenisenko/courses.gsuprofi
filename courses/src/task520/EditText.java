package task520;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EditText {

    String sentence;

    public EditText(String sentence) {
        super();
        this.sentence = sentence;
    }

    public String editSentence(){

        System.out.println("Start: "+sentence);

        Map<String, Integer> map = new HashMap();
        String[] result = sentence.split("\\s");
        for (int i=0; i<result.length; i++){
            String key = result[i];
            if (!map.containsKey(key)){
                map.put(key, 1);
            } else {
                Integer val = map.get(key);
                val = new Integer(val.intValue() + 1);
                map.put(key, val);
            }

//	         System.out.println(result[i]);
        }
        System.out.println(map);

        List <String> delStrings = new ArrayList();
        for (String key: map.keySet()){
            if(map.get(key).equals(3)){ // Количество повторений
                delStrings.add(key);
            }
        }
        System.out.println(delStrings);

        for (String word : delStrings){
            sentence = sentence.replaceAll(word, "");
        }

//        System.out.println(sentence);

        return sentence;
    }



}
