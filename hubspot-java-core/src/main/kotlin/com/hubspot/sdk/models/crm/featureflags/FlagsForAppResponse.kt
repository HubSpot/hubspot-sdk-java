// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.featureflags

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class FlagsForAppResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val flagsForApp: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("flagsForApp")
        @ExcludeMissing
        flagsForApp: JsonField<List<String>> = JsonMissing.of()
    ) : this(flagsForApp, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flagsForApp(): List<String> = flagsForApp.getRequired("flagsForApp")

    /**
     * Returns the raw JSON value of [flagsForApp].
     *
     * Unlike [flagsForApp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flagsForApp")
    @ExcludeMissing
    fun _flagsForApp(): JsonField<List<String>> = flagsForApp

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
         * Returns a mutable builder for constructing an instance of [FlagsForAppResponse].
         *
         * The following fields are required:
         * ```java
         * .flagsForApp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FlagsForAppResponse]. */
    class Builder internal constructor() {

        private var flagsForApp: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(flagsForAppResponse: FlagsForAppResponse) = apply {
            flagsForApp = flagsForAppResponse.flagsForApp.map { it.toMutableList() }
            additionalProperties = flagsForAppResponse.additionalProperties.toMutableMap()
        }

        fun flagsForApp(flagsForApp: List<String>) = flagsForApp(JsonField.of(flagsForApp))

        /**
         * Sets [Builder.flagsForApp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flagsForApp] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun flagsForApp(flagsForApp: JsonField<List<String>>) = apply {
            this.flagsForApp = flagsForApp.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.flagsForApp].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFlagsForApp(flagsForApp: String) = apply {
            this.flagsForApp =
                (this.flagsForApp ?: JsonField.of(mutableListOf())).also {
                    checkKnown("flagsForApp", it).add(flagsForApp)
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
         * Returns an immutable instance of [FlagsForAppResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .flagsForApp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FlagsForAppResponse =
            FlagsForAppResponse(
                checkRequired("flagsForApp", flagsForApp).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): FlagsForAppResponse = apply {
        if (validated) {
            return@apply
        }

        flagsForApp()
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
    @JvmSynthetic internal fun validity(): Int = (flagsForApp.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FlagsForAppResponse &&
            flagsForApp == other.flagsForApp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(flagsForApp, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FlagsForAppResponse{flagsForApp=$flagsForApp, additionalProperties=$additionalProperties}"
}
