// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val isDefault: JsonField<Boolean>,
    private val isInternal: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val businessUnitId: JsonField<Long>,
    private val communicationMethod: JsonField<String>,
    private val purpose: JsonField<String>,
    private val subscriptionTranslations: JsonField<List<PublicSubscriptionTranslation>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isActive") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isDefault") @ExcludeMissing isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("isInternal")
        @ExcludeMissing
        isInternal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("businessUnitId")
        @ExcludeMissing
        businessUnitId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("communicationMethod")
        @ExcludeMissing
        communicationMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscriptionTranslations")
        @ExcludeMissing
        subscriptionTranslations: JsonField<List<PublicSubscriptionTranslation>> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        description,
        isActive,
        isDefault,
        isInternal,
        name,
        updatedAt,
        businessUnitId,
        communicationMethod,
        purpose,
        subscriptionTranslations,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the subscription was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * A description of the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * Indicates whether the subscription is active.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isActive(): Boolean = isActive.getRequired("isActive")

    /**
     * Indicates whether the subscription is the default option.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDefault(): Boolean = isDefault.getRequired("isDefault")

    /**
     * Indicates whether the subscription is internal.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isInternal(): Boolean = isInternal.getRequired("isInternal")

    /**
     * The name of the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The date and time when the subscription was last updated.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The ID of the business unit associated with the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun businessUnitId(): Optional<Long> = businessUnitId.getOptional("businessUnitId")

    /**
     * The method of communication for the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun communicationMethod(): Optional<String> =
        communicationMethod.getOptional("communicationMethod")

    /**
     * The purpose of the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purpose(): Optional<String> = purpose.getOptional("purpose")

    /**
     * A list of translations associated with the subscription.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subscriptionTranslations(): Optional<List<PublicSubscriptionTranslation>> =
        subscriptionTranslations.getOptional("subscriptionTranslations")

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isActive") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isDefault") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [isInternal].
     *
     * Unlike [isInternal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isInternal") @ExcludeMissing fun _isInternal(): JsonField<Boolean> = isInternal

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [businessUnitId].
     *
     * Unlike [businessUnitId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessUnitId")
    @ExcludeMissing
    fun _businessUnitId(): JsonField<Long> = businessUnitId

    /**
     * Returns the raw JSON value of [communicationMethod].
     *
     * Unlike [communicationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("communicationMethod")
    @ExcludeMissing
    fun _communicationMethod(): JsonField<String> = communicationMethod

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

    /**
     * Returns the raw JSON value of [subscriptionTranslations].
     *
     * Unlike [subscriptionTranslations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscriptionTranslations")
    @ExcludeMissing
    fun _subscriptionTranslations(): JsonField<List<PublicSubscriptionTranslation>> =
        subscriptionTranslations

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
         * Returns a mutable builder for constructing an instance of [SubscriptionDefinition].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .description()
         * .isActive()
         * .isDefault()
         * .isInternal()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionDefinition]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var isActive: JsonField<Boolean>? = null
        private var isDefault: JsonField<Boolean>? = null
        private var isInternal: JsonField<Boolean>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var businessUnitId: JsonField<Long> = JsonMissing.of()
        private var communicationMethod: JsonField<String> = JsonMissing.of()
        private var purpose: JsonField<String> = JsonMissing.of()
        private var subscriptionTranslations:
            JsonField<MutableList<PublicSubscriptionTranslation>>? =
            null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscriptionDefinition: SubscriptionDefinition) = apply {
            id = subscriptionDefinition.id
            createdAt = subscriptionDefinition.createdAt
            description = subscriptionDefinition.description
            isActive = subscriptionDefinition.isActive
            isDefault = subscriptionDefinition.isDefault
            isInternal = subscriptionDefinition.isInternal
            name = subscriptionDefinition.name
            updatedAt = subscriptionDefinition.updatedAt
            businessUnitId = subscriptionDefinition.businessUnitId
            communicationMethod = subscriptionDefinition.communicationMethod
            purpose = subscriptionDefinition.purpose
            subscriptionTranslations =
                subscriptionDefinition.subscriptionTranslations.map { it.toMutableList() }
            additionalProperties = subscriptionDefinition.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the subscription. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the subscription was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A description of the subscription. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Indicates whether the subscription is active. */
        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        /** Indicates whether the subscription is the default option. */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** Indicates whether the subscription is internal. */
        fun isInternal(isInternal: Boolean) = isInternal(JsonField.of(isInternal))

        /**
         * Sets [Builder.isInternal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isInternal] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isInternal(isInternal: JsonField<Boolean>) = apply { this.isInternal = isInternal }

        /** The name of the subscription. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The date and time when the subscription was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the business unit associated with the subscription. */
        fun businessUnitId(businessUnitId: Long) = businessUnitId(JsonField.of(businessUnitId))

        /**
         * Sets [Builder.businessUnitId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessUnitId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessUnitId(businessUnitId: JsonField<Long>) = apply {
            this.businessUnitId = businessUnitId
        }

        /** The method of communication for the subscription. */
        fun communicationMethod(communicationMethod: String) =
            communicationMethod(JsonField.of(communicationMethod))

        /**
         * Sets [Builder.communicationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.communicationMethod] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun communicationMethod(communicationMethod: JsonField<String>) = apply {
            this.communicationMethod = communicationMethod
        }

        /** The purpose of the subscription. */
        fun purpose(purpose: String) = purpose(JsonField.of(purpose))

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

        /** A list of translations associated with the subscription. */
        fun subscriptionTranslations(
            subscriptionTranslations: List<PublicSubscriptionTranslation>
        ) = subscriptionTranslations(JsonField.of(subscriptionTranslations))

        /**
         * Sets [Builder.subscriptionTranslations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionTranslations] with a well-typed
         * `List<PublicSubscriptionTranslation>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun subscriptionTranslations(
            subscriptionTranslations: JsonField<List<PublicSubscriptionTranslation>>
        ) = apply {
            this.subscriptionTranslations = subscriptionTranslations.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicSubscriptionTranslation] to [subscriptionTranslations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSubscriptionTranslation(subscriptionTranslation: PublicSubscriptionTranslation) =
            apply {
                subscriptionTranslations =
                    (subscriptionTranslations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subscriptionTranslations", it).add(subscriptionTranslation)
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
         * Returns an immutable instance of [SubscriptionDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .description()
         * .isActive()
         * .isDefault()
         * .isInternal()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionDefinition =
            SubscriptionDefinition(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("isActive", isActive),
                checkRequired("isDefault", isDefault),
                checkRequired("isInternal", isInternal),
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                businessUnitId,
                communicationMethod,
                purpose,
                (subscriptionTranslations ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): SubscriptionDefinition = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        description()
        isActive()
        isDefault()
        isInternal()
        name()
        updatedAt()
        businessUnitId()
        communicationMethod()
        purpose()
        subscriptionTranslations().ifPresent { it.forEach { it.validate() } }
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (isInternal.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (businessUnitId.asKnown().isPresent) 1 else 0) +
            (if (communicationMethod.asKnown().isPresent) 1 else 0) +
            (if (purpose.asKnown().isPresent) 1 else 0) +
            (subscriptionTranslations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionDefinition &&
            id == other.id &&
            createdAt == other.createdAt &&
            description == other.description &&
            isActive == other.isActive &&
            isDefault == other.isDefault &&
            isInternal == other.isInternal &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            businessUnitId == other.businessUnitId &&
            communicationMethod == other.communicationMethod &&
            purpose == other.purpose &&
            subscriptionTranslations == other.subscriptionTranslations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            description,
            isActive,
            isDefault,
            isInternal,
            name,
            updatedAt,
            businessUnitId,
            communicationMethod,
            purpose,
            subscriptionTranslations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionDefinition{id=$id, createdAt=$createdAt, description=$description, isActive=$isActive, isDefault=$isDefault, isInternal=$isInternal, name=$name, updatedAt=$updatedAt, businessUnitId=$businessUnitId, communicationMethod=$communicationMethod, purpose=$purpose, subscriptionTranslations=$subscriptionTranslations, additionalProperties=$additionalProperties}"
}
