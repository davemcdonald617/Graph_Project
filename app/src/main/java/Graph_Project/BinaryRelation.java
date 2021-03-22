package Graph_Project;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

public class BinaryRelation {

    private Person lPerson;
    private Person rPerson;
    private BinaryRelation relation; // either married, Sibling or Friend

    public BinaryRelation(Person lPerson, Person rPerson, BinaryRelation relation) {
        this.lPerson = lPerson;
        this.rPerson = rPerson;
        this.relation = relation;
    }

    public BinaryRelation() {

    }

    public BinaryRelation getRelation() {
        return relation;
    }

    public void setlPerson(Person lPerson) {
        this.lPerson = lPerson;
    }

    public void setrPerson(Person rPerson) {
        this.rPerson = rPerson;
    }

    public void setRelation(BinaryRelation relation) {
        this.relation = relation;
    }

    public Person getlPerson() {
        return lPerson;
    }

    public Person getrPerson() {
        return rPerson;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
