// Pair class using type generic types F and S
public class Pair<F, S> {
    private F f;
    private S s;

    // Constructor using class setter
    public Pair(F f, S s) {
        set(f, s);
    }

    // Getters
    public F getF() {
        return f;
    }
    public S getS() {
        return s;
    }

    // Combined setter for ease of use
    public void set(F f, S s) {
        this.f = f;
        this.s = s;
    }
    // Setters
    public void setF(F f) {
        this.f = f;
    }
    public void setS(S s) {
        this.s = s;
    }
}
