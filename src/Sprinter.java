public class Sprinter {
    private String name;
    private int age;
    private double bestTime;

    public Sprinter(String name, int age, double bestTime) {
        this.name = name;
        this.age = age;
        this.bestTime = bestTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getBestTime() {
        return bestTime;
    }
}
