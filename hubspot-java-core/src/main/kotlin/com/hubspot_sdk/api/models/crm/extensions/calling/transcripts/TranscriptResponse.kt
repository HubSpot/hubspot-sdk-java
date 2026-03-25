// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class TranscriptResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val engagementId: JsonField<Long>,
    private val transcriptSource: JsonField<TranscriptSource>,
    private val transcriptUtterances: JsonField<List<TranscriptUtterance>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("engagementId")
        @ExcludeMissing
        engagementId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transcriptSource")
        @ExcludeMissing
        transcriptSource: JsonField<TranscriptSource> = JsonMissing.of(),
        @JsonProperty("transcriptUtterances")
        @ExcludeMissing
        transcriptUtterances: JsonField<List<TranscriptUtterance>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        engagementId,
        transcriptSource,
        transcriptUtterances,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun engagementId(): Long = engagementId.getRequired("engagementId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transcriptSource(): TranscriptSource = transcriptSource.getRequired("transcriptSource")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transcriptUtterances(): List<TranscriptUtterance> =
        transcriptUtterances.getRequired("transcriptUtterances")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [engagementId].
     *
     * Unlike [engagementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engagementId")
    @ExcludeMissing
    fun _engagementId(): JsonField<Long> = engagementId

    /**
     * Returns the raw JSON value of [transcriptSource].
     *
     * Unlike [transcriptSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcriptSource")
    @ExcludeMissing
    fun _transcriptSource(): JsonField<TranscriptSource> = transcriptSource

    /**
     * Returns the raw JSON value of [transcriptUtterances].
     *
     * Unlike [transcriptUtterances], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transcriptUtterances")
    @ExcludeMissing
    fun _transcriptUtterances(): JsonField<List<TranscriptUtterance>> = transcriptUtterances

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [TranscriptResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .engagementId()
         * .transcriptSource()
         * .transcriptUtterances()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var engagementId: JsonField<Long>? = null
        private var transcriptSource: JsonField<TranscriptSource>? = null
        private var transcriptUtterances: JsonField<MutableList<TranscriptUtterance>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptResponse: TranscriptResponse) = apply {
            id = transcriptResponse.id
            createdAt = transcriptResponse.createdAt
            engagementId = transcriptResponse.engagementId
            transcriptSource = transcriptResponse.transcriptSource
            transcriptUtterances =
                transcriptResponse.transcriptUtterances.map { it.toMutableList() }
            updatedAt = transcriptResponse.updatedAt
            additionalProperties = transcriptResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun engagementId(engagementId: Long) = engagementId(JsonField.of(engagementId))

        /**
         * Sets [Builder.engagementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engagementId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engagementId(engagementId: JsonField<Long>) = apply { this.engagementId = engagementId }

        fun transcriptSource(transcriptSource: TranscriptSource) =
            transcriptSource(JsonField.of(transcriptSource))

        /**
         * Sets [Builder.transcriptSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptSource] with a well-typed [TranscriptSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transcriptSource(transcriptSource: JsonField<TranscriptSource>) = apply {
            this.transcriptSource = transcriptSource
        }

        fun transcriptUtterances(transcriptUtterances: List<TranscriptUtterance>) =
            transcriptUtterances(JsonField.of(transcriptUtterances))

        /**
         * Sets [Builder.transcriptUtterances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptUtterances] with a well-typed
         * `List<TranscriptUtterance>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun transcriptUtterances(transcriptUtterances: JsonField<List<TranscriptUtterance>>) =
            apply {
                this.transcriptUtterances = transcriptUtterances.map { it.toMutableList() }
            }

        /**
         * Adds a single [TranscriptUtterance] to [transcriptUtterances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTranscriptUtterance(transcriptUtterance: TranscriptUtterance) = apply {
            transcriptUtterances =
                (transcriptUtterances ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transcriptUtterances", it).add(transcriptUtterance)
                }
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [TranscriptResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .engagementId()
         * .transcriptSource()
         * .transcriptUtterances()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptResponse =
            TranscriptResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("engagementId", engagementId),
                checkRequired("transcriptSource", transcriptSource),
                checkRequired("transcriptUtterances", transcriptUtterances).map {
                    it.toImmutable()
                },
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        engagementId()
        transcriptSource().validate()
        transcriptUtterances().forEach { it.validate() }
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (engagementId.asKnown().isPresent) 1 else 0) +
            (transcriptSource.asKnown().getOrNull()?.validity() ?: 0) +
            (transcriptUtterances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class TranscriptSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HUBSPOT_GENERATED = of("HUBSPOT_GENERATED")

            @JvmField val INTEGRATOR_GENERATED = of("INTEGRATOR_GENERATED")

            @JvmStatic fun of(value: String) = TranscriptSource(JsonField.of(value))
        }

        /** An enum containing [TranscriptSource]'s known values. */
        enum class Known {
            HUBSPOT_GENERATED,
            INTEGRATOR_GENERATED,
        }

        /**
         * An enum containing [TranscriptSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TranscriptSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HUBSPOT_GENERATED,
            INTEGRATOR_GENERATED,
            /**
             * An enum member indicating that [TranscriptSource] was instantiated with an unknown
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
                HUBSPOT_GENERATED -> Value.HUBSPOT_GENERATED
                INTEGRATOR_GENERATED -> Value.INTEGRATOR_GENERATED
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
                HUBSPOT_GENERATED -> Known.HUBSPOT_GENERATED
                INTEGRATOR_GENERATED -> Known.INTEGRATOR_GENERATED
                else -> throw HubspotInvalidDataException("Unknown TranscriptSource: $value")
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

        fun validate(): TranscriptSource = apply {
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

            return other is TranscriptSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            engagementId == other.engagementId &&
            transcriptSource == other.transcriptSource &&
            transcriptUtterances == other.transcriptUtterances &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            engagementId,
            transcriptSource,
            transcriptUtterances,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptResponse{id=$id, createdAt=$createdAt, engagementId=$engagementId, transcriptSource=$transcriptSource, transcriptUtterances=$transcriptUtterances, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
