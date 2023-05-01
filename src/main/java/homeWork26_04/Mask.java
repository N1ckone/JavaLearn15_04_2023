package homeWork26_04;

public class Mask {


    public static String getMask(int num) {
        String mask = "00000000";
        String param = Integer.toString(num);
        StringBuilder stringBuilder = new StringBuilder();
        int lengthDiff = mask.length() - param.length();
        if(lengthDiff < 0) {
            return "Слишком большое число";
        }
        for (int i = 0; i < lengthDiff; i++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(param);

        return stringBuilder.toString();
    }
}
