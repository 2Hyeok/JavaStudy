package lecture;

public class Gugudan {
    public static void main(String[] args) {
        // 구구단 출력하기
        /**
         * 1 x 1 = 1  1 x 2 = 2 ...
         * ..
         * ...
         * .............. 9 x 9 = 81
         */

        int x = 1;
        for(int zz = 0; zz < 9; zz++) {
            int y = 1;
            for(int z = 0; z < 9; z++) {
                System.out.print(x + " x " + y + " = " + (x*y) + "\t");
                // y += 1;
                // y = y+1;
                y++;
            }
            x++;
            System.out.println();
        }


    }
}
