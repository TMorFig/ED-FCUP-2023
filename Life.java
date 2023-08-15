import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Life {
    public static void main (String[] args){
        //ler primeiras vars
        Scanner stdin = new Scanner(System.in);
        String y = stdin.nextLine();
        String[] inps = y.split(" "); 
        int l = Integer.parseInt(inps[0]);
        int c = Integer.parseInt(inps[1]);
        int ter = Integer.parseInt(inps[2]);
        ////////////////////////////////////
        char [] [] arr = new char [l] [c];
        String linha;
        int i = 0;
        int n = 0;

        ////////////////////////////
        while (i != l){
        linha = stdin.next();
        while (n != c) {
            arr [i] [n] = linha.charAt(n);
            n +=1;
        }
        i +=1;
        n = 0;
        }
        ///////////////////////
        soto(repeat(arr, l, c, ter), l, c);
        


    }
    //////////////////imprimir////////////////////
    static void soto (char[][] matr, int rows,int cols){
        int i = 0;
        int k = 0;
        while (i != rows){
            if (i != 0){
            }
            while(k != cols){
                System.out.print(matr [i][k]);
                k++;
            }
            i++;
            k= 0;
            System.out.println();
        }

    }
    //////////////////nvivas///////////////////////
    static int nvivas (char [][] mat, int l, int c,int linhas, int colunas){
        char viva = 'O';
        int sum = 0;
        if (c > 0 && mat[l][c-1] == viva ){
            sum +=1;
        }
        if (c<colunas-1 && mat[l][c+1] == viva ){
            sum +=1;
        }
        if ( c > 0 && l < linhas-1 && mat[l+1][c-1] == viva ){
            sum +=1;
        }
        if (l != linhas-1 && mat[l+1][c] == viva  ){
            sum +=1;
        }
        if (l < linhas-1 && c < colunas-1 && mat[l+1][c+1] == viva ){
            sum +=1;
        }
        if ( l > 0 && c > 0 && mat[l-1][c-1] == viva ){
            sum +=1;
        }
        if (l >0 && mat[l-1][c] == viva ){
            sum +=1;
        }
        if (l >0 && c < colunas-1 && mat[l-1][c+1] == viva ){
            sum +=1;
        }
        return sum;            
    }
    ///////////////////////////////
    static char[] [] makenormal ( int l, int c){
        int i = 0;
        int k = 0;
        char mat3 [] [] = new char[l][c];
        while (i != l){
            while (k != c){
                mat3 [i][k] ='.';
                k +=1; 
            }
        k = 0;
        i+=1;
        }
        return mat3;
    }
    /////////////////////////////////////////////////////////////
    static char[][] makelife (char [][] mat, int l, int c){
        int i = 0;
        int n = 0;
        char mat2 [] [] = new char[l][c];
        mat2 = makenormal(l, c);
        //soto(mat2,l,c);
        //soto(mat, l, c);
        ///////////////////////////       
        while (n != (l)){
            while(i != (c)){
                if(nvivas(mat,n,i,l,c) <= 1 && mat[n][i]== 'O'){
                    mat2[n][i] = '.';
                }
                if(nvivas(mat,n,i,l,c) >= 4 && mat[n][i]== 'O'){
                    mat2[n][i] = '.';

                }
                if(nvivas(mat,n,i,l,c) == 3 && mat[n][i]== '.'){
                    mat2[n][i] = 'O';
                    
                }
                if(nvivas(mat,n,i,l,c) == 3 && mat[n][i]== 'O' ){
                    mat2[n][i] = 'O';
                }
                if(nvivas(mat,n,i,l,c) == 2 && mat[n][i]== 'O' ){
                    mat2[n][i] = 'O';
                }
                i +=1;
            }
            n +=1;
            i = 0;
        }
        
        return mat2;

    }
    //////////////////////////////////////////////////////////////
    static char[][] repeat (char [][] mat, int l, int c,int n){
        int i =0;
        while (i != n){
            mat = makelife(mat, l, c);
            i +=1;
        }
        return mat;
    }


}