package com.confiz.visiter;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);

}