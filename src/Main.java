//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IcCard card1 = new IcCard();
        card1.money = 300;

        IcCard card2 = new IcCard();
        card2.money = 100;

        IcCard card3 = new IcCard();
        card3.money = 400;

//        IcCard[] myCards = {card1, card2, card3};
        IcCard[] myCards = new IcCard[3];
        myCards[0] = card1;
        myCards[1] = card2;
        myCards[2] = card3;

        CardMachine cardMachine = new CardMachine();
        int amount = cardMachine.getAmount(myCards);
//        int amount = cardMachine.getAmount(new IcCard[] {card1, card2, card3});
        System.out.println(amount);

//        int length = myCards.length;

    }
}