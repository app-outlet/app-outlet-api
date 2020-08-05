package com.appoutlet.api.model.appoutlet

import com.appoutlet.api.model.ApplicationPackageType
import com.appoutlet.api.model.ApplicationStore
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document
data class AppOutletApplication(
    @Id
	val id: String,
    val name: String,
    val summary: String?,
    val description: String?,
    val developer: String,
    val license: String?,
    val homepage: String?,
    val bugtrackerUrl: String?,
    val donationUrl: String?,
    val icon: String?,
    val downloadUrl: String?,
    val version: String?,
	// TODO: replace Date by LocalDateTime
    val lastReleaseDate: Date?,
    val creationDate: Date?,
    val tags: List<String>?,
    val screenshots: List<String>?,
    val store: ApplicationStore,
    val packageType: ApplicationPackageType,
    val packageName: String? = null,
    val confinement: String? = null
)