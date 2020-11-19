package com.company;

import java.util.ArrayList;

public class Allied extends Player{

    private ArrayList<Card.CardType> alliedCards;

    public Allied(){
        super();
        this.alliedCards = new ArrayList<>();
    }

    @Override
    public void giveCards() {
        for (int i = 0; i < 2; i++) {
            addAlliedCards();
        }
    }

    public void addAlliedCards(){
        if(getCards().size() != 0) {
            alliedCards.add(getCard(0));
            getCards().remove(0);
        }else {
            reuseCards();
            alliedCards.add(getCard(0));
            getCards().remove(0);
        }
    }

    @Override
    public void ChooseCard(Card card){
        if (getAlliedCards().contains(card)){
            alliedCards.remove(card);
        }
    }

    public ArrayList<Card.CardType> getAlliedCards(){
        return alliedCards;
    }

}
