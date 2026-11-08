class BrowserHistory {
    String homepage=null;
    List<String> tabs= new ArrayList<>();
    int curr=0;
    public BrowserHistory(String homepage) {
        this.homepage= homepage;
        tabs.add(homepage);
    }
    
    public void visit(String url) {
        while (tabs.size() - 1 > curr) {
        tabs.remove(tabs.size() - 1); 
    }
        tabs.add(url);
       curr+=1;     
        
    }
    
    public String back(int steps) {
        if(curr-steps<0){
            curr=0;
        }
        else{
            curr-=steps;
        }
        return tabs.get(curr);

    }
    
    public String forward(int steps) {
        if(steps>tabs.size()-curr-1){
            curr=tabs.size()-1;
        }
        else{
            curr+=steps;
        }
        return tabs.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */