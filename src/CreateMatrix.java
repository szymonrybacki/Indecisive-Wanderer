import java.util.*;

public class CreateMatrix {
    public static ArrayList<ArrayList<String>> createMatrix(ArrayList<String> helper, ArrayList<ArrayList<Integer>> input) {
        ArrayList<ArrayList<String>> connections = new ArrayList<>();

        for (String point : helper) {
            ArrayList<String> connection = new ArrayList<>();
            if (!point.contains(".")) {
                for (ArrayList<Integer> line : input) {
                    int index = line.indexOf(Integer.valueOf(point));
                    if (index == 0) {
                        if (line.get(2) == 1) {
                            connection.add(Integer.toString(line.get(1)));
                        } else {
                            connection.add(point + "." + line.get(1) + ".1");
                        }
                    } else if (index == 1) {
                        if (line.get(2) == 1) {
                            connection.add(Integer.toString(line.get(0)));
                        } else {
                            connection.add(point + "." + line.get(0) + "." + (line.get(2) - 1));
                        }
                    }
                }
            } else {
                String[] parts = point.split("\\.");
                int crossroad1 = Integer.parseInt(parts[0]);
                int crossroad2 = Integer.parseInt(parts[1]);
                int position = Integer.parseInt(parts[2]);
                if (position > 1) {
                    connection.add(crossroad1 + "." + crossroad2 + "." + (position - 1));
                } else {
                    connection.add(Integer.toString(crossroad1));
                }
                if (position < getLength(input, crossroad1, crossroad2)) {
                    connection.add(crossroad1 + "." + crossroad2 + "." + (position + 1));
                } else {
                    connection.add(Integer.toString(crossroad2));
                }
            }
            connections.add(connection);
        }

        return connections;
    }

    private static int getLength(ArrayList<ArrayList<Integer>> input, int crossroad1, int crossroad2) {
        for (ArrayList<Integer> line : input) {
            if ((line.get(0) == crossroad1 && line.get(1) == crossroad2) || (line.get(0) == crossroad2 && line.get(1) == crossroad1)) {
                return line.get(2);
            }
        }
        return 0;
    }
}