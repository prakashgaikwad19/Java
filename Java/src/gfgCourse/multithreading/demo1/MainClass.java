package gfgCourse.multithreading.demo1;

public class MainClass {

	public static void main(String[] args) throws Exception {
		TestClass t1= new TestClass();
		Thread t = new Thread(t1);
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("Main class"+" "+i);
		//	Thread.sleep(3000);
		}
	}

}
