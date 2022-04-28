class Mocha extends CondimentDecorator	//具体化了一个配料类，摩卡
{
    Beverage beverage;	//声明一个Beverage是为了保存被装饰者的品种，方便根据该品种描述与价格计算装饰后的描述与价格
    public Mocha(Beverage bever)
    {
        this.beverage = bever;	//构造器里设置当前被装饰者品种
    }
    public String getDescription()
    {
        return beverage.getDescription() + ",mocha"; //返回被装饰者与本装饰者mocha叠加的名称
    }
    public double cost()
    {
        return beverage.cost() + .20;	//返回装饰者与被装饰者的价格之和
    }
}