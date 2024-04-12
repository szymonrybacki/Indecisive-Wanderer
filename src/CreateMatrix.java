import java.util.ArrayList;

public class CreateMatrix {
    public static ArrayList<String> createInitMatrix (){
        int inputLines = 4;
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        ArrayList<Integer> line1 = new ArrayList<>();
        line1.add(1);
        line1.add(2);
        line1.add(4);
        ArrayList<Integer> line2 = new ArrayList<>();
        line2.add(2);
        line2.add(3);
        line2.add(4);
        ArrayList<Integer> line3 = new ArrayList<>();
        line3.add(3);
        line3.add(4);
        line3.add(4);
        ArrayList<Integer> line4 = new ArrayList<>();
        line4.add(4);
        line4.add(1);
        line4.add(4);
        ArrayList<Integer> line5 = new ArrayList<>();
        line5.add(1);
        line5.add(3);
        line5.add(6);
        input.add(line1);
        input.add(line2);
        input.add(line3);
        input.add(line4);
        input.add(line5);

        // Powyzej to testowe dane


        //Tworzenie macierzy pomocniczej
        ArrayList<String> helper = new ArrayList<>();

        for(int i = 1; i <= inputLines; i++){
            helper.add(Integer.toString(i));
        }
        for (ArrayList<Integer> row : input) {
            for(int i = 1; i <= row.get(2) - 1; i++){
                String point = Integer.toString(row.get(0)).concat(".").concat(Integer.toString(row.get(1)).concat(".")).concat(Integer.toString(i));
                helper.add(point);
            }
        }

        for (String point : helper) {
            System.out.print(point + " ");
        }

        //Tworzenie macierzy polaczen
        ArrayList<Object> connections = new ArrayList<>();
        int index;
        for (String point : helper) {
            connections.add(new ArrayList<String>());
            if(!point.contains(".")){
                for (ArrayList<Integer> line : input) {
                    index = line.indexOf(Integer.valueOf(point));
                    if(index == 0){
                    }else if(index == 1){

                    }
                }
            }
        }

        return helper;
    }
}