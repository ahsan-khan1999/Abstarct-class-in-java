abstract class Boss{

	private String name ;
	private String address;

	
	public Boss(String name , String address){
	this.name = name;	
	this.address = address;
}

	public String getName(){
	return name;
}
	
	public String getAddress(){
	return address;
}
	public void printDetails(){
	System.out.println(name + address);
}
	
}
public class TestBoss{

	public static void main(String... args){
	
	final Boss boss = new Boss("Name","Address"){
	void printLn(){
	System.out.println("My Employee");
	
}
	//@override
	public void print(){
	//boss.printDetails();
	System.out.println("My Boss");	
	printLn(); 
}
};
	boss.printDetails();
}
}