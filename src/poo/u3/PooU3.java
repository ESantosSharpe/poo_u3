package poo.u3;

public class PooU3 {

    public static void main(String[] args) {
        Palabras palabra1=new Palabras();
        Palabras palabra2=new Palabras();
        palabra1.ingresarPalabras();        
        palabra2.ingresarPalabras();
        String primeraPalabra=palabra1.getPalabra();
        String segundaPalabra=palabra2.getPalabra();
        compararPalabras(primeraPalabra, segundaPalabra);
    }
static void compararPalabras(String palabra1, String palabra2){
        int largo, corto, masCorta;
        if(palabra1.length()>palabra2.length()){
            largo=palabra1.length();
            corto=palabra2.length();
            masCorta=2;
        }else{
            largo=palabra2.length();
            corto=palabra1.length();
            masCorta=1;
        }
        for (int i = 0; i < corto; i++) {
            boolean comparacion=palabra1.substring(i, i+1).equals(palabra2.substring(i,i+1));
            System.out.println("¿Letra "+(i+1)+" igual en las dos palabras? "+comparacion);
        }
        for (int i = corto; i < largo; i++) {
            System.out.println("¿Letra "+(i+1)+" igual en las dos palabras?  La palabra "+masCorta+" no tiene letra "+(i+1));
        }
    }

}
