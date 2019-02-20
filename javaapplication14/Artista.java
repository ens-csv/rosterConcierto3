
package javaapplication14;
//javac -d . Artista.java
import java.util.Scanner;

public class Artista {
    Scanner lector = new Scanner(System.in);
    String nombre;
    int sizeCanciones=0;
    int capacity=100;
    public String[] canciones= new String[capacity];

    public Artista(String nombre) {
        this.nombre = nombre;
        this.canciones[0] = "Nada";
    }

    public Artista(String nombre,int sizeCanciones) {
        this.nombre = nombre;
        this.sizeCanciones=sizeCanciones;
    }

    public void agregarCancion(){
        String cancion;
        System.out.println("Dame cancion: ");
        sizeCanciones++;
        this.canciones[sizeCanciones-1] = lector.next();
    }

    public void quitarCancion() {
        System.out.println("Escoge # de cancion: ");
        for(int i=0;i<this.sizeCanciones;i++){
            System.out.print((i+1)+"."+this.canciones[i]+"\t");
        }
        System.out.println();
        int cancion = lector.nextInt();
        for(int i=cancion;i<this.sizeCanciones;i++){
            this.canciones[i-1]=this.canciones[i];
        }
        this.sizeCanciones--;
    }

}
