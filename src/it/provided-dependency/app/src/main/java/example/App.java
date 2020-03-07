package example;

import com.google.gwt.core.client.EntryPoint;
import providedsample.provided.ProvidedUser;
import providedsample.provided.Provided;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        ProvidedUser providedUser = new ProvidedUser(new Provided(){
            public void doSomething(){

            }
        });
    }
}