/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author nihar
 */
public class Algorithms {
    
    /**
     * @param string string to check if it is palindrome or not
     * @param left   points to start location of string
     * @param right  points to end location of the string
     */
    public boolean isPalindrome(String s, int left, int right) {
        //base case 
        if( left == right) {
            return true;
        } else {
            if(s.charAt(left) == s.charAt(right) && left<right) {
                left++; 
                if(left<right)right--;
            } else {
                return false;
            }
            return isPalindrome(s, left, right);
        }
    }
    
    public static void selectionSort(){
        int[] array = {7,6,5,4,3,2,1};
        for(int i = 0; i < array.length;  i++){
            int index = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j]<array[index]){
                    index = array[j];
                }
            }
            int smallNumber = array[index];
            array[index] = array[i];
            array[i] = smallNumber;
        }
        for(int i =0; i<array.length; i++){
            System.out.println("\n" + array[i]);
        }
    }
    
    public static void bubleSort() {
        int[] array = {1,2,3,4,5,6,7};
        boolean flag =  true;
        for(int i = array.length-1; i >= 0; i--){
            for (int j = 0; j<i; j++){ 
                if(array[j]>array[j+1]){
                    flag = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(flag){
                System.out.print("Array already sorted");
                break;
            }
        }
        for(int i =0; i<array.length; i++){
            System.out.println("\n" + array[i]);
        } 
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Algorithms.bubleSort();
        Algorithms.selectionSort();
    }
    
}
