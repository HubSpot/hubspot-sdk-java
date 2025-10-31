// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.apps

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set a feature flag for an app. For example, update the `hs-hide-crm-cards` flag's `defaultState`
 * to `ON` to hide classic CRM cards from new installs.
 */
class AppUpdateParams
private constructor(
    private val appId: Int,
    private val flagName: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun appId(): Int = appId

    fun flagName(): Optional<String> = Optional.ofNullable(flagName)

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultState(): DefaultState = body.defaultState()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrideState(): Optional<OverrideState> = body.overrideState()

    /**
     * Returns the raw JSON value of [defaultState].
     *
     * Unlike [defaultState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _defaultState(): JsonField<DefaultState> = body._defaultState()

    /**
     * Returns the raw JSON value of [overrideState].
     *
     * Unlike [overrideState], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overrideState(): JsonField<OverrideState> = body._overrideState()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AppUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .defaultState()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AppUpdateParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var flagName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(appUpdateParams: AppUpdateParams) = apply {
            appId = appUpdateParams.appId
            flagName = appUpdateParams.flagName
            body = appUpdateParams.body.toBuilder()
            additionalHeaders = appUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = appUpdateParams.additionalQueryParams.toBuilder()
        }

        fun appId(appId: Int) = apply { this.appId = appId }

        fun flagName(flagName: String?) = apply { this.flagName = flagName }

        /** Alias for calling [Builder.flagName] with `flagName.orElse(null)`. */
        fun flagName(flagName: Optional<String>) = flagName(flagName.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [defaultState]
         * - [overrideState]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun defaultState(defaultState: DefaultState) = apply { body.defaultState(defaultState) }

        /**
         * Sets [Builder.defaultState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultState] with a well-typed [DefaultState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultState(defaultState: JsonField<DefaultState>) = apply {
            body.defaultState(defaultState)
        }

        fun overrideState(overrideState: OverrideState) = apply {
            body.overrideState(overrideState)
        }

        /**
         * Sets [Builder.overrideState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrideState] with a well-typed [OverrideState] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overrideState(overrideState: JsonField<OverrideState>) = apply {
            body.overrideState(overrideState)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
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
         * Returns an immutable instance of [AppUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .defaultState()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AppUpdateParams =
            AppUpdateParams(
                checkRequired("appId", appId),
                flagName,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> appId.toString()
            1 -> flagName ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val defaultState: JsonField<DefaultState>,
        private val overrideState: JsonField<OverrideState>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("defaultState")
            @ExcludeMissing
            defaultState: JsonField<DefaultState> = JsonMissing.of(),
            @JsonProperty("overrideState")
            @ExcludeMissing
            overrideState: JsonField<OverrideState> = JsonMissing.of(),
        ) : this(defaultState, overrideState, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun defaultState(): DefaultState = defaultState.getRequired("defaultState")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun overrideState(): Optional<OverrideState> = overrideState.getOptional("overrideState")

        /**
         * Returns the raw JSON value of [defaultState].
         *
         * Unlike [defaultState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("defaultState")
        @ExcludeMissing
        fun _defaultState(): JsonField<DefaultState> = defaultState

        /**
         * Returns the raw JSON value of [overrideState].
         *
         * Unlike [overrideState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overrideState")
        @ExcludeMissing
        fun _overrideState(): JsonField<OverrideState> = overrideState

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .defaultState()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var defaultState: JsonField<DefaultState>? = null
            private var overrideState: JsonField<OverrideState> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                defaultState = body.defaultState
                overrideState = body.overrideState
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun defaultState(defaultState: DefaultState) = defaultState(JsonField.of(defaultState))

            /**
             * Sets [Builder.defaultState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultState] with a well-typed [DefaultState] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun defaultState(defaultState: JsonField<DefaultState>) = apply {
                this.defaultState = defaultState
            }

            fun overrideState(overrideState: OverrideState) =
                overrideState(JsonField.of(overrideState))

            /**
             * Sets [Builder.overrideState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overrideState] with a well-typed [OverrideState]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun overrideState(overrideState: JsonField<OverrideState>) = apply {
                this.overrideState = overrideState
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .defaultState()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("defaultState", defaultState),
                    overrideState,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            defaultState().validate()
            overrideState().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (defaultState.asKnown().getOrNull()?.validity() ?: 0) +
                (overrideState.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                defaultState == other.defaultState &&
                overrideState == other.overrideState &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(defaultState, overrideState, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{defaultState=$defaultState, overrideState=$overrideState, additionalProperties=$additionalProperties}"
    }

    class DefaultState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val OFF = of("OFF")

            @JvmField val ON = of("ON")

            @JvmField val ABSENT = of("ABSENT")

            @JvmStatic fun of(value: String) = DefaultState(JsonField.of(value))
        }

        /** An enum containing [DefaultState]'s known values. */
        enum class Known {
            OFF,
            ON,
            ABSENT,
        }

        /**
         * An enum containing [DefaultState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DefaultState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OFF,
            ON,
            ABSENT,
            /**
             * An enum member indicating that [DefaultState] was instantiated with an unknown value.
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
                OFF -> Value.OFF
                ON -> Value.ON
                ABSENT -> Value.ABSENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OFF -> Known.OFF
                ON -> Known.ON
                ABSENT -> Known.ABSENT
                else -> throw HubspotInvalidDataException("Unknown DefaultState: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DefaultState = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is DefaultState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class OverrideState @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val OFF = of("OFF")

            @JvmField val ON = of("ON")

            @JvmField val ABSENT = of("ABSENT")

            @JvmStatic fun of(value: String) = OverrideState(JsonField.of(value))
        }

        /** An enum containing [OverrideState]'s known values. */
        enum class Known {
            OFF,
            ON,
            ABSENT,
        }

        /**
         * An enum containing [OverrideState]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [OverrideState] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OFF,
            ON,
            ABSENT,
            /**
             * An enum member indicating that [OverrideState] was instantiated with an unknown
             * value.
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
                OFF -> Value.OFF
                ON -> Value.ON
                ABSENT -> Value.ABSENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                OFF -> Known.OFF
                ON -> Known.ON
                ABSENT -> Known.ABSENT
                else -> throw HubspotInvalidDataException("Unknown OverrideState: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): OverrideState = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is OverrideState && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AppUpdateParams &&
            appId == other.appId &&
            flagName == other.flagName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, flagName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AppUpdateParams{appId=$appId, flagName=$flagName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
