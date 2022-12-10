package fr.leo.dp.Singleton_2;

public class Satellite {
	// private static Satellite instance;

	private Satellite() {
	}

	public static Satellite getSatellite() {
		return SatelliteHelper.innerInstance;
	}

	private static class SatelliteHelper {
		private static final Satellite innerInstance = new Satellite();
	}
	
}
