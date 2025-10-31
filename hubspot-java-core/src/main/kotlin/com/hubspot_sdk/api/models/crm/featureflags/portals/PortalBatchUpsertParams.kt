// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags.portals

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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Set the portal flag state for multiple HubSpot accounts at once. Use this endpoint to manage flag
 * exposure for groups of HubSpot accounts.
 */
class PortalBatchUpsertParams
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
    fun portalStates(): List<PortalState> = body.portalStates()

    /**
     * Returns the raw JSON value of [portalStates].
     *
     * Unlike [portalStates], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _portalStates(): JsonField<List<PortalState>> = body._portalStates()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PortalBatchUpsertParams].
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .portalStates()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalBatchUpsertParams]. */
    class Builder internal constructor() {

        private var appId: Int? = null
        private var flagName: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(portalBatchUpsertParams: PortalBatchUpsertParams) = apply {
            appId = portalBatchUpsertParams.appId
            flagName = portalBatchUpsertParams.flagName
            body = portalBatchUpsertParams.body.toBuilder()
            additionalHeaders = portalBatchUpsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = portalBatchUpsertParams.additionalQueryParams.toBuilder()
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
         * - [portalStates]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun portalStates(portalStates: List<PortalState>) = apply {
            body.portalStates(portalStates)
        }

        /**
         * Sets [Builder.portalStates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalStates] with a well-typed `List<PortalState>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun portalStates(portalStates: JsonField<List<PortalState>>) = apply {
            body.portalStates(portalStates)
        }

        /**
         * Adds a single [PortalState] to [portalStates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPortalState(portalState: PortalState) = apply { body.addPortalState(portalState) }

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
         * Returns an immutable instance of [PortalBatchUpsertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .appId()
         * .portalStates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalBatchUpsertParams =
            PortalBatchUpsertParams(
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
        private val portalStates: JsonField<List<PortalState>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("portalStates")
            @ExcludeMissing
            portalStates: JsonField<List<PortalState>> = JsonMissing.of()
        ) : this(portalStates, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun portalStates(): List<PortalState> = portalStates.getRequired("portalStates")

        /**
         * Returns the raw JSON value of [portalStates].
         *
         * Unlike [portalStates], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("portalStates")
        @ExcludeMissing
        fun _portalStates(): JsonField<List<PortalState>> = portalStates

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
             * .portalStates()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var portalStates: JsonField<MutableList<PortalState>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                portalStates = body.portalStates.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun portalStates(portalStates: List<PortalState>) =
                portalStates(JsonField.of(portalStates))

            /**
             * Sets [Builder.portalStates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portalStates] with a well-typed `List<PortalState>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun portalStates(portalStates: JsonField<List<PortalState>>) = apply {
                this.portalStates = portalStates.map { it.toMutableList() }
            }

            /**
             * Adds a single [PortalState] to [portalStates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPortalState(portalState: PortalState) = apply {
                portalStates =
                    (portalStates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("portalStates", it).add(portalState)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .portalStates()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("portalStates", portalStates).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            portalStates().forEach { it.validate() }
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
            (portalStates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                portalStates == other.portalStates &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(portalStates, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{portalStates=$portalStates, additionalProperties=$additionalProperties}"
    }

    class PortalState
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val flagState: JsonField<FlagState>,
        private val portalId: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("flagState")
            @ExcludeMissing
            flagState: JsonField<FlagState> = JsonMissing.of(),
            @JsonProperty("portalId") @ExcludeMissing portalId: JsonField<Int> = JsonMissing.of(),
        ) : this(flagState, portalId, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun flagState(): FlagState = flagState.getRequired("flagState")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun portalId(): Int = portalId.getRequired("portalId")

        /**
         * Returns the raw JSON value of [flagState].
         *
         * Unlike [flagState], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flagState")
        @ExcludeMissing
        fun _flagState(): JsonField<FlagState> = flagState

        /**
         * Returns the raw JSON value of [portalId].
         *
         * Unlike [portalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("portalId") @ExcludeMissing fun _portalId(): JsonField<Int> = portalId

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
             * Returns a mutable builder for constructing an instance of [PortalState].
             *
             * The following fields are required:
             * ```java
             * .flagState()
             * .portalId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PortalState]. */
        class Builder internal constructor() {

            private var flagState: JsonField<FlagState>? = null
            private var portalId: JsonField<Int>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(portalState: PortalState) = apply {
                flagState = portalState.flagState
                portalId = portalState.portalId
                additionalProperties = portalState.additionalProperties.toMutableMap()
            }

            fun flagState(flagState: FlagState) = flagState(JsonField.of(flagState))

            /**
             * Sets [Builder.flagState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flagState] with a well-typed [FlagState] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flagState(flagState: JsonField<FlagState>) = apply { this.flagState = flagState }

            fun portalId(portalId: Int) = portalId(JsonField.of(portalId))

            /**
             * Sets [Builder.portalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.portalId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun portalId(portalId: JsonField<Int>) = apply { this.portalId = portalId }

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
             * Returns an immutable instance of [PortalState].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .flagState()
             * .portalId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PortalState =
                PortalState(
                    checkRequired("flagState", flagState),
                    checkRequired("portalId", portalId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PortalState = apply {
            if (validated) {
                return@apply
            }

            flagState().validate()
            portalId()
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
            (flagState.asKnown().getOrNull()?.validity() ?: 0) +
                (if (portalId.asKnown().isPresent) 1 else 0)

        class FlagState @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val OFF = of("OFF")

                @JvmField val ON = of("ON")

                @JvmField val ABSENT = of("ABSENT")

                @JvmStatic fun of(value: String) = FlagState(JsonField.of(value))
            }

            /** An enum containing [FlagState]'s known values. */
            enum class Known {
                OFF,
                ON,
                ABSENT,
            }

            /**
             * An enum containing [FlagState]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FlagState] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OFF,
                ON,
                ABSENT,
                /**
                 * An enum member indicating that [FlagState] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws HubspotInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    OFF -> Known.OFF
                    ON -> Known.ON
                    ABSENT -> Known.ABSENT
                    else -> throw HubspotInvalidDataException("Unknown FlagState: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws HubspotInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    HubspotInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): FlagState = apply {
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

                return other is FlagState && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PortalState &&
                flagState == other.flagState &&
                portalId == other.portalId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(flagState, portalId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PortalState{flagState=$flagState, portalId=$portalId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalBatchUpsertParams &&
            appId == other.appId &&
            flagName == other.flagName &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(appId, flagName, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PortalBatchUpsertParams{appId=$appId, flagName=$flagName, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
