public class Wolf {

    String sex;
    String name;
    String color;
    double weight;
    int age;

    void walk() {
        System.out.printf("%s идет.\n", name);
    }

    void sit() {
        System.out.printf("%s сидит.\n", name);
    }

    void run() {
        System.out.printf("%s бежит.\n", name);
    }

    void howl() {
        System.out.printf("%s воет.\n", name);
    }

    void hunter() {
        System.out.printf("%s охотиться.\n", name);
    }
}