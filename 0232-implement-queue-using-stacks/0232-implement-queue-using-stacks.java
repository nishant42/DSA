import java.util.*;
class MyQueue {
   Stack < Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();
    public MyQueue() {
        
    }
    
    public void push(int x) {

        input.push(x);
    }
    
    public int pop() {
        if(!output.empty()){
            return output.pop();
        }
        else{
            while(!input.empty()){
            int y= input.pop();
            output.push(y);
            }
            return output.pop();
        }
    }
    
    public int peek() {
        if(!output.empty()){
            return output.peek();
        }
        else{
            while(!input.empty()){
            int y= input.pop();
            output.push(y);
            }
        return output.peek();
            
        }
    }
    
    public boolean empty() {
        if(input.empty()&& output.empty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */