class ED211{
    public static int countEven(BTree<Integer> t){
        BTNode<Integer> cur = t.getRoot();
        int counter = 0;

        if(cur.getValue()%2 == 0){
        counter +=1;
        }
        if(cur.getLeft() != null){
        cur= cur.getLeft();
        BTree<Integer> k = t;
        k.setRoot(cur);
        counter = counter + countEven(k);
        }
        if(cur.getRight() != null){
        cur= cur.getRight();
        BTree<Integer> k = t;
        k.setRoot(cur);
        counter = counter + countEven(k);
        }
        if(cur.getRight() == null || cur.getLeft() == null){
        return counter;
        }
        return counter;

    }
}
    