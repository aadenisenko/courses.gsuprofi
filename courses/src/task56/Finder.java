package task56;

import java.util.HashMap;
import java.util.Map;

public class Finder {

    private final int COUNT_LETTERS = 3;
    private String searchStr;

    public Finder(String searchStr) {
        super();
        this.searchStr = searchStr;
    }


    public String findMoreSubstr() {

        int maxCount = 0;
        String maxKey = null;

        Map<String, Integer> map = new HashMap();
        for (int i = 0; i <= searchStr.length() - COUNT_LETTERS; i++) {
            String subStr = searchStr.substring(i, i + COUNT_LETTERS);
//			System.out.println(subStr);
            if (map.isEmpty()) {
                maxCount = 1;
                maxKey = subStr;
            }
            if (!map.containsKey(subStr)) {
                map.put(subStr, 1);
            } else {
                Integer val = map.get(subStr);
                val = new Integer(val.intValue() + 1);
                if (maxCount < val.intValue()) {
                    maxCount = val.intValue();
                    maxKey = subStr;
                }
                map.put(subStr, val);
            }
//			System.out.println(map);
        }
        return maxKey;
    }
}
