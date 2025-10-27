// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicEventFilterMetadata
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val operation: JsonField<Operation>,
    private val property: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("operation")
        @ExcludeMissing
        operation: JsonField<Operation> = JsonMissing.of(),
        @JsonProperty("property") @ExcludeMissing property: JsonField<String> = JsonMissing.of(),
    ) : this(operation, property, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operation(): Operation = operation.getRequired("operation")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun property(): String = property.getRequired("property")

    /**
     * Returns the raw JSON value of [operation].
     *
     * Unlike [operation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operation") @ExcludeMissing fun _operation(): JsonField<Operation> = operation

    /**
     * Returns the raw JSON value of [property].
     *
     * Unlike [property], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("property") @ExcludeMissing fun _property(): JsonField<String> = property

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
         * Returns a mutable builder for constructing an instance of [PublicEventFilterMetadata].
         *
         * The following fields are required:
         * ```java
         * .operation()
         * .property()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEventFilterMetadata]. */
    class Builder internal constructor() {

        private var operation: JsonField<Operation>? = null
        private var property: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEventFilterMetadata: PublicEventFilterMetadata) = apply {
            operation = publicEventFilterMetadata.operation
            property = publicEventFilterMetadata.property
            additionalProperties = publicEventFilterMetadata.additionalProperties.toMutableMap()
        }

        fun operation(operation: Operation) = operation(JsonField.of(operation))

        /**
         * Sets [Builder.operation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operation] with a well-typed [Operation] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operation(operation: JsonField<Operation>) = apply { this.operation = operation }

        /**
         * Alias for calling [operation] with `Operation.ofPublicBoolProperty(publicBoolProperty)`.
         */
        fun operation(publicBoolProperty: PublicBoolPropertyOperation) =
            operation(Operation.ofPublicBoolProperty(publicBoolProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicNumberProperty(publicNumberProperty)`.
         */
        fun operation(publicNumberProperty: PublicNumberPropertyOperation) =
            operation(Operation.ofPublicNumberProperty(publicNumberProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicStringProperty(publicStringProperty)`.
         */
        fun operation(publicStringProperty: PublicStringPropertyOperation) =
            operation(Operation.ofPublicStringProperty(publicStringProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicDateTimeProperty(publicDateTimeProperty)`.
         */
        fun operation(publicDateTimeProperty: PublicDateTimePropertyOperation) =
            operation(Operation.ofPublicDateTimeProperty(publicDateTimeProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicRangedDateProperty(publicRangedDateProperty)`.
         */
        fun operation(publicRangedDateProperty: PublicRangedDatePropertyOperation) =
            operation(Operation.ofPublicRangedDateProperty(publicRangedDateProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicComparativePropertyUpdated(publicComparativePropertyUpdated)`.
         */
        fun operation(publicComparativePropertyUpdated: PublicComparativePropertyUpdatedOperation) =
            operation(
                Operation.ofPublicComparativePropertyUpdated(publicComparativePropertyUpdated)
            )

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicComparativeDateProperty(publicComparativeDateProperty)`.
         */
        fun operation(publicComparativeDateProperty: PublicComparativeDatePropertyOperation) =
            operation(Operation.ofPublicComparativeDateProperty(publicComparativeDateProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicRollingDateRangeProperty(publicRollingDateRangeProperty)`.
         */
        fun operation(publicRollingDateRangeProperty: PublicRollingDateRangePropertyOperation) =
            operation(Operation.ofPublicRollingDateRangeProperty(publicRollingDateRangeProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicRollingPropertyUpdated(publicRollingPropertyUpdated)`.
         */
        fun operation(publicRollingPropertyUpdated: PublicRollingPropertyUpdatedOperation) =
            operation(Operation.ofPublicRollingPropertyUpdated(publicRollingPropertyUpdated))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicEnumerationProperty(publicEnumerationProperty)`.
         */
        fun operation(publicEnumerationProperty: PublicEnumerationPropertyOperation) =
            operation(Operation.ofPublicEnumerationProperty(publicEnumerationProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicAllPropertyTypes(publicAllPropertyTypes)`.
         */
        fun operation(publicAllPropertyTypes: PublicAllPropertyTypesOperation) =
            operation(Operation.ofPublicAllPropertyTypes(publicAllPropertyTypes))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicRangedNumberProperty(publicRangedNumberProperty)`.
         */
        fun operation(publicRangedNumberProperty: PublicRangedNumberPropertyOperation) =
            operation(Operation.ofPublicRangedNumberProperty(publicRangedNumberProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicMultiStringProperty(publicMultiStringProperty)`.
         */
        fun operation(publicMultiStringProperty: PublicMultiStringPropertyOperation) =
            operation(Operation.ofPublicMultiStringProperty(publicMultiStringProperty))

        /**
         * Alias for calling [operation] with `Operation.ofPublicDateProperty(publicDateProperty)`.
         */
        fun operation(publicDateProperty: PublicDatePropertyOperation) =
            operation(Operation.ofPublicDateProperty(publicDateProperty))

        /**
         * Alias for calling [operation] with
         * `Operation.ofPublicCalendarDateProperty(publicCalendarDateProperty)`.
         */
        fun operation(publicCalendarDateProperty: PublicCalendarDatePropertyOperation) =
            operation(Operation.ofPublicCalendarDateProperty(publicCalendarDateProperty))

        /** Alias for calling [operation] with `Operation.ofPublicTimePoint(publicTimePoint)`. */
        fun operation(publicTimePoint: PublicTimePointOperation) =
            operation(Operation.ofPublicTimePoint(publicTimePoint))

        /** Alias for calling [operation] with `Operation.ofPublicRangedTime(publicRangedTime)`. */
        fun operation(publicRangedTime: PublicRangedTimeOperation) =
            operation(Operation.ofPublicRangedTime(publicRangedTime))

        fun property(property: String) = property(JsonField.of(property))

        /**
         * Sets [Builder.property] to an arbitrary JSON value.
         *
         * You should usually call [Builder.property] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun property(property: JsonField<String>) = apply { this.property = property }

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
         * Returns an immutable instance of [PublicEventFilterMetadata].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .operation()
         * .property()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicEventFilterMetadata =
            PublicEventFilterMetadata(
                checkRequired("operation", operation),
                checkRequired("property", property),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEventFilterMetadata = apply {
        if (validated) {
            return@apply
        }

        operation().validate()
        property()
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
        (operation.asKnown().getOrNull()?.validity() ?: 0) +
            (if (property.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Operation.Deserializer::class)
    @JsonSerialize(using = Operation.Serializer::class)
    class Operation
    private constructor(
        private val publicBoolProperty: PublicBoolPropertyOperation? = null,
        private val publicNumberProperty: PublicNumberPropertyOperation? = null,
        private val publicStringProperty: PublicStringPropertyOperation? = null,
        private val publicDateTimeProperty: PublicDateTimePropertyOperation? = null,
        private val publicRangedDateProperty: PublicRangedDatePropertyOperation? = null,
        private val publicComparativePropertyUpdated: PublicComparativePropertyUpdatedOperation? =
            null,
        private val publicComparativeDateProperty: PublicComparativeDatePropertyOperation? = null,
        private val publicRollingDateRangeProperty: PublicRollingDateRangePropertyOperation? = null,
        private val publicRollingPropertyUpdated: PublicRollingPropertyUpdatedOperation? = null,
        private val publicEnumerationProperty: PublicEnumerationPropertyOperation? = null,
        private val publicAllPropertyTypes: PublicAllPropertyTypesOperation? = null,
        private val publicRangedNumberProperty: PublicRangedNumberPropertyOperation? = null,
        private val publicMultiStringProperty: PublicMultiStringPropertyOperation? = null,
        private val publicDateProperty: PublicDatePropertyOperation? = null,
        private val publicCalendarDateProperty: PublicCalendarDatePropertyOperation? = null,
        private val publicTimePoint: PublicTimePointOperation? = null,
        private val publicRangedTime: PublicRangedTimeOperation? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicBoolProperty(): Optional<PublicBoolPropertyOperation> =
            Optional.ofNullable(publicBoolProperty)

        fun publicNumberProperty(): Optional<PublicNumberPropertyOperation> =
            Optional.ofNullable(publicNumberProperty)

        fun publicStringProperty(): Optional<PublicStringPropertyOperation> =
            Optional.ofNullable(publicStringProperty)

        fun publicDateTimeProperty(): Optional<PublicDateTimePropertyOperation> =
            Optional.ofNullable(publicDateTimeProperty)

        fun publicRangedDateProperty(): Optional<PublicRangedDatePropertyOperation> =
            Optional.ofNullable(publicRangedDateProperty)

        fun publicComparativePropertyUpdated():
            Optional<PublicComparativePropertyUpdatedOperation> =
            Optional.ofNullable(publicComparativePropertyUpdated)

        fun publicComparativeDateProperty(): Optional<PublicComparativeDatePropertyOperation> =
            Optional.ofNullable(publicComparativeDateProperty)

        fun publicRollingDateRangeProperty(): Optional<PublicRollingDateRangePropertyOperation> =
            Optional.ofNullable(publicRollingDateRangeProperty)

        fun publicRollingPropertyUpdated(): Optional<PublicRollingPropertyUpdatedOperation> =
            Optional.ofNullable(publicRollingPropertyUpdated)

        fun publicEnumerationProperty(): Optional<PublicEnumerationPropertyOperation> =
            Optional.ofNullable(publicEnumerationProperty)

        fun publicAllPropertyTypes(): Optional<PublicAllPropertyTypesOperation> =
            Optional.ofNullable(publicAllPropertyTypes)

        fun publicRangedNumberProperty(): Optional<PublicRangedNumberPropertyOperation> =
            Optional.ofNullable(publicRangedNumberProperty)

        fun publicMultiStringProperty(): Optional<PublicMultiStringPropertyOperation> =
            Optional.ofNullable(publicMultiStringProperty)

        fun publicDateProperty(): Optional<PublicDatePropertyOperation> =
            Optional.ofNullable(publicDateProperty)

        fun publicCalendarDateProperty(): Optional<PublicCalendarDatePropertyOperation> =
            Optional.ofNullable(publicCalendarDateProperty)

        fun publicTimePoint(): Optional<PublicTimePointOperation> =
            Optional.ofNullable(publicTimePoint)

        fun publicRangedTime(): Optional<PublicRangedTimeOperation> =
            Optional.ofNullable(publicRangedTime)

        fun isPublicBoolProperty(): Boolean = publicBoolProperty != null

        fun isPublicNumberProperty(): Boolean = publicNumberProperty != null

        fun isPublicStringProperty(): Boolean = publicStringProperty != null

        fun isPublicDateTimeProperty(): Boolean = publicDateTimeProperty != null

        fun isPublicRangedDateProperty(): Boolean = publicRangedDateProperty != null

        fun isPublicComparativePropertyUpdated(): Boolean = publicComparativePropertyUpdated != null

        fun isPublicComparativeDateProperty(): Boolean = publicComparativeDateProperty != null

        fun isPublicRollingDateRangeProperty(): Boolean = publicRollingDateRangeProperty != null

        fun isPublicRollingPropertyUpdated(): Boolean = publicRollingPropertyUpdated != null

        fun isPublicEnumerationProperty(): Boolean = publicEnumerationProperty != null

        fun isPublicAllPropertyTypes(): Boolean = publicAllPropertyTypes != null

        fun isPublicRangedNumberProperty(): Boolean = publicRangedNumberProperty != null

        fun isPublicMultiStringProperty(): Boolean = publicMultiStringProperty != null

        fun isPublicDateProperty(): Boolean = publicDateProperty != null

        fun isPublicCalendarDateProperty(): Boolean = publicCalendarDateProperty != null

        fun isPublicTimePoint(): Boolean = publicTimePoint != null

        fun isPublicRangedTime(): Boolean = publicRangedTime != null

        fun asPublicBoolProperty(): PublicBoolPropertyOperation =
            publicBoolProperty.getOrThrow("publicBoolProperty")

        fun asPublicNumberProperty(): PublicNumberPropertyOperation =
            publicNumberProperty.getOrThrow("publicNumberProperty")

        fun asPublicStringProperty(): PublicStringPropertyOperation =
            publicStringProperty.getOrThrow("publicStringProperty")

        fun asPublicDateTimeProperty(): PublicDateTimePropertyOperation =
            publicDateTimeProperty.getOrThrow("publicDateTimeProperty")

        fun asPublicRangedDateProperty(): PublicRangedDatePropertyOperation =
            publicRangedDateProperty.getOrThrow("publicRangedDateProperty")

        fun asPublicComparativePropertyUpdated(): PublicComparativePropertyUpdatedOperation =
            publicComparativePropertyUpdated.getOrThrow("publicComparativePropertyUpdated")

        fun asPublicComparativeDateProperty(): PublicComparativeDatePropertyOperation =
            publicComparativeDateProperty.getOrThrow("publicComparativeDateProperty")

        fun asPublicRollingDateRangeProperty(): PublicRollingDateRangePropertyOperation =
            publicRollingDateRangeProperty.getOrThrow("publicRollingDateRangeProperty")

        fun asPublicRollingPropertyUpdated(): PublicRollingPropertyUpdatedOperation =
            publicRollingPropertyUpdated.getOrThrow("publicRollingPropertyUpdated")

        fun asPublicEnumerationProperty(): PublicEnumerationPropertyOperation =
            publicEnumerationProperty.getOrThrow("publicEnumerationProperty")

        fun asPublicAllPropertyTypes(): PublicAllPropertyTypesOperation =
            publicAllPropertyTypes.getOrThrow("publicAllPropertyTypes")

        fun asPublicRangedNumberProperty(): PublicRangedNumberPropertyOperation =
            publicRangedNumberProperty.getOrThrow("publicRangedNumberProperty")

        fun asPublicMultiStringProperty(): PublicMultiStringPropertyOperation =
            publicMultiStringProperty.getOrThrow("publicMultiStringProperty")

        fun asPublicDateProperty(): PublicDatePropertyOperation =
            publicDateProperty.getOrThrow("publicDateProperty")

        fun asPublicCalendarDateProperty(): PublicCalendarDatePropertyOperation =
            publicCalendarDateProperty.getOrThrow("publicCalendarDateProperty")

        fun asPublicTimePoint(): PublicTimePointOperation =
            publicTimePoint.getOrThrow("publicTimePoint")

        fun asPublicRangedTime(): PublicRangedTimeOperation =
            publicRangedTime.getOrThrow("publicRangedTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicBoolProperty != null -> visitor.visitPublicBoolProperty(publicBoolProperty)
                publicNumberProperty != null ->
                    visitor.visitPublicNumberProperty(publicNumberProperty)
                publicStringProperty != null ->
                    visitor.visitPublicStringProperty(publicStringProperty)
                publicDateTimeProperty != null ->
                    visitor.visitPublicDateTimeProperty(publicDateTimeProperty)
                publicRangedDateProperty != null ->
                    visitor.visitPublicRangedDateProperty(publicRangedDateProperty)
                publicComparativePropertyUpdated != null ->
                    visitor.visitPublicComparativePropertyUpdated(publicComparativePropertyUpdated)
                publicComparativeDateProperty != null ->
                    visitor.visitPublicComparativeDateProperty(publicComparativeDateProperty)
                publicRollingDateRangeProperty != null ->
                    visitor.visitPublicRollingDateRangeProperty(publicRollingDateRangeProperty)
                publicRollingPropertyUpdated != null ->
                    visitor.visitPublicRollingPropertyUpdated(publicRollingPropertyUpdated)
                publicEnumerationProperty != null ->
                    visitor.visitPublicEnumerationProperty(publicEnumerationProperty)
                publicAllPropertyTypes != null ->
                    visitor.visitPublicAllPropertyTypes(publicAllPropertyTypes)
                publicRangedNumberProperty != null ->
                    visitor.visitPublicRangedNumberProperty(publicRangedNumberProperty)
                publicMultiStringProperty != null ->
                    visitor.visitPublicMultiStringProperty(publicMultiStringProperty)
                publicDateProperty != null -> visitor.visitPublicDateProperty(publicDateProperty)
                publicCalendarDateProperty != null ->
                    visitor.visitPublicCalendarDateProperty(publicCalendarDateProperty)
                publicTimePoint != null -> visitor.visitPublicTimePoint(publicTimePoint)
                publicRangedTime != null -> visitor.visitPublicRangedTime(publicRangedTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Operation = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicBoolProperty(
                        publicBoolProperty: PublicBoolPropertyOperation
                    ) {
                        publicBoolProperty.validate()
                    }

                    override fun visitPublicNumberProperty(
                        publicNumberProperty: PublicNumberPropertyOperation
                    ) {
                        publicNumberProperty.validate()
                    }

                    override fun visitPublicStringProperty(
                        publicStringProperty: PublicStringPropertyOperation
                    ) {
                        publicStringProperty.validate()
                    }

                    override fun visitPublicDateTimeProperty(
                        publicDateTimeProperty: PublicDateTimePropertyOperation
                    ) {
                        publicDateTimeProperty.validate()
                    }

                    override fun visitPublicRangedDateProperty(
                        publicRangedDateProperty: PublicRangedDatePropertyOperation
                    ) {
                        publicRangedDateProperty.validate()
                    }

                    override fun visitPublicComparativePropertyUpdated(
                        publicComparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
                    ) {
                        publicComparativePropertyUpdated.validate()
                    }

                    override fun visitPublicComparativeDateProperty(
                        publicComparativeDateProperty: PublicComparativeDatePropertyOperation
                    ) {
                        publicComparativeDateProperty.validate()
                    }

                    override fun visitPublicRollingDateRangeProperty(
                        publicRollingDateRangeProperty: PublicRollingDateRangePropertyOperation
                    ) {
                        publicRollingDateRangeProperty.validate()
                    }

                    override fun visitPublicRollingPropertyUpdated(
                        publicRollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
                    ) {
                        publicRollingPropertyUpdated.validate()
                    }

                    override fun visitPublicEnumerationProperty(
                        publicEnumerationProperty: PublicEnumerationPropertyOperation
                    ) {
                        publicEnumerationProperty.validate()
                    }

                    override fun visitPublicAllPropertyTypes(
                        publicAllPropertyTypes: PublicAllPropertyTypesOperation
                    ) {
                        publicAllPropertyTypes.validate()
                    }

                    override fun visitPublicRangedNumberProperty(
                        publicRangedNumberProperty: PublicRangedNumberPropertyOperation
                    ) {
                        publicRangedNumberProperty.validate()
                    }

                    override fun visitPublicMultiStringProperty(
                        publicMultiStringProperty: PublicMultiStringPropertyOperation
                    ) {
                        publicMultiStringProperty.validate()
                    }

                    override fun visitPublicDateProperty(
                        publicDateProperty: PublicDatePropertyOperation
                    ) {
                        publicDateProperty.validate()
                    }

                    override fun visitPublicCalendarDateProperty(
                        publicCalendarDateProperty: PublicCalendarDatePropertyOperation
                    ) {
                        publicCalendarDateProperty.validate()
                    }

                    override fun visitPublicTimePoint(publicTimePoint: PublicTimePointOperation) {
                        publicTimePoint.validate()
                    }

                    override fun visitPublicRangedTime(
                        publicRangedTime: PublicRangedTimeOperation
                    ) {
                        publicRangedTime.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitPublicBoolProperty(
                        publicBoolProperty: PublicBoolPropertyOperation
                    ) = publicBoolProperty.validity()

                    override fun visitPublicNumberProperty(
                        publicNumberProperty: PublicNumberPropertyOperation
                    ) = publicNumberProperty.validity()

                    override fun visitPublicStringProperty(
                        publicStringProperty: PublicStringPropertyOperation
                    ) = publicStringProperty.validity()

                    override fun visitPublicDateTimeProperty(
                        publicDateTimeProperty: PublicDateTimePropertyOperation
                    ) = publicDateTimeProperty.validity()

                    override fun visitPublicRangedDateProperty(
                        publicRangedDateProperty: PublicRangedDatePropertyOperation
                    ) = publicRangedDateProperty.validity()

                    override fun visitPublicComparativePropertyUpdated(
                        publicComparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
                    ) = publicComparativePropertyUpdated.validity()

                    override fun visitPublicComparativeDateProperty(
                        publicComparativeDateProperty: PublicComparativeDatePropertyOperation
                    ) = publicComparativeDateProperty.validity()

                    override fun visitPublicRollingDateRangeProperty(
                        publicRollingDateRangeProperty: PublicRollingDateRangePropertyOperation
                    ) = publicRollingDateRangeProperty.validity()

                    override fun visitPublicRollingPropertyUpdated(
                        publicRollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
                    ) = publicRollingPropertyUpdated.validity()

                    override fun visitPublicEnumerationProperty(
                        publicEnumerationProperty: PublicEnumerationPropertyOperation
                    ) = publicEnumerationProperty.validity()

                    override fun visitPublicAllPropertyTypes(
                        publicAllPropertyTypes: PublicAllPropertyTypesOperation
                    ) = publicAllPropertyTypes.validity()

                    override fun visitPublicRangedNumberProperty(
                        publicRangedNumberProperty: PublicRangedNumberPropertyOperation
                    ) = publicRangedNumberProperty.validity()

                    override fun visitPublicMultiStringProperty(
                        publicMultiStringProperty: PublicMultiStringPropertyOperation
                    ) = publicMultiStringProperty.validity()

                    override fun visitPublicDateProperty(
                        publicDateProperty: PublicDatePropertyOperation
                    ) = publicDateProperty.validity()

                    override fun visitPublicCalendarDateProperty(
                        publicCalendarDateProperty: PublicCalendarDatePropertyOperation
                    ) = publicCalendarDateProperty.validity()

                    override fun visitPublicTimePoint(publicTimePoint: PublicTimePointOperation) =
                        publicTimePoint.validity()

                    override fun visitPublicRangedTime(
                        publicRangedTime: PublicRangedTimeOperation
                    ) = publicRangedTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Operation &&
                publicBoolProperty == other.publicBoolProperty &&
                publicNumberProperty == other.publicNumberProperty &&
                publicStringProperty == other.publicStringProperty &&
                publicDateTimeProperty == other.publicDateTimeProperty &&
                publicRangedDateProperty == other.publicRangedDateProperty &&
                publicComparativePropertyUpdated == other.publicComparativePropertyUpdated &&
                publicComparativeDateProperty == other.publicComparativeDateProperty &&
                publicRollingDateRangeProperty == other.publicRollingDateRangeProperty &&
                publicRollingPropertyUpdated == other.publicRollingPropertyUpdated &&
                publicEnumerationProperty == other.publicEnumerationProperty &&
                publicAllPropertyTypes == other.publicAllPropertyTypes &&
                publicRangedNumberProperty == other.publicRangedNumberProperty &&
                publicMultiStringProperty == other.publicMultiStringProperty &&
                publicDateProperty == other.publicDateProperty &&
                publicCalendarDateProperty == other.publicCalendarDateProperty &&
                publicTimePoint == other.publicTimePoint &&
                publicRangedTime == other.publicRangedTime
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicBoolProperty,
                publicNumberProperty,
                publicStringProperty,
                publicDateTimeProperty,
                publicRangedDateProperty,
                publicComparativePropertyUpdated,
                publicComparativeDateProperty,
                publicRollingDateRangeProperty,
                publicRollingPropertyUpdated,
                publicEnumerationProperty,
                publicAllPropertyTypes,
                publicRangedNumberProperty,
                publicMultiStringProperty,
                publicDateProperty,
                publicCalendarDateProperty,
                publicTimePoint,
                publicRangedTime,
            )

        override fun toString(): String =
            when {
                publicBoolProperty != null -> "Operation{publicBoolProperty=$publicBoolProperty}"
                publicNumberProperty != null ->
                    "Operation{publicNumberProperty=$publicNumberProperty}"
                publicStringProperty != null ->
                    "Operation{publicStringProperty=$publicStringProperty}"
                publicDateTimeProperty != null ->
                    "Operation{publicDateTimeProperty=$publicDateTimeProperty}"
                publicRangedDateProperty != null ->
                    "Operation{publicRangedDateProperty=$publicRangedDateProperty}"
                publicComparativePropertyUpdated != null ->
                    "Operation{publicComparativePropertyUpdated=$publicComparativePropertyUpdated}"
                publicComparativeDateProperty != null ->
                    "Operation{publicComparativeDateProperty=$publicComparativeDateProperty}"
                publicRollingDateRangeProperty != null ->
                    "Operation{publicRollingDateRangeProperty=$publicRollingDateRangeProperty}"
                publicRollingPropertyUpdated != null ->
                    "Operation{publicRollingPropertyUpdated=$publicRollingPropertyUpdated}"
                publicEnumerationProperty != null ->
                    "Operation{publicEnumerationProperty=$publicEnumerationProperty}"
                publicAllPropertyTypes != null ->
                    "Operation{publicAllPropertyTypes=$publicAllPropertyTypes}"
                publicRangedNumberProperty != null ->
                    "Operation{publicRangedNumberProperty=$publicRangedNumberProperty}"
                publicMultiStringProperty != null ->
                    "Operation{publicMultiStringProperty=$publicMultiStringProperty}"
                publicDateProperty != null -> "Operation{publicDateProperty=$publicDateProperty}"
                publicCalendarDateProperty != null ->
                    "Operation{publicCalendarDateProperty=$publicCalendarDateProperty}"
                publicTimePoint != null -> "Operation{publicTimePoint=$publicTimePoint}"
                publicRangedTime != null -> "Operation{publicRangedTime=$publicRangedTime}"
                _json != null -> "Operation{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Operation")
            }

        companion object {

            @JvmStatic
            fun ofPublicBoolProperty(publicBoolProperty: PublicBoolPropertyOperation) =
                Operation(publicBoolProperty = publicBoolProperty)

            @JvmStatic
            fun ofPublicNumberProperty(publicNumberProperty: PublicNumberPropertyOperation) =
                Operation(publicNumberProperty = publicNumberProperty)

            @JvmStatic
            fun ofPublicStringProperty(publicStringProperty: PublicStringPropertyOperation) =
                Operation(publicStringProperty = publicStringProperty)

            @JvmStatic
            fun ofPublicDateTimeProperty(publicDateTimeProperty: PublicDateTimePropertyOperation) =
                Operation(publicDateTimeProperty = publicDateTimeProperty)

            @JvmStatic
            fun ofPublicRangedDateProperty(
                publicRangedDateProperty: PublicRangedDatePropertyOperation
            ) = Operation(publicRangedDateProperty = publicRangedDateProperty)

            @JvmStatic
            fun ofPublicComparativePropertyUpdated(
                publicComparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
            ) = Operation(publicComparativePropertyUpdated = publicComparativePropertyUpdated)

            @JvmStatic
            fun ofPublicComparativeDateProperty(
                publicComparativeDateProperty: PublicComparativeDatePropertyOperation
            ) = Operation(publicComparativeDateProperty = publicComparativeDateProperty)

            @JvmStatic
            fun ofPublicRollingDateRangeProperty(
                publicRollingDateRangeProperty: PublicRollingDateRangePropertyOperation
            ) = Operation(publicRollingDateRangeProperty = publicRollingDateRangeProperty)

            @JvmStatic
            fun ofPublicRollingPropertyUpdated(
                publicRollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
            ) = Operation(publicRollingPropertyUpdated = publicRollingPropertyUpdated)

            @JvmStatic
            fun ofPublicEnumerationProperty(
                publicEnumerationProperty: PublicEnumerationPropertyOperation
            ) = Operation(publicEnumerationProperty = publicEnumerationProperty)

            @JvmStatic
            fun ofPublicAllPropertyTypes(publicAllPropertyTypes: PublicAllPropertyTypesOperation) =
                Operation(publicAllPropertyTypes = publicAllPropertyTypes)

            @JvmStatic
            fun ofPublicRangedNumberProperty(
                publicRangedNumberProperty: PublicRangedNumberPropertyOperation
            ) = Operation(publicRangedNumberProperty = publicRangedNumberProperty)

            @JvmStatic
            fun ofPublicMultiStringProperty(
                publicMultiStringProperty: PublicMultiStringPropertyOperation
            ) = Operation(publicMultiStringProperty = publicMultiStringProperty)

            @JvmStatic
            fun ofPublicDateProperty(publicDateProperty: PublicDatePropertyOperation) =
                Operation(publicDateProperty = publicDateProperty)

            @JvmStatic
            fun ofPublicCalendarDateProperty(
                publicCalendarDateProperty: PublicCalendarDatePropertyOperation
            ) = Operation(publicCalendarDateProperty = publicCalendarDateProperty)

            @JvmStatic
            fun ofPublicTimePoint(publicTimePoint: PublicTimePointOperation) =
                Operation(publicTimePoint = publicTimePoint)

            @JvmStatic
            fun ofPublicRangedTime(publicRangedTime: PublicRangedTimeOperation) =
                Operation(publicRangedTime = publicRangedTime)
        }

        /**
         * An interface that defines how to map each variant of [Operation] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPublicBoolProperty(publicBoolProperty: PublicBoolPropertyOperation): T

            fun visitPublicNumberProperty(publicNumberProperty: PublicNumberPropertyOperation): T

            fun visitPublicStringProperty(publicStringProperty: PublicStringPropertyOperation): T

            fun visitPublicDateTimeProperty(
                publicDateTimeProperty: PublicDateTimePropertyOperation
            ): T

            fun visitPublicRangedDateProperty(
                publicRangedDateProperty: PublicRangedDatePropertyOperation
            ): T

            fun visitPublicComparativePropertyUpdated(
                publicComparativePropertyUpdated: PublicComparativePropertyUpdatedOperation
            ): T

            fun visitPublicComparativeDateProperty(
                publicComparativeDateProperty: PublicComparativeDatePropertyOperation
            ): T

            fun visitPublicRollingDateRangeProperty(
                publicRollingDateRangeProperty: PublicRollingDateRangePropertyOperation
            ): T

            fun visitPublicRollingPropertyUpdated(
                publicRollingPropertyUpdated: PublicRollingPropertyUpdatedOperation
            ): T

            fun visitPublicEnumerationProperty(
                publicEnumerationProperty: PublicEnumerationPropertyOperation
            ): T

            fun visitPublicAllPropertyTypes(
                publicAllPropertyTypes: PublicAllPropertyTypesOperation
            ): T

            fun visitPublicRangedNumberProperty(
                publicRangedNumberProperty: PublicRangedNumberPropertyOperation
            ): T

            fun visitPublicMultiStringProperty(
                publicMultiStringProperty: PublicMultiStringPropertyOperation
            ): T

            fun visitPublicDateProperty(publicDateProperty: PublicDatePropertyOperation): T

            fun visitPublicCalendarDateProperty(
                publicCalendarDateProperty: PublicCalendarDatePropertyOperation
            ): T

            fun visitPublicTimePoint(publicTimePoint: PublicTimePointOperation): T

            fun visitPublicRangedTime(publicRangedTime: PublicRangedTimeOperation): T

            /**
             * Maps an unknown variant of [Operation] to a value of type [T].
             *
             * An instance of [Operation] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Operation: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Operation>(Operation::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Operation {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicBoolPropertyOperation>())
                                ?.let { Operation(publicBoolProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicNumberPropertyOperation>())
                                ?.let { Operation(publicNumberProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicStringPropertyOperation>())
                                ?.let { Operation(publicStringProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicDateTimePropertyOperation>())
                                ?.let { Operation(publicDateTimeProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRangedDatePropertyOperation>(),
                                )
                                ?.let { Operation(publicRangedDateProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicComparativePropertyUpdatedOperation>(),
                                )
                                ?.let {
                                    Operation(publicComparativePropertyUpdated = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicComparativeDatePropertyOperation>(),
                                )
                                ?.let {
                                    Operation(publicComparativeDateProperty = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRollingDateRangePropertyOperation>(),
                                )
                                ?.let {
                                    Operation(publicRollingDateRangeProperty = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRollingPropertyUpdatedOperation>(),
                                )
                                ?.let {
                                    Operation(publicRollingPropertyUpdated = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicEnumerationPropertyOperation>(),
                                )
                                ?.let { Operation(publicEnumerationProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicAllPropertyTypesOperation>())
                                ?.let { Operation(publicAllPropertyTypes = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicRangedNumberPropertyOperation>(),
                                )
                                ?.let { Operation(publicRangedNumberProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicMultiStringPropertyOperation>(),
                                )
                                ?.let { Operation(publicMultiStringProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicDatePropertyOperation>())
                                ?.let { Operation(publicDateProperty = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicCalendarDatePropertyOperation>(),
                                )
                                ?.let { Operation(publicCalendarDateProperty = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicTimePointOperation>())?.let {
                                Operation(publicTimePoint = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRangedTimeOperation>())?.let {
                                Operation(publicRangedTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Operation(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Operation>(Operation::class) {

            override fun serialize(
                value: Operation,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicBoolProperty != null ->
                        generator.writeObject(value.publicBoolProperty)
                    value.publicNumberProperty != null ->
                        generator.writeObject(value.publicNumberProperty)
                    value.publicStringProperty != null ->
                        generator.writeObject(value.publicStringProperty)
                    value.publicDateTimeProperty != null ->
                        generator.writeObject(value.publicDateTimeProperty)
                    value.publicRangedDateProperty != null ->
                        generator.writeObject(value.publicRangedDateProperty)
                    value.publicComparativePropertyUpdated != null ->
                        generator.writeObject(value.publicComparativePropertyUpdated)
                    value.publicComparativeDateProperty != null ->
                        generator.writeObject(value.publicComparativeDateProperty)
                    value.publicRollingDateRangeProperty != null ->
                        generator.writeObject(value.publicRollingDateRangeProperty)
                    value.publicRollingPropertyUpdated != null ->
                        generator.writeObject(value.publicRollingPropertyUpdated)
                    value.publicEnumerationProperty != null ->
                        generator.writeObject(value.publicEnumerationProperty)
                    value.publicAllPropertyTypes != null ->
                        generator.writeObject(value.publicAllPropertyTypes)
                    value.publicRangedNumberProperty != null ->
                        generator.writeObject(value.publicRangedNumberProperty)
                    value.publicMultiStringProperty != null ->
                        generator.writeObject(value.publicMultiStringProperty)
                    value.publicDateProperty != null ->
                        generator.writeObject(value.publicDateProperty)
                    value.publicCalendarDateProperty != null ->
                        generator.writeObject(value.publicCalendarDateProperty)
                    value.publicTimePoint != null -> generator.writeObject(value.publicTimePoint)
                    value.publicRangedTime != null -> generator.writeObject(value.publicRangedTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Operation")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEventFilterMetadata &&
            operation == other.operation &&
            property == other.property &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(operation, property, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEventFilterMetadata{operation=$operation, property=$property, additionalProperties=$additionalProperties}"
}
