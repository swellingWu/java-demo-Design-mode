/*headfirst设计模式 第三章节 装饰者模式，装饰者模式分为装饰者与被装饰者，它们必须共享同一个超类，或者接口，因为只有这样，才可以用
 * 装饰者替换被装饰者（被装饰者对象被装饰者装饰后变成了装饰者对象，只有它们两个对象可以相互替换才可使用装饰者模式）
 * 本章节把咖啡饮料比作被装饰者，把调料比作装饰者，用新的调料来装饰饮料，得到新的装饰者对象
 */
public class decorate {

    public static void main(String[] args)
    {
        Beverage espresso1 = new HouseBlend();	//实例化一个espresso对象
        System.out.println(espresso1.getDescription() + ":" + espresso1.cost()); //输出只有espresso没有配料的描述与价格
        espresso1 = new Mocha(espresso1);	//用Mocha配料装饰espresso，装饰的过程即创建一个装饰者对象的过程，把被装饰者作为形参传递进去，结合该装饰者信息与装饰者信息结合，制造出一个装饰后的对象
        System.out.println(espresso1.getDescription() + ":" + espresso1.cost());	//输出espresso被mocha装饰后的描述与价格
        espresso1 = new Whip(espresso1);	//继续用whip装饰被mocha装饰后的espresso
        System.out.println(espresso1.getDescription() + ":" + espresso1.cost());	//输出被两种配料装饰后的描述与价格
        ;
    }

}