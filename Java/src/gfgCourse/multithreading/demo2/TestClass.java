package gfgCourse.multithreading.demo2;

public class TestClass extends Thread{
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(getClass().getName() +""+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
