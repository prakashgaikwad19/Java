package gfgCourse.multithreading.demo1;

public class TestClass implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getClass().getName()+" "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
