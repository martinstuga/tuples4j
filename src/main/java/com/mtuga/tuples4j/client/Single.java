/**
 *
 This file is part of tuples4j.

 tuples4j is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 tuples4j is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with tuples4j.  If not, see <http://www.gnu.org/licenses/>

 */
package com.mtuga.tuples4j.client;


import com.mtuga.tuples4j.client.utils.EqualsUtils;

import java.util.List;



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
        if (!(obj instanceof Single)) {
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
