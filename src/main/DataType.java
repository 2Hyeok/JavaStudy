package main;

public class DataType {
    public static void main(String[] args) {

        // int double char boolean
//        int a;
//        double b;
//        char c;
//        boolean d;
//
//        System.out.println(a); // 아직 초기화가 되어있지 않아 오류발생

//        // 데이터타입 이름 = 값;
//        int a = 0;
//        double b;
//        char c;
//        boolean d;
//
//
//        // 초기화 이련식으로도 사용가능
//        b = 1.1; // 숫자를 넣을때는 그냥입력
//        c = 'a'; // 문자를 넣을경우 따옴표를 사용, String -> 문자열 사용가능 이경우는 "" 사용
//        d = true;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        b = a; // b의 값을 a에 넣어라 이것이 묵시적 변환
//
//        System.out.println(b);
//
//        b = 1.1;
//        // a = b; // 오류 발생 필요한 타입은 int 타입 뒤에 오는값도 int값이 와야함 제공하는 타입은 double
//        a = (int)b; // 명시적 형변환
//
//        System.out.println(a);

        // 산술 연산자
//        int a = 1;
//        int b = 3;
//        System.out.println(a+b);
//
//        int c = a + b; // a+b의 결과 값이 나옴
//        System.out.println(c);
//
//        System.out.println(a-b);
//
//        c = a-b;
//        System.out.println(c);
//
//        int cc = a * b; // a+b의 결과 값이 나옴
//        System.out.println(cc);
//
//        System.out.println(a/b);
//        System.out.println(a%b);
//
//        double d = 6.6;
//        double e = 5.5;
//        System.out.println(d/e);
//        System.out.println(d%e);


        // 비교 연산자
//        int a = 1;
//        int b = 2;
//        int c = 1;
//
//        System.out.println(a>b);
//        System.out.println(a<b);
//        System.out.println(a<c);
//        System.out.println("============================");
//        System.out.println(a>=b);
//        System.out.println(a<=b);
//        System.out.println("============================");
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(a!=b);
//        System.out.println(a!=c);


        // 논리 연산자
        boolean atrue = true;
        boolean bfalse = false;

        System.out.println(atrue && atrue); // 논리곱
        System.out.println(atrue && bfalse);

        System.out.println(atrue || atrue); // 논리 합
        System.out.println(atrue || bfalse);

        System.out.println(atrue ^ atrue); // 베타적 논리
        System.out.println(atrue ^ bfalse);

        System.out.println(!atrue); // 논리 부정
        System.out.println(!bfalse);


    }
}
