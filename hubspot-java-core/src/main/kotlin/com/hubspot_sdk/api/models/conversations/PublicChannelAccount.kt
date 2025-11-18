// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

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

class PublicChannelAccount
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val active: JsonField<Boolean>,
    private val archived: JsonField<Boolean>,
    private val authorized: JsonField<Boolean>,
    private val channelId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val inboxId: JsonField<String>,
    private val name: JsonField<String>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("authorized")
        @ExcludeMissing
        authorized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("channelId") @ExcludeMissing channelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inboxId") @ExcludeMissing inboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archivedAt")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
    ) : this(
        id,
        active,
        archived,
        authorized,
        channelId,
        createdAt,
        inboxId,
        name,
        archivedAt,
        deliveryIdentifier,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun active(): Boolean = active.getRequired("active")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authorized(): Boolean = authorized.getRequired("authorized")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channelId(): String = channelId.getRequired("channelId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inboxId(): String = inboxId.getRequired("inboxId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archivedAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deliveryIdentifier(): Optional<PublicDeliveryIdentifier> =
        deliveryIdentifier.getOptional("deliveryIdentifier")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [active].
     *
     * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [authorized].
     *
     * Unlike [authorized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /**
     * Returns the raw JSON value of [channelId].
     *
     * Unlike [channelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channelId") @ExcludeMissing fun _channelId(): JsonField<String> = channelId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [inboxId].
     *
     * Unlike [inboxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inboxId") @ExcludeMissing fun _inboxId(): JsonField<String> = inboxId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivedAt")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [deliveryIdentifier].
     *
     * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deliveryIdentifier")
    @ExcludeMissing
    fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = deliveryIdentifier

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
         * Returns a mutable builder for constructing an instance of [PublicChannelAccount].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .active()
         * .archived()
         * .authorized()
         * .channelId()
         * .createdAt()
         * .inboxId()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicChannelAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var active: JsonField<Boolean>? = null
        private var archived: JsonField<Boolean>? = null
        private var authorized: JsonField<Boolean>? = null
        private var channelId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var inboxId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicChannelAccount: PublicChannelAccount) = apply {
            id = publicChannelAccount.id
            active = publicChannelAccount.active
            archived = publicChannelAccount.archived
            authorized = publicChannelAccount.authorized
            channelId = publicChannelAccount.channelId
            createdAt = publicChannelAccount.createdAt
            inboxId = publicChannelAccount.inboxId
            name = publicChannelAccount.name
            archivedAt = publicChannelAccount.archivedAt
            deliveryIdentifier = publicChannelAccount.deliveryIdentifier
            additionalProperties = publicChannelAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * Sets [Builder.active] to an arbitrary JSON value.
         *
         * You should usually call [Builder.active] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * Sets [Builder.authorized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        fun channelId(channelId: String) = channelId(JsonField.of(channelId))

        /**
         * Sets [Builder.channelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelId(channelId: JsonField<String>) = apply { this.channelId = channelId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun inboxId(inboxId: String) = inboxId(JsonField.of(inboxId))

        /**
         * Sets [Builder.inboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inboxId(inboxId: JsonField<String>) = apply { this.inboxId = inboxId }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        fun deliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) =
            deliveryIdentifier(JsonField.of(deliveryIdentifier))

        /**
         * Sets [Builder.deliveryIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryIdentifier] with a well-typed
         * [PublicDeliveryIdentifier] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun deliveryIdentifier(deliveryIdentifier: JsonField<PublicDeliveryIdentifier>) = apply {
            this.deliveryIdentifier = deliveryIdentifier
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
         * Returns an immutable instance of [PublicChannelAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .active()
         * .archived()
         * .authorized()
         * .channelId()
         * .createdAt()
         * .inboxId()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicChannelAccount =
            PublicChannelAccount(
                checkRequired("id", id),
                checkRequired("active", active),
                checkRequired("archived", archived),
                checkRequired("authorized", authorized),
                checkRequired("channelId", channelId),
                checkRequired("createdAt", createdAt),
                checkRequired("inboxId", inboxId),
                checkRequired("name", name),
                archivedAt,
                deliveryIdentifier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicChannelAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        active()
        archived()
        authorized()
        channelId()
        createdAt()
        inboxId()
        name()
        archivedAt()
        deliveryIdentifier().ifPresent { it.validate() }
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
            (if (active.asKnown().isPresent) 1 else 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (authorized.asKnown().isPresent) 1 else 0) +
            (if (channelId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (inboxId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicChannelAccount &&
            id == other.id &&
            active == other.active &&
            archived == other.archived &&
            authorized == other.authorized &&
            channelId == other.channelId &&
            createdAt == other.createdAt &&
            inboxId == other.inboxId &&
            name == other.name &&
            archivedAt == other.archivedAt &&
            deliveryIdentifier == other.deliveryIdentifier &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            active,
            archived,
            authorized,
            channelId,
            createdAt,
            inboxId,
            name,
            archivedAt,
            deliveryIdentifier,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicChannelAccount{id=$id, active=$active, archived=$archived, authorized=$authorized, channelId=$channelId, createdAt=$createdAt, inboxId=$inboxId, name=$name, archivedAt=$archivedAt, deliveryIdentifier=$deliveryIdentifier, additionalProperties=$additionalProperties}"
}
