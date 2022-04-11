package Study;

public class SyncAsync {
    public static void main(String[] args) {
        Thread pizza = new Thread(() -> {
            dough("Pizza");
            sauce("Pizza");
            cheese("Pizza");
            ham("Pizza");
        });

        Thread hotdog = new Thread(() -> {
            bread("Hotdog");
            sausage("Hotdog");
            sauce("Hotdog");
        });

        Thread hamburger = new Thread(() -> {
            bread("Hamburger");
            patty("Hamburger");
            cheese("Hamburger");
            sauce("Hamburger");
        });

        pizza.start();
        hotdog.start();
        hamburger.start();

        pizza();
        hotdog();
        hamburger();
    }

    public static void dough(String dish) {
        System.out.println(dish + " >> Dough");
    }

    public static void sauce(String dish) {
        System.out.println(dish + " >> Sauce");
    }

    public static void cheese(String dish) {
        System.out.println(dish + " >> Cheese");
    }

    public static void ham(String dish) {
        System.out.println(dish + " >> Ham");
    }

    public static void bread(String dish) {
        System.out.println(dish + " >> Bread");
    }

    public static void sausage(String dish) {
        System.out.println(dish + " >> Sausage");
    }

    public static void patty(String dish) {
        System.out.println(dish + " >> Patty");
    }

    public static void pizza() {
        dough("Pizza");
        sauce("Pizza");
        cheese("Pizza");
        ham("Pizza");
    }

    public static void hotdog() {
        bread("Hotdog");
        sausage("Hotdog");
        sauce("Hotdog");
    }

    public static void hamburger() {
        bread("Hamburger");
        patty("Hamburger");
        cheese("Hamburger");
        sauce("Hamburger");
    }
}
