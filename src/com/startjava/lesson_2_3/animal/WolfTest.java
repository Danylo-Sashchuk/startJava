public class WolfTest {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.setSex("Кобель");
        myWolf.setName("Хьюго");
        myWolf.setColor("Серый");
        myWolf.setWeight(50);
        myWolf.setAge(5);
        System.out.println("Вы видете перед собой " + myWolf.getName() + " - это " + 
                myWolf.getColor() + " " + myWolf.getSex() + ", которому " + myWolf.getAge() + 
                " лет и весит он " + myWolf.getWeight() + " кг.");
        myWolf.walk();
        myWolf.sit();
        myWolf.run();
        myWolf.howl();
        myWolf.hunter();
    }
}