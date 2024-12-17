package co.rays.exception;

public class LoginService {

	public void login(String username, String password) throws LoginException {

		String correctUsername = "admin";
		String correctPassword = "password123";

		if (!username.equals(correctUsername)) {
			throw new LoginException("Invailid LoginId and password1");
		}

		if (!password.equals(correctPassword)) {
			throw new LoginException("Invailid LoginId and password2");
		}

		System.out.println("Login Successfully!");
	}

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		try {
			// Attempt to login with given credentials
			loginService.login("adminn", "password123");

		} catch (LoginException e) {
			// Handle the custom exception
			System.out.println("Login failed");
			System.out.println(e);

		}
	}
}