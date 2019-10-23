package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {

        if(board[0][0] == 'X' && board[0][1] == 'X'&& board[0][2] == 'X')
            return true;
        else if(board[1][0] == 'X' && board[1][1] == 'X'&& board[1][2] == 'X')
            return true;
        else if(board[2][0] == 'X' && board[2][1] == 'X'&& board[2][2] == 'X')
            return true;
        else if(board[0][0] == 'X' && board[1][0] == 'X'&& board[2][0] == 'X')
            return true;
        else if(board[0][1] == 'X' && board[1][1] == 'X'&& board[2][1] == 'X')
            return true;
        else if(board[0][2] == 'X' && board[1][2] == 'X'&& board[2][2] == 'X')
            return true;
        else if(board[0][0] == 'X' && board[1][1] == 'X'&& board[2][2] == 'X')
            return true;
        else if(board[2][0] == 'X' && board[1][1] == 'X'&& board[0][2] == 'X')
            return true;
        else
            return false;
    }

    public Boolean isInFavorOfO() {
        if(board[0][0] == 'O' && board[0][1] == 'O'&& board[0][2] == 'O')
            return true;
        else if(board[1][0] == 'O' && board[1][1] == 'O'&& board[1][2] == 'O')
            return true;
        else if(board[2][0] == 'O' && board[2][1] == 'O'&& board[2][2] == 'O')
            return true;
        else if(board[0][0] == 'O' && board[1][0] == 'O'&& board[2][0] == 'O')
            return true;
        else if(board[0][1] == 'O' && board[1][1] == 'O'&& board[2][1] == 'O')
            return true;
        else if(board[0][2] == 'O' && board[1][2] == 'O'&& board[2][2] == 'O')
            return true;
        else if(board[0][0] == 'O' && board[1][1] == 'O'&& board[2][2] == 'O')
            return true;
        else if(board[2][0] == 'O' && board[1][1] == 'O'&& board[0][2] == 'O')
            return true;
        else
            return false;
    }

    public Boolean isTie() {
        if(board[0][0] == 'O' && board[0][1] == 'O'&& board[0][2] == 'O')
            return false;
        else if(board[1][0] == 'O' && board[1][1] == 'O'&& board[1][2] == 'O')
            return false;
        else if(board[2][0] == 'O' && board[2][1] == 'O'&& board[2][2] == 'O')
            return false;
        else if(board[0][0] == 'O' && board[1][0] == 'O'&& board[2][0] == 'O')
            return false;
        else if(board[0][1] == 'O' && board[1][1] == 'O'&& board[2][1] == 'O')
            return false;
        else if(board[0][2] == 'O' && board[1][2] == 'O'&& board[2][2] == 'O')
            return false;
        else if(board[0][0] == 'O' && board[1][1] == 'O'&& board[2][2] == 'O')
            return false;
        else if(board[2][0] == 'O' && board[1][1] == 'O'&& board[0][2] == 'O')
            return false;
        else
            return true;
    }

    public String getWinner() {



        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' '){
                if(board[i][0]== 'X')
                    return "x";
                else
                    return "O";
            }
        }
        for(int i = 0; i < 3; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' '){
                if(board[i][0]== 'X')
                    return "x";
                else
                    return "O";
            }
        }
        for(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ' ){
            if(){

            }
        }


        return " ";

    }

}
