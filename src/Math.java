public class Math {
    long power(int x,int y) { //power(2,5)
//        int result = 1;
//        for(int i=0; i<y; i++){
//            result *= x;
//        }
//        return result;

        //power(2,5) -> 2 * power(2,4)
        //power(2,4) -> 2 * power(2,3)
        //power(2,3) -> 2 * power(2,3)
        //power(2,2) -> 2 * power(2,1)
        //power(2,1) -> 2 * power(2,0) = 1

        if(y == 0){
            return 1;
        }
        long result = x * power(x,y-1);
        return result;

    }
}
