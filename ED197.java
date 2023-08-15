public class ED197 {
    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
            int tama = a.size()+b.size();
            MyQueue<Integer> s = new LinkedListQueue<Integer>();
            int i = 0;
            int k = 0;
            while (i != tama ){
                if (a.size()!= 0 && b.size() != 0){
                    if ( a.first() > b.first()){
                        s.enqueue(b.first());
                        b.dequeue();
                    }
                    else{
                        s.enqueue(a.first());
                        a.dequeue();
                    }
                }
                if (a.size() == 0 && b.size() != 0){
                    s.enqueue(b.first());
                    b.dequeue();
                }
                if(b.size() == 0 && a.size() != 0){
                    s.enqueue(a.first());
                    a.dequeue();
                }
                i += 1;
            

            }
            return s;
    
    }
}
