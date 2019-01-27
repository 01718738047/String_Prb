/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prb8;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class st8 {
      Scanner st=new Scanner(System.in);
    String input=st.nextLine();
    String out="";
    public void intro(){
        for(int i=input.length()-1 ;i>=0; i--){
            
            out=out+input.charAt(i);
        }
        System.out.println(out);
    }
    
}
