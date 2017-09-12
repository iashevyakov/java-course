package ru.itis;

public class HorseBypass {

    private int[][] array;

    private int[] row, col;

    private int move;

    private int i, j, a, b, e;

    private int [] mov1 = new int[]{ -2, -1, 1, 2, 2, 1, -1, -2 };
    private int [] mov2 = new int[]{ 1, 2, 2, 1, -1, -2, -2, -1 };

    public HorseBypass(int i, int j) {
        this.i = i;
        this.j = j;
        array = new int[8][8];
        row = new int[64];
        col = new int[64];
    }

    public void horseByPass() {

        array[i][j] = 1;
        row[move] = i;
        col[move] = j;
        move++;


        for ( a = 0 ; a <= 7 ; a++ ) {
            if ( move >= 64 ) {
                showResult();
                return;
            }
        b = i + mov1[a];
        e = j + mov2[a];

        if ( b < 0 || b > 7 || e < 0 || e > 7 )
            continue;
        if ( array[b][e] == 1 )
            continue;
        i = b; j = e;
            horseByPass();
        }
        move-- ;
        array[row[move]][col[move]] = 0;
        move--;
        i = row[move]; j = col[move];
        move++;
    }

    private void showResult(){
        for (int i=0; i<64; i++){
            System.out.println(row[i]+" "+col[i]);
        }
    }

}
