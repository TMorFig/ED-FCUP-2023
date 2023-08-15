import java.io.*; 
import java.util.Scanner; 



public class quad {
    public static void main (String[] args){
        char a = '+';
        char b = '-';
        quadrado(a,b,30,10);

        

    }

    static void line(char a, char b, int n) {
        System.out.print(a);
        for (int i = 1; i <= n-2; i++ ){
            System.out.print(b);
        }
        System.out.println(a);
        
    }
    static void quadrado(char a, char b, int c, int l){
        line('<','<',c);
        for(int i = 1; i !=l-1; i++){
            line(a,b,c);
        }
        line('>','>',c);

    }
}
