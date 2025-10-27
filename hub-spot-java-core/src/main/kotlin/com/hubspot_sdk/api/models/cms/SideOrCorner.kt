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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class SideOrCorner
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val horizontalSide: JsonField<String>,
    private val verticalSide: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("horizontalSide")
        @ExcludeMissing
        horizontalSide: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verticalSide")
        @ExcludeMissing
        verticalSide: JsonField<String> = JsonMissing.of(),
    ) : this(horizontalSide, verticalSide, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun horizontalSide(): String = horizontalSide.getRequired("horizontalSide")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verticalSide(): String = verticalSide.getRequired("verticalSide")

    /**
     * Returns the raw JSON value of [horizontalSide].
     *
     * Unlike [horizontalSide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("horizontalSide")
    @ExcludeMissing
    fun _horizontalSide(): JsonField<String> = horizontalSide

    /**
     * Returns the raw JSON value of [verticalSide].
     *
     * Unlike [verticalSide], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verticalSide")
    @ExcludeMissing
    fun _verticalSide(): JsonField<String> = verticalSide

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
         * Returns a mutable builder for constructing an instance of [SideOrCorner].
         *
         * The following fields are required:
         * ```java
         * .horizontalSide()
         * .verticalSide()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SideOrCorner]. */
    class Builder internal constructor() {

        private var horizontalSide: JsonField<String>? = null
        private var verticalSide: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sideOrCorner: SideOrCorner) = apply {
            horizontalSide = sideOrCorner.horizontalSide
            verticalSide = sideOrCorner.verticalSide
            additionalProperties = sideOrCorner.additionalProperties.toMutableMap()
        }

        fun horizontalSide(horizontalSide: String) = horizontalSide(JsonField.of(horizontalSide))

        /**
         * Sets [Builder.horizontalSide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.horizontalSide] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun horizontalSide(horizontalSide: JsonField<String>) = apply {
            this.horizontalSide = horizontalSide
        }

        fun verticalSide(verticalSide: String) = verticalSide(JsonField.of(verticalSide))

        /**
         * Sets [Builder.verticalSide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verticalSide] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun verticalSide(verticalSide: JsonField<String>) = apply {
            this.verticalSide = verticalSide
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
         * Returns an immutable instance of [SideOrCorner].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .horizontalSide()
         * .verticalSide()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SideOrCorner =
            SideOrCorner(
                checkRequired("horizontalSide", horizontalSide),
                checkRequired("verticalSide", verticalSide),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SideOrCorner = apply {
        if (validated) {
            return@apply
        }

        horizontalSide()
        verticalSide()
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
        (if (horizontalSide.asKnown().isPresent) 1 else 0) +
            (if (verticalSide.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SideOrCorner &&
            horizontalSide == other.horizontalSide &&
            verticalSide == other.verticalSide &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(horizontalSide, verticalSide, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SideOrCorner{horizontalSide=$horizontalSide, verticalSide=$verticalSide, additionalProperties=$additionalProperties}"
}
