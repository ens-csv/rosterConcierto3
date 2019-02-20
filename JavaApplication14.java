
//package JavaApplication14;
//javac -d . JavaApplication14.java
import java.util.Scanner;
import javaapplication14.Lista;
import javaapplication14.Artista;
/**
 *
 * @author Tecmilenio
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0 ;
        Lista lista = new Lista();
        while(opcion!=7){
            System.out.println("Roster Cabuland 2019");
            System.out.println("Escoge una opcion:");
            System.out.println("1-Leer Lista\t 2-Leer canciones por artista");
            System.out.println("3-Agregar Artista\t 4-Agregar cancion por artista");
            System.out.println("5-Quitar Artista\t 6-Quitar cancion por artista");
            System.out.println("7-Salir");
            Scanner lector = new Scanner(System.in);
            opcion = lector.nextInt();
            switch(opcion){
                case 1:
                    lista.leerLista();
                    System.out.println();
                    break;
                case 2:
                    lista.leerCanciones();
                    System.out.println();
                    break;
                case 3:
                    lista.agregarArtista();
                    System.out.println();
                    break;
                case 4:
                    lista.agregarCancion();
                    System.out.println();
                    break;
                case 5:
                    lista.quitarArtista();
                    System.out.println();
                    break;
                case 6:
                    lista.quitarCancion();
                    System.out.println();
                    break;
                default:
                    break;
            }
        }

    }

}
