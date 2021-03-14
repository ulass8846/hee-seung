package Project1;

public class Main {
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}
}
 class TV {
	private String name;
	private int inch,year;
	
	TV(String name,int year,int inch){
		this.name = name;
		this.inch = inch;
		this.year = year;
	}
	public void show() {
	System.out.println(name+"에서 만든 "+year+"년형 "+inch+"인치 TV");	
	}
}
