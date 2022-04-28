class HouseBlend extends Beverage	//具体化了一个饮料类，混合咖啡
{
    public HouseBlend()
    {
        description = "houseblend";	//描述变更为混合咖啡
    }
    public double cost()
    {
        return .89;	//返回混合咖啡的价格
    }
}