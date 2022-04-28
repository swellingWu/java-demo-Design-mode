package 抽象工厂模式;

public class LowPersonFactory implements IAbstractFactory {

    @Override
    public Car getCar() {
        return new Bike();
    }

    @Override
    public IBreakFast getBreakFast() {
        return new Orange();
    }

}
