package Graph_Project;

public class Sibling extends BinaryRelation{
    String relationship;
    public Sibling() {
        relationship = "Siblings";
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
