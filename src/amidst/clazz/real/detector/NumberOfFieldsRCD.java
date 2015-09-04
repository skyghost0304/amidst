package amidst.clazz.real.detector;

import amidst.clazz.real.RealClass;

public class NumberOfFieldsRCD extends RealClassDetector {
	private int count;

	public NumberOfFieldsRCD(int count) {
		this.count = count;
	}

	@Override
	public boolean detect(RealClass realClass) {
		return realClass.getNumberOfFields() == count;
	}
}
