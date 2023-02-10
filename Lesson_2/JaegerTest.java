public class JaegerTest {
    public static void main(String[] args) {
        Jaeger romero = new Jaeger();
        romero.setModelName("Romero Blue");
        romero.setMark("Mark-1");
        romero.setOrigin("USA");
        romero.changeOperatingSystem("Trans-Tao 3 Series");
        romero.setEnergyCore("Crocus ultima (\"The Plutonic Furnace\")");
        romero.setActive(true);
        romero.setSpeed(2);
        romero.setStrength(7);
        romero.setArmor(6);
        printJaegerIndo(romero);
        System.out.println("О, нет, его атакуют!");
        romero.weakenArmor(5);
        System.out.println("Робот одолел монстра, но общая защита снизилась и стала равна " +
                romero.getArmor());

        Jaeger eureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", "Arbiter Tac-Conn 12",
                "XIG Supercell Chamber", true, 10, 10, 9);
        printJaegerIndo(eureka);
        System.out.println("Робот входит в бой.");
        eureka.die();
        System.out.println("Есть ли связь с пилотами? " + eureka.isActive());
    }

    public static void printJaegerIndo(Jaeger robot) {
        System.out.println("\nНа патрулирование выходит робот " + robot.getModelName() + " " +
                robot.getMark() + " производства " + robot.getOrigin() + 
                "\nУ него на борту операционная система - " + robot.getOperatingSystem() +
                " и энергетическое ядро - " + robot.getEnergyCore() + ". \nОбщая скорость: " +
                robot.getSpeed() + "; Сила: " + robot.getStrength() + "; Защита: " +
                robot.getArmor());
    }
}