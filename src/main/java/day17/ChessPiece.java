package day17;

public enum ChessPiece {
    PAWN_WHITE(1,"♙"),
    PAWN_BLACK(1, "♟"),
    KNIGHT_WHITE(3,"♘"),
    KNIGHT_BLACK(3, "♞"),
    BISHOP_WHITE(3.5, "♗"),
    BISHOP_BLACK(3.5,"♝"),
    ROOK_WHITE(5,"♖"),
    ROOK_BLACK(5, "♜"),
    QUEEN_WHITE(9, "♕"),
    QUEEN_BLACK(9, "♛"),
    KING_WHITE(100, "♔"),
    KING_BLACK(100, "♚"),
    EMPTY(-1,"_");

    private double value;
    private String representation;

    ChessPiece(double value, String representation) {
        this.value = value;
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

}
