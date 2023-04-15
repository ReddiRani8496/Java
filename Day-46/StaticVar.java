import javax.lang.model.util.ElementScanner6;

public class StaticVar {
  public static void main(String[] args) {
    NetWorth parent=new NetWorth();
    NetWorth son1=new NetWorth();
    NetWorth son2=new NetWorth();
    NetWorth daughter1=new NetWorth();
    daughter1.capicono();
    parent.capicono();
    son1.sellProperty(14000);
    System.out.println(NetWorth.x);
    son2.collegeFees(2);
  }    
}
class NetWorth{
    static int x=1000000;
    void capicono(){
        x-=200;
    }
    void sellProperty(int val){
        x+=val;
    }
    void collegeFees(int tier){
        if(tier==1)
        x-=190000;
        else if(tier==2)
        x-=140000;
        else
        x-=10000;
    }
}
