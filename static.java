class xyz
{
    static
    {
        System.out.println("Static");
    }
    {
    System.out.println("Instance");
    }
    xyz()
    {
        System.out.println("Constructor");
    }
}
class Main
{
    public static void main(String[] args)
    {
        new xyz();
        new xyz();
        
    }
}