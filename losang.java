import java.util.Scanner;

public class losang {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int dimen = stdin.nextInt();
        int i = 0;
        int k = 0;
        int meio = ((dimen)/2);
        triangcima(dimen);
                
            
        
    }
    static void triangcima(int dimen){
        int i = 0;
        int k = 0;
        String s = "";
        int meio = (dimen/2);
        while(i <= meio){
            while(k!=dimen){
                if(k>=meio-i && k<=meio+i ){
                    s = s+ "#";
                }
                else{
                    s = s+ ".";
                }
                k++;
            }
            System.out.println(s);
            s ="";
            i++;
            k = 0;
        }
        i = 0;
        k = 0;
        while(i != meio){
            while(k!=dimen){
                if(k>i && k<dimen-i-1 ){
                    s = s+ "#";
                }
                else{
                    s = s+ ".";
                }
                k++;
            }
            System.out.println(s);
            s ="";
            i++;
            k = 0;
        }
    
    }
}
