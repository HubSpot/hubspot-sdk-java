// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

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
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
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

        /**
         * Alias for calling [addCallerIdMatch] with
         * `CallerIdMatch.ofContactCallerId(contactCallerId)`.
         */
        fun addCallerIdMatch(contactCallerId: ContactCallerId) =
            addCallerIdMatch(CallerIdMatch.ofContactCallerId(contactCallerId))

        /**
         * Alias for calling [addCallerIdMatch] with
         * `CallerIdMatch.ofCompanyCallerId(companyCallerId)`.
         */
        fun addCallerIdMatch(companyCallerId: CompanyCallerId) =
            addCallerIdMatch(CallerIdMatch.ofCompanyCallerId(companyCallerId))

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
        private val contactCallerId: ContactCallerId? = null,
        private val companyCallerId: CompanyCallerId? = null,
        private val _json: JsonValue? = null,
    ) {

        fun contactCallerId(): Optional<ContactCallerId> = Optional.ofNullable(contactCallerId)

        fun companyCallerId(): Optional<CompanyCallerId> = Optional.ofNullable(companyCallerId)

        fun isContactCallerId(): Boolean = contactCallerId != null

        fun isCompanyCallerId(): Boolean = companyCallerId != null

        fun asContactCallerId(): ContactCallerId = contactCallerId.getOrThrow("contactCallerId")

        fun asCompanyCallerId(): CompanyCallerId = companyCallerId.getOrThrow("companyCallerId")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                contactCallerId != null -> visitor.visitContactCallerId(contactCallerId)
                companyCallerId != null -> visitor.visitCompanyCallerId(companyCallerId)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): CallerIdMatch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitContactCallerId(contactCallerId: ContactCallerId) {
                        contactCallerId.validate()
                    }

                    override fun visitCompanyCallerId(companyCallerId: CompanyCallerId) {
                        companyCallerId.validate()
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
                    override fun visitContactCallerId(contactCallerId: ContactCallerId) =
                        contactCallerId.validity()

                    override fun visitCompanyCallerId(companyCallerId: CompanyCallerId) =
                        companyCallerId.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CallerIdMatch &&
                contactCallerId == other.contactCallerId &&
                companyCallerId == other.companyCallerId
        }

        override fun hashCode(): Int = Objects.hash(contactCallerId, companyCallerId)

        override fun toString(): String =
            when {
                contactCallerId != null -> "CallerIdMatch{contactCallerId=$contactCallerId}"
                companyCallerId != null -> "CallerIdMatch{companyCallerId=$companyCallerId}"
                _json != null -> "CallerIdMatch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CallerIdMatch")
            }

        companion object {

            @JvmStatic
            fun ofContactCallerId(contactCallerId: ContactCallerId) =
                CallerIdMatch(contactCallerId = contactCallerId)

            @JvmStatic
            fun ofCompanyCallerId(companyCallerId: CompanyCallerId) =
                CallerIdMatch(companyCallerId = companyCallerId)
        }

        /**
         * An interface that defines how to map each variant of [CallerIdMatch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitContactCallerId(contactCallerId: ContactCallerId): T

            fun visitCompanyCallerId(companyCallerId: CompanyCallerId): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ContactCallerId>())?.let {
                                CallerIdMatch(contactCallerId = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<CompanyCallerId>())?.let {
                                CallerIdMatch(companyCallerId = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> CallerIdMatch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<CallerIdMatch>(CallerIdMatch::class) {

            override fun serialize(
                value: CallerIdMatch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.contactCallerId != null -> generator.writeObject(value.contactCallerId)
                    value.companyCallerId != null -> generator.writeObject(value.companyCallerId)
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
