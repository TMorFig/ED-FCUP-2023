import java.util.Scanner;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
public class ED231C {
    public  static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int k = 0;
        int[] data = new int[n];
        while(i != n){
            k = in.nextInt();
            data[i] = k;
            i++;
        }
        i =0;
        int flag =in.nextInt();
        if(flag == 1){
            int dif;
            int max = -1;
            int min = data[i+1]-data[i];
            while(i != n-1){
                dif = data[i+1]-data[i];
              
                if(dif> max){
                    max = dif;
                }
                else{
                    min = dif;
                }
                i++;
            }
            System.out.println(min +" "+max);
        }
        
        if(flag == 2){
            Double dif;
            Double percent;
            Double[] perc = new Double[n-1];
            while(i != n-1){
                dif = Double.valueOf(data[i+1]-data[i]);
                percent = (dif/data[i])*100;
                perc[i] = percent;
                i++;
            }
            i = 0;
            int acima= 0;
            int abaixo= 0;
            int max = 0;
            while(i != n-1){
                if(perc[i]> 5){
                    acima+=1;
                    abaixo = 0;
                }
                else{
                    abaixo+=1;
                    if(abaixo > max){
                        max = abaixo;
                    }

                }
                i++;
            }
            System.out.println(acima +" "+max);

        }
        if(flag == 3){
            
        }

    }
    
}
