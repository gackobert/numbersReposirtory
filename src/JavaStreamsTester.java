import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class JavaStreamsTester {

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> s = new ArrayList<>();
    private static List <Integer> n = new ArrayList<>();


    public static void main(String[] args) throws IOException {

        for (int i = 0;i < 5;i++){
            String item = scanner.nextLine();
            s.add(item);
        }

        for (int i = 0;i < 5;i++){
            int item = scanner.nextInt();
            n.add(item);
        }

        System.out.println(JavaStreamsTester.getCountEmptyString(s));
        System.out.println(JavaStreamsTester.getCountLength3(s));
        System.out.println(JavaStreamsTester.deleteEmptyStrings(s));
        System.out.println(JavaStreamsTester.getMergedString(s, ": "));
        System.out.println(JavaStreamsTester.getCountEmptyString(s));
        System.out.println(JavaStreamsTester.getSquares(n));
        System.out.println(JavaStreamsTester.getMax(n));
        System.out.println(JavaStreamsTester.getMin(n));
        System.out.println(JavaStreamsTester.getAverage(n));
        System.out.println(JavaStreamsTester.getSum(n));





    }

    private static int getCountEmptyString(List<String> strings){
        return strings.stream().filter(String::isEmpty).collect(Collectors.toList()).size();
    }

    private static int getCountLength3(List<String> strings){
        return strings.stream().filter(s -> s.length() == 3).collect(Collectors.toList()).size();
    }

    private static List<String> deleteEmptyStrings(List<String> strings){
        return strings.stream().filter(s -> s.length() > 0).collect(Collectors.toList());
    }

    private static String getMergedString(List<String> strings, String separator){
        return String.join(separator, strings.stream().toArray(String[]::new));
    }

    private static List<Integer> getSquares(List<Integer> numbers){
        return numbers.stream().map(integer -> integer*integer).collect(Collectors.toList());
    }


    private static int getMax(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElse(0);
    }

    private static int getMin(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo).orElse(0);
    }

    private static int getSum(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::new).sum();
    }

    private static int getAverage(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::new).sum() / numbers.size();
    }
}
