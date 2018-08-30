package storage;

import messages.Message;

import java.util.ArrayList;
import java.util.List;

public abstract class StorageProvider {
    private List<Message> messages;

    StorageProvider(){
        this.messages = new ArrayList<>();
    }

    public boolean saved(Message message){
        messages.add(message);
        return true;
    }
    public List<Message> retrieveAll(){
        return messages;
    }
}
