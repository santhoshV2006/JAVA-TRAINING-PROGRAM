abstract class Hidden
{
    abstract void display();
    public static void main(String[] args)
    {
        int a = 10;
        int sum = 0;
        sum += a;
        System.out.println(sum);
        Hidden obj = new Revealed();
        obj.display();
    }
}
class Revealed extends Hidden
{
    void display()
    {
        System.out.println("From Revealed");
    }
}