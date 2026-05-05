// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class RecordListMembership
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val firstAddedTimestamp: JsonField<OffsetDateTime>,
    private val lastAddedTimestamp: JsonField<OffsetDateTime>,
    private val listId: JsonField<String>,
    private val listVersion: JsonField<Int>,
    private val isPublicList: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("firstAddedTimestamp")
        @ExcludeMissing
        firstAddedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastAddedTimestamp")
        @ExcludeMissing
        lastAddedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("listVersion") @ExcludeMissing listVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isPublicList")
        @ExcludeMissing
        isPublicList: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        firstAddedTimestamp,
        lastAddedTimestamp,
        listId,
        listVersion,
        isPublicList,
        mutableMapOf(),
    )

    /**
     * The timestamp when the record was first added to the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstAddedTimestamp(): OffsetDateTime =
        firstAddedTimestamp.getRequired("firstAddedTimestamp")

    /**
     * The timestamp when the record was last added to the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastAddedTimestamp(): OffsetDateTime = lastAddedTimestamp.getRequired("lastAddedTimestamp")

    /**
     * The unique identifier of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * The version number of the list.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listVersion(): Int = listVersion.getRequired("listVersion")

    /**
     * Indicates whether the list is public.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPublicList(): Optional<Boolean> = isPublicList.getOptional("isPublicList")

    /**
     * Returns the raw JSON value of [firstAddedTimestamp].
     *
     * Unlike [firstAddedTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("firstAddedTimestamp")
    @ExcludeMissing
    fun _firstAddedTimestamp(): JsonField<OffsetDateTime> = firstAddedTimestamp

    /**
     * Returns the raw JSON value of [lastAddedTimestamp].
     *
     * Unlike [lastAddedTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lastAddedTimestamp")
    @ExcludeMissing
    fun _lastAddedTimestamp(): JsonField<OffsetDateTime> = lastAddedTimestamp

    /**
     * Returns the raw JSON value of [listId].
     *
     * Unlike [listId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listId") @ExcludeMissing fun _listId(): JsonField<String> = listId

    /**
     * Returns the raw JSON value of [listVersion].
     *
     * Unlike [listVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listVersion") @ExcludeMissing fun _listVersion(): JsonField<Int> = listVersion

    /**
     * Returns the raw JSON value of [isPublicList].
     *
     * Unlike [isPublicList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPublicList")
    @ExcludeMissing
    fun _isPublicList(): JsonField<Boolean> = isPublicList

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
         * Returns a mutable builder for constructing an instance of [RecordListMembership].
         *
         * The following fields are required:
         * ```java
         * .firstAddedTimestamp()
         * .lastAddedTimestamp()
         * .listId()
         * .listVersion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordListMembership]. */
    class Builder internal constructor() {

        private var firstAddedTimestamp: JsonField<OffsetDateTime>? = null
        private var lastAddedTimestamp: JsonField<OffsetDateTime>? = null
        private var listId: JsonField<String>? = null
        private var listVersion: JsonField<Int>? = null
        private var isPublicList: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordListMembership: RecordListMembership) = apply {
            firstAddedTimestamp = recordListMembership.firstAddedTimestamp
            lastAddedTimestamp = recordListMembership.lastAddedTimestamp
            listId = recordListMembership.listId
            listVersion = recordListMembership.listVersion
            isPublicList = recordListMembership.isPublicList
            additionalProperties = recordListMembership.additionalProperties.toMutableMap()
        }

        /** The timestamp when the record was first added to the list. */
        fun firstAddedTimestamp(firstAddedTimestamp: OffsetDateTime) =
            firstAddedTimestamp(JsonField.of(firstAddedTimestamp))

        /**
         * Sets [Builder.firstAddedTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstAddedTimestamp] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun firstAddedTimestamp(firstAddedTimestamp: JsonField<OffsetDateTime>) = apply {
            this.firstAddedTimestamp = firstAddedTimestamp
        }

        /** The timestamp when the record was last added to the list. */
        fun lastAddedTimestamp(lastAddedTimestamp: OffsetDateTime) =
            lastAddedTimestamp(JsonField.of(lastAddedTimestamp))

        /**
         * Sets [Builder.lastAddedTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastAddedTimestamp] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastAddedTimestamp(lastAddedTimestamp: JsonField<OffsetDateTime>) = apply {
            this.lastAddedTimestamp = lastAddedTimestamp
        }

        /** The unique identifier of the list. */
        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        /** The version number of the list. */
        fun listVersion(listVersion: Int) = listVersion(JsonField.of(listVersion))

        /**
         * Sets [Builder.listVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listVersion] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listVersion(listVersion: JsonField<Int>) = apply { this.listVersion = listVersion }

        /** Indicates whether the list is public. */
        fun isPublicList(isPublicList: Boolean) = isPublicList(JsonField.of(isPublicList))

        /**
         * Sets [Builder.isPublicList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPublicList] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPublicList(isPublicList: JsonField<Boolean>) = apply {
            this.isPublicList = isPublicList
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
         * Returns an immutable instance of [RecordListMembership].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .firstAddedTimestamp()
         * .lastAddedTimestamp()
         * .listId()
         * .listVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecordListMembership =
            RecordListMembership(
                checkRequired("firstAddedTimestamp", firstAddedTimestamp),
                checkRequired("lastAddedTimestamp", lastAddedTimestamp),
                checkRequired("listId", listId),
                checkRequired("listVersion", listVersion),
                isPublicList,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): RecordListMembership = apply {
        if (validated) {
            return@apply
        }

        firstAddedTimestamp()
        lastAddedTimestamp()
        listId()
        listVersion()
        isPublicList()
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
        (if (firstAddedTimestamp.asKnown().isPresent) 1 else 0) +
            (if (lastAddedTimestamp.asKnown().isPresent) 1 else 0) +
            (if (listId.asKnown().isPresent) 1 else 0) +
            (if (listVersion.asKnown().isPresent) 1 else 0) +
            (if (isPublicList.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordListMembership &&
            firstAddedTimestamp == other.firstAddedTimestamp &&
            lastAddedTimestamp == other.lastAddedTimestamp &&
            listId == other.listId &&
            listVersion == other.listVersion &&
            isPublicList == other.isPublicList &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            firstAddedTimestamp,
            lastAddedTimestamp,
            listId,
            listVersion,
            isPublicList,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordListMembership{firstAddedTimestamp=$firstAddedTimestamp, lastAddedTimestamp=$lastAddedTimestamp, listId=$listId, listVersion=$listVersion, isPublicList=$isPublicList, additionalProperties=$additionalProperties}"
}
