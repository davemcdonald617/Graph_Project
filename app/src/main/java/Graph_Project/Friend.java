package Graph_Project;

public class Friend extends BinaryRelation{

    public Friend(String relation) {
        super();
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
