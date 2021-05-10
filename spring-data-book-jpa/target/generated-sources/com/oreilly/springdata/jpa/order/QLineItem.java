package com.oreilly.springdata.jpa.order;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLineItem is a Querydsl query type for LineItem
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLineItem extends EntityPathBase<LineItem> {

    private static final long serialVersionUID = 1703696040;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QLineItem lineItem = new QLineItem("lineItem");

    public final com.oreilly.springdata.jpa.core.QAbstractEntity _super = new com.oreilly.springdata.jpa.core.QAbstractEntity(this);

    public final NumberPath<Integer> amount = createNumber("amount", Integer.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final com.oreilly.springdata.jpa.core.QProduct product;

    public QLineItem(String variable) {
        this(LineItem.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QLineItem(Path<? extends LineItem> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLineItem(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLineItem(PathMetadata<?> metadata, PathInits inits) {
        this(LineItem.class, metadata, inits);
    }

    public QLineItem(Class<? extends LineItem> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new com.oreilly.springdata.jpa.core.QProduct(forProperty("product")) : null;
    }

}

