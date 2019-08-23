package org.home.useful_things.tables;

import org.junit.Test;

public class SimpleTextWrapperTests {

    @Test
    public void wrapperTest() {
        TextWrapper wrapper = TextWrapper.of("Some text to wrap because it is too long for one line to keep");

        String wrapped = wrapper.doWrap();
    }
}
