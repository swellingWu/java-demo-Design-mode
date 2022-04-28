import java.sql.PreparedStatement;

public class ShopC implements SellStyle {
    private ShopStyle factory;
    private double stock;

    public ShopC(ShopStyle shopStyle){
        this.factory=shopStyle;
        shopStyle.registObserver(this);
    }

    @Override
    public void update(int number,double quantity, int type) {
        stock = factory.statistics(quantity,0.3);
        System.out.println("商店C =====>  商品的编号为 :"+number+"      库存为 :     "+stock+"     类型为 :"+number);
    }
}
