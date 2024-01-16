import java.util.ArrayList;
public class Exo4B {
        public static void describe(ArrayList<String> names) {
            for (String name : names) {
                System.out.println(name + " : " + name.length());
            }
        }

        public static void main(String[] args) {
            ArrayList<String> names = new ArrayList<>();
            names.add("Jean");
            names.add("Ahmed");
            names.add("Lea");
            names.add("Blanca");
            describe(names);
        }
}