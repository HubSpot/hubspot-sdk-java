// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContactProfile
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addresses: JsonField<List<ContactAddress>>,
    private val emails: JsonField<List<ContactEmail>>,
    private val phones: JsonField<List<ContactPhone>>,
    private val urls: JsonField<List<ContactUrl>>,
    private val name: JsonField<ContactName>,
    private val org: JsonField<ContactOrg>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addresses")
        @ExcludeMissing
        addresses: JsonField<List<ContactAddress>> = JsonMissing.of(),
        @JsonProperty("emails")
        @ExcludeMissing
        emails: JsonField<List<ContactEmail>> = JsonMissing.of(),
        @JsonProperty("phones")
        @ExcludeMissing
        phones: JsonField<List<ContactPhone>> = JsonMissing.of(),
        @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<ContactUrl>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<ContactName> = JsonMissing.of(),
        @JsonProperty("org") @ExcludeMissing org: JsonField<ContactOrg> = JsonMissing.of(),
    ) : this(addresses, emails, phones, urls, name, org, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addresses(): List<ContactAddress> = addresses.getRequired("addresses")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun emails(): List<ContactEmail> = emails.getRequired("emails")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phones(): List<ContactPhone> = phones.getRequired("phones")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun urls(): List<ContactUrl> = urls.getRequired("urls")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<ContactName> = name.getOptional("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun org(): Optional<ContactOrg> = org.getOptional("org")

    /**
     * Returns the raw JSON value of [addresses].
     *
     * Unlike [addresses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addresses")
    @ExcludeMissing
    fun _addresses(): JsonField<List<ContactAddress>> = addresses

    /**
     * Returns the raw JSON value of [emails].
     *
     * Unlike [emails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emails") @ExcludeMissing fun _emails(): JsonField<List<ContactEmail>> = emails

    /**
     * Returns the raw JSON value of [phones].
     *
     * Unlike [phones], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phones") @ExcludeMissing fun _phones(): JsonField<List<ContactPhone>> = phones

    /**
     * Returns the raw JSON value of [urls].
     *
     * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urls") @ExcludeMissing fun _urls(): JsonField<List<ContactUrl>> = urls

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<ContactName> = name

    /**
     * Returns the raw JSON value of [org].
     *
     * Unlike [org], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org") @ExcludeMissing fun _org(): JsonField<ContactOrg> = org

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
         * Returns a mutable builder for constructing an instance of [ContactProfile].
         *
         * The following fields are required:
         * ```java
         * .addresses()
         * .emails()
         * .phones()
         * .urls()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContactProfile]. */
    class Builder internal constructor() {

        private var addresses: JsonField<MutableList<ContactAddress>>? = null
        private var emails: JsonField<MutableList<ContactEmail>>? = null
        private var phones: JsonField<MutableList<ContactPhone>>? = null
        private var urls: JsonField<MutableList<ContactUrl>>? = null
        private var name: JsonField<ContactName> = JsonMissing.of()
        private var org: JsonField<ContactOrg> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contactProfile: ContactProfile) = apply {
            addresses = contactProfile.addresses.map { it.toMutableList() }
            emails = contactProfile.emails.map { it.toMutableList() }
            phones = contactProfile.phones.map { it.toMutableList() }
            urls = contactProfile.urls.map { it.toMutableList() }
            name = contactProfile.name
            org = contactProfile.org
            additionalProperties = contactProfile.additionalProperties.toMutableMap()
        }

        fun addresses(addresses: List<ContactAddress>) = addresses(JsonField.of(addresses))

        /**
         * Sets [Builder.addresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addresses] with a well-typed `List<ContactAddress>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addresses(addresses: JsonField<List<ContactAddress>>) = apply {
            this.addresses = addresses.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactAddress] to [addresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddress(address: ContactAddress) = apply {
            addresses =
                (addresses ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addresses", it).add(address)
                }
        }

        fun emails(emails: List<ContactEmail>) = emails(JsonField.of(emails))

        /**
         * Sets [Builder.emails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emails] with a well-typed `List<ContactEmail>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emails(emails: JsonField<List<ContactEmail>>) = apply {
            this.emails = emails.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactEmail] to [emails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEmail(email: ContactEmail) = apply {
            emails =
                (emails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("emails", it).add(email)
                }
        }

        fun phones(phones: List<ContactPhone>) = phones(JsonField.of(phones))

        /**
         * Sets [Builder.phones] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phones] with a well-typed `List<ContactPhone>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phones(phones: JsonField<List<ContactPhone>>) = apply {
            this.phones = phones.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactPhone] to [phones].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPhone(phone: ContactPhone) = apply {
            phones =
                (phones ?: JsonField.of(mutableListOf())).also {
                    checkKnown("phones", it).add(phone)
                }
        }

        fun urls(urls: List<ContactUrl>) = urls(JsonField.of(urls))

        /**
         * Sets [Builder.urls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urls] with a well-typed `List<ContactUrl>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun urls(urls: JsonField<List<ContactUrl>>) = apply {
            this.urls = urls.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactUrl] to [urls].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUrl(url: ContactUrl) = apply {
            urls = (urls ?: JsonField.of(mutableListOf())).also { checkKnown("urls", it).add(url) }
        }

        fun name(name: ContactName) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [ContactName] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun name(name: JsonField<ContactName>) = apply { this.name = name }

        fun org(org: ContactOrg) = org(JsonField.of(org))

        /**
         * Sets [Builder.org] to an arbitrary JSON value.
         *
         * You should usually call [Builder.org] with a well-typed [ContactOrg] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun org(org: JsonField<ContactOrg>) = apply { this.org = org }

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
         * Returns an immutable instance of [ContactProfile].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .addresses()
         * .emails()
         * .phones()
         * .urls()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContactProfile =
            ContactProfile(
                checkRequired("addresses", addresses).map { it.toImmutable() },
                checkRequired("emails", emails).map { it.toImmutable() },
                checkRequired("phones", phones).map { it.toImmutable() },
                checkRequired("urls", urls).map { it.toImmutable() },
                name,
                org,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContactProfile = apply {
        if (validated) {
            return@apply
        }

        addresses().forEach { it.validate() }
        emails().forEach { it.validate() }
        phones().forEach { it.validate() }
        urls().forEach { it.validate() }
        name().ifPresent { it.validate() }
        org().ifPresent { it.validate() }
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
        (addresses.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (emails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (phones.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (urls.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (name.asKnown().getOrNull()?.validity() ?: 0) +
            (org.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContactProfile &&
            addresses == other.addresses &&
            emails == other.emails &&
            phones == other.phones &&
            urls == other.urls &&
            name == other.name &&
            org == other.org &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(addresses, emails, phones, urls, name, org, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContactProfile{addresses=$addresses, emails=$emails, phones=$phones, urls=$urls, name=$name, org=$org, additionalProperties=$additionalProperties}"
}
