public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Goodbye universe");

        Student jasmine = new Student("Jasmine", "A", 16, 4.0, true);
        Student shawn = new Student("Shawn", "A",19, 4.0,false);
        System.out.println(jasmine);
        System.out.println(shawn);

        Student[] advJava = new Student[2];
        advJava[0] = shawn;
        advJava[1] = jasmine;
        System.out.println("\tCLass currently contains: ");
        for (Student s: advJava)
        {
            System.out.println(s);
        }
    }
}