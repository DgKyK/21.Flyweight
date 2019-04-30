import java.util.HashMap;

public class OfficeFactory  {
    private HashMap<String, Office> elements = new HashMap<>();

    public Office getOffice(String nameOfOffice) {
        Office office = elements.get(nameOfOffice);
        if (office == null || office.getLevel() == 0) {
            switch (nameOfOffice) {
                case "Marker" :
                    office = new Marker();
                    break;
                case "Pencil" :
                    office = new Pencil();
                    break;
            }
            elements.put(nameOfOffice, office);
        }
        return office;
    }
}
