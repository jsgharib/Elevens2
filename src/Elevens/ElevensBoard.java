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
        
    }
    public boolean anotherPlayIsPossible() {
        
    }
    
    private boolean containsPairSum11(List<Integer> selectedCards) {
        
    }

    private boolean containsJQK(List<Integer> selectedCards) {
        
    }
}
