import java.io.BufferedReader;

import java.io.FileInputStream;

import java.io.IOException;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

public class LectorArchivo {

    public void leerArchivo() throws IOException{

     
        
        // Linked list para para guardar los datos
        LinkedList<String> palabrasExcluidas = new LinkedList<String>();

        FileInputStream  archivo = new FileInputStream("palabras.txt");

        InputStreamReader isr = new InputStreamReader(archivo, StandardCharsets.UTF_8);

        BufferedReader b = new BufferedReader(isr);

        String cadenaActual;
        while ((cadenaActual = b.readLine()) != null) {        
            palabrasExcluidas.push(cadenaActual);
        }

        b.close();

        //Invocando Entrada Consola
        EntradaConsola entradaConsola = new EntradaConsola();
        entradaConsola.leerConsola(palabrasExcluidas);
       
        

    }
    
}
