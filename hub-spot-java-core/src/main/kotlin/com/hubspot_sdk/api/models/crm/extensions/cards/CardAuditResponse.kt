// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class CardAuditResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionType: JsonField<ActionType>,
    private val applicationId: JsonField<Int>,
    private val authSource: JsonField<AuthSource>,
    private val changedAt: JsonField<Long>,
    private val initiatingUserId: JsonField<Int>,
    private val objectTypeId: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionType")
        @ExcludeMissing
        actionType: JsonField<ActionType> = JsonMissing.of(),
        @JsonProperty("applicationId")
        @ExcludeMissing
        applicationId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("authSource")
        @ExcludeMissing
        authSource: JsonField<AuthSource> = JsonMissing.of(),
        @JsonProperty("changedAt") @ExcludeMissing changedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("initiatingUserId")
        @ExcludeMissing
        initiatingUserId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<Int> = JsonMissing.of(),
    ) : this(
        actionType,
        applicationId,
        authSource,
        changedAt,
        initiatingUserId,
        objectTypeId,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionType(): ActionType = actionType.getRequired("actionType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationId(): Int = applicationId.getRequired("applicationId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authSource(): AuthSource = authSource.getRequired("authSource")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun changedAt(): Long = changedAt.getRequired("changedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initiatingUserId(): Int = initiatingUserId.getRequired("initiatingUserId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): Int = objectTypeId.getRequired("objectTypeId")

    /**
     * Returns the raw JSON value of [actionType].
     *
     * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionType")
    @ExcludeMissing
    fun _actionType(): JsonField<ActionType> = actionType

    /**
     * Returns the raw JSON value of [applicationId].
     *
     * Unlike [applicationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("applicationId")
    @ExcludeMissing
    fun _applicationId(): JsonField<Int> = applicationId

    /**
     * Returns the raw JSON value of [authSource].
     *
     * Unlike [authSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authSource")
    @ExcludeMissing
    fun _authSource(): JsonField<AuthSource> = authSource

    /**
     * Returns the raw JSON value of [changedAt].
     *
     * Unlike [changedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("changedAt") @ExcludeMissing fun _changedAt(): JsonField<Long> = changedAt

    /**
     * Returns the raw JSON value of [initiatingUserId].
     *
     * Unlike [initiatingUserId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("initiatingUserId")
    @ExcludeMissing
    fun _initiatingUserId(): JsonField<Int> = initiatingUserId

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId") @ExcludeMissing fun _objectTypeId(): JsonField<Int> = objectTypeId

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
         * Returns a mutable builder for constructing an instance of [CardAuditResponse].
         *
         * The following fields are required:
         * ```java
         * .actionType()
         * .applicationId()
         * .authSource()
         * .changedAt()
         * .initiatingUserId()
         * .objectTypeId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardAuditResponse]. */
    class Builder internal constructor() {

        private var actionType: JsonField<ActionType>? = null
        private var applicationId: JsonField<Int>? = null
        private var authSource: JsonField<AuthSource>? = null
        private var changedAt: JsonField<Long>? = null
        private var initiatingUserId: JsonField<Int>? = null
        private var objectTypeId: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardAuditResponse: CardAuditResponse) = apply {
            actionType = cardAuditResponse.actionType
            applicationId = cardAuditResponse.applicationId
            authSource = cardAuditResponse.authSource
            changedAt = cardAuditResponse.changedAt
            initiatingUserId = cardAuditResponse.initiatingUserId
            objectTypeId = cardAuditResponse.objectTypeId
            additionalProperties = cardAuditResponse.additionalProperties.toMutableMap()
        }

        fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

        /**
         * Sets [Builder.actionType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionType] with a well-typed [ActionType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionType(actionType: JsonField<ActionType>) = apply { this.actionType = actionType }

        fun applicationId(applicationId: Int) = applicationId(JsonField.of(applicationId))

        /**
         * Sets [Builder.applicationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applicationId(applicationId: JsonField<Int>) = apply {
            this.applicationId = applicationId
        }

        fun authSource(authSource: AuthSource) = authSource(JsonField.of(authSource))

        /**
         * Sets [Builder.authSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authSource] with a well-typed [AuthSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authSource(authSource: JsonField<AuthSource>) = apply { this.authSource = authSource }

        fun changedAt(changedAt: Long) = changedAt(JsonField.of(changedAt))

        /**
         * Sets [Builder.changedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun changedAt(changedAt: JsonField<Long>) = apply { this.changedAt = changedAt }

        fun initiatingUserId(initiatingUserId: Int) =
            initiatingUserId(JsonField.of(initiatingUserId))

        /**
         * Sets [Builder.initiatingUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initiatingUserId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun initiatingUserId(initiatingUserId: JsonField<Int>) = apply {
            this.initiatingUserId = initiatingUserId
        }

        fun objectTypeId(objectTypeId: Int) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<Int>) = apply { this.objectTypeId = objectTypeId }

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
         * Returns an immutable instance of [CardAuditResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionType()
         * .applicationId()
         * .authSource()
         * .changedAt()
         * .initiatingUserId()
         * .objectTypeId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAuditResponse =
            CardAuditResponse(
                checkRequired("actionType", actionType),
                checkRequired("applicationId", applicationId),
                checkRequired("authSource", authSource),
                checkRequired("changedAt", changedAt),
                checkRequired("initiatingUserId", initiatingUserId),
                checkRequired("objectTypeId", objectTypeId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardAuditResponse = apply {
        if (validated) {
            return@apply
        }

        actionType().validate()
        applicationId()
        authSource().validate()
        changedAt()
        initiatingUserId()
        objectTypeId()
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
        (actionType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (applicationId.asKnown().isPresent) 1 else 0) +
            (authSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (changedAt.asKnown().isPresent) 1 else 0) +
            (if (initiatingUserId.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0)

    class ActionType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREATE = of("CREATE")

            @JvmField val UPDATE = of("UPDATE")

            @JvmField val DELETE = of("DELETE")

            @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
        }

        /** An enum containing [ActionType]'s known values. */
        enum class Known {
            CREATE,
            UPDATE,
            DELETE,
        }

        /**
         * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ActionType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREATE,
            UPDATE,
            DELETE,
            /**
             * An enum member indicating that [ActionType] was instantiated with an unknown value.
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
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
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
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                else -> throw HubSpotInvalidDataException("Unknown ActionType: $value")
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

        fun validate(): ActionType = apply {
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

            return other is ActionType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class AuthSource @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INTERNAL = of("INTERNAL")

            @JvmField val APP = of("APP")

            @JvmField val EXTERNAL = of("EXTERNAL")

            @JvmStatic fun of(value: String) = AuthSource(JsonField.of(value))
        }

        /** An enum containing [AuthSource]'s known values. */
        enum class Known {
            INTERNAL,
            APP,
            EXTERNAL,
        }

        /**
         * An enum containing [AuthSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AuthSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTERNAL,
            APP,
            EXTERNAL,
            /**
             * An enum member indicating that [AuthSource] was instantiated with an unknown value.
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
                INTERNAL -> Value.INTERNAL
                APP -> Value.APP
                EXTERNAL -> Value.EXTERNAL
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
                INTERNAL -> Known.INTERNAL
                APP -> Known.APP
                EXTERNAL -> Known.EXTERNAL
                else -> throw HubSpotInvalidDataException("Unknown AuthSource: $value")
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

        fun validate(): AuthSource = apply {
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

            return other is AuthSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardAuditResponse &&
            actionType == other.actionType &&
            applicationId == other.applicationId &&
            authSource == other.authSource &&
            changedAt == other.changedAt &&
            initiatingUserId == other.initiatingUserId &&
            objectTypeId == other.objectTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionType,
            applicationId,
            authSource,
            changedAt,
            initiatingUserId,
            objectTypeId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardAuditResponse{actionType=$actionType, applicationId=$applicationId, authSource=$authSource, changedAt=$changedAt, initiatingUserId=$initiatingUserId, objectTypeId=$objectTypeId, additionalProperties=$additionalProperties}"
}
