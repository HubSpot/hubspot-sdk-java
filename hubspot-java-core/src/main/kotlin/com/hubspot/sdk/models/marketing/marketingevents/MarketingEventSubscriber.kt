// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class MarketingEventSubscriber
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val interactionDateTime: JsonField<Long>,
    private val properties: JsonField<Properties>,
    private val vid: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("interactionDateTime")
        @ExcludeMissing
        interactionDateTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("vid") @ExcludeMissing vid: JsonField<Int> = JsonMissing.of(),
    ) : this(interactionDateTime, properties, vid, mutableMapOf())

    /**
     * Timestamp in milliseconds at which the contact subscribed to the event.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun interactionDateTime(): Long = interactionDateTime.getRequired("interactionDateTime")

    /**
     * The key-value set of the properties of the contact
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The ID of the contact in HubSpot
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vid(): Int = vid.getRequired("vid")

    /**
     * Returns the raw JSON value of [interactionDateTime].
     *
     * Unlike [interactionDateTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interactionDateTime")
    @ExcludeMissing
    fun _interactionDateTime(): JsonField<Long> = interactionDateTime

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [vid].
     *
     * Unlike [vid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vid") @ExcludeMissing fun _vid(): JsonField<Int> = vid

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
         * Returns a mutable builder for constructing an instance of [MarketingEventSubscriber].
         *
         * The following fields are required:
         * ```java
         * .interactionDateTime()
         * .properties()
         * .vid()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketingEventSubscriber]. */
    class Builder internal constructor() {

        private var interactionDateTime: JsonField<Long>? = null
        private var properties: JsonField<Properties>? = null
        private var vid: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketingEventSubscriber: MarketingEventSubscriber) = apply {
            interactionDateTime = marketingEventSubscriber.interactionDateTime
            properties = marketingEventSubscriber.properties
            vid = marketingEventSubscriber.vid
            additionalProperties = marketingEventSubscriber.additionalProperties.toMutableMap()
        }

        /** Timestamp in milliseconds at which the contact subscribed to the event. */
        fun interactionDateTime(interactionDateTime: Long) =
            interactionDateTime(JsonField.of(interactionDateTime))

        /**
         * Sets [Builder.interactionDateTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interactionDateTime] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interactionDateTime(interactionDateTime: JsonField<Long>) = apply {
            this.interactionDateTime = interactionDateTime
        }

        /** The key-value set of the properties of the contact */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /** The ID of the contact in HubSpot */
        fun vid(vid: Int) = vid(JsonField.of(vid))

        /**
         * Sets [Builder.vid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vid] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vid(vid: JsonField<Int>) = apply { this.vid = vid }

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
         * Returns an immutable instance of [MarketingEventSubscriber].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .interactionDateTime()
         * .properties()
         * .vid()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketingEventSubscriber =
            MarketingEventSubscriber(
                checkRequired("interactionDateTime", interactionDateTime),
                checkRequired("properties", properties),
                checkRequired("vid", vid),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketingEventSubscriber = apply {
        if (validated) {
            return@apply
        }

        interactionDateTime()
        properties().validate()
        vid()
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
        (if (interactionDateTime.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (vid.asKnown().isPresent) 1 else 0)

    /** The key-value set of the properties of the contact */
    class Properties
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

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                additionalProperties = properties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties = Properties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Properties = apply {
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

            return other is Properties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Properties{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketingEventSubscriber &&
            interactionDateTime == other.interactionDateTime &&
            properties == other.properties &&
            vid == other.vid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(interactionDateTime, properties, vid, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketingEventSubscriber{interactionDateTime=$interactionDateTime, properties=$properties, vid=$vid, additionalProperties=$additionalProperties}"
}
