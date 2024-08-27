import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> circularArray = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                circularArray.add(i);
            }

            int currentIndex = 0;
            int initIndex= currentIndex;

            result.append(circularArray.get(currentIndex));

            for (int i = 0; i < n; i++) {
                currentIndex = (currentIndex + m - 1) % n;
                if (currentIndex == initIndex) {break;}
                result.append(circularArray.get(currentIndex));
            }

            // Выводим результат
            System.out.println(result.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}