package org.home.useful_things.tables;

public interface TextWrapper {

    static TextWrapper of(String text) {
        return new SimpleTextWrapper(text);
    }

    TextWrapper toWidth(int width);
    String doWrap();
}
