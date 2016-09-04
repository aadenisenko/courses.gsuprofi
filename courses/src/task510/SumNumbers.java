package task510;

public class SumNumbers {

    String text;

    public SumNumbers(String text) {
        super();
        this.text = text;
    }

    public int calcSum(){
        int sum = 0;
        for (int i = 0; i < text.length(); i++){
            if (Character.isDigit(text.charAt(i))){
//			System.out.println(Character.getNumericValue(text.charAt(i)));
                sum += Character.getNumericValue(text.charAt(i));
            }
        }
        return sum;
    }
}

