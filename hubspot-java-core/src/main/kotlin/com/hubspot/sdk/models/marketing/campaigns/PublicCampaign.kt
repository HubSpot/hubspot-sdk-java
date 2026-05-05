// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

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
import kotlin.jvm.optionals.getOrNull

class PublicCampaign
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val businessUnits: JsonField<List<PublicBusinessUnit>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val properties: JsonField<Properties>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessUnits")
        @ExcludeMissing
        businessUnits: JsonField<List<PublicBusinessUnit>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, businessUnits, createdAt, properties, updatedAt, mutableMapOf())

    /**
     * The unique identifier for the campaign.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * An array of business units associated with the campaign, each represented by a
     * PublicBusinessUnit object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessUnits(): List<PublicBusinessUnit> = businessUnits.getRequired("businessUnits")

    /**
     * The date and time when the campaign was created, formatted as a date-time string.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * A collection of key-value pairs representing additional properties of the campaign.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The date and time when the campaign was last updated, formatted as a date-time string.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [businessUnits].
     *
     * Unlike [businessUnits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessUnits")
    @ExcludeMissing
    fun _businessUnits(): JsonField<List<PublicBusinessUnit>> = businessUnits

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [PublicCampaign].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .businessUnits()
         * .createdAt()
         * .properties()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicCampaign]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var businessUnits: JsonField<MutableList<PublicBusinessUnit>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<Properties>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicCampaign: PublicCampaign) = apply {
            id = publicCampaign.id
            businessUnits = publicCampaign.businessUnits.map { it.toMutableList() }
            createdAt = publicCampaign.createdAt
            properties = publicCampaign.properties
            updatedAt = publicCampaign.updatedAt
            additionalProperties = publicCampaign.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the campaign. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * An array of business units associated with the campaign, each represented by a
         * PublicBusinessUnit object.
         */
        fun businessUnits(businessUnits: List<PublicBusinessUnit>) =
            businessUnits(JsonField.of(businessUnits))

        /**
         * Sets [Builder.businessUnits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessUnits] with a well-typed
         * `List<PublicBusinessUnit>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun businessUnits(businessUnits: JsonField<List<PublicBusinessUnit>>) = apply {
            this.businessUnits = businessUnits.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicBusinessUnit] to [businessUnits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBusinessUnit(businessUnit: PublicBusinessUnit) = apply {
            businessUnits =
                (businessUnits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("businessUnits", it).add(businessUnit)
                }
        }

        /** The date and time when the campaign was created, formatted as a date-time string. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A collection of key-value pairs representing additional properties of the campaign. */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /**
         * The date and time when the campaign was last updated, formatted as a date-time string.
         */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [PublicCampaign].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .businessUnits()
         * .createdAt()
         * .properties()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicCampaign =
            PublicCampaign(
                checkRequired("id", id),
                checkRequired("businessUnits", businessUnits).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("properties", properties),
                checkRequired("updatedAt", updatedAt),
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
    fun validate(): PublicCampaign = apply {
        if (validated) {
            return@apply
        }

        id()
        businessUnits().forEach { it.validate() }
        createdAt()
        properties().validate()
        updatedAt()
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
            (businessUnits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** A collection of key-value pairs representing additional properties of the campaign. */
    class Properties
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

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                additionalProperties = properties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties = Properties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

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

            return other is Properties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Properties{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicCampaign &&
            id == other.id &&
            businessUnits == other.businessUnits &&
            createdAt == other.createdAt &&
            properties == other.properties &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, businessUnits, createdAt, properties, updatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicCampaign{id=$id, businessUnits=$businessUnits, createdAt=$createdAt, properties=$properties, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
