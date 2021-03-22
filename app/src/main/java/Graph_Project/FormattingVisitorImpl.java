package Graph_Project;

public class FormattingVisitorImpl implements Visitor{

    private String result;

    @Override
    public void visit(BinaryRelation binaryRelation) {
        System.out.println(binaryRelation.getlPerson() + " -- " +
                binaryRelation.getRelation() + " -- " +
                binaryRelation.getrPerson());
    }

    @Override
    public String visit(Person person) {

        return null;
    }

    @Override
    public String visit(Married married) {

        return null;
    }

    @Override
    public String visit(Friend friend) {

        return null;
    }

    @Override
    public String visit(Sibling sibling) {

        return null;
    }
}
