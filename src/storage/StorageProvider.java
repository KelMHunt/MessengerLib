package storage;
import java.util.List;
import java.util.ArrayList;
import messages.Message;
 
public abstract class StorageProvider 
{
	private List<Message> messages;	
	public StorageProvider()//default constructor
	{
		messages= new ArrayList<Message>();
	}

	public StorageProvider(List<Message> messages) 
	{
		super();
		this.messages = messages;
	}
	public boolean save(Message m)
	{
		messages.add(m);
		return true;
	}
	public List<Message> retrieveAll()
	{
		return messages;
	}
}
