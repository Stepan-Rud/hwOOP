package hw;

public class Robott extends Actions {
//    private int maxDistenace;
//    private int maxHeight;

    public Robott(int maxDistenace, int maxHeight) {
        this.maxDistenace = maxDistenace;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(Integer distance) {
        System.out.println("Робот побежал");
    }

    @Override
    public void jump(Integer height) {
        System.out.println("Робот прыгнул");
    }

    public int getMaxDistenace() {
        return maxDistenace;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
