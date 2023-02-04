public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.sex = "Кобель";
        myWolf.name = "Хьюго";
        myWolf.color = "Серый";
        myWolf.weight = 50;
        myWolf.age = 12;
        System.out.printf("Вы видете перед собой %s - это %s %s, которому " + 
                "%d лет и весит он %2.2f кг.\n", myWolf.name, myWolf.color, myWolf.sex,
                myWolf.age, myWolf.weight);
        myWolf.walk();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunter();
    }
}