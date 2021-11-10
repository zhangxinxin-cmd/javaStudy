package demo03;

public class B {
    private static int nextId;
    private int id;
    public B(){
        this.id=nextId;
        nextId++;
    }
}
