package 抽象工厂模式;

public interface IAbstractFactory {
    //抽象类的工厂接口
    /**
     *
     * @return
     */
    Car getCar();
    /**
     *
     */
    IBreakFast getBreakFast();

}
