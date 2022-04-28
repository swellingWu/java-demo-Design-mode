package 抽象工厂模式;

public class Bike implements Car {
    @Override
    public void gotowork() {
        System.out.println("骑自行车去上班！");
    }

}
