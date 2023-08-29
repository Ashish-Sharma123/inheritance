

/*import java.util.Scanner;

class parent{
    void greet(){
        System.out.println("greet");
    }
}
class cylinder extends  parent {
    private float r;
    private float h;
    Scanner s=new Scanner(System.in);
    public void setR() {
        System.out.print("enter the no:");
        r = s.nextFloat();
    }

    public float getR() {
        return r;
    }
    public void setH(){
        System.out.print("enter the no:");
        h=s.nextFloat();
    }
    public float area(){
        return h*r;
    }
}
interface child2{
    void mean();
    void sum();
}
class child extends cylinder implements child2{
     void run(){
        System.out.println("run");
    }
    public  void mean(){
         int a=89;
         int b=34;
         int c=a+b;
        System.out.println(c);
    }
    public void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no:");
        float a=sc.nextFloat();
        System.out.print("enter the no:");
        float b=sc.nextFloat();
        System.out.println(a+b);
    }
}
public class adv {
    public static void main(String[] args) {
        child c=new child();
        c.run();
        c.greet();
        c.sum();
        cylinder cy=new cylinder();
        cy.setH();
        cy.setR();
        System.out.println(cy.area());
    }
}*/


class runn{
    public void runn(){
        System.out.println("run");
    }
}
interface main2{
  void moan();
}
class main3 extends runn implements main2{
    public void moan(){
        System.out.println("moan");
    }
}

class Main{
    public static void main(String[] args) {
        main3 m=new main3();
        m.moan();

    }
}







