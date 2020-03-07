package providedsample.provided;

public class ProvidedUser {

    private Provided provided;

    public ProvidedUser(Provided provided) {
        this.provided = provided;
        provided.doSomething();
    }

    public Provided getProvided() {
        return provided;
    }

    public void setProvided(Provided provided) {
        this.provided = provided;
    }
}