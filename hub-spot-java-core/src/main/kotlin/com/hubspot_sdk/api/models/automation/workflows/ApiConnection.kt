// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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

class ApiConnection
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val edgeType: JsonField<String>,
    private val nextActionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("edgeType") @ExcludeMissing edgeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nextActionId")
        @ExcludeMissing
        nextActionId: JsonField<String> = JsonMissing.of(),
    ) : this(edgeType, nextActionId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun edgeType(): String = edgeType.getRequired("edgeType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nextActionId(): String = nextActionId.getRequired("nextActionId")

    /**
     * Returns the raw JSON value of [edgeType].
     *
     * Unlike [edgeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("edgeType") @ExcludeMissing fun _edgeType(): JsonField<String> = edgeType

    /**
     * Returns the raw JSON value of [nextActionId].
     *
     * Unlike [nextActionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nextActionId")
    @ExcludeMissing
    fun _nextActionId(): JsonField<String> = nextActionId

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
         * Returns a mutable builder for constructing an instance of [ApiConnection].
         *
         * The following fields are required:
         * ```java
         * .edgeType()
         * .nextActionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiConnection]. */
    class Builder internal constructor() {

        private var edgeType: JsonField<String>? = null
        private var nextActionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiConnection: ApiConnection) = apply {
            edgeType = apiConnection.edgeType
            nextActionId = apiConnection.nextActionId
            additionalProperties = apiConnection.additionalProperties.toMutableMap()
        }

        fun edgeType(edgeType: String) = edgeType(JsonField.of(edgeType))

        /**
         * Sets [Builder.edgeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edgeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun edgeType(edgeType: JsonField<String>) = apply { this.edgeType = edgeType }

        fun nextActionId(nextActionId: String) = nextActionId(JsonField.of(nextActionId))

        /**
         * Sets [Builder.nextActionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextActionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextActionId(nextActionId: JsonField<String>) = apply {
            this.nextActionId = nextActionId
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
         * Returns an immutable instance of [ApiConnection].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .edgeType()
         * .nextActionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiConnection =
            ApiConnection(
                checkRequired("edgeType", edgeType),
                checkRequired("nextActionId", nextActionId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiConnection = apply {
        if (validated) {
            return@apply
        }

        edgeType()
        nextActionId()
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
        (if (edgeType.asKnown().isPresent) 1 else 0) +
            (if (nextActionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiConnection &&
            edgeType == other.edgeType &&
            nextActionId == other.nextActionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(edgeType, nextActionId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiConnection{edgeType=$edgeType, nextActionId=$nextActionId, additionalProperties=$additionalProperties}"
}
