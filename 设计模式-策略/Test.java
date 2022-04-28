interface A{
    int aaa(int a,int b);
}
class B implements A{
    @Override
    public int aaa(int a, int b) {
        return a+b;
    }
}
class C implements A{

    @Override
    public int aaa(int a, int b) {
        return a-b;
    }
}
class Demo{
    private A a;
    Demo(A a){
        this.a=a;
    }
    public int get(int s,int t){
        return a.aaa(s,t);
    }
}

public class Test {

    public static void main(String[] args) {
        Demo demo1=new Demo(new B());
        System.err.println(demo1.get(5,6));
        Demo demo2=new Demo(new C());
        System.err.println(demo2.get(5,6));
    }
}