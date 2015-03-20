/*
 * Lab 2
 * Matrix addition & multiplication
 * Author: Nihar Shah
 */
package matrixcalculation;

import java.util.Scanner;

public class MatrixCalculation {
    
    /*
     * Method to add matrix.
     * param: array first and second to be added
     * return: array  Returns the sum of two matrix
    */
    public static double[][] sumMatrix(double first[][], double second[][], int rows, int col){
        double result[][] = new double[rows][col];
        for(int i = 0; i < first.length; i++)
            for(int j = 0; j < first.length; j++)
            {
                result[i][j] = first[i][j] + second[i][j];
            }
        return result;
    }
    
    /*
     * Method to multiple matrix.
     * param: array first and second to be multipied
     * return: array  Returns the multiply of two matrix
    */
    public static double[][] multiplyMatrix(double first[][], double second[][], int rows, int col){
        double result[][] = new double[rows][col];
        double sum = 0;
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < col; j++)
            {
                for(int k = 0; k < rows; k++ )
                {
                    sum = sum + (first[i][k]*second[k][j]);
                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rows, cols;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows\n");
        rows = input.nextInt();
        System.out.println("Please enter number of columns\n");
        cols = input.nextInt();
        
        //Initialize & Define the size of two matrix
        double first [][] = new double[rows][cols];
        double second [][] = new double[rows][cols];
        
        //populate two matrix
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
            {
                System.out.println("\n Add first matrix element to " + (i+1) +" row and " + (j+1) + " column");
                first[i][j] = input.nextDouble();
            }
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++)
            {
                System.out.println("\n Add second matrix element to " + (i+1) +" row and " + (j+1) + " column");
                second[i][j] = input.nextDouble();
            }
        
        //Add two matrix
        double result[][] = MatrixCalculation.sumMatrix(first, second, rows, cols);
        System.out.println("The resulting matrix for addition is:\n");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print((int)result[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Multiply two matrix
        double multiplyResult[][] = MatrixCalculation.multiplyMatrix(first, second, rows, cols);
        System.out.println("The resulting matrix for multiplication is:\n");
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print((int)multiplyResult[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
    
}
