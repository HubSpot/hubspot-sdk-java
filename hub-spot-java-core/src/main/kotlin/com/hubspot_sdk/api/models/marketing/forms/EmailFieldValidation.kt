// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

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
import kotlin.jvm.optionals.getOrNull

/** Describes how an email address should be validated. */
class EmailFieldValidation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val blockedEmailDomains: JsonField<List<String>>,
    private val useDefaultBlockList: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("blockedEmailDomains")
        @ExcludeMissing
        blockedEmailDomains: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("useDefaultBlockList")
        @ExcludeMissing
        useDefaultBlockList: JsonField<Boolean> = JsonMissing.of(),
    ) : this(blockedEmailDomains, useDefaultBlockList, mutableMapOf())

    /**
     * A list of email domains to block.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blockedEmailDomains(): List<String> = blockedEmailDomains.getRequired("blockedEmailDomains")

    /**
     * Whether to block the free email providers.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun useDefaultBlockList(): Boolean = useDefaultBlockList.getRequired("useDefaultBlockList")

    /**
     * Returns the raw JSON value of [blockedEmailDomains].
     *
     * Unlike [blockedEmailDomains], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("blockedEmailDomains")
    @ExcludeMissing
    fun _blockedEmailDomains(): JsonField<List<String>> = blockedEmailDomains

    /**
     * Returns the raw JSON value of [useDefaultBlockList].
     *
     * Unlike [useDefaultBlockList], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("useDefaultBlockList")
    @ExcludeMissing
    fun _useDefaultBlockList(): JsonField<Boolean> = useDefaultBlockList

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
         * Returns a mutable builder for constructing an instance of [EmailFieldValidation].
         *
         * The following fields are required:
         * ```java
         * .blockedEmailDomains()
         * .useDefaultBlockList()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailFieldValidation]. */
    class Builder internal constructor() {

        private var blockedEmailDomains: JsonField<MutableList<String>>? = null
        private var useDefaultBlockList: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailFieldValidation: EmailFieldValidation) = apply {
            blockedEmailDomains =
                emailFieldValidation.blockedEmailDomains.map { it.toMutableList() }
            useDefaultBlockList = emailFieldValidation.useDefaultBlockList
            additionalProperties = emailFieldValidation.additionalProperties.toMutableMap()
        }

        /** A list of email domains to block. */
        fun blockedEmailDomains(blockedEmailDomains: List<String>) =
            blockedEmailDomains(JsonField.of(blockedEmailDomains))

        /**
         * Sets [Builder.blockedEmailDomains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedEmailDomains] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun blockedEmailDomains(blockedEmailDomains: JsonField<List<String>>) = apply {
            this.blockedEmailDomains = blockedEmailDomains.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [blockedEmailDomains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedEmailDomain(blockedEmailDomain: String) = apply {
            blockedEmailDomains =
                (blockedEmailDomains ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedEmailDomains", it).add(blockedEmailDomain)
                }
        }

        /** Whether to block the free email providers. */
        fun useDefaultBlockList(useDefaultBlockList: Boolean) =
            useDefaultBlockList(JsonField.of(useDefaultBlockList))

        /**
         * Sets [Builder.useDefaultBlockList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useDefaultBlockList] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useDefaultBlockList(useDefaultBlockList: JsonField<Boolean>) = apply {
            this.useDefaultBlockList = useDefaultBlockList
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
         * Returns an immutable instance of [EmailFieldValidation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .blockedEmailDomains()
         * .useDefaultBlockList()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailFieldValidation =
            EmailFieldValidation(
                checkRequired("blockedEmailDomains", blockedEmailDomains).map { it.toImmutable() },
                checkRequired("useDefaultBlockList", useDefaultBlockList),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EmailFieldValidation = apply {
        if (validated) {
            return@apply
        }

        blockedEmailDomains()
        useDefaultBlockList()
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
        (blockedEmailDomains.asKnown().getOrNull()?.size ?: 0) +
            (if (useDefaultBlockList.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailFieldValidation &&
            blockedEmailDomains == other.blockedEmailDomains &&
            useDefaultBlockList == other.useDefaultBlockList &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(blockedEmailDomains, useDefaultBlockList, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailFieldValidation{blockedEmailDomains=$blockedEmailDomains, useDefaultBlockList=$useDefaultBlockList, additionalProperties=$additionalProperties}"
}
