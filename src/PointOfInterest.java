import java.util.ArrayList;
import java.util.List;

public class PointOfInterest implements  Searchable, Comparable<PointOfInterest>{
    private String name,description;
    private double rating;
    private City city;
    private Category category;
    public PointOfInterest(String id, String description, double rating){
        this.name=id;
        this.description=description;
        this.rating=rating;
    }
    public void setCity(City city){
        this.city=city;
    }
    public void setCategory(Category category){
        this.category=category;
    }
    public String getName() {
        return name;
    }
    public String getDescr(){
        return description;
    }
    public City getCity() {
        return city;
    }
    public double getRating() {
        return rating;
    }
    public Category getCategory() {
        return category;
    }
    @Override
    public List<PointOfInterest> search(String keyword) {
        List<PointOfInterest> searchResults = new ArrayList<>();
        if (description != null && description.contains(keyword)) {
            searchResults.add(this);
        }
        if (name != null && name.contains(keyword)) {
            searchResults.add(this);
        }
        return searchResults;
    }

    @Override
    public int compareTo(PointOfInterest p) {
        return Double.compare(this.rating, p.rating);
    }
}
