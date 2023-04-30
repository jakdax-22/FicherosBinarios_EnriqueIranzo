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
public class FicB5EnrIra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String dni,nombre,direccion;
        int codPostal;
        
        System.out.println("Dime el dni de la persona");
        dni = teclado.nextLine();
        System.out.println("Dime el nombre de la persona");
        nombre = teclado.nextLine();
        System.out.println("Dime la dirección de la persona");
        direccion = teclado.nextLine();
        System.out.println("Dime el código postal de la persona");
        codPostal = teclado.nextInt();
        teclado.nextLine();
        
        DataInputStream lee = null;
        DataOutputStream escribe = null;
        
        //Si no hago un array de bytes no va a funcionar
        byte [] dni_b = dni.getBytes();
        byte [] nombre_b = nombre.getBytes();
        byte [] direccion_b = dni.getBytes();
        
        
        
        //Meto el Input como el Output Stream en el try para que controle el error
        try {
            File destino = new File ("./src/ficb3enrira/persona.txt");
            if (!destino.exists()){
                destino.createNewFile();
            }
            lee = new DataInputStream (new FileInputStream ("./src/ficb3enrira/persona.txt"));
            escribe = new DataOutputStream (new FileOutputStream ("./src/ficb3enrira/persona.txt",true));
            System.out.println("Printeando los atributos en el fichero");
            
            //Escribo
            escribe.writeUTF(dni);
            escribe.writeUTF(nombre);
            escribe.writeUTF(direccion);
            escribe.writeInt(codPostal);
            
            //Leo
            while (true){
                System.out.println("Persona con el dni: "+lee.readUTF()+"\n\rnombre: "+lee.readUTF()
                +"\n\rdireccion: "+lee.readUTF()+"\n\rCódigo Postal: "+lee.readInt()+"\n--------------------------------------------------------");
            }
        }
        catch (EOFException eofe) {System.out.println(eofe.getMessage());}
        catch (FileNotFoundException fnfe) {System.out.println(fnfe.getMessage());}
        catch (IOException ioe) {ioe.printStackTrace();}        
        

    }
    
}
