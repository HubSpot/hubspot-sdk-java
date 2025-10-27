// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicThread
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val associatedContactId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val inboxId: JsonField<String>,
    private val originalChannelAccountId: JsonField<String>,
    private val originalChannelId: JsonField<String>,
    private val spam: JsonField<Boolean>,
    private val status: JsonField<Status>,
    private val archived: JsonField<Boolean>,
    private val assignedTo: JsonField<String>,
    private val closedAt: JsonField<OffsetDateTime>,
    private val latestMessageReceivedTimestamp: JsonField<OffsetDateTime>,
    private val latestMessageSentTimestamp: JsonField<OffsetDateTime>,
    private val latestMessageTimestamp: JsonField<OffsetDateTime>,
    private val threadAssociations: JsonField<PublicThreadAssociations>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("associatedContactId")
        @ExcludeMissing
        associatedContactId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("inboxId") @ExcludeMissing inboxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originalChannelAccountId")
        @ExcludeMissing
        originalChannelAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originalChannelId")
        @ExcludeMissing
        originalChannelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spam") @ExcludeMissing spam: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("assignedTo")
        @ExcludeMissing
        assignedTo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("closedAt")
        @ExcludeMissing
        closedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latestMessageReceivedTimestamp")
        @ExcludeMissing
        latestMessageReceivedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latestMessageSentTimestamp")
        @ExcludeMissing
        latestMessageSentTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("latestMessageTimestamp")
        @ExcludeMissing
        latestMessageTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("threadAssociations")
        @ExcludeMissing
        threadAssociations: JsonField<PublicThreadAssociations> = JsonMissing.of(),
    ) : this(
        id,
        associatedContactId,
        createdAt,
        inboxId,
        originalChannelAccountId,
        originalChannelId,
        spam,
        status,
        archived,
        assignedTo,
        closedAt,
        latestMessageReceivedTimestamp,
        latestMessageSentTimestamp,
        latestMessageTimestamp,
        threadAssociations,
        mutableMapOf(),
    )

    /**
     * The unique ID of the thread.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The ID of the associated Contact in the CRM. If the Contact for the thread has not yet been
     * added or created, the `associatedContactId` returned will be a visitorID and cannot be used
     * to search for the Contact in the CRM.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun associatedContactId(): String = associatedContactId.getRequired("associatedContactId")

    /**
     * When the thread was created.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The ID of the conversations inbox containing the thread.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inboxId(): String = inboxId.getRequired("inboxId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalChannelAccountId(): String =
        originalChannelAccountId.getRequired("originalChannelAccountId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originalChannelId(): String = originalChannelId.getRequired("originalChannelId")

    /**
     * Whether the thread is marked as spam.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spam(): Boolean = spam.getRequired("spam")

    /**
     * The thread's status: `OPEN` or `CLOSED`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Whether this thread is archived.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun assignedTo(): Optional<String> = assignedTo.getOptional("assignedTo")

    /**
     * When the thread was closed. Only set if the thread is closed.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closedAt(): Optional<OffsetDateTime> = closedAt.getOptional("closedAt")

    /**
     * The time that the latest message was sent on the thread.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestMessageReceivedTimestamp(): Optional<OffsetDateTime> =
        latestMessageReceivedTimestamp.getOptional("latestMessageReceivedTimestamp")

    /**
     * The time that the latest message was sent on the thread.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestMessageSentTimestamp(): Optional<OffsetDateTime> =
        latestMessageSentTimestamp.getOptional("latestMessageSentTimestamp")

    /**
     * The time that the latest message was sent or received on the thread.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestMessageTimestamp(): Optional<OffsetDateTime> =
        latestMessageTimestamp.getOptional("latestMessageTimestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadAssociations(): Optional<PublicThreadAssociations> =
        threadAssociations.getOptional("threadAssociations")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [associatedContactId].
     *
     * Unlike [associatedContactId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("associatedContactId")
    @ExcludeMissing
    fun _associatedContactId(): JsonField<String> = associatedContactId

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
     * Returns the raw JSON value of [originalChannelAccountId].
     *
     * Unlike [originalChannelAccountId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originalChannelAccountId")
    @ExcludeMissing
    fun _originalChannelAccountId(): JsonField<String> = originalChannelAccountId

    /**
     * Returns the raw JSON value of [originalChannelId].
     *
     * Unlike [originalChannelId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originalChannelId")
    @ExcludeMissing
    fun _originalChannelId(): JsonField<String> = originalChannelId

    /**
     * Returns the raw JSON value of [spam].
     *
     * Unlike [spam], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spam") @ExcludeMissing fun _spam(): JsonField<Boolean> = spam

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [assignedTo].
     *
     * Unlike [assignedTo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("assignedTo") @ExcludeMissing fun _assignedTo(): JsonField<String> = assignedTo

    /**
     * Returns the raw JSON value of [closedAt].
     *
     * Unlike [closedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("closedAt") @ExcludeMissing fun _closedAt(): JsonField<OffsetDateTime> = closedAt

    /**
     * Returns the raw JSON value of [latestMessageReceivedTimestamp].
     *
     * Unlike [latestMessageReceivedTimestamp], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("latestMessageReceivedTimestamp")
    @ExcludeMissing
    fun _latestMessageReceivedTimestamp(): JsonField<OffsetDateTime> =
        latestMessageReceivedTimestamp

    /**
     * Returns the raw JSON value of [latestMessageSentTimestamp].
     *
     * Unlike [latestMessageSentTimestamp], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("latestMessageSentTimestamp")
    @ExcludeMissing
    fun _latestMessageSentTimestamp(): JsonField<OffsetDateTime> = latestMessageSentTimestamp

    /**
     * Returns the raw JSON value of [latestMessageTimestamp].
     *
     * Unlike [latestMessageTimestamp], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("latestMessageTimestamp")
    @ExcludeMissing
    fun _latestMessageTimestamp(): JsonField<OffsetDateTime> = latestMessageTimestamp

    /**
     * Returns the raw JSON value of [threadAssociations].
     *
     * Unlike [threadAssociations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("threadAssociations")
    @ExcludeMissing
    fun _threadAssociations(): JsonField<PublicThreadAssociations> = threadAssociations

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
         * Returns a mutable builder for constructing an instance of [PublicThread].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .associatedContactId()
         * .createdAt()
         * .inboxId()
         * .originalChannelAccountId()
         * .originalChannelId()
         * .spam()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicThread]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var associatedContactId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var inboxId: JsonField<String>? = null
        private var originalChannelAccountId: JsonField<String>? = null
        private var originalChannelId: JsonField<String>? = null
        private var spam: JsonField<Boolean>? = null
        private var status: JsonField<Status>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var assignedTo: JsonField<String> = JsonMissing.of()
        private var closedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var latestMessageReceivedTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var latestMessageSentTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var latestMessageTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var threadAssociations: JsonField<PublicThreadAssociations> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicThread: PublicThread) = apply {
            id = publicThread.id
            associatedContactId = publicThread.associatedContactId
            createdAt = publicThread.createdAt
            inboxId = publicThread.inboxId
            originalChannelAccountId = publicThread.originalChannelAccountId
            originalChannelId = publicThread.originalChannelId
            spam = publicThread.spam
            status = publicThread.status
            archived = publicThread.archived
            assignedTo = publicThread.assignedTo
            closedAt = publicThread.closedAt
            latestMessageReceivedTimestamp = publicThread.latestMessageReceivedTimestamp
            latestMessageSentTimestamp = publicThread.latestMessageSentTimestamp
            latestMessageTimestamp = publicThread.latestMessageTimestamp
            threadAssociations = publicThread.threadAssociations
            additionalProperties = publicThread.additionalProperties.toMutableMap()
        }

        /** The unique ID of the thread. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The ID of the associated Contact in the CRM. If the Contact for the thread has not yet
         * been added or created, the `associatedContactId` returned will be a visitorID and cannot
         * be used to search for the Contact in the CRM.
         */
        fun associatedContactId(associatedContactId: String) =
            associatedContactId(JsonField.of(associatedContactId))

        /**
         * Sets [Builder.associatedContactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associatedContactId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associatedContactId(associatedContactId: JsonField<String>) = apply {
            this.associatedContactId = associatedContactId
        }

        /** When the thread was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of the conversations inbox containing the thread. */
        fun inboxId(inboxId: String) = inboxId(JsonField.of(inboxId))

        /**
         * Sets [Builder.inboxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inboxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inboxId(inboxId: JsonField<String>) = apply { this.inboxId = inboxId }

        fun originalChannelAccountId(originalChannelAccountId: String) =
            originalChannelAccountId(JsonField.of(originalChannelAccountId))

        /**
         * Sets [Builder.originalChannelAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalChannelAccountId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originalChannelAccountId(originalChannelAccountId: JsonField<String>) = apply {
            this.originalChannelAccountId = originalChannelAccountId
        }

        fun originalChannelId(originalChannelId: String) =
            originalChannelId(JsonField.of(originalChannelId))

        /**
         * Sets [Builder.originalChannelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalChannelId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originalChannelId(originalChannelId: JsonField<String>) = apply {
            this.originalChannelId = originalChannelId
        }

        /** Whether the thread is marked as spam. */
        fun spam(spam: Boolean) = spam(JsonField.of(spam))

        /**
         * Sets [Builder.spam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spam] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spam(spam: JsonField<Boolean>) = apply { this.spam = spam }

        /** The thread's status: `OPEN` or `CLOSED`. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Whether this thread is archived. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun assignedTo(assignedTo: String) = assignedTo(JsonField.of(assignedTo))

        /**
         * Sets [Builder.assignedTo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.assignedTo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun assignedTo(assignedTo: JsonField<String>) = apply { this.assignedTo = assignedTo }

        /** When the thread was closed. Only set if the thread is closed. */
        fun closedAt(closedAt: OffsetDateTime) = closedAt(JsonField.of(closedAt))

        /**
         * Sets [Builder.closedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

        /** The time that the latest message was sent on the thread. */
        fun latestMessageReceivedTimestamp(latestMessageReceivedTimestamp: OffsetDateTime) =
            latestMessageReceivedTimestamp(JsonField.of(latestMessageReceivedTimestamp))

        /**
         * Sets [Builder.latestMessageReceivedTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestMessageReceivedTimestamp] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun latestMessageReceivedTimestamp(
            latestMessageReceivedTimestamp: JsonField<OffsetDateTime>
        ) = apply { this.latestMessageReceivedTimestamp = latestMessageReceivedTimestamp }

        /** The time that the latest message was sent on the thread. */
        fun latestMessageSentTimestamp(latestMessageSentTimestamp: OffsetDateTime) =
            latestMessageSentTimestamp(JsonField.of(latestMessageSentTimestamp))

        /**
         * Sets [Builder.latestMessageSentTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestMessageSentTimestamp] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun latestMessageSentTimestamp(latestMessageSentTimestamp: JsonField<OffsetDateTime>) =
            apply {
                this.latestMessageSentTimestamp = latestMessageSentTimestamp
            }

        /** The time that the latest message was sent or received on the thread. */
        fun latestMessageTimestamp(latestMessageTimestamp: OffsetDateTime) =
            latestMessageTimestamp(JsonField.of(latestMessageTimestamp))

        /**
         * Sets [Builder.latestMessageTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestMessageTimestamp] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun latestMessageTimestamp(latestMessageTimestamp: JsonField<OffsetDateTime>) = apply {
            this.latestMessageTimestamp = latestMessageTimestamp
        }

        fun threadAssociations(threadAssociations: PublicThreadAssociations) =
            threadAssociations(JsonField.of(threadAssociations))

        /**
         * Sets [Builder.threadAssociations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadAssociations] with a well-typed
         * [PublicThreadAssociations] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun threadAssociations(threadAssociations: JsonField<PublicThreadAssociations>) = apply {
            this.threadAssociations = threadAssociations
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
         * Returns an immutable instance of [PublicThread].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .associatedContactId()
         * .createdAt()
         * .inboxId()
         * .originalChannelAccountId()
         * .originalChannelId()
         * .spam()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicThread =
            PublicThread(
                checkRequired("id", id),
                checkRequired("associatedContactId", associatedContactId),
                checkRequired("createdAt", createdAt),
                checkRequired("inboxId", inboxId),
                checkRequired("originalChannelAccountId", originalChannelAccountId),
                checkRequired("originalChannelId", originalChannelId),
                checkRequired("spam", spam),
                checkRequired("status", status),
                archived,
                assignedTo,
                closedAt,
                latestMessageReceivedTimestamp,
                latestMessageSentTimestamp,
                latestMessageTimestamp,
                threadAssociations,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicThread = apply {
        if (validated) {
            return@apply
        }

        id()
        associatedContactId()
        createdAt()
        inboxId()
        originalChannelAccountId()
        originalChannelId()
        spam()
        status().validate()
        archived()
        assignedTo()
        closedAt()
        latestMessageReceivedTimestamp()
        latestMessageSentTimestamp()
        latestMessageTimestamp()
        threadAssociations().ifPresent { it.validate() }
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
            (if (associatedContactId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (inboxId.asKnown().isPresent) 1 else 0) +
            (if (originalChannelAccountId.asKnown().isPresent) 1 else 0) +
            (if (originalChannelId.asKnown().isPresent) 1 else 0) +
            (if (spam.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (assignedTo.asKnown().isPresent) 1 else 0) +
            (if (closedAt.asKnown().isPresent) 1 else 0) +
            (if (latestMessageReceivedTimestamp.asKnown().isPresent) 1 else 0) +
            (if (latestMessageSentTimestamp.asKnown().isPresent) 1 else 0) +
            (if (latestMessageTimestamp.asKnown().isPresent) 1 else 0) +
            (threadAssociations.asKnown().getOrNull()?.validity() ?: 0)

    /** The thread's status: `OPEN` or `CLOSED`. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPEN = of("OPEN")

            @JvmField val CLOSED = of("CLOSED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            OPEN,
            CLOSED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPEN,
            CLOSED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                OPEN -> Value.OPEN
                CLOSED -> Value.CLOSED
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
                OPEN -> Known.OPEN
                CLOSED -> Known.CLOSED
                else -> throw HubSpotInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicThread &&
            id == other.id &&
            associatedContactId == other.associatedContactId &&
            createdAt == other.createdAt &&
            inboxId == other.inboxId &&
            originalChannelAccountId == other.originalChannelAccountId &&
            originalChannelId == other.originalChannelId &&
            spam == other.spam &&
            status == other.status &&
            archived == other.archived &&
            assignedTo == other.assignedTo &&
            closedAt == other.closedAt &&
            latestMessageReceivedTimestamp == other.latestMessageReceivedTimestamp &&
            latestMessageSentTimestamp == other.latestMessageSentTimestamp &&
            latestMessageTimestamp == other.latestMessageTimestamp &&
            threadAssociations == other.threadAssociations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            associatedContactId,
            createdAt,
            inboxId,
            originalChannelAccountId,
            originalChannelId,
            spam,
            status,
            archived,
            assignedTo,
            closedAt,
            latestMessageReceivedTimestamp,
            latestMessageSentTimestamp,
            latestMessageTimestamp,
            threadAssociations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicThread{id=$id, associatedContactId=$associatedContactId, createdAt=$createdAt, inboxId=$inboxId, originalChannelAccountId=$originalChannelAccountId, originalChannelId=$originalChannelId, spam=$spam, status=$status, archived=$archived, assignedTo=$assignedTo, closedAt=$closedAt, latestMessageReceivedTimestamp=$latestMessageReceivedTimestamp, latestMessageSentTimestamp=$latestMessageSentTimestamp, latestMessageTimestamp=$latestMessageTimestamp, threadAssociations=$threadAssociations, additionalProperties=$additionalProperties}"
}
