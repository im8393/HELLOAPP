public class helloapp {
   public static void main(String[] args) {
        if (args.length == 0) {
           System.out.println("Hello, World!");
        } else {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name: args) {
            nameBuilder.append(name).append(", ");
        }
        String namesList = nameBuilder.toString();
        if (namesList.length() > 0) {
            namesList = namesList.substring(0, namesList.length() - 2);
        }
        System.out.println("Hello," + namesList);
    }
}
}