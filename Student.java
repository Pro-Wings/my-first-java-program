class Student
{
	int roll;
	String name;
	
	//this is test comment222222222222222222
	public Student()
	{
		super();
		System.out.println("inside no-arg constructor!!!");
	}
	
	public Student(String nm, int rl)
	{
		this();
		System.out.println("inside all-arg constructor!!!");
		this.roll=rl;
		this.name=nm;
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student("Ram", 10);
		System.out.println(s1.roll);
		System.out.println(s1.name);	

	}
	//this is test comment33333333333333333
}
