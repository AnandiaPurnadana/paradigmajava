/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject3;

/**
 *
 * @author LENOVO
 */
public class Javaproject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String test = "kasur rusak ";
        String reverse = "";
        int strl = test.length();
        
        for(int i = (strl-1);i>=0;i--)
        {
            reverse +=test.charAt(i);   
        }
        if (test.toLowerCase().equals(reverse.toLowerCase()))
        {
            System.out.println(test+" ini adalah Palindrome");   
        }
        else
        {
            System.out.println(test+"Bukan Palindrome");
        }
    }
    
}
