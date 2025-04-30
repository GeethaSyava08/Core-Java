package generic;

class SensitiveInformation 
{
	private String username = "contact@grotechminds.com";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private int otp = 1234;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	private String passowrd = "jhtr56";

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

}

public class ReturnKeyword {
	public static void main(String[] args) {
		SensitiveInformation s1 = new SensitiveInformation();
		s1.setUsername("manish@grotechminds.com");
		System.out.println(s1.getUsername());
		s1.setOtp(5454);
		System.out.println(s1.getOtp());
	}
}