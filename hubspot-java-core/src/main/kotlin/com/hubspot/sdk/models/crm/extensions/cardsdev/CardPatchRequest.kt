// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardPatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<CardActions>,
    private val display: JsonField<CardDisplayBody>,
    private val fetch: JsonField<CardFetchBodyPatch>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions") @ExcludeMissing actions: JsonField<CardActions> = JsonMissing.of(),
        @JsonProperty("display")
        @ExcludeMissing
        display: JsonField<CardDisplayBody> = JsonMissing.of(),
        @JsonProperty("fetch")
        @ExcludeMissing
        fetch: JsonField<CardFetchBodyPatch> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(actions, display, fetch, title, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actions(): Optional<CardActions> = actions.getOptional("actions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun display(): Optional<CardDisplayBody> = display.getOptional("display")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fetch(): Optional<CardFetchBodyPatch> = fetch.getOptional("fetch")

    /**
     * The top-level title for this card. Displayed to users in the CRM UI.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<CardActions> = actions

    /**
     * Returns the raw JSON value of [display].
     *
     * Unlike [display], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display") @ExcludeMissing fun _display(): JsonField<CardDisplayBody> = display

    /**
     * Returns the raw JSON value of [fetch].
     *
     * Unlike [fetch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fetch") @ExcludeMissing fun _fetch(): JsonField<CardFetchBodyPatch> = fetch

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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

        /** Returns a mutable builder for constructing an instance of [CardPatchRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardPatchRequest]. */
    class Builder internal constructor() {

        private var actions: JsonField<CardActions> = JsonMissing.of()
        private var display: JsonField<CardDisplayBody> = JsonMissing.of()
        private var fetch: JsonField<CardFetchBodyPatch> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardPatchRequest: CardPatchRequest) = apply {
            actions = cardPatchRequest.actions
            display = cardPatchRequest.display
            fetch = cardPatchRequest.fetch
            title = cardPatchRequest.title
            additionalProperties = cardPatchRequest.additionalProperties.toMutableMap()
        }

        fun actions(actions: CardActions) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed [CardActions] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<CardActions>) = apply { this.actions = actions }

        fun display(display: CardDisplayBody) = display(JsonField.of(display))

        /**
         * Sets [Builder.display] to an arbitrary JSON value.
         *
         * You should usually call [Builder.display] with a well-typed [CardDisplayBody] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun display(display: JsonField<CardDisplayBody>) = apply { this.display = display }

        fun fetch(fetch: CardFetchBodyPatch) = fetch(JsonField.of(fetch))

        /**
         * Sets [Builder.fetch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fetch] with a well-typed [CardFetchBodyPatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fetch(fetch: JsonField<CardFetchBodyPatch>) = apply { this.fetch = fetch }

        /** The top-level title for this card. Displayed to users in the CRM UI. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [CardPatchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardPatchRequest =
            CardPatchRequest(actions, display, fetch, title, additionalProperties.toMutableMap())
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
    fun validate(): CardPatchRequest = apply {
        if (validated) {
            return@apply
        }

        actions().ifPresent { it.validate() }
        display().ifPresent { it.validate() }
        fetch().ifPresent { it.validate() }
        title()
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
        (actions.asKnown().getOrNull()?.validity() ?: 0) +
            (display.asKnown().getOrNull()?.validity() ?: 0) +
            (fetch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPatchRequest &&
            actions == other.actions &&
            display == other.display &&
            fetch == other.fetch &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(actions, display, fetch, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardPatchRequest{actions=$actions, display=$display, fetch=$fetch, title=$title, additionalProperties=$additionalProperties}"
}
