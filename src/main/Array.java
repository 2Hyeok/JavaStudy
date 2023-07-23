package main;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        
        // 조건문
//        int a = 10;
        
//        if (a >= 5) {
//            System.out.println("맞다");
//        }

//        if (a < 5) {
//            System.out.println("틀리다");
//        } else if(a > 5) {
//            System.out.println("맞다!!!");
//        }

//        if (a < 5) {
//            System.out.println("틀리다");
//        } else if(a > 11) {
//            System.out.println("틀려틀려");
//        } else {
//            System.out.println("맞다!!!");
//        }

//        if (a < 5 && a > 6) {
//            System.out.println("맞다!!!");
//        }
//
//        if (a < 5 || a > 6) {
//            System.out.println("맞다!!!");
//        }

//        switch (a - 1) {
//            case 5:
//                System.out.println("맞다!!!");
//                break;
//            case 9:
//                System.out.println("9다");
//                break;

//        }

        // 배열
//        int[] array;
//        array = new int[5];
//
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
//
//
//        int[] array1 = {1, 2, 3, 4, 5};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//
//        System.out.println(array); // 아이디값
//        System.out.println(array.length); // 배열의 크기

        // 2차원배열
//        int[][] array;
//        array = new int[3][5];
//
//        /**
//         * 1ㅁㅁㅁㅁ
//         * ㅁㅁㅁㅁㅁ
//         * ㅁㅁㅁㅁㅁ
//         */
//
//        array[0][0] = 1;
//
//        System.out.println(array[0][0]);
//
//        System.out.println(array.length);
//
//        System.out.println(array[0].length);


        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList(); // 타입을 지정 해주어야함

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(7);
//
//        System.out.println(arrayList.size()); // length가 아닌 size로 작성
//
//        System.out.println(arrayList.get(0)); // ~ 번째 값 가져옴
//        System.out.println(arrayList.get(1));
//        System.out.println(arrayList.get(2));
//
//        System.out.println(arrayList.get(arrayList.size() -1)); // 맨 마지막의 값을 가져옴 순서는 고정임


        // for문
//        for(int i = 0; i < arrayList.size(); i = i + 1) { // i++
//            // 실행문
//            System.out.println(i);
//            System.out.println(arrayList.get(i));
//        }

//        int[][] array = new int[5][5];
//
//        array[0][0] = 1;
//        array[0][1] = 2;
//        array[0][2] = 3;
//        array[0][3] = 4;
//        array[0][4] = 5;
//
//        for(int i = 0; i < array.length; i++) {
//            for(int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("=====================================");
//
//        for (int[] ints : array) {
//            for (int j = 0; j < ints.length; j++) {
//                System.out.print(ints[j] + " ");
//            }
//            System.out.println();
//        }

        // while문
        int a = 0;
        while (a < 5) {
            a++; // a = a + 1;
            System.out.println(a);

        }
    }
}
