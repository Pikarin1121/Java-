package inner_class_sample;

public class Outer {

	private static String greeting = "‚±‚ñ‚É‚¿‚Í";

	public static class Inner {

		public String hello() {
			return greeting;
		}
	}
}