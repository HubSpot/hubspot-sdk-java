// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.timeline

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AppEventResolutionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val developerQualifiedSymbol: JsonField<DeveloperQualifiedSymbol>,
    private val fullyQualifiedName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("developerQualifiedSymbol")
        @ExcludeMissing
        developerQualifiedSymbol: JsonField<DeveloperQualifiedSymbol> = JsonMissing.of(),
        @JsonProperty("fullyQualifiedName")
        @ExcludeMissing
        fullyQualifiedName: JsonField<String> = JsonMissing.of(),
    ) : this(developerQualifiedSymbol, fullyQualifiedName, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun developerQualifiedSymbol(): DeveloperQualifiedSymbol =
        developerQualifiedSymbol.getRequired("developerQualifiedSymbol")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fullyQualifiedName(): String = fullyQualifiedName.getRequired("fullyQualifiedName")

    /**
     * Returns the raw JSON value of [developerQualifiedSymbol].
     *
     * Unlike [developerQualifiedSymbol], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("developerQualifiedSymbol")
    @ExcludeMissing
    fun _developerQualifiedSymbol(): JsonField<DeveloperQualifiedSymbol> = developerQualifiedSymbol

    /**
     * Returns the raw JSON value of [fullyQualifiedName].
     *
     * Unlike [fullyQualifiedName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fullyQualifiedName")
    @ExcludeMissing
    fun _fullyQualifiedName(): JsonField<String> = fullyQualifiedName

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
         * Returns a mutable builder for constructing an instance of [AppEventResolutionResponse].
         *
         * The following fields are required:
         * ```java
         * .developerQualifiedSymbol()
         * .fullyQualifiedName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AppEventResolutionResponse]. */
    class Builder internal constructor() {

        private var developerQualifiedSymbol: JsonField<DeveloperQualifiedSymbol>? = null
        private var fullyQualifiedName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(appEventResolutionResponse: AppEventResolutionResponse) = apply {
            developerQualifiedSymbol = appEventResolutionResponse.developerQualifiedSymbol
            fullyQualifiedName = appEventResolutionResponse.fullyQualifiedName
            additionalProperties = appEventResolutionResponse.additionalProperties.toMutableMap()
        }

        fun developerQualifiedSymbol(developerQualifiedSymbol: DeveloperQualifiedSymbol) =
            developerQualifiedSymbol(JsonField.of(developerQualifiedSymbol))

        /**
         * Sets [Builder.developerQualifiedSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.developerQualifiedSymbol] with a well-typed
         * [DeveloperQualifiedSymbol] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun developerQualifiedSymbol(
            developerQualifiedSymbol: JsonField<DeveloperQualifiedSymbol>
        ) = apply { this.developerQualifiedSymbol = developerQualifiedSymbol }

        fun fullyQualifiedName(fullyQualifiedName: String) =
            fullyQualifiedName(JsonField.of(fullyQualifiedName))

        /**
         * Sets [Builder.fullyQualifiedName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullyQualifiedName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fullyQualifiedName(fullyQualifiedName: JsonField<String>) = apply {
            this.fullyQualifiedName = fullyQualifiedName
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
         * Returns an immutable instance of [AppEventResolutionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .developerQualifiedSymbol()
         * .fullyQualifiedName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AppEventResolutionResponse =
            AppEventResolutionResponse(
                checkRequired("developerQualifiedSymbol", developerQualifiedSymbol),
                checkRequired("fullyQualifiedName", fullyQualifiedName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AppEventResolutionResponse = apply {
        if (validated) {
            return@apply
        }

        developerQualifiedSymbol().validate()
        fullyQualifiedName()
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
        (developerQualifiedSymbol.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fullyQualifiedName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AppEventResolutionResponse &&
            developerQualifiedSymbol == other.developerQualifiedSymbol &&
            fullyQualifiedName == other.fullyQualifiedName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(developerQualifiedSymbol, fullyQualifiedName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AppEventResolutionResponse{developerQualifiedSymbol=$developerQualifiedSymbol, fullyQualifiedName=$fullyQualifiedName, additionalProperties=$additionalProperties}"
}
