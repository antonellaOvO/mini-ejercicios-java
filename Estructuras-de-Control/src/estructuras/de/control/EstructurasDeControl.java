/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuras.de.control;
import java.util.Scanner;

/**
 *
 * @author anto_
 */
public class EstructurasDeControl{
    private double numero1;
    private double numero2;
        /**
     * @param args the command line arguments
     */
    public EstructurasDeControl(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1(){
           return numero1;
       }
    public double getNumero2(){
           return numero2;
       }
    public void obtenerNumeroMayor(){
         if (this.numero1 > this.numero2){
         System.out.println("El número más grande es: " + this.numero1); 
         } else if (this.numero1 == this.numero2){
         System.out.println("Ambos números son iguales");
         } else {
         System.out.println("El número más grande es: " + this.numero2); 
         }   
    }
    
    public void obtenerCuentaProgresiva(){
        for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    } 
    }
    
    public void obtenerCuentaRegresiva(){
        int j = 10;
         while(j > 1) {
             System.out.println(j);
             j--;
         }
         System.out.println(j);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        double numero1, numero2;
        System.out.println("Para averiguar cuál es el número más grande, \nIntroduce aquí el primer número:");
        numero1 = scanner.nextDouble();
        System.out.println("Ahora el segundo número");
        numero2 = scanner.nextDouble();
        EstructurasDeControl nuevaInstancia = new EstructurasDeControl(numero1, numero2);
        nuevaInstancia.obtenerNumeroMayor();
        System.out.println("Para obtener cuenta progresiva:");
        nuevaInstancia.obtenerCuentaProgresiva();
        System.out.println("Para obtener cuenta regresiva:");
        nuevaInstancia.obtenerCuentaRegresiva();
    }
}

    
    
    
   
    
