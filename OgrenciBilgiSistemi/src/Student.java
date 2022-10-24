
public class Student {

	Course c1;
	Course c2;
	Course c3;
	
	String name;
	String stuNo;
	String classes;
	double avarage;
	boolean isPass;
	
	Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
		this.name=name;
		this.stuNo=stuNo;
		this.classes=classes;
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		calcAvarage();
		this.avarage=0.0;
		this.isPass=false;
	}
	
	void addBulkVerbalNote(int verb_tarih,int verb_fizik,int verb_bio) {
		  if(verb_tarih>=0 && verb_tarih<=100) {
			  this.c1.verbalNote=verb_tarih;
		  }
		  if (verb_fizik >= 0 && verb_fizik <= 100) {
	            this.c2.verbalNote = verb_fizik;
	        }
		  if (verb_bio >= 0 && verb_bio <= 100) {
	            this.c3.verbalNote = verb_bio;
	        }
	}
	
	
	void addBulkExamNote(int note1,int note2,int note3) {
		if(note1>=0 && note1<=100) {
			this.c1.note=note1;
		}
		if(note2>=0 && note2<=100) {
			this.c2.note=note2;
		}
		if(note3>=0 && note3<=100) {
			this.c3.note=note1;
		}
	}
	
	void calcAvarage() {
		double tarih_ave= this.c1.note*0.75+this.c1.verbalNote*0.25;
		double fizik_ave=this.c2.note*0.60+this.c2.verbalNote*0.40;
		double bio_ave=this.c3.note*0.70+this.c3.verbalNote*0.30;
		 double _average = (tarih_ave + fizik_ave + bio_ave) / 3;
		  this.avarage = Math.round( _average*100)/100d;
	}
	
	void isPass() {
		this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
		if(this.avarage>55) {
			System.out.println("Hababam Sınıfı Uyanıyor!");
			this.isPass=true;
		}
		else {
			System.out.println("Hababam Sınıfı Sınıfta Kaldı!");
			this.isPass=false;
		}
		printNote();
	}
	public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

	
	void printNote() {
	System.out.println(this.c1.name + " Notu\t : "+ this.c1.note +" Sözlü notu ile: "+this.c1.verbalNote);	
	System.out.println(this.c2.name + " Notu\t : "+ this.c2.note +" Sözlü notu ile: "+this.c2.verbalNote);	
	System.out.println(this.c3.name + " Notu\t : "+ this.c3.note +" Sözlü notu ile: "+this.c3.verbalNote);
	System.out.println("Ortalamanız: "+this.avarage);
	}
}
