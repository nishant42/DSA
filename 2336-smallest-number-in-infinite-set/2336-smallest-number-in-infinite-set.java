class SmallestInfiniteSet {
    int pointer;
    TreeSet<Integer> set ;
    public SmallestInfiniteSet() {
        this.pointer=1;
        this.set= new TreeSet<>();
    }
    
    public int popSmallest() {
        if(!set.isEmpty()){
        return set.pollFirst();
        }
        else{
             return pointer++;
        }
       
    }
    
    public void addBack(int num) {
        if(num<pointer){
            set.add(num);
        }
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */