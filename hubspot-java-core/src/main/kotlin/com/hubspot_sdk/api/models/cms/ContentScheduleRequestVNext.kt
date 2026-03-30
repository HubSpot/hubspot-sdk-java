// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms

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

class ContentScheduleRequestVNext
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val publishDate: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publishDate")
        @ExcludeMissing
        publishDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, publishDate, mutableMapOf())

    /**
     * The ID of the object to be scheduled.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date the object should transition from scheduled to published.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishDate(): OffsetDateTime = publishDate.getRequired("publishDate")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [publishDate].
     *
     * Unlike [publishDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishDate")
    @ExcludeMissing
    fun _publishDate(): JsonField<OffsetDateTime> = publishDate

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
         * Returns a mutable builder for constructing an instance of [ContentScheduleRequestVNext].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .publishDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentScheduleRequestVNext]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var publishDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentScheduleRequestVNext: ContentScheduleRequestVNext) = apply {
            id = contentScheduleRequestVNext.id
            publishDate = contentScheduleRequestVNext.publishDate
            additionalProperties = contentScheduleRequestVNext.additionalProperties.toMutableMap()
        }

        /** The ID of the object to be scheduled. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date the object should transition from scheduled to published. */
        fun publishDate(publishDate: OffsetDateTime) = publishDate(JsonField.of(publishDate))

        /**
         * Sets [Builder.publishDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishDate(publishDate: JsonField<OffsetDateTime>) = apply {
            this.publishDate = publishDate
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
         * Returns an immutable instance of [ContentScheduleRequestVNext].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .publishDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentScheduleRequestVNext =
            ContentScheduleRequestVNext(
                checkRequired("id", id),
                checkRequired("publishDate", publishDate),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentScheduleRequestVNext = apply {
        if (validated) {
            return@apply
        }

        id()
        publishDate()
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
        (if (id.asKnown().isPresent) 1 else 0) + (if (publishDate.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentScheduleRequestVNext &&
            id == other.id &&
            publishDate == other.publishDate &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, publishDate, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentScheduleRequestVNext{id=$id, publishDate=$publishDate, additionalProperties=$additionalProperties}"
}
