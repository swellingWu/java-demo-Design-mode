import 自定义.IObserver;

public interface ShopStyle {
    //商店模板，基本的保存，删除，发送商品功能
    void registObserver(SellStyle sell);//保存商品
    void removeObserver(SellStyle sell);//删除商品
    void notifyObservers();//发送商品
    //统计各个商店的商品数量
    double statistics(double quantity, double percentage);
}
