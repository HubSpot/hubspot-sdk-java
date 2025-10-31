// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A request to send a single email asynchronously. */
class PublicSingleSendRequestEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val emailId: JsonField<Long>,
    private val message: JsonField<PublicSingleSendEmail>,
    private val contactProperties: JsonField<ContactProperties>,
    private val customProperties: JsonField<CustomProperties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("emailId") @ExcludeMissing emailId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("message")
        @ExcludeMissing
        message: JsonField<PublicSingleSendEmail> = JsonMissing.of(),
        @JsonProperty("contactProperties")
        @ExcludeMissing
        contactProperties: JsonField<ContactProperties> = JsonMissing.of(),
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<CustomProperties> = JsonMissing.of(),
    ) : this(emailId, message, contactProperties, customProperties, mutableMapOf())

    /**
     * The content ID for the email, which can be found in email tool UI.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emailId(): Long = emailId.getRequired("emailId")

    /**
     * A JSON object containing anything you want to override.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun message(): PublicSingleSendEmail = message.getRequired("message")

    /**
     * The contactProperties field is a map of contact property values. Each contact property value
     * contains a name and value property. Each property will get set on the contact record and will
     * be visible in the template under {{ contact.NAME }}. Use these properties when you want to
     * set a contact property while you’re sending the email. For example, when sending a receipt
     * you may want to set a last_paid_date property, as the sending of the receipt will have
     * information about the last payment.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactProperties(): Optional<ContactProperties> =
        contactProperties.getOptional("contactProperties")

    /**
     * The customProperties field is a map of property values. Each property value contains a name
     * and value property. Each property will be visible in the template under {{ custom.NAME }}.
     * Note: Custom properties do not currently support arrays. To provide a listing in an email,
     * one workaround is to build an HTML list (either with tables or ul) and specify it as a custom
     * property.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customProperties(): Optional<CustomProperties> =
        customProperties.getOptional("customProperties")

    /**
     * Returns the raw JSON value of [emailId].
     *
     * Unlike [emailId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emailId") @ExcludeMissing fun _emailId(): JsonField<Long> = emailId

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message")
    @ExcludeMissing
    fun _message(): JsonField<PublicSingleSendEmail> = message

    /**
     * Returns the raw JSON value of [contactProperties].
     *
     * Unlike [contactProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contactProperties")
    @ExcludeMissing
    fun _contactProperties(): JsonField<ContactProperties> = contactProperties

    /**
     * Returns the raw JSON value of [customProperties].
     *
     * Unlike [customProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customProperties")
    @ExcludeMissing
    fun _customProperties(): JsonField<CustomProperties> = customProperties

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
         * Returns a mutable builder for constructing an instance of [PublicSingleSendRequestEgg].
         *
         * The following fields are required:
         * ```java
         * .emailId()
         * .message()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSingleSendRequestEgg]. */
    class Builder internal constructor() {

        private var emailId: JsonField<Long>? = null
        private var message: JsonField<PublicSingleSendEmail>? = null
        private var contactProperties: JsonField<ContactProperties> = JsonMissing.of()
        private var customProperties: JsonField<CustomProperties> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSingleSendRequestEgg: PublicSingleSendRequestEgg) = apply {
            emailId = publicSingleSendRequestEgg.emailId
            message = publicSingleSendRequestEgg.message
            contactProperties = publicSingleSendRequestEgg.contactProperties
            customProperties = publicSingleSendRequestEgg.customProperties
            additionalProperties = publicSingleSendRequestEgg.additionalProperties.toMutableMap()
        }

        /** The content ID for the email, which can be found in email tool UI. */
        fun emailId(emailId: Long) = emailId(JsonField.of(emailId))

        /**
         * Sets [Builder.emailId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emailId(emailId: JsonField<Long>) = apply { this.emailId = emailId }

        /** A JSON object containing anything you want to override. */
        fun message(message: PublicSingleSendEmail) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [PublicSingleSendEmail] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun message(message: JsonField<PublicSingleSendEmail>) = apply { this.message = message }

        /**
         * The contactProperties field is a map of contact property values. Each contact property
         * value contains a name and value property. Each property will get set on the contact
         * record and will be visible in the template under {{ contact.NAME }}. Use these properties
         * when you want to set a contact property while you’re sending the email. For example, when
         * sending a receipt you may want to set a last_paid_date property, as the sending of the
         * receipt will have information about the last payment.
         */
        fun contactProperties(contactProperties: ContactProperties) =
            contactProperties(JsonField.of(contactProperties))

        /**
         * Sets [Builder.contactProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactProperties] with a well-typed [ContactProperties]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contactProperties(contactProperties: JsonField<ContactProperties>) = apply {
            this.contactProperties = contactProperties
        }

        /**
         * The customProperties field is a map of property values. Each property value contains a
         * name and value property. Each property will be visible in the template under {{
         * custom.NAME }}. Note: Custom properties do not currently support arrays. To provide a
         * listing in an email, one workaround is to build an HTML list (either with tables or ul)
         * and specify it as a custom property.
         */
        fun customProperties(customProperties: CustomProperties) =
            customProperties(JsonField.of(customProperties))

        /**
         * Sets [Builder.customProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customProperties] with a well-typed [CustomProperties]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customProperties(customProperties: JsonField<CustomProperties>) = apply {
            this.customProperties = customProperties
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
         * Returns an immutable instance of [PublicSingleSendRequestEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .emailId()
         * .message()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSingleSendRequestEgg =
            PublicSingleSendRequestEgg(
                checkRequired("emailId", emailId),
                checkRequired("message", message),
                contactProperties,
                customProperties,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSingleSendRequestEgg = apply {
        if (validated) {
            return@apply
        }

        emailId()
        message().validate()
        contactProperties().ifPresent { it.validate() }
        customProperties().ifPresent { it.validate() }
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
        (if (emailId.asKnown().isPresent) 1 else 0) +
            (message.asKnown().getOrNull()?.validity() ?: 0) +
            (contactProperties.asKnown().getOrNull()?.validity() ?: 0) +
            (customProperties.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * The contactProperties field is a map of contact property values. Each contact property value
     * contains a name and value property. Each property will get set on the contact record and will
     * be visible in the template under {{ contact.NAME }}. Use these properties when you want to
     * set a contact property while you’re sending the email. For example, when sending a receipt
     * you may want to set a last_paid_date property, as the sending of the receipt will have
     * information about the last payment.
     */
    class ContactProperties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ContactProperties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContactProperties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contactProperties: ContactProperties) = apply {
                additionalProperties = contactProperties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ContactProperties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ContactProperties = ContactProperties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ContactProperties = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContactProperties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ContactProperties{additionalProperties=$additionalProperties}"
    }

    /**
     * The customProperties field is a map of property values. Each property value contains a name
     * and value property. Each property will be visible in the template under {{ custom.NAME }}.
     * Note: Custom properties do not currently support arrays. To provide a listing in an email,
     * one workaround is to build an HTML list (either with tables or ul) and specify it as a custom
     * property.
     */
    class CustomProperties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomProperties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomProperties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customProperties: CustomProperties) = apply {
                additionalProperties = customProperties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomProperties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomProperties = CustomProperties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomProperties = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomProperties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomProperties{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSingleSendRequestEgg &&
            emailId == other.emailId &&
            message == other.message &&
            contactProperties == other.contactProperties &&
            customProperties == other.customProperties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(emailId, message, contactProperties, customProperties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSingleSendRequestEgg{emailId=$emailId, message=$message, contactProperties=$contactProperties, customProperties=$customProperties, additionalProperties=$additionalProperties}"
}
