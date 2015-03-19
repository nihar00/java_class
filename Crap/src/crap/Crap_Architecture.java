/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crap;

import java.util.Random;

/**
 *
 * @author nihar
 * The class defines the structure of the game and the functionality of the game
 * 
 */
public class Crap_Architecture {
    
    //First step is to define all the variables for the class
    //Generate random number
    Random randomNumber = new Random();
    
    //What is Enum??
    private enum Status {CONTINUE, LOST, WIN};
    
    //What is final & static
    public final static int TWO = 2;
    private final static int THREE = 3;
    private final static int SEVEN = 7;
    private final static int ELEVEN = 11;
    private final static int Twelve = 12;
    
    /*
     * Method to roll dice.
     * param:  void No parameters are passed to the function
     * return: int  Returns the sum of two dies
    */
    public int rollDice() {
        int die1, die2, sum;
        //simulate roll dice
        die1 = 1 + randomNumber.nextInt(6);
        die2 = 1 + randomNumber.nextInt(6);
        //Add the result of two dice and store it in sum variable
        sum = die1 + die2;
        //Print out the result
        System.out.println("Player Rolled " + die1 + " and " + die2 + " and sum = " + sum);
        //Return back the sum
        return sum;
    }
    
    /*
     * Method to handle the actual game play.
     * param:  void  No parameters are passed to the function
     * return: void The function doesnot return anything
    */
    public void gamePlay() {
        int diesValue, myPoint = 0;
        Status gameStatus;
        //We need to roll the dice first
        diesValue = rollDice();
        //Handle situation when the dies are rolled for the first time
        switch(diesValue) {
            
            case SEVEN:
            case ELEVEN:
                        gameStatus = Status.WIN;
                        System.out.println("You Win. Your First attempt sum is " + diesValue);
                        break;
            case TWO:
            case THREE:
            case Twelve:
                        System.out.println("You loose. Your First attempt sum is " + diesValue);
                        gameStatus = Status.LOST;
                        break;
            default:    myPoint = diesValue;
                        System.out.println("My Point is " + myPoint);
                        gameStatus = Status.CONTINUE;
                        break;
        }
        //Keep rolling untill the dies match mypoint value or you loose by getting 7
        while(gameStatus == Status.CONTINUE) {
            //keep rolling
            diesValue = rollDice();
            //loose condition if we get 7
            if (diesValue == SEVEN) {
                System.out.println("You Loose. Your sum is: " + diesValue);
                gameStatus = Status.LOST;
            }else if (diesValue == myPoint) {
            //Win condition since we sume of rolled dies equals mypoint
                System.out.println("You Win. Your sum is: " + diesValue);
                gameStatus = Status.WIN;
            }
        }     
    }
    
    
}
