import java.util.Scanner;

public class ED200 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Scanner ing = new Scanner(System.in);
        int i = 0;
        int n = stdin.nextInt();
        int[] k = new int[n];
        int max = 0;
        int s = 0;
        while(i!=n){
            String y = stdin.nextLine();
            String[] inps = y.split(" "); 
            int linhas = Integer.parseInt(inps[0]);
            int colunas = Integer.parseInt(inps[1]);
            char data[][] = new char[linhas][colunas];
            String a = "";
            char[] list = new char[colunas];
            int j = 0;
            for ( s=0; s<linhas && ing.hasNextLine(); s++){
                a = ing.next();
                for (j=0; j<colunas; j++){
                    list[j] = a.charAt(j);
                    data[s][j] = list[j];
                }          
            }
            max = countcolony(linhas, colunas, data);
            k[i] = max;
            i++;
    
        }
        i = 0;
        while(i != n){
            System.out.println(k[i]);
            i++;
        }
    }
    static int countcolony(int rows, int cols, char[][] data){
        int i = 0;
        int k = 0;
        int max = 0;
        int counter = 0;
        while (i != rows){
            while(k != cols){
                if(data[i][k] == '#'){
                    counter = countvirus(i, k,rows,cols,data);
                }
                if (counter> max){
                    max = counter;
                }
                k+=1;
            }
            counter = 0;
            k = 0;
            i+=1;
        }
        return max;
    }
    
    static int countvirus(int i, int k, int rows, int cols, char[][] data){
        int counter = 0;
        counter +=1;
        if (i != 0 && k != 0){
            if (data[i-1][k-1]== '#'){
                data[i][k] ='.';
                counter = counter + countvirus(i-1, k-1,rows,cols,data);
               
            }
        }
        if (i != 0 ){
            if (data[i-1][k] == '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i-1, k,rows,cols,data);
                
            }
        }
        if (i != 0 && k != cols-1 ){
            if (data[i-1][k+1] == '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i-1, k+1,rows,cols,data);
                
            }
        }
        if ( k != cols-1 ){
            if (data[i][k+1] == '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i, k+1,rows,cols,data);
                
            }
        }
        if ( k != 0 ){
            if (data[i][k-1] == '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i, k-1,rows,cols,data);
                
            }
        }
        if (i != rows-1 && k != cols-1  ){
            if (data[i+1][k+1] == '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i+1, k+1,rows,cols,data);
                
            }
        }
        if (i != rows-1 && k != 0  ){
            if (data[i+1][k-1] == '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i+1, k-1,rows,cols,data);
                
            }
        }
        if (i != rows-1 ){
            if (data[i+1][k]== '#'){
                data[i][k] = '.';
                counter = counter + countvirus(i+1, k,rows,cols,data);
                
            }
        }
        data[i][k] = '.';
        return counter;
    }
}