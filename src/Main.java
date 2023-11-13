import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Input input = new Input();
//        input.run();
        Output output = new Output();
        List<String> result = output.run_city();
        for (String outputLine : result) {
            System.out.println(outputLine);
        }
    }
}
