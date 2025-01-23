package aggregation;

public class AggregationEx2 {
	String city;
	int pincode;
	AggregationEx1 ref;
		public AggregationEx2(String city,int pincode,AggregationEx1 ref) {
			this.city=city;
			this.pincode=pincode;
			this.ref=ref;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregationEx1 obj=new AggregationEx1("anu",20,46);
		AggregationEx2 obj1=new AggregationEx2("Kottayam",686011,obj);
		obj1.display();
	}
	public void display() {
		System.out.println(ref.name+" "+ref.rollno);
		System.out.println(city+" "+pincode);
	}
}
