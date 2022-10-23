public class Main {

    public static void main(String[] args) {
        // write your code using the existing class ConstantsAndUtilities

        String a = ConstantsAndUtilities.A_CONSTANT_TTT;
        String b = ConstantsAndUtilities.B_CONSTANT_QQQ;
        String c = ConstantsAndUtilities.getMagicString();
        String d = ConstantsAndUtilities.convertStringToAnotherString("aa");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }

}

// Don't change this class
class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}