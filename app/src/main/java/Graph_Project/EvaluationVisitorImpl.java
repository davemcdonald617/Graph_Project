package Graph_Project;

public class EvaluationVisitorImpl implements Visitor{
    @Override
    public void visit(BinaryRelation binaryRelation) {

    }

    @Override
    public String visit(Person person) {

        return null;
    }

    @Override
    public String visit(Married married) {
        String relation = "Married";
        return relation;
    }

    @Override
    public String visit(Friend friend) {
        String relation = "Friends";
        return relation;
    }

    @Override
    public String visit(Sibling sibling) {

        return null;
    }
}
