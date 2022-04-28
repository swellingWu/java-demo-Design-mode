import java.sql.PreparedStatement;

public class ShopB implements SellStyle {
    private ShopStyle factory;
    private double stock;

    public ShopB(ShopStyle shopStyle){
        this.factory=shopStyle;
        shopStyle.registObserver(this);
    }

    @Override
    public void update(int number,double quantity, int type) {
        stock = factory.statistics(quantity,0.2);
        System.out.println("商店B =====>  商品的编号为 :"+number+"      库存为 :     "+stock+"     类型为 :"+number);
    }
}
