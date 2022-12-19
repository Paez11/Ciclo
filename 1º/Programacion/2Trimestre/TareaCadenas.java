import java.util.Scanner;

public class TareaCadenas {
    public static void main(String[] arg){

        
        String cadena1="";
        //String cadena2="";
        
        palindromo(cadena1);
        //codificar(cadena2);

    }

    /**
     * Metodo que nos servira para comprobar si una cadena es palindromo o no. (no funciona muy bien la funcion de "replace( , )" a veces coge los parametros otras veces no).
     * @param cad recibe la cadena que se quiera comprobar
     */
    static void palindromo(String cad){
        
        Scanner teclado = new Scanner (System.in);

        String aux="";

        cad= cad.toLowerCase().replace(" ", "").replace(",", "").replace(".", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");

        System.out.println("Introduce la cadena que quiera comprobar: ");
        cad=teclado.next();

        for(int i=0; i<cad.length();i++){
            aux = cad.charAt(i) + aux;
        }

        System.out.println(aux);

        if (aux.equals(cad)){
            System.out.println("La cadena es palindromo");
        }else{
            System.out.println("La cadena no es palindromo");
        }

        
    }

    /**
     * metodo que nos servira para codificar una cadena que reciba y la devolvera codificada.
     * @param cad recibe la cadena que se quiere codificar
     * @return devuelve la cadena codificada
     */
    static int codificar(String codificada){

        Scanner teclado = new Scanner (System.in);

        int codigo=0;

        System.out.println("introduce la cadena que quiera codificar: ");

        codificada=teclado.next();

        for(int i=0; i<codificada.length(); i++){
           char aux=codificada.charAt(i);
           codigo=(int)aux;
           System.out.print(codigo);
        }

        return codigo;
    }

    /**
     * metodo que nos servira para descodificar una cadena que reciba.
     * @param cad recibe la cadena que se quiere descodificar
     * @return devuelve la cadena descodificada
     */
    static String descodificar(int codigo){

        String descodificada="";

        for(int i=0; i<codigo; i++){

        }

        return descodificada;
    }

}