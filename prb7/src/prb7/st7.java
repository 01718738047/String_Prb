/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prb7;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class st7 {
    Scanner st=new Scanner(System.in);
    String input=st.nextLine();
    int vowels;
    int consonants;
    public void intro(){
    for(int i = 0; i<input.length(); i++){
        char ch=input.charAt(i);
        if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z' )
            
        {
             if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else  {
                ++consonants;
        }
    
}
}
                     System.out.println(vowels);
                     System.out.println(consonants);


    }}
