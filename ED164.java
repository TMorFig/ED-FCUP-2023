import java.security.Principal;
import java.util.Scanner;
public class ED164 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k  = 0;
        int i = 0;
        BSTree<String> tree = new BSTree<String>();
        String s;
        while ( k != n+1 ){
            s = in.nextLine();
            tree.insert(s);
            k++;
        }

        k = 0;
        System.out.println(tree.numberNodes()-1);

        
    }
}
