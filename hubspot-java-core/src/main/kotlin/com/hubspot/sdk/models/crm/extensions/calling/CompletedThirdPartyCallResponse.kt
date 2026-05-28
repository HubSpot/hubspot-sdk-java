// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CompletedThirdPartyCallResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callerIdMatches: JsonField<List<CallerIdMatch>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("callerIdMatches")
        @ExcludeMissing
        callerIdMatches: JsonField<List<CallerIdMatch>> = JsonMissing.of()
    ) : this(callerIdMatches, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callerIdMatches(): List<CallerIdMatch> = callerIdMatches.getRequired("callerIdMatches")

    /**
     * Returns the raw JSON value of [callerIdMatches].
     *
     * Unlike [callerIdMatches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callerIdMatches")
    @ExcludeMissing
    fun _callerIdMatches(): JsonField<List<CallerIdMatch>> = callerIdMatches

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
         * [CompletedThirdPartyCallResponse].
         *
         * The following fields are required:
         * ```java
         * .callerIdMatches()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompletedThirdPartyCallResponse]. */
    class Builder internal constructor() {

        private var callerIdMatches: JsonField<MutableList<CallerIdMatch>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(completedThirdPartyCallResponse: CompletedThirdPartyCallResponse) =
            apply {
                callerIdMatches =
                    completedThirdPartyCallResponse.callerIdMatches.map { it.toMutableList() }
                additionalProperties =
                    completedThirdPartyCallResponse.additionalProperties.toMutableMap()
            }

        fun callerIdMatches(callerIdMatches: List<CallerIdMatch>) =
            callerIdMatches(JsonField.of(callerIdMatches))

        /**
         * Sets [Builder.callerIdMatches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerIdMatches] with a well-typed `List<CallerIdMatch>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun callerIdMatches(callerIdMatches: JsonField<List<CallerIdMatch>>) = apply {
            this.callerIdMatches = callerIdMatches.map { it.toMutableList() }
        }

        /**
         * Adds a single [CallerIdMatch] to [callerIdMatches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCallerIdMatch(callerIdMatch: CallerIdMatch) = apply {
            callerIdMatches =
                (callerIdMatches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("callerIdMatches", it).add(callerIdMatch)
                }
        }

        /** Alias for calling [addCallerIdMatch] with `CallerIdMatch.ofContact(contact)`. */
        fun addCallerIdMatch(contact: ContactCallerId) =
            addCallerIdMatch(CallerIdMatch.ofContact(contact))

        /**
         * Alias for calling [addCallerIdMatch] with the following:
         * ```java
         * ContactCallerId.builder()
         *     .callerIdType(ContactCallerId.CallerIdType.CONTACT)
         *     .objectCoordinates(objectCoordinates)
         *     .build()
         * ```
         */
        fun addContactCallerIdMatch(objectCoordinates: ObjectCoordinates) =
            addCallerIdMatch(
                ContactCallerId.builder()
                    .callerIdType(ContactCallerId.CallerIdType.CONTACT)
                    .objectCoordinates(objectCoordinates)
                    .build()
            )

        /** Alias for calling [addCallerIdMatch] with `CallerIdMatch.ofCompany(company)`. */
        fun addCallerIdMatch(company: CompanyCallerId) =
            addCallerIdMatch(CallerIdMatch.ofCompany(company))

        /**
         * Alias for calling [addCallerIdMatch] with the following:
         * ```java
         * CompanyCallerId.builder()
         *     .callerIdType(CompanyCallerId.CallerIdType.COMPANY)
         *     .objectCoordinates(objectCoordinates)
         *     .build()
         * ```
         */
        fun addCompanyCallerIdMatch(objectCoordinates: ObjectCoordinates) =
            addCallerIdMatch(
                CompanyCallerId.builder()
                    .callerIdType(CompanyCallerId.CallerIdType.COMPANY)
                    .objectCoordinates(objectCoordinates)
                    .build()
            )

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
         * Returns an immutable instance of [CompletedThirdPartyCallResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callerIdMatches()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompletedThirdPartyCallResponse =
            CompletedThirdPartyCallResponse(
                checkRequired("callerIdMatches", callerIdMatches).map { it.toImmutable() },
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
    fun validate(): CompletedThirdPartyCallResponse = apply {
        if (validated) {
            return@apply
        }

        callerIdMatches().forEach { it.validate() }
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
        (callerIdMatches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    @JsonDeserialize(using = CallerIdMatch.Deserializer::class)
    @JsonSerialize(using = CallerIdMatch.Serializer::class)
    class CallerIdMatch
    private constructor(
        private val contact: ContactCallerId? = null,
        private val company: CompanyCallerId? = null,
        private val _json: JsonValue? = null,
    ) {

        fun contact(): Optional<ContactCallerId> = Optional.ofNullable(contact)

        fun company(): Optional<CompanyCallerId> = Optional.ofNullable(company)

        fun isContact(): Boolean = contact != null

        fun isCompany(): Boolean = company != null

        fun asContact(): ContactCallerId = contact.getOrThrow("contact")

        fun asCompany(): CompanyCallerId = company.getOrThrow("company")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.hubspot.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = callerIdMatch.accept(new CallerIdMatch.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitContact(ContactCallerId contact) {
         *         return Optional.of(contact.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws HubSpotInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                contact != null -> visitor.visitContact(contact)
                company != null -> visitor.visitCompany(company)
                else -> visitor.unknown(_json)
            }

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
        fun validate(): CallerIdMatch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitContact(contact: ContactCallerId) {
                        contact.validate()
                    }

                    override fun visitCompany(company: CompanyCallerId) {
                        company.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitContact(contact: ContactCallerId) = contact.validity()

                    override fun visitCompany(company: CompanyCallerId) = company.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallerIdMatch && contact == other.contact && company == other.company
        }

        override fun hashCode(): Int = Objects.hash(contact, company)

        override fun toString(): String =
            when {
                contact != null -> "CallerIdMatch{contact=$contact}"
                company != null -> "CallerIdMatch{company=$company}"
                _json != null -> "CallerIdMatch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CallerIdMatch")
            }

        companion object {

            @JvmStatic fun ofContact(contact: ContactCallerId) = CallerIdMatch(contact = contact)

            @JvmStatic fun ofCompany(company: CompanyCallerId) = CallerIdMatch(company = company)
        }

        /**
         * An interface that defines how to map each variant of [CallerIdMatch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitContact(contact: ContactCallerId): T

            fun visitCompany(company: CompanyCallerId): T

            /**
             * Maps an unknown variant of [CallerIdMatch] to a value of type [T].
             *
             * An instance of [CallerIdMatch] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown CallerIdMatch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<CallerIdMatch>(CallerIdMatch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CallerIdMatch {
                val json = JsonValue.fromJsonNode(node)
                val callerIdType =
                    json.asObject().getOrNull()?.get("callerIdType")?.asString()?.getOrNull()

                when (callerIdType) {
                    "CONTACT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ContactCallerId>())?.let {
                            CallerIdMatch(contact = it, _json = json)
                        } ?: CallerIdMatch(_json = json)
                    }
                    "COMPANY" -> {
                        return tryDeserialize(node, jacksonTypeRef<CompanyCallerId>())?.let {
                            CallerIdMatch(company = it, _json = json)
                        } ?: CallerIdMatch(_json = json)
                    }
                }

                return CallerIdMatch(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<CallerIdMatch>(CallerIdMatch::class) {

            override fun serialize(
                value: CallerIdMatch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.contact != null -> generator.writeObject(value.contact)
                    value.company != null -> generator.writeObject(value.company)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CallerIdMatch")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompletedThirdPartyCallResponse &&
            callerIdMatches == other.callerIdMatches &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(callerIdMatches, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompletedThirdPartyCallResponse{callerIdMatches=$callerIdMatches, additionalProperties=$additionalProperties}"
}
