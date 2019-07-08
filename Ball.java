package git;

public class Ball<T> { //Generic Class : 제네릭 클래스로 기본틀을 만듬
	private T num;
	public void set(T num) {
		this.num = num;
	}
	public T get() { //반환형 T
		return num;
	}
}
