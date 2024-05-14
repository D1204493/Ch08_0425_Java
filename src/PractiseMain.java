import java.util.*;
public class PractiseMain { //遞迴p8-27
  public static void main(String [] argv){
    practise1 r = new practise1();

    Scanner sc = new Scanner(System.in);
    System.out.println("輸入:");
    int x = sc.nextInt();
    int y = sc.nextInt();

    System.out.println(r.power(x,y));

  }
}
