package programacion.condicionales;
public class ej14 {
    public static void main(String args[]){
        int a=7;
        int b=5;
        int c=9;
        if (a<b && a>c){
            if(b>c){
                System.out.println("De mayor a menor es"+c","+b","+c);
            }else{
                System.out.println(a,c,b);
            }
        }
        if (b>a && b>c)
            if(a>c){
                System.out.println("De mayor a menor es"+b","+a","+c);
            }else{
                System.out.println("De mayor a menor es"+b","+c","+a);
            }
        if (c>a && c>b){
            if(a>b){
                System.out.println("De mayor a menor es"+c","+a","+b);
            }else{
                System.out.println("De mayor a menor es"+a","+b","+c);
            }
        }
    }


    
}
