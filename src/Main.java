import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<Sprinter> sprinters = new ArrayList<>();
        sprinters.add(new Sprinter("ito", 53, 10.00));
        sprinters.add(new Sprinter("kiryu", 27, 9.98));
        sprinters.add(new Sprinter("asashara", 50, 10.02));
        sprinters.add(new Sprinter("yamagata", 30, 9.95));

        System.out.println("＜9秒台の選手を大文字で表示＞");
        List<String> under10 = sprinters.stream()
                .filter(time -> time.getBestTime() < 10)
                .map(sprinter -> sprinter.getName().toUpperCase())
                .toList();
        System.out.println(under10);

        System.out.println("＜9秒台の人数＞");
        long count = sprinters.stream()
                .filter(sprinter -> sprinter.getBestTime() < 10)
                .count();
        System.out.println(count + "人");

        System.out.println("＜ベストタイムが速い順＞");
        sprinters.stream()
                .sorted(Comparator.comparing(Sprinter::getBestTime))
                .forEach(sprinter -> System.out.println(sprinter.getName() + "：" + sprinter.getBestTime()));

        System.out.println("＜年齢が高い順＞");
        sprinters.stream()
                .sorted(Comparator.comparing(Sprinter::getAge).reversed())
                .forEach(sprinter -> System.out.println(sprinter.getName()));
    }
}
