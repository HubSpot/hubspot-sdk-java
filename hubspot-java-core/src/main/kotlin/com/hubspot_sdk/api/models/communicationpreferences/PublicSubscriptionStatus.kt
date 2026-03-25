// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicSubscriptionStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val name: JsonField<String>,
    private val sourceOfStatus: JsonField<SourceOfStatus>,
    private val status: JsonField<Status>,
    private val brandId: JsonField<Long>,
    private val legalBasis: JsonField<LegalBasis>,
    private val legalBasisExplanation: JsonField<String>,
    private val preferenceGroupName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceOfStatus")
        @ExcludeMissing
        sourceOfStatus: JsonField<SourceOfStatus> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("brandId") @ExcludeMissing brandId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("legalBasis")
        @ExcludeMissing
        legalBasis: JsonField<LegalBasis> = JsonMissing.of(),
        @JsonProperty("legalBasisExplanation")
        @ExcludeMissing
        legalBasisExplanation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferenceGroupName")
        @ExcludeMissing
        preferenceGroupName: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        description,
        name,
        sourceOfStatus,
        status,
        brandId,
        legalBasis,
        legalBasisExplanation,
        preferenceGroupName,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the subscription status.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A description of the subscription status.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The name of the subscription status.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Indicates the origin of the subscription status, with possible values being
     * 'PORTAL_WIDE_STATUS', 'BRAND_WIDE_STATUS', or 'SUBSCRIPTION_STATUS'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceOfStatus(): SourceOfStatus = sourceOfStatus.getRequired("sourceOfStatus")

    /**
     * The current status of the subscription, which can be 'SUBSCRIBED' or 'NOT_SUBSCRIBED'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The unique identifier for the brand associated with the subscription status, represented as
     * an integer.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brandId(): Optional<Long> = brandId.getOptional("brandId")

    /**
     * The legal basis for processing the subscription, which can include values such as
     * 'LEGITIMATE_INTEREST_PQL', 'LEGITIMATE_INTEREST_CLIENT', 'PERFORMANCE_OF_CONTRACT',
     * 'CONSENT_WITH_NOTICE', 'NON_GDPR', 'PROCESS_AND_STORE', or 'LEGITIMATE_INTEREST_OTHER'.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasis(): Optional<LegalBasis> = legalBasis.getOptional("legalBasis")

    /**
     * An explanation of the legal basis for the subscription status.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalBasisExplanation(): Optional<String> =
        legalBasisExplanation.getOptional("legalBasisExplanation")

    /**
     * The name of the preference group associated with the subscription status.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferenceGroupName(): Optional<String> =
        preferenceGroupName.getOptional("preferenceGroupName")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sourceOfStatus].
     *
     * Unlike [sourceOfStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceOfStatus")
    @ExcludeMissing
    fun _sourceOfStatus(): JsonField<SourceOfStatus> = sourceOfStatus

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [brandId].
     *
     * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brandId") @ExcludeMissing fun _brandId(): JsonField<Long> = brandId

    /**
     * Returns the raw JSON value of [legalBasis].
     *
     * Unlike [legalBasis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legalBasis")
    @ExcludeMissing
    fun _legalBasis(): JsonField<LegalBasis> = legalBasis

    /**
     * Returns the raw JSON value of [legalBasisExplanation].
     *
     * Unlike [legalBasisExplanation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalBasisExplanation")
    @ExcludeMissing
    fun _legalBasisExplanation(): JsonField<String> = legalBasisExplanation

    /**
     * Returns the raw JSON value of [preferenceGroupName].
     *
     * Unlike [preferenceGroupName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("preferenceGroupName")
    @ExcludeMissing
    fun _preferenceGroupName(): JsonField<String> = preferenceGroupName

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
         * Returns a mutable builder for constructing an instance of [PublicSubscriptionStatus].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .name()
         * .sourceOfStatus()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSubscriptionStatus]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var sourceOfStatus: JsonField<SourceOfStatus>? = null
        private var status: JsonField<Status>? = null
        private var brandId: JsonField<Long> = JsonMissing.of()
        private var legalBasis: JsonField<LegalBasis> = JsonMissing.of()
        private var legalBasisExplanation: JsonField<String> = JsonMissing.of()
        private var preferenceGroupName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSubscriptionStatus: PublicSubscriptionStatus) = apply {
            id = publicSubscriptionStatus.id
            description = publicSubscriptionStatus.description
            name = publicSubscriptionStatus.name
            sourceOfStatus = publicSubscriptionStatus.sourceOfStatus
            status = publicSubscriptionStatus.status
            brandId = publicSubscriptionStatus.brandId
            legalBasis = publicSubscriptionStatus.legalBasis
            legalBasisExplanation = publicSubscriptionStatus.legalBasisExplanation
            preferenceGroupName = publicSubscriptionStatus.preferenceGroupName
            additionalProperties = publicSubscriptionStatus.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the subscription status. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A description of the subscription status. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The name of the subscription status. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Indicates the origin of the subscription status, with possible values being
         * 'PORTAL_WIDE_STATUS', 'BRAND_WIDE_STATUS', or 'SUBSCRIPTION_STATUS'.
         */
        fun sourceOfStatus(sourceOfStatus: SourceOfStatus) =
            sourceOfStatus(JsonField.of(sourceOfStatus))

        /**
         * Sets [Builder.sourceOfStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfStatus] with a well-typed [SourceOfStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceOfStatus(sourceOfStatus: JsonField<SourceOfStatus>) = apply {
            this.sourceOfStatus = sourceOfStatus
        }

        /**
         * The current status of the subscription, which can be 'SUBSCRIBED' or 'NOT_SUBSCRIBED'.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The unique identifier for the brand associated with the subscription status, represented
         * as an integer.
         */
        fun brandId(brandId: Long) = brandId(JsonField.of(brandId))

        /**
         * Sets [Builder.brandId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brandId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brandId(brandId: JsonField<Long>) = apply { this.brandId = brandId }

        /**
         * The legal basis for processing the subscription, which can include values such as
         * 'LEGITIMATE_INTEREST_PQL', 'LEGITIMATE_INTEREST_CLIENT', 'PERFORMANCE_OF_CONTRACT',
         * 'CONSENT_WITH_NOTICE', 'NON_GDPR', 'PROCESS_AND_STORE', or 'LEGITIMATE_INTEREST_OTHER'.
         */
        fun legalBasis(legalBasis: LegalBasis) = legalBasis(JsonField.of(legalBasis))

        /**
         * Sets [Builder.legalBasis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasis] with a well-typed [LegalBasis] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasis(legalBasis: JsonField<LegalBasis>) = apply { this.legalBasis = legalBasis }

        /** An explanation of the legal basis for the subscription status. */
        fun legalBasisExplanation(legalBasisExplanation: String) =
            legalBasisExplanation(JsonField.of(legalBasisExplanation))

        /**
         * Sets [Builder.legalBasisExplanation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalBasisExplanation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun legalBasisExplanation(legalBasisExplanation: JsonField<String>) = apply {
            this.legalBasisExplanation = legalBasisExplanation
        }

        /** The name of the preference group associated with the subscription status. */
        fun preferenceGroupName(preferenceGroupName: String) =
            preferenceGroupName(JsonField.of(preferenceGroupName))

        /**
         * Sets [Builder.preferenceGroupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferenceGroupName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferenceGroupName(preferenceGroupName: JsonField<String>) = apply {
            this.preferenceGroupName = preferenceGroupName
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
         * Returns an immutable instance of [PublicSubscriptionStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .name()
         * .sourceOfStatus()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSubscriptionStatus =
            PublicSubscriptionStatus(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("sourceOfStatus", sourceOfStatus),
                checkRequired("status", status),
                brandId,
                legalBasis,
                legalBasisExplanation,
                preferenceGroupName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSubscriptionStatus = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        name()
        sourceOfStatus().validate()
        status().validate()
        brandId()
        legalBasis().ifPresent { it.validate() }
        legalBasisExplanation()
        preferenceGroupName()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (sourceOfStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (brandId.asKnown().isPresent) 1 else 0) +
            (legalBasis.asKnown().getOrNull()?.validity() ?: 0) +
            (if (legalBasisExplanation.asKnown().isPresent) 1 else 0) +
            (if (preferenceGroupName.asKnown().isPresent) 1 else 0)

    /**
     * Indicates the origin of the subscription status, with possible values being
     * 'PORTAL_WIDE_STATUS', 'BRAND_WIDE_STATUS', or 'SUBSCRIPTION_STATUS'.
     */
    class SourceOfStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BRAND_WIDE_STATUS = of("BRAND_WIDE_STATUS")

            @JvmField val PORTAL_WIDE_STATUS = of("PORTAL_WIDE_STATUS")

            @JvmField val SUBSCRIPTION_STATUS = of("SUBSCRIPTION_STATUS")

            @JvmStatic fun of(value: String) = SourceOfStatus(JsonField.of(value))
        }

        /** An enum containing [SourceOfStatus]'s known values. */
        enum class Known {
            BRAND_WIDE_STATUS,
            PORTAL_WIDE_STATUS,
            SUBSCRIPTION_STATUS,
        }

        /**
         * An enum containing [SourceOfStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceOfStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BRAND_WIDE_STATUS,
            PORTAL_WIDE_STATUS,
            SUBSCRIPTION_STATUS,
            /**
             * An enum member indicating that [SourceOfStatus] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                BRAND_WIDE_STATUS -> Value.BRAND_WIDE_STATUS
                PORTAL_WIDE_STATUS -> Value.PORTAL_WIDE_STATUS
                SUBSCRIPTION_STATUS -> Value.SUBSCRIPTION_STATUS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                BRAND_WIDE_STATUS -> Known.BRAND_WIDE_STATUS
                PORTAL_WIDE_STATUS -> Known.PORTAL_WIDE_STATUS
                SUBSCRIPTION_STATUS -> Known.SUBSCRIPTION_STATUS
                else -> throw HubspotInvalidDataException("Unknown SourceOfStatus: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): SourceOfStatus = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SourceOfStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The current status of the subscription, which can be 'SUBSCRIBED' or 'NOT_SUBSCRIBED'. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val NOT_SUBSCRIBED = of("NOT_SUBSCRIBED")

            @JvmField val SUBSCRIBED = of("SUBSCRIBED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            NOT_SUBSCRIBED,
            SUBSCRIBED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_SUBSCRIBED,
            SUBSCRIBED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                NOT_SUBSCRIBED -> Value.NOT_SUBSCRIBED
                SUBSCRIBED -> Value.SUBSCRIBED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                NOT_SUBSCRIBED -> Known.NOT_SUBSCRIBED
                SUBSCRIBED -> Known.SUBSCRIBED
                else -> throw HubspotInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The legal basis for processing the subscription, which can include values such as
     * 'LEGITIMATE_INTEREST_PQL', 'LEGITIMATE_INTEREST_CLIENT', 'PERFORMANCE_OF_CONTRACT',
     * 'CONSENT_WITH_NOTICE', 'NON_GDPR', 'PROCESS_AND_STORE', or 'LEGITIMATE_INTEREST_OTHER'.
     */
    class LegalBasis @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CONSENT_WITH_NOTICE = of("CONSENT_WITH_NOTICE")

            @JvmField val LEGITIMATE_INTEREST_CLIENT = of("LEGITIMATE_INTEREST_CLIENT")

            @JvmField val LEGITIMATE_INTEREST_OTHER = of("LEGITIMATE_INTEREST_OTHER")

            @JvmField val LEGITIMATE_INTEREST_PQL = of("LEGITIMATE_INTEREST_PQL")

            @JvmField val NON_GDPR = of("NON_GDPR")

            @JvmField val PERFORMANCE_OF_CONTRACT = of("PERFORMANCE_OF_CONTRACT")

            @JvmField val PROCESS_AND_STORE = of("PROCESS_AND_STORE")

            @JvmStatic fun of(value: String) = LegalBasis(JsonField.of(value))
        }

        /** An enum containing [LegalBasis]'s known values. */
        enum class Known {
            CONSENT_WITH_NOTICE,
            LEGITIMATE_INTEREST_CLIENT,
            LEGITIMATE_INTEREST_OTHER,
            LEGITIMATE_INTEREST_PQL,
            NON_GDPR,
            PERFORMANCE_OF_CONTRACT,
            PROCESS_AND_STORE,
        }

        /**
         * An enum containing [LegalBasis]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LegalBasis] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONSENT_WITH_NOTICE,
            LEGITIMATE_INTEREST_CLIENT,
            LEGITIMATE_INTEREST_OTHER,
            LEGITIMATE_INTEREST_PQL,
            NON_GDPR,
            PERFORMANCE_OF_CONTRACT,
            PROCESS_AND_STORE,
            /**
             * An enum member indicating that [LegalBasis] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CONSENT_WITH_NOTICE -> Value.CONSENT_WITH_NOTICE
                LEGITIMATE_INTEREST_CLIENT -> Value.LEGITIMATE_INTEREST_CLIENT
                LEGITIMATE_INTEREST_OTHER -> Value.LEGITIMATE_INTEREST_OTHER
                LEGITIMATE_INTEREST_PQL -> Value.LEGITIMATE_INTEREST_PQL
                NON_GDPR -> Value.NON_GDPR
                PERFORMANCE_OF_CONTRACT -> Value.PERFORMANCE_OF_CONTRACT
                PROCESS_AND_STORE -> Value.PROCESS_AND_STORE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CONSENT_WITH_NOTICE -> Known.CONSENT_WITH_NOTICE
                LEGITIMATE_INTEREST_CLIENT -> Known.LEGITIMATE_INTEREST_CLIENT
                LEGITIMATE_INTEREST_OTHER -> Known.LEGITIMATE_INTEREST_OTHER
                LEGITIMATE_INTEREST_PQL -> Known.LEGITIMATE_INTEREST_PQL
                NON_GDPR -> Known.NON_GDPR
                PERFORMANCE_OF_CONTRACT -> Known.PERFORMANCE_OF_CONTRACT
                PROCESS_AND_STORE -> Known.PROCESS_AND_STORE
                else -> throw HubspotInvalidDataException("Unknown LegalBasis: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): LegalBasis = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalBasis && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSubscriptionStatus &&
            id == other.id &&
            description == other.description &&
            name == other.name &&
            sourceOfStatus == other.sourceOfStatus &&
            status == other.status &&
            brandId == other.brandId &&
            legalBasis == other.legalBasis &&
            legalBasisExplanation == other.legalBasisExplanation &&
            preferenceGroupName == other.preferenceGroupName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            description,
            name,
            sourceOfStatus,
            status,
            brandId,
            legalBasis,
            legalBasisExplanation,
            preferenceGroupName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSubscriptionStatus{id=$id, description=$description, name=$name, sourceOfStatus=$sourceOfStatus, status=$status, brandId=$brandId, legalBasis=$legalBasis, legalBasisExplanation=$legalBasisExplanation, preferenceGroupName=$preferenceGroupName, additionalProperties=$additionalProperties}"
}
