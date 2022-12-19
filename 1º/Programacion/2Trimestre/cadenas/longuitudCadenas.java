import java.util.Scanner;
public class longuitudCadenas {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        /*
        //String cad1 = "Hola", cad2 = "";
        int longitud1 = cad1.length(); //devuelve 4
        int longitud2 = cad2.length(); //devuelve 0

        System.out.println("Introduce la primera frase");
        String cad1 = teclado.next();

        System.out.println("Introduce la segunda frase");
        String cad2 = teclado.next();

        if (longitud1 == longitud2){
            System.out.println("Son iguales");
        }else if(longitud1>longitud2){
            System.out.println("1 es mayor que 2");
        }else{
            System.out.println("2 es mayor que 1");
        }
        */

        /*
        String cad1, cad2;

        System.out.println("Escriba una frase");
        cad1 = teclado.next();

        System.out.println(cad1);
        cad2=concatenar(cad1);
        System.out.println(cad2);
        */

        String principal, subcadena;

        System.out.println("Escriba una frase");
        principal = teclado.next();

        buscador(principal);

    }

    static String concatenar(String cad){
        String cad2 ="";
        for(int i=0; i < cad.length(); i++){
            cad2 = cad.charAt(i) + cad2;
        }

        return cad2;
    }

    static String buscador(String cad){
        Scanner teclado = new Scanner (System.in);

        boolean result=false;

        System.out.println("Escriba una cadena");
        String cad2=teclado.next();
        /*
        int pos = cad.indexOf(cad2);
        System.out.println("Esta en la posicion: "+pos);
        */
        int pos=0;
        for (int i=0; i < cad.length(); i++){
            char c = cad.charAt(i);
            if(c==cad2.charAt(0)){
                pos=i;
                i=cad.length();
                System.out.println("La cadena se encuentra en la posicion: "+i);
            }else{
                System.out.println("No se ha encontrado la cadena");
            }
        }
        int cont=0;
        if(pos>-1)   {
            for (int i=pos; i < pos+cad.length(); i++){
                for (int j=0; j<cad2.length(); j++){
                    char c=cad.charAt(i);
                    char s=cad2.charAt(j);
                    if(c==s){
                        cont++;
                    }
                }
            }
        }

        if(cont == cad2.length()){
            System.out.println(pos);
        }else{
            System.out.println("No existe");
        }

        return cad2;
    }
}
