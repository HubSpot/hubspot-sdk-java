// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class PublicActionRevision
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val definition: JsonField<PublicActionDefinition>,
    private val revisionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("definition")
        @ExcludeMissing
        definition: JsonField<PublicActionDefinition> = JsonMissing.of(),
        @JsonProperty("revisionId") @ExcludeMissing revisionId: JsonField<String> = JsonMissing.of(),
    ) : this(id, createdAt, definition, revisionId, mutableMapOf())

    /**
     * The unique identifier for the action revision.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the action revision was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun definition(): PublicActionDefinition = definition.getRequired("definition")

    /**
     * The unique identifier for the specific revision of the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revisionId(): String = revisionId.getRequired("revisionId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [definition].
     *
     * Unlike [definition], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("definition")
    @ExcludeMissing
    fun _definition(): JsonField<PublicActionDefinition> = definition

    /**
     * Returns the raw JSON value of [revisionId].
     *
     * Unlike [revisionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revisionId") @ExcludeMissing fun _revisionId(): JsonField<String> = revisionId

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
         * Returns a mutable builder for constructing an instance of [PublicActionRevision].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .definition()
         * .revisionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicActionRevision]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var definition: JsonField<PublicActionDefinition>? = null
        private var revisionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicActionRevision: PublicActionRevision) = apply {
            id = publicActionRevision.id
            createdAt = publicActionRevision.createdAt
            definition = publicActionRevision.definition
            revisionId = publicActionRevision.revisionId
            additionalProperties = publicActionRevision.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the action revision. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the action revision was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun definition(definition: PublicActionDefinition) = definition(JsonField.of(definition))

        /**
         * Sets [Builder.definition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.definition] with a well-typed [PublicActionDefinition]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun definition(definition: JsonField<PublicActionDefinition>) = apply {
            this.definition = definition
        }

        /** The unique identifier for the specific revision of the action. */
        fun revisionId(revisionId: String) = revisionId(JsonField.of(revisionId))

        /**
         * Sets [Builder.revisionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revisionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revisionId(revisionId: JsonField<String>) = apply { this.revisionId = revisionId }

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
         * Returns an immutable instance of [PublicActionRevision].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .definition()
         * .revisionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicActionRevision =
            PublicActionRevision(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("definition", definition),
                checkRequired("revisionId", revisionId),
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
    fun validate(): PublicActionRevision = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        definition().validate()
        revisionId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (definition.asKnown().getOrNull()?.validity() ?: 0) +
            (if (revisionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicActionRevision &&
            id == other.id &&
            createdAt == other.createdAt &&
            definition == other.definition &&
            revisionId == other.revisionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, definition, revisionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicActionRevision{id=$id, createdAt=$createdAt, definition=$definition, revisionId=$revisionId, additionalProperties=$additionalProperties}"
}
