package git;
import java.util.Random;
public class RandomNumber {
	public static void randomAdder(Ball<? super Integer> b1, Ball<? extends Integer> b2, Ball<? extends Integer> b3) {
		b1.set(b2.get() + b3.get()); //b2와 b3에 난수값을 출력해 b1에 저장한다
	}
	
	public static void main(String[] args) { //1부터 1000까지의 숫자중 랜덤으로 2개를 뽑아 더하는 연산구현
		Random r = new Random(); //현재시간값을 씨드로 받음
		int[] a = new int[2];
		int r1, r2;
		for(int i = 0; i < 2; i++) {
			a[i] = (r.nextInt(1000) + 1); //임의의 두개값을 뽑는다 (1~1000의 값)
		}
		r1 = a[0];
		r2 = a[1]; //변수에 랜덤값 저장
		
		Ball<Integer> sum = new Ball<>();
		sum.set(0);
		Ball<Integer> n1 = new Ball<>();
		n1.set(r1); //랜덤값1 저장
		Ball<Integer> n2 = new Ball<>();
		n2.set(r2); //랜덤값2 저장
		
		randomAdder(sum, n1, n2); //임의의 값 2개를 합연산 함수 실행
		System.out.println(n1.get()); //난수값1 출력
		System.out.println(n2.get()); //난수값2 출력
		System.out.println(sum.get()); //더한값 출력
		
	}
}
