import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class formato {

    public static void main (String[] args){
        Scanner stdin = new Scanner(System.in);
        String y = stdin.nextLine();
        String[] parts = y.split("    ");
        int i = 0;
        while (i != 8){
            System.out.print("('"+parts[i]+"'),");
            i +=1;
        }
    }
    
}
