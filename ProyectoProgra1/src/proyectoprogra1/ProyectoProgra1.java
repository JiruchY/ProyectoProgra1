/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra1;
/**
 *
 * @author Jirucho
 */import java.util.Scanner;


public class ProyectoProgra1 {
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner red = new Scanner(System.in);
       
        int inicio;
        do{
       System.out.println("MENU DE INICIO");
       System.out.println("1.Login \n2.Crear Player\n3.Salir");
      inicio =  red.nextInt();
      
       switch(inicio) {
           case 1: 
               /*\u00f1 = ñ */
               System.out.println("Ingrese usuario y contrase\u00f1a: ");
               
               break;
           case 2:
               System.out.println("Ingrese su nuevo usuario: ");
			String newplayer =  red.next();
			System.out.println(newplayer);
                break;
           case 3:
               System.out.println("Saliendo..");
               break;
           default: 
               System.out.println("Opcion invalida");
       }}while(inicio!=3);
               
       
}}
