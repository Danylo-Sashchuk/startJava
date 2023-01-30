public class GuessTheNumber {
    public static void main(String[] args) {
        int tagretNum = 69;
        int playerNumber = 50;
        while (playerNumber != tagretNum) {
            if (playerNumber < tagretNum) {
                System.out.printf("Число %d меньше того, что загадал компьютер.\n", playerNumber);
                playerNumber++;
            } else {
                System.out.printf("Число %d больше того, что загадал компьютер.\n", playerNumber);
                playerNumber--;
            }
        }
        System.out.printf("\tВы победили! Компьютер загадал число %d!\n", tagretNum);
    }
}