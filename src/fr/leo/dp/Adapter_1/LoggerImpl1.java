package fr.leo.dp.Adapter_1;

public class LoggerImpl1 extends Logger {

	@Override
	public void trace(String str) {
		System.out.println("TRACE: " + str);
	}

	@Override
	public void debug(String str) {
		System.out.println("DEBUG: " + str);
	}

	@Override
	public void log(String str) {
		System.out.println("LOG " + str);
	}

}
