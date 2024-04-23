/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variables.y.tipos.de.datos;

/**
 *
 * @author anto_
 */

public class TiposDeDatos {
    private  String nombre;
    private  int edad;
    private  double salario;
    private  int salario2;
    private int salarioInteger;

   

       public TiposDeDatos (String nombre, int edad, double salario, int salario2) {
       this.nombre = nombre;
       this.edad = edad;
       this.salario = salario;
       this.salario2 = salario2;
       /*Widening Casting*/
       this.salarioInteger = salario2;
     }
     public String getNombre(){
         return nombre;
     }
     public int getEdad(){
         return edad;
     }
     public double getSalario(){
         return salario;
     } 
     public int getSalario2(){
         return salario2;
     }
     public int getSalarioInteger(){
         return salarioInteger;
     }
     
     public void convertDoubleToInt(double numero){
          /*Narrowing Casting = sumamos la variable salario + 0.5 para redondear hacia arriba, 
    porque cuando convertimos un double en int, simplemente se borran los numeros decimales*/
         System.out.println((int) (numero + 0.5));
     }
     
     public void calcAreaRectangulo(double ladoA, double ladoB){
         double Area = ladoA * ladoB;
         System.out.println("Si tienes un rectangulo con un lado de " + ladoA +" cm y otro lado de " + ladoB + "cm, el area del rectangulo sera de: " + Area); 
     }
     
     public void convertFahrenheitToCelsius(double temperature){
         double Celsius = ((temperature - 32)* 5)/9;
         System.out.println("La temperatura de " + temperature + " grados Fahrenheit es en grados Celsius de: " + Celsius);
     }
     
     public void convertCelsiusToFahrenheit(double temperature){
         double Fahrenheit = ((temperature * 9)/5) + 32;
         System.out.println("La temperatura de " + temperature + " grados Celsius es en grados Fahrenheit de: " + Fahrenheit);
     }
    
     /* @param args the command line arguments*/
     
   
    
}

