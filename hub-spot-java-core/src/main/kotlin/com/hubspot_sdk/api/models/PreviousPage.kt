// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * specifies the paging information needed to retrieve the previous set of results in a paginated
 * API response
 */
class PreviousPage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val before: JsonField<String>,
    private val link: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("before") @ExcludeMissing before: JsonField<String> = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
    ) : this(before, link, mutableMapOf())

    /**
     * A paging cursor token for retrieving previous pages.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun before(): String = before.getRequired("before")

    /**
     * A URL that can be used to retrieve the previous pages' results.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun link(): Optional<String> = link.getOptional("link")

    /**
     * Returns the raw JSON value of [before].
     *
     * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("before") @ExcludeMissing fun _before(): JsonField<String> = before

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

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
         * Returns a mutable builder for constructing an instance of [PreviousPage].
         *
         * The following fields are required:
         * ```java
         * .before()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreviousPage]. */
    class Builder internal constructor() {

        private var before: JsonField<String>? = null
        private var link: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(previousPage: PreviousPage) = apply {
            before = previousPage.before
            link = previousPage.link
            additionalProperties = previousPage.additionalProperties.toMutableMap()
        }

        /** A paging cursor token for retrieving previous pages. */
        fun before(before: String) = before(JsonField.of(before))

        /**
         * Sets [Builder.before] to an arbitrary JSON value.
         *
         * You should usually call [Builder.before] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun before(before: JsonField<String>) = apply { this.before = before }

        /** A URL that can be used to retrieve the previous pages' results. */
        fun link(link: String) = link(JsonField.of(link))

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

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
         * Returns an immutable instance of [PreviousPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .before()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PreviousPage =
            PreviousPage(checkRequired("before", before), link, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): PreviousPage = apply {
        if (validated) {
            return@apply
        }

        before()
        link()
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
        (if (before.asKnown().isPresent) 1 else 0) + (if (link.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PreviousPage &&
            before == other.before &&
            link == other.link &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(before, link, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PreviousPage{before=$before, link=$link, additionalProperties=$additionalProperties}"
}
