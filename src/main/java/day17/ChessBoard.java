package day17;

public class ChessBoard {
    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        // Text value to display in the output window:
        String txt = "\t|\t";

        txt += "\n";
        for (int i = 1; i <= 5 * chessBoard.length; i++) {
            txt += "-";
        }
        // Filling the array:
        for (int i = 0; i <= chessBoard.length -1 ; i++) {
            // Text value addition:
            txt += "\n" + (8 - i) + "\t|\t";
            for (int j = 0; j <= chessBoard.length - 1; j++) {
                // Receive text representation of chess piece:
                String text = chessBoard[i][j].getRepresentation();
                // Text value addition:
                txt += text + "\t";
            }
        }

        txt += "\n";
        for (int i = 1; i <= 5 * chessBoard.length; i++) {
            txt += "-";
        }

        txt += "\n";

        txt += "\t|\t";

        for (char i = 'a'; i <= 'h'; i++) {
            txt += i + "\t";
        }

        System.out.println("ChessBoard: ");
        System.out.println("Kramnik - Kasparov 2000 year match:");
        System.out.println(txt);

    }
}
