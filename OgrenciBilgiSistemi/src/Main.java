
public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Mahmut Hoca", "054", "trh");
		Teacher t2 = new Teacher("Graham Bell", "045", "fzk");
		Teacher t3 = new Teacher("Kül Yutmaz", "024", "bio");
		// t1.print();

		Course tarih = new Course("Tarih", "101", "trh");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "102", "fzk");
	    fizik.addTeacher(t2);

	    Course bio = new Course("Biyoloji", "103", "bio");
	    bio.addTeacher(t3);
		
	    Student s1=new Student("İnek Şaban","123","4",tarih,fizik,bio);
	    s1.addBulkExamNote(40, 45, 50);
	    s1.isPass();
	    
	    System.out.println("--------------------------------");
	    
	    Student s2=new Student("Güdük Necmi","126","4",tarih,fizik,bio);
	    s2.addBulkExamNote(100, 85, 50);
	    s2.addBulkVerbalNote(100, 80, 60);
	    s2.isPass();
	}

}
