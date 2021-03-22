package Graph_Project;

interface Visitor {
    void visit(BinaryRelation binaryRelation);

    String visit(Person person);

    String visit(Married married);

    String visit(Friend friend);

    String visit(Sibling sibling);
}
