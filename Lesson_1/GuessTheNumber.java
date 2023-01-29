public class GuessTheNumber {
    public static void main(String[] args) {
        int computersNumber = 25;
        int playersNumber = 78;
        while (playersNumber != computersNumber) {
            if (playersNumber < computersNumber) {
                System.out.printf("Число %d меньше того, что загадал компьютер.\n", playersNumber);
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер.\n", playersNumber);
            }
            playersNumber++;
            if (playersNumber > 100) {
                playersNumber -= 100;
            }
        }
        System.out.printf("\tВы победили! Компьютер загадал число %d!\n", computersNumber);
    }
}