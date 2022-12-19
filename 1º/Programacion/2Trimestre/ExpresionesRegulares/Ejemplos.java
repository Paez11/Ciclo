package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplos {
    /*
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Esperando texto: ");
        String cad = teclado.nextLine();

        //Comprueba si la cadena es "abc"
        Pattern pat = Pattern.compile("abc");
        Matcher mat = pat.matcher(cad);

        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        /*
        if(mat.find()){
            System.out.println(mat.find());
        }else{
            System.out.println(mat.find());
        }
        
        teclado.close();
    }    
    */
    /*
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Esperando texto: ");
        String cad = teclado.nextLine();

        //Comprueba si la cadena es "abc"
        //.Todos los caracteres antes de la expresion
        //*Puede aparecer un numero indefinido de veces
        //{} Tiene que aparecer el numero de veces que se indica
        //^ Por donde empieza la cadena
        //[] Rango
        //$ Indica donde acaba la cadena
        //+ significa que tiene que contener al menos un caracter
        //? significa que no siempre tiene que estar
        //{1,2} significa que se repita entre una y dos veces
        Pattern pat = Pattern.compile("^cod.abc.*");
        Matcher mat = pat.matcher(cad);

        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        teclado.close();
    }  
    */
    /*
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca su nombre: ");
        String cad = teclado.nextLine();

        //Pattern pat = Pattern.compile("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
        //Pattern pat = Pattern.compile("^([A-Z]{1}[a-z]+[ ]*){1,2}$");
        Pattern pat =Pattern.compile("^[0-9]{8}[A-Z]$");
        Matcher mat = pat.matcher(cad);

        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        teclado.close();
    }  
    */
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca su e-mail: ");
        String cad = teclado.nextLine();

        //Pattern pat = Pattern.compile("^([A-Z]{1}[a-z]+[ ]?){1,2}$");
        //Pattern pat = Pattern.compile("^([A-Z]{1}[a-z]+[ ]*){1,2}$");
        Pattern pat =Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(cad);

        if(mat.matches()){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

        teclado.close();
    }  

    /*
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca su e-mail: ");
        String email = teclado.nextLine();
        if(email.matches("^[0-9]{8}[A-Z]$")){
            System.out.println("es correcto");
        }
        System.out.println("No es correcto");
    }
    */
    /*
    public static void main(String[] arg){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduzca: ");
        String cad = teclado.nextLine();
        if(cad.matches("^(W212)(?=[0-9A-Z]){3}[AEIOU]$")){
            System.out.println("es correcto");
        }
        System.out.println("No es correcto");
    }
    */
}
