import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class ED006{

    public static int countw(String s){
        if (s == null || s.isEmpty()) { return 0; } 
        
        String[] words = s.split("\\s+");
        return words.length; 
    }
    public static int countfirstnumber(String s){
        if (s == null || s.isEmpty()) { return 0; } 
        
        String[] words = s.split("\\s+");

        return Integer.parseInt(words[0]); 
    }
    public static int position(int total, int filas){
        int s = total % filas;
        return s;
    }
    public static String returnposacertada(String s,int pos){
        if (s == null || s.isEmpty()) { return ""; } 
        
        String[] words = s.split("\\s+");

        return (words[pos+1]); 
    }
    public static int returnposcarlos(String s){

        String[] words = s.split("\\s+");

        int i = 0;
        int k = -1;
        while (i != countw(s)-1){
            if (words[i] == "Carlos"){
                k = i;
            }
            i +=1;
            
        }
        return k;
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        String y = stdin.nextLine();
        String frase = stdin.nextLine();
        String putos = stdin.nextLine();
        int k = countfirstnumber(y);
        int filas = countfirstnumber(putos);
        int total = countw(frase);
        int pos = position(total, filas);
        String nomefinal = returnposacertada(putos, pos);

        System.out.println(nomefinal);



    }
}