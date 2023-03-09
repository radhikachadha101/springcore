package springcore.ref;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	private int x;
	
	private B obj;
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public A(int x, B obj) {
		super();
		this.x = x;
		this.obj = obj;
	}
	public B getObj() {
		return obj;
	}
	
	@Autowired
	public void setObj(B obj) {
		this.obj = obj;
	}
	
	public void init() {
		System.out.println("init-method");
	}
	
	public void destroy() {
		System.out.println("destroy method");
	}

}
