// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PublicSequenceEnrollmentResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val enrolledAt: JsonField<OffsetDateTime>,
    private val enrolledBy: JsonField<String>,
    private val enrolledByEmail: JsonField<String>,
    private val sequenceId: JsonField<String>,
    private val sequenceName: JsonField<String>,
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
        @JsonProperty("enrolledBy")
        @ExcludeMissing
        enrolledBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enrolledByEmail")
        @ExcludeMissing
        enrolledByEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sequenceId")
        @ExcludeMissing
        sequenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sequenceName")
        @ExcludeMissing
        sequenceName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("toEmail") @ExcludeMissing toEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        enrolledAt,
        enrolledBy,
        enrolledByEmail,
        sequenceId,
        sequenceName,
        toEmail,
        updatedAt,
        mutableMapOf(),
    )

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
     * The identifier of the user who enrolled the contact in the sequence.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enrolledBy(): String = enrolledBy.getRequired("enrolledBy")

    /**
     * The email address of the user who enrolled the contact in the sequence.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enrolledByEmail(): String = enrolledByEmail.getRequired("enrolledByEmail")

    /**
     * The unique identifier of the sequence in which the contact is enrolled.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sequenceId(): String = sequenceId.getRequired("sequenceId")

    /**
     * The name of the sequence in which the contact is enrolled.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sequenceName(): String = sequenceName.getRequired("sequenceName")

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
     * Returns the raw JSON value of [enrolledBy].
     *
     * Unlike [enrolledBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrolledBy") @ExcludeMissing fun _enrolledBy(): JsonField<String> = enrolledBy

    /**
     * Returns the raw JSON value of [enrolledByEmail].
     *
     * Unlike [enrolledByEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enrolledByEmail")
    @ExcludeMissing
    fun _enrolledByEmail(): JsonField<String> = enrolledByEmail

    /**
     * Returns the raw JSON value of [sequenceId].
     *
     * Unlike [sequenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceId") @ExcludeMissing fun _sequenceId(): JsonField<String> = sequenceId

    /**
     * Returns the raw JSON value of [sequenceName].
     *
     * Unlike [sequenceName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceName")
    @ExcludeMissing
    fun _sequenceName(): JsonField<String> = sequenceName

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
         * [PublicSequenceEnrollmentResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .enrolledAt()
         * .enrolledBy()
         * .enrolledByEmail()
         * .sequenceId()
         * .sequenceName()
         * .toEmail()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceEnrollmentResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var enrolledAt: JsonField<OffsetDateTime>? = null
        private var enrolledBy: JsonField<String>? = null
        private var enrolledByEmail: JsonField<String>? = null
        private var sequenceId: JsonField<String>? = null
        private var sequenceName: JsonField<String>? = null
        private var toEmail: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSequenceEnrollmentResponse: PublicSequenceEnrollmentResponse) =
            apply {
                id = publicSequenceEnrollmentResponse.id
                enrolledAt = publicSequenceEnrollmentResponse.enrolledAt
                enrolledBy = publicSequenceEnrollmentResponse.enrolledBy
                enrolledByEmail = publicSequenceEnrollmentResponse.enrolledByEmail
                sequenceId = publicSequenceEnrollmentResponse.sequenceId
                sequenceName = publicSequenceEnrollmentResponse.sequenceName
                toEmail = publicSequenceEnrollmentResponse.toEmail
                updatedAt = publicSequenceEnrollmentResponse.updatedAt
                additionalProperties =
                    publicSequenceEnrollmentResponse.additionalProperties.toMutableMap()
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

        /** The identifier of the user who enrolled the contact in the sequence. */
        fun enrolledBy(enrolledBy: String) = enrolledBy(JsonField.of(enrolledBy))

        /**
         * Sets [Builder.enrolledBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrolledBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun enrolledBy(enrolledBy: JsonField<String>) = apply { this.enrolledBy = enrolledBy }

        /** The email address of the user who enrolled the contact in the sequence. */
        fun enrolledByEmail(enrolledByEmail: String) =
            enrolledByEmail(JsonField.of(enrolledByEmail))

        /**
         * Sets [Builder.enrolledByEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrolledByEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun enrolledByEmail(enrolledByEmail: JsonField<String>) = apply {
            this.enrolledByEmail = enrolledByEmail
        }

        /** The unique identifier of the sequence in which the contact is enrolled. */
        fun sequenceId(sequenceId: String) = sequenceId(JsonField.of(sequenceId))

        /**
         * Sets [Builder.sequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sequenceId(sequenceId: JsonField<String>) = apply { this.sequenceId = sequenceId }

        /** The name of the sequence in which the contact is enrolled. */
        fun sequenceName(sequenceName: String) = sequenceName(JsonField.of(sequenceName))

        /**
         * Sets [Builder.sequenceName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sequenceName(sequenceName: JsonField<String>) = apply {
            this.sequenceName = sequenceName
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
         * Returns an immutable instance of [PublicSequenceEnrollmentResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .enrolledAt()
         * .enrolledBy()
         * .enrolledByEmail()
         * .sequenceId()
         * .sequenceName()
         * .toEmail()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceEnrollmentResponse =
            PublicSequenceEnrollmentResponse(
                checkRequired("id", id),
                checkRequired("enrolledAt", enrolledAt),
                checkRequired("enrolledBy", enrolledBy),
                checkRequired("enrolledByEmail", enrolledByEmail),
                checkRequired("sequenceId", sequenceId),
                checkRequired("sequenceName", sequenceName),
                checkRequired("toEmail", toEmail),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSequenceEnrollmentResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        enrolledAt()
        enrolledBy()
        enrolledByEmail()
        sequenceId()
        sequenceName()
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
            (if (enrolledBy.asKnown().isPresent) 1 else 0) +
            (if (enrolledByEmail.asKnown().isPresent) 1 else 0) +
            (if (sequenceId.asKnown().isPresent) 1 else 0) +
            (if (sequenceName.asKnown().isPresent) 1 else 0) +
            (if (toEmail.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceEnrollmentResponse &&
            id == other.id &&
            enrolledAt == other.enrolledAt &&
            enrolledBy == other.enrolledBy &&
            enrolledByEmail == other.enrolledByEmail &&
            sequenceId == other.sequenceId &&
            sequenceName == other.sequenceName &&
            toEmail == other.toEmail &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            enrolledAt,
            enrolledBy,
            enrolledByEmail,
            sequenceId,
            sequenceName,
            toEmail,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceEnrollmentResponse{id=$id, enrolledAt=$enrolledAt, enrolledBy=$enrolledBy, enrolledByEmail=$enrolledByEmail, sequenceId=$sequenceId, sequenceName=$sequenceName, toEmail=$toEmail, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
