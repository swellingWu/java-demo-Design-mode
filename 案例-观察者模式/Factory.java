import java.util.HashSet;
import java.util.Set;

public class Factory implements ShopStyle{
    //对商品的情况进行保存
    private Set<SellStyle> sellStyles = new HashSet<SellStyle>();

    //实现制造商品的功能
    int number;
    double quantity;
    int type;
    double stock;

    @Override
    public void registObserver(SellStyle sell) {
        sellStyles.add(sell);
    }

    @Override
    public void removeObserver(SellStyle sell) {
        sellStyles.remove(sell);
    }

    public void notifyObservers() {
        for (SellStyle sellStyle: sellStyles){
            sellStyle.update(number,quantity,type);
        }
    }

    @Override
    public double statistics(double quantity, double percentage) {
        //对商店销售的货物进行占比配货
            if (percentage >= 1) {
                System.out.println("抱歉，您的占比过大了，请输入小于百分百的占比。");
            }else {
                stock = quantity*percentage;
            }
            return stock;
    }

    public void ShopChanged(int number,double quantity,int type) {
        this.number=number;
        this.quantity=quantity;
        this.type=type;
        notifyObservers();
    }
}
