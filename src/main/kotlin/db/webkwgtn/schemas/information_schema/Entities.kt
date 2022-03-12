package db.webkwgtn.schemas.information_schema

import org.ktorm.entity.Entity

interface SqlFeature : Entity<SqlFeature> {
    companion object : Entity.Factory<SqlFeature>()
    val featureId : String
    val featureName : String
    val subFeatureId : String?
    val subFeatureName : String?
    val isSupported : String
    val isVerifiedBy : String?
    val comments : String?
}

interface SqlPackage : Entity<SqlPackage> {
    companion object : Entity.Factory<SqlPackage>()
    val featureId : String
    val featureName : String
    val isSupported : String
    val isVerified : String?
    val comments : String?
}