/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aloo;

/**
 *
 * @author KESHAV
 */
public class Aloo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application lo
        int a=0,b=2,c;
        System.out.print(a+" "+b);
        for(int i=2;i<=10;i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
        
    }
    
}
