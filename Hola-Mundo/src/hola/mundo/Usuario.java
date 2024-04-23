/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mundo;

/**
 *
 * @author anto_
 */
public class Usuario {
    public String nombre;
    /**
     * @param args the command line arguments
     */public Usuario(String nombreUsuario) {
         this.nombre = nombreUsuario;
     }
     
     public void saludar(String nombreUsuario) {
         System.out.println("Hola " + nombreUsuario + "!");
     }
     public void preguntar(String nombreUsuario) {
         System.out.println("Hola " + nombreUsuario + "!" + " Como estas " + nombreUsuario + "?");
         System.out.println("Yo estoy aprendiendo Java y ya veremos lo frustrante que es...");
     }
     public void repetirSaludo(int numero, String nombreUsuario) {
         int j = 1;
         while(j < numero) {
             System.out.println("Hola " + nombreUsuario + "!");
             j++;
         }
         System.out.println("Hola " + nombreUsuario + "!");
     }
     
    
    
}
