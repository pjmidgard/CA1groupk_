/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
We enjoy writing programs.

We write software that has:
Method 0: Authors
Method 1: print ‘Hello World’
Method 2: add two numbers
Method 3: subtract one number from another
Method 4: Multiply two numbers
 */
package CA1TAM;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ken
 */



public class CA1TAM {

    /**
     * @param args the command line arguments
     */
    
    
   static void Authors() {//Method 0: Authors

System.out.println("@Authors: \nBaasanjargal\n Baasanjargal\n Edgard Pacheco\nJurijus Pacalovas\nLeonardo Kawachi\n Luiza Albuquerque\n  Sean UY\n" );



}

static void HW() {//Method 1: Hello World

System.out.println("Hello World");



}
   

    
       public static int sum(int i1, int i2) {//Method 2: add two numbers
 
int result =i1+i2;
 return result;
 

}
       
             public static int minus(int i1, int i2) {//Subtract one number from another
 
int result =i1-i2;
 return result;
 

}
 public static int multi(int i1, int i2) {//Multiply two numbers
 
int result =i1*i2;
 return result;
 

}
       
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
          SIMILAR TO SWAPINPUTS.JAVA -- I have just commented the different parts here. Check SwapInputs.java for other explanations
        */
        
         //delare Buffered Reader - call it myKeyboard
         BufferedReader myKeyboard = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 =0, num2=0;
        int temp; int sume;
        int minuse; int multie;
        
        
        Authors();
        HW(); //Hello world
        
        
        
        System.out.println("Please enter 1st number");
        
        try{
            num1 = Integer.parseInt(myKeyboard.readLine()); 
            //readLine() method ONLY reads text - need Integer.parseInt to convert to int value (if possible)
        
            System.out.println("Please enter 2nd number");
             num2 = Integer.parseInt(myKeyboard.readLine());
             System.out.println("num1 stores " + num1 + " and num2 stores " + num2);
             
              sume=sum(num1, num2); //I have made the sume function for add the numbers in the program. 
             
            //swap
           
        
            System.out.println(" AFTER SWAP num1 stores " + num1 + " and num2 stores " + num2+ "sum" +sume);// The program show numbers that is add.  
            
            minuse=minus(num1, num2); //I have made the minuse function for add the numbers in the program.
            
            System.out.println(" AFTER SWAP num1 stores " + num1 + " and num2 stores " + num2+ "sum" +minuse);//The program show numbers that is minus.  
            
            multie=multi(num1, num2);//I have made the multie function for add the numbers in the program.
            
            System.out.println(" AFTER SWAP num1 stores " + num1 + " and num2 stores " + num2+ "sum" +multie);//The program show numbers that is multie.

        }
        catch (Exception e){
            
            System.out.println("That is not valid input -- only numbers allowed");//That is not valid input -- only numbers allowed in the program.
        }
        
        
    }
    
}
