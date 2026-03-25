// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.datastudio.datasource

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class DataSourceUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val datasourceId: JsonField<Long>,
    private val datasourceName: JsonField<String>,
    private val previewLink: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("datasourceId")
        @ExcludeMissing
        datasourceId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("datasourceName")
        @ExcludeMissing
        datasourceName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previewLink")
        @ExcludeMissing
        previewLink: JsonField<String> = JsonMissing.of(),
    ) : this(datasourceId, datasourceName, previewLink, mutableMapOf())

    /**
     * The unique identifier for the data source. It is an integer formatted as int64.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasourceId(): Long = datasourceId.getRequired("datasourceId")

    /**
     * The name of the data source. It is a string.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasourceName(): String = datasourceName.getRequired("datasourceName")

    /**
     * A URL string that provides a preview link for the data source.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previewLink(): String = previewLink.getRequired("previewLink")

    /**
     * Returns the raw JSON value of [datasourceId].
     *
     * Unlike [datasourceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("datasourceId")
    @ExcludeMissing
    fun _datasourceId(): JsonField<Long> = datasourceId

    /**
     * Returns the raw JSON value of [datasourceName].
     *
     * Unlike [datasourceName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("datasourceName")
    @ExcludeMissing
    fun _datasourceName(): JsonField<String> = datasourceName

    /**
     * Returns the raw JSON value of [previewLink].
     *
     * Unlike [previewLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previewLink") @ExcludeMissing fun _previewLink(): JsonField<String> = previewLink

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
         * Returns a mutable builder for constructing an instance of [DataSourceUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .datasourceId()
         * .datasourceName()
         * .previewLink()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataSourceUpdateResponse]. */
    class Builder internal constructor() {

        private var datasourceId: JsonField<Long>? = null
        private var datasourceName: JsonField<String>? = null
        private var previewLink: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataSourceUpdateResponse: DataSourceUpdateResponse) = apply {
            datasourceId = dataSourceUpdateResponse.datasourceId
            datasourceName = dataSourceUpdateResponse.datasourceName
            previewLink = dataSourceUpdateResponse.previewLink
            additionalProperties = dataSourceUpdateResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the data source. It is an integer formatted as int64. */
        fun datasourceId(datasourceId: Long) = datasourceId(JsonField.of(datasourceId))

        /**
         * Sets [Builder.datasourceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasourceId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasourceId(datasourceId: JsonField<Long>) = apply { this.datasourceId = datasourceId }

        /** The name of the data source. It is a string. */
        fun datasourceName(datasourceName: String) = datasourceName(JsonField.of(datasourceName))

        /**
         * Sets [Builder.datasourceName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasourceName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun datasourceName(datasourceName: JsonField<String>) = apply {
            this.datasourceName = datasourceName
        }

        /** A URL string that provides a preview link for the data source. */
        fun previewLink(previewLink: String) = previewLink(JsonField.of(previewLink))

        /**
         * Sets [Builder.previewLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previewLink] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previewLink(previewLink: JsonField<String>) = apply { this.previewLink = previewLink }

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
         * Returns an immutable instance of [DataSourceUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasourceId()
         * .datasourceName()
         * .previewLink()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataSourceUpdateResponse =
            DataSourceUpdateResponse(
                checkRequired("datasourceId", datasourceId),
                checkRequired("datasourceName", datasourceName),
                checkRequired("previewLink", previewLink),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataSourceUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        datasourceId()
        datasourceName()
        previewLink()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (datasourceId.asKnown().isPresent) 1 else 0) +
            (if (datasourceName.asKnown().isPresent) 1 else 0) +
            (if (previewLink.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataSourceUpdateResponse &&
            datasourceId == other.datasourceId &&
            datasourceName == other.datasourceName &&
            previewLink == other.previewLink &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(datasourceId, datasourceName, previewLink, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataSourceUpdateResponse{datasourceId=$datasourceId, datasourceName=$datasourceName, previewLink=$previewLink, additionalProperties=$additionalProperties}"
}
