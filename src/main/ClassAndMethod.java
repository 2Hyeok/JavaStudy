package main;

public class ClassAndMethod {

    private String name; // name 이라는 필드 생성
    public ClassAndMethod() { // Alt + Insert 키 누른 후 Constructor
        name = "홍길동"; // name을 초기화
    }

    public ClassAndMethod(String a) {
        name = a;
    }

    // get 메소드
    public String getName() { // 메소드, 이름을 가져옴
        return name;
    }

    // set 메소드
    public void setName(String a){ // 이름을 설정함
        name = a;
    }

    
    public static void main(String[] args) {
        ClassAndMethod a = new ClassAndMethod(); // 객체를 초기화. name="홍길동"
        String name = a.name; // 좋지 않은 방법
        String name2 = a.getName(); // 옳은 방법

        System.out.println(name);
        System.out.println(name2);

        ClassAndMethod b = new ClassAndMethod();
        b.setName("김보라");
        String bName = b.getName();
        System.out.println(b.name);

        System.out.println(name);
        System.out.println(name2);
        
        ClassAndMethod c = new ClassAndMethod("김땡땡");
        System.out.println(c.getName());
    }

}
