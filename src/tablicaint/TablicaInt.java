package tablicaint;

/*
Przykładowe zadanie na egzamin:
Mając daną tablicę String, oraz tablicę int [][] 
Stwórz nową tablicę int [][] do której wpiszesz długość łańcucha 
w kolenych wierszach tablicy pierwsze, wpisz średnią wartość przekazywanej
tablicy drugim parametrem do nowej tablicy. 
Przepisz na kolejnych pozycjach wierszy zawartość talblicy danej drugim 
parametrem. 
*/

public class TablicaInt {

    public static int[][] foo(String[] tabA, int[][] tabB) {
        int[][] tabZw = new int[tabB.length][tabB.length];
        int długośćS = 0;
        int ŚrWartość = 0;
        for (int lw = 0; lw < tabB.length; lw++) {
            długośćS = tabA[lw].length();

            for (int lk = 0; lk < tabB[lw].length; lk++) {

                ŚrWartość += tabB[lw][lk] / tabB[lw].length;
                tabZw[lw][0] = długośćS;
                tabZw[lw][1] = ŚrWartość;
                tabZw[lw][lk + 2] = tabB[lw][lk];
            }
            ŚrWartość = 0;
        }
        return tabZw;
    }

    public static void main(String[] args) {

        String[] tablica = {"ala", "ma", "kota", "lub"};
        int[][] tablicaInt = {{10, 12},
        {17, 31},
        {38, 40},
        {16, 18}};
        foo(tablica, tablicaInt);
        tablicaInt = foo(tablica, tablicaInt);
        for (int i = 0; i < tablicaInt.length; i++) {
            for (int j = 0; j < tablicaInt[i].length; j++) {
                System.out.print(tablicaInt[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
