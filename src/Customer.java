import java.util.Random;

public class Customer extends DanbamInformation {
	private int cust;
	private int age;
	Random random = new Random();
	public Customer(String Name, String gender, Integer Age) {
		super(Name, gender, Age);
		// TODO Auto-generated constructor stub
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void Print() {
		cust=random.nextInt(5)+1;
		age=random.nextInt(40)+17;
		System.out.println("Name    : Customer "+cust);
		System.out.println("Age     : "+age);
		System.out.println("Gender  : Male");
		System.out.println(" ");
		System.out.println("Menu details");
		System.out.println("=====================================");
		System.out.println(""+ID);
		System.out.println("Total Price: ");
		System.out.println("-------------------------------------");
	}

}
