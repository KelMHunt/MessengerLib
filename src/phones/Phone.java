package phones;

import java.util.List;

import messages.Message;
import messages.TextMessage;
import messages.PhotoMessage;
import storage.StorageProvider;

public abstract class Phone 
{
	protected StorageProvider storage;
	public Phone(StorageProvider sp)
	{
		storage=sp;
	}
	
	public void viewAllMsgs()
	{
		List<Message> messages = storage.retrieveAll();
		for(Message m: messages)//foreach loop
		{
			System.out.println(m);
			if(m instanceof TextMessage)
			{
				System.out.println("This is a text message");
				TextMessage textMessage=(TextMessage)m;
			}
			if(m instanceof PhotoMessage)
			{
				System.out.println("This is a photo message");
				PhotoMessage photoMessage=(PhotoMessage)m;
			}
		}
		//messages.forEach(System.out::println); "::"->method reference, just another way of doing the print out before
	}
}
