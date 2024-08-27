import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String filePath = new Scanner(System.in).nextLine();
        List<Integer> nums = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextInt()) {
                nums.add(scanner.nextInt());
            }


        Collections.sort(nums);
        int median = nums.get(nums.size() / 2);

        int moves = 0;
        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        System.out.println(moves);
    }
}