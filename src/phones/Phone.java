package phones;
import messages.Message;
import messages.PhotoMessage;
import messages.TextMessage;
import storage.StorageProvider;

import java.util.List;

public abstract class Phone {
    protected StorageProvider storage;
    Phone(StorageProvider storage){
        this.storage = storage;
    }
    public void viewAllMessages(){
        List<Message> messages = storage.retrieveAll();
        for(Message message : messages){
            System.out.println(message);
            if(message instanceof TextMessage){
                System.out.println("This is a text message");
                TextMessage textMessage = (TextMessage) message;
            }else if(message instanceof PhotoMessage){
                System.out.println("This is a photo message");
                PhotoMessage photoMessage = (PhotoMessage) message;
            }
        }
        messages.forEach(System.out::println);

    }

}
