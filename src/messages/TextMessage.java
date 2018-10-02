package messages;

public class TextMessage extends Message 
{

	public TextMessage(String data) 
	{
		super(data);
		// TODO Auto-generated constructor stub
	}
	
	public String getText()
	{
		return getData(); 
	}

}
