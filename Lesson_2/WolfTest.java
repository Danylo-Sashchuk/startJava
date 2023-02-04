public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setSex("Кобель");
        myWolf.setName("Хьюго");
        myWolf.setColor("Серый");
        myWolf.setWeight(50);
        myWolf.setAge(5);
        System.out.printf("Вы видете перед собой %s - это %s %s, которому " + 
                "%d лет и весит он %2.2f кг.\n", myWolf.getName(), myWolf.getColor(), 
                myWolf.getSex(), myWolf.getAge(), myWolf.getWeight());
        myWolf.walk();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunter();
    }
}