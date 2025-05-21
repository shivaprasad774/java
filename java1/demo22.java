package demo1;

public class demo3 {
	public String firstName;
	public String lastName;
	public long Phnumber;
	public String Email;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
}
	public void setPhnumber(long ph) {
		Phnumber=ph;
	}
	public void setEmail(String Em) {
		Email=Em;
	}
	public String getFirstname() {
		return firstName;
	}
	public String getLastname() {
		return lastName;
	}
	public long getPhnumber() {
		return Phnumber;
	}
	public String getEmail() {
		return Email;
	}
	public static void main(String[] args) {
		demo3 d1=new demo3();
		d1.setFirstName("shiva");
		d1.setLastName("prasad");
		d1.setPhnumber(7893743301l);
		d1.setEmail("karreshivaprasad2004@gmail.com");
		
		System.out.println(d1.getFirstname());
		System.out.println(d1.getLastname());
		System.out.println(d1.getPhnumber());
		System.out.println(d1.getEmail());
		
	}
}