
/**
 * 巧克力锅炉——单例模式
 */
public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSingleton uniqueInstance;

    private ChocolateBoilerSingleton() {
        //初始时锅炉是空的，而且也不在沸腾状态
        this.empty = true;
        this.boiled = false;
    }

    public static synchronized ChocolateBoilerSingleton getInstance() {
        if (uniqueInstance == null) {
            System.out.println("创建一个独一无二的巧克力锅炉实例");
            uniqueInstance = new ChocolateBoilerSingleton();
        }
        System.out.println("返回已创建的巧克力锅炉实例");
        return uniqueInstance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    /**
     * 填充混合物
     */
    public void fill() {
        /*在锅炉内填入原料时，锅炉必须是空的，
        一旦填入原料就必须要把empty和boiled的状态设置好*/
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //用于填充牛奶和巧克力
        }
    }
    /**
     * 加热混合物
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //将状态置为沸腾
            boiled = true;
        }
    }
    /**
     * 排出混合物
     */
    public void drain() {
        /*锅炉排出时必须是满的，而且是煮沸的，
        排出结束之后需要重新将empty状态设置为空*/
        if (!isEmpty() && isBoiled()) {
            empty = true;//排出煮沸的巧克力和牛奶
        }
    }
}

