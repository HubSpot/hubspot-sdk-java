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

class RecordIdWithMemberships
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val objectTypeId: JsonField<String>,
    private val recordId: JsonField<String>,
    private val recordListMemberships: JsonField<List<RecordListMembership>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recordId") @ExcludeMissing recordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recordListMemberships")
        @ExcludeMissing
        recordListMemberships: JsonField<List<RecordListMembership>> = JsonMissing.of(),
    ) : this(objectTypeId, recordId, recordListMemberships, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordId(): String = recordId.getRequired("recordId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recordListMemberships(): List<RecordListMembership> =
        recordListMemberships.getRequired("recordListMemberships")

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

    /**
     * Returns the raw JSON value of [recordId].
     *
     * Unlike [recordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recordId") @ExcludeMissing fun _recordId(): JsonField<String> = recordId

    /**
     * Returns the raw JSON value of [recordListMemberships].
     *
     * Unlike [recordListMemberships], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recordListMemberships")
    @ExcludeMissing
    fun _recordListMemberships(): JsonField<List<RecordListMembership>> = recordListMemberships

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
         * Returns a mutable builder for constructing an instance of [RecordIdWithMemberships].
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .recordId()
         * .recordListMemberships()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecordIdWithMemberships]. */
    class Builder internal constructor() {

        private var objectTypeId: JsonField<String>? = null
        private var recordId: JsonField<String>? = null
        private var recordListMemberships: JsonField<MutableList<RecordListMembership>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(recordIdWithMemberships: RecordIdWithMemberships) = apply {
            objectTypeId = recordIdWithMemberships.objectTypeId
            recordId = recordIdWithMemberships.recordId
            recordListMemberships =
                recordIdWithMemberships.recordListMemberships.map { it.toMutableList() }
            additionalProperties = recordIdWithMemberships.additionalProperties.toMutableMap()
        }

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
        }

        fun recordId(recordId: String) = recordId(JsonField.of(recordId))

        /**
         * Sets [Builder.recordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

        fun recordListMemberships(recordListMemberships: List<RecordListMembership>) =
            recordListMemberships(JsonField.of(recordListMemberships))

        /**
         * Sets [Builder.recordListMemberships] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recordListMemberships] with a well-typed
         * `List<RecordListMembership>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun recordListMemberships(recordListMemberships: JsonField<List<RecordListMembership>>) =
            apply {
                this.recordListMemberships = recordListMemberships.map { it.toMutableList() }
            }

        /**
         * Adds a single [RecordListMembership] to [recordListMemberships].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecordListMembership(recordListMembership: RecordListMembership) = apply {
            recordListMemberships =
                (recordListMemberships ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recordListMemberships", it).add(recordListMembership)
                }
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
         * Returns an immutable instance of [RecordIdWithMemberships].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .objectTypeId()
         * .recordId()
         * .recordListMemberships()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RecordIdWithMemberships =
            RecordIdWithMemberships(
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("recordId", recordId),
                checkRequired("recordListMemberships", recordListMemberships).map {
                    it.toImmutable()
                },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RecordIdWithMemberships = apply {
        if (validated) {
            return@apply
        }

        objectTypeId()
        recordId()
        recordListMemberships().forEach { it.validate() }
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
        (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (if (recordId.asKnown().isPresent) 1 else 0) +
            (recordListMemberships.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecordIdWithMemberships &&
            objectTypeId == other.objectTypeId &&
            recordId == other.recordId &&
            recordListMemberships == other.recordListMemberships &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(objectTypeId, recordId, recordListMemberships, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RecordIdWithMemberships{objectTypeId=$objectTypeId, recordId=$recordId, recordListMemberships=$recordListMemberships, additionalProperties=$additionalProperties}"
}
