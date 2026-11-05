class Bank {
    long[] balance;
    public Bank(long[] balance) {
       this.balance=balance; 
    }
     public boolean isValid(int account){
         if(account<1 || account>balance.length){
                return false;
        }
        return true;
    }
    public boolean transfer(int account1, int account2, long money) {
         if(!isValid(account1) || !isValid(account2)|| money>balance[account1-1]|| money<0){
            return false;
        }
        balance[account1-1]-=money;
        balance[account2-1]+=money;
        return true;
    }
   
    public boolean deposit(int account, long money) {
        if(!isValid(account) || money<0){
            return false;
        }
        balance[account-1]+= money;
        return true;

    }
    
    public boolean withdraw(int account, long money) {
         if(!isValid(account)|| balance[account-1] < money || money<0 ){
            return false;
        }
        balance[account-1]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */