

class Dog{
    String name;
    String color;
    int regNumber;
    Dog(){
        this("Undefined","black");
        System.out.println("Default constructor");
        
    }
    Dog(int n){
        this("Undefined","black");
        this.regNumber = n ;
        System.out.println("int param");
    }
    Dog(String p1, String p2){
        this.name = p1;
        this.color = p2;
        this.regNumber =0;
        System.out.println("Two param");
    }
    Dog(String p1){
         this(p1,"black");
         System.out.println("Single param");

    }
}
class utility extends Dog{
    utility(){
        ;
    }
    void Display(Dog obj){
        System.out.println("Details as follows "+obj.color+" "+obj.name+" "+obj.regNumber);
    }

}
class ConstructOverload{
    public static void main(String args[]){
       
        Dog one = new Dog();
        Dog two = new Dog("Devil","White");
        Dog three = new Dog("Tommy ");
        Dog four = new Dog(890);

        utility obj = new utility();
        obj.Display(one);
        obj.Display(two);
        obj.Display(three);
        obj.Display(four);


    }
}