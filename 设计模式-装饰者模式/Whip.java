class Whip extends CondimentDecorator	//具体化了一个配料类，奶泡，以下代码功能与mocha配料一致
{
    Beverage beverage;
    public Whip(Beverage bever)
    {
        this.beverage = bever;
    }
    public String getDescription()
    {
        return beverage.getDescription() + ",whip";
    }
    public double cost()
    {
        return beverage.cost() + .41;
    }
}