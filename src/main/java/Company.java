package Queue;
public class Company {	
	private String name;
	private int depart;
	private int year;
	
	public Company(String name, int depart, int year) {
		this.name = name;
		this.depart = depart;
		this.year = year;
		private Queue<Worker> workers;
	}
	

	public void fired(int num, int depart) {	
		int count = 0; int length = 0;
		this.workers.insert(null);

		while(this.workers.head() != null) {
			length ++;
			this.workers.insert(this.workers.remove());				
		}

		for (int i = 0; i < length - num; i++) {
			this.workers.insert(this.workers.remove());
		}

		for (int i = 0; i < num; i++) {
			this.workers.remove();
		}

	}

}
