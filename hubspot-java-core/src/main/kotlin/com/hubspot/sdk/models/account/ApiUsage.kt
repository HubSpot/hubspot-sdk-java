// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiUsage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val collectedAt: JsonField<OffsetDateTime>,
    private val currentUsage: JsonField<Int>,
    private val fetchStatus: JsonField<FetchStatus>,
    private val name: JsonField<String>,
    private val usageLimit: JsonField<Int>,
    private val resetsAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("collectedAt")
        @ExcludeMissing
        collectedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currentUsage")
        @ExcludeMissing
        currentUsage: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fetchStatus")
        @ExcludeMissing
        fetchStatus: JsonField<FetchStatus> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usageLimit") @ExcludeMissing usageLimit: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("resetsAt")
        @ExcludeMissing
        resetsAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(collectedAt, currentUsage, fetchStatus, name, usageLimit, resetsAt, mutableMapOf())

    /**
     * Indicates when the cache was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun collectedAt(): OffsetDateTime = collectedAt.getRequired("collectedAt")

    /**
     * How many API calls an account has made for the current day.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currentUsage(): Int = currentUsage.getRequired("currentUsage")

    /**
     * Status of fetching the information, including if the data came from the cache.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fetchStatus(): FetchStatus = fetchStatus.getRequired("fetchStatus")

    /**
     * Name of the limit type.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Limits by which a single integration can consume the HubSpot public APIs.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usageLimit(): Int = usageLimit.getRequired("usageLimit")

    /**
     * Time that the limit will reset.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resetsAt(): Optional<OffsetDateTime> = resetsAt.getOptional("resetsAt")

    /**
     * Returns the raw JSON value of [collectedAt].
     *
     * Unlike [collectedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("collectedAt")
    @ExcludeMissing
    fun _collectedAt(): JsonField<OffsetDateTime> = collectedAt

    /**
     * Returns the raw JSON value of [currentUsage].
     *
     * Unlike [currentUsage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currentUsage") @ExcludeMissing fun _currentUsage(): JsonField<Int> = currentUsage

    /**
     * Returns the raw JSON value of [fetchStatus].
     *
     * Unlike [fetchStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fetchStatus")
    @ExcludeMissing
    fun _fetchStatus(): JsonField<FetchStatus> = fetchStatus

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [usageLimit].
     *
     * Unlike [usageLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usageLimit") @ExcludeMissing fun _usageLimit(): JsonField<Int> = usageLimit

    /**
     * Returns the raw JSON value of [resetsAt].
     *
     * Unlike [resetsAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resetsAt") @ExcludeMissing fun _resetsAt(): JsonField<OffsetDateTime> = resetsAt

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
         * Returns a mutable builder for constructing an instance of [ApiUsage].
         *
         * The following fields are required:
         * ```java
         * .collectedAt()
         * .currentUsage()
         * .fetchStatus()
         * .name()
         * .usageLimit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiUsage]. */
    class Builder internal constructor() {

        private var collectedAt: JsonField<OffsetDateTime>? = null
        private var currentUsage: JsonField<Int>? = null
        private var fetchStatus: JsonField<FetchStatus>? = null
        private var name: JsonField<String>? = null
        private var usageLimit: JsonField<Int>? = null
        private var resetsAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiUsage: ApiUsage) = apply {
            collectedAt = apiUsage.collectedAt
            currentUsage = apiUsage.currentUsage
            fetchStatus = apiUsage.fetchStatus
            name = apiUsage.name
            usageLimit = apiUsage.usageLimit
            resetsAt = apiUsage.resetsAt
            additionalProperties = apiUsage.additionalProperties.toMutableMap()
        }

        /** Indicates when the cache was last updated. */
        fun collectedAt(collectedAt: OffsetDateTime) = collectedAt(JsonField.of(collectedAt))

        /**
         * Sets [Builder.collectedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.collectedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun collectedAt(collectedAt: JsonField<OffsetDateTime>) = apply {
            this.collectedAt = collectedAt
        }

        /** How many API calls an account has made for the current day. */
        fun currentUsage(currentUsage: Int) = currentUsage(JsonField.of(currentUsage))

        /**
         * Sets [Builder.currentUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentUsage] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentUsage(currentUsage: JsonField<Int>) = apply { this.currentUsage = currentUsage }

        /** Status of fetching the information, including if the data came from the cache. */
        fun fetchStatus(fetchStatus: FetchStatus) = fetchStatus(JsonField.of(fetchStatus))

        /**
         * Sets [Builder.fetchStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fetchStatus] with a well-typed [FetchStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fetchStatus(fetchStatus: JsonField<FetchStatus>) = apply {
            this.fetchStatus = fetchStatus
        }

        /** Name of the limit type. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Limits by which a single integration can consume the HubSpot public APIs. */
        fun usageLimit(usageLimit: Int) = usageLimit(JsonField.of(usageLimit))

        /**
         * Sets [Builder.usageLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageLimit] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun usageLimit(usageLimit: JsonField<Int>) = apply { this.usageLimit = usageLimit }

        /** Time that the limit will reset. */
        fun resetsAt(resetsAt: OffsetDateTime) = resetsAt(JsonField.of(resetsAt))

        /**
         * Sets [Builder.resetsAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resetsAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun resetsAt(resetsAt: JsonField<OffsetDateTime>) = apply { this.resetsAt = resetsAt }

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
         * Returns an immutable instance of [ApiUsage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .collectedAt()
         * .currentUsage()
         * .fetchStatus()
         * .name()
         * .usageLimit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiUsage =
            ApiUsage(
                checkRequired("collectedAt", collectedAt),
                checkRequired("currentUsage", currentUsage),
                checkRequired("fetchStatus", fetchStatus),
                checkRequired("name", name),
                checkRequired("usageLimit", usageLimit),
                resetsAt,
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
    fun validate(): ApiUsage = apply {
        if (validated) {
            return@apply
        }

        collectedAt()
        currentUsage()
        fetchStatus().validate()
        name()
        usageLimit()
        resetsAt()
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
        (if (collectedAt.asKnown().isPresent) 1 else 0) +
            (if (currentUsage.asKnown().isPresent) 1 else 0) +
            (fetchStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (usageLimit.asKnown().isPresent) 1 else 0) +
            (if (resetsAt.asKnown().isPresent) 1 else 0)

    /** Status of fetching the information, including if the data came from the cache. */
    class FetchStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CACHED = of("CACHED")

            @JvmField val FAILURE = of("FAILURE")

            @JvmField val NOTFOUND = of("NOTFOUND")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmField val TIMEOUT = of("TIMEOUT")

            @JvmStatic fun of(value: String) = FetchStatus(JsonField.of(value))
        }

        /** An enum containing [FetchStatus]'s known values. */
        enum class Known {
            CACHED,
            FAILURE,
            NOTFOUND,
            SUCCESS,
            TIMEOUT,
        }

        /**
         * An enum containing [FetchStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FetchStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CACHED,
            FAILURE,
            NOTFOUND,
            SUCCESS,
            TIMEOUT,
            /**
             * An enum member indicating that [FetchStatus] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CACHED -> Value.CACHED
                FAILURE -> Value.FAILURE
                NOTFOUND -> Value.NOTFOUND
                SUCCESS -> Value.SUCCESS
                TIMEOUT -> Value.TIMEOUT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CACHED -> Known.CACHED
                FAILURE -> Known.FAILURE
                NOTFOUND -> Known.NOTFOUND
                SUCCESS -> Known.SUCCESS
                TIMEOUT -> Known.TIMEOUT
                else -> throw HubSpotInvalidDataException("Unknown FetchStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FetchStatus = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FetchStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiUsage &&
            collectedAt == other.collectedAt &&
            currentUsage == other.currentUsage &&
            fetchStatus == other.fetchStatus &&
            name == other.name &&
            usageLimit == other.usageLimit &&
            resetsAt == other.resetsAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            collectedAt,
            currentUsage,
            fetchStatus,
            name,
            usageLimit,
            resetsAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiUsage{collectedAt=$collectedAt, currentUsage=$currentUsage, fetchStatus=$fetchStatus, name=$name, usageLimit=$usageLimit, resetsAt=$resetsAt, additionalProperties=$additionalProperties}"
}
