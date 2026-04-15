// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalLinkAvailabilityAndBusyTimes
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allUsersBusyTimes: JsonField<List<ExternalUserBusyTimes>>,
    private val linkAvailability: JsonField<ExternalLinkAvailability>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allUsersBusyTimes")
        @ExcludeMissing
        allUsersBusyTimes: JsonField<List<ExternalUserBusyTimes>> = JsonMissing.of(),
        @JsonProperty("linkAvailability")
        @ExcludeMissing
        linkAvailability: JsonField<ExternalLinkAvailability> = JsonMissing.of(),
    ) : this(allUsersBusyTimes, linkAvailability, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun allUsersBusyTimes(): List<ExternalUserBusyTimes> =
        allUsersBusyTimes.getRequired("allUsersBusyTimes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkAvailability(): Optional<ExternalLinkAvailability> =
        linkAvailability.getOptional("linkAvailability")

    /**
     * Returns the raw JSON value of [allUsersBusyTimes].
     *
     * Unlike [allUsersBusyTimes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allUsersBusyTimes")
    @ExcludeMissing
    fun _allUsersBusyTimes(): JsonField<List<ExternalUserBusyTimes>> = allUsersBusyTimes

    /**
     * Returns the raw JSON value of [linkAvailability].
     *
     * Unlike [linkAvailability], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("linkAvailability")
    @ExcludeMissing
    fun _linkAvailability(): JsonField<ExternalLinkAvailability> = linkAvailability

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
         * [ExternalLinkAvailabilityAndBusyTimes].
         *
         * The following fields are required:
         * ```java
         * .allUsersBusyTimes()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLinkAvailabilityAndBusyTimes]. */
    class Builder internal constructor() {

        private var allUsersBusyTimes: JsonField<MutableList<ExternalUserBusyTimes>>? = null
        private var linkAvailability: JsonField<ExternalLinkAvailability> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            externalLinkAvailabilityAndBusyTimes: ExternalLinkAvailabilityAndBusyTimes
        ) = apply {
            allUsersBusyTimes =
                externalLinkAvailabilityAndBusyTimes.allUsersBusyTimes.map { it.toMutableList() }
            linkAvailability = externalLinkAvailabilityAndBusyTimes.linkAvailability
            additionalProperties =
                externalLinkAvailabilityAndBusyTimes.additionalProperties.toMutableMap()
        }

        fun allUsersBusyTimes(allUsersBusyTimes: List<ExternalUserBusyTimes>) =
            allUsersBusyTimes(JsonField.of(allUsersBusyTimes))

        /**
         * Sets [Builder.allUsersBusyTimes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allUsersBusyTimes] with a well-typed
         * `List<ExternalUserBusyTimes>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun allUsersBusyTimes(allUsersBusyTimes: JsonField<List<ExternalUserBusyTimes>>) = apply {
            this.allUsersBusyTimes = allUsersBusyTimes.map { it.toMutableList() }
        }

        /**
         * Adds a single [ExternalUserBusyTimes] to [allUsersBusyTimes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllUsersBusyTime(allUsersBusyTime: ExternalUserBusyTimes) = apply {
            allUsersBusyTimes =
                (allUsersBusyTimes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allUsersBusyTimes", it).add(allUsersBusyTime)
                }
        }

        fun linkAvailability(linkAvailability: ExternalLinkAvailability) =
            linkAvailability(JsonField.of(linkAvailability))

        /**
         * Sets [Builder.linkAvailability] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkAvailability] with a well-typed
         * [ExternalLinkAvailability] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun linkAvailability(linkAvailability: JsonField<ExternalLinkAvailability>) = apply {
            this.linkAvailability = linkAvailability
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
         * Returns an immutable instance of [ExternalLinkAvailabilityAndBusyTimes].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .allUsersBusyTimes()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLinkAvailabilityAndBusyTimes =
            ExternalLinkAvailabilityAndBusyTimes(
                checkRequired("allUsersBusyTimes", allUsersBusyTimes).map { it.toImmutable() },
                linkAvailability,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLinkAvailabilityAndBusyTimes = apply {
        if (validated) {
            return@apply
        }

        allUsersBusyTimes().forEach { it.validate() }
        linkAvailability().ifPresent { it.validate() }
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
        (allUsersBusyTimes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (linkAvailability.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLinkAvailabilityAndBusyTimes &&
            allUsersBusyTimes == other.allUsersBusyTimes &&
            linkAvailability == other.linkAvailability &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(allUsersBusyTimes, linkAvailability, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLinkAvailabilityAndBusyTimes{allUsersBusyTimes=$allUsersBusyTimes, linkAvailability=$linkAvailability, additionalProperties=$additionalProperties}"
}
