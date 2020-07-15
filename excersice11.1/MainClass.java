/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.Scanner;

/**
 *
 * @author dsid
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int y= favoriteMovie("Οι πειρατες της Καραιβικής");
        System.out.println(y);
        Scanner input=new Scanner(System.in);
        String movie=input.nextLine();
        y= favoriteMovie(movie);
        System.out.println(movie);
    }
//    Exercise 1Create a program that contains a String that holds your favorite movie quote and display the total 
//    number of spaces contained in the String. Then modify the application so that the quote is entered by the user.
//
    public static int favoriteMovie(String movie){
        String movie2=movie.replace(" ","");
        int movie3=movie.length()-movie2.length();
        return movie3;
    }
}

