import java.util.Scanner;

public class estatistica {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int first = 0;
        int i = 0;
        int max = -2000000;
        int min = 2000000;
        double soma = 0;
        double f = 0;
        while (i != n) {
            first = stdin.nextInt();
            if (i == 0) {
                max = first;
                min = first;
                soma = first;
                i += 1;
            }
            else {
                soma = soma + first;
                if (max < first){
                    max = first;

                }
                if (min > first){
                    min = first;

                }
            
                i += 1;
            }    
        }
        f = (soma/n);
        System.out.printf("%.2f\n", f);
        System.out.println(max-min);
    }
    
}
