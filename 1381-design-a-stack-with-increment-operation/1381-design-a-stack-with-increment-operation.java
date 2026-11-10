class CustomStack {
    int[] stack ;
    int curr;
    public CustomStack(int maxSize) {
        this.stack= new int[maxSize];
        this.curr=0;
    }
    // Map<Integer,Integer> pos= new HashMap<>();
    
    public void push(int x) {
        if(curr<stack.length){
            stack[curr]=x;
            curr++;
        }
    }
    
    public int pop() {
        if(curr==0){
            return -1;
        }
        else{
            int res=stack[curr-1];
            stack[curr-1]=0;
            curr-=1;
            return res;
             
        }
    }
    
    public void increment(int k, int val) {
        int minVal= Math.min(curr,k);
        for(int i=0;i<minVal;i++ ){
            //  int ad=stack[i]+=val;
            System.out.println("org"+stack[i]+"k"+k);
           
            // System.out.println("val"+ad);
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */

 