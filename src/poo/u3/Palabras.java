package poo.u3;

import java.util.Scanner;

public class Palabras {
    public String palabra;
    public Palabras(String palabra){
        this.palabra=palabra;
    }
    public Palabras(){
        
    }
    public void ingresarPalabras(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese palabra: ");
        palabra=entrada.nextLine();
        palabra=palabra.toLowerCase();
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
}
