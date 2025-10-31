// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.appointments

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
import com.hubspot_sdk.api.models.crm.PublicAssociationsForObject
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Is the input object used to create a new CRM object, containing the properties to be set and
 * optional associations to link the new record with other CRM objects.
 */
class SimplePublicObjectInputForCreate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val associations: JsonField<List<PublicAssociationsForObject>>,
    private val properties: JsonField<Properties>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("associations")
        @ExcludeMissing
        associations: JsonField<List<PublicAssociationsForObject>> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
    ) : this(associations, properties, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associations(): List<PublicAssociationsForObject> = associations.getRequired("associations")

    /**
     * Key-value pairs for setting properties for the new object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * Returns the raw JSON value of [associations].
     *
     * Unlike [associations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("associations")
    @ExcludeMissing
    fun _associations(): JsonField<List<PublicAssociationsForObject>> = associations

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

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
         * Returns a mutable builder for constructing an instance of
         * [SimplePublicObjectInputForCreate].
         *
         * The following fields are required:
         * ```java
         * .associations()
         * .properties()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimplePublicObjectInputForCreate]. */
    class Builder internal constructor() {

        private var associations: JsonField<MutableList<PublicAssociationsForObject>>? = null
        private var properties: JsonField<Properties>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate) =
            apply {
                associations =
                    simplePublicObjectInputForCreate.associations.map { it.toMutableList() }
                properties = simplePublicObjectInputForCreate.properties
                additionalProperties =
                    simplePublicObjectInputForCreate.additionalProperties.toMutableMap()
            }

        fun associations(associations: List<PublicAssociationsForObject>) =
            associations(JsonField.of(associations))

        /**
         * Sets [Builder.associations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associations] with a well-typed
         * `List<PublicAssociationsForObject>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun associations(associations: JsonField<List<PublicAssociationsForObject>>) = apply {
            this.associations = associations.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicAssociationsForObject] to [associations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAssociation(association: PublicAssociationsForObject) = apply {
            associations =
                (associations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("associations", it).add(association)
                }
        }

        /** Key-value pairs for setting properties for the new object. */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

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
         * Returns an immutable instance of [SimplePublicObjectInputForCreate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .associations()
         * .properties()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimplePublicObjectInputForCreate =
            SimplePublicObjectInputForCreate(
                checkRequired("associations", associations).map { it.toImmutable() },
                checkRequired("properties", properties),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplePublicObjectInputForCreate = apply {
        if (validated) {
            return@apply
        }

        associations().forEach { it.validate() }
        properties().validate()
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
        (associations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0)

    /** Key-value pairs for setting properties for the new object. */
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
            } catch (e: HubspotInvalidDataException) {
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

        return other is SimplePublicObjectInputForCreate &&
            associations == other.associations &&
            properties == other.properties &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(associations, properties, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimplePublicObjectInputForCreate{associations=$associations, properties=$properties, additionalProperties=$additionalProperties}"
}
