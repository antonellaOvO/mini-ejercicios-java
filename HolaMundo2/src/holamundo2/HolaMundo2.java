/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo2;

import java.util.Scanner;

/**
 *
 * @author anto_
 */
public class HolaMundo2 {

    /**
     * @param args the command line arguments
     */
    public static void repetirSaludo(int numero, String nombreUsuario) {
         int j = 1;
         while(j < numero) {
             System.out.println("Hola " + nombreUsuario + "!");
             j++;
         }
         System.out.println("Hola " + nombreUsuario + "!");
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);  // Crear una instancia de Scanner y especificamos "System.in" para especificar la entrada de consola de teclado estándar aunque podemos pasar un objeto de clase File si queremos leer la entrada de un archivo.

        System.out.print("Por favor, introduce tu nombre: ");  // Pedir al usuario su nombre
        String name = scanner.nextLine();  // Leer el nombre del usuario
        System.out.println("¡Hola, " + name + "!");  // Saludar al usuario
        System.out.println("Cómo estás?");
        System.out.println("Por favor, introduce tu respuesta:");
        String respuesta = scanner.nextLine();
        System.out.println("¡Vaya estar " + respuesta + " es un estado de humor interesante");
        System.out.println("Por favor, introduce el número de veces que desees que te salude:");
        int numero = scanner.nextInt();
        repetirSaludo(numero, name);
        
        scanner.close();  // Cerrar el scanner
    }

}
