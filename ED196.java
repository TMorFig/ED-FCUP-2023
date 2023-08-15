public class ED196 {
    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
        String nome = "";
        String value = "";
        int i = 0;
        int n  = q.size();
        while (i != n/2){
            nome = q.first();
            q.dequeue();
            value = q.first();
            q.dequeue();
            if (value == "X"){
                if (a.size()> b.size()){
                    b.enqueue(nome);
                }
                if ( a.size() < b.size()){
                    a.enqueue(nome);
                }

            }
            ////////////////////////////////////USAR EQUALS///////////////////////
            if (value == "A"){
                a.enqueue(nome);
            }
            if (value == "B"){
                b.enqueue(nome);

            }
            i+=1;
        }

    }
    public static void main(String[] args){
        MyQueue<String> q = new LinkedListQueue<String>();
        MyQueue<String> a = new LinkedListQueue<String>();
        MyQueue<String> b = new LinkedListQueue<String>();
        q.enqueue("Luis");
        q.enqueue("B");
        q.enqueue("Pedro");
        q.enqueue("A");
        q.enqueue("Luisa");
        q.enqueue("A");
        q.enqueue("Joao");
        q.enqueue("X");
        q.enqueue("Ze");
        q.enqueue("X");
        q.enqueue("Miguel");
        q.enqueue("B");
        

        process(q, a, b);
        System.out.println(q);
        System.out.println(a);
        System.out.println(b);
    }
   
}
