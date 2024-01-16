import java.util.ArrayList;
public class Exo4C {
    public static void describeNamesLength(ArrayList<String> names) {
        for (String name : names) {
            if (name.length() >= 4) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jean");
        names.add("Ahmed");
        names.add("Lea");
        names.add("Blanca");
        describeNamesLength(names);
    }
}
