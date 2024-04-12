import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InputNumbers inputNumbers = new InputNumbers();
        inputNumbers.setNumbers();
        ArrayList<ArrayList<Integer>> alejki = inputNumbers.setAlejki();
        inputNumbers.setReszta();

        ArrayList<String> helper = new ArrayList<>();
        for (ArrayList<Integer> alejka : alejki) {
            int crossroad1 = alejka.get(0);
            int crossroad2 = alejka.get(1);
            int length = alejka.get(2);
            helper.add(Integer.toString(crossroad1));
            for (int i = 1; i < length; i++) {
                helper.add(crossroad1 + "." + crossroad2 + "." + i);
            }
            helper.add(Integer.toString(crossroad2));
        }
        ArrayList<ArrayList<String>> matrix = CreateMatrix.createMatrix(helper, alejki);

        // Wypisanie macierzy
        for (ArrayList<String> row : matrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}