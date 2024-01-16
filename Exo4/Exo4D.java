import java.util.ArrayList;

public class Exo4D {
    public static void toUpperCase(ArrayList<String> names) {
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");
        toUpperCase(names);
    }
}