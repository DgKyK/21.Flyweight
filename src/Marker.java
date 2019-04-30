import java.util.Random;

public class Marker implements Office {
    private int level = 4;
    private int id;

    public Marker() {
        id = new Random().nextInt(100);
    }

    @Override
    public void write() {
        if (level >= 1) {
            System.out.println("Marker drawing..." + "Id :" + id);
            level--;
        } else
            System.out.println("Marker end!!!" + "Id :" + id);
    }

    @Override
    public int getLevel() {
        return level;
    }
}
