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

class FieldLevelPermission
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessLevel: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accessLevel")
        @ExcludeMissing
        accessLevel: JsonField<String> = JsonMissing.of()
    ) : this(accessLevel, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessLevel(): String = accessLevel.getRequired("accessLevel")

    /**
     * Returns the raw JSON value of [accessLevel].
     *
     * Unlike [accessLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessLevel") @ExcludeMissing fun _accessLevel(): JsonField<String> = accessLevel

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
         * Returns a mutable builder for constructing an instance of [FieldLevelPermission].
         *
         * The following fields are required:
         * ```java
         * .accessLevel()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldLevelPermission]. */
    class Builder internal constructor() {

        private var accessLevel: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldLevelPermission: FieldLevelPermission) = apply {
            accessLevel = fieldLevelPermission.accessLevel
            additionalProperties = fieldLevelPermission.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [FieldLevelPermission].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessLevel()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldLevelPermission =
            FieldLevelPermission(
                checkRequired("accessLevel", accessLevel),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FieldLevelPermission = apply {
        if (validated) {
            return@apply
        }

        accessLevel()
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
    @JvmSynthetic internal fun validity(): Int = (if (accessLevel.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldLevelPermission &&
            accessLevel == other.accessLevel &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(accessLevel, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldLevelPermission{accessLevel=$accessLevel, additionalProperties=$additionalProperties}"
}
