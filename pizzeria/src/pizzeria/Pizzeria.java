/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzeria;

/**
 *
 * @author Duoc
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Bienvenidos a la Pizza los CC===\n");
        
        Pizza pizza1= new Pizza("Pepperoni","mediana","Delgada");
        
        String nombre=pizza1.getNombre();
        String tamaño=pizza1.getTamaño();
        String masa=pizza1.getMasa();
        
        System.out.println("usted a comprado una pizza : " +nombre +  " tamanio : " +tamaño + " de masa : " +masa);
        
        //Ahora cambiamos el tamaño de la pizza 
        
        pizza1.setTamaño("Grande");
        System.out.println("usted a comprado una pizza : " +nombre +  " tamanio : " +pizza1.getTamaño() + " de masa : " +masa);
    }
    
}
