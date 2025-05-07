package logic;

public class Box <T> {
    private T content;
    
    public void setSomething(T content) {
        this.content = content;
    }
    
    public T getSomething() {
        return this.content;
    }
}
