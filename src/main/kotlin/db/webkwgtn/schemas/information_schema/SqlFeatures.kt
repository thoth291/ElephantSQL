package db.webkwgtn.schemas.information_schema

import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf
import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object SqlFeatures : Table<SqlFeature>(
    tableName = "sql_features",
    schema = "information_schema"
) {
    val featureId = varchar("feature_id").primaryKey().bindTo { it.featureId }
    val featureName = varchar("feature_name").bindTo { it.featureName }
    val subFeatureId = varchar("sub_feature_id").bindTo { it.subFeatureId }
    val subFeatureName = varchar("sub_feature_name").bindTo { it.subFeatureName }
    val isSupported = varchar("is_supported").bindTo { it.isSupported }
    val isVerifiedBy = varchar("is_verified_by").bindTo { it.isVerifiedBy }
    val comments = varchar("comments").bindTo { it.comments }
}

val Database.sqlfeatures get() = this.sequenceOf(SqlFeatures)

