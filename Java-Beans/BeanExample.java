class BeanExample implements java.io.Serializable
{
	private String name;
	private int id;
	public void BeanExample()
	{

	}

	//setter method
	public void setName(String name)
	{
		this.name = name;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	//getter method
	public String getName()
	{
		return name;
	}

	public int getId()
	{
		return id;
	}



}