package TwoDimensionArray;

public class DealCards {
    public static void main(String[] args) {
        String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] chat = {"Co", "Ro", "Bich", "Tep" };
        String[] newArray = new String[52];
        int k = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < chat.length; j++) {
                newArray[k] = value[i] + chat[j];
                k++;
            }
        }
        randomArray(newArray);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Nguoi " + (i + 1) + " la:");
            for (int j = 0; j < 8; j++) {
                System.out.print(newArray[count] + " ");
                count++;
            }
            System.out.println(" ");
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void randomArray(String[] array) {
        for (int i = 0; i <= 50; i++) {
            int m = (int) (Math.random() * 51);
            int n = (int) (Math.random() * 51);
            if (m != n) {
                String temp = array[m];
                array[m] = array[n];
                array[n] = temp;
            }
        }
    }
}
