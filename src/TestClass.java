import java.util.LinkedList;
import java.util.List;

public class TestClass {
    public final static int times = 5;
    public static void main(String[] args) {
        OfficeFactory factory = new OfficeFactory();
        List<Office> elements = new LinkedList<>();
        elements.add(factory.getOffice("Pencil"));
        elements.add(factory.getOffice("Marker"));
        elements.add(factory.getOffice("Pencil"));
        elements.add(factory.getOffice("Marker"));
        for (Office k : elements) {
            k.write();
        }
        System.out.println("-----------------");
        elements.add(factory.getOffice("Pencil"));
        for (Office k : elements) {
            k.write();
        }
        System.out.println("-----------------");
        for (Office k : elements) {
            k.write();
        }
        System.out.println("-----------------");
        elements.add(factory.getOffice("Marker"));
        elements.add(factory.getOffice("Pencil"));
        for (Office k : elements) {
            k.write();
        }
    }
}
