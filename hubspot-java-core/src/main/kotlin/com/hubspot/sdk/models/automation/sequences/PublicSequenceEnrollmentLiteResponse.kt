// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

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

class PublicSequenceEnrollmentLiteResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val enrolledAt: JsonField<OffsetDateTime>,
    private val toEmail: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enrolledAt")
        @ExcludeMissing
        enrolledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("toEmail") @ExcludeMissing toEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, enrolledAt, toEmail, updatedAt, mutableMapOf())

    /**
     * The unique identifier for the sequence enrollment.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the contact was enrolled in the sequence.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enrolledAt(): OffsetDateTime = enrolledAt.getRequired("enrolledAt")

    /**
     * The email address of the contact enrolled in the sequence.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun toEmail(): String = toEmail.getRequired("toEmail")

    /**
     * The date and time when the sequence enrollment was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [enrolledAt].
     *
     * Unlike [enrolledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrolledAt")
    @ExcludeMissing
    fun _enrolledAt(): JsonField<OffsetDateTime> = enrolledAt

    /**
     * Returns the raw JSON value of [toEmail].
     *
     * Unlike [toEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("toEmail") @ExcludeMissing fun _toEmail(): JsonField<String> = toEmail

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * [PublicSequenceEnrollmentLiteResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .enrolledAt()
         * .toEmail()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceEnrollmentLiteResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var enrolledAt: JsonField<OffsetDateTime>? = null
        private var toEmail: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicSequenceEnrollmentLiteResponse: PublicSequenceEnrollmentLiteResponse
        ) = apply {
            id = publicSequenceEnrollmentLiteResponse.id
            enrolledAt = publicSequenceEnrollmentLiteResponse.enrolledAt
            toEmail = publicSequenceEnrollmentLiteResponse.toEmail
            updatedAt = publicSequenceEnrollmentLiteResponse.updatedAt
            additionalProperties =
                publicSequenceEnrollmentLiteResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the sequence enrollment. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the contact was enrolled in the sequence. */
        fun enrolledAt(enrolledAt: OffsetDateTime) = enrolledAt(JsonField.of(enrolledAt))

        /**
         * Sets [Builder.enrolledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrolledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enrolledAt(enrolledAt: JsonField<OffsetDateTime>) = apply {
            this.enrolledAt = enrolledAt
        }

        /** The email address of the contact enrolled in the sequence. */
        fun toEmail(toEmail: String) = toEmail(JsonField.of(toEmail))

        /**
         * Sets [Builder.toEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.toEmail] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun toEmail(toEmail: JsonField<String>) = apply { this.toEmail = toEmail }

        /** The date and time when the sequence enrollment was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PublicSequenceEnrollmentLiteResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .enrolledAt()
         * .toEmail()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceEnrollmentLiteResponse =
            PublicSequenceEnrollmentLiteResponse(
                checkRequired("id", id),
                checkRequired("enrolledAt", enrolledAt),
                checkRequired("toEmail", toEmail),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): PublicSequenceEnrollmentLiteResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        enrolledAt()
        toEmail()
        updatedAt()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (enrolledAt.asKnown().isPresent) 1 else 0) +
            (if (toEmail.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceEnrollmentLiteResponse &&
            id == other.id &&
            enrolledAt == other.enrolledAt &&
            toEmail == other.toEmail &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, enrolledAt, toEmail, updatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceEnrollmentLiteResponse{id=$id, enrolledAt=$enrolledAt, toEmail=$toEmail, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
