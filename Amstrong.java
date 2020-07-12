/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amstrong;

/**
 *
 * @author sakthi
 */
public class Amstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1634;
        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r*r);
            n=n/10;
        }
        System.out.println(sum);
        
        if(sum==temp){
            System.out.println("Number is a amstrong num");
        }
        
    }
    
}
