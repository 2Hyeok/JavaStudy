package lamda;


// @FunctionalInterface 구현해야할 추상메소드가 한개인 인터페이스
@FunctionalInterface
interface Print{
    void print(int a, int b);
}

class Test {
    public void testMethod(Print print) {
        print.print(1, 2);
        System.out.println("콘솔 출력 실행문");
    }
}
public class LamdaExample1 {
    public static void main(String[] args) {
        Test noLamda = new Test();
        
        // 람다를 사용하지 않음
        noLamda.testMethod(new Print() {
            @Override
            public void print(int a ,int b) {
                System.out.println("a 와 b의 합은 " + (a + b));
                System.out.println("a 와 b의 차는 " + (a - b));
            }
        });

        // 람다를 사용
        Test lamdaTest = new Test();
        lamdaTest.testMethod((a, b) -> { // 매개변수 a b 대입
            System.out.println("a 와 b의 합은 " + (a + b));
            System.out.println("a 와 b의 차는 " + (a - b));
        });
    }
}
