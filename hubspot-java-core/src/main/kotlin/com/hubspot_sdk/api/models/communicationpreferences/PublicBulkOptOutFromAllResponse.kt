// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicBulkOptOutFromAllResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val subscriberIdString: JsonField<String>,
    private val statuses: JsonField<List<PublicStatus>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("subscriberIdString")
        @ExcludeMissing
        subscriberIdString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statuses")
        @ExcludeMissing
        statuses: JsonField<List<PublicStatus>> = JsonMissing.of(),
    ) : this(subscriberIdString, statuses, mutableMapOf())

    /**
     * The email address of the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriberIdString(): String = subscriberIdString.getRequired("subscriberIdString")

    /**
     * An array of subscription status objects for the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statuses(): Optional<List<PublicStatus>> = statuses.getOptional("statuses")

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
     * Returns the raw JSON value of [statuses].
     *
     * Unlike [statuses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("statuses")
    @ExcludeMissing
    fun _statuses(): JsonField<List<PublicStatus>> = statuses

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
         * Returns a mutable builder for constructing an instance of
         * [PublicBulkOptOutFromAllResponse].
         *
         * The following fields are required:
         * ```java
         * .subscriberIdString()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicBulkOptOutFromAllResponse]. */
    class Builder internal constructor() {

        private var subscriberIdString: JsonField<String>? = null
        private var statuses: JsonField<MutableList<PublicStatus>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicBulkOptOutFromAllResponse: PublicBulkOptOutFromAllResponse) =
            apply {
                subscriberIdString = publicBulkOptOutFromAllResponse.subscriberIdString
                statuses = publicBulkOptOutFromAllResponse.statuses.map { it.toMutableList() }
                additionalProperties =
                    publicBulkOptOutFromAllResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [PublicBulkOptOutFromAllResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .subscriberIdString()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicBulkOptOutFromAllResponse =
            PublicBulkOptOutFromAllResponse(
                checkRequired("subscriberIdString", subscriberIdString),
                (statuses ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicBulkOptOutFromAllResponse = apply {
        if (validated) {
            return@apply
        }

        subscriberIdString()
        statuses().ifPresent { it.forEach { it.validate() } }
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
        (if (subscriberIdString.asKnown().isPresent) 1 else 0) +
            (statuses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicBulkOptOutFromAllResponse &&
            subscriberIdString == other.subscriberIdString &&
            statuses == other.statuses &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(subscriberIdString, statuses, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicBulkOptOutFromAllResponse{subscriberIdString=$subscriberIdString, statuses=$statuses, additionalProperties=$additionalProperties}"
}
