import java.util.Random;

public class Pencil implements Office {
    private int level = 2;
    private int id;

    public Pencil() {
        id = new Random().nextInt(100);
    }

    @Override
    public void write() {
        if (level >= 1) {
            System.out.println("Pencil writing..." + "Id :" + id);
            level--;
        } else
            System.out.println("Pencil end!!!"+ "Id :" + id);
    }

    @Override
    public int getLevel() {
        return level;
    }
}
