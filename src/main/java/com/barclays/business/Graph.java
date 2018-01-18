package com.barclays.business;

/**
 * Created on 1/18/18, 7:31 PM
 * Graph.java
 *
 * @author snampalli
 */
public interface Graph<V, E> {

    Iterable<V> getNodes();

    int getOrder();

    Iterable<E> getLinks();

    int getSize();

    E getLink(V source, V target);

    boolean containsNode(V v);

    boolean containsLink(E e);
}
