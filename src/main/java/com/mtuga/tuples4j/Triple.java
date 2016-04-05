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
 along with Foobar.  If not, see <http://www.gnu.org/licenses/>

 */
package com.mtuga.tuples4j;


import java.util.List;

import com.mtuga.tuples4j.utils.EqualsUtils;


@SuppressWarnings("serial")
public class Triple<A, B, C> extends Pair<A, B> {


	protected C third = null;


	public Triple()
	{
		super();
	}


	public Triple(A first, B second, C third)
	{
		super(first, second);
		this.setThird(third);
	}


	@Override
	public List<Object> asList()
	{
		List<Object> lst = super.asList();
		lst.add(this.getThird());

		return lst;
	}


	@Override
	public boolean equals(Object obj)
	{
		if (!(this.getClass().isInstance(obj)))
		{
			return false;
		}

		Triple<?, ?, ?> var = (Triple<?, ?, ?>) obj;

		if (!super.equals(var))
		{
			return false;
		}

		if (EqualsUtils.areEqual(this.getThird(), var.getThird()))
		{
			return true;
		}

		return false;
	}


	@Override
	public int hashCode()
	{
		int hash = super.hashCode();
		hash = 89
		        * hash
		        + (this.getThird() != null ? this.getThird().hashCode() : super
		                .hashCode());
		return hash;
	}


	@Override
	public boolean isFullFilled()
	{
		return (this.getThird() != null) && super.isFullFilled();
	}


	public final C getThird()
	{
		return third;
	}


	public final void setThird(C third)
	{
		this.third = third;
	}
}
