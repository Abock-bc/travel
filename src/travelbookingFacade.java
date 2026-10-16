public class travelbookingFacade {
    Ireserve flight=new Flights();
    Ireserve hotel=new hotels();
    Ireserve payment= new Payment();

    public void executeTransfer(){
        flight.doreserve("Dubai");
        hotel.doreserve("Rixes");
        payment.doreserve("Visamastercard");

}


}
