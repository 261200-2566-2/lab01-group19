import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = ArrayIn.add();
        Arrays.sort(arr);
        ArrayIn.printArray(arr);
    }
}