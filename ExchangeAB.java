import java.util.*;

public class ExchangeAB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] AB = new int[2];
        for (int i = 0;i <= 1;i++){
            AB[i] = scanner.nextInt();
        }
        exchangeAB(AB);
    }
    public static int[] exchangeAB(int[] AB) {
        ArrayList<Integer> list = new ArrayList<>();
        AB[0] = AB[0] + AB[1];//3 = 1 + 2
        AB[1] = AB[0] - AB[1];//3 - 2 = 1
        AB[0] = AB[0] - AB[1];//3 - 1 = 2

        for (int i = 0;i < AB.length;i++) {
            //System.out.print(AB[i]);
            list.add(AB[i]);
        }
        System.out.println(list);
        return AB;
    }
}