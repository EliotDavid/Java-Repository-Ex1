package TestcaseA;

public class ObjectB {

    private ObjectA nodeA = null;
    private String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    public ObjectA getNode(){
        if(nodeA == null){
            nodeA = new ObjectA("A");
        }
        return nodeA;
    }

    public ObjectB(){

    }

    public ObjectB(String name){
        this.name = name;
    }

}
