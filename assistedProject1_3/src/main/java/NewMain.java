/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abhiyan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char a = 'A';
	int i = a;
	float f = a;
	long l = a;
	double d = a;
	//System.out.println(d);
		
	//System.out.println("Explicit/Narrowing Type Casting");
	double w = 100.77;
	long q = (long)w;
	float r = (float)q;
	int u = (int)r;
	System.out.println(r);
    }
    
}
