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

class PublicStatusBulkResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val statuses: JsonField<List<PublicStatus>>,
    private val subscriberIdString: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("statuses")
        @ExcludeMissing
        statuses: JsonField<List<PublicStatus>> = JsonMissing.of(),
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
    ) : this(statuses, subscriberIdString, mutableMapOf())

    /**
     * An array of subscription status objects for the contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun statuses(): List<PublicStatus> = statuses.getRequired("statuses")

    /**
     * The email address of the contact.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * Returns the raw JSON value of [statuses].
     *
     * Unlike [statuses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statuses")
    @ExcludeMissing
    fun _statuses(): JsonField<List<PublicStatus>> = statuses

    /**
     * Returns the raw JSON value of [subscriberIdString].
     *
     * Unlike [subscriberIdString], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscriberIdString")
    @ExcludeMissing
    fun _subscriberIdString(): JsonField<String> = subscriberIdString

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
         * Returns a mutable builder for constructing an instance of [PublicStatusBulkResponse].
         *
         * The following fields are required:
         * ```java
         * .statuses()
         * .subscriberIdString()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicStatusBulkResponse]. */
    class Builder internal constructor() {

        private var statuses: JsonField<MutableList<PublicStatus>>? = null
        private var subscriberIdString: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicStatusBulkResponse: PublicStatusBulkResponse) = apply {
            statuses = publicStatusBulkResponse.statuses.map { it.toMutableList() }
            subscriberIdString = publicStatusBulkResponse.subscriberIdString
            additionalProperties = publicStatusBulkResponse.additionalProperties.toMutableMap()
        }

        /** An array of subscription status objects for the contact. */
        fun statuses(statuses: List<PublicStatus>) = statuses(JsonField.of(statuses))

        /**
         * Sets [Builder.statuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statuses] with a well-typed `List<PublicStatus>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statuses(statuses: JsonField<List<PublicStatus>>) = apply {
            this.statuses = statuses.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicStatus] to [statuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: PublicStatus) = apply {
            statuses =
                (statuses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("statuses", it).add(status)
                }
        }

        /** The email address of the contact. */
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
         * Returns an immutable instance of [PublicStatusBulkResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .statuses()
         * .subscriberIdString()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicStatusBulkResponse =
            PublicStatusBulkResponse(
                checkRequired("statuses", statuses).map { it.toImmutable() },
                checkRequired("subscriberIdString", subscriberIdString),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicStatusBulkResponse = apply {
        if (validated) {
            return@apply
        }

        statuses().forEach { it.validate() }
        subscriberIdString()
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
        (statuses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (subscriberIdString.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicStatusBulkResponse &&
            statuses == other.statuses &&
            subscriberIdString == other.subscriberIdString &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(statuses, subscriberIdString, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicStatusBulkResponse{statuses=$statuses, subscriberIdString=$subscriberIdString, additionalProperties=$additionalProperties}"
}
