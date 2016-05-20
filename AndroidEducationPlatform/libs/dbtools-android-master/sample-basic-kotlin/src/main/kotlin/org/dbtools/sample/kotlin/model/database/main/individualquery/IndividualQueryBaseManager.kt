/*
 * IndividualQueryBaseManager.kt
 *
 * GENERATED FILE - DO NOT EDIT
 * 
 */



package org.dbtools.sample.kotlin.model.database.main.individualquery

import org.dbtools.sample.kotlin.model.database.DatabaseManager
import org.dbtools.android.domain.database.DatabaseWrapper
import org.dbtools.android.domain.KotlinAndroidBaseManagerReadOnly


@SuppressWarnings("all")
abstract class IndividualQueryBaseManager : KotlinAndroidBaseManagerReadOnly<IndividualQuery> {

     var databaseManager: DatabaseManager

    constructor(databaseManager: DatabaseManager) {
        this.databaseManager = databaseManager
    }

    override fun getDatabaseName(): String {
        return IndividualQueryConst.DATABASE
    }

    override fun newRecord(): IndividualQuery {
        return IndividualQuery()
    }

    override fun getAllColumns(): Array<String> {
        return IndividualQueryConst.ALL_COLUMNS
    }

    override fun getReadableDatabase(@javax.annotation.Nonnull databaseName: String): DatabaseWrapper<*, *> {
        return databaseManager.getReadableDatabase(databaseName)
    }

    fun getReadableDatabase(): DatabaseWrapper<*, *> {
        return databaseManager.getReadableDatabase(databaseName)
    }

    override fun getWritableDatabase(@javax.annotation.Nonnull databaseName: String): DatabaseWrapper<*, *> {
        return databaseManager.getWritableDatabase(databaseName)
    }

    fun getWritableDatabase(): DatabaseWrapper<*, *> {
        return databaseManager.getWritableDatabase(databaseName)
    }

    override fun getAndroidDatabase(@javax.annotation.Nonnull databaseName: String): org.dbtools.android.domain.AndroidDatabase? {
        return databaseManager.getDatabase(databaseName)
    }

    override fun getDatabaseConfig(): org.dbtools.android.domain.config.DatabaseConfig {
        return databaseManager.getDatabaseConfig()
    }

    abstract fun getQuery(): String;

    override fun getTableName(): String {
        return getQuery()
    }

    override fun getPrimaryKey(): String {
        return ""
    }

    override fun getDropSql(): String {
        return ""
    }

    override fun getCreateSql(): String {
        return ""
    }

    override fun getInsertSql(): String {
        return ""
    }

    override fun getUpdateSql(): String {
        return ""
    }


}