import java.util.Optional;

public abstract class Payment {

    final void executeWith(CallBack callback) {
        execute();
        Optional.ofNullable(callback).ifPresent(CallBack::call);
    }

    public abstract void execute();


}


