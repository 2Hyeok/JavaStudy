package oop.inheritance;

public class InheritancePrint {

    public static void main(String[] args) {
        Child child = new Child(); // 생성자 호출 (부모 -> 자식)
        child.printName(); // printName은 부모 클래스에 있음, 상속을 받았기때문
                            // 메소드 호출(부모의 클래스 안에 있는 메소드도 출력 가능)
    }
}
