package cms_tp16;

public class CMSStudent
{
	private String name = new String("DefaultName");
	private int age = 18;

	CMSStudent() {}
	
	CMSStudent(String name, int age)
	{
		setName(name);
		setAge(age);
	}
	
	public void setName(String name)
	{
		this.name = new String(name);		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;		
	}
	
	public int getAge()
	{
		return age;
	}	
	
	public void afficher()
	{
		System.out.println("Je suis un etudiant du CMS.");
		System.out.println("Mon nom est "+name+" et mon age est "+age+".");
	}
}//fin de la classe CMSStudent