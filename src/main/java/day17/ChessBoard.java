package day17;

public class ChessBoard {
    private static final int CELL_WIDTH = 5;

    private final ChessPiece[][] cells;

    public ChessBoard(ChessPiece[][] cells) {
        this.cells = cells;
    }

    public void print(String caption) {
        StringBuilder board = new StringBuilder("\t|\t");

        board.append("\n").append(buildSeparator(CELL_WIDTH * cells.length));

        for (int i = 0; i < cells.length; i++) {
            board.append("\n").append(8 - i).append("\t|\t");
            for (int j = 0; j < cells[i].length; j++) {
                board.append(cells[i][j].getRepresentation()).append("\t");
            }
        }

        board.append("\n").append(buildSeparator(CELL_WIDTH * cells.length));

        board.append("\n");
        board.append("\t|\t");

        for (char column = 'a'; column <= 'h'; column++) {
            board.append(column).append("\t");
        }

        System.out.println("ChessBoard: ");
        System.out.println(caption);
        System.out.println(board);
    }

    private String buildSeparator(int width) {
        StringBuilder separator = new StringBuilder(width);
        for (int i = 0; i < width; i++) {
            separator.append("-");
        }
        return separator.toString();
    }
}
