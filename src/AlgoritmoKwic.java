import java.util.LinkedList;

public class AlgoritmoKwic {

    public void iniciarAlgortimo(String palabraIngresada,LinkedList<String> palabrasExcluidas){

         palabraIngresada =palabraIngresada.toLowerCase();
         palabraIngresada= " "+ palabraIngresada;


        for (String palabraActual : palabrasExcluidas) {
            palabraIngresada = palabraIngresada.replaceAll(" "+palabraActual+" ", " ");
 
        }
        palabraIngresada = palabraIngresada.trim();
       // LinkedList<String> almacenPalabrasGeneradas  = new LinkedList<String>();

        
        String generadorPalabras = palabraIngresada;
        
        System.out.println("Salida:");
        
        do {
            String auxPrimeraPalabra = generadorPalabras.substring(0, generadorPalabras.indexOf(" "));
           // String auxUltimaPalabra = generadorPalabras.substring(generadorPalabras.lastIndexOf(" "),generadorPalabras.length());

            generadorPalabras= generadorPalabras.replace(auxPrimeraPalabra, "");
            
            generadorPalabras = generadorPalabras+" "+auxPrimeraPalabra;
            generadorPalabras= generadorPalabras.trim();

            
          //  almacenPalabrasGeneradas.add(generadorPalabras);
            System.out.println(generadorPalabras);

            


            
        } while (!palabraIngresada.equals(generadorPalabras));
        //System.out.println(palabraIngresada);


    }
    
}
