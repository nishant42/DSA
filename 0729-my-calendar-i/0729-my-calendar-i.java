class MyCalendar {

    public MyCalendar() {
        
    }
    // public static class Event{
    //     int eventID=0;
    //     int start;
    //     int end;
    //     public Event(int start, int end){
    //         this.start=start;
    //         this.end=end;
    //     }
    // }
    // Map<Integer,Event> event= new HashMap<>();
    Set<int[]> dup = new HashSet<>();
    public boolean book(int startTime, int endTime) {
        int count=0;
        // while(set.get(0))
        // if(dup.contains(startTime) ){
        //     return false;
        // }
       
        boolean result=dup.stream().anyMatch(a->a[1]>startTime && a[0]<endTime);
        if(result==true){
            return false;
        }
        dup.add(new int[]{startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */