public class practise1 { //遞迴p8-27

  long power(int x,int y){
    if(y<=0){
      return 1;
    }
    return x * power(x, y-1);
  }

}
