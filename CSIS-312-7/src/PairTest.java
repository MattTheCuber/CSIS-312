public class PairTest {
    public static void main(String[] args) {
        System.out.println("Matthew Vine – Assignment #7\n");

        // Create the pairs
        Pair<Integer, String> p1 = new Pair(1, "str2");
        Pair<String, Integer> p2 = new Pair("str1", 2);

        // Print the pairs using the getters
        System.out.println("Base pairs:");
        System.out.printf("p1: %d, %s%n", p1.getF(), p1.getS());
        System.out.printf("p2: %s, %d%n%n", p2.getF(), p2.getS());

        // Change the pairs using the setters
        p1.setF(3);
        p1.setS("str4");
        p2.set("str3", 4);

        // Print the new pairs using the getters
        System.out.println("Changed the pairs:");
        System.out.printf("p1: %s, %s%n", p1.getF(), p1.getS());
        System.out.printf("p2: %s, %d%n", p2.getF(), p2.getS());
    }
}
