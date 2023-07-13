package enums;

import interfaces.IShead;

public enum Mammals {
    DOG(2),
    CAT(5);
    int hair;

    Mammals ( int hair){
        this.hair = hair;
    }

    IShead shead = () -> {
        return --hair;
    };

}
