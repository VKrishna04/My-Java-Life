class MultipleCatchBlocks {
  public static void main(String[] Args) {
    try {
      int a[] = new int[5];
      a[5] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs - " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs - " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Parent Exception occurs - " + e.getMessage());
    } finally {
      System.out.println("'Finally' block is always executed");
    }
  }
}