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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects

class ScopeMapping
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessLevel: JsonField<String>,
    private val requestAction: JsonField<String>,
    private val scopeName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accessLevel")
        @ExcludeMissing
        accessLevel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestAction")
        @ExcludeMissing
        requestAction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scopeName") @ExcludeMissing scopeName: JsonField<String> = JsonMissing.of(),
    ) : this(accessLevel, requestAction, scopeName, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessLevel(): String = accessLevel.getRequired("accessLevel")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestAction(): String = requestAction.getRequired("requestAction")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeName(): String = scopeName.getRequired("scopeName")

    /**
     * Returns the raw JSON value of [accessLevel].
     *
     * Unlike [accessLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessLevel") @ExcludeMissing fun _accessLevel(): JsonField<String> = accessLevel

    /**
     * Returns the raw JSON value of [requestAction].
     *
     * Unlike [requestAction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestAction")
    @ExcludeMissing
    fun _requestAction(): JsonField<String> = requestAction

    /**
     * Returns the raw JSON value of [scopeName].
     *
     * Unlike [scopeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopeName") @ExcludeMissing fun _scopeName(): JsonField<String> = scopeName

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
         * Returns a mutable builder for constructing an instance of [ScopeMapping].
         *
         * The following fields are required:
         * ```java
         * .accessLevel()
         * .requestAction()
         * .scopeName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScopeMapping]. */
    class Builder internal constructor() {

        private var accessLevel: JsonField<String>? = null
        private var requestAction: JsonField<String>? = null
        private var scopeName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scopeMapping: ScopeMapping) = apply {
            accessLevel = scopeMapping.accessLevel
            requestAction = scopeMapping.requestAction
            scopeName = scopeMapping.scopeName
            additionalProperties = scopeMapping.additionalProperties.toMutableMap()
        }

        fun accessLevel(accessLevel: String) = accessLevel(JsonField.of(accessLevel))

        /**
         * Sets [Builder.accessLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessLevel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessLevel(accessLevel: JsonField<String>) = apply { this.accessLevel = accessLevel }

        fun requestAction(requestAction: String) = requestAction(JsonField.of(requestAction))

        /**
         * Sets [Builder.requestAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestAction] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestAction(requestAction: JsonField<String>) = apply {
            this.requestAction = requestAction
        }

        fun scopeName(scopeName: String) = scopeName(JsonField.of(scopeName))

        /**
         * Sets [Builder.scopeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopeName(scopeName: JsonField<String>) = apply { this.scopeName = scopeName }

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
         * Returns an immutable instance of [ScopeMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessLevel()
         * .requestAction()
         * .scopeName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScopeMapping =
            ScopeMapping(
                checkRequired("accessLevel", accessLevel),
                checkRequired("requestAction", requestAction),
                checkRequired("scopeName", scopeName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScopeMapping = apply {
        if (validated) {
            return@apply
        }

        accessLevel()
        requestAction()
        scopeName()
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
        (if (accessLevel.asKnown().isPresent) 1 else 0) +
            (if (requestAction.asKnown().isPresent) 1 else 0) +
            (if (scopeName.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScopeMapping &&
            accessLevel == other.accessLevel &&
            requestAction == other.requestAction &&
            scopeName == other.scopeName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessLevel, requestAction, scopeName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScopeMapping{accessLevel=$accessLevel, requestAction=$requestAction, scopeName=$scopeName, additionalProperties=$additionalProperties}"
}
