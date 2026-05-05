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
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicListPermissions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val teamsWithEditAccess: JsonField<List<Int>>,
    private val usersWithEditAccess: JsonField<List<Int>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("teamsWithEditAccess")
        @ExcludeMissing
        teamsWithEditAccess: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("usersWithEditAccess")
        @ExcludeMissing
        usersWithEditAccess: JsonField<List<Int>> = JsonMissing.of(),
    ) : this(teamsWithEditAccess, usersWithEditAccess, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun teamsWithEditAccess(): List<Int> = teamsWithEditAccess.getRequired("teamsWithEditAccess")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun usersWithEditAccess(): List<Int> = usersWithEditAccess.getRequired("usersWithEditAccess")

    /**
     * Returns the raw JSON value of [teamsWithEditAccess].
     *
     * Unlike [teamsWithEditAccess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("teamsWithEditAccess")
    @ExcludeMissing
    fun _teamsWithEditAccess(): JsonField<List<Int>> = teamsWithEditAccess

    /**
     * Returns the raw JSON value of [usersWithEditAccess].
     *
     * Unlike [usersWithEditAccess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("usersWithEditAccess")
    @ExcludeMissing
    fun _usersWithEditAccess(): JsonField<List<Int>> = usersWithEditAccess

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
         * Returns a mutable builder for constructing an instance of [PublicListPermissions].
         *
         * The following fields are required:
         * ```java
         * .teamsWithEditAccess()
         * .usersWithEditAccess()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicListPermissions]. */
    class Builder internal constructor() {

        private var teamsWithEditAccess: JsonField<MutableList<Int>>? = null
        private var usersWithEditAccess: JsonField<MutableList<Int>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicListPermissions: PublicListPermissions) = apply {
            teamsWithEditAccess =
                publicListPermissions.teamsWithEditAccess.map { it.toMutableList() }
            usersWithEditAccess =
                publicListPermissions.usersWithEditAccess.map { it.toMutableList() }
            additionalProperties = publicListPermissions.additionalProperties.toMutableMap()
        }

        fun teamsWithEditAccess(teamsWithEditAccess: List<Int>) =
            teamsWithEditAccess(JsonField.of(teamsWithEditAccess))

        /**
         * Sets [Builder.teamsWithEditAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.teamsWithEditAccess] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun teamsWithEditAccess(teamsWithEditAccess: JsonField<List<Int>>) = apply {
            this.teamsWithEditAccess = teamsWithEditAccess.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.teamsWithEditAccess].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTeamsWithEditAccess(teamsWithEditAccess: Int) = apply {
            this.teamsWithEditAccess =
                (this.teamsWithEditAccess ?: JsonField.of(mutableListOf())).also {
                    checkKnown("teamsWithEditAccess", it).add(teamsWithEditAccess)
                }
        }

        fun usersWithEditAccess(usersWithEditAccess: List<Int>) =
            usersWithEditAccess(JsonField.of(usersWithEditAccess))

        /**
         * Sets [Builder.usersWithEditAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usersWithEditAccess] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usersWithEditAccess(usersWithEditAccess: JsonField<List<Int>>) = apply {
            this.usersWithEditAccess = usersWithEditAccess.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.usersWithEditAccess].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUsersWithEditAccess(usersWithEditAccess: Int) = apply {
            this.usersWithEditAccess =
                (this.usersWithEditAccess ?: JsonField.of(mutableListOf())).also {
                    checkKnown("usersWithEditAccess", it).add(usersWithEditAccess)
                }
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
         * Returns an immutable instance of [PublicListPermissions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .teamsWithEditAccess()
         * .usersWithEditAccess()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicListPermissions =
            PublicListPermissions(
                checkRequired("teamsWithEditAccess", teamsWithEditAccess).map { it.toImmutable() },
                checkRequired("usersWithEditAccess", usersWithEditAccess).map { it.toImmutable() },
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
    fun validate(): PublicListPermissions = apply {
        if (validated) {
            return@apply
        }

        teamsWithEditAccess()
        usersWithEditAccess()
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
        (teamsWithEditAccess.asKnown().getOrNull()?.size ?: 0) +
            (usersWithEditAccess.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicListPermissions &&
            teamsWithEditAccess == other.teamsWithEditAccess &&
            usersWithEditAccess == other.usersWithEditAccess &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(teamsWithEditAccess, usersWithEditAccess, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicListPermissions{teamsWithEditAccess=$teamsWithEditAccess, usersWithEditAccess=$usersWithEditAccess, additionalProperties=$additionalProperties}"
}
