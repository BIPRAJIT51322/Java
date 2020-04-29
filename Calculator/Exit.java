public class Exit 
{
    public void exit()
    {
        System.out.println("Thank you for using our service");
    }
    public void wrong_input_exit()
    {
        System.out.println("As you have not followed the instructions given by the Calculator so the Calculator has reset");
        Start_Calculator start = new Start_Calculator();
        start.restart();
    }
    public void wrong()
    {
        System.out.println("It seems like you dont belong to the program");
        System.exit(0);
    }
}