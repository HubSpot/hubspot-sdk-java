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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptUtterance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val endTimeMillis: JsonField<Int>,
    private val startTimeMillis: JsonField<Int>,
    private val text: JsonField<String>,
    private val languageCode: JsonField<String>,
    private val speaker: JsonField<Speaker>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("endTimeMillis")
        @ExcludeMissing
        endTimeMillis: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("startTimeMillis")
        @ExcludeMissing
        startTimeMillis: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("languageCode")
        @ExcludeMissing
        languageCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("speaker") @ExcludeMissing speaker: JsonField<Speaker> = JsonMissing.of(),
    ) : this(id, endTimeMillis, startTimeMillis, text, languageCode, speaker, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTimeMillis(): Int = endTimeMillis.getRequired("endTimeMillis")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimeMillis(): Int = startTimeMillis.getRequired("startTimeMillis")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languageCode(): Optional<String> = languageCode.getOptional("languageCode")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speaker(): Optional<Speaker> = speaker.getOptional("speaker")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [endTimeMillis].
     *
     * Unlike [endTimeMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTimeMillis")
    @ExcludeMissing
    fun _endTimeMillis(): JsonField<Int> = endTimeMillis

    /**
     * Returns the raw JSON value of [startTimeMillis].
     *
     * Unlike [startTimeMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTimeMillis")
    @ExcludeMissing
    fun _startTimeMillis(): JsonField<Int> = startTimeMillis

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [languageCode].
     *
     * Unlike [languageCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("languageCode")
    @ExcludeMissing
    fun _languageCode(): JsonField<String> = languageCode

    /**
     * Returns the raw JSON value of [speaker].
     *
     * Unlike [speaker], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speaker") @ExcludeMissing fun _speaker(): JsonField<Speaker> = speaker

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
         * Returns a mutable builder for constructing an instance of [TranscriptUtterance].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .endTimeMillis()
         * .startTimeMillis()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptUtterance]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var endTimeMillis: JsonField<Int>? = null
        private var startTimeMillis: JsonField<Int>? = null
        private var text: JsonField<String>? = null
        private var languageCode: JsonField<String> = JsonMissing.of()
        private var speaker: JsonField<Speaker> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptUtterance: TranscriptUtterance) = apply {
            id = transcriptUtterance.id
            endTimeMillis = transcriptUtterance.endTimeMillis
            startTimeMillis = transcriptUtterance.startTimeMillis
            text = transcriptUtterance.text
            languageCode = transcriptUtterance.languageCode
            speaker = transcriptUtterance.speaker
            additionalProperties = transcriptUtterance.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun endTimeMillis(endTimeMillis: Int) = endTimeMillis(JsonField.of(endTimeMillis))

        /**
         * Sets [Builder.endTimeMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTimeMillis] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endTimeMillis(endTimeMillis: JsonField<Int>) = apply {
            this.endTimeMillis = endTimeMillis
        }

        fun startTimeMillis(startTimeMillis: Int) = startTimeMillis(JsonField.of(startTimeMillis))

        /**
         * Sets [Builder.startTimeMillis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimeMillis] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startTimeMillis(startTimeMillis: JsonField<Int>) = apply {
            this.startTimeMillis = startTimeMillis
        }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun languageCode(languageCode: String) = languageCode(JsonField.of(languageCode))

        /**
         * Sets [Builder.languageCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.languageCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun languageCode(languageCode: JsonField<String>) = apply {
            this.languageCode = languageCode
        }

        fun speaker(speaker: Speaker) = speaker(JsonField.of(speaker))

        /**
         * Sets [Builder.speaker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speaker] with a well-typed [Speaker] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speaker(speaker: JsonField<Speaker>) = apply { this.speaker = speaker }

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
         * Returns an immutable instance of [TranscriptUtterance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .endTimeMillis()
         * .startTimeMillis()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptUtterance =
            TranscriptUtterance(
                checkRequired("id", id),
                checkRequired("endTimeMillis", endTimeMillis),
                checkRequired("startTimeMillis", startTimeMillis),
                checkRequired("text", text),
                languageCode,
                speaker,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptUtterance = apply {
        if (validated) {
            return@apply
        }

        id()
        endTimeMillis()
        startTimeMillis()
        text()
        languageCode()
        speaker().ifPresent { it.validate() }
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
            (if (endTimeMillis.asKnown().isPresent) 1 else 0) +
            (if (startTimeMillis.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (languageCode.asKnown().isPresent) 1 else 0) +
            (speaker.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptUtterance &&
            id == other.id &&
            endTimeMillis == other.endTimeMillis &&
            startTimeMillis == other.startTimeMillis &&
            text == other.text &&
            languageCode == other.languageCode &&
            speaker == other.speaker &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            endTimeMillis,
            startTimeMillis,
            text,
            languageCode,
            speaker,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptUtterance{id=$id, endTimeMillis=$endTimeMillis, startTimeMillis=$startTimeMillis, text=$text, languageCode=$languageCode, speaker=$speaker, additionalProperties=$additionalProperties}"
}
