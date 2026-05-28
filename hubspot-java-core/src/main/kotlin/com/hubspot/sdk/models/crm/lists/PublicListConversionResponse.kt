// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicListConversionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listId: JsonField<String>,
    private val convertedAt: JsonField<OffsetDateTime>,
    private val requestedConversionTime: JsonField<RequestedConversionTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("convertedAt")
        @ExcludeMissing
        convertedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("requestedConversionTime")
        @ExcludeMissing
        requestedConversionTime: JsonField<RequestedConversionTime> = JsonMissing.of(),
    ) : this(listId, convertedAt, requestedConversionTime, mutableMapOf())

    /**
     * The unique identifier of the list for which the conversion details are provided.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * The date and time when the list was converted.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun convertedAt(): Optional<OffsetDateTime> = convertedAt.getOptional("convertedAt")

    /**
     * The scheduled time for the list conversion, which can be based on a specific date or
     * inactivity period.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestedConversionTime(): Optional<RequestedConversionTime> =
        requestedConversionTime.getOptional("requestedConversionTime")

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

    /**
     * Returns the raw JSON value of [convertedAt].
     *
     * Unlike [convertedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("convertedAt")
    @ExcludeMissing
    fun _convertedAt(): JsonField<OffsetDateTime> = convertedAt

    /**
     * Returns the raw JSON value of [requestedConversionTime].
     *
     * Unlike [requestedConversionTime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requestedConversionTime")
    @ExcludeMissing
    fun _requestedConversionTime(): JsonField<RequestedConversionTime> = requestedConversionTime

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
         * Returns a mutable builder for constructing an instance of [PublicListConversionResponse].
         *
         * The following fields are required:
         * ```java
         * .listId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicListConversionResponse]. */
    class Builder internal constructor() {

        private var listId: JsonField<String>? = null
        private var convertedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var requestedConversionTime: JsonField<RequestedConversionTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicListConversionResponse: PublicListConversionResponse) = apply {
            listId = publicListConversionResponse.listId
            convertedAt = publicListConversionResponse.convertedAt
            requestedConversionTime = publicListConversionResponse.requestedConversionTime
            additionalProperties = publicListConversionResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the list for which the conversion details are provided. */
        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        /** The date and time when the list was converted. */
        fun convertedAt(convertedAt: OffsetDateTime) = convertedAt(JsonField.of(convertedAt))

        /**
         * Sets [Builder.convertedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.convertedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun convertedAt(convertedAt: JsonField<OffsetDateTime>) = apply {
            this.convertedAt = convertedAt
        }

        /**
         * The scheduled time for the list conversion, which can be based on a specific date or
         * inactivity period.
         */
        fun requestedConversionTime(requestedConversionTime: RequestedConversionTime) =
            requestedConversionTime(JsonField.of(requestedConversionTime))

        /**
         * Sets [Builder.requestedConversionTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedConversionTime] with a well-typed
         * [RequestedConversionTime] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun requestedConversionTime(requestedConversionTime: JsonField<RequestedConversionTime>) =
            apply {
                this.requestedConversionTime = requestedConversionTime
            }

        /**
         * Alias for calling [requestedConversionTime] with
         * `RequestedConversionTime.ofConversionDate(conversionDate)`.
         */
        fun requestedConversionTime(conversionDate: PublicListConversionDate) =
            requestedConversionTime(RequestedConversionTime.ofConversionDate(conversionDate))

        /**
         * Alias for calling [requestedConversionTime] with
         * `RequestedConversionTime.ofInactivity(inactivity)`.
         */
        fun requestedConversionTime(inactivity: PublicListConversionInactivity) =
            requestedConversionTime(RequestedConversionTime.ofInactivity(inactivity))

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
         * Returns an immutable instance of [PublicListConversionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .listId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicListConversionResponse =
            PublicListConversionResponse(
                checkRequired("listId", listId),
                convertedAt,
                requestedConversionTime,
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
    fun validate(): PublicListConversionResponse = apply {
        if (validated) {
            return@apply
        }

        listId()
        convertedAt()
        requestedConversionTime().ifPresent { it.validate() }
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
        (if (listId.asKnown().isPresent) 1 else 0) +
            (if (convertedAt.asKnown().isPresent) 1 else 0) +
            (requestedConversionTime.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The scheduled time for the list conversion, which can be based on a specific date or
     * inactivity period.
     */
    @JsonDeserialize(using = RequestedConversionTime.Deserializer::class)
    @JsonSerialize(using = RequestedConversionTime.Serializer::class)
    class RequestedConversionTime
    private constructor(
        private val conversionDate: PublicListConversionDate? = null,
        private val inactivity: PublicListConversionInactivity? = null,
        private val _json: JsonValue? = null,
    ) {

        fun conversionDate(): Optional<PublicListConversionDate> =
            Optional.ofNullable(conversionDate)

        fun inactivity(): Optional<PublicListConversionInactivity> = Optional.ofNullable(inactivity)

        fun isConversionDate(): Boolean = conversionDate != null

        fun isInactivity(): Boolean = inactivity != null

        fun asConversionDate(): PublicListConversionDate =
            conversionDate.getOrThrow("conversionDate")

        fun asInactivity(): PublicListConversionInactivity = inactivity.getOrThrow("inactivity")

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
         * Optional<String> result = requestedConversionTime.accept(new RequestedConversionTime.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitConversionDate(PublicListConversionDate conversionDate) {
         *         return Optional.of(conversionDate.toString());
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
                conversionDate != null -> visitor.visitConversionDate(conversionDate)
                inactivity != null -> visitor.visitInactivity(inactivity)
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
        fun validate(): RequestedConversionTime = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitConversionDate(conversionDate: PublicListConversionDate) {
                        conversionDate.validate()
                    }

                    override fun visitInactivity(inactivity: PublicListConversionInactivity) {
                        inactivity.validate()
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
                    override fun visitConversionDate(conversionDate: PublicListConversionDate) =
                        conversionDate.validity()

                    override fun visitInactivity(inactivity: PublicListConversionInactivity) =
                        inactivity.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequestedConversionTime &&
                conversionDate == other.conversionDate &&
                inactivity == other.inactivity
        }

        override fun hashCode(): Int = Objects.hash(conversionDate, inactivity)

        override fun toString(): String =
            when {
                conversionDate != null -> "RequestedConversionTime{conversionDate=$conversionDate}"
                inactivity != null -> "RequestedConversionTime{inactivity=$inactivity}"
                _json != null -> "RequestedConversionTime{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid RequestedConversionTime")
            }

        companion object {

            @JvmStatic
            fun ofConversionDate(conversionDate: PublicListConversionDate) =
                RequestedConversionTime(conversionDate = conversionDate)

            @JvmStatic
            fun ofInactivity(inactivity: PublicListConversionInactivity) =
                RequestedConversionTime(inactivity = inactivity)
        }

        /**
         * An interface that defines how to map each variant of [RequestedConversionTime] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitConversionDate(conversionDate: PublicListConversionDate): T

            fun visitInactivity(inactivity: PublicListConversionInactivity): T

            /**
             * Maps an unknown variant of [RequestedConversionTime] to a value of type [T].
             *
             * An instance of [RequestedConversionTime] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown RequestedConversionTime: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<RequestedConversionTime>(RequestedConversionTime::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): RequestedConversionTime {
                val json = JsonValue.fromJsonNode(node)
                val conversionType =
                    json.asObject().getOrNull()?.get("conversionType")?.asString()?.getOrNull()

                when (conversionType) {
                    "CONVERSION_DATE" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicListConversionDate>())
                            ?.let { RequestedConversionTime(conversionDate = it, _json = json) }
                            ?: RequestedConversionTime(_json = json)
                    }
                    "INACTIVITY" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicListConversionInactivity>(),
                            )
                            ?.let { RequestedConversionTime(inactivity = it, _json = json) }
                            ?: RequestedConversionTime(_json = json)
                    }
                }

                return RequestedConversionTime(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<RequestedConversionTime>(RequestedConversionTime::class) {

            override fun serialize(
                value: RequestedConversionTime,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.conversionDate != null -> generator.writeObject(value.conversionDate)
                    value.inactivity != null -> generator.writeObject(value.inactivity)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid RequestedConversionTime")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicListConversionResponse &&
            listId == other.listId &&
            convertedAt == other.convertedAt &&
            requestedConversionTime == other.requestedConversionTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(listId, convertedAt, requestedConversionTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicListConversionResponse{listId=$listId, convertedAt=$convertedAt, requestedConversionTime=$requestedConversionTime, additionalProperties=$additionalProperties}"
}
