
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d=new MethodsDemo();
		String Name = d.getData();
		System.out.println(Name);
		MethodsDemo2 d1=new MethodsDemo2();
		String Name1 =d1.getUserData();
		System.out.println(Name1);
		String Name2 = getData2();
		System.out.println(Name2);
				
	}
	public String getData()
	{
		System.out.println("Hello");
		return "Manish Pandey";
	}
	public static String getData2()
	{
		System.out.println("Hello World 2");
		return "Manish Kumar Pandey";
	}


}
