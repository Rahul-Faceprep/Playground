import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      int Count =0, res =1;
      while(Count < exponent)
      {
        res = res * base;
        Count++;
    }
      System.out.println(res);
    }
}