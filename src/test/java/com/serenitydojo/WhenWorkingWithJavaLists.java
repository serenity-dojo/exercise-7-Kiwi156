package com.serenitydojo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList() {

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);

        org.assertj.core.api.Assertions.assertThat(simpleList).contains("a string value", 123);

    }


}

