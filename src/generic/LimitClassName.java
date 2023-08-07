package generic;

public class LimitClassName <E extends Number> { // extends Number 클래스를 상속받음, Number클래스의 하위클래스들만 제네릭 클래스로 사용을 제한을둠

    private E element;

    public E get() {
        return element;
    }

    public void set(E element) {
        this.element = element;
    }
}
