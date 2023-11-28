public class StringErr {
  public static void main(String[] args) {
    String str = new String("Welcome to My Java Life");
    char[] ch = new char[10];
    try {
      str.getChars(0, 10, ch, 0);
      System.out.println(ch);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Array out of bounds exception occurred");
    } finally {
      // Your finally block code here
    }
  }
}