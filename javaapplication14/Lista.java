
package javaapplication14;
//javac -d . Lista.java
import java.util.Scanner;

public class Lista {

    Scanner lector = new Scanner(System.in);
    int capacity=100;
    private int size=0;
    private Artista[] roster = new Artista[capacity];
    private String[] escenarios={"Ntp","Gpi"};

    public Lista() {
        this.size=4;
        this.roster[0] = new Artista("Wisin&Yandel",6);
        roster[0].canciones[0]= "Reggaeton en lo Oscuro";
        roster[0].canciones[1]= "Pam Pam";
        roster[0].canciones[2]= "Aullando";
        roster[0].canciones[3]= "Callao";
        roster[0].canciones[4]= "Rakata";
        roster[0].canciones[5]= "Abusadora";
        this.roster[1] = new Artista("Farruko  ",5);
        roster[1].canciones[0]= "Ponle";
        roster[1].canciones[1]= "Coolant";
        roster[1].canciones[2]= "Calma";
        roster[1].canciones[3]= "Chillax";
        roster[1].canciones[4]= "Krippy Kush";
        this.roster[2] = new Artista("Becky G  ",5);
        roster[2].canciones[0]= "Sin Pijama";
        roster[2].canciones[1]= "Mayores";
        roster[2].canciones[2]= "Cuando Te Bese";
        roster[2].canciones[3]= "Booty";
        roster[2].canciones[4]= "Bubalu";
        this.roster[3] = new Artista("Arcangel",5);
        roster[3].canciones[0]= "El Granjero";
        roster[3].canciones[1]= "Me Acostumbre";
        roster[3].canciones[2]= "Pa Que La Pases Bien";
        roster[3].canciones[3]= "Original";
        roster[3].canciones[4]= "Tu No Vive Asi";
    }

    public void leerLista() {
        System.out.println("Artista \tHorario Escenario \tCanciones");
        int horario=5;
        for(int i=0;i<this.size;i++){
            System.out.print(this.roster[i].nombre+"\t");
            System.out.print(horario+"pm "+"\t");
            if(i%2==0){
                System.out.print(escenarios[1]+"\t");
            }else{
                System.out.print(escenarios[0]+"\t");
            }
            for(int j=0;j<this.roster[i].sizeCanciones;j++){
                System.out.print(this.roster[i].canciones[j]);
                if(j<this.roster[i].sizeCanciones-1){
                    System.out.print(", ");
                }else{
                    System.out.println(" ");
                }
            }
            horario++;
        }
    }

    public void agregarArtista() {
        System.out.print("Dame nombre de artista: ");
        String artist = lector.next();
        this.size++;
        this.roster[size-1]=new Artista(artist);
    }

    public void quitarArtista() {
        System.out.println("Escoge # de artista: ");
        for(int i=0;i<this.size;i++){
            System.out.print((i+1)+"."+this.roster[i].nombre+"\t");
        }
        System.out.println();
        int artist = lector.nextInt();
        for(int i=artist;i<this.size;i++){
            this.roster[i-1]=this.roster[i];
        }
        this.size--;
    }

    public void leerCanciones() {
        System.out.println("Escoge # de artista: ");
        for(int i=0;i<this.size;i++){
            System.out.print((i+1)+"."+this.roster[i].nombre+"\t");
        }
        System.out.println();
        int artist = lector.nextInt();
        artist--;
        for(int i=0;i<this.roster[artist].sizeCanciones;i++){
            System.out.print((i+1)+"."+this.roster[artist].canciones[i]+"\t");
        }
        System.out.println("");
    }

    public void agregarCancion() {
        System.out.println("Escoge # de artista: ");
        for(int i=0;i<this.size;i++){
            System.out.print((i+1)+"."+this.roster[i].nombre+"\t");
        }
        System.out.println();
        int artist = lector.nextInt();
        artist--;
        this.roster[artist].agregarCancion();
    }

    public void quitarCancion() {
        System.out.println("Escoge # de artista: ");
        for(int i=0;i<this.size;i++){
            System.out.print((i+1)+"."+this.roster[i].nombre+"\t");
        }
        System.out.println();
        int artist = lector.nextInt();
        artist--;
        this.roster[artist].quitarCancion();
    }

}
