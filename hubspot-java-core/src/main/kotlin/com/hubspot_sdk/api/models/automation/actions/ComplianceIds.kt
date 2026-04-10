// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

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

class ComplianceIds
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val contactIds: JsonField<List<ContactId>>,
    private val portalIds: JsonField<List<Int>>,
    private val userIds: JsonField<List<Int>>,
    private val noContactIdReason: JsonField<String>,
    private val noPortalIdReason: JsonField<String>,
    private val noUserIdReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("contactIds")
        @ExcludeMissing
        contactIds: JsonField<List<ContactId>> = JsonMissing.of(),
        @JsonProperty("portalIds")
        @ExcludeMissing
        portalIds: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("userIds") @ExcludeMissing userIds: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("noContactIdReason")
        @ExcludeMissing
        noContactIdReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("noPortalIdReason")
        @ExcludeMissing
        noPortalIdReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("noUserIdReason")
        @ExcludeMissing
        noUserIdReason: JsonField<String> = JsonMissing.of(),
    ) : this(
        contactIds,
        portalIds,
        userIds,
        noContactIdReason,
        noPortalIdReason,
        noUserIdReason,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactIds(): List<ContactId> = contactIds.getRequired("contactIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun portalIds(): List<Int> = portalIds.getRequired("portalIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userIds(): List<Int> = userIds.getRequired("userIds")

    /**
     * The reason why no contact ID is available.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noContactIdReason(): Optional<String> = noContactIdReason.getOptional("noContactIdReason")

    /**
     * The reason why no portal ID is available.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noPortalIdReason(): Optional<String> = noPortalIdReason.getOptional("noPortalIdReason")

    /**
     * The reason why no user ID is available.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun noUserIdReason(): Optional<String> = noUserIdReason.getOptional("noUserIdReason")

    /**
     * Returns the raw JSON value of [contactIds].
     *
     * Unlike [contactIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactIds")
    @ExcludeMissing
    fun _contactIds(): JsonField<List<ContactId>> = contactIds

    /**
     * Returns the raw JSON value of [portalIds].
     *
     * Unlike [portalIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("portalIds") @ExcludeMissing fun _portalIds(): JsonField<List<Int>> = portalIds

    /**
     * Returns the raw JSON value of [userIds].
     *
     * Unlike [userIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userIds") @ExcludeMissing fun _userIds(): JsonField<List<Int>> = userIds

    /**
     * Returns the raw JSON value of [noContactIdReason].
     *
     * Unlike [noContactIdReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("noContactIdReason")
    @ExcludeMissing
    fun _noContactIdReason(): JsonField<String> = noContactIdReason

    /**
     * Returns the raw JSON value of [noPortalIdReason].
     *
     * Unlike [noPortalIdReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("noPortalIdReason")
    @ExcludeMissing
    fun _noPortalIdReason(): JsonField<String> = noPortalIdReason

    /**
     * Returns the raw JSON value of [noUserIdReason].
     *
     * Unlike [noUserIdReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("noUserIdReason")
    @ExcludeMissing
    fun _noUserIdReason(): JsonField<String> = noUserIdReason

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
         * Returns a mutable builder for constructing an instance of [ComplianceIds].
         *
         * The following fields are required:
         * ```java
         * .contactIds()
         * .portalIds()
         * .userIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ComplianceIds]. */
    class Builder internal constructor() {

        private var contactIds: JsonField<MutableList<ContactId>>? = null
        private var portalIds: JsonField<MutableList<Int>>? = null
        private var userIds: JsonField<MutableList<Int>>? = null
        private var noContactIdReason: JsonField<String> = JsonMissing.of()
        private var noPortalIdReason: JsonField<String> = JsonMissing.of()
        private var noUserIdReason: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(complianceIds: ComplianceIds) = apply {
            contactIds = complianceIds.contactIds.map { it.toMutableList() }
            portalIds = complianceIds.portalIds.map { it.toMutableList() }
            userIds = complianceIds.userIds.map { it.toMutableList() }
            noContactIdReason = complianceIds.noContactIdReason
            noPortalIdReason = complianceIds.noPortalIdReason
            noUserIdReason = complianceIds.noUserIdReason
            additionalProperties = complianceIds.additionalProperties.toMutableMap()
        }

        fun contactIds(contactIds: List<ContactId>) = contactIds(JsonField.of(contactIds))

        /**
         * Sets [Builder.contactIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactIds] with a well-typed `List<ContactId>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contactIds(contactIds: JsonField<List<ContactId>>) = apply {
            this.contactIds = contactIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContactId] to [contactIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContactId(contactId: ContactId) = apply {
            contactIds =
                (contactIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("contactIds", it).add(contactId)
                }
        }

        fun portalIds(portalIds: List<Int>) = portalIds(JsonField.of(portalIds))

        /**
         * Sets [Builder.portalIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.portalIds] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun portalIds(portalIds: JsonField<List<Int>>) = apply {
            this.portalIds = portalIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [portalIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPortalId(portalId: Int) = apply {
            portalIds =
                (portalIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("portalIds", it).add(portalId)
                }
        }

        fun userIds(userIds: List<Int>) = userIds(JsonField.of(userIds))

        /**
         * Sets [Builder.userIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIds] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userIds(userIds: JsonField<List<Int>>) = apply {
            this.userIds = userIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [userIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUserId(userId: Int) = apply {
            userIds =
                (userIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("userIds", it).add(userId)
                }
        }

        /** The reason why no contact ID is available. */
        fun noContactIdReason(noContactIdReason: String) =
            noContactIdReason(JsonField.of(noContactIdReason))

        /**
         * Sets [Builder.noContactIdReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noContactIdReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun noContactIdReason(noContactIdReason: JsonField<String>) = apply {
            this.noContactIdReason = noContactIdReason
        }

        /** The reason why no portal ID is available. */
        fun noPortalIdReason(noPortalIdReason: String) =
            noPortalIdReason(JsonField.of(noPortalIdReason))

        /**
         * Sets [Builder.noPortalIdReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noPortalIdReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun noPortalIdReason(noPortalIdReason: JsonField<String>) = apply {
            this.noPortalIdReason = noPortalIdReason
        }

        /** The reason why no user ID is available. */
        fun noUserIdReason(noUserIdReason: String) = noUserIdReason(JsonField.of(noUserIdReason))

        /**
         * Sets [Builder.noUserIdReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.noUserIdReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun noUserIdReason(noUserIdReason: JsonField<String>) = apply {
            this.noUserIdReason = noUserIdReason
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
         * Returns an immutable instance of [ComplianceIds].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contactIds()
         * .portalIds()
         * .userIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ComplianceIds =
            ComplianceIds(
                checkRequired("contactIds", contactIds).map { it.toImmutable() },
                checkRequired("portalIds", portalIds).map { it.toImmutable() },
                checkRequired("userIds", userIds).map { it.toImmutable() },
                noContactIdReason,
                noPortalIdReason,
                noUserIdReason,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ComplianceIds = apply {
        if (validated) {
            return@apply
        }

        contactIds().forEach { it.validate() }
        portalIds()
        userIds()
        noContactIdReason()
        noPortalIdReason()
        noUserIdReason()
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
        (contactIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (portalIds.asKnown().getOrNull()?.size ?: 0) +
            (userIds.asKnown().getOrNull()?.size ?: 0) +
            (if (noContactIdReason.asKnown().isPresent) 1 else 0) +
            (if (noPortalIdReason.asKnown().isPresent) 1 else 0) +
            (if (noUserIdReason.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ComplianceIds &&
            contactIds == other.contactIds &&
            portalIds == other.portalIds &&
            userIds == other.userIds &&
            noContactIdReason == other.noContactIdReason &&
            noPortalIdReason == other.noPortalIdReason &&
            noUserIdReason == other.noUserIdReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            contactIds,
            portalIds,
            userIds,
            noContactIdReason,
            noPortalIdReason,
            noUserIdReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ComplianceIds{contactIds=$contactIds, portalIds=$portalIds, userIds=$userIds, noContactIdReason=$noContactIdReason, noPortalIdReason=$noPortalIdReason, noUserIdReason=$noUserIdReason, additionalProperties=$additionalProperties}"
}
