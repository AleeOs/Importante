
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexis
 */
public class Menu {

    static Scanner scan = new Scanner(System.in);
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int opcion = 0;
        
        do {
            
        System.out.println("--- M E N U ---");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion"); 
        System.out.println("4. divicion");
        System.out.println("5. salir");
        
        System.out.println("Digite la opcion a realizar");
            
            opcion = scan.nextInt();
            
             switch (opcion) {
            
            case 1:
                suma();
                break;
                
            case 2:
                resta();
                break;
            
            case 3:
                multiplicacion();
                break;
                
             case 4:
                 division();
                break;   
            
            case 5:
                break;
                
            default: 
                System.out.println("OPCION INVALIDA");
        }

            
            
        }while (opcion!=5);
        
        System.out.println("EL PROGRAMA HA TERNINADO");
               
        
      
    }
    
    static void suma() {
        System.out.println("OPERACION SUMA");
        System.out.println("Digite numero 1");
        int numero1=scan.nextInt();
        
        System.out.println("Digite numero 2");
        int numero2=scan.nextInt();
        
        int resultado = numero1 + numero2;
        
        System.out.println("El resultado es:"+resultado);
    }
    
    
    static void resta() {
        System.out.println("OPERACION RESTA");
        System.out.println("Digite numero 1");
        int numero1=scan.nextInt();
        
        System.out.println("Digite numero 2");
        int numero2=scan.nextInt();
        
        int resultado = numero1 - numero2;
        
        System.out.println("El resultado es:"+resultado);
        
        
    }
    
    
    static void multiplicacion() {
        System.out.println("OPERACION multiplicacion");
        System.out.println("Digite numero 1");
        int numero1=scan.nextInt();
        
        System.out.println("Digite numero 2");
        int numero2=scan.nextInt();
        
        int resultado = numero1 * numero2;
        
        System.out.println("El resultado es:"+resultado);
        
        
    }
    
    static void division() {
        System.out.println("OPERACION division");
        System.out.println("Digite numero 1");
        int numero1=scan.nextInt();
        
        System.out.println("Digite numero 2");
        int numero2=scan.nextInt();
        
        int resultado = numero1 / numero2;
        
        System.out.println("El resultado es:"+resultado);
        
        
    }
    
    
}
