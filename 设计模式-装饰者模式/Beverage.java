abstract class Beverage	//装饰者与被装饰者共享的超类，这里是个抽象类
{
    String description = "Unknown Beverage";	//饮料描述，此时为未知饮料
    public String getDescription()	//获取饮料描述的方法
    {
        return description;
    }
    public abstract double cost();	//抽象方法，获取价格金额
}