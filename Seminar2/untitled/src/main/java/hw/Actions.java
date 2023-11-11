package hw;

public abstract class Actions {
    protected int maxDistenace;
    protected int maxHeight;
    public Actions() {
    }
    public abstract void run(Integer distance);
    public abstract void jump(Integer height);

}
