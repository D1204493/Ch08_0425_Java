public class Practise2 { //計算階層p8-33

  long factorial(int x){ //已遞迴計算階層
    if(x==0){
      return 1;
    }
    return x * factorial(x-1);
  }

}
