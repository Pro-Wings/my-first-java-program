class Student
{
	int roll;
	String name;
	
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
}