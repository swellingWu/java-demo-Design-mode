package 抽象工厂模式;

public class HighPersonFactory implements IAbstractFactory {

    @Override
    public Car getCar() {
        return new Bus();
    }

    @Override
    public IBreakFast getBreakFast() {
        return new Milk();
    }
}
