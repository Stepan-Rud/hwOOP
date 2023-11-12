package hw2;

import hw2.gamefiles.Answer;
import hw2.gamefiles.GameStatus;
import hw2.gamefiles.Menu;
import hw2.gamefiles.NumberGame;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu.printUserMenu();
        NumberGame numberGame = new NumberGame();
        Scanner scanner = new Scanner(System.in);
        numberGame.start(scanner.nextInt(), scanner.nextInt());
        scanner.nextLine();
        while (!numberGame.getGameStatus().equals(GameStatus.FINISH)){
            String value = scanner.nextLine();
            Answer answer = numberGame.inputValue(value);
            if (answer!=null){
                System.out.println("answer = " + answer);
            }
            System.out.println(numberGame.getMoveHistory());
        }
    }
}