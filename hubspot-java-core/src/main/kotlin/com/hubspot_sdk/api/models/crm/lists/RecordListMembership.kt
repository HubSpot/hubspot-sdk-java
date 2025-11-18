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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Lists record is member of */
class RecordListMembership
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listId: JsonField<String>,
    private val listVersion: JsonField<Int>,
    private val firstAddedTimestamp: JsonField<OffsetDateTime>,
    private val isPublicList: JsonField<Boolean>,
    private val lastAddedTimestamp: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listId") @ExcludeMissing listId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("listVersion") @ExcludeMissing listVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("firstAddedTimestamp")
        @ExcludeMissing
        firstAddedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("isPublicList")
        @ExcludeMissing
        isPublicList: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastAddedTimestamp")
        @ExcludeMissing
        lastAddedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        listId,
        listVersion,
        firstAddedTimestamp,
        isPublicList,
        lastAddedTimestamp,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listId(): String = listId.getRequired("listId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listVersion(): Int = listVersion.getRequired("listVersion")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstAddedTimestamp(): Optional<OffsetDateTime> =
        firstAddedTimestamp.getOptional("firstAddedTimestamp")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isPublicList(): Optional<Boolean> = isPublicList.getOptional("isPublicList")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastAddedTimestamp(): Optional<OffsetDateTime> =
        lastAddedTimestamp.getOptional("lastAddedTimestamp")

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
     * Returns the raw JSON value of [firstAddedTimestamp].
     *
     * Unlike [firstAddedTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("firstAddedTimestamp")
    @ExcludeMissing
    fun _firstAddedTimestamp(): JsonField<OffsetDateTime> = firstAddedTimestamp

    /**
     * Returns the raw JSON value of [isPublicList].
     *
     * Unlike [isPublicList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPublicList")
    @ExcludeMissing
    fun _isPublicList(): JsonField<Boolean> = isPublicList

    /**
     * Returns the raw JSON value of [lastAddedTimestamp].
     *
     * Unlike [lastAddedTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lastAddedTimestamp")
    @ExcludeMissing
    fun _lastAddedTimestamp(): JsonField<OffsetDateTime> = lastAddedTimestamp

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
         * .listId()
         * .listVersion()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordListMembership]. */
    class Builder internal constructor() {

        private var listId: JsonField<String>? = null
        private var listVersion: JsonField<Int>? = null
        private var firstAddedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var isPublicList: JsonField<Boolean> = JsonMissing.of()
        private var lastAddedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordListMembership: RecordListMembership) = apply {
            listId = recordListMembership.listId
            listVersion = recordListMembership.listVersion
            firstAddedTimestamp = recordListMembership.firstAddedTimestamp
            isPublicList = recordListMembership.isPublicList
            lastAddedTimestamp = recordListMembership.lastAddedTimestamp
            additionalProperties = recordListMembership.additionalProperties.toMutableMap()
        }

        fun listId(listId: String) = listId(JsonField.of(listId))

        /**
         * Sets [Builder.listId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listId(listId: JsonField<String>) = apply { this.listId = listId }

        fun listVersion(listVersion: Int) = listVersion(JsonField.of(listVersion))

        /**
         * Sets [Builder.listVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listVersion] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun listVersion(listVersion: JsonField<Int>) = apply { this.listVersion = listVersion }

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
         * .listId()
         * .listVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecordListMembership =
            RecordListMembership(
                checkRequired("listId", listId),
                checkRequired("listVersion", listVersion),
                firstAddedTimestamp,
                isPublicList,
                lastAddedTimestamp,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecordListMembership = apply {
        if (validated) {
            return@apply
        }

        listId()
        listVersion()
        firstAddedTimestamp()
        isPublicList()
        lastAddedTimestamp()
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
        (if (listId.asKnown().isPresent) 1 else 0) +
            (if (listVersion.asKnown().isPresent) 1 else 0) +
            (if (firstAddedTimestamp.asKnown().isPresent) 1 else 0) +
            (if (isPublicList.asKnown().isPresent) 1 else 0) +
            (if (lastAddedTimestamp.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordListMembership &&
            listId == other.listId &&
            listVersion == other.listVersion &&
            firstAddedTimestamp == other.firstAddedTimestamp &&
            isPublicList == other.isPublicList &&
            lastAddedTimestamp == other.lastAddedTimestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            listId,
            listVersion,
            firstAddedTimestamp,
            isPublicList,
            lastAddedTimestamp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordListMembership{listId=$listId, listVersion=$listVersion, firstAddedTimestamp=$firstAddedTimestamp, isPublicList=$isPublicList, lastAddedTimestamp=$lastAddedTimestamp, additionalProperties=$additionalProperties}"
}
