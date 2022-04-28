package 抽象工厂模式;

public class Bus implements Car {

    @Override
    public void gotowork() {
        System.out.println("坐公交车去上班！");
    }

}
