import java.util.Scanner;

public class ED198{
    public static  void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        stdin.nextLine();
        int[] k = new int[n];
        int max = -100000;
        int at = 0;
        int i = 0;
        while (i != n){
            k[i] = stdin.nextInt();
            i ++;
        }
        i = 0;
        while(i != n){
            at += k[i];
            if(at > max){
                max = at;
            }
            if(at < 0){
                at =  0;
            }
            i+=1;

        }

        System.out.println(max);

    }
}