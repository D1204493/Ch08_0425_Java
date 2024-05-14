public class CardMachine {

    int getAmount(IcCard[] cards) { //cards = myCards;
        int amount = 0;            //cards = {card1, card2, card3};

//        for(int i=0; i<cards.length; i++){
//            amount += cards[i].money;
//        }

        for (IcCard aCard : cards){  //IcCard aCard = cards[i]
            amount += aCard.money;
        }
        return amount;
    }



}
