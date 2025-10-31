// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A team that can be assigned to a user */
class PublicTeam
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val secondaryUserIds: JsonField<List<String>>,
    private val userIds: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("secondaryUserIds")
        @ExcludeMissing
        secondaryUserIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("userIds") @ExcludeMissing userIds: JsonField<List<String>> = JsonMissing.of(),
    ) : this(id, name, secondaryUserIds, userIds, mutableMapOf())

    /**
     * The team's unique ID
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The team's name
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Secondary or additional members of this team
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secondaryUserIds(): List<String> = secondaryUserIds.getRequired("secondaryUserIds")

    /**
     * Primary members of this team
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userIds(): List<String> = userIds.getRequired("userIds")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [secondaryUserIds].
     *
     * Unlike [secondaryUserIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("secondaryUserIds")
    @ExcludeMissing
    fun _secondaryUserIds(): JsonField<List<String>> = secondaryUserIds

    /**
     * Returns the raw JSON value of [userIds].
     *
     * Unlike [userIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userIds") @ExcludeMissing fun _userIds(): JsonField<List<String>> = userIds

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
         * Returns a mutable builder for constructing an instance of [PublicTeam].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .secondaryUserIds()
         * .userIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicTeam]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var secondaryUserIds: JsonField<MutableList<String>>? = null
        private var userIds: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicTeam: PublicTeam) = apply {
            id = publicTeam.id
            name = publicTeam.name
            secondaryUserIds = publicTeam.secondaryUserIds.map { it.toMutableList() }
            userIds = publicTeam.userIds.map { it.toMutableList() }
            additionalProperties = publicTeam.additionalProperties.toMutableMap()
        }

        /** The team's unique ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The team's name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Secondary or additional members of this team */
        fun secondaryUserIds(secondaryUserIds: List<String>) =
            secondaryUserIds(JsonField.of(secondaryUserIds))

        /**
         * Sets [Builder.secondaryUserIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondaryUserIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondaryUserIds(secondaryUserIds: JsonField<List<String>>) = apply {
            this.secondaryUserIds = secondaryUserIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [secondaryUserIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondaryUserId(secondaryUserId: String) = apply {
            secondaryUserIds =
                (secondaryUserIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secondaryUserIds", it).add(secondaryUserId)
                }
        }

        /** Primary members of this team */
        fun userIds(userIds: List<String>) = userIds(JsonField.of(userIds))

        /**
         * Sets [Builder.userIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userIds(userIds: JsonField<List<String>>) = apply {
            this.userIds = userIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [userIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUserId(userId: String) = apply {
            userIds =
                (userIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("userIds", it).add(userId)
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
         * Returns an immutable instance of [PublicTeam].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .secondaryUserIds()
         * .userIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicTeam =
            PublicTeam(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("secondaryUserIds", secondaryUserIds).map { it.toImmutable() },
                checkRequired("userIds", userIds).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicTeam = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        secondaryUserIds()
        userIds()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (secondaryUserIds.asKnown().getOrNull()?.size ?: 0) +
            (userIds.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicTeam &&
            id == other.id &&
            name == other.name &&
            secondaryUserIds == other.secondaryUserIds &&
            userIds == other.userIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, name, secondaryUserIds, userIds, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicTeam{id=$id, name=$name, secondaryUserIds=$secondaryUserIds, userIds=$userIds, additionalProperties=$additionalProperties}"
}
