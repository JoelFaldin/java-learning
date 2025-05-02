package merceriaejercicio;

import java.util.Scanner;

public class MerceriaEjercicio {
    
    public static void main(String[] args) {
        
        int cantidad;
        double precioTotal;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de productos:");
        cantidad = teclado.nextInt();
        
        if (cantidad < 5) {
            System.out.println("No se permiten compras inferiores a 5 productos.");
        } else {
            if (cantidad >= 5 && cantidad <= 15) {
                System.out.println("El costo de envio es de 10usd.");
            } else {
                System.out.println("El envio es gratis!");
            }
            
            teclado = new Scanner(System.in);
            System.out.println("Ingrese el precio total de la compra:");
            precioTotal = teclado.nextDouble();
            
            if (precioTotal < 100) {
                double faltante = 100 - precioTotal;

                System.out.println("No hay promociones. Te faltan " + faltante + "usd para obtener una promocion.");
            } else if (precioTotal >= 100 && precioTotal < 300) {
                double descontado = precioTotal - (precioTotal * 0.05);

                System.out.println("Cuentas con un descuento del 5%. El nuevo precio es " + descontado + "usd.");
            } else {
                double nuevoPrecio = precioTotal - (precioTotal * 0.1);

                System.out.println("Tienes un descuento del 10%. El nuevo precio total es " + nuevoPrecio + "usd!");
            }
        }
    }
    
}
