package db.webkwgtn.schemas.information_schema

import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object SqlPackages : Table<SqlPackage>(
    tableName = "sql_packages",
    schema = "information_schema"
) {
    val featureId = varchar("feature_id").primaryKey().bindTo { it.featureId }
    val featureName = varchar("feature_name").bindTo { it.featureName }
    val isSupported = varchar("is_supported").bindTo { it.isSupported }
    val isVerified = varchar("is_verified").bindTo { it.isVerified }
    val comments = varchar("comments").bindTo { it.comments }
}

val Database.sqlpackages get() = this.sequenceOf(SqlPackages)