/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;


import java.util.Scanner;
import java.awt.*;
import newpackage.*;
public class Mavenproject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Monopoly monopoly = new Monopoly();
        Chess chess = new Chess();
        Battleships battleships = new Battleships();
        NewClass o = new NewClass();
        o.te();
        monakey apa1 = new monakey();
        System.out.println(Math.pow(2, 3));
        System.out.println("What are you naming the monkey?");
        //apa1.name = sc.nextLine();
        System.out.println("How tall is the monkey in cm?");
        //apa1.height = sc.nextDouble();
        System.out.println(apa1.name + " is " + apa1.height + "cm tall and is " + apa1.age + " years old");

        monopoly.play();
        chess.play();
        chess.getName();
        monopoly.getName();
        battleships.play();
        int[] bulle = {1,3,4,5};
        System.out.println(bulle[2]);
        System.out.println(monopoly.name);
        
    }

    static abstract class Game {
        public String name;
        abstract String getName();
        abstract void play();
        
    }

    static class Monopoly extends Game {
        String getName() {
            name = "Monopoly";
            return name;
        }

        void play() {
            System.out.println("Buy all property");
        }
    }
     
    static class Chess extends Game {
        String getName() {
            name = "Chess";
            return name;
        }

        void play() {
            System.out.println("Kill the enemy king");
        }
    }

    static class Battleships extends Game {
        String getName() {
            name = "Battleships";
            return name;
        }

        void play() {
            System.out.println("Sink all ships");
        }
    }

    static class monakey {
        int age;
        String name;
        double height;

        monakey() {
            age = 0;
            name = "unnamed";
            height = 10;
        }
        
        
        
        
    }
    
    public int berakanaAlder(int ar)
    {
        return (ar-fodelseAr);
    }
    
    public String hamtaDoman(String epost)
    {
        String[] epostSplit = epost.split("@");
        
       
    }
    
}


