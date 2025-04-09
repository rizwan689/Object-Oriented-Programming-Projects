package Main;

import java.util.ArrayList;
import java.util.List;

public class AIplayer extends Player {
    int final_score;
    int final_row;
    int final_column;
    char mark; // AI's mark, e.g., 'O' or 'X'

    public AIplayer(char mark) {
        this.mark = mark;
    }

    public int EvaluationFunct(Board Table) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (Table.board[i][0] == Table.board[i][1] && Table.board[i][1] == Table.board[i][2]) {
                if (Table.board[i][0] == 'X') return +10;
                if (Table.board[i][0] == 'O') return -10;
            }
            if (Table.board[0][i] == Table.board[1][i] && Table.board[1][i] == Table.board[2][i]) {
                if (Table.board[0][i] == 'X') return +10;
                if (Table.board[0][i] == 'O') return -10;
            }
        }
        if (Table.board[0][0] == Table.board[1][1] && Table.board[1][1] == Table.board[2][2]) {
            if (Table.board[0][0] == 'X') return +10;
            if (Table.board[0][0] == 'O') return -10;
        }
        if (Table.board[0][2] == Table.board[1][1] && Table.board[1][1] == Table.board[2][0]) {
            if (Table.board[0][2] == 'X') return +10;
            if (Table.board[0][2] == 'O') return -10;
        }

        // Check for a tie
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Table.board[i][j] == '-') return Integer.MIN_VALUE; // Game is not over
            }
        }
        return 0; // It's a tie
    }

    public List<int[]> potentialMoves(Board Table) {
        List<int[]> moves = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Table.board[i][j] == '-') {
                    moves.add(new int[]{i, j});
                }
            }
        }
        return moves;
    }

    public int minimax(Board Table, int depth, boolean isMaximizing) {
        int score = EvaluationFunct(Table);
        if (score != Integer.MIN_VALUE) {
            return score;
        }

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int[] move : potentialMoves(Table)) {
                Table.UpdateBoard(move[0], move[1], 'X');
                int currentScore = minimax(Table, depth + 1, false);
                Undomove(move[0], move[1], 'X',Table);
                if (currentScore > bestScore) {
                    bestScore = currentScore;
                    if (depth == 0) {
                        final_row = move[0];
                        final_column = move[1];
                        final_score = bestScore;
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int[] move : potentialMoves(Table)) {
                Table.UpdateBoard(move[0], move[1], 'O');
                int currentScore = minimax(Table, depth + 1, true);
                Undomove(move[0], move[1], 'O',Table);
                if (currentScore < bestScore) {
                    bestScore = currentScore;
                    if (depth == 0) {
                        final_row = move[0];
                        final_column = move[1];
                        final_score = bestScore;
                    }
                }
            }
            return bestScore;
        }

    }

    private void Undomove(int row, int col, char mark, Board Table) {
        Table.UpdateBoard(row, col, '-');
    }

    @Override
    public void makeMove(Board Table) {
        if ((Table.board[final_row][final_column] == '-')) {
            minimax(Table, 0, false);
            Table.UpdateBoard(final_row, final_column, 'O');
        }
    }
}

