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
package com.mtuga.tuples4j;


import java.util.List;

import com.mtuga.tuples4j.utils.EqualsUtils;


@SuppressWarnings("serial")
public class Quadruple<A, B, C, D> extends Triple<A, B, C> {


	protected D fourth = null;


	public Quadruple(A first, B second, C third, D fourth)
	{
		super(first, second, third);
		this.setFourth(fourth);
	}


	public Quadruple()
	{
	}


	@Override
	public List<Object> asList()
	{
		List<Object> lst = super.asList();
		lst.add(this.getFourth());

		return lst;
	}


	@Override
	public boolean equals(Object obj)
	{
		if (!(this.getClass().isInstance(obj)))
		{
			return false;
		}

		Quadruple<?, ?, ?, ?> var = (Quadruple<?, ?, ?, ?>) obj;

		if (!super.equals(var))
		{
			return false;
		}

		if (EqualsUtils.areEqual(this.getFourth(), var.getFourth()))
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
		        + (this.getFourth() != null ? this.getFourth().hashCode() : super
		                .hashCode());
		return hash;
	}


	@Override
	public boolean isFullFilled()
	{
		return (this.getFourth() != null) && super.isFullFilled();
	}


	public D getFourth()
	{
		return fourth;
	}


	public void setFourth(D fourth)
	{
		this.fourth = fourth;
	}
}
