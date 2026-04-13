// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PublicMembershipSettings
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val includeUnassigned: JsonField<Boolean>,
    private val membershipTeamId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("includeUnassigned")
        @ExcludeMissing
        includeUnassigned: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("membershipTeamId")
        @ExcludeMissing
        membershipTeamId: JsonField<Int> = JsonMissing.of(),
    ) : this(includeUnassigned, membershipTeamId, mutableMapOf())

    /**
     * Indicates whether unassigned memberships should be included.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeUnassigned(): Optional<Boolean> = includeUnassigned.getOptional("includeUnassigned")

    /**
     * The ID of the team associated with the membership.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun membershipTeamId(): Optional<Int> = membershipTeamId.getOptional("membershipTeamId")

    /**
     * Returns the raw JSON value of [includeUnassigned].
     *
     * Unlike [includeUnassigned], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("includeUnassigned")
    @ExcludeMissing
    fun _includeUnassigned(): JsonField<Boolean> = includeUnassigned

    /**
     * Returns the raw JSON value of [membershipTeamId].
     *
     * Unlike [membershipTeamId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("membershipTeamId")
    @ExcludeMissing
    fun _membershipTeamId(): JsonField<Int> = membershipTeamId

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

        /** Returns a mutable builder for constructing an instance of [PublicMembershipSettings]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicMembershipSettings]. */
    class Builder internal constructor() {

        private var includeUnassigned: JsonField<Boolean> = JsonMissing.of()
        private var membershipTeamId: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicMembershipSettings: PublicMembershipSettings) = apply {
            includeUnassigned = publicMembershipSettings.includeUnassigned
            membershipTeamId = publicMembershipSettings.membershipTeamId
            additionalProperties = publicMembershipSettings.additionalProperties.toMutableMap()
        }

        /** Indicates whether unassigned memberships should be included. */
        fun includeUnassigned(includeUnassigned: Boolean) =
            includeUnassigned(JsonField.of(includeUnassigned))

        /**
         * Sets [Builder.includeUnassigned] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeUnassigned] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeUnassigned(includeUnassigned: JsonField<Boolean>) = apply {
            this.includeUnassigned = includeUnassigned
        }

        /** The ID of the team associated with the membership. */
        fun membershipTeamId(membershipTeamId: Int) =
            membershipTeamId(JsonField.of(membershipTeamId))

        /**
         * Sets [Builder.membershipTeamId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.membershipTeamId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun membershipTeamId(membershipTeamId: JsonField<Int>) = apply {
            this.membershipTeamId = membershipTeamId
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
         * Returns an immutable instance of [PublicMembershipSettings].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicMembershipSettings =
            PublicMembershipSettings(
                includeUnassigned,
                membershipTeamId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicMembershipSettings = apply {
        if (validated) {
            return@apply
        }

        includeUnassigned()
        membershipTeamId()
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
        (if (includeUnassigned.asKnown().isPresent) 1 else 0) +
            (if (membershipTeamId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicMembershipSettings &&
            includeUnassigned == other.includeUnassigned &&
            membershipTeamId == other.membershipTeamId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(includeUnassigned, membershipTeamId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicMembershipSettings{includeUnassigned=$includeUnassigned, membershipTeamId=$membershipTeamId, additionalProperties=$additionalProperties}"
}
