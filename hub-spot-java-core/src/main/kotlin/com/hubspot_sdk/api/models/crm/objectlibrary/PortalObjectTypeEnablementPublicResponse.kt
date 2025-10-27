// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objectlibrary

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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PortalObjectTypeEnablementPublicResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val enablementByObjectTypeId: JsonField<EnablementByObjectTypeId>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("enablementByObjectTypeId")
        @ExcludeMissing
        enablementByObjectTypeId: JsonField<EnablementByObjectTypeId> = JsonMissing.of()
    ) : this(enablementByObjectTypeId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enablementByObjectTypeId(): EnablementByObjectTypeId =
        enablementByObjectTypeId.getRequired("enablementByObjectTypeId")

    /**
     * Returns the raw JSON value of [enablementByObjectTypeId].
     *
     * Unlike [enablementByObjectTypeId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("enablementByObjectTypeId")
    @ExcludeMissing
    fun _enablementByObjectTypeId(): JsonField<EnablementByObjectTypeId> = enablementByObjectTypeId

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
         * [PortalObjectTypeEnablementPublicResponse].
         *
         * The following fields are required:
         * ```java
         * .enablementByObjectTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PortalObjectTypeEnablementPublicResponse]. */
    class Builder internal constructor() {

        private var enablementByObjectTypeId: JsonField<EnablementByObjectTypeId>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            portalObjectTypeEnablementPublicResponse: PortalObjectTypeEnablementPublicResponse
        ) = apply {
            enablementByObjectTypeId =
                portalObjectTypeEnablementPublicResponse.enablementByObjectTypeId
            additionalProperties =
                portalObjectTypeEnablementPublicResponse.additionalProperties.toMutableMap()
        }

        fun enablementByObjectTypeId(enablementByObjectTypeId: EnablementByObjectTypeId) =
            enablementByObjectTypeId(JsonField.of(enablementByObjectTypeId))

        /**
         * Sets [Builder.enablementByObjectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enablementByObjectTypeId] with a well-typed
         * [EnablementByObjectTypeId] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun enablementByObjectTypeId(
            enablementByObjectTypeId: JsonField<EnablementByObjectTypeId>
        ) = apply { this.enablementByObjectTypeId = enablementByObjectTypeId }

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
         * Returns an immutable instance of [PortalObjectTypeEnablementPublicResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .enablementByObjectTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PortalObjectTypeEnablementPublicResponse =
            PortalObjectTypeEnablementPublicResponse(
                checkRequired("enablementByObjectTypeId", enablementByObjectTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PortalObjectTypeEnablementPublicResponse = apply {
        if (validated) {
            return@apply
        }

        enablementByObjectTypeId().validate()
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
    internal fun validity(): Int = (enablementByObjectTypeId.asKnown().getOrNull()?.validity() ?: 0)

    class EnablementByObjectTypeId
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

            /**
             * Returns a mutable builder for constructing an instance of [EnablementByObjectTypeId].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EnablementByObjectTypeId]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(enablementByObjectTypeId: EnablementByObjectTypeId) = apply {
                additionalProperties = enablementByObjectTypeId.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EnablementByObjectTypeId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EnablementByObjectTypeId =
                EnablementByObjectTypeId(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): EnablementByObjectTypeId = apply {
            if (validated) {
                return@apply
            }

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

            return other is EnablementByObjectTypeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EnablementByObjectTypeId{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PortalObjectTypeEnablementPublicResponse &&
            enablementByObjectTypeId == other.enablementByObjectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(enablementByObjectTypeId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PortalObjectTypeEnablementPublicResponse{enablementByObjectTypeId=$enablementByObjectTypeId, additionalProperties=$additionalProperties}"
}
