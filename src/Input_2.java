import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_2 {
    public void run() {
        String filePath = "data/outside.csv";
        Path path = Paths.get(filePath);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error creating the file: " + filePath);
                return;
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for the point of interest:");
        String cityName = null;
        boolean validCity = false;
        while (!validCity) {
            try {
                System.out.print("City name: ");
                cityName = scanner.nextLine();
                if (cityName.isEmpty()) {
                    throw new MissingDataException("City name cannot be empty.");
                }
                validCity = true;
            } catch (MissingDataException e) {
                System.out.println(e.getMessage());
            }
        }
        String categoryName = null;
        boolean validCategory = false;
        while (!validCategory) {
            try {
                System.out.print("Category name: ");
                categoryName = scanner.nextLine();
                if (categoryName.isEmpty()) {
                    throw new MissingDataException("Category name cannot be empty.");
                }
                validCategory = true;
            } catch (MissingDataException e) {
                System.out.println(e.getMessage());
            }
        }
        String POIName = null;
        boolean validPOI = false;
        while (!validPOI) {
            try {
                System.out.print("Point of Interest name: ");
                POIName = scanner.nextLine();
                if (POIName.isEmpty()) {
                    throw new MissingDataException("Point of Interest name cannot be empty.");
                }
                validPOI = true;
            } catch (MissingDataException e) {
                System.out.println(e.getMessage());
            }
        }
        String POIDesc = null;
        boolean validDesc = false;
        while (!validDesc) {
            try {
                System.out.print("Point of Interest description: ");
                POIDesc = scanner.nextLine();
                if (POIDesc.isEmpty()) {
                    throw new MissingDataException("Point of Interest description cannot be empty.");
                }
                validDesc = true;
            } catch (MissingDataException e) {
                System.out.println(e.getMessage());
            }
        }
        double POIRating = 0.0;
        boolean validRating = false;
        while (!validRating) {
            try {
                System.out.print("Point of Interest rating: ");
                String ratingInput = scanner.nextLine();

                if (ratingInput.trim().isEmpty()) {
                    throw new MissingDataException_2("Point of Interest rating cannot be empty. Please enter a rating between 1 and 10.");
                }

                POIRating = Double.parseDouble(ratingInput);

                if (POIRating < 1.0 || POIRating > 10.0) {
                    throw new InvalidRatingException_2("Invalid rating. Please enter a rating between 1 and 10.");
                }

                validRating = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.nextLine();
            } catch (InvalidRatingException_2 e) {
                System.out.println(e.getMessage());
            } catch (MissingDataException_2 e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid numeric rating.");
            }
        }
        City city = new City(cityName);
        Category category = new Category(categoryName);
        PointOfInterest poi = new PointOfInterest(POIName, POIDesc, POIRating);
        poi.setCity(city);
        poi.setCategory(category);
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter("data/outside.csv", true))) {
            csvWriter.write(String.format("%s,%s,%s,%s,%.2f%n", cityName, categoryName, POIName, POIDesc, POIRating));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Point of interest added successfully!");
    }
}
class InvalidRatingException_2 extends Exception {
    public InvalidRatingException_2(String message) {
        super(message);
    }
}
class MissingDataException_2 extends Exception {
    public MissingDataException_2(String message) {
        super(message);
    }
}
