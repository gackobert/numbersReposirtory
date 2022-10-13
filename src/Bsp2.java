import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Bsp2 {
    Scanner scanner = new Scanner(System.in);
    ThreadPoolExecutor threadPool;

    public static void main(String[] args) {
        new Bsp2();
    }

    public Bsp2() {
        System.out.println("n> ");
        int number = scanner.nextInt();
        threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(number/100);

        try{


        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("");
        }
    }

}
