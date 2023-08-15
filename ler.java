import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class ler {
    public static void main (String[] args){
        Scanner stdin = new Scanner(System.in);
        String y = stdin.nextLine();
        String[] inps = y.split(" "); 
        int l = Integer.parseInt(inps[0]);
        int c = Integer.parseInt(inps[1]);
        int i = 0;
        int n = 0;
        int nn = 0;
        int k = 0;
        String linha;
        char [] [] arr = new char [l] [c];
        String buf = "";
        int [] coluna = new int [c];
        int [] li = new int [l];
        int [] finale = new int [l+c];

        while (i != l){
            linha = stdin.next();
            li [i] = rline(linha, c);
            while (n != c) {
                arr [i] [n] = linha.charAt(n);
                n +=1;
            }
            i +=1;
            n = 0;
        }
        while (k != c){
            
            while (nn != l ){
                buf = buf + arr [nn] [k];
                nn +=1;
                
            }
            coluna [k] = rline(buf, l);
            k +=1;
            nn = 0;
            buf = "";
        
        }
        for (int ss = 0; ss != c; ss ++){

            finale[ss] = coluna[ss];

        }
        
        for (int kk = 0; kk != l; kk ++) {
            finale[kk+c] = li[kk];
        }

        finale = maxo(finale);
        System.out.println( finale[0] + " " + finale[1]);

       
    }
    static int rline (String s, int c){
        int max = 0;
        int maxfake = 0;
        int k = 0;
        while (k != c ){
            char ch = s.charAt(k);
            if (ch == '#' ){
                maxfake += 1;
                if (max < maxfake){
                    max = maxfake;
                }
            }
            else {
                maxfake = 0;
            }
            k +=1;
        }
        return max;
    }
    
    static int[] maxo (int[] lista){
        int maxi = -1 ;
        int i = 0;
        int h = 0;
        int count = 0;
        int [] maxc = new int[2];
        while (i != lista.length ){
            if (lista[i] > maxi){
                maxi = lista[i];

            }
            i+=1;
        }
        while(h != lista.length ){
            if (lista[h] == maxi){
                count +=1;
                
            }
            h+=1;
        }
        
        maxc[0] =maxi;
        maxc[1] = count;
        return maxc;
        

    }
}