class NumberContainers {
    Map<Integer,Integer> container= new HashMap<>();
    Map<Integer,TreeSet<Integer>> order = new HashMap<>();
    public NumberContainers() {
        
    }
    
    public void change(int index, int number) {
        if(container.containsKey(index)){
            int oldno= container.get(index);
           TreeSet<Integer> oldset= order.get(oldno);
           oldset.remove(index);
        }
    //     container.put(index,number);
        container.put(index,number);  
            order.computeIfAbsent(number,k->new TreeSet<>()).add(index);
             
    //    x.add(index);
    }
    
    public int find(int number) {
        if(!order.containsKey(number) || order.get(number).isEmpty()){
            return -1;
        }
        else{
            return order.get(number).first();
        }
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */