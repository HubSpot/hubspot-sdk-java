// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The updated definition of the list in response to a list update request. */
class ListUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val updatedList: JsonField<PublicObjectList>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("updatedList")
        @ExcludeMissing
        updatedList: JsonField<PublicObjectList> = JsonMissing.of()
    ) : this(updatedList, mutableMapOf())

    /**
     * An object list definition.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedList(): Optional<PublicObjectList> = updatedList.getOptional("updatedList")

    /**
     * Returns the raw JSON value of [updatedList].
     *
     * Unlike [updatedList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedList")
    @ExcludeMissing
    fun _updatedList(): JsonField<PublicObjectList> = updatedList

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

        /** Returns a mutable builder for constructing an instance of [ListUpdateResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListUpdateResponse]. */
    class Builder internal constructor() {

        private var updatedList: JsonField<PublicObjectList> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listUpdateResponse: ListUpdateResponse) = apply {
            updatedList = listUpdateResponse.updatedList
            additionalProperties = listUpdateResponse.additionalProperties.toMutableMap()
        }

        /** An object list definition. */
        fun updatedList(updatedList: PublicObjectList) = updatedList(JsonField.of(updatedList))

        /**
         * Sets [Builder.updatedList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedList] with a well-typed [PublicObjectList] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedList(updatedList: JsonField<PublicObjectList>) = apply {
            this.updatedList = updatedList
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
         * Returns an immutable instance of [ListUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ListUpdateResponse =
            ListUpdateResponse(updatedList, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ListUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        updatedList().ifPresent { it.validate() }
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
    internal fun validity(): Int = (updatedList.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListUpdateResponse &&
            updatedList == other.updatedList &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(updatedList, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListUpdateResponse{updatedList=$updatedList, additionalProperties=$additionalProperties}"
}
