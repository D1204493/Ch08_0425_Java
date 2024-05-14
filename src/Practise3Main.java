import java.util.*;
public class Practise3Main {
  public static void main(String [] argv){

    Practise3 m = new Practise3();
    System.out.print("請輸入n:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println("Fibonacci數列第"+n+"項："+
            m.fibonacci(n));


  }
}
