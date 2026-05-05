// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicWideStatusBulkResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val subscriberIdString: JsonField<String>,
    private val wideStatuses: JsonField<List<PublicWideStatus>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wideStatuses")
        @ExcludeMissing
        wideStatuses: JsonField<List<PublicWideStatus>> = JsonMissing.of(),
    ) : this(subscriberIdString, wideStatuses, mutableMapOf())

    /**
     * The contact's email address.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * An array containing the wide status results for the operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun wideStatuses(): List<PublicWideStatus> = wideStatuses.getRequired("wideStatuses")

    /**
     * Returns the raw JSON value of [subscriberIdString].
     *
     * Unlike [subscriberIdString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriberIdString")
    @ExcludeMissing
    fun _subscriberIdString(): JsonField<String> = subscriberIdString

    /**
     * Returns the raw JSON value of [wideStatuses].
     *
     * Unlike [wideStatuses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wideStatuses")
    @ExcludeMissing
    fun _wideStatuses(): JsonField<List<PublicWideStatus>> = wideStatuses

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
         * Returns a mutable builder for constructing an instance of [PublicWideStatusBulkResponse].
         *
         * The following fields are required:
         * ```java
         * .subscriberIdString()
         * .wideStatuses()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicWideStatusBulkResponse]. */
    class Builder internal constructor() {

        private var subscriberIdString: JsonField<String>? = null
        private var wideStatuses: JsonField<MutableList<PublicWideStatus>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicWideStatusBulkResponse: PublicWideStatusBulkResponse) = apply {
            subscriberIdString = publicWideStatusBulkResponse.subscriberIdString
            wideStatuses = publicWideStatusBulkResponse.wideStatuses.map { it.toMutableList() }
            additionalProperties = publicWideStatusBulkResponse.additionalProperties.toMutableMap()
        }

        /** The contact's email address. */
        fun subscriberIdString(subscriberIdString: String) =
            subscriberIdString(JsonField.of(subscriberIdString))

        /**
         * Sets [Builder.subscriberIdString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriberIdString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriberIdString(subscriberIdString: JsonField<String>) = apply {
            this.subscriberIdString = subscriberIdString
        }

        /** An array containing the wide status results for the operation. */
        fun wideStatuses(wideStatuses: List<PublicWideStatus>) =
            wideStatuses(JsonField.of(wideStatuses))

        /**
         * Sets [Builder.wideStatuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wideStatuses] with a well-typed `List<PublicWideStatus>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun wideStatuses(wideStatuses: JsonField<List<PublicWideStatus>>) = apply {
            this.wideStatuses = wideStatuses.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicWideStatus] to [wideStatuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWideStatus(wideStatus: PublicWideStatus) = apply {
            wideStatuses =
                (wideStatuses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("wideStatuses", it).add(wideStatus)
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
         * Returns an immutable instance of [PublicWideStatusBulkResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subscriberIdString()
         * .wideStatuses()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicWideStatusBulkResponse =
            PublicWideStatusBulkResponse(
                checkRequired("subscriberIdString", subscriberIdString),
                checkRequired("wideStatuses", wideStatuses).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PublicWideStatusBulkResponse = apply {
        if (validated) {
            return@apply
        }

        subscriberIdString()
        wideStatuses().forEach { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: HubSpotInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (wideStatuses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicWideStatusBulkResponse &&
            subscriberIdString == other.subscriberIdString &&
            wideStatuses == other.wideStatuses &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(subscriberIdString, wideStatuses, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicWideStatusBulkResponse{subscriberIdString=$subscriberIdString, wideStatuses=$wideStatuses, additionalProperties=$additionalProperties}"
}
