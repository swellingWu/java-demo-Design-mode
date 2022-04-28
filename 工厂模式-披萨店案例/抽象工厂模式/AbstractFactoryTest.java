package 抽象工厂模式;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IAbstractFactory factory = new LowPersonFactory();
        Car car = factory.getCar();
        IBreakFast breakFast = factory.getBreakFast();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.gotowork();

        IAbstractFactory factory2 = new HighPersonFactory();
        car = factory2.getCar();
        breakFast = factory2.getBreakFast();
        System.out.println("吃的早饭是：");
        breakFast.eat();
        System.out.println("上班交通工具是：");
        car.gotowork();
    }

}
