package com.oreilly.springdata.jpa.core;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QCustomer is a Querydsl query type for Customer
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QCustomer extends EntityPathBase<Customer> {

    private static final long serialVersionUID = 2141176460;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QCustomer customer = new QCustomer("customer");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    public final SetPath<Address, QAddress> addresses = this.<Address, QAddress>createSet("addresses", Address.class, QAddress.class, PathInits.DIRECT);

    public final QEmailAddress emailAddress;

    public final StringPath firstname = createString("firstname");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastname = createString("lastname");

    public QCustomer(String variable) {
        this(Customer.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QCustomer(Path<? extends Customer> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QCustomer(PathMetadata<?> metadata, PathInits inits) {
        this(Customer.class, metadata, inits);
    }

    public QCustomer(Class<? extends Customer> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.emailAddress = inits.isInitialized("emailAddress") ? new QEmailAddress(forProperty("emailAddress")) : null;
    }

}

