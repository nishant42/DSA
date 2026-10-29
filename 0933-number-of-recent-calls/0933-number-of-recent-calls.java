class RecentCounter {
    Deque<Integer> dq= new ArrayDeque<>();
    public RecentCounter() {
      
    }
    
    public int ping(int t) {
        dq.add(t);
        while(dq.peekFirst()<t-3000) dq.pollFirst();
        return dq.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */