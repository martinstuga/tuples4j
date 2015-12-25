package com.mtuga.tuples4j;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public abstract class Tuple implements Serializable {

    /**
     * Allows the user to know if all tuple fields are not null
     * @return {@code true} if all tuple elements are not null
     */
    public abstract boolean isFullFilled();

    /**
     * Returns the current tuple elements in a List
     * @return A {@code List<Object>} with all elements on this tuple
     */
    public List<Object> asList()
    {
        return new LinkedList<Object>();
    }

}
