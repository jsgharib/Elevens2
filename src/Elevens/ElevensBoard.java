package Elevens;

import java.util.List;
import java.util.ArrayList;

public class ElevensBoard extends Board {

    private static final int BOARD_SIZE = 9;
    private static final String[] RANKS
            = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    private static final String[] SUITS
            = {"spades", "hearts", "diamonds", "clubs"};

    private static final int[] POINT_VALUES
            = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
    private static final boolean I_AM_DEBUGGING = false;

    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    public boolean isLegal(List<Integer> selectedCards) {
        if (containsJQK(selectedCards) || containsPairSum11(selectedCards)) {
            return true;
        }
        return false;
    }

    public boolean anotherPlayIsPossible() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cardAt(i).pointValue() + cardAt(j).pointValue() == 11 && i != j) {
                    return true;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if (j != i && j != k && i != k) {
                        if ((cardAt(i).rank().equals("king") || cardAt(j).rank().equals("king") || cardAt(k).rank().equals("king"))) {
                            if ((cardAt(i).rank().equals("queen") || cardAt(j).rank().equals("queen") || cardAt(k).rank().equals("queen"))) {
                                if ((cardAt(i).rank().equals("jack") || cardAt(j).rank().equals("jack") || cardAt(k).rank().equals("jack"))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean containsPairSum11(List<Integer> selectedCards) {

        if (selectedCards.size() == 2 && cardAt(selectedCards.get(0)).pointValue() + cardAt(selectedCards.get(1)).pointValue() == 11 ) {
            return true;
        }
        return false;
    }

    private boolean containsJQK(List<Integer> selectedCards) {
        if (selectedCards.size() == 3 && (cardAt(selectedCards.get(0)).rank().equals("king") || cardAt(selectedCards.get(1)).rank().equals("king") || cardAt(selectedCards.get(2)).rank().equals("king"))) {
            if (selectedCards.size() == 3 && (cardAt(selectedCards.get(0)).rank().equals("queen") || cardAt(selectedCards.get(1)).rank().equals("queen") || cardAt(selectedCards.get(2)).rank().equals("queen"))) {
                if (selectedCards.size() == 3 && (cardAt(selectedCards.get(0)).rank().equals("jack") || cardAt(selectedCards.get(1)).rank().equals("jack") || cardAt(selectedCards.get(2)).rank().equals("jack"))) {
                    return true;
                }
            }
        }
        return false;
    }
}
