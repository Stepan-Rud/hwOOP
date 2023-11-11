package hw;

import javax.swing.*;
import java.awt.*;


import static hw.Treadmill.lenghtt;
import static hw.Wall.height;

public class program {
    public static void main(String[] args) {
        Actions[] sportsmens =
                {new Human(50, 30),
                        new Robott(70, 50),
                        new Cat(40, 15)};
        Cross[] bariers = {
                new Treadmill(50), new Wall(30), new Treadmill(70)
        };

        for (Actions sportsmen : sportsmens) {
            if(sportsmen.maxDistenace >= lenghtt){
                System.out.println(sportsmen + "Добежал");
            }
            else if(sportsmen.maxDistenace < lenghtt) System.out.println(sportsmen + "Упс не добежал");
            if(sportsmen.maxHeight >= height){
                System.out.println(sportsmen + "Перепрыгнул");
            }
            else if(sportsmen.maxHeight < height) System.out.println(sportsmen + "Упс не перепрыгнул");
            for (Cross equipment : bariers) {
                if(sportsmen.maxDistenace >= lenghtt){
                    System.out.println(sportsmen + "Пробежал" + bariers);
                }
                else if(sportsmen.maxDistenace < lenghtt) System.out.println(sportsmen + "Упс не добежал");
                if(sportsmen.maxHeight >= height){
                    System.out.println(sportsmen + "Перепрыгнул" + bariers);
                }
                else if(sportsmen.maxHeight < height) System.out.println(sportsmen + "Упс не перепрыгнул");
            }
        }
    }
}
