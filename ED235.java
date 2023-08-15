
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;



public class ED235 {
    public static void main (String[] args){
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int i = 0;
        int [] list = new int[n];
        
        i = 0;
        while (i != n){
            int k = stdin.nextInt();
            list[i] = k;
            i+=1;
        }
        i = 0;
        while (i != n){
            triang(list[i]);
            i+=1;
        }


    }
    public static void triang(int size){
        int i = 0;
        int k = 0;
        String s = "";
        while(i != size){
            while(k!=size){
                if(size>k+i){
                    s = s + "#";
                }
                else{
                    s = s +".";
                }
                k++;
            }
            System.out.println(s);
            s = "";
            k = 0;
            i++;
        }

    }
}