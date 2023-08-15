
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;



public class ED268 {
    public static void main (String[] args){
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int i = 0;
        int[] list = new int[n];
        while(i!=n){
            list[i] = stdin.nextInt();
            i++;
        }
        i = 0;
        while (i != n){
            lambda(list[i]);
            i+=1;
        }

    }
    public static void lambda(int size){
        int meio = ((size-1)/2)+1;
        int i = 0;
        int k = 0;
        String s = "";
        while(i != meio-1){
            while(k != size){
                if (k == i){
                    s = s + "#";
                }
                else{
                    s = s+ ".";
                }
                k++;
            }
            System.out.println(s);
            s = "";
            k = 0;
            i++;
        }
        i = 0;
        k = 0;
        s = "";
        while(i != meio){
            while(k != size){
                if (k == meio+i-1 || k == meio-i-1){
                    s = s + "#";
                }
                else{
                    s = s+ ".";
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
