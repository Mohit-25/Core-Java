package Collections;

public class Employee {
	
	int id;
	String name;
	long salary;
	String position;
	String orgname;
	public Employee(int id, String name, int salary, String position, String orgname) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
		this.orgname = orgname;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", position=" + position + ", orgname="
				+ orgname + "]";
	
	}
	public void Akash()
	{
		System.out.println("Name= "+name);
	}
	
	
	
	
	

}
