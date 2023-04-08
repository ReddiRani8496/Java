import java.util.*;
class rcb{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
   double basic=sc.nextInt();
   double hra=0;
   double da=0;
   double gross_salary=0;
   if(basic<1500){
     da=(basic*90)/100;
     hra=(basic*10)/100;
    System.out.println(basic+da+hra);
   }
   else{
    da=(basic*98)/100;
    System.out.println(basic+500+da);
   }
    }
}
}