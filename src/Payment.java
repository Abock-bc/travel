public class Payment implements Ireserve{
    @Override
    public void doreserve(String name){
        System.out.println("paid by " + name);
    }
}
