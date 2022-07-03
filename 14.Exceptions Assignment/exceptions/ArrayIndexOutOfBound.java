/*
 * 9. Write a program to generate ArrayIndexOutOfBoundException
 */
package com.exceptions;
/*
ArrayIndexOutOfBoundsException :
It is thrown to indicate that an array has been accessed with an illegal index.
The index is either negative or greater than or equal to the size of the array.
 */
public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        //Declaring 4 elements in the String array
        String[] arr = {"Anil", "Rahul", "Atul", "Arun"};
        //ArrayIndexOutOfBoundException because there is no 5th index
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println("ArrayIndexOutOfBoundsException caught");
            
            e.printStackTrace();
        }
    }
}
