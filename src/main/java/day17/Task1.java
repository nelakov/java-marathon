package day17;

import static day17.ChessPiece.PAWN_WHITE;
import static day17.ChessPiece.ROOK_BLACK;

public class Task1 {
    private static final int PIECE_REPEAT_COUNT = 4;

    public static void main(String[] args) {
        ChessPiece[] chessPiece = ChessPiece.values();
        for (ChessPiece figure : chessPiece) {
            switch (figure) {
                case PAWN_WHITE:
                    for (int i = 0; i < PIECE_REPEAT_COUNT; i++) {
                        System.out.print(PAWN_WHITE.getRepresentation());
                    }
                    break;

                case ROOK_BLACK:
                    for (int i = 0; i < PIECE_REPEAT_COUNT; i++) {
                        System.out.print(ROOK_BLACK.getRepresentation());
                    }
                    break;
            }
        }
    }
}
