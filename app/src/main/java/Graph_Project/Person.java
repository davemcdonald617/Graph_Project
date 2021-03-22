package Graph_Project;

public class Person extends Relation{
    private String name;
    private int age;

    public Person(String initName, int initAge){
        this.name = initName;
        this.age = initAge;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
