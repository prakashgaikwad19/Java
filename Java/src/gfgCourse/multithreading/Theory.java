package gfgCourse.multithreading;

public class Theory {
	//multitasking - creates new process eg. listen music and browse
	//multithreading - creates new thread within process 
	//				   {thead also called lightweight process}
	//				   all threds within same process have same address space
	//				   in java all thread are managed by jvm
	// advantages mt - 1.parallelism- multiple threads runs on diff processor or on single 
	//					  single processor
	//					2.responsive- u can browse while downloading ie. process is responsive
	//					3.better resource utilization- as in same address space ,less memory used
	//					  & less processing time while creating. Also no need to involve OS
	// 					  to allocate resource
	
	// disadvantages mt - 1.diffcult to write ,test and debug code
	//					  2.lead to deadlock and race condition
	// race condition - two or more threads can access and change shared data simultaneoulsy
	//					we can avoid race condition by using locks around shared data
	//
}
