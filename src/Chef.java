
public class Chef extends DanbamInformation {
	private int Gaji;
	private String UserName;
	
	public int getGaji() {
		return Gaji;
	}

	public void setGaji(int gaji) {
		this.Gaji = gaji;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public Chef(String Name, String userName, String gender, Integer Age, Integer Gaji) {
		super(Name,gender,Age);
		this.Gaji=Gaji;
		this.UserName = userName;

	}

	public Chef() {
	
	}

	@Override
	public void Print() {
		System.out.println(""+ID);
		System.out.println("=====================================");
		System.out.println("Name     : "+Name);
		System.out.println("Username : "+UserName);
		System.out.println("Age      : "+Age);
		System.out.println("Gender   : "+Gender);
	}

}
