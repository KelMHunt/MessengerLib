package phones;

import messages.Message;
import storage.StorageProvider;
import protocols.MessageProtocol;
import storage.ICloud;

public final class IPhone extends Phone implements MessageProtocol
{

	public IPhone() 
	{
		super(new ICloud());
		// TODO Auto-generated constructor stub
	}
	public boolean send(Message m)
	{
		System.out.println("Sending "+m);
		return storage.save(m);
	}
	public boolean receive(Message m)
	{
		System.out.println("Received "+m);
		return storage.save(m);
	}
	
}
