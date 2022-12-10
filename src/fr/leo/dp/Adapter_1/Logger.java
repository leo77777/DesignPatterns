package fr.leo.dp.Adapter_1;

public abstract class Logger {
	abstract public void trace(String str);

	abstract public void debug(String str);

	abstract public void log(String str);

	public static Logger create() {
		return new LoggerImpl1();
		// return new AdapteurLoggerImp1LoggerNouvelleVersion();
	}
}
