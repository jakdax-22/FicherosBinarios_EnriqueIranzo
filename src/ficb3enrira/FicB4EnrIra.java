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
public class FicB4EnrIra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Dime un número de números aleatorios");
    int numero = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Dime la ruta del fichero");
    String ruta = teclado.nextLine();
    
    try {
        DataOutputStream escribe = new DataOutputStream (new FileOutputStream(ruta,true));
        DataInputStream lee = new DataInputStream (new FileInputStream(ruta));
        
        for (int i= 0; i <= numero; i++){
            escribe.write((int)(Math.random()*101));
        }
        escribe.flush();
        while (true){
            System.out.println(lee.readInt());
        }
        
        

    }
    catch (EOFException eofe) {System.out.println(eofe.getMessage());}
    catch (FileNotFoundException fnfe) {System.out.println(fnfe.getMessage());}        
    catch (IOException ioe ) {ioe.printStackTrace();}
    }
    
}
