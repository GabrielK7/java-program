public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i);
        }
         String finalString = stringBuilder.toString();
        System.out.println(finalString);
        System.out.println("Hi Git!");
    }
}