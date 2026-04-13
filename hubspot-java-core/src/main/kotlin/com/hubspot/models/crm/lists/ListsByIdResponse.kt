// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ListsByIdResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val lists: JsonField<List<PublicObjectList>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("lists")
        @ExcludeMissing
        lists: JsonField<List<PublicObjectList>> = JsonMissing.of()
    ) : this(lists, mutableMapOf())

    /**
     * The object list definitions.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lists(): List<PublicObjectList> = lists.getRequired("lists")

    /**
     * Returns the raw JSON value of [lists].
     *
     * Unlike [lists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lists") @ExcludeMissing fun _lists(): JsonField<List<PublicObjectList>> = lists

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
         * Returns a mutable builder for constructing an instance of [ListsByIdResponse].
         *
         * The following fields are required:
         * ```java
         * .lists()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListsByIdResponse]. */
    class Builder internal constructor() {

        private var lists: JsonField<MutableList<PublicObjectList>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listsByIdResponse: ListsByIdResponse) = apply {
            lists = listsByIdResponse.lists.map { it.toMutableList() }
            additionalProperties = listsByIdResponse.additionalProperties.toMutableMap()
        }

        /** The object list definitions. */
        fun lists(lists: List<PublicObjectList>) = lists(JsonField.of(lists))

        /**
         * Sets [Builder.lists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lists] with a well-typed `List<PublicObjectList>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lists(lists: JsonField<List<PublicObjectList>>) = apply {
            this.lists = lists.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicObjectList] to [lists].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addList(list: PublicObjectList) = apply {
            lists =
                (lists ?: JsonField.of(mutableListOf())).also { checkKnown("lists", it).add(list) }
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
         * Returns an immutable instance of [ListsByIdResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lists()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListsByIdResponse =
            ListsByIdResponse(
                checkRequired("lists", lists).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListsByIdResponse = apply {
        if (validated) {
            return@apply
        }

        lists().forEach { it.validate() }
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
        (lists.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListsByIdResponse &&
            lists == other.lists &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(lists, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListsByIdResponse{lists=$lists, additionalProperties=$additionalProperties}"
}
