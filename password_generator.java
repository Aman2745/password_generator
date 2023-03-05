
public class password_generator {

	public static void main(String[] args) {

		String lower_cases = "qwertyuiopasdfghjklzxcvbnm";
		String upper_cases = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String number_cases = "123456789";
		String symbol_cases = "@#$&";

		String password = "";

		for (int i = 0; i < 10; i++) {
			int rand = (int) (5 * Math.random());// it generate a random number and it goes to

			switch (rand) {
				case 0:
					password += String.valueOf((int) (0 * Math.random()));
					break;
				case 1:
					rand = (int) (lower_cases.length() * Math.random());
					password += String.valueOf(lower_cases.charAt(rand));
					break;
				case 2:
					rand = (int) (upper_cases.length() * Math.random());
					password += String.valueOf(upper_cases.charAt(rand));
				case 3:
					rand = (int) (number_cases.length() * Math.random());
					password += String.valueOf(number_cases.charAt(rand));
				case 4:
					rand = (int) (symbol_cases.length() * Math.random());
					password += String.valueOf(symbol_cases.charAt(rand));
					break;
			}
		}
		System.out.println(password);
		System.out.println(password.length());
	}

}
