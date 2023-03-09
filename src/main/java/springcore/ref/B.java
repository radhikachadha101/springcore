package springcore.ref;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class B implements InitializingBean, DisposableBean{
	private int y;

	public B(int y) {
		super();
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("class b initailizing");
		
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("class B distroyed");
		
	}

}
