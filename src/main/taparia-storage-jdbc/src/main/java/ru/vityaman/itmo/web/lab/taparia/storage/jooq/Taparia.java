/*
 * This file is generated by jOOQ.
 */
package ru.vityaman.itmo.web.lab.taparia.storage.jooq;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables.AccessToken;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables.PermissionUserPicture;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables.Picture;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables.TapResult;
import ru.vityaman.itmo.web.lab.taparia.storage.jooq.tables.UserAccount;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Taparia extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>taparia</code>
     */
    public static final Taparia TAPARIA = new Taparia();

    /**
     * The table <code>taparia.access_token</code>.
     */
    public final AccessToken ACCESS_TOKEN = AccessToken.ACCESS_TOKEN;

    /**
     * The table <code>taparia.permission_user_picture</code>.
     */
    public final PermissionUserPicture PERMISSION_USER_PICTURE = PermissionUserPicture.PERMISSION_USER_PICTURE;

    /**
     * The table <code>taparia.picture</code>.
     */
    public final Picture PICTURE = Picture.PICTURE;

    /**
     * The table <code>taparia.tap_result</code>.
     */
    public final TapResult TAP_RESULT = TapResult.TAP_RESULT;

    /**
     * The table <code>taparia.user_account</code>.
     */
    public final UserAccount USER_ACCOUNT = UserAccount.USER_ACCOUNT;

    /**
     * No further instances allowed
     */
    private Taparia() {
        super("taparia", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.asList(
            Sequences.SEQ_PICTURE_ID,
            Sequences.SEQ_TAP_RESULT_ID,
            Sequences.SEQ_USER_ACCOUNT_ID
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            AccessToken.ACCESS_TOKEN,
            PermissionUserPicture.PERMISSION_USER_PICTURE,
            Picture.PICTURE,
            TapResult.TAP_RESULT,
            UserAccount.USER_ACCOUNT
        );
    }
}
