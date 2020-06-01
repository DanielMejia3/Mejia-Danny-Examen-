/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class Principal {
    
    public static void(String[] args) throws IOExceptions{
        
        Arraylist<Electrodomestico>electrodomestic = new ArrayList<>(0);
        
        int opc 0=0, tam=0;
        tam = Apoyo.tamArchivo(electrodomestic);
        while(opc != 3)  {
            opc=Apoyo.menu();
            switch(opc) {
                case 1:
                    Apoyo.leerArchivo(Electrodomestic);
                    break;
                    
                case 2:
                    Apoyo.mostar(electrodomestic);
                    break;
            }
        }
        
    }
    
}
