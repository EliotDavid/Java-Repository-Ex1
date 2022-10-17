package Example;

class Object implements ParentB{

    String name;

    /* //[얘도 다형성 수업할 떄 쓴 멤버변수임]
    int index;
    int age;
    String name;
    String _class;



    Object(){

    }


    Object(String name){
        this.name = name;
    };

    abstract public void render();
     */

    //public void render(){ // 얘는 다형성 설명할 떄 쓴 함수임

    //}


    @Override
    public void parentA(){

    }
    @Override
    public void parentB(){

    }

}
