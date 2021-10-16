import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhiyan
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator obj2 = new Calculator(); // why did this have to be above scanner
        
        System.out.println("Enter numbers for calculation: \n");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        
        obj2.Addition(a, b);
        obj2.Subtraction(a, b);
        obj2.Multiplication(a, b);
        obj2.Division(a, b);
        SubClass.Addition2(a, b);
        
    }
    
    public void Addition(int a, int b){
        System.out.println("Addition: " + (a + b));
    }
    
    public void Subtraction(int a, int b){
        System.out.println("Subtraction: " + (a - b));
    }
    
    public void Multiplication(int a, int b){
        System.out.println("Multiplication: " + (a * b));
    }
    
    public void Division(int a, int b){
        System.out.println("Division: " + (a / b));
    }
}
