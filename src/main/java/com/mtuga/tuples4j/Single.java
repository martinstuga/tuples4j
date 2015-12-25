package com.mtuga.tuples4j;


import java.util.List;

import com.mtuga.tuples4j.utils.EqualsUtils;


public class Single<A> extends Tuple {


    protected A first = null;


    public Single() {
    }


    public Single(A first) {
        this.first = first;
    }


    @Override
    public List<Object> asList() {
        List<Object> lst = super.asList();
        lst.add(this.getFirst());

        return lst;
    }


    public A getFirst() {
        return first;
    }


    public void setFirst(A first) {
        this.first = first;
    }


    @Override
    public boolean isFullFilled() {
        return (this.getFirst() != null);
    }


    @Override
    public boolean equals(Object obj) {
        if (!(this.getClass().isInstance(obj))) {
            return false;
        }

        Single<?> s = (Single<?>) obj;

        if (EqualsUtils.areEqual(this.getFirst(), s.getFirst())) {
            return true;
        }

        return false;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.first != null ? this.first.hashCode() : 0);
        return hash;
    }
}
