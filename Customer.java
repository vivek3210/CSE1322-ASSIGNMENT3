public abstract class Customer {
    private char ticketType;
    private int ticketNumber;
    private static int AticketCounter = 0;
    private static int BticketCounter = 0;
    private static int CticketCounter = 0;
    private static int DticketCounter = 0;
    public Customer(char tt)
    {
        ticketType = tt;
        ticketCounter++;
        ticketNumber = ticketCounter;
    }
    protected String getTicketNumber() {
        return ticketType + String.valueOf(ticketNumber);
    }
    public abstract String getCustomerInfo();
}
