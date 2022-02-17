package javaTest;

public class Three {
    //reverse the string
    //comparing the string with the reverse string
    //return yes or no
    static String x = "anna";

    public static void main(String[] args) {
        int strLen = x.length() - 1;
        for (int i = strLen; i >= 0; i--) {
            for (int j = 0; i < strLen; i++) {
                if (x.charAt(i) != x.charAt(j)) {
                    System.out.println("no");
                }
                break;
            }
        }
    }

}
