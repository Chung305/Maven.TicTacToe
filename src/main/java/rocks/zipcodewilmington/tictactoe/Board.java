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
        ////check rows
        if(getWinner() == ""){
            return true;
        }



        return false;
//
    }

    public String getWinner() {


            ////check rows
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' '){
                if(board[i][0]== 'X')
                    return "X";
                else if(board[i][0] == 'O')
                    return "O";
                else
                    return "";
            }
        }

        //check columns
        for(int i = 0; i < 3; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' '){
                if(board[0][i]== 'X')
                    return "X";
                else if(board[0][i] == 'O')
                    return "O";
                else
                    return "";

            }
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
            if(board[0][0]== 'X')
                return "X";
            else if(board[0][0] == 'O')
                return "O";
            else
                return "";
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != ' '){
            if(board[2][0]== 'X')
                return "X";
            else if(board[2][0] == 'O')
                return "O";
            else
                return "";
        }


        return "";

    }

}
