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
public class ejercicio2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
    
        System.out.println("Introduzca un numero entero positivo");
                long num=sc.nextLong();
                long cifras=0;
                long numeroinvertido=0;
                long original=num;
       while(num>0){ 
           cifras=num%10;
           numeroinvertido=numeroinvertido*10+cifras;   
            num=num/10;
      }
        if(original==numeroinvertido){
            System.out.println(original+" es capicua");
        }else{
            System.out.println(original+"no es capicua");
        }
    
    }
}