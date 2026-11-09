class AuthenticationManager {
    int timeToLive;
    public AuthenticationManager(int timeToLive) {
        this.timeToLive= timeToLive;
    }
    public static class Token{
        String tokenId;
         int currentTime;
         int expire;
        public Token(String tokenId, int currentTime,int expire){
            this.tokenId=tokenId;
            this.currentTime=currentTime;
            this.expire=expire;
        }
    }
    List<Token> token= new ArrayList<>();
    public void generate(String tokenId, int currentTime) {
        Token tok= new Token(tokenId,currentTime,currentTime+timeToLive);
        token.add(tok);
    }
    
    public void renew(String tokenId, int currentTime) {
      
        Token tk=token.stream().filter(obj->obj.tokenId.equals(tokenId))
        .findFirst()
        .orElse(null);
        if(tk!=null && tk.expire>currentTime){
        tk.currentTime=currentTime;
        tk.expire=currentTime+timeToLive;
        }

    }
    
    public int countUnexpiredTokens(int currentTime) {
        int res=(int) token.stream().filter(a->a.expire>currentTime).count();
        return res;
    }
}

/**
 * Your AuthenticationManager object will be instantiated and called as such:
 * AuthenticationManager obj = new AuthenticationManager(timeToLive);
 * obj.generate(tokenId,currentTime);
 * obj.renew(tokenId,currentTime);
 * int param_3 = obj.countUnexpiredTokens(currentTime);
 */