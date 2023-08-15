import java.util.Scanner;
public class ED215{
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n  = stdin.nextInt();
        int i = 0;
        String s;
        String[] Total = new String[n];
        String[] name; 
        int[] preco;
        String[] venda; 
        while(i != n){
            s =stdin.nextLine();
            String[] inps = s.split(" ");
            Total[i] = s;
            if(inps[0].equals("OFERTA")){ 
                int p = 0; p +=1;

            
                name[i] = inps[1] + " " +inps[2];
                preco[i] = Integer.parseInt(inps[2]);
            }
            else{
                int max = largest(preco);
                preco = remove(preco);
                int m = 0;
                venda[m] = max+" ";
                m++;
            }
            i++;
        }
        i = 0;
        while(i!=venda.length){
            System.out.println(venda[i]);
            i++;
        }

    }

    static int largest(int[] arr)
    {
        int i;

        int max = arr[0];
        int pos = 0;
         
  
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
                pos = i;
        
        return max;
    }
    static int[] remove(int[] arr){
        int i;
        int max = arr[0];
        int pos = 0;
         
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
                pos = i;

        arr[pos] = -1;
        return arr;
    }
}