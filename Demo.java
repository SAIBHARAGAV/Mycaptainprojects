class Employee{
    public static void e1(){
        System.out.println("Name: Robert");
        System.out.println("Year of joining : 1994 64C");
        System.out.println("Address  : WallsStreet");
    }
    public static void e2(){
        System.out.println("Name: Sam");
        System.out.println("Year of joining : 2000 68D");
        System.out.println("Address  : WallsStreet");
    }
     public static void e3(){
        System.out.println("Name: John");
        System.out.println("Year of joining : 1999 26B");
        System.out.println("Address  : WallsStreet");
    }
}
class Demo{
    public static void main (String[] args) {
        Employee E=new Employee();
        E.e1();
        E.e2();
        E.e3();
    }
}
