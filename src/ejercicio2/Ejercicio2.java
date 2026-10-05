/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n_articulos;
        double valorp,subtotal = 0, total, descuento = 0;
        System.out.print("Ingrese cuantos productos desea comprar: ");
        n_articulos = sc.nextInt();
        for (int i = 0; i < n_articulos; i++) {
            System.out.print("Ingrese el precio del producto "+(i+1)+" :");
            valorp = sc.nextDouble();
            subtotal = subtotal + valorp;
        }
        if(subtotal >= 100){
            if(subtotal >= 200){
                if(subtotal >= 300){
                    descuento = subtotal * 0.15;   
                }else{
                    descuento = subtotal * 0.10;
                }
            }else{
                descuento = subtotal * 0.05;
            }
        }else{
            System.out.println("No Aplica descuento");
        }
        total = subtotal - descuento;
        System.out.println("El total a pagar es: "+total);
    }
    
}
