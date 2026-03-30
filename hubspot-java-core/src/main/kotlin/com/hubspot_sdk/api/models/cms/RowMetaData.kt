// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

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

class RowMetaData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cssClass: JsonField<String>,
    private val styles: JsonField<Styles>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cssClass") @ExcludeMissing cssClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("styles") @ExcludeMissing styles: JsonField<Styles> = JsonMissing.of(),
    ) : this(cssClass, styles, mutableMapOf())

    /**
     * The CSS class applied to the row.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cssClass(): String = cssClass.getRequired("cssClass")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun styles(): Styles = styles.getRequired("styles")

    /**
     * Returns the raw JSON value of [cssClass].
     *
     * Unlike [cssClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cssClass") @ExcludeMissing fun _cssClass(): JsonField<String> = cssClass

    /**
     * Returns the raw JSON value of [styles].
     *
     * Unlike [styles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("styles") @ExcludeMissing fun _styles(): JsonField<Styles> = styles

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
         * Returns a mutable builder for constructing an instance of [RowMetaData].
         *
         * The following fields are required:
         * ```java
         * .cssClass()
         * .styles()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RowMetaData]. */
    class Builder internal constructor() {

        private var cssClass: JsonField<String>? = null
        private var styles: JsonField<Styles>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rowMetaData: RowMetaData) = apply {
            cssClass = rowMetaData.cssClass
            styles = rowMetaData.styles
            additionalProperties = rowMetaData.additionalProperties.toMutableMap()
        }

        /** The CSS class applied to the row. */
        fun cssClass(cssClass: String) = cssClass(JsonField.of(cssClass))

        /**
         * Sets [Builder.cssClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cssClass] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cssClass(cssClass: JsonField<String>) = apply { this.cssClass = cssClass }

        fun styles(styles: Styles) = styles(JsonField.of(styles))

        /**
         * Sets [Builder.styles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.styles] with a well-typed [Styles] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun styles(styles: JsonField<Styles>) = apply { this.styles = styles }

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
         * Returns an immutable instance of [RowMetaData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .cssClass()
         * .styles()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RowMetaData =
            RowMetaData(
                checkRequired("cssClass", cssClass),
                checkRequired("styles", styles),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RowMetaData = apply {
        if (validated) {
            return@apply
        }

        cssClass()
        styles().validate()
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
        (if (cssClass.asKnown().isPresent) 1 else 0) +
            (styles.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RowMetaData &&
            cssClass == other.cssClass &&
            styles == other.styles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(cssClass, styles, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RowMetaData{cssClass=$cssClass, styles=$styles, additionalProperties=$additionalProperties}"
}
