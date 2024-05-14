public class Practise3 {

  long fibonacci(int n){
    if(n<=2){
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }

}
