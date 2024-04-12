import java.util.ArrayList;
import java.util.Scanner;

public class InputNumbers {
    private int n; //liczba skrzyżowań
    private int m; //liczba alejek
    private ArrayList<ArrayList<Integer>> alejki = new ArrayList<>();
    private ArrayList<Integer> osk = new ArrayList<>();
    private ArrayList<Integer> wyjscie = new ArrayList<>();
    private ArrayList<Integer> start = new ArrayList<>();
    private ArrayList<Integer> smietniki = new ArrayList<>();


    public InputNumbers(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public InputNumbers() {}

    public void setNumbers() {
        Scanner scanner = new Scanner(System.in);
        this.n = scanner.nextInt();
        this.m = scanner.nextInt();
        System.out.println("n: " + n + " m: " + m);
    }

    public ArrayList<ArrayList<Integer>> setAlejki() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<this.m; i++) {
            ArrayList<Integer> alejka = new ArrayList<>();
            for (int j=0; j<3; j++) {
                alejka.add(scanner.nextInt());
            }
            this.alejki.add(alejka);
        }
        return alejki;
    }

    public void setReszta() {
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<2; i++) {
            osk.add(scanner.nextInt());
        }

        for (int i=0; i<2; i++) {
            wyjscie.add(scanner.nextInt());
        }

        for (int i=0; i<2; i++) {
            start.add(scanner.nextInt());
        }

        int iloscSmietnikow = scanner.nextInt();
        for (int i=0; i<iloscSmietnikow; i++) {
            smietniki.add(scanner.nextInt());
        }
    }

    public void printAlejki() {
        alejki.forEach(System.out::println);
    }

    public ArrayList<ArrayList<Integer>> getAlejki() {
        return alejki;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public ArrayList<Integer> getOsk() {
        return osk;
    }

    public ArrayList<Integer> getWyjscie() {
        return wyjscie;
    }

    public ArrayList<Integer> getStart() {
        return start;
    }

    public ArrayList<Integer> getSmietniki() {
        return smietniki;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }
}