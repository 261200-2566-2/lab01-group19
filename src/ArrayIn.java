import java.util.Scanner;

public class ArrayIn {
    public static int[] add() {
        int num = -1;
        do{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter members: ");
            num = s.nextInt();
        }while(num < 0);
        int[] arr = new int[num];
        for(int i = 0 ;i < num ;i++){
            Scanner s = new Scanner(System.in);
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        System.out.print("The sorted number are: ");
        for(int j : arr){
            System.out.print(j + " ");
        }
    }
}