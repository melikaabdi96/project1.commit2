package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 * Card class
 * @author Melika
 * @since 2020
 * @version
 */
public class Card {
    //each card have one type
    enum CardType{
        OneGroup, TwoGroups, ThreeGroups, FourGroups, ThreeUnits;

        //A collection of card types
        private static final CardType[] cards = CardType.values();
        //get card type of a card
        public static CardType getCards(int i) {
            return CardType.cards[i];
        }
    }
    //card
    private CardType card;


    /**
     * create a card
     * @param card card,type of card
     */
    public Card(final CardType card){

        this.card = card;
    }

    /**
     * @return type of card
     */
    public CardType getCard() {
        return card;
    }


    /**
     * print a card after checking the type
     */
    public void printCard(){
        StringBuilder GameCard = new StringBuilder();
        StringBuilder upCard = new StringBuilder();
        StringBuilder downCard = new StringBuilder();
        switch (card){
            case OneGroup:
                upCard.append("\u001B[43;1m");
                upCard.append("    \u2728 Card \u2728    ");
                upCard.append("\033[0m");
                GameCard.append("\u001B[43;1m");
                GameCard.append(" \u269Dorder 1 group  ");
                GameCard.append("\033[0m");
                downCard.append("\u001B[43;1m");
                downCard.append("       \u2620\u2620       ");
                downCard.append("\033[0m");
                break;
            case TwoGroups:
                upCard.append("\u001B[42;1m");
                upCard.append("    \u2728 Card \u2728    ");
                upCard.append("\033[0m");
                GameCard.append("\u001B[42;1m");
                GameCard.append(" \u269Dorder 2 groups ");
                GameCard.append("\033[0m");
                downCard.append("\u001B[42;1m");
                downCard.append("       \u2620\u2620       ");
                downCard.append("\033[0m");
                break;
            case ThreeGroups:
                upCard.append("\u001B[45;1m");
                upCard.append("    \u2728 Card \u2728    ");
                upCard.append("\033[0m");
                GameCard.append("\u001B[45;1m");
                GameCard.append(" \u269Dorder 3 groups ");
                GameCard.append("\033[0m");
                downCard.append("\u001B[45;1m");
                downCard.append("       \u2620\u2620       ");
                downCard.append("\033[0m");
                break;
            case FourGroups:
                upCard.append("\u001B[46;1m");
                upCard.append("    \u2728 Card \u2728    ");
                upCard.append("\033[0m");
                GameCard.append("\u001B[46;1m");
                GameCard.append(" \u269Dorder 4 groups ");
                GameCard.append("\033[0m");
                downCard.append("\u001B[46;1m");
                downCard.append("       \u2620\u2620       ");
                downCard.append("\033[0m");
                break;
            case ThreeUnits:
                upCard.append("\u001B[41;1m");
                upCard.append("    \u2728 Card \u2728    ");
                upCard.append("\033[0m");
                GameCard.append("\u001B[41;1m");
                GameCard.append(" \u269Dorder 4 units  ");
                GameCard.append("\033[0m");
                downCard.append("\u001B[41;1m");
                downCard.append("       \u2620\u2620       ");
                downCard.append("\033[0m");
                break;

        }
        System.out.println(upCard);
        System.out.println(GameCard);
        System.out.println(downCard);
    }


    /**
     * checks two card equality
     *
     * @param object object to be compared
     * @return true if two cards are equal
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Card))
            return false;
        Card card = (Card) object;
        return getCard() == card.getCard();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCard());
    }
}
