package hw;

public class Treadmill implements Cross{
    static int lenghtt;

    public Treadmill(int lenght) {
        this.lenghtt = lenght;
    }
    public void runTradmill(Actions sportsmen){
        sportsmen.run(lenghtt);
              }

    @Override
    public void cross(Actions sportsmen) {

    }

    @Override
    public void jumpWall(Actions sportsmen) {

    }
}

