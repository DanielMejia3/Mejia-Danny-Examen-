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
public class Lavadora extends Electrodomestico{
    
    private int cargaLavadora = 5;
    
    public Lavadora(double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        cargaLavadora = carLavadora;
        
        public void mostrar(){
            System.out.println("-----------------------");
            System.out.println("Tipo de electrodomestico (1:Lavadora)");
            System.out.println("Precio Bae: " + getcalcularPrecio());
            System.out.println("Consumo Electrico: " + getcomprobarConsumoElectrico());
            System.out.println("peso: " + getpeso() + "Kg");
            System.out.println("Carga: " + cargaLavadora + "Kg");
            System.out.println("PrecioFianl: "+ precioFinal() + "Bs.S");
        }
        
        public double precioFinal(){
            double monto = super.precioFinal();
            if(cargaLavadora > 30 ) {
                monto += 50;
            }
            
            return monto;
        }
    }
    

