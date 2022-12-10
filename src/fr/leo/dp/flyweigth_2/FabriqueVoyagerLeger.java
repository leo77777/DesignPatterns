package fr.leo.dp.flyweigth_2;

import java.util.HashMap;
import java.util.Map;

public class FabriqueVoyagerLeger {
	
	private Map<String, VoyagerLeger> voyagerLegerPartages = new HashMap <String, VoyagerLeger>();
	
	public FabriqueVoyagerLeger() {
		voyagerLegerPartages.put("je", new VoyagerLegerConcret("je"));
		voyagerLegerPartages.put("suis", new VoyagerLegerConcret("suis"));
		voyagerLegerPartages.put("voyager", new VoyagerLegerConcret("voyager"));
		voyagerLegerPartages.put("leger", new VoyagerLegerConcret("leger"));
	}

	public VoyagerLeger getVoyagerLeger(String val) {
		VoyagerLeger vl = voyagerLegerPartages.get(val);
		if (vl == null) {
			vl = new VoyagerLegerConcret(val);
			voyagerLegerPartages.put(val, vl);
		}
		return vl;
	}

	public VoyagerLeger getVoyagerLeger(String val1, String val2) {
		return new VoyagerLegerNonPartager(val1, val2);
	}

}
