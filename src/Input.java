import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the point of interest:");
        System.out.print("City name: ");
        String cityName = scanner.nextLine();
        System.out.print("Category name: ");
        String categoryName = scanner.nextLine();
        System.out.print("Point of Interest name: ");
        String POIName = scanner.nextLine();
        System.out.print("Point of Interest description: ");
        String POIDesc = scanner.nextLine();
        System.out.print("Point of Interest rating: ");
        double POIRating = scanner.nextDouble();
        City city = new City(cityName);
        Category category = new Category(categoryName);
        PointOfInterest poi = new PointOfInterest(POIName, POIDesc, POIRating);
        poi.setCity(city);
        poi.setCategory(category);
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter("data/points_of_interest.csv", true))) {
            csvWriter.write(String.format("%s,%s,%s,%s,%.2f%n", cityName, categoryName, POIName, POIDesc, POIRating));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Point of interest added successfully!");
    }
}
