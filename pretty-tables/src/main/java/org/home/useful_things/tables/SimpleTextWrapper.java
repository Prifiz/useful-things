package org.home.useful_things.tables;

public class SimpleTextWrapper implements TextWrapper {

    private final String initial ;
    private String wrapped = "";
    static final int DEFAULT_WIDTH = 80;
    private int width = DEFAULT_WIDTH;

    public SimpleTextWrapper(String text) {
        this.initial = text;
    }

    @Override
    public TextWrapper toWidth(int width) {
        this.width = width;
        return this;
    }

    public String doWrap() {

        return null;
    }
}
