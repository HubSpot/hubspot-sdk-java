// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Configuration for custom user actions on cards. */
class CardActions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val baseUrls: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("baseUrls")
        @ExcludeMissing
        baseUrls: JsonField<List<String>> = JsonMissing.of()
    ) : this(baseUrls, mutableMapOf())

    /**
     * A list of URL prefixes that will be accepted for card action URLs. If your data fetch
     * response includes an action URL that doesn't begin with one of these values, it will result
     * in an error and the card will not be displayed.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun baseUrls(): List<String> = baseUrls.getRequired("baseUrls")

    /**
     * Returns the raw JSON value of [baseUrls].
     *
     * Unlike [baseUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("baseUrls") @ExcludeMissing fun _baseUrls(): JsonField<List<String>> = baseUrls

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
         * Returns a mutable builder for constructing an instance of [CardActions].
         *
         * The following fields are required:
         * ```java
         * .baseUrls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardActions]. */
    class Builder internal constructor() {

        private var baseUrls: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardActions: CardActions) = apply {
            baseUrls = cardActions.baseUrls.map { it.toMutableList() }
            additionalProperties = cardActions.additionalProperties.toMutableMap()
        }

        /**
         * A list of URL prefixes that will be accepted for card action URLs. If your data fetch
         * response includes an action URL that doesn't begin with one of these values, it will
         * result in an error and the card will not be displayed.
         */
        fun baseUrls(baseUrls: List<String>) = baseUrls(JsonField.of(baseUrls))

        /**
         * Sets [Builder.baseUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baseUrls] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun baseUrls(baseUrls: JsonField<List<String>>) = apply {
            this.baseUrls = baseUrls.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [baseUrls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBaseUrl(baseUrl: String) = apply {
            baseUrls =
                (baseUrls ?: JsonField.of(mutableListOf())).also {
                    checkKnown("baseUrls", it).add(baseUrl)
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
         * Returns an immutable instance of [CardActions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .baseUrls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardActions =
            CardActions(
                checkRequired("baseUrls", baseUrls).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardActions = apply {
        if (validated) {
            return@apply
        }

        baseUrls()
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
    @JvmSynthetic internal fun validity(): Int = (baseUrls.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardActions &&
            baseUrls == other.baseUrls &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(baseUrls, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardActions{baseUrls=$baseUrls, additionalProperties=$additionalProperties}"
}
