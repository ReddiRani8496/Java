//Encapsulation is a process of wrapping code and data together into a single unit.
class Account{
    private String name;
    private long acc_no;
    private float amount;
    public void setName(String Name){
        this.name=Name;
    }
    public String getName(){
        return this.name;
    }
    public void setAcc_No(long acc){
        this.acc_no=acc;
    }
    public long getAcc_No(){
        return this.acc_no;
    }
    public void setAmount(float Amount){
        this.amount=Amount;
    }
    public float getAmount(){
        return this.amount;
    }

}
class Bank{
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setName("john");
        acc.setAcc_No(6789354790L);
        acc.setAmount(2000000f);
        System.out.println(acc.getName());
        System.out.println(acc.getAcc_No());
        System.out.println(acc.getAmount());
    }
}