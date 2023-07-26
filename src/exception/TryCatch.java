package exception;

import java.util.Scanner;

public class TryCatch {
    public TryCatch() {

        // 콘솔창에 입력할 수있도록
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        try {
            int changedInput = Integer.parseInt(input);

            System.out.println("숫자 : " + changedInput);
        } catch (NumberFormatException e) {
            System.out.println("변경되지 못한 값 : " + input);
        } finally {
            System.out.println("finally 구문");
        }
    }
    public static void main(String[] args) {
        new TryCatch();
    }
}
