import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private Character cs;
    private Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'm' || chars[i] >= 'A' && chars[i] <= 'M') {
                int num = chars[i] + 13;
                chars[i] = num;
            } else if (chars[i] >= 'n' && chars[i] <= 'z' || chars[i] >= 'N' && chars[i] <= 'Z') {
                int num = chars[i] - 13;
                chars[i] = num;
            }
        }
        return new String(chars);
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
