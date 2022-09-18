import java.util.LinkedList;
import java.util.Scanner;

public class EntradaConsola {

    
    public void leerConsola(LinkedList<String> palabrasExcluidas){

        
        /* */
        Scanner scanner = new Scanner(System.in,"UTF-8");
        System.out.println("Escriba el texto a transformar");
        String palabraIngresada= scanner.nextLine();
        
        System.out.println("Entrada:");
        System.out.println(palabraIngresada);
        scanner.close();
        AlgoritmoKwic algoritmoKwic = new AlgoritmoKwic();
        algoritmoKwic.iniciarAlgortimo(palabraIngresada,palabrasExcluidas);

    }
}
