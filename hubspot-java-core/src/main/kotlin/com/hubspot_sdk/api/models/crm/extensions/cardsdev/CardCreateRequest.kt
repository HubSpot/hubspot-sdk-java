// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

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
import kotlin.jvm.optionals.getOrNull

class CardCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<CardActions>,
    private val display: JsonField<CardDisplayBody>,
    private val fetch: JsonField<CardFetchBody>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions") @ExcludeMissing actions: JsonField<CardActions> = JsonMissing.of(),
        @JsonProperty("display")
        @ExcludeMissing
        display: JsonField<CardDisplayBody> = JsonMissing.of(),
        @JsonProperty("fetch") @ExcludeMissing fetch: JsonField<CardFetchBody> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(actions, display, fetch, title, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): CardActions = actions.getRequired("actions")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun display(): CardDisplayBody = display.getRequired("display")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fetch(): CardFetchBody = fetch.getRequired("fetch")

    /**
     * The top-level title for this card. Displayed to users in the CRM UI.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

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
    @JsonProperty("fetch") @ExcludeMissing fun _fetch(): JsonField<CardFetchBody> = fetch

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

        /**
         * Returns a mutable builder for constructing an instance of [CardCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .display()
         * .fetch()
         * .title()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardCreateRequest]. */
    class Builder internal constructor() {

        private var actions: JsonField<CardActions>? = null
        private var display: JsonField<CardDisplayBody>? = null
        private var fetch: JsonField<CardFetchBody>? = null
        private var title: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardCreateRequest: CardCreateRequest) = apply {
            actions = cardCreateRequest.actions
            display = cardCreateRequest.display
            fetch = cardCreateRequest.fetch
            title = cardCreateRequest.title
            additionalProperties = cardCreateRequest.additionalProperties.toMutableMap()
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

        fun fetch(fetch: CardFetchBody) = fetch(JsonField.of(fetch))

        /**
         * Sets [Builder.fetch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fetch] with a well-typed [CardFetchBody] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fetch(fetch: JsonField<CardFetchBody>) = apply { this.fetch = fetch }

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
         * Returns an immutable instance of [CardCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .display()
         * .fetch()
         * .title()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardCreateRequest =
            CardCreateRequest(
                checkRequired("actions", actions),
                checkRequired("display", display),
                checkRequired("fetch", fetch),
                checkRequired("title", title),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardCreateRequest = apply {
        if (validated) {
            return@apply
        }

        actions().validate()
        display().validate()
        fetch().validate()
        title()
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
        (actions.asKnown().getOrNull()?.validity() ?: 0) +
            (display.asKnown().getOrNull()?.validity() ?: 0) +
            (fetch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardCreateRequest &&
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
        "CardCreateRequest{actions=$actions, display=$display, fetch=$fetch, title=$title, additionalProperties=$additionalProperties}"
}
