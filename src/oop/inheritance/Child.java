package oop.inheritance;

public class Child extends Parent{

    public Child() {
        System.out.println("Child Constructor");
    }

    @Override // 자식클래스가 부모클래스의 메소드를 수정하기 위해 사용, 부모 클래스에 있는 메소드만 사용가능
              // 그렇지 않을경우 추가로 생성됨
    public void printName() {
//        super.printName();
        System.out.println("Child Print"); // 바뀌어서 출력됨
        super.printName();
    }
}
