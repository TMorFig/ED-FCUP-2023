import org.w3c.dom.css.Counter;
import org.w3c.dom.ls.LSParserFilter;

import java.io.FilterInputStream;
import java.util.Arrays;
import java.util.function.LongFunction;

import javax.crypto.spec.GCMParameterSpec;
import javax.management.relation.RelationType;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;


public class BTree<T> {   
    private BTNode<T> root; // raiz da arvore
 
    // Construtor
    BTree() {
       root = null;
    }
 
    // Getter e Setter para a raiz
    public BTNode<T> getRoot() {return root;}
    public void setRoot(BTNode<T> r) {root = r;}
 
    // Verificar se arvore esta vazia
    public boolean isEmpty() {
       return root == null;
    }
 
    // --------------------------------------------------------
 
    // Numero de nos da arvore   
    public int numberNodes() {
       return numberNodes(root);
    }
 
    private int numberNodes(BTNode<T> n) {
       if (n == null) return 0;
       return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
    }
 
    // --------------------------------------------------------
 
    // Altura da arvore
    public int depth() {
       return depth(root);
    }
 
    private int depth(BTNode<T> n) {
       if (n == null) return -1;
       return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
    }
 
    // --------------------------------------------------------
    
    // O elemento value esta contido na arvore?
    public boolean contains(T value) {
       return contains(root, value);
    }

    private boolean contains(BTNode<T> n, T value) {
       if (n==null) return false;
       if (n.getValue().equals(value)) return true;
       return contains(n.getLeft(), value) || contains(n.getRight(), value);
    }
 
    // --------------------------------------------------------
 
    // Imprimir arvore em PreOrder
    public void printPreOrder() {
       System.out.print("PreOrder:");
       printPreOrder(root);
       System.out.println();
    }
 
    private void printPreOrder(BTNode<T> n) {
       if (n==null) return;
       System.out.print(" " + n.getValue() );
       printPreOrder(n.getLeft());
       printPreOrder(n.getRight());
    }
 
    // --------------------------------------------------------
    
    // Imprimir arvore em InOrder
    public void printInOrder() {
       System.out.print("InOrder:");
       printInOrder(root);
       System.out.println();
    }
 
    private void printInOrder(BTNode<T> n) {
       if (n==null) return;
       printInOrder(n.getLeft());
       System.out.print(" " + n.getValue());
       printInOrder(n.getRight());
    }
 
    // --------------------------------------------------------
 
    // Imprimir arvore em PostOrder
    public void printPostOrder() {
       System.out.print("PostOrder:");
       printPostOrder(root);
       System.out.println();
    }
 
    private void printPostOrder(BTNode<T> n) {
       if (n==null) return;
       printPostOrder(n.getLeft());
       printPostOrder(n.getRight());
       System.out.print(" " + n.getValue());
    }
 
    // --------------------------------------------------------
 
    // Imprimir arvore numa visita em largura (usando TAD Fila)
    public void printBFS() {
       System.out.print("BFS:");
       
       MyQueue<BTNode<T>> q = new LinkedListQueue<BTNode<T>>();
       q.enqueue(root);
       while (!q.isEmpty()) {
          BTNode<T> cur = q.dequeue();
          if (cur != null) {
             System.out.print(" " + cur.getValue());
             q.enqueue(cur.getLeft());
             q.enqueue(cur.getRight());
          }
       }
       System.out.println();
    }
 
    // --------------------------------------------------------
    
    // Imprimir arvore numa visita em profundidade (usando TAD Pilha)
    public void printDFS() {
       System.out.print("DFS:");
       
       MyStack<BTNode<T>> q = new LinkedListStack<BTNode<T>>();
       q.push(root);
       while (!q.isEmpty()) {
          BTNode<T> cur = q.pop();
          if (cur != null) {
             System.out.print(" " + cur.getValue());
             q.push(cur.getLeft());
             q.push(cur.getRight());
          }
       }
       System.out.println();
    }

    public int numberLeafs(){
        int counter = 0;
        if(isEmpty() == false){
            if(root.getLeft() != null){
                BTree<T> k = new BTree<T>();
                k.setRoot(root.getLeft());
                counter += k.numberLeafs();
            }

            if(root.getRight() != null){
                BTree<T> s = new BTree<T>();
                s.setRoot(root.getRight());
                counter += s.numberLeafs();
            }
            if(root.getRight() == null && root.getLeft() == null){
                counter +=1;
            }     
        }
        else{
            return 0;
        }
        return counter;
    }
    public int level(int x){
      BTNode<T> cur = root;
      int counter = 0;
      if (cur == null){
         return 0;
      }  
      if(x == 0){
         return 1;
      }
      root = cur.getRight();
      counter = counter + level(x-1);
      root = cur.getLeft();
      counter = counter +level(x-1);
      return counter;

    }
    public int countallvalue(){
      BTNode<T> cur = root;
      int counter = 0;
      if (cur == null){
         return 0;
      }
      counter +=1;
      root = cur.getLeft();
      counter = counter +countallvalue();
      root = cur.getRight();
      counter = counter + countallvalue();
      return counter;
    }
    
    
 
   public boolean strict(){
      boolean k = true;
      if (root.getLeft() == null && root.getRight()==null){
         k = true;
      }
      if (root.getLeft() != null && root.getRight()== null  ){
         return false;
      }
      if (root.getRight() != null && root.getLeft()==null ){
         return false;
      }
      if(root.getRight() != null && root.getLeft()!=null){
         BTree<T> tr = new BTree<T>();
         tr.setRoot(root.getRight());
         k = k && tr.strict();
         tr.setRoot(root.getLeft());
         k = k && tr.strict();
      }
      return k;
   }
   public T path(String s){
      int i = 0;
      BTNode<T> cur = root;
      if(s == "R"){
         return root.getValue();
      }
      while (i != s.length()){
         char dir = s.charAt(i);
         if (dir == 'D'){
            cur = cur.getRight();
         }
         if (dir == 'E'){
            cur = cur.getLeft();
         }
         i++;
      }
      return cur.getValue();
      

   }
   public int nodesLevel(int k){
      int counterf = 0;
      BTree<T> s = new BTree<T>();
      if(k == 0){
         return 1;
      }
      if(k == 1){
         if(root.getRight() != null){
            counterf +=1;
         }
         if(root.getLeft() != null){
            counterf +=1;
         }
      }
      else{
         if(root.getRight() != null){
            s.setRoot(root.getRight());
            counterf = counterf + s.nodesLevel(k-1);
            
         }
         if(root.getLeft() != null){
            s.setRoot(root.getLeft());
            counterf = counterf + s.nodesLevel(k-1);
         }
      }
      
      return counterf;
 
   }
  
   ////////////////pesquisa///////////////
  
}