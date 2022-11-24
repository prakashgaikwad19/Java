package gfgCourse.multithreading.demo2;

public class MainClass {

	public static void main(String[] args) throws Exception {
		TestClass t = new TestClass();
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("MainClass" +" "+ i);
		//	Thread.sleep(3000);
		}
	}

}
