
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class CALCULADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        
        int op;
        menu();
        op = sc.nextInt();
        
        
        switch (op)
            

                
        
    }
    
    
    
    
    public static void menu(){
        
        
        
        System.out.println(" menu\n 1. suma \n2. resta \n3. mulriplicacion \n4. division \n5. reiniciar");
    }
    
    public static void suma(){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa el primer numero 1: ");
        double n1= sc.nextDouble();
        System.out.println("Ingresa el primer numero 2: ");
        double n2= sc.nextDouble();
        double suma=n1+n2;
    }
        
}

        
        
        
        
        
      
       
          
       
       
          
                 
           
      
           
           
    
