public class Main {
    public static void main(String[] args) {
        //消费的顾客
        Factory factory  = new Factory();

        ShopA shopA = new ShopA(factory);
        ShopB shopB = new ShopB(factory);
        ShopC shopC = new ShopC(factory);

        factory.ShopChanged(5,10,5);
    }
}
