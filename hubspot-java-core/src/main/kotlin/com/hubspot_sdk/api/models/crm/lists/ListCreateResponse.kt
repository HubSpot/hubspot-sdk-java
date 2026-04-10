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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ListCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val list: JsonField<PublicObjectList>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("list") @ExcludeMissing list: JsonField<PublicObjectList> = JsonMissing.of()
    ) : this(list, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun list(): PublicObjectList = list.getRequired("list")

    /**
     * Returns the raw JSON value of [list].
     *
     * Unlike [list], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("list") @ExcludeMissing fun _list(): JsonField<PublicObjectList> = list

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
         * Returns a mutable builder for constructing an instance of [ListCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .list()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListCreateResponse]. */
    class Builder internal constructor() {

        private var list: JsonField<PublicObjectList>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listCreateResponse: ListCreateResponse) = apply {
            list = listCreateResponse.list
            additionalProperties = listCreateResponse.additionalProperties.toMutableMap()
        }

        fun list(list: PublicObjectList) = list(JsonField.of(list))

        /**
         * Sets [Builder.list] to an arbitrary JSON value.
         *
         * You should usually call [Builder.list] with a well-typed [PublicObjectList] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun list(list: JsonField<PublicObjectList>) = apply { this.list = list }

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
         * Returns an immutable instance of [ListCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .list()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListCreateResponse =
            ListCreateResponse(checkRequired("list", list), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ListCreateResponse = apply {
        if (validated) {
            return@apply
        }

        list().validate()
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
    @JvmSynthetic internal fun validity(): Int = (list.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListCreateResponse &&
            list == other.list &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(list, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListCreateResponse{list=$list, additionalProperties=$additionalProperties}"
}
