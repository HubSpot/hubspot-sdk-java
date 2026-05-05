// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
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

class CardFetchBody
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cardType: JsonField<CardType>,
    private val objectTypes: JsonField<List<CardObjectTypeBody>>,
    private val targetUrl: JsonField<String>,
    private val serverlessFunction: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cardType") @ExcludeMissing cardType: JsonField<CardType> = JsonMissing.of(),
        @JsonProperty("objectTypes")
        @ExcludeMissing
        objectTypes: JsonField<List<CardObjectTypeBody>> = JsonMissing.of(),
        @JsonProperty("targetUrl") @ExcludeMissing targetUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serverlessFunction")
        @ExcludeMissing
        serverlessFunction: JsonField<String> = JsonMissing.of(),
    ) : this(cardType, objectTypes, targetUrl, serverlessFunction, mutableMapOf())

    /**
     * A deprecated field to determine the type of card returned.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardType(): CardType = cardType.getRequired("cardType")

    /**
     * An array of CRM object types where this card should be displayed. HubSpot will call your data
     * fetch URL whenever a user visits a record page of the types defined here.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypes(): List<CardObjectTypeBody> = objectTypes.getRequired("objectTypes")

    /**
     * URL to a service endpoints that will respond with card details. HubSpot will call this
     * endpoint each time a user visits a CRM record page where this card should be displayed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetUrl(): String = targetUrl.getRequired("targetUrl")

    /**
     * A deprecated field to specify serverless functionality with the card
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serverlessFunction(): Optional<String> =
        serverlessFunction.getOptional("serverlessFunction")

    /**
     * Returns the raw JSON value of [cardType].
     *
     * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardType") @ExcludeMissing fun _cardType(): JsonField<CardType> = cardType

    /**
     * Returns the raw JSON value of [objectTypes].
     *
     * Unlike [objectTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypes")
    @ExcludeMissing
    fun _objectTypes(): JsonField<List<CardObjectTypeBody>> = objectTypes

    /**
     * Returns the raw JSON value of [targetUrl].
     *
     * Unlike [targetUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetUrl") @ExcludeMissing fun _targetUrl(): JsonField<String> = targetUrl

    /**
     * Returns the raw JSON value of [serverlessFunction].
     *
     * Unlike [serverlessFunction], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("serverlessFunction")
    @ExcludeMissing
    fun _serverlessFunction(): JsonField<String> = serverlessFunction

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
         * Returns a mutable builder for constructing an instance of [CardFetchBody].
         *
         * The following fields are required:
         * ```java
         * .cardType()
         * .objectTypes()
         * .targetUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardFetchBody]. */
    class Builder internal constructor() {

        private var cardType: JsonField<CardType>? = null
        private var objectTypes: JsonField<MutableList<CardObjectTypeBody>>? = null
        private var targetUrl: JsonField<String>? = null
        private var serverlessFunction: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardFetchBody: CardFetchBody) = apply {
            cardType = cardFetchBody.cardType
            objectTypes = cardFetchBody.objectTypes.map { it.toMutableList() }
            targetUrl = cardFetchBody.targetUrl
            serverlessFunction = cardFetchBody.serverlessFunction
            additionalProperties = cardFetchBody.additionalProperties.toMutableMap()
        }

        /** A deprecated field to determine the type of card returned. */
        fun cardType(cardType: CardType) = cardType(JsonField.of(cardType))

        /**
         * Sets [Builder.cardType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardType] with a well-typed [CardType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardType(cardType: JsonField<CardType>) = apply { this.cardType = cardType }

        /**
         * An array of CRM object types where this card should be displayed. HubSpot will call your
         * data fetch URL whenever a user visits a record page of the types defined here.
         */
        fun objectTypes(objectTypes: List<CardObjectTypeBody>) =
            objectTypes(JsonField.of(objectTypes))

        /**
         * Sets [Builder.objectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypes] with a well-typed
         * `List<CardObjectTypeBody>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun objectTypes(objectTypes: JsonField<List<CardObjectTypeBody>>) = apply {
            this.objectTypes = objectTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [CardObjectTypeBody] to [objectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectType(objectType: CardObjectTypeBody) = apply {
            objectTypes =
                (objectTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectTypes", it).add(objectType)
                }
        }

        /**
         * URL to a service endpoints that will respond with card details. HubSpot will call this
         * endpoint each time a user visits a CRM record page where this card should be displayed.
         */
        fun targetUrl(targetUrl: String) = targetUrl(JsonField.of(targetUrl))

        /**
         * Sets [Builder.targetUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetUrl(targetUrl: JsonField<String>) = apply { this.targetUrl = targetUrl }

        /** A deprecated field to specify serverless functionality with the card */
        fun serverlessFunction(serverlessFunction: String) =
            serverlessFunction(JsonField.of(serverlessFunction))

        /**
         * Sets [Builder.serverlessFunction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serverlessFunction] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serverlessFunction(serverlessFunction: JsonField<String>) = apply {
            this.serverlessFunction = serverlessFunction
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
         * Returns an immutable instance of [CardFetchBody].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cardType()
         * .objectTypes()
         * .targetUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardFetchBody =
            CardFetchBody(
                checkRequired("cardType", cardType),
                checkRequired("objectTypes", objectTypes).map { it.toImmutable() },
                checkRequired("targetUrl", targetUrl),
                serverlessFunction,
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
    fun validate(): CardFetchBody = apply {
        if (validated) {
            return@apply
        }

        cardType().validate()
        objectTypes().forEach { it.validate() }
        targetUrl()
        serverlessFunction()
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
        (cardType.asKnown().getOrNull()?.validity() ?: 0) +
            (objectTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (targetUrl.asKnown().isPresent) 1 else 0) +
            (if (serverlessFunction.asKnown().isPresent) 1 else 0)

    /** A deprecated field to determine the type of card returned. */
    class CardType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EXTERNAL = of("EXTERNAL")

            @JvmField val SERVERLESS = of("SERVERLESS")

            @JvmStatic fun of(value: String) = CardType(JsonField.of(value))
        }

        /** An enum containing [CardType]'s known values. */
        enum class Known {
            EXTERNAL,
            SERVERLESS,
        }

        /**
         * An enum containing [CardType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CardType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXTERNAL,
            SERVERLESS,
            /** An enum member indicating that [CardType] was instantiated with an unknown value. */
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
                EXTERNAL -> Value.EXTERNAL
                SERVERLESS -> Value.SERVERLESS
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
                EXTERNAL -> Known.EXTERNAL
                SERVERLESS -> Known.SERVERLESS
                else -> throw HubSpotInvalidDataException("Unknown CardType: $value")
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
        fun validate(): CardType = apply {
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

            return other is CardType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardFetchBody &&
            cardType == other.cardType &&
            objectTypes == other.objectTypes &&
            targetUrl == other.targetUrl &&
            serverlessFunction == other.serverlessFunction &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cardType, objectTypes, targetUrl, serverlessFunction, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardFetchBody{cardType=$cardType, objectTypes=$objectTypes, targetUrl=$targetUrl, serverlessFunction=$serverlessFunction, additionalProperties=$additionalProperties}"
}
