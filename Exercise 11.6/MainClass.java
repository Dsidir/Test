
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        int n=word.length();
        for (int i = 0; i < n/2; i++) {
        if (word.charAt(i)==word.charAt(n-1-i)){
            System.out.print(word.charAt(i));
                }
    }
    
}
}
