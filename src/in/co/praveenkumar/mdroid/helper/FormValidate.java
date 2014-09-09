package in.co.praveenkumar.mdroid.helper;

public class FormValidate {

	/**
	 * Check the validity of the username field.
	 * 
	 * @param username
	 *            Username to check
	 * @return Error message (null if valid)
	 */
	public static String username(String username) {
		if (username.contentEquals(""))
			return "Username can't be empty";
		return null;
	}

	/**
	 * Check the validity of the password field.
	 * 
	 * @param password
	 *            password to check
	 * @return Error message (null if valid)
	 */
	public static String password(String password) {
		if (password.contentEquals(""))
			return "Password can't be empty";
		return null;
	}

	/**
	 * Check the validity of the token field.
	 * 
	 * @param token
	 *            token to check
	 * @return Error message (null if valid)
	 */
	public static String token(String token) {
		if (token.contentEquals(""))
			return "Token can't be empty";
		return null;
	}

	// UrlValidator urlValidator = new UrlValidator();
	// urlValidator.isValid("http://my favorite site!");

	/**
	 * Check the validity of the url field.
	 * 
	 * @param url
	 *            url to check
	 * @return Error message (null if valid)
	 */
	public static String url(String url) {
		if (url.contentEquals(""))
			return "url can't be empty";
		//UrlValidator uri;
		return null;
	}

}
