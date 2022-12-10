package fr.leo.dp.Singleton_3;

public class ThreadedTask extends Thread{

	private String taskName;

	public ThreadedTask(String taskName) {
		this.taskName = taskName;
	}
	
	@Override
	public void run() {
		Singleton singleton = Singleton.getInstence();
		singleton.traiter(taskName);	
	}

}
