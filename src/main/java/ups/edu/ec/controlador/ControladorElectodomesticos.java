/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ControladorElectodomesticos {
    
  public static int tamArchivo(ArrayList<Electrodomestico> elec) throws IOException{
        //Instanciamos;
        Scanner sc = new Scanner(new File("Tienda.txt"));
        //Variables:
        String arch;
        int cantArch = 0;
       //Metodo while:
        while (sc.hasNextLine()) {
            arch = sc.nextLine();
            cantArch++;
        }
        return cantArch;
    }
 
    public static void leerArchivo(ArrayList<Electrodomesticos> elec)throws IOException{
        //Instanciamos:
        Scanner sc = new Scanner(new File("Tienda.txt"));
        Electrodomestico electrodomestico = null;
        int t;
        //Metodo while:
        while (sc.hasNextLine()) {
            t = sc.nextInt();
            //Creamos el condicional if:
            if (t == 1) {
                electrodomestico = new Lavadora(sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
            } else if (t == 2) {
                electrodomestico = new Televisor(sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
            }
            elec.add(electrodomestico);
        }
        sc.close();
    }
 
    public static void mostrar(ArrayList<Electrodomestico> elec){
        //Creamos el ciclo for:
        for (int i = 0; i < elec.size(); i++) {
            elec.get(i).mostrar();
        }
    }
    //Creamos el menu de inicio:
    public static int menu() {
        int opc = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1-Leer archivo Tienda");
        System.out.println("2-Mostrar Electrodomesticos");
        System.out.println("3-Terminar");
        System.out.print("Escoja una opcion: ");
        opc = teclado.nextInt();
        System.out.println("");
        return opc;
    }
 
}