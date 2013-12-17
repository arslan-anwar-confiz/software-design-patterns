package com.confiz.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
