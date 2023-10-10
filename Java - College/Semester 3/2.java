import java.util.Scanner;
class AreaOfRectangle {
  public static void main(String args[]) {   
   
  Scanner s= new Scanner(System.in);
  
  System.out.println("Enter the length:");
  int l= s.nextInt();
  System.out.println("Enter the breadth:");
  int b= s.nextInt();  
  int  area=l*b;
  System.out.println("Area of Rectangle is: " + area);  
  s.close();
  }
}