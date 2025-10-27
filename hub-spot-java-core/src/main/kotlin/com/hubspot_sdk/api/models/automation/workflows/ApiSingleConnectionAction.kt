// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiSingleConnectionAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionId: JsonField<String>,
    private val actionTypeId: JsonField<String>,
    private val actionTypeVersion: JsonField<Int>,
    private val fields: JsonField<Fields>,
    private val type: JsonField<Type>,
    private val connection: JsonField<ApiConnection>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionTypeId")
        @ExcludeMissing
        actionTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionTypeVersion")
        @ExcludeMissing
        actionTypeVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fields") @ExcludeMissing fields: JsonField<Fields> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("connection")
        @ExcludeMissing
        connection: JsonField<ApiConnection> = JsonMissing.of(),
    ) : this(actionId, actionTypeId, actionTypeVersion, fields, type, connection, mutableMapOf())

    /**
     * The ID for this action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionId(): String = actionId.getRequired("actionId")

    /**
     * The ID of the actionType to use.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionTypeId(): String = actionTypeId.getRequired("actionTypeId")

    /**
     * The version of this actionType to use.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionTypeVersion(): Int = actionTypeVersion.getRequired("actionTypeVersion")

    /**
     * The fields to pass into this action. Different action types accept different fields.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fields(): Fields = fields.getRequired("fields")

    /**
     * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
     * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun connection(): Optional<ApiConnection> = connection.getOptional("connection")

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [actionTypeId].
     *
     * Unlike [actionTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionTypeId")
    @ExcludeMissing
    fun _actionTypeId(): JsonField<String> = actionTypeId

    /**
     * Returns the raw JSON value of [actionTypeVersion].
     *
     * Unlike [actionTypeVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actionTypeVersion")
    @ExcludeMissing
    fun _actionTypeVersion(): JsonField<Int> = actionTypeVersion

    /**
     * Returns the raw JSON value of [fields].
     *
     * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<Fields> = fields

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [connection].
     *
     * Unlike [connection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("connection")
    @ExcludeMissing
    fun _connection(): JsonField<ApiConnection> = connection

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
         * Returns a mutable builder for constructing an instance of [ApiSingleConnectionAction].
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .actionTypeId()
         * .actionTypeVersion()
         * .fields()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiSingleConnectionAction]. */
    class Builder internal constructor() {

        private var actionId: JsonField<String>? = null
        private var actionTypeId: JsonField<String>? = null
        private var actionTypeVersion: JsonField<Int>? = null
        private var fields: JsonField<Fields>? = null
        private var type: JsonField<Type>? = null
        private var connection: JsonField<ApiConnection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiSingleConnectionAction: ApiSingleConnectionAction) = apply {
            actionId = apiSingleConnectionAction.actionId
            actionTypeId = apiSingleConnectionAction.actionTypeId
            actionTypeVersion = apiSingleConnectionAction.actionTypeVersion
            fields = apiSingleConnectionAction.fields
            type = apiSingleConnectionAction.type
            connection = apiSingleConnectionAction.connection
            additionalProperties = apiSingleConnectionAction.additionalProperties.toMutableMap()
        }

        /** The ID for this action. */
        fun actionId(actionId: String) = actionId(JsonField.of(actionId))

        /**
         * Sets [Builder.actionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actionId(actionId: JsonField<String>) = apply { this.actionId = actionId }

        /** The ID of the actionType to use. */
        fun actionTypeId(actionTypeId: String) = actionTypeId(JsonField.of(actionTypeId))

        /**
         * Sets [Builder.actionTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionTypeId(actionTypeId: JsonField<String>) = apply {
            this.actionTypeId = actionTypeId
        }

        /** The version of this actionType to use. */
        fun actionTypeVersion(actionTypeVersion: Int) =
            actionTypeVersion(JsonField.of(actionTypeVersion))

        /**
         * Sets [Builder.actionTypeVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionTypeVersion] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionTypeVersion(actionTypeVersion: JsonField<Int>) = apply {
            this.actionTypeVersion = actionTypeVersion
        }

        /** The fields to pass into this action. Different action types accept different fields. */
        fun fields(fields: Fields) = fields(JsonField.of(fields))

        /**
         * Sets [Builder.fields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fields] with a well-typed [Fields] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fields(fields: JsonField<Fields>) = apply { this.fields = fields }

        /**
         * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
         * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun connection(connection: ApiConnection) = connection(JsonField.of(connection))

        /**
         * Sets [Builder.connection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connection] with a well-typed [ApiConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connection(connection: JsonField<ApiConnection>) = apply {
            this.connection = connection
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
         * Returns an immutable instance of [ApiSingleConnectionAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .actionTypeId()
         * .actionTypeVersion()
         * .fields()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiSingleConnectionAction =
            ApiSingleConnectionAction(
                checkRequired("actionId", actionId),
                checkRequired("actionTypeId", actionTypeId),
                checkRequired("actionTypeVersion", actionTypeVersion),
                checkRequired("fields", fields),
                checkRequired("type", type),
                connection,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiSingleConnectionAction = apply {
        if (validated) {
            return@apply
        }

        actionId()
        actionTypeId()
        actionTypeVersion()
        fields().validate()
        type().validate()
        connection().ifPresent { it.validate() }
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
        (if (actionId.asKnown().isPresent) 1 else 0) +
            (if (actionTypeId.asKnown().isPresent) 1 else 0) +
            (if (actionTypeVersion.asKnown().isPresent) 1 else 0) +
            (fields.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (connection.asKnown().getOrNull()?.validity() ?: 0)

    /** The fields to pass into this action. Different action types accept different fields. */
    class Fields
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

            /** Returns a mutable builder for constructing an instance of [Fields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Fields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(fields: Fields) = apply {
                additionalProperties = fields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Fields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Fields = Fields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Fields = apply {
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

            return other is Fields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Fields{additionalProperties=$additionalProperties}"
    }

    /**
     * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
     * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SINGLE_CONNECTION = of("SINGLE_CONNECTION")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SINGLE_CONNECTION
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SINGLE_CONNECTION,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                SINGLE_CONNECTION -> Value.SINGLE_CONNECTION
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
                SINGLE_CONNECTION -> Known.SINGLE_CONNECTION
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiSingleConnectionAction &&
            actionId == other.actionId &&
            actionTypeId == other.actionTypeId &&
            actionTypeVersion == other.actionTypeVersion &&
            fields == other.fields &&
            type == other.type &&
            connection == other.connection &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionId,
            actionTypeId,
            actionTypeVersion,
            fields,
            type,
            connection,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiSingleConnectionAction{actionId=$actionId, actionTypeId=$actionTypeId, actionTypeVersion=$actionTypeVersion, fields=$fields, type=$type, connection=$connection, additionalProperties=$additionalProperties}"
}
