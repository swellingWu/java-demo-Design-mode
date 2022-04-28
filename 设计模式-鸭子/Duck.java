abstract class Duck		//超类鸭子类，甭管什么鸭子都要从这里继承鸭子属性和方法
{
    User user;
    FlyBehave flybehave;
    KuaBehave kuabehave;
    abstract public void display();	//抽象方法，所有子类必须提供该方法具体实现，因为鸭子的外貌必须要有
    public void setFly(FlyBehave flybehavior)	//给外部提供一个接口可以实现动态改变flybehave的值，也就是动态改变鸭子飞行行为
    {
        this.flybehave = flybehavior;	//这里用到了多态，在运行时动态的改变鸭子行为
    }
    public void performFly()	//表现鸭子飞行的特征，这里用到了
    {
        this.flybehave.Fly();	//同样用到了多态，动态的根据鸭子飞行方式的类型来表现飞行特征
    }
    public void kua() {
        this.kuabehave.Kua();
    }
    public void ByDuck(int num) { //展示鸭子的价格
        this.user.By(num);
    }

    public void setKua(KuaBehave kuabehavior)	//给外部提供一个接口可以实现动态改变kuabehave的值，也就是动态改变鸭子叫的行为
    {
        this.kuabehave = kuabehavior;
    }
    public void performKua()
    {
        this.kuabehave.Kua();
    }

}

class GreenDuck extends Duck	//创建一个稍微具体的鸭子类型，继承自超类Duck，名绿鸭子
{
    public GreenDuck()	//在构造函数内部一定要实现鸭子飞行行为与叫的行为,否则该鸭子实例化后就没有指定行为
    {
        this.flybehave = new FlyWithWings();	//指定绿鸭子用翅膀 飞
        this.kuabehave = new Qiqi();	//指定绿鸭子唧唧叫
        this.user = new Shopping();
    }
    public void display()
    {
        System.out.println("im a green duck");	//指定绿鸭子的外观为一个绿色的鸭子
    }
}

interface FlyBehave		//关于鸭子飞行行为的接口，实现该接口才可实现具体飞行行为
{
    public void Fly();	//接口声明一个鸭子飞行行为的函数
}
class FlyWithWings implements FlyBehave	//该类实现了鸭子飞行的一个行为，用翅膀飞行
{
    public void Fly()
    {
        System.out.println("im flying with wings");
    }
}
class NoFly implements FlyBehave	//该类实现了鸭子飞行的一个行为，不会飞
{
    public void Fly()
    {
        System.out.println("i can't fly");
    }
}
interface KuaBehave	//关于鸭子叫的接口，实现该接口才可实现具体叫的行为
{
    public void Kua();
}

class Qiqi implements KuaBehave	//该类实现了鸭子叫的一个行为，唧唧叫
{
    public void Kua()
    {
        System.out.println("================>>  i make sound with qiqi");
    }
}

class Kuakua implements KuaBehave	//该类实现了鸭子叫的一个行为，呱呱叫
{
    public void Kua()
    {
        System.out.println("i make sound with kuakua");
    }
}

class NoKua implements KuaBehave	//该类实现了鸭子叫的一个行为，不会叫
{
public void Kua()
        {
            System.out.println("i can't make sound");
        }
}

class CHello
{
    public static void  main(String[] args)
    {
        Duck greenduck = new GreenDuck();	//实例化一个绿鸭子
        greenduck.display();	//展现鸭子的外观
        greenduck.performFly();		//鸭子展现下飞行方式
        greenduck.setFly(new NoFly());	//设置鸭子的飞行方式为不会飞
        greenduck.performFly();	//再次展现鸭子飞行方式，结果是不会飞
        greenduck.kua();
        greenduck.ByDuck(50);
    }
}