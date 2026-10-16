public class Flights implements Ireserve{
    @Override
    public void doreserve(String name){
        System.out.println("booking flight to " + name);
    }
}
