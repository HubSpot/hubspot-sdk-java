// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class TranscriptCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val engagementId: JsonField<Long>,
    private val transcriptCreateUtterances: JsonField<List<TranscriptCreateUtterance>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("engagementId")
        @ExcludeMissing
        engagementId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("transcriptCreateUtterances")
        @ExcludeMissing
        transcriptCreateUtterances: JsonField<List<TranscriptCreateUtterance>> = JsonMissing.of(),
    ) : this(engagementId, transcriptCreateUtterances, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun engagementId(): Long = engagementId.getRequired("engagementId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transcriptCreateUtterances(): List<TranscriptCreateUtterance> =
        transcriptCreateUtterances.getRequired("transcriptCreateUtterances")

    /**
     * Returns the raw JSON value of [engagementId].
     *
     * Unlike [engagementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("engagementId")
    @ExcludeMissing
    fun _engagementId(): JsonField<Long> = engagementId

    /**
     * Returns the raw JSON value of [transcriptCreateUtterances].
     *
     * Unlike [transcriptCreateUtterances], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("transcriptCreateUtterances")
    @ExcludeMissing
    fun _transcriptCreateUtterances(): JsonField<List<TranscriptCreateUtterance>> =
        transcriptCreateUtterances

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
         * Returns a mutable builder for constructing an instance of [TranscriptCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .engagementId()
         * .transcriptCreateUtterances()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptCreateRequest]. */
    class Builder internal constructor() {

        private var engagementId: JsonField<Long>? = null
        private var transcriptCreateUtterances: JsonField<MutableList<TranscriptCreateUtterance>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptCreateRequest: TranscriptCreateRequest) = apply {
            engagementId = transcriptCreateRequest.engagementId
            transcriptCreateUtterances =
                transcriptCreateRequest.transcriptCreateUtterances.map { it.toMutableList() }
            additionalProperties = transcriptCreateRequest.additionalProperties.toMutableMap()
        }

        fun engagementId(engagementId: Long) = engagementId(JsonField.of(engagementId))

        /**
         * Sets [Builder.engagementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.engagementId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun engagementId(engagementId: JsonField<Long>) = apply { this.engagementId = engagementId }

        fun transcriptCreateUtterances(
            transcriptCreateUtterances: List<TranscriptCreateUtterance>
        ) = transcriptCreateUtterances(JsonField.of(transcriptCreateUtterances))

        /**
         * Sets [Builder.transcriptCreateUtterances] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transcriptCreateUtterances] with a well-typed
         * `List<TranscriptCreateUtterance>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun transcriptCreateUtterances(
            transcriptCreateUtterances: JsonField<List<TranscriptCreateUtterance>>
        ) = apply {
            this.transcriptCreateUtterances = transcriptCreateUtterances.map { it.toMutableList() }
        }

        /**
         * Adds a single [TranscriptCreateUtterance] to [transcriptCreateUtterances].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTranscriptCreateUtterance(transcriptCreateUtterance: TranscriptCreateUtterance) =
            apply {
                transcriptCreateUtterances =
                    (transcriptCreateUtterances ?: JsonField.of(mutableListOf())).also {
                        checkKnown("transcriptCreateUtterances", it).add(transcriptCreateUtterance)
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
         * Returns an immutable instance of [TranscriptCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .engagementId()
         * .transcriptCreateUtterances()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptCreateRequest =
            TranscriptCreateRequest(
                checkRequired("engagementId", engagementId),
                checkRequired("transcriptCreateUtterances", transcriptCreateUtterances).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptCreateRequest = apply {
        if (validated) {
            return@apply
        }

        engagementId()
        transcriptCreateUtterances().forEach { it.validate() }
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
        (if (engagementId.asKnown().isPresent) 1 else 0) +
            (transcriptCreateUtterances.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptCreateRequest &&
            engagementId == other.engagementId &&
            transcriptCreateUtterances == other.transcriptCreateUtterances &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(engagementId, transcriptCreateUtterances, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptCreateRequest{engagementId=$engagementId, transcriptCreateUtterances=$transcriptCreateUtterances, additionalProperties=$additionalProperties}"
}
