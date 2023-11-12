import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Output {
    public List<String> run(){
        List<PointOfInterest> pointsOfInterest = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        try (BufferedReader csvReader = new BufferedReader(new FileReader("data/points_of_interest.csv"))) {
            String line;
            csvReader.readLine(); // Skip the header line
            while ((line = csvReader.readLine()) != null) {
                String[] data = line.split(",");
                String cityName = data[0];
                String categoryName = data[1];
                String POIName = data[2];
                String POIDesc = data[3];
                double POIRating = Double.parseDouble(data[4]);

                City city = new City(cityName);
                Category category = new Category(categoryName);
                PointOfInterest poi = new PointOfInterest(POIName, POIDesc, POIRating);
                poi.setCity(city);
                poi.setCategory(category);

                pointsOfInterest.add(poi);
                categories.add(category);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        for (PointOfInterest poi : pointsOfInterest) {
            outputList.add("City: " + poi.getCity() + " Name: " + poi.getName() + " Description: " + poi.getDescr() + " Rating: " + poi.getRating());
        }

        return outputList;
    }
    public List<String> runs() {
        List<PointOfInterest> pointsOfInterest = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        List<String> outputList = new ArrayList<>();

        try (BufferedReader csvReader = new BufferedReader(new FileReader("data/points_of_interest.csv"))) {
            String line;
            csvReader.readLine(); // Skip the header line
            while ((line = csvReader.readLine()) != null) {
                String[] data = line.split(",");
                String cityName = data[0];
                String categoryName = data[1];
                String POIName = data[2];
                String POIDesc = data[3];
                double POIRating = Double.parseDouble(data[4]);

                City city = new City(cityName);
                Category category = new Category(categoryName);
                PointOfInterest poi = new PointOfInterest(POIName, POIDesc, POIRating);
                poi.setCity(city);
                poi.setCategory(category);

                pointsOfInterest.add(poi);
                categories.add(category);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        Sort sorter = new Sort(pointsOfInterest, categories);
        List<PointOfInterest> sortedPoints = sorter.compareByReviews();

        for (PointOfInterest poi : sortedPoints) {
            outputList.add("City: " + poi.getCity() + " Name: " + poi.getName() + " Description: " + poi.getDescr() + " Rating: " + poi.getRating());
        }

        return outputList;
    }
}
