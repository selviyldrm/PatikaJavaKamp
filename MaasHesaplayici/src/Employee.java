
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		super();
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if(this.salary<1000) {
			System.out.println("Vergi uygulanmayacaktır.");
			return salary;
		}
		else{
			return this.salary *0.03;
		}
	}
	
	double bonus() {
		if(this.workHours<40) {
			return workHours;
		}
		else {
			return (this.workHours-40)*30;
		}
	}
	
	double raiseSalary() {
		int YilFarki=(2021-this.hireYear);
		
		if(YilFarki<10) {
			return (this.salary*0.05);
		}
		 else if(YilFarki > 9 && YilFarki < 20){
			 return (this.salary*0.1);
		 }
		 else if(YilFarki>19) {
			 return (this.salary*0.15);
		 }
		 else {
			 return 0;
		 }
	}
	
	public String toString() {
		double total = salary - tax() + bonus() + raiseSalary();
        double tot = salary + bonus() - tax();
		System.out.println("Adı : "+name);
		System.out.println("Maaşı : "+salary);
		System.out.println("Çalışma Saati : "+workHours);
		System.out.println("Başlangıç Yılı : "+hireYear);
		System.out.println("Vergi : "+tax());
		System.out.println("Bonus : "+bonus());
		System.out.println("Maaş Artışı : "+raiseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
		System.out.println("Toplam maaş : "+total);
		return null;
	}
}
