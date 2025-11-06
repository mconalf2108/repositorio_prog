/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaentreable3;

import java.util.Scanner;

/**
 *
 * @author cocor
 */
public class ejercicio4 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Introduce la altura de la flecha");
                int altura=sc.nextInt();
                int  mitad=altura/2;   
            
       //parte superior
        for (int filas =0; filas <=mitad; filas++) {
            for (int espacios=0; espacios<= mitad-filas; espacios++) {
                System.out.print(" ");
                
            }
            System.out.print("*");
            for (int j = 0; j < 5; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }   




                

     }
}
