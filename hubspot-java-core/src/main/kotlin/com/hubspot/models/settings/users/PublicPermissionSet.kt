// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.users

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects

class PublicPermissionSet
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val requiresBillingWrite: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requiresBillingWrite")
        @ExcludeMissing
        requiresBillingWrite: JsonField<Boolean> = JsonMissing.of(),
    ) : this(id, name, requiresBillingWrite, mutableMapOf())

    /**
     * The role's unique ID
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The role's name
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Whether this role has a paid seat and requires the billing-write scope to assign/unassign to
     * users
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiresBillingWrite(): Boolean = requiresBillingWrite.getRequired("requiresBillingWrite")

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
     * Returns the raw JSON value of [requiresBillingWrite].
     *
     * Unlike [requiresBillingWrite], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requiresBillingWrite")
    @ExcludeMissing
    fun _requiresBillingWrite(): JsonField<Boolean> = requiresBillingWrite

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
         * Returns a mutable builder for constructing an instance of [PublicPermissionSet].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .requiresBillingWrite()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicPermissionSet]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var requiresBillingWrite: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicPermissionSet: PublicPermissionSet) = apply {
            id = publicPermissionSet.id
            name = publicPermissionSet.name
            requiresBillingWrite = publicPermissionSet.requiresBillingWrite
            additionalProperties = publicPermissionSet.additionalProperties.toMutableMap()
        }

        /** The role's unique ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The role's name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Whether this role has a paid seat and requires the billing-write scope to assign/unassign
         * to users
         */
        fun requiresBillingWrite(requiresBillingWrite: Boolean) =
            requiresBillingWrite(JsonField.of(requiresBillingWrite))

        /**
         * Sets [Builder.requiresBillingWrite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiresBillingWrite] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiresBillingWrite(requiresBillingWrite: JsonField<Boolean>) = apply {
            this.requiresBillingWrite = requiresBillingWrite
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
         * Returns an immutable instance of [PublicPermissionSet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .requiresBillingWrite()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicPermissionSet =
            PublicPermissionSet(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("requiresBillingWrite", requiresBillingWrite),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicPermissionSet = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        requiresBillingWrite()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (requiresBillingWrite.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicPermissionSet &&
            id == other.id &&
            name == other.name &&
            requiresBillingWrite == other.requiresBillingWrite &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, name, requiresBillingWrite, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicPermissionSet{id=$id, name=$name, requiresBillingWrite=$requiresBillingWrite, additionalProperties=$additionalProperties}"
}
