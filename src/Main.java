public class Main {
    public static void main(String[] args) {

        String [] colors = {"red", "yellow", "blue", "green", "brown", "white", "black", "purple"};

        String colores = "";

        for (String color : colors) {
            colores = colores + (color + " - ");
        }
        System.out.println(colores);
    }
}