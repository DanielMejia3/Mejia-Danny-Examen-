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
public class Electrodomestico {
    
    private double precio;
    private String color;
    private char consumo;
    private double peso;
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    private double calcularPrecio() {
        double pesoPorPrecio = 0;
        
        this.comprobarConsumoEnergetico(this.consumo);
        
        if(this.peso >= 0 && this.peso <= 19) {
            pesoPorPrecio = 19;
        } else if(this.peso >=20 && this.peso <=49) {
            pesoPorPrecio = 50;
        } else if(this.peso >= 50 && this.peso <=79){
            pesoPorPrecio = 80;
        }   else{
            pesoPorPrecio = 100;
        }
        
        this.precio += pesoPorPrecio;
        
        return this.precio;
    }
    
    Electrodomestico () {
        
        this.color = "Negro";
        this.consumo = 'F';
        this.peso = 5;
        this.precio = 100.00;
        
    Electrodomestico(double precio, double peso) {
        
        this.color = "Negro";
        this.consumo = 'F';
        this.peso = peso;
        this.precio = precio;
                
    }
    
    Electrodomestico(double precio, double peso, String color, char consumo){
        
        this.precio = precio ;
        this.peso = peso ;
        
        this.comprobarColor(this.color);
        
        this.consumo = consumo ;
        
    }
    
    public void comprobarConsumoEnergetico(char letra) {
        boolean exist = false;
        
        switch(letra){
            case 'A' :
                exist = true;
                this.precio = 100.00;
            
            break;
            case 'B' :
                this.precio = 80.00;
            
            break;
            case 'C' :
                this.precio = 60.00;
                
            break;
            case 'D' :
                this.precio = 50.00;
                
            break;
            case 'E' :
                this.precio = 30.00;
                
            break;
            case 'F' :
                this.precio = 10.00;
                
            break;
        }
        
        if(exist) {
            this.consumo = letra;
        }
    }
    
    public void compobrarColor(String color) {
        if(color == "Blaco" || color == "Azul"
                || color == "Gris" || color == "Rojo" ) {
            
            this.color = color;
            
        }   else{
            
            this.color = "Negro";
            
        }
        
    }
    
    public double precioFinal() {
        return calcularPrecio();
    }
        
 }
    
    

