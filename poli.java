import java.io.*; 
import java.util.Scanner; 

public class poli {
    public static void main (String[] args) { 

        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int i = 0;
        String str= "kk", nstr=""; 
        char ch; 
        String s = "a dani e linda maravilhosa <3333333";



        while (i != n+1 ){
            str = stdin.nextLine();
            str = str.replaceAll("'","");
            str = str.replaceAll(",","");
            str = str.replaceAll("\\.","");
            str = str.replaceAll("\\?", "");
            str = str.replaceAll("\\s", "");
            str = str.toLowerCase();
            for (int k =0; k<str.length(); k++) 
            { 
            ch= str.charAt(k); 
            nstr= ch+nstr; 
            }
            if (i == 0){
                System.out.println(n);
            }
            else if (str.equals(nstr) ==  true ){
                s = "sim";
                
                System.out.println(s);
            }
            else if (str.equals(nstr) ==  false ){
                s = "nao";
                System.out.println(s);
                
            }
            nstr = "";
            i +=1;



        }
        



        
    } 
    
}
