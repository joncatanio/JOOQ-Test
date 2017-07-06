/*
 * This file is generated by jOOQ.
*/
package db.generated;


import db.generated.tables.Risks;
import db.generated.tables.Users;
import db.generated.tables.records.RisksRecord;
import db.generated.tables.records.UsersRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.UInteger;


/**
 * A class modelling foreign key relationships between tables of the <code>test</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<RisksRecord, UInteger> IDENTITY_RISKS = Identities0.IDENTITY_RISKS;
    public static final Identity<UsersRecord, UInteger> IDENTITY_USERS = Identities0.IDENTITY_USERS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<RisksRecord> KEY_RISKS_PRIMARY = UniqueKeys0.KEY_RISKS_PRIMARY;
    public static final UniqueKey<RisksRecord> KEY_RISKS_RISKNAME = UniqueKeys0.KEY_RISKS_RISKNAME;
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<RisksRecord, UInteger> IDENTITY_RISKS = createIdentity(Risks.RISKS, Risks.RISKS.ID);
        public static Identity<UsersRecord, UInteger> IDENTITY_USERS = createIdentity(Users.USERS, Users.USERS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<RisksRecord> KEY_RISKS_PRIMARY = createUniqueKey(Risks.RISKS, "KEY_Risks_PRIMARY", Risks.RISKS.ID);
        public static final UniqueKey<RisksRecord> KEY_RISKS_RISKNAME = createUniqueKey(Risks.RISKS, "KEY_Risks_riskName", Risks.RISKS.RISKNAME);
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = createUniqueKey(Users.USERS, "KEY_Users_PRIMARY", Users.USERS.ID);
    }
}
