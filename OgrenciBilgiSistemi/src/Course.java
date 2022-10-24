
public class Course {

	Teacher teacher;
	String name;
	String code;
	String prefix;
	int verbalNote;
	int note;
	public Course(String name, String code, String prefix) {
		super();
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.verbalNote=0;
	}
	
	void addTeacher(Teacher teacher) {
		if(teacher.branch.equals(this.prefix)) {
			this.teacher=teacher;
			//printTeacher();
		}
		else {
			System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
		}
	}
	
	void printTeacher() {
		this.teacher.print();
	}
}
