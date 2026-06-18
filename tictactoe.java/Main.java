import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            printboard(board);
            System.out.println("Player "+player+" enter row and column (0-2): ");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(board[row][col]==' '){
                board[row][col]=player;
                if(checkWin(board,player)){
                    System.out.println("Player "+player+" wins!");
                    gameOver=true;
                }
                else if(isBoardFull(board)){
                    System.out.println("It's a draw!");
                    gameOver=true;
                }
                player=(player=='X')?'O':'X';
            }
            else{
                System.out.println("Invalid move. Try again.");
        }
    }
}
public static boolean checkWin(char[][] board,char player){
    for(int i=0;i<3;i++){
        if(board[i][0]==player && board[i][1]==player && board[i][2]==player){
            return true;
        }
        if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
            return true;
        }
    }
    return false;
}
public static boolean isBoardFull(char[][] board){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(board[i][j]==' '){
                return false;
            }
        }
    }
    return true;
}
public static void printboard(char[][] board){
    System.out.println("___________");
    for(int i=0;i<3;i++){
        System.out.print("| ");
        for(int j=0;j<3;j++){
            System.out.print(board[i][j]+" | ");
        }
        System.out.println();
        System.out.println("__________");
    }
}
}