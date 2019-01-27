/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prb10;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class st10 {
     int ci, i, j, k, l=0,g = 0;
      
        char c, ch;
        Scanner st = new Scanner(System.in);
        
       
        String str=st.nextLine();
        
        public void intro(){
        for(c='A'; c<='z'; c++)
        {
            k=0;
            for(j=0; j<str.length(); j++)
            {
                ch = str.charAt(j);
                if(ch == c)
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println(" character " + c + " occurance is " + k + " times");
            }
        }
    
}

    
}
