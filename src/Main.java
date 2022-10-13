import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

    private ArrayList<Integer> numbers = readFiles(new File("numbers.csv"));

    private int chunks;
    private int divider;
    ArrayList<String> readLines = new ArrayList<>();
    ArrayList<Integer> toInt = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        new Main();
    }

    public Main() throws IOException {

        Scanner s = new Scanner(System.in);
        System.out.print("Chunks:");
        chunks = Integer.parseInt(s.nextLine());
        System.out.print("Divider:");
        divider = Integer.parseInt(s.nextLine());

        ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(chunks);
    }

    public ArrayList<Integer> readFiles(File file) throws IOException {

        try{
            readLines = new ArrayList<>();
            Files.lines(file.toPath()).map(s -> s.split(":")).forEach(strings -> Collections.addAll(readLines, strings));
            toInt = (ArrayList<Integer>) readLines.stream().map(st -> {
                try{

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
