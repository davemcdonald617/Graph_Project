package Graph_Project;

public class Married extends BinaryRelation{

    private String relationship;
    public Married() {
        super();
        relationship = "Married" ;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
