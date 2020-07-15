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
    replaceString("Computer, Laptop, Tablet");
    
        
    }
    
    //1. length()
//    Create a method that accepts 2 strings. Check which is the largest and print a message informing the user.
//    Create a method that accepts a name and returns a message based on length. More than 5 letters is a big name else small name. Use ternary.
    public static void checkString(String a, String b){
        if (a.length()>b.length())
            System.out.println(a+">"+b);
        else System.out.println(a+"<"+b);
    }
    
    
     public static void returnString(String name){
        if(name.length()>5)
            System.out.println("Its a big name");
        else System.out.println("Its a small");
    }
    
    
    
    
//    2. charAt()
//    Create a method that accepts an array of names. Print only the names that start with letter J.
   
    
    public static void printOnlyJ(String[] names){
        for (int i = 0; i < names.length; i++) {
        if(names[i].charAt(0)=='J')
            System.out.println(names[i]);
    }
    }
    
    //3. indexOf()
//    Create a method that accepts an array of cities Athens, Thessaloniki, Thiva, Thasos, Xanthi, Kallithea, Rethymno.
            public static void printThCities(String [] cities){
                for(String city:cities){
                    int index=city.indexOf("Th");
                    if (index==0)
                    System.out.println(city);
                }
            }
            
//   //4. concat()
//    Create a method that accepts two names and returns their concatenation         
    public static void concatStrings(String name1){
        String name2="Athens";
        String name3=name2.concat(name1);
        System.out.println(name3);
            }
    
    //5. toLowerCase(), toUpperCase()
//    Update the previous method so that it prints the concatenation in Uppercase
    public static void toLowerCase(String name1){
        String name2="Athens";
        String name3=name2.concat(name1);
        String name4=name3.toLowerCase();
        String name5=name3.toUpperCase();
        System.out.println(name4);
        System.out.println(name5);
    }
    
    //6. trim()
//    Create a method that accepts a string and trims it. Use it with input text.
    
    public static void trimString(String name){
        String name2=name.trim();
        System.out.println(name2);
    }
         
 //7. split(), contains()
//    Create a method that accepts a string. Use String "Computer, Laptop, Tablet". If String contains "," split it and return it. 
//    Then create a method that accepts the array and prints it.

//    public static String[] splitString(String name){
//           String[] arr=name.split(",");
//        return arr; 
//    }
//    
//    public static void printArray(splitString(String name)){
//        System.out.println();
//    }




//     
//8. replace()
//    Use replace to check for ", " in the previous exercise and replace it with ",".

 public static void replaceString(String name){
     String name2=name.replace(", " , ",");
     System.out.println(name2);
 }
 
 //9. substring()
//    Create a method that accepts a url and gets only the domain name.
//    http://peoplecert.com
 
 public static void subString(String url){
     String domain=url.substring(7);
     System.out.println(domain);
 }
}

