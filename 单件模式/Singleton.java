public class Singleton {
    private static Singleton uniqueInstance;//利用一个静态变量来记录 Singleton 类的唯一实例

    private Singleton(){}//将构造方法定义为私有，只有自 Singleton 类内才可以调用构造器

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        //实例化对象并返回实例
        return uniqueInstance;
    }

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());// Singleton@15db9742

        singleton = Singleton.getInstance();
        System.out.println(singleton.toString());// Singleton@15db9742

        singleton = Singleton.getInstance();
        System.out.println(singleton.toString());// Singleton@15db9742

        singleton = Singleton.getInstance();
        System.out.println(singleton.toString());// Singleton@15db9742

    }
}