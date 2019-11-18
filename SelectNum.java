import java.util.Scanner;

public class SelectNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char[] arr = number.toCharArray();
        int[] arr2 = new int[256];
        for (int i = 0;i < arr.length;i++){
            arr2[arr[i]]++;
        }
        for (int j = 0;j < arr2.length;j++){
            if (arr2[j] != 0){
                System.out.println((j-48)+":"+arr2[j]);
            }
        }
    }
}
