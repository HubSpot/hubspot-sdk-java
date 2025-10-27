// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

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
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import com.hubspot_sdk.api.models.conversations.PublicClient
import com.hubspot_sdk.api.models.conversations.PublicContact
import com.hubspot_sdk.api.models.conversations.PublicFile
import com.hubspot_sdk.api.models.conversations.PublicLocation
import com.hubspot_sdk.api.models.conversations.PublicMessageHeader
import com.hubspot_sdk.api.models.conversations.PublicMessageStatus
import com.hubspot_sdk.api.models.conversations.PublicQuickReplies
import com.hubspot_sdk.api.models.conversations.PublicRecipient
import com.hubspot_sdk.api.models.conversations.PublicSender
import com.hubspot_sdk.api.models.conversations.PublicSocialMetadataAttachment
import com.hubspot_sdk.api.models.conversations.PublicUnsupportedContent
import com.hubspot_sdk.api.models.conversations.PublicWhatsAppTemplateMetadata
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicConversationsMessage
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val attachments: JsonField<List<Attachment>>,
    private val channelAccountId: JsonField<String>,
    private val channelId: JsonField<String>,
    private val client: JsonField<PublicClient>,
    private val conversationsThreadId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val recipients: JsonField<List<PublicRecipient>>,
    private val senders: JsonField<List<PublicSender>>,
    private val text: JsonField<String>,
    private val truncationStatus: JsonField<TruncationStatus>,
    private val type: JsonField<Type>,
    private val inReplyToId: JsonField<String>,
    private val richText: JsonField<String>,
    private val status: JsonField<PublicMessageStatus>,
    private val subject: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("attachments")
        @ExcludeMissing
        attachments: JsonField<List<Attachment>> = JsonMissing.of(),
        @JsonProperty("channelAccountId")
        @ExcludeMissing
        channelAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channelId") @ExcludeMissing channelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("client") @ExcludeMissing client: JsonField<PublicClient> = JsonMissing.of(),
        @JsonProperty("conversationsThreadId")
        @ExcludeMissing
        conversationsThreadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("recipients")
        @ExcludeMissing
        recipients: JsonField<List<PublicRecipient>> = JsonMissing.of(),
        @JsonProperty("senders")
        @ExcludeMissing
        senders: JsonField<List<PublicSender>> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("truncationStatus")
        @ExcludeMissing
        truncationStatus: JsonField<TruncationStatus> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("inReplyToId")
        @ExcludeMissing
        inReplyToId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("richText") @ExcludeMissing richText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PublicMessageStatus> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        attachments,
        channelAccountId,
        channelId,
        client,
        conversationsThreadId,
        createdAt,
        createdBy,
        direction,
        recipients,
        senders,
        text,
        truncationStatus,
        type,
        inReplyToId,
        richText,
        status,
        subject,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attachments(): List<Attachment> = attachments.getRequired("attachments")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channelAccountId(): String = channelAccountId.getRequired("channelAccountId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channelId(): String = channelId.getRequired("channelId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun client(): PublicClient = client.getRequired("client")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conversationsThreadId(): String = conversationsThreadId.getRequired("conversationsThreadId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): String = createdBy.getRequired("createdBy")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipients(): List<PublicRecipient> = recipients.getRequired("recipients")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senders(): List<PublicSender> = senders.getRequired("senders")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun truncationStatus(): TruncationStatus = truncationStatus.getRequired("truncationStatus")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inReplyToId(): Optional<String> = inReplyToId.getOptional("inReplyToId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun richText(): Optional<String> = richText.getOptional("richText")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<PublicMessageStatus> = status.getOptional("status")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attachments")
    @ExcludeMissing
    fun _attachments(): JsonField<List<Attachment>> = attachments

    /**
     * Returns the raw JSON value of [channelAccountId].
     *
     * Unlike [channelAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("channelAccountId")
    @ExcludeMissing
    fun _channelAccountId(): JsonField<String> = channelAccountId

    /**
     * Returns the raw JSON value of [channelId].
     *
     * Unlike [channelId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channelId") @ExcludeMissing fun _channelId(): JsonField<String> = channelId

    /**
     * Returns the raw JSON value of [client].
     *
     * Unlike [client], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("client") @ExcludeMissing fun _client(): JsonField<PublicClient> = client

    /**
     * Returns the raw JSON value of [conversationsThreadId].
     *
     * Unlike [conversationsThreadId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("conversationsThreadId")
    @ExcludeMissing
    fun _conversationsThreadId(): JsonField<String> = conversationsThreadId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [recipients].
     *
     * Unlike [recipients], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipients")
    @ExcludeMissing
    fun _recipients(): JsonField<List<PublicRecipient>> = recipients

    /**
     * Returns the raw JSON value of [senders].
     *
     * Unlike [senders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senders") @ExcludeMissing fun _senders(): JsonField<List<PublicSender>> = senders

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

    /**
     * Returns the raw JSON value of [truncationStatus].
     *
     * Unlike [truncationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("truncationStatus")
    @ExcludeMissing
    fun _truncationStatus(): JsonField<TruncationStatus> = truncationStatus

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [inReplyToId].
     *
     * Unlike [inReplyToId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inReplyToId") @ExcludeMissing fun _inReplyToId(): JsonField<String> = inReplyToId

    /**
     * Returns the raw JSON value of [richText].
     *
     * Unlike [richText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("richText") @ExcludeMissing fun _richText(): JsonField<String> = richText

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PublicMessageStatus> = status

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

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
         * Returns a mutable builder for constructing an instance of [PublicConversationsMessage].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .attachments()
         * .channelAccountId()
         * .channelId()
         * .client()
         * .conversationsThreadId()
         * .createdAt()
         * .createdBy()
         * .direction()
         * .recipients()
         * .senders()
         * .text()
         * .truncationStatus()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicConversationsMessage]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean>? = null
        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var channelAccountId: JsonField<String>? = null
        private var channelId: JsonField<String>? = null
        private var client: JsonField<PublicClient>? = null
        private var conversationsThreadId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var recipients: JsonField<MutableList<PublicRecipient>>? = null
        private var senders: JsonField<MutableList<PublicSender>>? = null
        private var text: JsonField<String>? = null
        private var truncationStatus: JsonField<TruncationStatus>? = null
        private var type: JsonField<Type>? = null
        private var inReplyToId: JsonField<String> = JsonMissing.of()
        private var richText: JsonField<String> = JsonMissing.of()
        private var status: JsonField<PublicMessageStatus> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicConversationsMessage: PublicConversationsMessage) = apply {
            id = publicConversationsMessage.id
            archived = publicConversationsMessage.archived
            attachments = publicConversationsMessage.attachments.map { it.toMutableList() }
            channelAccountId = publicConversationsMessage.channelAccountId
            channelId = publicConversationsMessage.channelId
            client = publicConversationsMessage.client
            conversationsThreadId = publicConversationsMessage.conversationsThreadId
            createdAt = publicConversationsMessage.createdAt
            createdBy = publicConversationsMessage.createdBy
            direction = publicConversationsMessage.direction
            recipients = publicConversationsMessage.recipients.map { it.toMutableList() }
            senders = publicConversationsMessage.senders.map { it.toMutableList() }
            text = publicConversationsMessage.text
            truncationStatus = publicConversationsMessage.truncationStatus
            type = publicConversationsMessage.type
            inReplyToId = publicConversationsMessage.inReplyToId
            richText = publicConversationsMessage.richText
            status = publicConversationsMessage.status
            subject = publicConversationsMessage.subject
            updatedAt = publicConversationsMessage.updatedAt
            additionalProperties = publicConversationsMessage.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            this.attachments = attachments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply {
            attachments =
                (attachments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attachments", it).add(attachment)
                }
        }

        /** Alias for calling [addAttachment] with `Attachment.ofPublicFile(publicFile)`. */
        fun addAttachment(publicFile: PublicFile) =
            addAttachment(Attachment.ofPublicFile(publicFile))

        /** Alias for calling [addAttachment] with `Attachment.ofPublicLocation(publicLocation)`. */
        fun addAttachment(publicLocation: PublicLocation) =
            addAttachment(Attachment.ofPublicLocation(publicLocation))

        /** Alias for calling [addAttachment] with `Attachment.ofPublicContact(publicContact)`. */
        fun addAttachment(publicContact: PublicContact) =
            addAttachment(Attachment.ofPublicContact(publicContact))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicUnsupportedContent(publicUnsupportedContent)`.
         */
        fun addAttachment(publicUnsupportedContent: PublicUnsupportedContent) =
            addAttachment(Attachment.ofPublicUnsupportedContent(publicUnsupportedContent))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicMessageHeader(publicMessageHeader)`.
         */
        fun addAttachment(publicMessageHeader: PublicMessageHeader) =
            addAttachment(Attachment.ofPublicMessageHeader(publicMessageHeader))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicQuickReplies(publicQuickReplies)`.
         */
        fun addAttachment(publicQuickReplies: PublicQuickReplies) =
            addAttachment(Attachment.ofPublicQuickReplies(publicQuickReplies))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicWhatsAppTemplateMetadata(publicWhatsAppTemplateMetadata)`.
         */
        fun addAttachment(publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata) =
            addAttachment(
                Attachment.ofPublicWhatsAppTemplateMetadata(publicWhatsAppTemplateMetadata)
            )

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicSocialMetadata(publicSocialMetadata)`.
         */
        fun addAttachment(publicSocialMetadata: PublicSocialMetadataAttachment) =
            addAttachment(Attachment.ofPublicSocialMetadata(publicSocialMetadata))

        fun channelAccountId(channelAccountId: String) =
            channelAccountId(JsonField.of(channelAccountId))

        /**
         * Sets [Builder.channelAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelAccountId(channelAccountId: JsonField<String>) = apply {
            this.channelAccountId = channelAccountId
        }

        fun channelId(channelId: String) = channelId(JsonField.of(channelId))

        /**
         * Sets [Builder.channelId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun channelId(channelId: JsonField<String>) = apply { this.channelId = channelId }

        fun client(client: PublicClient) = client(JsonField.of(client))

        /**
         * Sets [Builder.client] to an arbitrary JSON value.
         *
         * You should usually call [Builder.client] with a well-typed [PublicClient] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun client(client: JsonField<PublicClient>) = apply { this.client = client }

        fun conversationsThreadId(conversationsThreadId: String) =
            conversationsThreadId(JsonField.of(conversationsThreadId))

        /**
         * Sets [Builder.conversationsThreadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationsThreadId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationsThreadId(conversationsThreadId: JsonField<String>) = apply {
            this.conversationsThreadId = conversationsThreadId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        fun recipients(recipients: List<PublicRecipient>) = recipients(JsonField.of(recipients))

        /**
         * Sets [Builder.recipients] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipients] with a well-typed `List<PublicRecipient>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipients(recipients: JsonField<List<PublicRecipient>>) = apply {
            this.recipients = recipients.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicRecipient] to [recipients].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecipient(recipient: PublicRecipient) = apply {
            recipients =
                (recipients ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recipients", it).add(recipient)
                }
        }

        fun senders(senders: List<PublicSender>) = senders(JsonField.of(senders))

        /**
         * Sets [Builder.senders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senders] with a well-typed `List<PublicSender>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senders(senders: JsonField<List<PublicSender>>) = apply {
            this.senders = senders.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicSender] to [senders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSender(sender: PublicSender) = apply {
            senders =
                (senders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senders", it).add(sender)
                }
        }

        fun text(text: String) = text(JsonField.of(text))

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { this.text = text }

        fun truncationStatus(truncationStatus: TruncationStatus) =
            truncationStatus(JsonField.of(truncationStatus))

        /**
         * Sets [Builder.truncationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.truncationStatus] with a well-typed [TruncationStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun truncationStatus(truncationStatus: JsonField<TruncationStatus>) = apply {
            this.truncationStatus = truncationStatus
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun inReplyToId(inReplyToId: String) = inReplyToId(JsonField.of(inReplyToId))

        /**
         * Sets [Builder.inReplyToId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inReplyToId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inReplyToId(inReplyToId: JsonField<String>) = apply { this.inReplyToId = inReplyToId }

        fun richText(richText: String) = richText(JsonField.of(richText))

        /**
         * Sets [Builder.richText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun richText(richText: JsonField<String>) = apply { this.richText = richText }

        fun status(status: PublicMessageStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PublicMessageStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PublicMessageStatus>) = apply { this.status = status }

        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

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
         * Returns an immutable instance of [PublicConversationsMessage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .attachments()
         * .channelAccountId()
         * .channelId()
         * .client()
         * .conversationsThreadId()
         * .createdAt()
         * .createdBy()
         * .direction()
         * .recipients()
         * .senders()
         * .text()
         * .truncationStatus()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicConversationsMessage =
            PublicConversationsMessage(
                checkRequired("id", id),
                checkRequired("archived", archived),
                checkRequired("attachments", attachments).map { it.toImmutable() },
                checkRequired("channelAccountId", channelAccountId),
                checkRequired("channelId", channelId),
                checkRequired("client", client),
                checkRequired("conversationsThreadId", conversationsThreadId),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("direction", direction),
                checkRequired("recipients", recipients).map { it.toImmutable() },
                checkRequired("senders", senders).map { it.toImmutable() },
                checkRequired("text", text),
                checkRequired("truncationStatus", truncationStatus),
                checkRequired("type", type),
                inReplyToId,
                richText,
                status,
                subject,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicConversationsMessage = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        attachments().forEach { it.validate() }
        channelAccountId()
        channelId()
        client().validate()
        conversationsThreadId()
        createdAt()
        createdBy()
        direction().validate()
        recipients().forEach { it.validate() }
        senders().forEach { it.validate() }
        text()
        truncationStatus().validate()
        type().validate()
        inReplyToId()
        richText()
        status().ifPresent { it.validate() }
        subject()
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
            (if (archived.asKnown().isPresent) 1 else 0) +
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (channelAccountId.asKnown().isPresent) 1 else 0) +
            (if (channelId.asKnown().isPresent) 1 else 0) +
            (client.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conversationsThreadId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (recipients.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (senders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (truncationStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (inReplyToId.asKnown().isPresent) 1 else 0) +
            (if (richText.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subject.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Attachment.Deserializer::class)
    @JsonSerialize(using = Attachment.Serializer::class)
    class Attachment
    private constructor(
        private val publicFile: PublicFile? = null,
        private val publicLocation: PublicLocation? = null,
        private val publicContact: PublicContact? = null,
        private val publicUnsupportedContent: PublicUnsupportedContent? = null,
        private val publicMessageHeader: PublicMessageHeader? = null,
        private val publicQuickReplies: PublicQuickReplies? = null,
        private val publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata? = null,
        private val publicSocialMetadata: PublicSocialMetadataAttachment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicFile(): Optional<PublicFile> = Optional.ofNullable(publicFile)

        fun publicLocation(): Optional<PublicLocation> = Optional.ofNullable(publicLocation)

        fun publicContact(): Optional<PublicContact> = Optional.ofNullable(publicContact)

        fun publicUnsupportedContent(): Optional<PublicUnsupportedContent> =
            Optional.ofNullable(publicUnsupportedContent)

        fun publicMessageHeader(): Optional<PublicMessageHeader> =
            Optional.ofNullable(publicMessageHeader)

        fun publicQuickReplies(): Optional<PublicQuickReplies> =
            Optional.ofNullable(publicQuickReplies)

        fun publicWhatsAppTemplateMetadata(): Optional<PublicWhatsAppTemplateMetadata> =
            Optional.ofNullable(publicWhatsAppTemplateMetadata)

        fun publicSocialMetadata(): Optional<PublicSocialMetadataAttachment> =
            Optional.ofNullable(publicSocialMetadata)

        fun isPublicFile(): Boolean = publicFile != null

        fun isPublicLocation(): Boolean = publicLocation != null

        fun isPublicContact(): Boolean = publicContact != null

        fun isPublicUnsupportedContent(): Boolean = publicUnsupportedContent != null

        fun isPublicMessageHeader(): Boolean = publicMessageHeader != null

        fun isPublicQuickReplies(): Boolean = publicQuickReplies != null

        fun isPublicWhatsAppTemplateMetadata(): Boolean = publicWhatsAppTemplateMetadata != null

        fun isPublicSocialMetadata(): Boolean = publicSocialMetadata != null

        fun asPublicFile(): PublicFile = publicFile.getOrThrow("publicFile")

        fun asPublicLocation(): PublicLocation = publicLocation.getOrThrow("publicLocation")

        fun asPublicContact(): PublicContact = publicContact.getOrThrow("publicContact")

        fun asPublicUnsupportedContent(): PublicUnsupportedContent =
            publicUnsupportedContent.getOrThrow("publicUnsupportedContent")

        fun asPublicMessageHeader(): PublicMessageHeader =
            publicMessageHeader.getOrThrow("publicMessageHeader")

        fun asPublicQuickReplies(): PublicQuickReplies =
            publicQuickReplies.getOrThrow("publicQuickReplies")

        fun asPublicWhatsAppTemplateMetadata(): PublicWhatsAppTemplateMetadata =
            publicWhatsAppTemplateMetadata.getOrThrow("publicWhatsAppTemplateMetadata")

        fun asPublicSocialMetadata(): PublicSocialMetadataAttachment =
            publicSocialMetadata.getOrThrow("publicSocialMetadata")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicFile != null -> visitor.visitPublicFile(publicFile)
                publicLocation != null -> visitor.visitPublicLocation(publicLocation)
                publicContact != null -> visitor.visitPublicContact(publicContact)
                publicUnsupportedContent != null ->
                    visitor.visitPublicUnsupportedContent(publicUnsupportedContent)
                publicMessageHeader != null -> visitor.visitPublicMessageHeader(publicMessageHeader)
                publicQuickReplies != null -> visitor.visitPublicQuickReplies(publicQuickReplies)
                publicWhatsAppTemplateMetadata != null ->
                    visitor.visitPublicWhatsAppTemplateMetadata(publicWhatsAppTemplateMetadata)
                publicSocialMetadata != null ->
                    visitor.visitPublicSocialMetadata(publicSocialMetadata)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicFile(publicFile: PublicFile) {
                        publicFile.validate()
                    }

                    override fun visitPublicLocation(publicLocation: PublicLocation) {
                        publicLocation.validate()
                    }

                    override fun visitPublicContact(publicContact: PublicContact) {
                        publicContact.validate()
                    }

                    override fun visitPublicUnsupportedContent(
                        publicUnsupportedContent: PublicUnsupportedContent
                    ) {
                        publicUnsupportedContent.validate()
                    }

                    override fun visitPublicMessageHeader(
                        publicMessageHeader: PublicMessageHeader
                    ) {
                        publicMessageHeader.validate()
                    }

                    override fun visitPublicQuickReplies(publicQuickReplies: PublicQuickReplies) {
                        publicQuickReplies.validate()
                    }

                    override fun visitPublicWhatsAppTemplateMetadata(
                        publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata
                    ) {
                        publicWhatsAppTemplateMetadata.validate()
                    }

                    override fun visitPublicSocialMetadata(
                        publicSocialMetadata: PublicSocialMetadataAttachment
                    ) {
                        publicSocialMetadata.validate()
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
                    override fun visitPublicFile(publicFile: PublicFile) = publicFile.validity()

                    override fun visitPublicLocation(publicLocation: PublicLocation) =
                        publicLocation.validity()

                    override fun visitPublicContact(publicContact: PublicContact) =
                        publicContact.validity()

                    override fun visitPublicUnsupportedContent(
                        publicUnsupportedContent: PublicUnsupportedContent
                    ) = publicUnsupportedContent.validity()

                    override fun visitPublicMessageHeader(
                        publicMessageHeader: PublicMessageHeader
                    ) = publicMessageHeader.validity()

                    override fun visitPublicQuickReplies(publicQuickReplies: PublicQuickReplies) =
                        publicQuickReplies.validity()

                    override fun visitPublicWhatsAppTemplateMetadata(
                        publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata
                    ) = publicWhatsAppTemplateMetadata.validity()

                    override fun visitPublicSocialMetadata(
                        publicSocialMetadata: PublicSocialMetadataAttachment
                    ) = publicSocialMetadata.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                publicFile == other.publicFile &&
                publicLocation == other.publicLocation &&
                publicContact == other.publicContact &&
                publicUnsupportedContent == other.publicUnsupportedContent &&
                publicMessageHeader == other.publicMessageHeader &&
                publicQuickReplies == other.publicQuickReplies &&
                publicWhatsAppTemplateMetadata == other.publicWhatsAppTemplateMetadata &&
                publicSocialMetadata == other.publicSocialMetadata
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicFile,
                publicLocation,
                publicContact,
                publicUnsupportedContent,
                publicMessageHeader,
                publicQuickReplies,
                publicWhatsAppTemplateMetadata,
                publicSocialMetadata,
            )

        override fun toString(): String =
            when {
                publicFile != null -> "Attachment{publicFile=$publicFile}"
                publicLocation != null -> "Attachment{publicLocation=$publicLocation}"
                publicContact != null -> "Attachment{publicContact=$publicContact}"
                publicUnsupportedContent != null ->
                    "Attachment{publicUnsupportedContent=$publicUnsupportedContent}"
                publicMessageHeader != null ->
                    "Attachment{publicMessageHeader=$publicMessageHeader}"
                publicQuickReplies != null -> "Attachment{publicQuickReplies=$publicQuickReplies}"
                publicWhatsAppTemplateMetadata != null ->
                    "Attachment{publicWhatsAppTemplateMetadata=$publicWhatsAppTemplateMetadata}"
                publicSocialMetadata != null ->
                    "Attachment{publicSocialMetadata=$publicSocialMetadata}"
                _json != null -> "Attachment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Attachment")
            }

        companion object {

            @JvmStatic
            fun ofPublicFile(publicFile: PublicFile) = Attachment(publicFile = publicFile)

            @JvmStatic
            fun ofPublicLocation(publicLocation: PublicLocation) =
                Attachment(publicLocation = publicLocation)

            @JvmStatic
            fun ofPublicContact(publicContact: PublicContact) =
                Attachment(publicContact = publicContact)

            @JvmStatic
            fun ofPublicUnsupportedContent(publicUnsupportedContent: PublicUnsupportedContent) =
                Attachment(publicUnsupportedContent = publicUnsupportedContent)

            @JvmStatic
            fun ofPublicMessageHeader(publicMessageHeader: PublicMessageHeader) =
                Attachment(publicMessageHeader = publicMessageHeader)

            @JvmStatic
            fun ofPublicQuickReplies(publicQuickReplies: PublicQuickReplies) =
                Attachment(publicQuickReplies = publicQuickReplies)

            @JvmStatic
            fun ofPublicWhatsAppTemplateMetadata(
                publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata
            ) = Attachment(publicWhatsAppTemplateMetadata = publicWhatsAppTemplateMetadata)

            @JvmStatic
            fun ofPublicSocialMetadata(publicSocialMetadata: PublicSocialMetadataAttachment) =
                Attachment(publicSocialMetadata = publicSocialMetadata)
        }

        /**
         * An interface that defines how to map each variant of [Attachment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPublicFile(publicFile: PublicFile): T

            fun visitPublicLocation(publicLocation: PublicLocation): T

            fun visitPublicContact(publicContact: PublicContact): T

            fun visitPublicUnsupportedContent(publicUnsupportedContent: PublicUnsupportedContent): T

            fun visitPublicMessageHeader(publicMessageHeader: PublicMessageHeader): T

            fun visitPublicQuickReplies(publicQuickReplies: PublicQuickReplies): T

            fun visitPublicWhatsAppTemplateMetadata(
                publicWhatsAppTemplateMetadata: PublicWhatsAppTemplateMetadata
            ): T

            fun visitPublicSocialMetadata(publicSocialMetadata: PublicSocialMetadataAttachment): T

            /**
             * Maps an unknown variant of [Attachment] to a value of type [T].
             *
             * An instance of [Attachment] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Attachment: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Attachment>(Attachment::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Attachment {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicFile>())?.let {
                                Attachment(publicFile = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicLocation>())?.let {
                                Attachment(publicLocation = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicContact>())?.let {
                                Attachment(publicContact = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicUnsupportedContent>())?.let {
                                Attachment(publicUnsupportedContent = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicMessageHeader>())?.let {
                                Attachment(publicMessageHeader = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicQuickReplies>())?.let {
                                Attachment(publicQuickReplies = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicWhatsAppTemplateMetadata>())
                                ?.let {
                                    Attachment(publicWhatsAppTemplateMetadata = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicSocialMetadataAttachment>())
                                ?.let { Attachment(publicSocialMetadata = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Attachment(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Attachment>(Attachment::class) {

            override fun serialize(
                value: Attachment,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicFile != null -> generator.writeObject(value.publicFile)
                    value.publicLocation != null -> generator.writeObject(value.publicLocation)
                    value.publicContact != null -> generator.writeObject(value.publicContact)
                    value.publicUnsupportedContent != null ->
                        generator.writeObject(value.publicUnsupportedContent)
                    value.publicMessageHeader != null ->
                        generator.writeObject(value.publicMessageHeader)
                    value.publicQuickReplies != null ->
                        generator.writeObject(value.publicQuickReplies)
                    value.publicWhatsAppTemplateMetadata != null ->
                        generator.writeObject(value.publicWhatsAppTemplateMetadata)
                    value.publicSocialMetadata != null ->
                        generator.writeObject(value.publicSocialMetadata)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Attachment")
                }
            }
        }
    }

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INCOMING = of("INCOMING")

            @JvmField val OUTGOING = of("OUTGOING")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            INCOMING,
            OUTGOING,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING,
            OUTGOING,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                INCOMING -> Value.INCOMING
                OUTGOING -> Value.OUTGOING
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
                INCOMING -> Known.INCOMING
                OUTGOING -> Known.OUTGOING
                else -> throw HubSpotInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TruncationStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val NOT_TRUNCATED = of("NOT_TRUNCATED")

            @JvmField val TRUNCATED_TO_MOST_RECENT_REPLY = of("TRUNCATED_TO_MOST_RECENT_REPLY")

            @JvmField val TRUNCATED = of("TRUNCATED")

            @JvmStatic fun of(value: String) = TruncationStatus(JsonField.of(value))
        }

        /** An enum containing [TruncationStatus]'s known values. */
        enum class Known {
            NOT_TRUNCATED,
            TRUNCATED_TO_MOST_RECENT_REPLY,
            TRUNCATED,
        }

        /**
         * An enum containing [TruncationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TruncationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_TRUNCATED,
            TRUNCATED_TO_MOST_RECENT_REPLY,
            TRUNCATED,
            /**
             * An enum member indicating that [TruncationStatus] was instantiated with an unknown
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
                NOT_TRUNCATED -> Value.NOT_TRUNCATED
                TRUNCATED_TO_MOST_RECENT_REPLY -> Value.TRUNCATED_TO_MOST_RECENT_REPLY
                TRUNCATED -> Value.TRUNCATED
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
                NOT_TRUNCATED -> Known.NOT_TRUNCATED
                TRUNCATED_TO_MOST_RECENT_REPLY -> Known.TRUNCATED_TO_MOST_RECENT_REPLY
                TRUNCATED -> Known.TRUNCATED
                else -> throw HubSpotInvalidDataException("Unknown TruncationStatus: $value")
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

        fun validate(): TruncationStatus = apply {
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

            return other is TruncationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmField val MESSAGE = of("MESSAGE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            MESSAGE
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
            MESSAGE,
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
                MESSAGE -> Value.MESSAGE
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
                MESSAGE -> Known.MESSAGE
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

        return other is PublicConversationsMessage &&
            id == other.id &&
            archived == other.archived &&
            attachments == other.attachments &&
            channelAccountId == other.channelAccountId &&
            channelId == other.channelId &&
            client == other.client &&
            conversationsThreadId == other.conversationsThreadId &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            direction == other.direction &&
            recipients == other.recipients &&
            senders == other.senders &&
            text == other.text &&
            truncationStatus == other.truncationStatus &&
            type == other.type &&
            inReplyToId == other.inReplyToId &&
            richText == other.richText &&
            status == other.status &&
            subject == other.subject &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            attachments,
            channelAccountId,
            channelId,
            client,
            conversationsThreadId,
            createdAt,
            createdBy,
            direction,
            recipients,
            senders,
            text,
            truncationStatus,
            type,
            inReplyToId,
            richText,
            status,
            subject,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicConversationsMessage{id=$id, archived=$archived, attachments=$attachments, channelAccountId=$channelAccountId, channelId=$channelId, client=$client, conversationsThreadId=$conversationsThreadId, createdAt=$createdAt, createdBy=$createdBy, direction=$direction, recipients=$recipients, senders=$senders, text=$text, truncationStatus=$truncationStatus, type=$type, inReplyToId=$inReplyToId, richText=$richText, status=$status, subject=$subject, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
