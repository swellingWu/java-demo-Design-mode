abstract class CondimentDecorator extends Beverage	//为装饰者的实现写的一个抽象类，所有装饰者继承该类
{
    public abstract String getDescription();	//装饰者内部需要重写获取描述的方法，因为每装饰一次，就添加了新的配料
}
