package day55_june2;

public class LocalStudent extends Student {

	int seatID;
	public LocalStudent(int id, String name,int seatId) {
		super(id, name);
		this.seatID = seatId;
		
	}


	
	@Override
	public void attendClass() {
		System.out.println("Attend class in classroom");
	}
}
