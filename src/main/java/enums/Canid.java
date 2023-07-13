package enums;

import java.util.function.Consumer;

public enum Canid {
    DOG(3,"Bark"),
    WOLF(4,"Howl"),
    FOX(6,"Yipe"),
    JACKAL(4,"whine"),;

    int earLength;
    String call;

    Canid (int earLength, String call){
        this.earLength = earLength;
        this.call = call;
    }

    Consumer<String> callResponse = (s) -> {
        System.out.println(this.call);
        System.out.println(s);
    };
}
