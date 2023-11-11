package hw;

public class Wall implements Cross{
    static int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public void cross(Actions sportsmen) {

    }

    @Override
    public void jumpWall(Actions sportsmen){
        sportsmen.jump(height);
    }
}
