class LUPrefix {
    int n;
    int[] storage;
    // int curr=0;
   int curr=0;
    int count=0;
    int temp=0;
    public LUPrefix(int n) {
        this.n=n;
        this.storage= new int[n];
    }
    
    public void upload(int video) {
        storage[video-1]=video;
        curr+=1;

        
    }
    
    public int longest() {
        
        // System.out.println("array"+ Arrays.toString(storage));
        
        while(temp<storage.length && storage[temp]!=0 ) {
           
           count+=1;
           temp+=1;
            // System.out.println("count"+count);
        }
        // System.out.println("countout"+count);
        return count;
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */