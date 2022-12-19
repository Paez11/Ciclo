package programacion.pruebas;
public class operadoresUnarios {
    public static void main(String args[]){
        int a=20 , b=10, c=0 , d=20, e=40, f=30;
        boolean condition = true;

        c=++a;
        System.out.println("valor de c (++a)= "+c);

        c=b++;
        System.out.println("valor de c (b++)= "+c);

        c=--d;
        System.out.println("valor de c (--d)= "+c);

        c=e--;
        System.out.println("valor de c (e--)= "+c);
        
    }
}
