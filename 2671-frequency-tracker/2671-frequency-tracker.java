class FrequencyTracker {
    // List<Integer> freq = new ArrayList<>();
    Map<Integer,Integer> map1= new HashMap<>();
    Map<Integer,Integer> map2 = new HashMap<>(); 
    public FrequencyTracker() {
        
    }
    
    public void add(int number) {
    int old = map1.getOrDefault(number, 0);
    map1.put(number, old + 1);

    if (old > 0) map2.put(old, map2.get(old) - 1);        // leave the old group
    map2.put(old + 1, map2.getOrDefault(old + 1, 0) + 1);  // join the new group
}
    
public void deleteOne(int number) {
    int old = map1.getOrDefault(number, 0);
    if (old == 0) return;
    map1.put(number, old - 1);

    map2.put(old, map2.get(old) - 1);                       // leave the old group
   if (old - 1 > 0) map2.put(old - 1, map2.getOrDefault(old - 1, 0) + 1);
}
    
    public boolean hasFrequency(int frequency) {
        if(map2.getOrDefault(frequency,0)==0){
            return false;
        }
        else {
            return true;
        }
    }
}

/**
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */