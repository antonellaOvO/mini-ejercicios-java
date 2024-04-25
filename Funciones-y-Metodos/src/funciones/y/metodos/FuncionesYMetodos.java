/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones.y.metodos;
import java.util.Scanner;

/**
 *
 * @author anto_
 */
public class FuncionesYMetodos {
private double numero1;
private double numero2;

// Clase estática anidada
    public static class ClaseEstatica {
        public static void calcularFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
    }

    /**
     * @param args the command line arguments
     */
public FuncionesYMetodos(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double getNumero1(){
        return numero1;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    /*Método para sumar dos parámetros (2 números que introduzca el usuario en la terminal)*/
     public void calcularSuma(){
       double resultado = this.numero1 + this.numero2; 
       System.out.println("El resultado de tu suma es: " + resultado); 
    }
     
    /*Método para obtener el valor más grande de un array*/
    public void ObtenerNumeroMasGrande(double[] array){
    double x = array[0];
    for (double element : array) {
        if(element > x){
            x = element;
        }
        }
    System.out.println(x);    
    }
    
    /*Método para confirmar si un número es par o impar*/
     public void confirmarNumeroPar(double numero){
         if( numero % 2 == 0) {
       System.out.println("El número introducido es un número par.");  
         } else {
             System.out.println("El número introducido NO es un número par.");  
         }
    }
     
    /*Método para invertir una cadena de texto y la retorne*/
    public void obtenerCuentaRegresiva(String[] array){
        for (int i = array.length -1; i >= 0; i--) {
      System.out.println(array[i]);
    } 
    }
    
    /*Método para quitar las vocales de una palabra*/
    public void quitarVocales(String texto){
     String textoSinVocales = texto.replaceAll("[aeiouAEIOU]", "");
     System.out.println("Texto sin vocales: " + textoSinVocales);
    }
     
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
         double numero1, numero2;
         int numero4;
         String texto;
         /*Para sumar dos parámetros (2 números que introduzca el usuario en la terminal) utilizando el método calcularSuma()*/
         System.out.println("Dame el primer dato a sumar");
         numero1 = scanner.nextDouble();
         System.out.println("Dame el segundo dato a sumar");
         numero2 = scanner.nextDouble();
         FuncionesYMetodos nuevaInstancia = new FuncionesYMetodos(numero1, numero2);
         nuevaInstancia.calcularSuma();
       
         /*Para obtener el valor más grande de un array utilizo el método ObtenerNumeroMasGrande()*/
        System.out.println("Para obtener el valor más grande de tu array, por favor escribe la longitud que deseas que tenga tu array:");
        numero4 = scanner.nextInt();
        double[] array1 = new double[numero4];
        //Para rellenar con valores el array
        System.out.println("Escribe los " + numero4 + " valores que deseas que tenga el array:");
        for(int i = 0; i < numero4; i++){
        array1[i] = scanner.nextDouble();
        }
        nuevaInstancia.ObtenerNumeroMasGrande(array1);
        
        /*Para confirmar si un número es par o impar utilizo el método confirmarNumeroPar*/
        System.out.println("Dame el número del cual deseas saber si es par o impar");
        numero1 = scanner.nextDouble();
        nuevaInstancia.confirmarNumeroPar(numero1);
        
        /*Para invertir una cadena de texto y la retorne utilizo el método obtenerCuentaRegresiva()*/
        System.out.println("Para obtener tu array de texto de forma invertida, por favor escribe la longitud que deseas que tenga tu array:");
        numero4 = scanner.nextInt();
        int numeroMultiple = numero4 + 1;
        String[] array2 = new String[numeroMultiple];
        //Para rellenar con valores String el array
        System.out.println("Escribe " + numero4 + " Strings que deseas que contenga el array:");
        for(int i = 0; i < numeroMultiple; i++){
        array2[i] = scanner.nextLine();
        }
        nuevaInstancia.obtenerCuentaRegresiva(array2);
        
        /*Para quitar las vocales de una palabra utilizo el método quitarVocales()*/
        System.out.println("Escribe cualquier palabra y te la devolveré sin vocales");
        texto = scanner.nextLine();
        nuevaInstancia.quitarVocales(texto);
        
         /*Para calcular el factorial de un número*/
        System.out.println("Escribe cualquier el número del cual deseas que te calcule su factorial");
         numero4 = scanner.nextInt();
         FuncionesYMetodos.ClaseEstatica.calcularFactorial(numero4);
         
    }
 
    
    
}
