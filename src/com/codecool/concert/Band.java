package com.codecool.concert;

import java.util.Random;
import java.util.UUID;

public class Band {
    String name;
    Style style;
    Type type;


    public Band() {
        this.name = UUID.randomUUID().toString();
        this.style = randomStyle();
        this.type = randomType();

    }

    public Style randomStyle(){
       int pick = new Random().nextInt(Style.values().length);
       return Style.values()[pick];
    }

    public Type randomType(){
        int type = new Random().nextInt(Type.values().length);
        return Type.values()[type];
    }

    public enum Style{
        Rock,
        Pop,
        Jazz;
    }

    public enum Type{
        Main,
        WarmUp;
    }
}
