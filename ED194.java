public class ED194 {
    

    public static void reverse(MyStack<Integer> s, int n){
        int i = 0;
        MyStack<Integer> k = new  LinkedListStack<Integer>();
        MyStack<Integer> krev =  new LinkedListStack<Integer>();
        while (i != n){
           k.push(s.top());
           s.pop();
           i+=1;
  
        }
        i = 0;
        while (i != n){
           krev.push(k.top());
           k.pop();
           i+=1;
  
        }
        i = 0;
        while (i != n){
           s.push(krev.top());
           krev.pop();
           i+=1;
  
     }
  
    

    }
    public static void main(String[] args) {
 
        // Criacao da pilha
        MyStack<Integer> s = new LinkedListStack<Integer>();
        //MyStack<Integer> s = new ArrayStack<Integer>();
  
        // Exemplo de insercao de elementos na pilha
        for (int i=1; i<=8; i++)
           s.push(i); // insere i no topo da pilha
        System.out.println(s);

        System.out.println(s);
        
 
 
     }
}
