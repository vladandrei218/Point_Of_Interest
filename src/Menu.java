import java.util.List;
import java.util.Scanner;

public class Menu {
    Input input = new Input();
    Output output = new Output();

    public void run() {
        System.out.println("Welcome to the City Explorer!");

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Add a point of interest");
            System.out.println("2. Display points of interest");
            System.out.println("3. Display sorted points of interest");
            System.out.println("4. Search points of interest");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    input.run();
                    System.out.println("Press 9 to go back");
                    int gbCase1 = scanner.nextInt();
                    if (gbCase1 == 9) {
                        break;
                    }
                    break;
                case 2:
                    List<String> result = output.run();
                    for (String outputLine : result) {
                        System.out.println(outputLine);
                    }
                    System.out.println("Press 9 to go back");
                    int gbCase2 = scanner.nextInt();
                    if (gbCase2 == 9) {
                        break;
                    }
                case 3:
                    while (true) {
                        System.out.println("Please select an option:");
                        System.out.println("1. Sort by name");
                        System.out.println("2. Sort by category");
                        System.out.println("3. Sort by rating");
                        System.out.println("4. Sort by city");
                        System.out.println("9. Go back");
                        System.out.println("0. Exit");
                        int gbCase7 = 0;
                        Scanner scanner_ins = new Scanner(System.in);
                        int opt = scanner_ins.nextInt();
                        switch (opt) {
                            case 1:
                                List<String> resultName = output.run_name();
                                for (String outputLine : resultName) {
                                    System.out.println(outputLine);
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase3 = scanner_ins.nextInt();
                                if (gbCase3 == 9) {
                                    break;
                                }
                            case 2:
                                List<String> resultCategory = output.run_category();
                                for (String outputLine : resultCategory) {
                                    System.out.println(outputLine);
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase4 = scanner_ins.nextInt();
                                if (gbCase4 == 9) {
                                    break;
                                }
                            case 3:
                                List<String> resultRating = output.run_rating();
                                for (String outputLine : resultRating) {
                                    System.out.println(outputLine);
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase5 = scanner_ins.nextInt();
                                if (gbCase5 == 9) {
                                    break;
                                }
                            case 4:
                                List<String> resultCity = output.run_city();
                                for (String outputLine : resultCity) {
                                    System.out.println(outputLine);
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase6 = scanner_ins.nextInt();
                                if (gbCase6 == 9) {
                                    break;
                                }
                            case 9:
                                gbCase7 = 9;
                                break;
                            case 0:
                                System.out.println("Goodbye!");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                        if(gbCase7 == 9){
                            break;
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("Please select an option:");
                        System.out.println("1. Search by city");
                        System.out.println("2. Search by category");
                        System.out.println("3. Search by name");
                        System.out.println("4. Search by rating");
                        System.out.println("9. Go back");
                        System.out.println("0. Exit");
                        int gbCase7 = 0;
                        Scanner scanner_sea = new Scanner(System.in);
                        int opt = scanner_sea.nextInt();
                        switch (opt) {
                            case 3:
                                System.out.println("Enter the point of interest name you want to search for: ");
                                List<String> searchName = output.search_name();
                                for (String outputLine : searchName) {
                                    System.out.println(outputLine);
                                }
                                if(searchName.isEmpty()){
                                    System.out.println("No results found");
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase3 = scanner_sea.nextInt();
                                if (gbCase3 == 9) {
                                    break;
                                }
                            case 2:
                                System.out.println("Enter the category you want to search for: ");
                                List<String> searchCategory = output.search_category();
                                for (String outputLine : searchCategory) {
                                    System.out.println(outputLine);
                                }
                                if(searchCategory.isEmpty()){
                                    System.out.println("No results found");
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase4 = scanner_sea.nextInt();
                                if (gbCase4 == 9) {
                                    break;
                                }
                            case 4:
                                System.out.println("Enter the rating that you want to search higher than: ");
                                List<String> searchRating = output.search_rating();
                                for (String outputLine : searchRating) {
                                    System.out.println(outputLine);
                                }
                                if(searchRating.isEmpty()){
                                    System.out.println("No results found");
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase5 = scanner_sea.nextInt();
                                if (gbCase5 == 9) {
                                    break;
                                }
                            case 1:
                                System.out.println("Enter the city you want to search for: ");
                                List<String> searchCity = output.search_city();
                                for (String outputLine : searchCity) {
                                    System.out.println(outputLine);
                                }
                                if(searchCity.isEmpty()){
                                    System.out.println("No results found");
                                }
                                System.out.println("Press 9 to go back");
                                int gbCase6 = scanner_sea.nextInt();
                                if (gbCase6 == 9) {
                                    break;
                                }
                            case 9:
                                gbCase7 = 9;
                                break;
                            case 0:
                                System.out.println("Goodbye!");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                        if(gbCase7 == 9){
                            break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
