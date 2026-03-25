// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.auditlogs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CmsAuditLoggingExportFilters
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectType: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<List<String>> = JsonMissing.of()
    ) : this(objectType, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): List<String> = objectType.getRequired("objectType")

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType")
    @ExcludeMissing
    fun _objectType(): JsonField<List<String>> = objectType

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CmsAuditLoggingExportFilters].
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CmsAuditLoggingExportFilters]. */
    class Builder internal constructor() {

        private var objectType: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cmsAuditLoggingExportFilters: CmsAuditLoggingExportFilters) = apply {
            objectType = cmsAuditLoggingExportFilters.objectType.map { it.toMutableList() }
            additionalProperties = cmsAuditLoggingExportFilters.additionalProperties.toMutableMap()
        }

        fun objectType(objectType: List<String>) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<List<String>>) = apply {
            this.objectType = objectType.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.objectType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectType(objectType: String) = apply {
            this.objectType =
                (this.objectType ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectType", it).add(objectType)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CmsAuditLoggingExportFilters].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CmsAuditLoggingExportFilters =
            CmsAuditLoggingExportFilters(
                checkRequired("objectType", objectType).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CmsAuditLoggingExportFilters = apply {
        if (validated) {
            return@apply
        }

        objectType()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubspotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (objectType.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CmsAuditLoggingExportFilters &&
            objectType == other.objectType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(objectType, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CmsAuditLoggingExportFilters{objectType=$objectType, additionalProperties=$additionalProperties}"
}
