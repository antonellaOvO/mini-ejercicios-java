/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones.basicas2;
import java.util.Scanner;

/**
 *
 * @author anto_
 */
public class OperacionesBasicas2 {
private double numero1;
private double numero2;

    /**
     * @param args the command line arguments
     */
public OperacionesBasicas2(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public double getNumero1(){
        return numero1;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void calcularSuma(){
       double resultado = this.numero1 + this.numero2; 
       System.out.println("El resultado de tu suma es: " + resultado); 
    }
    
    public void calcularResta(){
       double resultado = this.numero1 - this.numero2; 
       System.out.println("El resultado de tu resta es: " + resultado);
    }
    
     public void calcularDivision(){
       double resultado = this.numero1 / this.numero2; 
       System.out.println("El resultado de tu división es: " + resultado);
    }
     
     public void calcularMultiplicacion(){
       double resultado = this.numero1 * this.numero2; 
       System.out.println("El resultado de tu multiplicación es: " + resultado);
    }
     
     public void calcularPotencia(){
       double resultado = Math.pow(this.numero1, this.numero2); 
       System.out.println("El resultado de tu potencia es: " + resultado);
    }
     
     public void confirmarNumeroPares(){
         if( this.numero1 % 2 == 0 ||this.numero2 % 2 != 0 ) {
       System.out.println("El número introducido es un número par.");  
         } else {
             System.out.println("El número introducido NO es un número par.");  
         }
    }
     
     public void calcularPromedio(double input1, double input2, double input3, double input4, double input5){
       double resultado = (input1 + input2 + input3 + input4 + input5) / 5; 
       System.out.println("El resultado promedio de los números introducidos es: " + resultado);
    }
     
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        boolean salir = false; 
        int opcion; //Guardaremos la opcion del usuario 
        double numero1, numero2, numero3, numero4, numero5;
	while(!salir){ 
            System.out.println("1. Opcion Sumar"); 
            System.out.println("2. Opcion Restar");
            System.out.println("3. Opcion Multiplicar"); 
            System.out.println("4. Opcion Dividir"); 
            System.out.println("5. Opcion Calcular potencia"); 
            System.out.println("6. Opcion Confirmar si el número es un número par");
            System.out.println("7. Opcion Calcular promedio de 5 números que introduzcas");
            System.out.println("Escribe sólo el número de las opciones que deseas realizar"); 
            opcion = scanner.nextInt(); 
            switch(opcion){ 
               case 1: {
                       System.out.println("Has seleccionado Sumar");
                       System.out.println("Dame el primer dato a sumar");
                       numero1 = scanner.nextDouble();
                       System.out.println("Dame el segundo dato a sumar");
                       numero2 = scanner.nextDouble();	
                       OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(numero1, numero2);
                       nuevaInstancia.calcularSuma();
                       }break; 
               case 2:{
                       System.out.println("Has seleccionado Restar");
                       System.out.println("Dame el primer dato a restar");
                       numero1 = scanner.nextDouble();
                       System.out.println("Dame el segundo dato a restar");
                        numero2 = scanner.nextDouble();		
                       OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(numero1, numero2);
                       nuevaInstancia.calcularResta();
                       }break;
               case 3: {
                       System.out.println("Has seleccionado Multiplicar");
                       System.out.println("Dame el primer dato a multiplicar");
                       numero1 = scanner.nextDouble();
                       System.out.println("Dame el segundo dato a multiplicar");
                       numero2 = scanner.nextDouble();		
                       OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(numero1, numero2);
                       nuevaInstancia.calcularMultiplicacion();
                       }break;  
               case 4: {
                       System.out.println("Has seleccionado Dividir");
                       System.out.println("Dame el primer dato a dividir");
                       numero1 = scanner.nextDouble();
                       System.out.println("Dame el segundo dato a dividir");
                       numero2 = scanner.nextDouble();		
                      OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(numero1, numero2);
                       nuevaInstancia.calcularDivision();
                       }break; 
               case 5: {
                       System.out.println("Has seleccionado Calcular potencia");
                       System.out.println("Dame el número que deseas elevar a potencia");
                       numero1 = scanner.nextDouble();
                       System.out.println("Dame el número que deseas que sea la potencia");
                       numero2 = scanner.nextDouble();		
                       OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(numero1, numero2);
                       nuevaInstancia.calcularPotencia();
                       }break;
               case 6: {
                       System.out.println("Has seleccionado Confirmar si el número es un número par");
                       System.out.println("Dame el número del cual deseas saber si es número par o no");
                       numero1 = scanner.nextDouble();	
                       OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(numero1, 0);
                       nuevaInstancia.confirmarNumeroPares();
                       }break;
               case 7: {
                       System.out.println("Has seleccionado Calcular promedio de 5 números que introduzcas");
                       System.out.println("Dame el primer dato");
                       numero1 = scanner.nextDouble();
                       System.out.println("Dame el segundo dato");
                       numero2 = scanner.nextDouble();	
                       System.out.println("Dame el tercer dato");
                       numero3 = scanner.nextDouble();
                       System.out.println("Dame el cuarto dato");
                       numero4 = scanner.nextDouble();
                       System.out.println("Dame el último dato");
                       numero5 = scanner.nextDouble();
                       OperacionesBasicas2 nuevaInstancia = new OperacionesBasicas2(0,0);
                       nuevaInstancia.calcularPromedio(numero1, numero2, numero3, numero4, numero5);
                       }break;
               case 8: salir=true; 
               break; 
               default: System.out.println("Solo numeros entre 1 y 7"); }
        
        }
        
        //scanner.close();  // Cerrar el scanner*/
    }
    
}
