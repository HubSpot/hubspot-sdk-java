// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.functions

import com.fasterxml.jackson.annotation.JsonCreator
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a specific function from a given definition. */
class FunctionGetParams
private constructor(
    private val appId: Int,
    private val definitionId: String,
    private val functionType: FunctionType,
    private val functionId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun definitionId(): String = definitionId

    fun functionType(): FunctionType = functionType

    fun functionId(): Optional<String> = Optional.ofNullable(functionId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FunctionGetParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .definitionId()
         * .functionType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FunctionGetParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var definitionId: String? = null
        private var functionType: FunctionType? = null
        private var functionId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(functionGetParams: FunctionGetParams) = apply {
            appId = functionGetParams.appId
            definitionId = functionGetParams.definitionId
            functionType = functionGetParams.functionType
            functionId = functionGetParams.functionId
            additionalHeaders = functionGetParams.additionalHeaders.toBuilder()
            additionalQueryParams = functionGetParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun definitionId(definitionId: String) = apply { this.definitionId = definitionId }

        fun functionType(functionType: FunctionType) = apply { this.functionType = functionType }

        fun functionId(functionId: String?) = apply { this.functionId = functionId }

        /** Alias for calling [Builder.functionId] with `functionId.orElse(null)`. */
        fun functionId(functionId: Optional<String>) = functionId(functionId.getOrNull())

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
         * Returns an immutable instance of [FunctionGetParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .definitionId()
         * .functionType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FunctionGetParams =
            FunctionGetParams(
                checkRequired("appId", appId),
                checkRequired("definitionId", definitionId),
                checkRequired("functionType", functionType),
                functionId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> definitionId
            2 -> functionType.toString()
            3 -> functionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class FunctionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val POST_ACTION_EXECUTION = of("POST_ACTION_EXECUTION")

            @JvmField val POST_FETCH_OPTIONS = of("POST_FETCH_OPTIONS")

            @JvmField val PRE_ACTION_EXECUTION = of("PRE_ACTION_EXECUTION")

            @JvmField val PRE_FETCH_OPTIONS = of("PRE_FETCH_OPTIONS")

            @JvmStatic fun of(value: String) = FunctionType(JsonField.of(value))
        }

        /** An enum containing [FunctionType]'s known values. */
        enum class Known {
            POST_ACTION_EXECUTION,
            POST_FETCH_OPTIONS,
            PRE_ACTION_EXECUTION,
            PRE_FETCH_OPTIONS,
        }

        /**
         * An enum containing [FunctionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FunctionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            POST_ACTION_EXECUTION,
            POST_FETCH_OPTIONS,
            PRE_ACTION_EXECUTION,
            PRE_FETCH_OPTIONS,
            /**
             * An enum member indicating that [FunctionType] was instantiated with an unknown value.
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
                POST_ACTION_EXECUTION -> Value.POST_ACTION_EXECUTION
                POST_FETCH_OPTIONS -> Value.POST_FETCH_OPTIONS
                PRE_ACTION_EXECUTION -> Value.PRE_ACTION_EXECUTION
                PRE_FETCH_OPTIONS -> Value.PRE_FETCH_OPTIONS
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
                POST_ACTION_EXECUTION -> Known.POST_ACTION_EXECUTION
                POST_FETCH_OPTIONS -> Known.POST_FETCH_OPTIONS
                PRE_ACTION_EXECUTION -> Known.PRE_ACTION_EXECUTION
                PRE_FETCH_OPTIONS -> Known.PRE_FETCH_OPTIONS
                else -> throw HubSpotInvalidDataException("Unknown FunctionType: $value")
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

        fun validate(): FunctionType = apply {
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

            return other is FunctionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FunctionGetParams &&
            appId == other.appId &&
            definitionId == other.definitionId &&
            functionType == other.functionType &&
            functionId == other.functionId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            appId,
            definitionId,
            functionType,
            functionId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FunctionGetParams{appId=$appId, definitionId=$definitionId, functionType=$functionType, functionId=$functionId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
