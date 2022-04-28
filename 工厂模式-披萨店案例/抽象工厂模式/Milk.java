package 抽象工厂模式;

public class Milk implements IBreakFast {

    @Override
    public void eat() {
        System.out.println("喝牛奶！");
    }

}
