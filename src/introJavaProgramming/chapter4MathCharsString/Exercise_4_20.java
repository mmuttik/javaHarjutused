package introJavaProgramming.chapter4MathCharsString;

public class Exercise_4_20 {
    public static void main(String[] args) {

        String s1 = " Welcome ";
        String s2 = " welcome ";

        boolean isEqual = s1.equals(s2);

        System.out.println(isEqual);

        isEqual = s1.equalsIgnoreCase(s2);

        System.out.println(isEqual);

        int x = s1.compareTo(s2);

        System.out.println(x);

        x = s1.compareToIgnoreCase(s2);

        System.out.println(x);

        boolean b = s1.startsWith("AAA");

        System.out.println(b);

        b = s1.endsWith("AAA");

        System.out.println(b);

        x = s1.length();

        System.out.println(x);

        char y = s1.charAt(1);

        System.out.println(y);

        String s3 = s1 + s2;

        System.out.println(s3);

        System.out.println(s1.substring(1));

        System.out.println(s1.substring(1, 4));

        s3 = s1.toLowerCase();

        System.out.println(s3);

        s3 = s1.toUpperCase();

        System.out.println(s3);

        s3 = s1.trim();

        System.out.println(s3);

    }
}
