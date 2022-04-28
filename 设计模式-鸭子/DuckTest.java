abstract class DuckTest {
    public void quack() {
        System.out.println(" 鸭子叫了 ");
    }
    public void swim() {
        System.out.println(" 鸭子在游泳 ");
    }
    public void display() {
        System.out.println("这只鸭子有漂亮的外观");
    }
    public void fly() {
        System.out.println("这只鸭子会飞");
    }
}

class GreenDucks extends DuckTest {
    public GreenDucks() {
        this.display();
    }
}

class RedheadDucks extends DuckTest {
    public RedheadDucks() {
        this.display();
    }
}

class Hello
{
    public static void  main(String[] args)
    {
        DuckTest greenduck = new GreenDucks();	//实例化一个绿鸭子
    }
}