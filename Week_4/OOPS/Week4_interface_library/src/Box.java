public class Box
{
    int length;
    int breadth;

    Box(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public void area()
    {
        System.out.println("Area = " + (length * breadth));
    }

    public static void main(String[] args)
    {
        Box3D obj = new Box3D(10, 5, 4);

        obj.area();
        obj.volume();
    }
}

class Box3D extends Box
{
    int height;

    Box3D(int length, int breadth, int height)
    {
        super(length, breadth);
        this.height = height;
    }

    public void volume()
    {
        System.out.println("Volume = " + (length * breadth * height));
    }
}