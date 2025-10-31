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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiListBranchAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionId: JsonField<String>,
    private val listBranches: JsonField<List<ApiListBranch>>,
    private val type: JsonField<Type>,
    private val defaultBranch: JsonField<ApiConnection>,
    private val defaultBranchName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionId") @ExcludeMissing actionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("listBranches")
        @ExcludeMissing
        listBranches: JsonField<List<ApiListBranch>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("defaultBranch")
        @ExcludeMissing
        defaultBranch: JsonField<ApiConnection> = JsonMissing.of(),
        @JsonProperty("defaultBranchName")
        @ExcludeMissing
        defaultBranchName: JsonField<String> = JsonMissing.of(),
    ) : this(actionId, listBranches, type, defaultBranch, defaultBranchName, mutableMapOf())

    /**
     * The ID for this action.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionId(): String = actionId.getRequired("actionId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listBranches(): List<ApiListBranch> = listBranches.getRequired("listBranches")

    /**
     * The type of action this is, can be: "STATIC_BRANCH", "LIST_BRANCH", "AB_TEST_BRANCH",
     * "CUSTOM_CODE", "WEBHOOK", or "SINGLE_CONNECTION"
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultBranch(): Optional<ApiConnection> = defaultBranch.getOptional("defaultBranch")

    /**
     * The name of the default branch, the branch that gets executed if the object does not match
     * any of the `listBranch` criteria.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultBranchName(): Optional<String> = defaultBranchName.getOptional("defaultBranchName")

    /**
     * Returns the raw JSON value of [actionId].
     *
     * Unlike [actionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionId") @ExcludeMissing fun _actionId(): JsonField<String> = actionId

    /**
     * Returns the raw JSON value of [listBranches].
     *
     * Unlike [listBranches], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("listBranches")
    @ExcludeMissing
    fun _listBranches(): JsonField<List<ApiListBranch>> = listBranches

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [defaultBranch].
     *
     * Unlike [defaultBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaultBranch")
    @ExcludeMissing
    fun _defaultBranch(): JsonField<ApiConnection> = defaultBranch

    /**
     * Returns the raw JSON value of [defaultBranchName].
     *
     * Unlike [defaultBranchName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("defaultBranchName")
    @ExcludeMissing
    fun _defaultBranchName(): JsonField<String> = defaultBranchName

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
         * Returns a mutable builder for constructing an instance of [ApiListBranchAction].
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .listBranches()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiListBranchAction]. */
    class Builder internal constructor() {

        private var actionId: JsonField<String>? = null
        private var listBranches: JsonField<MutableList<ApiListBranch>>? = null
        private var type: JsonField<Type>? = null
        private var defaultBranch: JsonField<ApiConnection> = JsonMissing.of()
        private var defaultBranchName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiListBranchAction: ApiListBranchAction) = apply {
            actionId = apiListBranchAction.actionId
            listBranches = apiListBranchAction.listBranches.map { it.toMutableList() }
            type = apiListBranchAction.type
            defaultBranch = apiListBranchAction.defaultBranch
            defaultBranchName = apiListBranchAction.defaultBranchName
            additionalProperties = apiListBranchAction.additionalProperties.toMutableMap()
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

        fun listBranches(listBranches: List<ApiListBranch>) =
            listBranches(JsonField.of(listBranches))

        /**
         * Sets [Builder.listBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listBranches] with a well-typed `List<ApiListBranch>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun listBranches(listBranches: JsonField<List<ApiListBranch>>) = apply {
            this.listBranches = listBranches.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiListBranch] to [listBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListBranch(listBranch: ApiListBranch) = apply {
            listBranches =
                (listBranches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("listBranches", it).add(listBranch)
                }
        }

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

        fun defaultBranch(defaultBranch: ApiConnection) = defaultBranch(JsonField.of(defaultBranch))

        /**
         * Sets [Builder.defaultBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultBranch] with a well-typed [ApiConnection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultBranch(defaultBranch: JsonField<ApiConnection>) = apply {
            this.defaultBranch = defaultBranch
        }

        /**
         * The name of the default branch, the branch that gets executed if the object does not
         * match any of the `listBranch` criteria.
         */
        fun defaultBranchName(defaultBranchName: String) =
            defaultBranchName(JsonField.of(defaultBranchName))

        /**
         * Sets [Builder.defaultBranchName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultBranchName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultBranchName(defaultBranchName: JsonField<String>) = apply {
            this.defaultBranchName = defaultBranchName
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
         * Returns an immutable instance of [ApiListBranchAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionId()
         * .listBranches()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiListBranchAction =
            ApiListBranchAction(
                checkRequired("actionId", actionId),
                checkRequired("listBranches", listBranches).map { it.toImmutable() },
                checkRequired("type", type),
                defaultBranch,
                defaultBranchName,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiListBranchAction = apply {
        if (validated) {
            return@apply
        }

        actionId()
        listBranches().forEach { it.validate() }
        type().validate()
        defaultBranch().ifPresent { it.validate() }
        defaultBranchName()
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
        (if (actionId.asKnown().isPresent) 1 else 0) +
            (listBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (defaultBranch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultBranchName.asKnown().isPresent) 1 else 0)

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

            @JvmField val LIST_BRANCH = of("LIST_BRANCH")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            LIST_BRANCH
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
            LIST_BRANCH,
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
                LIST_BRANCH -> Value.LIST_BRANCH
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
                LIST_BRANCH -> Known.LIST_BRANCH
                else -> throw HubspotInvalidDataException("Unknown Type: $value")
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiListBranchAction &&
            actionId == other.actionId &&
            listBranches == other.listBranches &&
            type == other.type &&
            defaultBranch == other.defaultBranch &&
            defaultBranchName == other.defaultBranchName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionId,
            listBranches,
            type,
            defaultBranch,
            defaultBranchName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiListBranchAction{actionId=$actionId, listBranches=$listBranches, type=$type, defaultBranch=$defaultBranch, defaultBranchName=$defaultBranchName, additionalProperties=$additionalProperties}"
}
