import com.tsi.training.kahtan.minesweeperoop.Board;

import java.io.InputStream;
import java.util.Scanner;

public class consoleSweeper {
    public static void main(String[] args){
        boolean userPlaying;
        String userChoise;
        Scanner userInput = new Scanner(System.in);

        do{
        Board gameBoard = new Board(10);

        System.out.println("Would you like to keep playing? (y,n)");
        userChoise = userInput.nextLine();
        if (userChoise.toLowerCase() == "y"){
            userPlaying = true;
        }
        else {
            userPlaying = false;
        }

        }while (userPlaying);
    }
}
