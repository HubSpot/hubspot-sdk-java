// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ScopeMapping
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accessLevel: JsonField<AccessLevel>,
    private val requestAction: JsonField<RequestAction>,
    private val scopeName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accessLevel")
        @ExcludeMissing
        accessLevel: JsonField<AccessLevel> = JsonMissing.of(),
        @JsonProperty("requestAction")
        @ExcludeMissing
        requestAction: JsonField<RequestAction> = JsonMissing.of(),
        @JsonProperty("scopeName") @ExcludeMissing scopeName: JsonField<String> = JsonMissing.of(),
    ) : this(accessLevel, requestAction, scopeName, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accessLevel(): AccessLevel = accessLevel.getRequired("accessLevel")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestAction(): RequestAction = requestAction.getRequired("requestAction")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scopeName(): String = scopeName.getRequired("scopeName")

    /**
     * Returns the raw JSON value of [accessLevel].
     *
     * Unlike [accessLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accessLevel")
    @ExcludeMissing
    fun _accessLevel(): JsonField<AccessLevel> = accessLevel

    /**
     * Returns the raw JSON value of [requestAction].
     *
     * Unlike [requestAction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestAction")
    @ExcludeMissing
    fun _requestAction(): JsonField<RequestAction> = requestAction

    /**
     * Returns the raw JSON value of [scopeName].
     *
     * Unlike [scopeName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scopeName") @ExcludeMissing fun _scopeName(): JsonField<String> = scopeName

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
         * Returns a mutable builder for constructing an instance of [ScopeMapping].
         *
         * The following fields are required:
         * ```java
         * .accessLevel()
         * .requestAction()
         * .scopeName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScopeMapping]. */
    class Builder internal constructor() {

        private var accessLevel: JsonField<AccessLevel>? = null
        private var requestAction: JsonField<RequestAction>? = null
        private var scopeName: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(scopeMapping: ScopeMapping) = apply {
            accessLevel = scopeMapping.accessLevel
            requestAction = scopeMapping.requestAction
            scopeName = scopeMapping.scopeName
            additionalProperties = scopeMapping.additionalProperties.toMutableMap()
        }

        fun accessLevel(accessLevel: AccessLevel) = accessLevel(JsonField.of(accessLevel))

        /**
         * Sets [Builder.accessLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessLevel] with a well-typed [AccessLevel] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessLevel(accessLevel: JsonField<AccessLevel>) = apply {
            this.accessLevel = accessLevel
        }

        fun requestAction(requestAction: RequestAction) = requestAction(JsonField.of(requestAction))

        /**
         * Sets [Builder.requestAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestAction] with a well-typed [RequestAction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestAction(requestAction: JsonField<RequestAction>) = apply {
            this.requestAction = requestAction
        }

        fun scopeName(scopeName: String) = scopeName(JsonField.of(scopeName))

        /**
         * Sets [Builder.scopeName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scopeName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scopeName(scopeName: JsonField<String>) = apply { this.scopeName = scopeName }

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
         * Returns an immutable instance of [ScopeMapping].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accessLevel()
         * .requestAction()
         * .scopeName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScopeMapping =
            ScopeMapping(
                checkRequired("accessLevel", accessLevel),
                checkRequired("requestAction", requestAction),
                checkRequired("scopeName", scopeName),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScopeMapping = apply {
        if (validated) {
            return@apply
        }

        accessLevel().validate()
        requestAction().validate()
        scopeName()
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
        (accessLevel.asKnown().getOrNull()?.validity() ?: 0) +
            (requestAction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (scopeName.asKnown().isPresent) 1 else 0)

    class AccessLevel @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val ALL = of("ALL")

            @JvmField val OWNED = of("OWNED")

            @JvmField val TEAM_OWNED = of("TEAM_OWNED")

            @JvmField val UNASSIGNED = of("UNASSIGNED")

            @JvmStatic fun of(value: String) = AccessLevel(JsonField.of(value))
        }

        /** An enum containing [AccessLevel]'s known values. */
        enum class Known {
            ALL,
            OWNED,
            TEAM_OWNED,
            UNASSIGNED,
        }

        /**
         * An enum containing [AccessLevel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccessLevel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALL,
            OWNED,
            TEAM_OWNED,
            UNASSIGNED,
            /**
             * An enum member indicating that [AccessLevel] was instantiated with an unknown value.
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
                ALL -> Value.ALL
                OWNED -> Value.OWNED
                TEAM_OWNED -> Value.TEAM_OWNED
                UNASSIGNED -> Value.UNASSIGNED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ALL -> Known.ALL
                OWNED -> Known.OWNED
                TEAM_OWNED -> Known.TEAM_OWNED
                UNASSIGNED -> Known.UNASSIGNED
                else -> throw HubspotInvalidDataException("Unknown AccessLevel: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): AccessLevel = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is AccessLevel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RequestAction @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val COMMUNICATE = of("COMMUNICATE")

            @JvmField val DELETE = of("DELETE")

            @JvmField val EDIT = of("EDIT")

            @JvmField val EDIT_ASSOCIATION = of("EDIT_ASSOCIATION")

            @JvmField val MERGE = of("MERGE")

            @JvmField val VIEW = of("VIEW")

            @JvmStatic fun of(value: String) = RequestAction(JsonField.of(value))
        }

        /** An enum containing [RequestAction]'s known values. */
        enum class Known {
            COMMUNICATE,
            DELETE,
            EDIT,
            EDIT_ASSOCIATION,
            MERGE,
            VIEW,
        }

        /**
         * An enum containing [RequestAction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RequestAction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMMUNICATE,
            DELETE,
            EDIT,
            EDIT_ASSOCIATION,
            MERGE,
            VIEW,
            /**
             * An enum member indicating that [RequestAction] was instantiated with an unknown
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
                COMMUNICATE -> Value.COMMUNICATE
                DELETE -> Value.DELETE
                EDIT -> Value.EDIT
                EDIT_ASSOCIATION -> Value.EDIT_ASSOCIATION
                MERGE -> Value.MERGE
                VIEW -> Value.VIEW
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                COMMUNICATE -> Known.COMMUNICATE
                DELETE -> Known.DELETE
                EDIT -> Known.EDIT
                EDIT_ASSOCIATION -> Known.EDIT_ASSOCIATION
                MERGE -> Known.MERGE
                VIEW -> Known.VIEW
                else -> throw HubspotInvalidDataException("Unknown RequestAction: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): RequestAction = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is RequestAction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScopeMapping &&
            accessLevel == other.accessLevel &&
            requestAction == other.requestAction &&
            scopeName == other.scopeName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accessLevel, requestAction, scopeName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScopeMapping{accessLevel=$accessLevel, requestAction=$requestAction, scopeName=$scopeName, additionalProperties=$additionalProperties}"
}
