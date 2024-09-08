public class Test {
    static Demo d=new Demo();
    static Do dd=new Do();
    public static void main(String[] args) {
     
       System.out.println(Test.d);
       System.out.println(Test.dd);
    }
}

class Demo{
 {
    System.out.println("hi");
 }

}
class Do{
    {
        System.out.println("hello");
    }
}