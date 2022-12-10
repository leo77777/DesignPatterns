package fr.leo.dp.Adapter_1;

public class AdapteurLoggerImp1LoggerNouvelleVersion extends Logger {

	LoggerNouvelleVersion lnv = new LoggerNouvelleVersion();

	@Override
	public void trace(String str) {
		lnv.trace(str);
	}

	@Override
	public void debug(String str) {
		lnv.debug(str);
	}

	@Override
	public void log(String str) {
		lnv.info(str);
	}

}
