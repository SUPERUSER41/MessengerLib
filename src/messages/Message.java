package messages;

public abstract class Message {
    private String data;
    public Message(){
        super();
        data = "";
    }
    Message(String data){
        this.data = data;
    }



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
