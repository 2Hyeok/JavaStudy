package lamda;

import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class JavaFunction {

    public static void main(String[] args) {

        // int 값으로 매개변수를 받아 함수를 생성
        IntFunction intSum = (a) -> a + 10;
        System.out.println(intSum.apply(5));
        
        // 동일한 타입의 두 값을 받아 연산 처리, 구현이 복잡해지면 타입케스팅간 오류가 발생할 수 있음
        BinaryOperator binaryOperator = (a, b) -> a + " " + b;
        
        System.out.println(binaryOperator.apply(1, 2));
        System.out.println(binaryOperator.apply("첫번째", "두번째"));
        System.out.println(binaryOperator.apply(1, "두번째"));
    }
}
