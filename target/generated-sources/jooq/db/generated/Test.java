/*
 * This file is generated by jOOQ.
*/
package db.generated;


import db.generated.tables.Risks;
import db.generated.tables.Userrisks;
import db.generated.tables.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends SchemaImpl {

    private static final long serialVersionUID = 1952675986;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The table <code>test.Risks</code>.
     */
    public final Risks RISKS = db.generated.tables.Risks.RISKS;

    /**
     * The table <code>test.UserRisks</code>.
     */
    public final Userrisks USERRISKS = db.generated.tables.Userrisks.USERRISKS;

    /**
     * The table <code>test.Users</code>.
     */
    public final Users USERS = db.generated.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private Test() {
        super("test", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Risks.RISKS,
            Userrisks.USERRISKS,
            Users.USERS);
    }
}