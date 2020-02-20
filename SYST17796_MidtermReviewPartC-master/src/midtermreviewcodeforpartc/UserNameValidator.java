package midtermreviewcodeforpartc;
public class UserNameValidator extends User{
	public UserNameValidator(String givenName, String givenPass) {
		super(givenName, givenPass);
	}

	public void validateUser () {
		if(super.name != null) {
			System.out.println("User is Valid");
		}
		else
			System.out.println("User is not Valid");
	}
}
