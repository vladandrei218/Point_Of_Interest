import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    private final List<PointOfInterest> pointsOfInterestList;
    private final List<Category> categoriesList;

    public Sort(List<PointOfInterest> pointsOfInterest, List<Category> categories) {
        this.pointsOfInterestList = new ArrayList<>(pointsOfInterest);
        this.categoriesList = new ArrayList<>(categories);
    }
    public List<PointOfInterest> compareByReviews() {
        List<PointOfInterest> sortedList = new ArrayList<>(pointsOfInterestList);
        sortedList.sort(PointOfInterest::compareTo);
        return sortedList;
    }

    public List<Category> compareByCategoryName() {
        List<Category> sortedList = new ArrayList<>(categoriesList);
        sortedList.sort(Category::compareTo);
        return sortedList;
    }
}
