package deneme06;

import java.util.Random;

public class matris {

    static int[][] matrisUret(int r, int c){
        Random rast = new Random();
        int[][] m = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                m[i][j] = rast.nextInt(5);
            }
        }
        return m;
    };
}
