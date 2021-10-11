import java.util.UUID;

public abstract class DanbamInformation {
	protected String Name;
	protected String Gender;
	protected Integer Age;
	protected UUID ID;
	
	public DanbamInformation(String Name, String gender, Integer Age) {
		super();
		this.Name = Name;
		this.Gender = gender;
		this.Age = Age;
		this.ID = UUID.randomUUID();
	}

	public UUID getID() {
		return ID;
	}

	public void setID(UUID ID) {
		this.ID = ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer Age) {
		this.Age = Age;
	}

	public DanbamInformation() {
		
	}
	public abstract void Print();

}
