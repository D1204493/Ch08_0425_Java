import java.util.*;
public class Practise2Main {
  public static void main(String [] argv){  //計算階層p8-33

    Practise2 c = new Practise2();

    System.out.print("計算x!,請輸入 x->");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(x +"! = "+ c.factorial(x));

  }
}
