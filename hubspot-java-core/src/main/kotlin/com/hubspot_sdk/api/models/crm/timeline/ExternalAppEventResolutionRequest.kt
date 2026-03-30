// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

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

class ExternalAppEventResolutionRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val developerSymbol: JsonField<String>,
    private val projectName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("developerSymbol")
        @ExcludeMissing
        developerSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("projectName")
        @ExcludeMissing
        projectName: JsonField<String> = JsonMissing.of(),
    ) : this(developerSymbol, projectName, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun developerSymbol(): String = developerSymbol.getRequired("developerSymbol")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectName(): String = projectName.getRequired("projectName")

    /**
     * Returns the raw JSON value of [developerSymbol].
     *
     * Unlike [developerSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("developerSymbol")
    @ExcludeMissing
    fun _developerSymbol(): JsonField<String> = developerSymbol

    /**
     * Returns the raw JSON value of [projectName].
     *
     * Unlike [projectName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projectName") @ExcludeMissing fun _projectName(): JsonField<String> = projectName

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
         * [ExternalAppEventResolutionRequest].
         *
         * The following fields are required:
         * ```java
         * .developerSymbol()
         * .projectName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalAppEventResolutionRequest]. */
    class Builder internal constructor() {

        private var developerSymbol: JsonField<String>? = null
        private var projectName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAppEventResolutionRequest: ExternalAppEventResolutionRequest) =
            apply {
                developerSymbol = externalAppEventResolutionRequest.developerSymbol
                projectName = externalAppEventResolutionRequest.projectName
                additionalProperties =
                    externalAppEventResolutionRequest.additionalProperties.toMutableMap()
            }

        fun developerSymbol(developerSymbol: String) =
            developerSymbol(JsonField.of(developerSymbol))

        /**
         * Sets [Builder.developerSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.developerSymbol] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun developerSymbol(developerSymbol: JsonField<String>) = apply {
            this.developerSymbol = developerSymbol
        }

        fun projectName(projectName: String) = projectName(JsonField.of(projectName))

        /**
         * Sets [Builder.projectName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectName(projectName: JsonField<String>) = apply { this.projectName = projectName }

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
         * Returns an immutable instance of [ExternalAppEventResolutionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .developerSymbol()
         * .projectName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAppEventResolutionRequest =
            ExternalAppEventResolutionRequest(
                checkRequired("developerSymbol", developerSymbol),
                checkRequired("projectName", projectName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalAppEventResolutionRequest = apply {
        if (validated) {
            return@apply
        }

        developerSymbol()
        projectName()
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
        (if (developerSymbol.asKnown().isPresent) 1 else 0) +
            (if (projectName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAppEventResolutionRequest &&
            developerSymbol == other.developerSymbol &&
            projectName == other.projectName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(developerSymbol, projectName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalAppEventResolutionRequest{developerSymbol=$developerSymbol, projectName=$projectName, additionalProperties=$additionalProperties}"
}
