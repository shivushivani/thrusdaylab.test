class Student{
	private String name;
	protected int id;
	double grade;
	public int age;

	public Boolean isPassed(double grade){
		return null;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
}
class Undergrad extends Student{
	@Override
	public Boolean isPassed(double grade){
		if(grade>70.0)
			return true;
		return false;
	}
}
class Grad extends Student{
	@Override
	public Boolean isPassed(double grade){
		if(grade>80.0)
			return true;
		return false;
	}
}

public class Record{
	public static void main(String args[]){

		Undergrad ug = new Undergrad();
		Grad g = new Grad();

		//For undergraduate student
		ug.setName("Shivani");
		ug.setId(456);
		ug.grade = 89;
		ug.age = 23;
		System.out.println("An undergraduate student "+ug.getName() +" with id "+ ug.getId() +" of age "+ ug.age +" got grade "+ ug.grade);
		if(ug.isPassed(ug.grade))
			System.out.println("Congratulations! You passed this test");
		else
			System.out.println("Better luck next time");


		//For Graduate student
		g.setName("unknow peson");
		g.setId(289);
		g.age = 22;
		g.grade=79;
		System.out.println("A graduate student "+g.getName()+" with id "+g.getId()+" of age "+g.age+" got grade "+g.grade);
		if(g.isPassed(g.grade))
			System.out.println("Congratulations!! You passed the exam");
		else
			System.out.println("Try more harder next time");
	}
}
