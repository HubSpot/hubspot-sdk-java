// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ExternalLinkAvailability
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val hasMore: JsonField<Boolean>,
    private val linkAvailabilityByDuration: JsonField<LinkAvailabilityByDuration>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("hasMore") @ExcludeMissing hasMore: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("linkAvailabilityByDuration")
        @ExcludeMissing
        linkAvailabilityByDuration: JsonField<LinkAvailabilityByDuration> = JsonMissing.of(),
    ) : this(hasMore, linkAvailabilityByDuration, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasMore(): Boolean = hasMore.getRequired("hasMore")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun linkAvailabilityByDuration(): LinkAvailabilityByDuration =
        linkAvailabilityByDuration.getRequired("linkAvailabilityByDuration")

    /**
     * Returns the raw JSON value of [hasMore].
     *
     * Unlike [hasMore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hasMore") @ExcludeMissing fun _hasMore(): JsonField<Boolean> = hasMore

    /**
     * Returns the raw JSON value of [linkAvailabilityByDuration].
     *
     * Unlike [linkAvailabilityByDuration], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("linkAvailabilityByDuration")
    @ExcludeMissing
    fun _linkAvailabilityByDuration(): JsonField<LinkAvailabilityByDuration> =
        linkAvailabilityByDuration

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
         * Returns a mutable builder for constructing an instance of [ExternalLinkAvailability].
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .linkAvailabilityByDuration()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalLinkAvailability]. */
    class Builder internal constructor() {

        private var hasMore: JsonField<Boolean>? = null
        private var linkAvailabilityByDuration: JsonField<LinkAvailabilityByDuration>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalLinkAvailability: ExternalLinkAvailability) = apply {
            hasMore = externalLinkAvailability.hasMore
            linkAvailabilityByDuration = externalLinkAvailability.linkAvailabilityByDuration
            additionalProperties = externalLinkAvailability.additionalProperties.toMutableMap()
        }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        /**
         * Sets [Builder.hasMore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasMore] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

        fun linkAvailabilityByDuration(linkAvailabilityByDuration: LinkAvailabilityByDuration) =
            linkAvailabilityByDuration(JsonField.of(linkAvailabilityByDuration))

        /**
         * Sets [Builder.linkAvailabilityByDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkAvailabilityByDuration] with a well-typed
         * [LinkAvailabilityByDuration] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun linkAvailabilityByDuration(
            linkAvailabilityByDuration: JsonField<LinkAvailabilityByDuration>
        ) = apply { this.linkAvailabilityByDuration = linkAvailabilityByDuration }

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
         * Returns an immutable instance of [ExternalLinkAvailability].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .hasMore()
         * .linkAvailabilityByDuration()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalLinkAvailability =
            ExternalLinkAvailability(
                checkRequired("hasMore", hasMore),
                checkRequired("linkAvailabilityByDuration", linkAvailabilityByDuration),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalLinkAvailability = apply {
        if (validated) {
            return@apply
        }

        hasMore()
        linkAvailabilityByDuration().validate()
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
        (if (hasMore.asKnown().isPresent) 1 else 0) +
            (linkAvailabilityByDuration.asKnown().getOrNull()?.validity() ?: 0)

    class LinkAvailabilityByDuration
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [LinkAvailabilityByDuration].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LinkAvailabilityByDuration]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(linkAvailabilityByDuration: LinkAvailabilityByDuration) = apply {
                additionalProperties =
                    linkAvailabilityByDuration.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [LinkAvailabilityByDuration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): LinkAvailabilityByDuration =
                LinkAvailabilityByDuration(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): LinkAvailabilityByDuration = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LinkAvailabilityByDuration &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LinkAvailabilityByDuration{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalLinkAvailability &&
            hasMore == other.hasMore &&
            linkAvailabilityByDuration == other.linkAvailabilityByDuration &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(hasMore, linkAvailabilityByDuration, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalLinkAvailability{hasMore=$hasMore, linkAvailabilityByDuration=$linkAvailabilityByDuration, additionalProperties=$additionalProperties}"
}
