// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
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
         * `RequestedConversionTime.ofPublicListConversionDate(publicListConversionDate)`.
         */
        fun requestedConversionTime(publicListConversionDate: PublicListConversionDate) =
            requestedConversionTime(
                RequestedConversionTime.ofPublicListConversionDate(publicListConversionDate)
            )

        /**
         * Alias for calling [requestedConversionTime] with
         * `RequestedConversionTime.ofPublicListConversionInactivity(publicListConversionInactivity)`.
         */
        fun requestedConversionTime(
            publicListConversionInactivity: PublicListConversionInactivity
        ) =
            requestedConversionTime(
                RequestedConversionTime.ofPublicListConversionInactivity(
                    publicListConversionInactivity
                )
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
        private val publicListConversionDate: PublicListConversionDate? = null,
        private val publicListConversionInactivity: PublicListConversionInactivity? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicListConversionDate(): Optional<PublicListConversionDate> =
            Optional.ofNullable(publicListConversionDate)

        fun publicListConversionInactivity(): Optional<PublicListConversionInactivity> =
            Optional.ofNullable(publicListConversionInactivity)

        fun isPublicListConversionDate(): Boolean = publicListConversionDate != null

        fun isPublicListConversionInactivity(): Boolean = publicListConversionInactivity != null

        fun asPublicListConversionDate(): PublicListConversionDate =
            publicListConversionDate.getOrThrow("publicListConversionDate")

        fun asPublicListConversionInactivity(): PublicListConversionInactivity =
            publicListConversionInactivity.getOrThrow("publicListConversionInactivity")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicListConversionDate != null ->
                    visitor.visitPublicListConversionDate(publicListConversionDate)
                publicListConversionInactivity != null ->
                    visitor.visitPublicListConversionInactivity(publicListConversionInactivity)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): RequestedConversionTime = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicListConversionDate(
                        publicListConversionDate: PublicListConversionDate
                    ) {
                        publicListConversionDate.validate()
                    }

                    override fun visitPublicListConversionInactivity(
                        publicListConversionInactivity: PublicListConversionInactivity
                    ) {
                        publicListConversionInactivity.validate()
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
                    override fun visitPublicListConversionDate(
                        publicListConversionDate: PublicListConversionDate
                    ) = publicListConversionDate.validity()

                    override fun visitPublicListConversionInactivity(
                        publicListConversionInactivity: PublicListConversionInactivity
                    ) = publicListConversionInactivity.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RequestedConversionTime &&
                publicListConversionDate == other.publicListConversionDate &&
                publicListConversionInactivity == other.publicListConversionInactivity
        }

        override fun hashCode(): Int =
            Objects.hash(publicListConversionDate, publicListConversionInactivity)

        override fun toString(): String =
            when {
                publicListConversionDate != null ->
                    "RequestedConversionTime{publicListConversionDate=$publicListConversionDate}"
                publicListConversionInactivity != null ->
                    "RequestedConversionTime{publicListConversionInactivity=$publicListConversionInactivity}"
                _json != null -> "RequestedConversionTime{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid RequestedConversionTime")
            }

        companion object {

            @JvmStatic
            fun ofPublicListConversionDate(publicListConversionDate: PublicListConversionDate) =
                RequestedConversionTime(publicListConversionDate = publicListConversionDate)

            @JvmStatic
            fun ofPublicListConversionInactivity(
                publicListConversionInactivity: PublicListConversionInactivity
            ) =
                RequestedConversionTime(
                    publicListConversionInactivity = publicListConversionInactivity
                )
        }

        /**
         * An interface that defines how to map each variant of [RequestedConversionTime] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitPublicListConversionDate(publicListConversionDate: PublicListConversionDate): T

            fun visitPublicListConversionInactivity(
                publicListConversionInactivity: PublicListConversionInactivity
            ): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicListConversionDate>())?.let {
                                RequestedConversionTime(publicListConversionDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicListConversionInactivity>())
                                ?.let {
                                    RequestedConversionTime(
                                        publicListConversionInactivity = it,
                                        _json = json,
                                    )
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> RequestedConversionTime(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
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
                    value.publicListConversionDate != null ->
                        generator.writeObject(value.publicListConversionDate)
                    value.publicListConversionInactivity != null ->
                        generator.writeObject(value.publicListConversionInactivity)
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
