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
