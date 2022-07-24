public class Praktikum {
	public static void main(String[] args) {
		int j = 9;
		Converter converter = new Converter();
		double процент;
		for (int i = 1; i < j; i++) {
			процент = 1 + ((Math.random() - 0.5) / 100);
			converter.руб *= процент;
			System.out.printf("Курс %d = %.2f\n", i, converter.руб);
		}
	}
}
