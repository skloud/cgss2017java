
import static java.lang.System.out;
import java.util.Scanner;

public class TicTacToe
{
    public static void boardNumbers ()
    {
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println();
        System.out.println("To play, enter a number for which box to play in:");
        System.out.println();

        //space
        //playerTurn
        //printGame
        //turn1
        //turn2
        //check
        //boardSpace
        //boardSpot
        //space1
        //diagonalWin
        //horizontalWin
        //verticalWin
        char[][] space = new char[3][3];
        space[0][0] = '1';
        space[0][1] = '2';
        space[0][2] = '3';
        space[1][0] = '4';
        space[1][1] = '5';
        space[1][2] = '6';
        space[2][0] = '7';
        space[2][1] = '8';
        space[2][2] = '9';

        for (int row = 0; row < space.length; row ++)
        {
            for (int column = 0; column<space[row].length; column++)
            {
                System.out.print(space[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("You'll need a buddy to play with. Ready to begin?");
        System.out.println();
        System.out.println("X moves first.");
    }

    public static void printGame (char[][] game)
    {
        System.out.println();
        for(int row1 = 0; row1 <3; row1++)
        {
            System.out.println(" " + game[row1][0] + " | " + game[row1][1] + " | " +game[row1][2]);
        }
        System.out.println();
    }

    public static boolean playerTurn(int turn1)
    {
        if (turn1 %2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static char boardCurrentValue(int position, char[][] boardPlace)
    {
        int row2 = (position - 1) / 3;
        int col2 = position -(row2 * 3) - 1;
        return boardPlace[row2][col2];
    }

    public static boolean ifTaken (char check)

    {

        if (check=='.')

        {

            return false;

        } else 

        {

            return true;

        }

    }

    public static int updateValue(int position1, char[][]boardPosition, boolean isXsTurn, int turn2)

    {

        int row3 = (position1 - 1) / 3;

        int col3 = position1 - (row3 * 3) - 1;

        if (isXsTurn == true) 

        {

            if (position1 < 1 || position1 > 9)

            {

                out.println("Sorry, position " + position1 + " is not valid.  Try 1-9.");

            } else if (ifTaken(boardCurrentValue(position1, boardPosition)) == false) //if the board value is not taken already

            {

                boardPosition[row3][col3] = 'X';

                turn2++;                

            } else

            {

                out.println("That position is already taken. Pick another one!");

                out.println("Player X, please enter your number: ");

            

            }

        } else 

        {

            if (position1 < 1 || position1 > 9)

            {

                out.println("Sorry, position " + position1 + " is not valid.  Try 1-9.");

            }

            else if (ifTaken(boardCurrentValue(position1, boardPosition)) == false) 
            {

                boardPosition[row3][col3] = 'O';

                turn2++;

            } else

            {

                out.println("That position is already taken. Pick another one!");

                out.println("Player O, please enter your number: ");

            }                       

        }

        return turn2;

    }   

    public static boolean isHorizontalWin(char[][] horizontalWinBoard)

    {

        for (int rowHorizon = 0; rowHorizon < 3; rowHorizon++)

        {

            if (horizontalWinBoard[rowHorizon][0] != '.' && horizontalWinBoard[rowHorizon][0] == horizontalWinBoard[rowHorizon][1] 

            && horizontalWinBoard[rowHorizon][1] == horizontalWinBoard[rowHorizon][2])

            {

                return true;

            }

        }

        return false;

    }   

    public static boolean isVerticalWin(char[][] verticalBoard)

    {

        for (int colVertical = 0; colVertical < 3; colVertical++)

        {

            if (verticalBoard[0][colVertical] != '.' && verticalBoard[0][colVertical] == verticalBoard[1][colVertical] 

            && verticalBoard[1][colVertical] == verticalBoard[2][colVertical])

            {

                return true;

            }

        }

        return false;

    }

    public static boolean isDiagonalWin(char[][] boardDiagonal)

    {

        if (boardDiagonal[0][0] != '.' && boardDiagonal[0][0] == boardDiagonal[1][1] && boardDiagonal[1][1] == boardDiagonal[2][2])

        {

            return true;

        }
        if (boardDiagonal[0][2] != '.' && boardDiagonal[0][2] == boardDiagonal[1][1] && boardDiagonal[1][1] == boardDiagonal[2][0])

        {

            return true;

        }

        return false;

    }

    public static boolean uWon(char[][] boardWin)

    {

        return isHorizontalWin(boardWin) || isVerticalWin(boardWin) || isDiagonalWin(boardWin);

    }

    public static boolean isFull(char[][] boardFull)

    {

        for (int rowFull = 0; rowFull < 3; rowFull++)

        {

            for (int colFull = 0; colFull < 3; colFull++)

            {

                if (boardFull[rowFull][colFull] == '.')

                {

                    return false;

                }             

            }

                
        }
        return true;
    }

    public static boolean playAgain()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play again?");
        System.out.println();
        String playAgainAnswer = keyboard.nextLine();
        return (playAgainAnswer.equals("y"));
    }

    public static void game()
    {

    }

    public static void main (String[] args)
    {
        boardNumbers();
        
        char[][] board = {{'.','.','.'}, {'.','.','.'}, {'.', '.', '.'}};
        
        printGame (board);
        int turn =  0;
        int xWins = 0;
        int oWins = 0;
        int draw  = 0;

        char player = 'X';

        boolean playGame = true;
        do{
            do{
                if (playerTurn(turn) == true)
                {
                    player = 'X';
                    System.out.println();
                    System.out.println("Player1  " +player+", what is your number?");
                }else
                {
                    player = 'O';
                    System.out.println();
                    System.out.println("Player2  " +player+", what is your number?");
                }

                Scanner keyboard = new Scanner(System.in);
                int userInput = keyboard.nextInt();
                keyboard.nextLine();

                turn =updateValue(userInput, board, playerTurn(turn), turn);
                if (uWon(board))
                {
                    if (playerTurn(turn) == false)
                    {
                        System.out.println("X won!");
                        xWins++;
                    } else 

                    {

                        out.println("O wins!");

                        oWins++;

                    }   
                    playGame = false;

                }else if (isFull(board))
                {
                    draw++;
                    System.out.println("The game is drawn. Nobody won.");
                    playGame = false;
                }
                printGame (board);
            } while(playGame == true);
            System.out.println("Score: X = "+ xWins+", O = " + oWins + ", Draw= " + draw);

            for(int row4 = 0; row4 < 3; row4++)
            {
                for(int col4 = 0; col4 < 3; col4++)
                {
                    board[row4][col4]= ',';
                }
            }
            playGame = true;
        } while (playAgain());
    }
}