// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.calling.transcripts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TranscriptCreateUtterance
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endTimeMillis: JsonField<Int>,
    private val speaker: JsonField<Speaker>,
    private val startTimeMillis: JsonField<Int>,
    private val text: JsonField<String>,
    private val languageCode: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("endTimeMillis")
        @ExcludeMissing
        endTimeMillis: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("speaker") @ExcludeMissing speaker: JsonField<Speaker> = JsonMissing.of(),
        @JsonProperty("startTimeMillis")
        @ExcludeMissing
        startTimeMillis: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("languageCode")
        @ExcludeMissing
        languageCode: JsonField<String> = JsonMissing.of(),
    ) : this(endTimeMillis, speaker, startTimeMillis, text, languageCode, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTimeMillis(): Int = endTimeMillis.getRequired("endTimeMillis")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun speaker(): Speaker = speaker.getRequired("speaker")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTimeMillis(): Int = startTimeMillis.getRequired("startTimeMillis")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun languageCode(): Optional<String> = languageCode.getOptional("languageCode")

    /**
     * Returns the raw JSON value of [endTimeMillis].
     *
     * Unlike [endTimeMillis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTimeMillis")
    @ExcludeMissing
    fun _endTimeMillis(): JsonField<Int> = endTimeMillis

    /**
     * Returns the raw JSON value of [speaker].
     *
     * Unlike [speaker], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speaker") @ExcludeMissing fun _speaker(): JsonField<Speaker> = speaker

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
         * Returns a mutable builder for constructing an instance of [TranscriptCreateUtterance].
         *
         * The following fields are required:
         * ```java
         * .endTimeMillis()
         * .speaker()
         * .startTimeMillis()
         * .text()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TranscriptCreateUtterance]. */
    class Builder internal constructor() {

        private var endTimeMillis: JsonField<Int>? = null
        private var speaker: JsonField<Speaker>? = null
        private var startTimeMillis: JsonField<Int>? = null
        private var text: JsonField<String>? = null
        private var languageCode: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transcriptCreateUtterance: TranscriptCreateUtterance) = apply {
            endTimeMillis = transcriptCreateUtterance.endTimeMillis
            speaker = transcriptCreateUtterance.speaker
            startTimeMillis = transcriptCreateUtterance.startTimeMillis
            text = transcriptCreateUtterance.text
            languageCode = transcriptCreateUtterance.languageCode
            additionalProperties = transcriptCreateUtterance.additionalProperties.toMutableMap()
        }

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

        fun speaker(speaker: Speaker) = speaker(JsonField.of(speaker))

        /**
         * Sets [Builder.speaker] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speaker] with a well-typed [Speaker] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speaker(speaker: JsonField<Speaker>) = apply { this.speaker = speaker }

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
         * Returns an immutable instance of [TranscriptCreateUtterance].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .endTimeMillis()
         * .speaker()
         * .startTimeMillis()
         * .text()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TranscriptCreateUtterance =
            TranscriptCreateUtterance(
                checkRequired("endTimeMillis", endTimeMillis),
                checkRequired("speaker", speaker),
                checkRequired("startTimeMillis", startTimeMillis),
                checkRequired("text", text),
                languageCode,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TranscriptCreateUtterance = apply {
        if (validated) {
            return@apply
        }

        endTimeMillis()
        speaker().validate()
        startTimeMillis()
        text()
        languageCode()
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
        (if (endTimeMillis.asKnown().isPresent) 1 else 0) +
            (speaker.asKnown().getOrNull()?.validity() ?: 0) +
            (if (startTimeMillis.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (languageCode.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TranscriptCreateUtterance &&
            endTimeMillis == other.endTimeMillis &&
            speaker == other.speaker &&
            startTimeMillis == other.startTimeMillis &&
            text == other.text &&
            languageCode == other.languageCode &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            endTimeMillis,
            speaker,
            startTimeMillis,
            text,
            languageCode,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TranscriptCreateUtterance{endTimeMillis=$endTimeMillis, speaker=$speaker, startTimeMillis=$startTimeMillis, text=$text, languageCode=$languageCode, additionalProperties=$additionalProperties}"
}
