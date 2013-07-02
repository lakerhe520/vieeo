package com.vieeo.core.condition.expression;

import com.vieeo.core.condition.HqlExpression;
import com.vieeo.core.domain.Entity;

public class DeleteExpression extends HqlExpression{
	
	public DeleteExpression(Class<? extends Entity> clazz) {
		super(clazz);
	}

	@Override
	public boolean check() {
		return true;
	}

	@Override
	public Object[] getParams() {
		return null;
	}

	@Override
	public boolean hasParams() {
		return false;
	}

	@Override
	public String getPropertyName() {
		return null;
	}
}
