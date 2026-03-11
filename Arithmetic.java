import java.util.Scanner;
class Arithmetic
  {
    public static void main(String args[])
    {
      Scanner S = new Scanner(System.in);
      System.out.println("Enter two numbers");
      int a = S.nextInt();
      int b = S.nextInt();
      int sum = a+b;
      int diff = a-b;
      int mul = a*b;
      int div = b/a;
      System.out.println(sum);
      System.out.println(diff);
      System.out.println(mul);
      System.out.println(div);
    }
  }
