

class Dog{
    public String name;
}
class Hound extends Dog{
    Hound()
    {
        super.name = "tommy";
    }
    void display(){
        System.out.println("From parent : "+super.name);
    }
}
class SingleInheritance{
    public static void main(String args[]){
       
        Hound hb = new Hound();
        hb.display();
        
       


    }
}