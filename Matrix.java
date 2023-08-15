import java.util.Scanner;

class Matrix {
    int data[][]; // os elementos da matriz em si
    int rows;     // numero de linhas
    int cols;     // numero de colunas

    // construtor padrao de matriz
    Matrix(int r, int c) {
      data = new int[r][c];
      rows = r;
      cols = c;
    }

   // Ler os rows x cols elementos da matriz
    public void read(Scanner in) {
      for (int i=0; i<rows; i++)
         for (int j=0; j<cols; j++)
            data[i][j] = in.nextInt();
    }

   // Representacao em String da matriz
    public String toString() {
      String ans = "";
      for (int i=0; i<rows; i++) {
         for (int j=0; j<cols; j++)
            ans += data[i][j] + " ";
         ans += "\n";
      }
      return ans;
    }
    public static Matrix identity(int n){
        Matrix mat = new Matrix(n,n);
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                if(i == j){
                    mat.data[i][j] = 1;
                }
                else{
                    mat.data[i][j] = 0;
                }
        return mat;


    }
    public Matrix transpose() {
        Matrix mat = new Matrix(cols,rows);
        for (int i=0; i<rows; i++)
            for (int j=0; j<cols; j++)
                mat.data[j][i] = data[i][j];
        return mat;
                
 
    }
    public Matrix sum(Matrix m){
        Matrix mat = new Matrix(m.rows,m.cols);
        for (int i=0; i<m.rows; i++)
            for (int j=0; j<m.cols; j++)
                mat.data[i][j] = (data[i] [j])+(m.data[i][j]);
        return mat;
    }
    public Matrix multiply(Matrix m){
        Matrix mat = new Matrix(rows,m.cols);
        int s = 0;
        int k = 0;
        int i= 0;
        int j = 0;
            while (j != m.rows){
                s =  s + ((data[k][j])*(m.data[j] [i]));
                j++;
                }
            mat.data[0][0] = s; 
            s = 0;
        while (k!=rows){
            while (i!=m.cols){
                mat.data[k][i] = s;
                s = 0;
                
                while (j != m.rows){
                    s =  s + ((data[k][j])*(m.data[j] [i]));
                    j++;
                }
                i ++;
            }
            k++;
        }
        return mat;
    }   
}

