package com.mtuga.tuples4j.utils;

public abstract class EqualsUtils {

    static public boolean areEqual(Object aThis, Object aThat)
    {
        return aThis == null ? aThat == null : aThis.equals(aThat);
    }    
}

