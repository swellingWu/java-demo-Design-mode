package 简单工厂模式;

//工场
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        //  一个简单的披萨工厂，创建用户选择的披萨
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
