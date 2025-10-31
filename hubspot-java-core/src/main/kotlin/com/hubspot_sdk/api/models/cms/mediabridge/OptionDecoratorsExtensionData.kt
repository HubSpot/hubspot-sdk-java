// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class OptionDecoratorsExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val optionDecorators: JsonField<OptionDecorators>,
    private val optionDecoratorStyle: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("optionDecorators")
        @ExcludeMissing
        optionDecorators: JsonField<OptionDecorators> = JsonMissing.of(),
        @JsonProperty("optionDecoratorStyle")
        @ExcludeMissing
        optionDecoratorStyle: JsonField<String> = JsonMissing.of(),
    ) : this(optionDecorators, optionDecoratorStyle, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionDecorators(): OptionDecorators = optionDecorators.getRequired("optionDecorators")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun optionDecoratorStyle(): String = optionDecoratorStyle.getRequired("optionDecoratorStyle")

    /**
     * Returns the raw JSON value of [optionDecorators].
     *
     * Unlike [optionDecorators], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionDecorators")
    @ExcludeMissing
    fun _optionDecorators(): JsonField<OptionDecorators> = optionDecorators

    /**
     * Returns the raw JSON value of [optionDecoratorStyle].
     *
     * Unlike [optionDecoratorStyle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("optionDecoratorStyle")
    @ExcludeMissing
    fun _optionDecoratorStyle(): JsonField<String> = optionDecoratorStyle

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
         * Returns a mutable builder for constructing an instance of
         * [OptionDecoratorsExtensionData].
         *
         * The following fields are required:
         * ```java
         * .optionDecorators()
         * .optionDecoratorStyle()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptionDecoratorsExtensionData]. */
    class Builder internal constructor() {

        private var optionDecorators: JsonField<OptionDecorators>? = null
        private var optionDecoratorStyle: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(optionDecoratorsExtensionData: OptionDecoratorsExtensionData) = apply {
            optionDecorators = optionDecoratorsExtensionData.optionDecorators
            optionDecoratorStyle = optionDecoratorsExtensionData.optionDecoratorStyle
            additionalProperties = optionDecoratorsExtensionData.additionalProperties.toMutableMap()
        }

        fun optionDecorators(optionDecorators: OptionDecorators) =
            optionDecorators(JsonField.of(optionDecorators))

        /**
         * Sets [Builder.optionDecorators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionDecorators] with a well-typed [OptionDecorators]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun optionDecorators(optionDecorators: JsonField<OptionDecorators>) = apply {
            this.optionDecorators = optionDecorators
        }

        fun optionDecoratorStyle(optionDecoratorStyle: String) =
            optionDecoratorStyle(JsonField.of(optionDecoratorStyle))

        /**
         * Sets [Builder.optionDecoratorStyle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionDecoratorStyle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun optionDecoratorStyle(optionDecoratorStyle: JsonField<String>) = apply {
            this.optionDecoratorStyle = optionDecoratorStyle
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
         * Returns an immutable instance of [OptionDecoratorsExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .optionDecorators()
         * .optionDecoratorStyle()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptionDecoratorsExtensionData =
            OptionDecoratorsExtensionData(
                checkRequired("optionDecorators", optionDecorators),
                checkRequired("optionDecoratorStyle", optionDecoratorStyle),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OptionDecoratorsExtensionData = apply {
        if (validated) {
            return@apply
        }

        optionDecorators().validate()
        optionDecoratorStyle()
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
        (optionDecorators.asKnown().getOrNull()?.validity() ?: 0) +
            (if (optionDecoratorStyle.asKnown().isPresent) 1 else 0)

    class OptionDecorators
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

            /** Returns a mutable builder for constructing an instance of [OptionDecorators]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OptionDecorators]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(optionDecorators: OptionDecorators) = apply {
                additionalProperties = optionDecorators.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OptionDecorators].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OptionDecorators = OptionDecorators(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): OptionDecorators = apply {
            if (validated) {
                return@apply
            }

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

            return other is OptionDecorators && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OptionDecorators{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptionDecoratorsExtensionData &&
            optionDecorators == other.optionDecorators &&
            optionDecoratorStyle == other.optionDecoratorStyle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(optionDecorators, optionDecoratorStyle, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OptionDecoratorsExtensionData{optionDecorators=$optionDecorators, optionDecoratorStyle=$optionDecoratorStyle, additionalProperties=$additionalProperties}"
}
