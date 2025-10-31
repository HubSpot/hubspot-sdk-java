// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicApiUserActionEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actingUser: JsonField<ActingUser>,
    private val action: JsonField<String>,
    private val category: JsonField<String>,
    private val occurredAt: JsonField<OffsetDateTime>,
    private val subCategory: JsonField<String>,
    private val targetObjectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actingUser")
        @ExcludeMissing
        actingUser: JsonField<ActingUser> = JsonMissing.of(),
        @JsonProperty("action") @ExcludeMissing action: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("occurredAt")
        @ExcludeMissing
        occurredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subCategory")
        @ExcludeMissing
        subCategory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("targetObjectId")
        @ExcludeMissing
        targetObjectId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        actingUser,
        action,
        category,
        occurredAt,
        subCategory,
        targetObjectId,
        mutableMapOf(),
    )

    /**
     * The unique ID of the activity.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actingUser(): ActingUser = actingUser.getRequired("actingUser")

    /**
     * The type of action taken.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): String = action.getRequired("action")

    /**
     * The category of the activity.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): String = category.getRequired("category")

    /**
     * The time that the action occurred at.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun occurredAt(): OffsetDateTime = occurredAt.getRequired("occurredAt")

    /**
     * The subcategory of the activity.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subCategory(): Optional<String> = subCategory.getOptional("subCategory")

    /**
     * The ID of the impacted object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetObjectId(): Optional<String> = targetObjectId.getOptional("targetObjectId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actingUser].
     *
     * Unlike [actingUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actingUser")
    @ExcludeMissing
    fun _actingUser(): JsonField<ActingUser> = actingUser

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [occurredAt].
     *
     * Unlike [occurredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("occurredAt")
    @ExcludeMissing
    fun _occurredAt(): JsonField<OffsetDateTime> = occurredAt

    /**
     * Returns the raw JSON value of [subCategory].
     *
     * Unlike [subCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subCategory") @ExcludeMissing fun _subCategory(): JsonField<String> = subCategory

    /**
     * Returns the raw JSON value of [targetObjectId].
     *
     * Unlike [targetObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("targetObjectId")
    @ExcludeMissing
    fun _targetObjectId(): JsonField<String> = targetObjectId

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
         * Returns a mutable builder for constructing an instance of [PublicApiUserActionEvent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actingUser()
         * .action()
         * .category()
         * .occurredAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicApiUserActionEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var actingUser: JsonField<ActingUser>? = null
        private var action: JsonField<String>? = null
        private var category: JsonField<String>? = null
        private var occurredAt: JsonField<OffsetDateTime>? = null
        private var subCategory: JsonField<String> = JsonMissing.of()
        private var targetObjectId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicApiUserActionEvent: PublicApiUserActionEvent) = apply {
            id = publicApiUserActionEvent.id
            actingUser = publicApiUserActionEvent.actingUser
            action = publicApiUserActionEvent.action
            category = publicApiUserActionEvent.category
            occurredAt = publicApiUserActionEvent.occurredAt
            subCategory = publicApiUserActionEvent.subCategory
            targetObjectId = publicApiUserActionEvent.targetObjectId
            additionalProperties = publicApiUserActionEvent.additionalProperties.toMutableMap()
        }

        /** The unique ID of the activity. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun actingUser(actingUser: ActingUser) = actingUser(JsonField.of(actingUser))

        /**
         * Sets [Builder.actingUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actingUser] with a well-typed [ActingUser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actingUser(actingUser: JsonField<ActingUser>) = apply { this.actingUser = actingUser }

        /** The type of action taken. */
        fun action(action: String) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<String>) = apply { this.action = action }

        /** The category of the activity. */
        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        /** The time that the action occurred at. */
        fun occurredAt(occurredAt: OffsetDateTime) = occurredAt(JsonField.of(occurredAt))

        /**
         * Sets [Builder.occurredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.occurredAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun occurredAt(occurredAt: JsonField<OffsetDateTime>) = apply {
            this.occurredAt = occurredAt
        }

        /** The subcategory of the activity. */
        fun subCategory(subCategory: String) = subCategory(JsonField.of(subCategory))

        /**
         * Sets [Builder.subCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subCategory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun subCategory(subCategory: JsonField<String>) = apply { this.subCategory = subCategory }

        /** The ID of the impacted object. */
        fun targetObjectId(targetObjectId: String) = targetObjectId(JsonField.of(targetObjectId))

        /**
         * Sets [Builder.targetObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetObjectId(targetObjectId: JsonField<String>) = apply {
            this.targetObjectId = targetObjectId
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
         * Returns an immutable instance of [PublicApiUserActionEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actingUser()
         * .action()
         * .category()
         * .occurredAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicApiUserActionEvent =
            PublicApiUserActionEvent(
                checkRequired("id", id),
                checkRequired("actingUser", actingUser),
                checkRequired("action", action),
                checkRequired("category", category),
                checkRequired("occurredAt", occurredAt),
                subCategory,
                targetObjectId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicApiUserActionEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        actingUser().validate()
        action()
        category()
        occurredAt()
        subCategory()
        targetObjectId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (actingUser.asKnown().getOrNull()?.validity() ?: 0) +
            (if (action.asKnown().isPresent) 1 else 0) +
            (if (category.asKnown().isPresent) 1 else 0) +
            (if (occurredAt.asKnown().isPresent) 1 else 0) +
            (if (subCategory.asKnown().isPresent) 1 else 0) +
            (if (targetObjectId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicApiUserActionEvent &&
            id == other.id &&
            actingUser == other.actingUser &&
            action == other.action &&
            category == other.category &&
            occurredAt == other.occurredAt &&
            subCategory == other.subCategory &&
            targetObjectId == other.targetObjectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actingUser,
            action,
            category,
            occurredAt,
            subCategory,
            targetObjectId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicApiUserActionEvent{id=$id, actingUser=$actingUser, action=$action, category=$category, occurredAt=$occurredAt, subCategory=$subCategory, targetObjectId=$targetObjectId, additionalProperties=$additionalProperties}"
}
