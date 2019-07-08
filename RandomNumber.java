package git;
import java.util.Random;
public class RandomNumber {
	public static void randomAdder(Ball<? super Integer> b1, Ball<? extends Integer> b2, Ball<? extends Integer> b3) {
		b1.set(b2.get() + b3.get()); //b2�� b3�� �������� ����� b1�� �����Ѵ�
	}
	
	public static void main(String[] args) { //1���� 1000������ ������ �������� 2���� �̾� ���ϴ� ���걸��
		Random r = new Random(); //����ð����� ����� ����
		int[] a = new int[2];
		int r1, r2;
		for(int i = 0; i < 2; i++) {
			a[i] = (r.nextInt(1000) + 1); //������ �ΰ����� �̴´� (1~1000�� ��)
		}
		r1 = a[0];
		r2 = a[1]; //������ ������ ����
		
		Ball<Integer> sum = new Ball<>();
		sum.set(0);
		Ball<Integer> n1 = new Ball<>();
		n1.set(r1); //������1 ����
		Ball<Integer> n2 = new Ball<>();
		n2.set(r2); //������2 ����
		
		randomAdder(sum, n1, n2); //������ �� 2���� �տ��� �Լ� ����
		System.out.println(n1.get()); //������1 ���
		System.out.println(n2.get()); //������2 ���
		System.out.println(sum.get()); //���Ѱ� ���
		
	}
}
