/**
 * StringIntro
 * 1. declaration by
 * - String literal s1
 * - new keyword s2, s3
 * 2. charAt() method which give the character at index.
 */
public class StringIntro {
  public static void main(String[] args) {
    String s1 = "hello";
    char[] ch = { 's', 't', 'r', 'i', 'n', 'g' };
    String s2 = new String(ch);
    String s3 = new String("hello");
    char ch1 = s1.charAt(5);
    System.out.println(ch1);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
  }

}