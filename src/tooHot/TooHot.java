package tooHot;

public class TooHot {
	public static void main(String[] args) {
		System.out.println(isReasonableTemperature(100, true));
		System.out.println(isReasonableTemperature(100, false));
	}
	
	public static boolean isReasonableTemperature(int temperature, boolean isSummer) {
		if (isSummer) {
			if (temperature >= 60 && temperature <= 100) {
				return true;
			} else {
				return false;
			}
		}
		else {
			if (temperature >= 60 && temperature <= 90) {
				return true;
			} else {
				return false;
			}
		}
		
	}
}
