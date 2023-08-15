import java.util.List;
import java.util.Scanner;
import java.util.function.ToDoubleFunction;

public class ED231 {
    public static  void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int i = 0;
        int [] list = new int[n];
        while(i != n){
            list[i] = stdin.nextInt();
            i+=1;
        }
        int flag = stdin.nextInt();
        i = 0;
        if (flag == 1){
            i = 1;
            int[] listadia = new int[n]; 
            while (i != n){
                int dia = list[i]-list[i-1];
                listadia[i-1] = dia;
                i += 1;
            }
            listadia[n-1] = listadia [n-2];
            i = 0;
            System.out.print(min(listadia, n)+" ");
            System.out.println(max(listadia,n));

        }
        if (flag == 2){
            i = 1;
            Double[] listadia2 = new Double[n-1]; 
            while (i != n){
                int cima = (list[i]-list[i-1]);
                int baixo =  (list[i-1]);
                Double cima2 = Double.valueOf(cima);
                Double baixo2 = Double.valueOf(baixo); 
                Double dia2 = (cima2/baixo2)*100;
                listadia2[i-1] = dia2;

                i += 1;
            }
            i = 0;
            output2(listadia2, n-1);



        }
        if(flag == 3){
            int h = max(list, n)/100;
            i = 0;
            int k = 0;
            String store = "";
            while( i != h){
                while(k!=n){
                    int s = list[k]/100;
                    
                    if (s >= h-i){
                        store = store + "#";

                    }
                    else{
                        store = store +".";
                    }
                    k++;
                }
                System.out.println(store);
                store = "";
                i++;
                k = 0;
            }
        }

    }
    public static int max(int[] list, int len){
        int i = 0;
        int max = 0;
        while (i != len){
            if (list[i] > max){
                max = list[i];
            }
            i+=1;
        }
        return max;
    }
    public static int min(int[] list, int len){
        int i = 0;
        int max = 99999;
        while (i != len){
            if (list[i] < max){
                max = list[i];
            }
            i+=1;
        }
        return max;
    }
    public static void output2(Double[] list, int n){
        int suc = 0;
        int maxsuc = 0;
        int counter = 0;
        int able = 0;
        int i = 0;
        while(i != n){
            if (list[i]<=5.0){
                suc += 1;
                able +=1;
                if(able == 1){
                    counter +=1;
                }
            }
            else{
                suc = 0;
                able = 0;
            }
            
            if(suc>maxsuc){
                maxsuc = suc;
            }
            i++;

        }
        System.out.println(counter+" "+maxsuc);

    }
    
}