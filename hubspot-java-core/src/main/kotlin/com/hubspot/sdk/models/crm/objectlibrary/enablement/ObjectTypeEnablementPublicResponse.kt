// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectlibrary.enablement

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

class ObjectTypeEnablementPublicResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enablement: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enablement")
        @ExcludeMissing
        enablement: JsonField<Boolean> = JsonMissing.of()
    ) : this(enablement, mutableMapOf())

    /**
     * Whether the object type is enabled or not
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enablement(): Boolean = enablement.getRequired("enablement")

    /**
     * Returns the raw JSON value of [enablement].
     *
     * Unlike [enablement], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enablement") @ExcludeMissing fun _enablement(): JsonField<Boolean> = enablement

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
         * [ObjectTypeEnablementPublicResponse].
         *
         * The following fields are required:
         * ```java
         * .enablement()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectTypeEnablementPublicResponse]. */
    class Builder internal constructor() {

        private var enablement: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectTypeEnablementPublicResponse: ObjectTypeEnablementPublicResponse) =
            apply {
                enablement = objectTypeEnablementPublicResponse.enablement
                additionalProperties =
                    objectTypeEnablementPublicResponse.additionalProperties.toMutableMap()
            }

        /** Whether the object type is enabled or not */
        fun enablement(enablement: Boolean) = enablement(JsonField.of(enablement))

        /**
         * Sets [Builder.enablement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enablement] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enablement(enablement: JsonField<Boolean>) = apply { this.enablement = enablement }

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
         * Returns an immutable instance of [ObjectTypeEnablementPublicResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enablement()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectTypeEnablementPublicResponse =
            ObjectTypeEnablementPublicResponse(
                checkRequired("enablement", enablement),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectTypeEnablementPublicResponse = apply {
        if (validated) {
            return@apply
        }

        enablement()
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
    @JvmSynthetic internal fun validity(): Int = (if (enablement.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectTypeEnablementPublicResponse &&
            enablement == other.enablement &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(enablement, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectTypeEnablementPublicResponse{enablement=$enablement, additionalProperties=$additionalProperties}"
}
