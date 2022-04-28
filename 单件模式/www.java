public class www {
    public static void main(String args[]) {
        ChocolateBoilerSingleton boiler = ChocolateBoilerSingleton.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        System.out.println("empty:" + boiler.isEmpty() + "\nboil:" + boiler.isBoiled());

        // will return the existing instance
        ChocolateBoilerSingleton boiler2 = ChocolateBoilerSingleton.getInstance();
    }
}

