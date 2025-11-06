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
public class ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Escriba un numero entero positivo ");
               int num=sc.nextInt();
               int cifras=0;
               int numinvertido=0;
               int cifrasinvertido=0;
        while(num>0){
            cifras=num%10;  
            numinvertido=numinvertido*10+cifras;
            num/=10;   
        }   
            while(numinvertido>0){
                cifrasinvertido=numinvertido%10;
                numinvertido/=10;
                    if(cifrasinvertido==1){
                        System.out.print("0000");
                    }if (cifrasinvertido==2){
                        System.out.print("0001");
                    }if(cifrasinvertido==3){
                        System.out.print("0010");
                    }if(cifrasinvertido==4){
                        System.out.print("0011");
                    }if(cifrasinvertido==5){
                        System.out.print("0101");
                    }if(cifrasinvertido==6){
                        System.out.print("0110");
                    }if(cifrasinvertido==7){
                        System.out.print("0111");
                    }if(cifrasinvertido==8){
                        System.out.print("1000");
                    }if(cifrasinvertido==9){
                        System.out.print("1001");
                    }       
        }
   }
}
