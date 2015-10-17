package com.mtuga.tuples4j;


import java.util.List;

import com.mtuga.tuples4j.utils.EqualsUtils;


@SuppressWarnings("serial")
public class Pair<A, B> extends Single<A> {


	B second = null;


	public Pair(A first, B second)
	{
		super(first);
		this.second = second;
	}


	public Pair()
	{
	}


	@Override
	public List<Object> asList()
	{
		List<Object> lst = super.asList();
		lst.add(this.getSecond());

		return lst;
	}


	public B getSecond()
	{
		return second;
	}


	public void setSecond(B second)
	{
		this.second = second;
	}


	@Override
	public boolean isFullFilled()
	{
		return (this.getSecond() != null) && super.isFullFilled();
	}


	@Override
	public boolean equals(Object obj)
	{
		if (!(this.getClass().isInstance(obj)))
		{
			return false;
		}

		Pair<?, ?> var = (Pair<?, ?>) obj;

		if (!super.equals(var))
		{
			return false;
		}

		if (EqualsUtils.areEqual(this.getSecond(), var.getSecond()))
		{
			return true;
		}

		return false;
	}


	@Override
	public int hashCode()
	{
		int hash = super.hashCode();
		hash = 89 * hash
		        + (this.second != null ? this.second.hashCode() : super.hashCode());
		return hash;
	}
}
