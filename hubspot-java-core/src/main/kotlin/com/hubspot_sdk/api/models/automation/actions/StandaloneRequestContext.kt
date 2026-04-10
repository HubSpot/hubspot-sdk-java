// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class StandaloneRequestContext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chirpAiContextObject: JsonField<ChirpAiContextObject>,
    private val source: JsonField<Source>,
    private val trajectoryId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chirpAiContextObject")
        @ExcludeMissing
        chirpAiContextObject: JsonField<ChirpAiContextObject> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<Source> = JsonMissing.of(),
        @JsonProperty("trajectoryId")
        @ExcludeMissing
        trajectoryId: JsonField<String> = JsonMissing.of(),
    ) : this(chirpAiContextObject, source, trajectoryId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chirpAiContextObject(): ChirpAiContextObject =
        chirpAiContextObject.getRequired("chirpAiContextObject")

    /**
     * Indicates the source of the request, with the default value being 'STANDALONE'.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): Source = source.getRequired("source")

    /**
     * A unique identifier for tracking the trajectory of the request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trajectoryId(): Optional<String> = trajectoryId.getOptional("trajectoryId")

    /**
     * Returns the raw JSON value of [chirpAiContextObject].
     *
     * Unlike [chirpAiContextObject], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("chirpAiContextObject")
    @ExcludeMissing
    fun _chirpAiContextObject(): JsonField<ChirpAiContextObject> = chirpAiContextObject

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /**
     * Returns the raw JSON value of [trajectoryId].
     *
     * Unlike [trajectoryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trajectoryId")
    @ExcludeMissing
    fun _trajectoryId(): JsonField<String> = trajectoryId

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
         * Returns a mutable builder for constructing an instance of [StandaloneRequestContext].
         *
         * The following fields are required:
         * ```java
         * .chirpAiContextObject()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StandaloneRequestContext]. */
    class Builder internal constructor() {

        private var chirpAiContextObject: JsonField<ChirpAiContextObject>? = null
        private var source: JsonField<Source>? = null
        private var trajectoryId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(standaloneRequestContext: StandaloneRequestContext) = apply {
            chirpAiContextObject = standaloneRequestContext.chirpAiContextObject
            source = standaloneRequestContext.source
            trajectoryId = standaloneRequestContext.trajectoryId
            additionalProperties = standaloneRequestContext.additionalProperties.toMutableMap()
        }

        fun chirpAiContextObject(chirpAiContextObject: ChirpAiContextObject) =
            chirpAiContextObject(JsonField.of(chirpAiContextObject))

        /**
         * Sets [Builder.chirpAiContextObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chirpAiContextObject] with a well-typed
         * [ChirpAiContextObject] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun chirpAiContextObject(chirpAiContextObject: JsonField<ChirpAiContextObject>) = apply {
            this.chirpAiContextObject = chirpAiContextObject
        }

        /** Indicates the source of the request, with the default value being 'STANDALONE'. */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [Source] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** A unique identifier for tracking the trajectory of the request. */
        fun trajectoryId(trajectoryId: String) = trajectoryId(JsonField.of(trajectoryId))

        /**
         * Sets [Builder.trajectoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trajectoryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trajectoryId(trajectoryId: JsonField<String>) = apply {
            this.trajectoryId = trajectoryId
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
         * Returns an immutable instance of [StandaloneRequestContext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chirpAiContextObject()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StandaloneRequestContext =
            StandaloneRequestContext(
                checkRequired("chirpAiContextObject", chirpAiContextObject),
                checkRequired("source", source),
                trajectoryId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StandaloneRequestContext = apply {
        if (validated) {
            return@apply
        }

        chirpAiContextObject().validate()
        source().validate()
        trajectoryId()
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
        (chirpAiContextObject.asKnown().getOrNull()?.validity() ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (if (trajectoryId.asKnown().isPresent) 1 else 0)

    /** Indicates the source of the request, with the default value being 'STANDALONE'. */
    class Source @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val STANDALONE = of("STANDALONE")

            @JvmStatic fun of(value: String) = Source(JsonField.of(value))
        }

        /** An enum containing [Source]'s known values. */
        enum class Known {
            STANDALONE
        }

        /**
         * An enum containing [Source]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Source] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STANDALONE,
            /** An enum member indicating that [Source] was instantiated with an unknown value. */
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
                STANDALONE -> Value.STANDALONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                STANDALONE -> Known.STANDALONE
                else -> throw HubSpotInvalidDataException("Unknown Source: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Source = apply {
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
            } catch (e: HubSpotInvalidDataException) {
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

            return other is Source && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StandaloneRequestContext &&
            chirpAiContextObject == other.chirpAiContextObject &&
            source == other.source &&
            trajectoryId == other.trajectoryId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chirpAiContextObject, source, trajectoryId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StandaloneRequestContext{chirpAiContextObject=$chirpAiContextObject, source=$source, trajectoryId=$trajectoryId, additionalProperties=$additionalProperties}"
}
