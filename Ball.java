package git;

public class Ball<T> { //Generic Class : ���׸� Ŭ������ �⺻Ʋ�� ����
	private T num;
	public void set(T num) {
		this.num = num;
	}
	public T get() { //��ȯ�� T
		return num;
	}
}
