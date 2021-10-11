import java.util.Random; 
import java.util.Scanner;
import java.util.Vector;

public class Main implements Runnable {
	Integer money = 10000;
	Scanner scan = new Scanner(System.in);
	Vector<DanbamInformation> Danbam = new Vector<DanbamInformation>();
	String[] array = new String [20];
	Random random = new Random ();
	
	public Main() {
		Thread thread = new Thread(this);
		thread.start();
		MenuMakanan();
		MainMenu();
	}

	private void MainMenu() {
		int pilih;
		do {
			System.out.println("DANBAM");
			System.out.println("Total money : "+money);
			System.out.println("1. Add danbam's Chef");
			System.out.println("2. View danbam's information");
			System.out.println("3. View customer's in danbam");
			System.out.println("4. Quit");
			System.out.println(">>");
			do {
				pilih=scan.nextInt();scan.nextLine();							
			}while(pilih<1 || pilih>4);
			
			switch (pilih) {
			case 1:
				AddChef();
				break;

			case 2:
				ViewDanbamInfo();
				break;
				
			case 3:
				ViewCustomer();
				break;

			case 4:
				System.out.println("Thankyou for Using Our Application");
				break;
			}
		}while(pilih !=4 );
	}

	private void ViewCustomer() {
		for(int i=1;i<Danbam.size();i++) {
			System.out.println("Customer "+i);
	 }
	}

	private void ViewDanbamInfo() {
		int pilih2;
		do {
			System.out.println("1. View all chef's");
			System.out.println("2. View customer with history order");
			System.out.println("3. Exit");
			do {
				pilih2=scan.nextInt();scan.nextLine();
			}while(pilih2<1 && pilih2 >3);
			
			if(pilih2==1) {
				for(DanbamInformation danbam : Danbam ) {
				danbam.Print();
				}
			}else if(pilih2==2) {
				if(Danbam.isEmpty()) {
					System.out.println("There are no customer with order yet! : (");
				}else {
					System.out.println("Name    : Customer 1");
					System.out.println("Age     : 21");
					System.out.println("Gender  : Male");
					System.out.println(" ");
					System.out.println("Menu details");
					System.out.println("=====================================");
					System.out.println("ID : ");
					System.out.println("Total Price: ");
					System.out.println("-------------------------------------");
				}
			}else{
				cls();
				MainMenu();
			}
	}while(pilih2!=3);
}

	private void AddChef() {
		String ChefName;
		String UserName,Gender;
		Integer ChefAge;
		Integer Gaji=3000;
		
		do {
			System.out.println("Chef's name [must contain 3 words] >> ");
			ChefName=scan.nextLine();
			array=ChefName.split(" ");
		}while(array.length<3);
		
		//unique=username nya gaboleh sama kayak sebelumnya
		do {
			System.out.println("Chef's Username [must be unique] >> ");
			UserName=scan.nextLine();		
		}while(UserName.length()<3);
		
		do {
			System.out.println("Chef's gender [Female | Male] (Case sensitive) >>");
			Gender=scan.nextLine();
		}while(!Gender.equals("Female") && !Gender.equals("Male") );
		
		do {
			System.out.println("Chef's age [17 - 40] >>");
			ChefAge=scan.nextInt();scan.nextLine();			
		}while (ChefAge< 17 || ChefAge>40);
		
		Danbam.add(new Chef(ChefName, UserName, Gender, ChefAge, Gaji));
		Gaji+=Gaji;
		System.out.println("Chef has been successfully added!");scan.nextLine();
	}
	
	private void cls() {
		for (int i = 0; i < 30; i++) {
			System.out.println("");
		}
	}
	
	private void MenuMakanan() {
		int price,price1,price2,price3,price4,price5,price6,price7,price8,price9;
		price=random.nextInt(500)+500;
		price1=random.nextInt(500)+500;
		price2=random.nextInt(500)+500;
		price3=random.nextInt(500)+500;
		price4=random.nextInt(500)+500;
		price5=random.nextInt(500)+500;
		price6=random.nextInt(500)+500;
		price7=random.nextInt(500)+500;
		price8=random.nextInt(500)+500;
		price9=random.nextInt(500)+500;
		System.out.println("Kimchi Jjigae 김치찌개       "+ " " + price);
		System.out.println("Jjinmandu 찐만두                  "+ " " + price1);
		System.out.println("Daeji Bulgogi 불고기          "+ " " + price2);
		System.out.println("Gogigui 고기구이                   "+ " " + price3);
		System.out.println("Haejangguk 해장국                "+ " " + price4);
		System.out.println("Sundubu Jjigae 순두부찌게   "+ " " + price5);
		System.out.println("Saengseon Jjigae 생선찌개  "+ " " + price6);
		System.out.println("Nakji Bokkeum 낙지볶음        "+ " " + price7);
		System.out.println("Seolleongtang 설렁탕           "+ " " + price8);
		System.out.println("Dolsot Bibimbap 돌솥 비빔밥 "+ " " + price9);
		System.out.println(" ");
		System.out.println(" ");
	}
	public static void main(String[] args) {
		new Main ();

	}

	//Threading
	@Override
	public void run() {
		while(true) {
			//2 menit (120 detik)
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			for(int i=0;i<Danbam.size();i++) {
//				if()
			}
		}
		
	}

//}
