package generic;

public class Man<J> { // 임이의 제네릭 타입

    private J job;

    public Man(J job) { // 생성자
        this.job = job;
    }

    // 메소드
    public J getJob() {
        return job;
    }

    public void setJob(J job) {
        this.job = job;
    }

}
