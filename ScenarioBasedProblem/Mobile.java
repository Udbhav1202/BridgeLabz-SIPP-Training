package ScenarioBasedProblem;

public class Mobile {
	String brand;
	String model;
	String iemi;
	String color;
	Mobile next;
	
	public Mobile(String brand, String model, String iemi, String color) {
		this.brand = brand;
		this.model = model;
		this.iemi = iemi;
		this.color = color;
		this.next = null;
	}
	
	private Mobile head = null;
	
	public void addMobile(String brand, String model, String iemi, String color) {
		Mobile newMobile = new Mobile(brand, model, iemi, color);
		if(head == null) {
			head = next;
		}else {
			Mobile temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newMobile;
			
		}
	}
	
	public void removeBook(String iemiNum, String model) {
		if(head == null) {
			return;
		}
		if(head.iemi == iemiNum) {
			head = head.next;
			return;
		}
		Mobile temp = head;
		while(temp.next.iemi != iemiNum) {
			temp.next = next;
		}
		if (temp.next == null) {
            System.out.println("Mobile Not Found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Mobile Found" + model);
        }
	}
}
