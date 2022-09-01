class Faculty
{
  public String name;
  private int basic;
  public int salary;
  
  public Faculty(String name, int basic) {    //create a constructor
	this.name = name;
	this.basic = basic;
  }
	
	public int getsalary()        //create a method
	{
		salary=basic;
		return salary;
	}
	public String getdetails()
	{
		return name+" "+getsalary();
	}

  
	
}
class AssistantProfessor  extends  Faculty     
{
	public int da;

	public AssistantProfessor(String name, int basic, int da) { //create a constructor
		super(name, basic);   //call parent class 
		this.da = da;
	}
	public int getsalary()
	{
		return super.getsalary() + (super.getsalary()*da)/100;  //logic
	}
	public String getdetails()
	{
		return "AssistantProfessor" +" " + name+ " "+ getsalary();
	}
	
}
class AssociateProfessor extends AssistantProfessor
{
	int MedAllowance ;

	public AssociateProfessor(String name, int basic, int da, int medAllowance) { ////create a constructor
		super(name, basic, da);  //call parent class 
		this.MedAllowance = medAllowance;
	}
	public int getsalary()
	{
		return super.getsalary() + MedAllowance;
	}
	public String getdetails()
	{
		return "MedAllowance" + " " + name+  " "+ getsalary();
	}
	
}
class Professor  extends AssociateProfessor 
{
	int OtherAllowance ;

	public Professor(String name, int basic, int da, int medAllowance, int otherAllowance) { //create a constructor
		super(name, basic, da, medAllowance);
		this.OtherAllowance = otherAllowance;
	}
	public int getsalary()
	{
		return super.getsalary() + ((OtherAllowance*super.getsalary())/100); //logic
	}
	public String getdetails()
	{
		return "OtherAllowance"+ " " + name+ " " + getsalary();
				
	}
	
}

public class Second {

	public static void main(String[] args) 
	{
		AssistantProfessor a = new AssistantProfessor("Anii",10000,2500); //create object
		System.out.println(a.getdetails());
		AssociateProfessor a1 = new AssociateProfessor("Anii",10000,2500,200);//create object
		System.out.println(a1.getdetails());
		Professor p = new Professor("Anii",10000,2500,2000,4000); //create object
		System.out.println(p.getdetails());
		
		
	}

}
