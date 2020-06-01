/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec;

/**
 *
 * @author Daniel
 */
public class Television extends Electrodomestico {
    
     private int tamañoPantalla;
    
    public Television(double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        tamañoPantalla = tam;
        
        public void mostrar(){
            System.out.println("-----------------------");
            System.out.println("Tipo de electrodomestico (2:Televisor)");
            System.out.println("Precio Bae: " + getcalcularPrecio());
            System.out.println("Consumo Electrico: " + getcomprobarConsumoElectrico());
            System.out.println("peso: " + getpeso() + "Kg");
            System.out.println("tamalo: " + tamañoPantalla + "Pulgadas");
            System.out.println("PrecioFianl: "+ precioFinal() + "Bs.S");
        }
        
        public double precioFinal(){
            double monto = super.precioFinal();
            if(tamañoPantalla >= 30 ) {
                monto += precioBase*0.3;
            }
            return monto;
        }
    }

