package TestcaseA;

public class ObjectA {

    private ObjectB nodeB = null;
    private String name;

    String getName(){

        return this.name;
    }

    void setName(String name){
        this.name = name;
    }

    public ObjectB getNode()
    {
        if(nodeB == null){
            nodeB = new ObjectB("B");
        }
        return nodeB;
    }

    public ObjectA(){

    }

    public ObjectA(String name){
        this.name = name;
    }

}
