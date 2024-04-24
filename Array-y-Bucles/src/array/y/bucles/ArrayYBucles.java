/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.y.bucles;
import java.util.Scanner;

/**
 *
 * @author anto_
 */
public class ArrayYBucles {
    private double[] listNumbers;
    /**
     * @param args the command line arguments
     */
    public ArrayYBucles(double[] listNumbers){
    this.listNumbers = listNumbers;
    }
    /*Para poder sumar los valores del array*/
    public void sumarValoresArray(){
    double resultado = 0;
    for(int i = 0; i < this.listNumbers.length; i++) {
    resultado+= this.listNumbers[i];
    }
    System.out.println(resultado);
    }
    /*Para poder visualizar los valores del array al revès*/
    public void imprimirValoresArrayAlReves(){
    for(int i = this.listNumbers.length - 1; i >= 0; i--) {
    System.out.println(this.listNumbers[i]);
    }
    }
    
    public void obtenerNumeroMasGrande(){
    double x = this.listNumbers[0];
    for (double element : this.listNumbers) {
        if(element > x){
            x = element;
        }
        }
    System.out.println(x);    
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       /*Para poder sumar los valores del array*/
        double numero1, numero2, numero3;
        System.out.println("Introduce aquí 3 números que serán los valores del array");
        numero1 = scanner.nextDouble();
        numero2 = scanner.nextDouble();
        numero3 = scanner.nextDouble();
        double[] intArray = new double[] {numero1, numero2, numero3}; /*Debes inicializar el array antes de poder incluirlo dentro de la nueva instancia */
        ArrayYBucles nuevaInstancia = new ArrayYBucles(intArray);
        System.out.println("El resultado de la suma de los valores del array es: ");
        nuevaInstancia.sumarValoresArray();
        /*Para poder visualizar los valores del array al revès*/
        System.out.println("Los valores del array al revés son: ");
        nuevaInstancia.imprimirValoresArrayAlReves();
        System.out.println("El número más grande del array es el:");
        nuevaInstancia.obtenerNumeroMasGrande();
        
    }
    
    
}
