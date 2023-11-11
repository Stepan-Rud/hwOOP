package hw;

public class Cat extends Actions {
//    private int maxDistenace;
//    private int maxHeight;

    public Cat(int maxDistenace, int maxHeight) {
        this.maxDistenace = maxDistenace;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(Integer distance) {
        System.out.println("Кот побежал");
    }

    @Override
    public void jump(Integer height) {
        System.out.println("Кот прыгнул");
    }

    public int getMaxDistenace() {
        return maxDistenace;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
