import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String circleFilePath = args[0];
        String pointsFilePath = args[1];

        try {
            BufferedReader circleReader = new BufferedReader(new FileReader(circleFilePath));
            String[] circleData = circleReader.readLine().split(" ");
            double centerX = Double.parseDouble(circleData[0]);
            double centerY = Double.parseDouble(circleData[1]);
            double radius = Double.parseDouble(circleReader.readLine());
            circleReader.close();

            BufferedReader pointsReader = new BufferedReader(new FileReader(pointsFilePath));
            String line;
            while ((line = pointsReader.readLine()) != null) {
                String[] point = line.split(" ");
                double pointX = Double.parseDouble(point[0]);
                double pointY = Double.parseDouble(point[1]);

                double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));

                if (distance < radius) {
                    System.out.println(1);
                } else if (Math.abs(distance - radius) < 1e-9) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            }
            pointsReader.close();

        } catch (IOException e) {
            System.out.println("Файл не читается " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат чисео " + e.getMessage());
        }
    }
}