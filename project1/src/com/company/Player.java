package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Player extends Memoir{
    //A group of soldiers
    private Soldier[] soldierGroup;
    //A group of tanks
    private Tank[] tankGroup;
    //A group of artilleries
    private Artillery[] ArtilleryGroup;
    //Board rows
    private int boardRow = 9;
    //Board columns
    private int boardColumn = 13;
    private ArrayList<Card.CardType> playerCards;
    private ArrayList<String> usedCarts = new ArrayList<>();
    public Player(){
        this.playerCards = new ArrayList<Card.CardType>();
        addCards();
        
    }


    private ArrayList<ArrayList> armiesGroups = new ArrayList<>();

    public void addCards(){
        for(int i =0; i <6; i++){
            playerCards.add(Card.CardType.OneGroup);
        }
        for(int i =0; i <13; i++){
            playerCards.add(Card.CardType.TwoGroups);
        }
        for(int i =0; i <10; i++){
            playerCards.add(Card.CardType.ThreeGroups);
        }
        for(int i =0; i <6; i++){
            playerCards.add(Card.CardType.FourGroups);
        }
        for(int i =0; i <5; i++){
            playerCards.add(Card.CardType.ThreeUnits);
        }
        Collections.shuffle(playerCards);
    }

    public ArrayList<Card.CardType> getCards() {return playerCards;}

    public Card.CardType getCard(int index){
        
        return playerCards.get(index);
    }



    public void giveCards(){}

    public void reuseCards(){
        if(playerCards.size() == 0){
            addCards();
            giveCards();
        }
    }

    public void ChooseCard(Card card){
        if (getCards().contains(card)){
            playerCards.remove(card);
        }
    }


}






