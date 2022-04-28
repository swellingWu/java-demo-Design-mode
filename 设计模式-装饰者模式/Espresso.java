class Espresso extends Beverage	//具体化了一个饮料类，黑咖啡
{
    public Espresso()
    {
        description = "espresso";	//描述变更为黑咖啡
    }
    public double cost()
    {
        return 1.99;	//返回黑咖啡价格
    }
}