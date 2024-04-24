/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones.basicas;
import java.util.Scanner;

/**
 *
 * @author anto_
 */
public class OperacionesBasicas {
private double salarioAnualBruto;
private double impuestos;
private double dietas;
private double salarioMensual;
private double salarioAnual;

    public OperacionesBasicas(double salarioAnualBruto, double impuestos, double dietas){
        this.salarioAnualBruto = salarioAnualBruto;
        this.impuestos = impuestos;
        this.dietas = dietas;
    }
    public double getSalarioBruto(){
        return salarioAnualBruto;
    }
    
    public double getImpuestos(){
        return impuestos;
    }
    
     public double getDietas(){
        return dietas;
    }
    
    public void calcularSalarioNeto(){
      
       double salarioNeto = this.salarioAnualBruto - this.impuestos; 
       System.out.println("Tu salario neto anual es de: " + salarioNeto + " euros");
    }
    public void calcularSalarioNetoMensual(){
       double salarioNeto = (this.salarioAnualBruto - this.impuestos) / 12; 
       System.out.println("Tu salario neto mensual es de: " + salarioNeto + " euros");
    }
    
    public void calcularSalarioMasDietas(){
       double salarioNetoMasDietas = ((this.salarioAnualBruto - this.impuestos) / 12) + this.dietas; 
       System.out.println("Tu salario neto mensual más tus dietas es de: " + salarioNetoMasDietas + " euros");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, para saber tus datos con respecto a tu salario, introduce primero tu salario bruto anual:");
        int salarioBrutoAnual = scanner.nextInt(); 
        System.out.println("Ahora, introduce tus impuestos anuales y tus dietas mensuales para saber tu salario neto anual y tu salario neto mensual:");
        int impuestosAnuales = scanner.nextInt();
        System.out.println("Y finalmente introduce tus dietas mensuales");
        int dietas = scanner.nextInt();
        OperacionesBasicas nuevaInstancia = new OperacionesBasicas(salarioBrutoAnual,impuestosAnuales, dietas);
        nuevaInstancia.calcularSalarioNeto();
        nuevaInstancia.calcularSalarioNetoMensual();
        nuevaInstancia.calcularSalarioMasDietas();
        scanner.close();  // Cerrar el scanner
        
    }
    
}
