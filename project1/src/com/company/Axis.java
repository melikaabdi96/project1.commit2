package com.company;

import java.util.ArrayList;

public class Axis extends Player{

    private ArrayList<Card.CardType> axisCards;

    public Axis(){
        super();
        this.axisCards = new ArrayList<>();

    }

    @Override
    public void giveCards(){
        for(int i = 0; i < 4 ; i++){
            addAxisCards();
        }
    }

    public void addAxisCards(){
        if(getCards().size() != 0){
            axisCards.add(getCard(0));
            getCards().remove(0);
        }else {
            reuseCards();
            axisCards.add(getCard(0));
            getCards().remove(0);
        }
    }

    @Override
    public void ChooseCard(Card card){
        if (getAxisCards().contains(card)){
            axisCards.remove(card);
        }
    }

    public ArrayList<Card.CardType> getAxisCards(){
        return axisCards;
    }

}
