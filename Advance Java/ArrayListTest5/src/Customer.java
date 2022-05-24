public class Customer {
	private int id;
	private String name;
	private String mobile;
	private int age;
	
	public Customer(int id,String name,String mobile,int age)
	{
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.age=age;
	}
	public Customer()
	{}
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
         @Override
        public String toString()
        {
          return id+"\t"+name; 
        }
       @Override
        public int hashCode()
        {
            System.out.println("hashCode()-called...");
              return id; //To change body of generated methods, choose Tools | Templates.
        }
        @Override
        public boolean equals(Object obj)
        {
            System.out.println("equals called().....");
            Customer c=(Customer)obj;
            return this.id == c.id && this.name.equals(c.name);
        }
}