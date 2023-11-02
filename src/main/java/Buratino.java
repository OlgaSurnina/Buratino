public class Buratino {

    public static void main(String[] args) {

        byte minuendApples = 6;

        System.out.println("У Буратино было " + minuendApples + " яблок");

        byte subtrahendApples = 1;

        System.out.println("Барабас отобрал у Буратино " + subtrahendApples);

        int residualApples = (minuendApples - subtrahendApples);

        System.out.println("У Буратино осталось: " + residualApples + " яблок");
    }
}
