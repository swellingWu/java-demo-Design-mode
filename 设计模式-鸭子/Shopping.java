public class Shopping implements User {

    int num;

    @Override
    public void By(int sum) {
        this.num = sum;
        System.out.println("================>>  购买鸭子花费了"+num);
    }
}
