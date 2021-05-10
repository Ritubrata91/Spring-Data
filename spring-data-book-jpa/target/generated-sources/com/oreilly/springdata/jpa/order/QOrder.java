package com.oreilly.springdata.jpa.order;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 2089946477;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QOrder order = new QOrder("order1");

    public final com.oreilly.springdata.jpa.core.QAbstractEntity _super = new com.oreilly.springdata.jpa.core.QAbstractEntity(this);

    public final com.oreilly.springdata.jpa.core.QAddress billingAddress;

    public final com.oreilly.springdata.jpa.core.QCustomer customer;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final SetPath<LineItem, QLineItem> lineItems = this.<LineItem, QLineItem>createSet("lineItems", LineItem.class, QLineItem.class, PathInits.DIRECT);

    public final com.oreilly.springdata.jpa.core.QAddress shippingAddress;

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QOrder(Path<? extends Order> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrder(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QOrder(PathMetadata<?> metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.billingAddress = inits.isInitialized("billingAddress") ? new com.oreilly.springdata.jpa.core.QAddress(forProperty("billingAddress"), inits.get("billingAddress")) : null;
        this.customer = inits.isInitialized("customer") ? new com.oreilly.springdata.jpa.core.QCustomer(forProperty("customer"), inits.get("customer")) : null;
        this.shippingAddress = inits.isInitialized("shippingAddress") ? new com.oreilly.springdata.jpa.core.QAddress(forProperty("shippingAddress"), inits.get("shippingAddress")) : null;
    }

}

