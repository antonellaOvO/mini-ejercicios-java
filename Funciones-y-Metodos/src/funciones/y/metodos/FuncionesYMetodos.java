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

// Clase est�tica anidada
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
    
    /*M�todo para sumar dos par�metros (2 n�meros que introduzca el usuario en la terminal)*/
     public void calcularSuma(){
       double resultado = this.numero1 + this.numero2; 
       System.out.println("El resultado de tu suma es: " + resultado); 
    }
     
    /*M�todo para obtener el valor m�s grande de un array*/
    public void ObtenerNumeroMasGrande(double[] array){
    double x = array[0];
    for (double element : array) {
        if(element > x){
            x = element;
        }
        }
    System.out.println(x);    
    }
    
    /*M�todo para confirmar si un n�mero es par o impar*/
     public void confirmarNumeroPar(double numero){
         if( numero % 2 == 0) {
       System.out.println("El n�mero introducido es un n�mero par.");  
         } else {
             System.out.println("El n�mero introducido NO es un n�mero par.");  
         }
    }
     
    /*M�todo para invertir una cadena de texto y la retorne*/
    public void obtenerCuentaRegresiva(String[] array){
        for (int i = array.length -1; i >= 0; i--) {
      System.out.println(array[i]);
    } 
    }
    
    /*M�todo para quitar las vocales de una palabra*/
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
         /*Para sumar dos par�metros (2 n�meros que introduzca el usuario en la terminal) utilizando el m�todo calcularSuma()*/
         System.out.println("Dame el primer dato a sumar");
         numero1 = scanner.nextDouble();
         System.out.println("Dame el segundo dato a sumar");
         numero2 = scanner.nextDouble();
         FuncionesYMetodos nuevaInstancia = new FuncionesYMetodos(numero1, numero2);
         nuevaInstancia.calcularSuma();
       
         /*Para obtener el valor m�s grande de un array utilizo el m�todo ObtenerNumeroMasGrande()*/
        System.out.println("Para obtener el valor m�s grande de tu array, por favor escribe la longitud que deseas que tenga tu array:");
        numero4 = scanner.nextInt();
        double[] array1 = new double[numero4];
        //Para rellenar con valores el array
        System.out.println("Escribe los " + numero4 + " valores que deseas que tenga el array:");
        for(int i = 0; i < numero4; i++){
        array1[i] = scanner.nextDouble();
        }
        nuevaInstancia.ObtenerNumeroMasGrande(array1);
        
        /*Para confirmar si un n�mero es par o impar utilizo el m�todo confirmarNumeroPar*/
        System.out.println("Dame el n�mero del cual deseas saber si es par o impar");
        numero1 = scanner.nextDouble();
        nuevaInstancia.confirmarNumeroPar(numero1);
        
        /*Para invertir una cadena de texto y la retorne utilizo el m�todo obtenerCuentaRegresiva()*/
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
        
        /*Para quitar las vocales de una palabra utilizo el m�todo quitarVocales()*/
        System.out.println("Escribe cualquier palabra y te la devolver� sin vocales");
        texto = scanner.nextLine();
        nuevaInstancia.quitarVocales(texto);
        
         /*Para calcular el factorial de un n�mero*/
        System.out.println("Escribe cualquier el n�mero del cual deseas que te calcule su factorial");
         numero4 = scanner.nextInt();
         FuncionesYMetodos.ClaseEstatica.calcularFactorial(numero4);
         
    }
 
    
    
}
