import java.util.Scanner;
class fib{
    public void arm(){
        int a,r,result=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a=n;
        while(a!=0){
            r=a%10;
            result+=(r*r*r);
            a/=10;
        }
       if(result==n){
           System.out.println(result +"is a arms no");
       }
       else{
           System.out.println(result+"it is not a arns no");
       }
    }
}
class pal extends fib{
    public void pal(){
        int a,r,result=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a=n;
        while(a!=0){
            r=a%10;
            result=result*10+r;
            a/=10;
        }
        if(result==n){
            System.out.println(result +" is a pal no");
        }
        else{
            System.out.println(result+" it is not a pal no");
        }
    }
    public void fib(){
        int c,a=0,b=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(+a);
            c=a+b;
            a=b;
            b=c;
        }
    }
    public void fact(){
        int fact=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
public class Main{
    public static void main(String[] args) {
        pal p=new pal();
        p.arm();
        p.pal();
p.fib();
p.fact();
    }
}