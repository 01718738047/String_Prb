/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prb6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class st6 {
    Scanner st=new Scanner(System.in);
        String input=st.nextLine();
        String out="";
        
        public void intro(){
        for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);	// taking the characters
                        if(ch>=97 && ch<=122)
                        {
                          ch-=32;
 
                        out+=ch;
                        }
                        else if((ch>=65) &&(ch<=90)){
                    ch+=32;
                    out+=ch;
                }}
		System.out.println("output : "+out);
    
}
}