public class IcCard {
    int id;
    int money;

    void showInfo(){
        System.out.println(id+";"+money);
    }

    void add(int money){
        this.money += money;
        System.out.println("Add money:"+money
                + " ; amount:"+ this.money);
    }

    void add(int money, double currency){

    }
    void add(int token,String str){

    }





}
