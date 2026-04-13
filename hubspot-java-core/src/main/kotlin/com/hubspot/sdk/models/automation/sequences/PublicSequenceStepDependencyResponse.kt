// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
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

class PublicSequenceStepDependencyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dependencyType: JsonField<DependencyType>,
    private val reliesOnSequenceStepId: JsonField<String>,
    private val reliesOnStepOrder: JsonField<Int>,
    private val requiredBySequenceStepId: JsonField<String>,
    private val requiredByStepOrder: JsonField<Int>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dependencyType")
        @ExcludeMissing
        dependencyType: JsonField<DependencyType> = JsonMissing.of(),
        @JsonProperty("reliesOnSequenceStepId")
        @ExcludeMissing
        reliesOnSequenceStepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reliesOnStepOrder")
        @ExcludeMissing
        reliesOnStepOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("requiredBySequenceStepId")
        @ExcludeMissing
        requiredBySequenceStepId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requiredByStepOrder")
        @ExcludeMissing
        requiredByStepOrder: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        dependencyType,
        reliesOnSequenceStepId,
        reliesOnStepOrder,
        requiredBySequenceStepId,
        requiredByStepOrder,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * The unique identifier of the step dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the step dependency was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The type of dependency between sequence steps with accepted values being TASK_COMPLETION or
     * MANUAL_PAUSE.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependencyType(): DependencyType = dependencyType.getRequired("dependencyType")

    /**
     * The unique identifier of the sequence step that is responsible for creating and resolving
     * this dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reliesOnSequenceStepId(): String =
        reliesOnSequenceStepId.getRequired("reliesOnSequenceStepId")

    /**
     * The order number of the step that is responsible for creating and resolving this dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reliesOnStepOrder(): Int = reliesOnStepOrder.getRequired("reliesOnStepOrder")

    /**
     * The unique identifier of the sequence step that requires this dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredBySequenceStepId(): String =
        requiredBySequenceStepId.getRequired("requiredBySequenceStepId")

    /**
     * The order number of the step that requires this dependency.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requiredByStepOrder(): Int = requiredByStepOrder.getRequired("requiredByStepOrder")

    /**
     * The date and time when the step dependency was last updated.
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
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dependencyType].
     *
     * Unlike [dependencyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependencyType")
    @ExcludeMissing
    fun _dependencyType(): JsonField<DependencyType> = dependencyType

    /**
     * Returns the raw JSON value of [reliesOnSequenceStepId].
     *
     * Unlike [reliesOnSequenceStepId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("reliesOnSequenceStepId")
    @ExcludeMissing
    fun _reliesOnSequenceStepId(): JsonField<String> = reliesOnSequenceStepId

    /**
     * Returns the raw JSON value of [reliesOnStepOrder].
     *
     * Unlike [reliesOnStepOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reliesOnStepOrder")
    @ExcludeMissing
    fun _reliesOnStepOrder(): JsonField<Int> = reliesOnStepOrder

    /**
     * Returns the raw JSON value of [requiredBySequenceStepId].
     *
     * Unlike [requiredBySequenceStepId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requiredBySequenceStepId")
    @ExcludeMissing
    fun _requiredBySequenceStepId(): JsonField<String> = requiredBySequenceStepId

    /**
     * Returns the raw JSON value of [requiredByStepOrder].
     *
     * Unlike [requiredByStepOrder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("requiredByStepOrder")
    @ExcludeMissing
    fun _requiredByStepOrder(): JsonField<Int> = requiredByStepOrder

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
         * Returns a mutable builder for constructing an instance of
         * [PublicSequenceStepDependencyResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .dependencyType()
         * .reliesOnSequenceStepId()
         * .reliesOnStepOrder()
         * .requiredBySequenceStepId()
         * .requiredByStepOrder()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceStepDependencyResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dependencyType: JsonField<DependencyType>? = null
        private var reliesOnSequenceStepId: JsonField<String>? = null
        private var reliesOnStepOrder: JsonField<Int>? = null
        private var requiredBySequenceStepId: JsonField<String>? = null
        private var requiredByStepOrder: JsonField<Int>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            publicSequenceStepDependencyResponse: PublicSequenceStepDependencyResponse
        ) = apply {
            id = publicSequenceStepDependencyResponse.id
            createdAt = publicSequenceStepDependencyResponse.createdAt
            dependencyType = publicSequenceStepDependencyResponse.dependencyType
            reliesOnSequenceStepId = publicSequenceStepDependencyResponse.reliesOnSequenceStepId
            reliesOnStepOrder = publicSequenceStepDependencyResponse.reliesOnStepOrder
            requiredBySequenceStepId = publicSequenceStepDependencyResponse.requiredBySequenceStepId
            requiredByStepOrder = publicSequenceStepDependencyResponse.requiredByStepOrder
            updatedAt = publicSequenceStepDependencyResponse.updatedAt
            additionalProperties =
                publicSequenceStepDependencyResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier of the step dependency. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the step dependency was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The type of dependency between sequence steps with accepted values being TASK_COMPLETION
         * or MANUAL_PAUSE.
         */
        fun dependencyType(dependencyType: DependencyType) =
            dependencyType(JsonField.of(dependencyType))

        /**
         * Sets [Builder.dependencyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependencyType] with a well-typed [DependencyType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dependencyType(dependencyType: JsonField<DependencyType>) = apply {
            this.dependencyType = dependencyType
        }

        /**
         * The unique identifier of the sequence step that is responsible for creating and resolving
         * this dependency.
         */
        fun reliesOnSequenceStepId(reliesOnSequenceStepId: String) =
            reliesOnSequenceStepId(JsonField.of(reliesOnSequenceStepId))

        /**
         * Sets [Builder.reliesOnSequenceStepId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reliesOnSequenceStepId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reliesOnSequenceStepId(reliesOnSequenceStepId: JsonField<String>) = apply {
            this.reliesOnSequenceStepId = reliesOnSequenceStepId
        }

        /**
         * The order number of the step that is responsible for creating and resolving this
         * dependency.
         */
        fun reliesOnStepOrder(reliesOnStepOrder: Int) =
            reliesOnStepOrder(JsonField.of(reliesOnStepOrder))

        /**
         * Sets [Builder.reliesOnStepOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reliesOnStepOrder] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reliesOnStepOrder(reliesOnStepOrder: JsonField<Int>) = apply {
            this.reliesOnStepOrder = reliesOnStepOrder
        }

        /** The unique identifier of the sequence step that requires this dependency. */
        fun requiredBySequenceStepId(requiredBySequenceStepId: String) =
            requiredBySequenceStepId(JsonField.of(requiredBySequenceStepId))

        /**
         * Sets [Builder.requiredBySequenceStepId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredBySequenceStepId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun requiredBySequenceStepId(requiredBySequenceStepId: JsonField<String>) = apply {
            this.requiredBySequenceStepId = requiredBySequenceStepId
        }

        /** The order number of the step that requires this dependency. */
        fun requiredByStepOrder(requiredByStepOrder: Int) =
            requiredByStepOrder(JsonField.of(requiredByStepOrder))

        /**
         * Sets [Builder.requiredByStepOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredByStepOrder] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requiredByStepOrder(requiredByStepOrder: JsonField<Int>) = apply {
            this.requiredByStepOrder = requiredByStepOrder
        }

        /** The date and time when the step dependency was last updated. */
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
         * Returns an immutable instance of [PublicSequenceStepDependencyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .dependencyType()
         * .reliesOnSequenceStepId()
         * .reliesOnStepOrder()
         * .requiredBySequenceStepId()
         * .requiredByStepOrder()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceStepDependencyResponse =
            PublicSequenceStepDependencyResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("dependencyType", dependencyType),
                checkRequired("reliesOnSequenceStepId", reliesOnSequenceStepId),
                checkRequired("reliesOnStepOrder", reliesOnStepOrder),
                checkRequired("requiredBySequenceStepId", requiredBySequenceStepId),
                checkRequired("requiredByStepOrder", requiredByStepOrder),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSequenceStepDependencyResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        dependencyType().validate()
        reliesOnSequenceStepId()
        reliesOnStepOrder()
        requiredBySequenceStepId()
        requiredByStepOrder()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dependencyType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reliesOnSequenceStepId.asKnown().isPresent) 1 else 0) +
            (if (reliesOnStepOrder.asKnown().isPresent) 1 else 0) +
            (if (requiredBySequenceStepId.asKnown().isPresent) 1 else 0) +
            (if (requiredByStepOrder.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * The type of dependency between sequence steps with accepted values being TASK_COMPLETION or
     * MANUAL_PAUSE.
     */
    class DependencyType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MANUAL_PAUSE = of("MANUAL_PAUSE")

            @JvmField val TASK_COMPLETION = of("TASK_COMPLETION")

            @JvmStatic fun of(value: String) = DependencyType(JsonField.of(value))
        }

        /** An enum containing [DependencyType]'s known values. */
        enum class Known {
            MANUAL_PAUSE,
            TASK_COMPLETION,
        }

        /**
         * An enum containing [DependencyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DependencyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MANUAL_PAUSE,
            TASK_COMPLETION,
            /**
             * An enum member indicating that [DependencyType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                MANUAL_PAUSE -> Value.MANUAL_PAUSE
                TASK_COMPLETION -> Value.TASK_COMPLETION
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MANUAL_PAUSE -> Known.MANUAL_PAUSE
                TASK_COMPLETION -> Known.TASK_COMPLETION
                else -> throw HubSpotInvalidDataException("Unknown DependencyType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DependencyType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DependencyType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceStepDependencyResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            dependencyType == other.dependencyType &&
            reliesOnSequenceStepId == other.reliesOnSequenceStepId &&
            reliesOnStepOrder == other.reliesOnStepOrder &&
            requiredBySequenceStepId == other.requiredBySequenceStepId &&
            requiredByStepOrder == other.requiredByStepOrder &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            dependencyType,
            reliesOnSequenceStepId,
            reliesOnStepOrder,
            requiredBySequenceStepId,
            requiredByStepOrder,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceStepDependencyResponse{id=$id, createdAt=$createdAt, dependencyType=$dependencyType, reliesOnSequenceStepId=$reliesOnSequenceStepId, reliesOnStepOrder=$reliesOnStepOrder, requiredBySequenceStepId=$requiredBySequenceStepId, requiredByStepOrder=$requiredByStepOrder, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
