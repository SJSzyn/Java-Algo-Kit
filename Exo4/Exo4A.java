import java.util.ArrayList;
public class Exo4A {
    public static void describe(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name + " : " + name.length());
        }
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        describe(names);
    }

}