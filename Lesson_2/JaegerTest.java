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

        System.out.println("На патрулирование выходит робот " + romero.getModelName() + " " +
                romero.getMark() + " производства " + romero.getOrigin() + 
                "\nУ него на борту операционная система - " + romero.getOperatingSystem() +
                " и энергитическое ядро - " + romero.getEnergyCore() + ". \nОбщая скорость: " +
                romero.getSpeed() + "; Сила: " + romero.getStrength() + "; Защита: " +
                romero.getArmor());

        System.out.println("Его атакуют!");
        romero.weakenArmor(5);
        System.out.println("Робот остался цел, но общая защита стала равна " + romero.getArmor());

        
    }
}