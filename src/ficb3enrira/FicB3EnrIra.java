/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficb3enrira;
import java.util.*;
import java.io.*;
/**
 *
 * @author enriq
 */
public class FicB3EnrIra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Dime la ruta del fichero de origen");
        String origen = teclado.nextLine();
        System.out.println("Dime la ruta del fichero de destino");
        String destino = teclado.nextLine();
        
        try {
            FileInputStream orig = new FileInputStream(origen);
            FileOutputStream dest = new FileOutputStream (destino);
            
            byte [] barr = new byte [orig.available()];
            
            orig.read(barr);
            dest.write(barr);
            
        }
        catch (EOFException eofe) {System.out.println(eofe.getMessage());}
        catch (FileNotFoundException fnfe) {System.out.println(fnfe.getMessage());}        
        catch (IOException ioe ) {ioe.printStackTrace();}
        
        
    }
    
}
