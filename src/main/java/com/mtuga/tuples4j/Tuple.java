package com.mtuga.tuples4j;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public abstract class Tuple implements Serializable {

    public List<Object> asList()
    {
        return new LinkedList<Object>();
    }
}
