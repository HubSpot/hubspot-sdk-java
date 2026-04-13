// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class ObjectTypeIdProto
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val innerId: JsonField<Int>,
    private val metaTypeId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("innerId") @ExcludeMissing innerId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("metaTypeId") @ExcludeMissing metaTypeId: JsonField<Int> = JsonMissing.of(),
    ) : this(innerId, metaTypeId, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun innerId(): Int = innerId.getRequired("innerId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metaTypeId(): Int = metaTypeId.getRequired("metaTypeId")

    /**
     * Returns the raw JSON value of [innerId].
     *
     * Unlike [innerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("innerId") @ExcludeMissing fun _innerId(): JsonField<Int> = innerId

    /**
     * Returns the raw JSON value of [metaTypeId].
     *
     * Unlike [metaTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metaTypeId") @ExcludeMissing fun _metaTypeId(): JsonField<Int> = metaTypeId

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
         * Returns a mutable builder for constructing an instance of [ObjectTypeIdProto].
         *
         * The following fields are required:
         * ```java
         * .innerId()
         * .metaTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ObjectTypeIdProto]. */
    class Builder internal constructor() {

        private var innerId: JsonField<Int>? = null
        private var metaTypeId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(objectTypeIdProto: ObjectTypeIdProto) = apply {
            innerId = objectTypeIdProto.innerId
            metaTypeId = objectTypeIdProto.metaTypeId
            additionalProperties = objectTypeIdProto.additionalProperties.toMutableMap()
        }

        fun innerId(innerId: Int) = innerId(JsonField.of(innerId))

        /**
         * Sets [Builder.innerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.innerId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun innerId(innerId: JsonField<Int>) = apply { this.innerId = innerId }

        fun metaTypeId(metaTypeId: Int) = metaTypeId(JsonField.of(metaTypeId))

        /**
         * Sets [Builder.metaTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaTypeId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metaTypeId(metaTypeId: JsonField<Int>) = apply { this.metaTypeId = metaTypeId }

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
         * Returns an immutable instance of [ObjectTypeIdProto].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .innerId()
         * .metaTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ObjectTypeIdProto =
            ObjectTypeIdProto(
                checkRequired("innerId", innerId),
                checkRequired("metaTypeId", metaTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ObjectTypeIdProto = apply {
        if (validated) {
            return@apply
        }

        innerId()
        metaTypeId()
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
        (if (innerId.asKnown().isPresent) 1 else 0) + (if (metaTypeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ObjectTypeIdProto &&
            innerId == other.innerId &&
            metaTypeId == other.metaTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(innerId, metaTypeId, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ObjectTypeIdProto{innerId=$innerId, metaTypeId=$metaTypeId, additionalProperties=$additionalProperties}"
}
