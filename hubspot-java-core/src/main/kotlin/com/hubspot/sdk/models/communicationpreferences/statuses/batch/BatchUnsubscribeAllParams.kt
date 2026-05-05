// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences.statuses.batch

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.Params
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.http.Headers
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import com.hubspot.sdk.models.BatchInputString
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Unsubscribe a set of contacts from all email subscriptions. */
class BatchUnsubscribeAllParams
private constructor(
    private val channel: Channel,
    private val businessUnitId: Long?,
    private val verbose: Boolean?,
    private val batchInputString: BatchInputString,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The communication channel from which subscribers will be unsubscribed. This parameter is
     * required and currently supports only 'EMAIL'.
     */
    fun channel(): Channel = channel

    /**
     * An optional integer representing the business unit ID for which the operation is being
     * performed.
     */
    fun businessUnitId(): Optional<Long> = Optional.ofNullable(businessUnitId)

    /**
     * A boolean indicating whether to include detailed information in the response. Defaults to
     * false.
     */
    fun verbose(): Optional<Boolean> = Optional.ofNullable(verbose)

    fun batchInputString(): BatchInputString = batchInputString

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        batchInputString._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BatchUnsubscribeAllParams].
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .batchInputString()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchUnsubscribeAllParams]. */
    class Builder internal constructor() {

        private var channel: Channel? = null
        private var businessUnitId: Long? = null
        private var verbose: Boolean? = null
        private var batchInputString: BatchInputString? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(batchUnsubscribeAllParams: BatchUnsubscribeAllParams) = apply {
            channel = batchUnsubscribeAllParams.channel
            businessUnitId = batchUnsubscribeAllParams.businessUnitId
            verbose = batchUnsubscribeAllParams.verbose
            batchInputString = batchUnsubscribeAllParams.batchInputString
            additionalHeaders = batchUnsubscribeAllParams.additionalHeaders.toBuilder()
            additionalQueryParams = batchUnsubscribeAllParams.additionalQueryParams.toBuilder()
        }

        /**
         * The communication channel from which subscribers will be unsubscribed. This parameter is
         * required and currently supports only 'EMAIL'.
         */
        fun channel(channel: Channel) = apply { this.channel = channel }

        /**
         * An optional integer representing the business unit ID for which the operation is being
         * performed.
         */
        fun businessUnitId(businessUnitId: Long?) = apply { this.businessUnitId = businessUnitId }

        /**
         * Alias for [Builder.businessUnitId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun businessUnitId(businessUnitId: Long) = businessUnitId(businessUnitId as Long?)

        /** Alias for calling [Builder.businessUnitId] with `businessUnitId.orElse(null)`. */
        fun businessUnitId(businessUnitId: Optional<Long>) =
            businessUnitId(businessUnitId.getOrNull())

        /**
         * A boolean indicating whether to include detailed information in the response. Defaults to
         * false.
         */
        fun verbose(verbose: Boolean?) = apply { this.verbose = verbose }

        /**
         * Alias for [Builder.verbose].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun verbose(verbose: Boolean) = verbose(verbose as Boolean?)

        /** Alias for calling [Builder.verbose] with `verbose.orElse(null)`. */
        fun verbose(verbose: Optional<Boolean>) = verbose(verbose.getOrNull())

        fun batchInputString(batchInputString: BatchInputString) = apply {
            this.batchInputString = batchInputString
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BatchUnsubscribeAllParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .channel()
         * .batchInputString()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchUnsubscribeAllParams =
            BatchUnsubscribeAllParams(
                checkRequired("channel", channel),
                businessUnitId,
                verbose,
                checkRequired("batchInputString", batchInputString),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): BatchInputString = batchInputString

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("channel", channel.toString())
                businessUnitId?.let { put("businessUnitId", it.toString()) }
                verbose?.let { put("verbose", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * The communication channel from which subscribers will be unsubscribed. This parameter is
     * required and currently supports only 'EMAIL'.
     */
    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL = of("EMAIL")

            @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
        enum class Known {
            EMAIL
        }

        /**
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL,
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
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
                EMAIL -> Value.EMAIL
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
                EMAIL -> Known.EMAIL
                else -> throw HubSpotInvalidDataException("Unknown Channel: $value")
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
        fun validate(): Channel = apply {
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

            return other is Channel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchUnsubscribeAllParams &&
            channel == other.channel &&
            businessUnitId == other.businessUnitId &&
            verbose == other.verbose &&
            batchInputString == other.batchInputString &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channel,
            businessUnitId,
            verbose,
            batchInputString,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BatchUnsubscribeAllParams{channel=$channel, businessUnitId=$businessUnitId, verbose=$verbose, batchInputString=$batchInputString, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
