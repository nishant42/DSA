class SeatManager {
    int n;
    PriorityQueue<Integer> table;
    int curr=0;
    public SeatManager(int n) {
        this.n=n;
        this.table = new PriorityQueue<>();
        for (int i = 1; i <= n; i++) {
            table.add(i);
        }
    }
    
    public int reserve() {
       return table.poll();

    }
    
    public void unreserve(int seatNumber) {
        table.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */