// Question: Q3 (mte2, gcis124, 2255)
// Package name: cards
// File name: PlayingCard.java

package mte2.cards;

public class PlayingCard implements Comparable<PlayingCard> {
    
    private final Suit suit;  // The suit of this card.
    private final Rank rank;  // The rank of this card.

    /**
     * Creates a new playing card with the specified suit and rank.
     * @param suit The suit of the new card.
     * @param rank The rank of the new card.     
     */
    public PlayingCard(Suit suit, Rank rank) { this.suit = suit;  this.rank = rank;  }
    
    public Suit getSuit() {    return suit;    }
    public Rank getRank() {    return rank;    }
    
    @Override
    public String toString() {    return rank + " of " + suit;    }

    @Override
    public int compareTo(PlayingCard o) {
        if (this.getSuit().compareTo(o.getSuit()) != 0)
            return this.getSuit().compareTo(o.getSuit());
        else return this.getRank().getRankNumber() - o.getRank().getRankNumber();
    }

    public static void main(String[] args) {
        
        java.util.List<PlayingCard> cards = new java.util.LinkedList<>();
        cards.add(new PlayingCard(Suit.HEARTS, Rank.FIVE));
        cards.add(new PlayingCard(Suit.SPADES, Rank.TEN));
        cards.add(new PlayingCard(Suit.CLUBS, Rank.QUEEN));
        
        cards.add(new PlayingCard(Suit.DIAMONDS, Rank.TWO));
        cards.add(new PlayingCard(Suit.HEARTS, Rank.ACE));
        cards.add(new PlayingCard(Suit.SPADES, Rank.FOUR));
        cards.add(new PlayingCard(Suit.CLUBS, Rank.KING));

        java.util.Collections.sort(cards);
        System.out.println(cards);
    }
}