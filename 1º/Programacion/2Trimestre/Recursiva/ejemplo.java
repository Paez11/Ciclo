
package Recursiva;
import java.util.Scanner;


public class ejemplo {
    public static void main (String[] arg){
        Scanner teclado = new Scanner (System.in);

        /*
        int n=0;
        int n2=0;
        System.out.println("Introduzca un numero");
        n=teclado.nextInt();
        //System.out.println(fibonacci(n));
        System.out.println("Introduzca el exponente");
        n2=teclado.nextInt();
        System.out.println(potencia(n, n2));
        */
        /*
        String cad="";
        System.out.println("Introduzca una cadena: ");
        cad=teclado.next();
        System.out.println(cadena(cad,cad.length()-1));
        */
        /*
        int n=0;
        System.out.println("Introduzca un numero");
        n=teclado.nextInt();
        System.out.println(invNumero(n));
        */
        //System.out.println("Introduzca un numero");
        //n=teclado.nextInt();
        int[] miArray = new int[] {1,2,3,4,5};
        invArray(miArray,0);
        teclado.close();
    }

    static int funcionRecursiva(int n){
        int result=0;

        if(n<=1){
            result=n;
        }else{
            result=n+funcionRecursiva(n-1); //suma(n)=n+suma(n-1) hasta llegar a 1
        }

        return result;
    }
    
    static int factorial(int n){
        int result=0;

        if(n<=1){
            result=n;
        }else{
            result=n*factorial(n-1);
        }
        return result;
    }

    static int fibonacci(int n){
        int result=0;

        if(n<=0){
            result=0;
        }else if(n!=1){
            result=fibonacci(n-1)+fibonacci(n-2);
        }else{
            result=n;
        }

        return result;
    }

    static int potencia(int base, int exp){
        int result=0;

        if(base<=0){
            result=0;
        }else if(exp<0){
            result=0;
        }else if (exp==0){
            result=1;
        }else if (exp==1){
            result=base;
        }
        else{
            result=base*potencia((base),(exp-1));
        }

        return result;
    }

    static String cadena(String cad, int longuitud){
        String result="";

        if(longuitud==0){
            System.out.println(cad.charAt(longuitud));
        }else{
            System.out.println(cad.charAt(longuitud));
            result=cadena(cad,longuitud-1);
        }

        return result;
    }

    static int invNumero(int n){
        int result=0;
        
        if(n<10){
            System.out.println(n);
        }else{
            System.out.println(n%10);
            result=invNumero(n/10);
        }

        return result;
    }

    static void invArray(int[] miArray,int pos){

        if(pos>=0){
            if(pos==(miArray.length-1)){
                System.out.println(miArray[pos]);
            }else{
                System.out.println(miArray[pos]);
                invArray(miArray, pos+1);
            }
        }
    }

    static boolean encuentraArray(int[] miArray, int pos, int elem){
        boolean encontrado=false;

        if(pos>=0){
            if(pos <miArray.length){
                if(elem == miArray[pos]){
                    encontrado=true;
                }else{
                    encontrado=encuentraArray(miArray, pos, elem);
                }
            }
        }
        return encontrado;
    }
}
