// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.calling

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

class ContactCallerId
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callerIdType: JsonField<CallerIdType>,
    private val objectCoordinates: JsonField<ObjectCoordinates>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val lastName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("callerIdType")
        @ExcludeMissing
        callerIdType: JsonField<CallerIdType> = JsonMissing.of(),
        @JsonProperty("objectCoordinates")
        @ExcludeMissing
        objectCoordinates: JsonField<ObjectCoordinates> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
    ) : this(callerIdType, objectCoordinates, email, firstName, lastName, mutableMapOf())

    /**
     * Specifies the type of caller ID, with the default value being CONTACT.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callerIdType(): CallerIdType = callerIdType.getRequired("callerIdType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectCoordinates(): ObjectCoordinates = objectCoordinates.getRequired("objectCoordinates")

    /**
     * The email address of the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The first name of the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The last name of the contact.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * Returns the raw JSON value of [callerIdType].
     *
     * Unlike [callerIdType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callerIdType")
    @ExcludeMissing
    fun _callerIdType(): JsonField<CallerIdType> = callerIdType

    /**
     * Returns the raw JSON value of [objectCoordinates].
     *
     * Unlike [objectCoordinates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectCoordinates")
    @ExcludeMissing
    fun _objectCoordinates(): JsonField<ObjectCoordinates> = objectCoordinates

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

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
         * Returns a mutable builder for constructing an instance of [ContactCallerId].
         *
         * The following fields are required:
         * ```java
         * .callerIdType()
         * .objectCoordinates()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactCallerId]. */
    class Builder internal constructor() {

        private var callerIdType: JsonField<CallerIdType>? = null
        private var objectCoordinates: JsonField<ObjectCoordinates>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactCallerId: ContactCallerId) = apply {
            callerIdType = contactCallerId.callerIdType
            objectCoordinates = contactCallerId.objectCoordinates
            email = contactCallerId.email
            firstName = contactCallerId.firstName
            lastName = contactCallerId.lastName
            additionalProperties = contactCallerId.additionalProperties.toMutableMap()
        }

        /** Specifies the type of caller ID, with the default value being CONTACT. */
        fun callerIdType(callerIdType: CallerIdType) = callerIdType(JsonField.of(callerIdType))

        /**
         * Sets [Builder.callerIdType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerIdType] with a well-typed [CallerIdType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun callerIdType(callerIdType: JsonField<CallerIdType>) = apply {
            this.callerIdType = callerIdType
        }

        fun objectCoordinates(objectCoordinates: ObjectCoordinates) =
            objectCoordinates(JsonField.of(objectCoordinates))

        /**
         * Sets [Builder.objectCoordinates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectCoordinates] with a well-typed [ObjectCoordinates]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun objectCoordinates(objectCoordinates: JsonField<ObjectCoordinates>) = apply {
            this.objectCoordinates = objectCoordinates
        }

        /** The email address of the contact. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The first name of the contact. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The last name of the contact. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

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
         * Returns an immutable instance of [ContactCallerId].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .callerIdType()
         * .objectCoordinates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactCallerId =
            ContactCallerId(
                checkRequired("callerIdType", callerIdType),
                checkRequired("objectCoordinates", objectCoordinates),
                email,
                firstName,
                lastName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactCallerId = apply {
        if (validated) {
            return@apply
        }

        callerIdType().validate()
        objectCoordinates().validate()
        email()
        firstName()
        lastName()
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
        (callerIdType.asKnown().getOrNull()?.validity() ?: 0) +
            (objectCoordinates.asKnown().getOrNull()?.validity() ?: 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0)

    /** Specifies the type of caller ID, with the default value being CONTACT. */
    class CallerIdType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CONTACT = of("CONTACT")

            @JvmStatic fun of(value: String) = CallerIdType(JsonField.of(value))
        }

        /** An enum containing [CallerIdType]'s known values. */
        enum class Known {
            CONTACT
        }

        /**
         * An enum containing [CallerIdType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CallerIdType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONTACT,
            /**
             * An enum member indicating that [CallerIdType] was instantiated with an unknown value.
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
                CONTACT -> Value.CONTACT
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
                CONTACT -> Known.CONTACT
                else -> throw HubspotInvalidDataException("Unknown CallerIdType: $value")
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

        fun validate(): CallerIdType = apply {
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

            return other is CallerIdType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactCallerId &&
            callerIdType == other.callerIdType &&
            objectCoordinates == other.objectCoordinates &&
            email == other.email &&
            firstName == other.firstName &&
            lastName == other.lastName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callerIdType,
            objectCoordinates,
            email,
            firstName,
            lastName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactCallerId{callerIdType=$callerIdType, objectCoordinates=$objectCoordinates, email=$email, firstName=$firstName, lastName=$lastName, additionalProperties=$additionalProperties}"
}
