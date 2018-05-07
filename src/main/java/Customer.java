public class Customer implements Visitor{

    public String customer;

    public String connect(){
        return "connected";
    }

    public String tune(String data){
        return "tuned into " + data;
    }

}
