package lecture;

public class Sum {
    public static void main(String[] args) {

        // 부터 10까지의 합 출력하기
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        int sum = 0;
        for (int z = 0; z < 10; z++) {
            if(z <= 8) {
                System.out.print(array[z] + " + ");
            } else {
                System.out.print(array[z]);
            }
            sum = sum + array[z];
        }
//        System.out.println(" = " + (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9]));
        System.out.println(" = " + sum);


        // 직접 예제
        int sum1 = 0;
        for(int i = 0; i <= 10; i++) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1);

    }
}
