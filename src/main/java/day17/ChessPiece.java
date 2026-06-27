package day17;

public enum ChessPiece {
    PAWN_WHITE("♙"),
    PAWN_BLACK("♟"),
    KNIGHT_WHITE("♘"),
    KNIGHT_BLACK("♞"),
    BISHOP_WHITE("♗"),
    BISHOP_BLACK("♝"),
    ROOK_WHITE("♖"),
    ROOK_BLACK("♜"),
    QUEEN_WHITE("♕"),
    QUEEN_BLACK("♛"),
    KING_WHITE("♔"),
    KING_BLACK("♚"),
    EMPTY("_");

    private final String representation;

    ChessPiece(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

}
