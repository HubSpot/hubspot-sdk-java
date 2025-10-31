// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

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
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import com.hubspot_sdk.api.models.conversations.ContactProfile
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.QuickReply
import com.hubspot_sdk.api.models.conversations.SocialMetadata
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Publish a message over your custom channel */
class MessageCreateParams
private constructor(
    private val channelId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun channelId(): Optional<String> = Optional.ofNullable(channelId)

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attachments(): List<Attachment> = body.attachments()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun channelAccountId(): String = body.channelAccountId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun integrationThreadId(): String = body.integrationThreadId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messageDirection(): MessageDirection = body.messageDirection()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipients(): List<Recipient> = body.recipients()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senders(): List<Sender> = body.senders()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = body.text()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = body.timestamp()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inReplyToId(): Optional<String> = body.inReplyToId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationIdempotencyId(): Optional<String> = body.integrationIdempotencyId()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preResolvedContacts(): Optional<PreResolvedContacts> = body.preResolvedContacts()

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun richText(): Optional<String> = body.richText()

    /**
     * Returns the raw JSON value of [attachments].
     *
     * Unlike [attachments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _attachments(): JsonField<List<Attachment>> = body._attachments()

    /**
     * Returns the raw JSON value of [channelAccountId].
     *
     * Unlike [channelAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _channelAccountId(): JsonField<String> = body._channelAccountId()

    /**
     * Returns the raw JSON value of [integrationThreadId].
     *
     * Unlike [integrationThreadId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _integrationThreadId(): JsonField<String> = body._integrationThreadId()

    /**
     * Returns the raw JSON value of [messageDirection].
     *
     * Unlike [messageDirection], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _messageDirection(): JsonField<MessageDirection> = body._messageDirection()

    /**
     * Returns the raw JSON value of [recipients].
     *
     * Unlike [recipients], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipients(): JsonField<List<Recipient>> = body._recipients()

    /**
     * Returns the raw JSON value of [senders].
     *
     * Unlike [senders], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _senders(): JsonField<List<Sender>> = body._senders()

    /**
     * Returns the raw JSON value of [text].
     *
     * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _text(): JsonField<String> = body._text()

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timestamp(): JsonField<OffsetDateTime> = body._timestamp()

    /**
     * Returns the raw JSON value of [inReplyToId].
     *
     * Unlike [inReplyToId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inReplyToId(): JsonField<String> = body._inReplyToId()

    /**
     * Returns the raw JSON value of [integrationIdempotencyId].
     *
     * Unlike [integrationIdempotencyId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _integrationIdempotencyId(): JsonField<String> = body._integrationIdempotencyId()

    /**
     * Returns the raw JSON value of [preResolvedContacts].
     *
     * Unlike [preResolvedContacts], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _preResolvedContacts(): JsonField<PreResolvedContacts> = body._preResolvedContacts()

    /**
     * Returns the raw JSON value of [richText].
     *
     * Unlike [richText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _richText(): JsonField<String> = body._richText()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MessageCreateParams].
         *
         * The following fields are required:
         * ```java
         * .attachments()
         * .channelAccountId()
         * .integrationThreadId()
         * .messageDirection()
         * .recipients()
         * .senders()
         * .text()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageCreateParams]. */
    class Builder internal constructor() {

        private var channelId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(messageCreateParams: MessageCreateParams) = apply {
            channelId = messageCreateParams.channelId
            body = messageCreateParams.body.toBuilder()
            additionalHeaders = messageCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = messageCreateParams.additionalQueryParams.toBuilder()
        }

        fun channelId(channelId: String?) = apply { this.channelId = channelId }

        /** Alias for calling [Builder.channelId] with `channelId.orElse(null)`. */
        fun channelId(channelId: Optional<String>) = channelId(channelId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attachments]
         * - [channelAccountId]
         * - [integrationThreadId]
         * - [messageDirection]
         * - [recipients]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun attachments(attachments: List<Attachment>) = apply { body.attachments(attachments) }

        /**
         * Sets [Builder.attachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachments] with a well-typed `List<Attachment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attachments(attachments: JsonField<List<Attachment>>) = apply {
            body.attachments(attachments)
        }

        /**
         * Adds a single [Attachment] to [attachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttachment(attachment: Attachment) = apply { body.addAttachment(attachment) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsFile(conversationsCustomchannelsFile)`.
         */
        fun addAttachment(
            conversationsCustomchannelsFile: Attachment.ConversationsCustomchannelsFileAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsFile) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsLocation(conversationsCustomchannelsLocation)`.
         */
        fun addAttachment(
            conversationsCustomchannelsLocation:
                Attachment.ConversationsCustomchannelsLocationAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsLocation) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsContact(conversationsCustomchannelsContact)`.
         */
        fun addAttachment(
            conversationsCustomchannelsContact:
                Attachment.ConversationsCustomchannelsContactAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsContact) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsUnsupportedContent(conversationsCustomchannelsUnsupportedContent)`.
         */
        fun addAttachment(
            conversationsCustomchannelsUnsupportedContent:
                Attachment.ConversationsCustomchannelsUnsupportedContentAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsUnsupportedContent) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsMessageHeader(conversationsCustomchannelsMessageHeader)`.
         */
        fun addAttachment(
            conversationsCustomchannelsMessageHeader:
                Attachment.ConversationsCustomchannelsMessageHeaderAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsMessageHeader) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsQuickReplies(conversationsCustomchannelsQuickReplies)`.
         */
        fun addAttachment(
            conversationsCustomchannelsQuickReplies:
                Attachment.ConversationsCustomchannelsQuickRepliesAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsQuickReplies) }

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofConversationsCustomchannelsSocialMetadataIntegration(conversationsCustomchannelsSocialMetadataIntegration)`.
         */
        fun addAttachment(
            conversationsCustomchannelsSocialMetadataIntegration:
                Attachment.ConversationsCustomchannelsSocialMetadataIntegrationAttachment
        ) = apply { body.addAttachment(conversationsCustomchannelsSocialMetadataIntegration) }

        fun channelAccountId(channelAccountId: String) = apply {
            body.channelAccountId(channelAccountId)
        }

        /**
         * Sets [Builder.channelAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channelAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun channelAccountId(channelAccountId: JsonField<String>) = apply {
            body.channelAccountId(channelAccountId)
        }

        fun integrationThreadId(integrationThreadId: String) = apply {
            body.integrationThreadId(integrationThreadId)
        }

        /**
         * Sets [Builder.integrationThreadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationThreadId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integrationThreadId(integrationThreadId: JsonField<String>) = apply {
            body.integrationThreadId(integrationThreadId)
        }

        fun messageDirection(messageDirection: MessageDirection) = apply {
            body.messageDirection(messageDirection)
        }

        /**
         * Sets [Builder.messageDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageDirection] with a well-typed [MessageDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messageDirection(messageDirection: JsonField<MessageDirection>) = apply {
            body.messageDirection(messageDirection)
        }

        fun recipients(recipients: List<Recipient>) = apply { body.recipients(recipients) }

        /**
         * Sets [Builder.recipients] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipients] with a well-typed `List<Recipient>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipients(recipients: JsonField<List<Recipient>>) = apply {
            body.recipients(recipients)
        }

        /**
         * Adds a single [Recipient] to [recipients].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecipient(recipient: Recipient) = apply { body.addRecipient(recipient) }

        fun senders(senders: List<Sender>) = apply { body.senders(senders) }

        /**
         * Sets [Builder.senders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senders] with a well-typed `List<Sender>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senders(senders: JsonField<List<Sender>>) = apply { body.senders(senders) }

        /**
         * Adds a single [Sender] to [senders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSender(sender: Sender) = apply { body.addSender(sender) }

        fun text(text: String) = apply { body.text(text) }

        /**
         * Sets [Builder.text] to an arbitrary JSON value.
         *
         * You should usually call [Builder.text] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun text(text: JsonField<String>) = apply { body.text(text) }

        fun timestamp(timestamp: OffsetDateTime) = apply { body.timestamp(timestamp) }

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { body.timestamp(timestamp) }

        fun inReplyToId(inReplyToId: String) = apply { body.inReplyToId(inReplyToId) }

        /**
         * Sets [Builder.inReplyToId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inReplyToId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inReplyToId(inReplyToId: JsonField<String>) = apply { body.inReplyToId(inReplyToId) }

        fun integrationIdempotencyId(integrationIdempotencyId: String) = apply {
            body.integrationIdempotencyId(integrationIdempotencyId)
        }

        /**
         * Sets [Builder.integrationIdempotencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationIdempotencyId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrationIdempotencyId(integrationIdempotencyId: JsonField<String>) = apply {
            body.integrationIdempotencyId(integrationIdempotencyId)
        }

        fun preResolvedContacts(preResolvedContacts: PreResolvedContacts) = apply {
            body.preResolvedContacts(preResolvedContacts)
        }

        /**
         * Sets [Builder.preResolvedContacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preResolvedContacts] with a well-typed
         * [PreResolvedContacts] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun preResolvedContacts(preResolvedContacts: JsonField<PreResolvedContacts>) = apply {
            body.preResolvedContacts(preResolvedContacts)
        }

        fun richText(richText: String) = apply { body.richText(richText) }

        /**
         * Sets [Builder.richText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun richText(richText: JsonField<String>) = apply { body.richText(richText) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [MessageCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attachments()
         * .channelAccountId()
         * .integrationThreadId()
         * .messageDirection()
         * .recipients()
         * .senders()
         * .text()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MessageCreateParams =
            MessageCreateParams(
                channelId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> channelId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attachments: JsonField<List<Attachment>>,
        private val channelAccountId: JsonField<String>,
        private val integrationThreadId: JsonField<String>,
        private val messageDirection: JsonField<MessageDirection>,
        private val recipients: JsonField<List<Recipient>>,
        private val senders: JsonField<List<Sender>>,
        private val text: JsonField<String>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val inReplyToId: JsonField<String>,
        private val integrationIdempotencyId: JsonField<String>,
        private val preResolvedContacts: JsonField<PreResolvedContacts>,
        private val richText: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attachments")
            @ExcludeMissing
            attachments: JsonField<List<Attachment>> = JsonMissing.of(),
            @JsonProperty("channelAccountId")
            @ExcludeMissing
            channelAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrationThreadId")
            @ExcludeMissing
            integrationThreadId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("messageDirection")
            @ExcludeMissing
            messageDirection: JsonField<MessageDirection> = JsonMissing.of(),
            @JsonProperty("recipients")
            @ExcludeMissing
            recipients: JsonField<List<Recipient>> = JsonMissing.of(),
            @JsonProperty("senders")
            @ExcludeMissing
            senders: JsonField<List<Sender>> = JsonMissing.of(),
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("inReplyToId")
            @ExcludeMissing
            inReplyToId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integrationIdempotencyId")
            @ExcludeMissing
            integrationIdempotencyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("preResolvedContacts")
            @ExcludeMissing
            preResolvedContacts: JsonField<PreResolvedContacts> = JsonMissing.of(),
            @JsonProperty("richText") @ExcludeMissing richText: JsonField<String> = JsonMissing.of(),
        ) : this(
            attachments,
            channelAccountId,
            integrationThreadId,
            messageDirection,
            recipients,
            senders,
            text,
            timestamp,
            inReplyToId,
            integrationIdempotencyId,
            preResolvedContacts,
            richText,
            mutableMapOf(),
        )

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun attachments(): List<Attachment> = attachments.getRequired("attachments")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channelAccountId(): String = channelAccountId.getRequired("channelAccountId")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationThreadId(): String = integrationThreadId.getRequired("integrationThreadId")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messageDirection(): MessageDirection = messageDirection.getRequired("messageDirection")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipients(): List<Recipient> = recipients.getRequired("recipients")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun senders(): List<Sender> = senders.getRequired("senders")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun text(): String = text.getRequired("text")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inReplyToId(): Optional<String> = inReplyToId.getOptional("inReplyToId")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun integrationIdempotencyId(): Optional<String> =
            integrationIdempotencyId.getOptional("integrationIdempotencyId")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preResolvedContacts(): Optional<PreResolvedContacts> =
            preResolvedContacts.getOptional("preResolvedContacts")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun richText(): Optional<String> = richText.getOptional("richText")

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
         * Returns the raw JSON value of [integrationThreadId].
         *
         * Unlike [integrationThreadId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("integrationThreadId")
        @ExcludeMissing
        fun _integrationThreadId(): JsonField<String> = integrationThreadId

        /**
         * Returns the raw JSON value of [messageDirection].
         *
         * Unlike [messageDirection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("messageDirection")
        @ExcludeMissing
        fun _messageDirection(): JsonField<MessageDirection> = messageDirection

        /**
         * Returns the raw JSON value of [recipients].
         *
         * Unlike [recipients], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipients")
        @ExcludeMissing
        fun _recipients(): JsonField<List<Recipient>> = recipients

        /**
         * Returns the raw JSON value of [senders].
         *
         * Unlike [senders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senders") @ExcludeMissing fun _senders(): JsonField<List<Sender>> = senders

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [inReplyToId].
         *
         * Unlike [inReplyToId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inReplyToId")
        @ExcludeMissing
        fun _inReplyToId(): JsonField<String> = inReplyToId

        /**
         * Returns the raw JSON value of [integrationIdempotencyId].
         *
         * Unlike [integrationIdempotencyId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("integrationIdempotencyId")
        @ExcludeMissing
        fun _integrationIdempotencyId(): JsonField<String> = integrationIdempotencyId

        /**
         * Returns the raw JSON value of [preResolvedContacts].
         *
         * Unlike [preResolvedContacts], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preResolvedContacts")
        @ExcludeMissing
        fun _preResolvedContacts(): JsonField<PreResolvedContacts> = preResolvedContacts

        /**
         * Returns the raw JSON value of [richText].
         *
         * Unlike [richText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("richText") @ExcludeMissing fun _richText(): JsonField<String> = richText

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .attachments()
             * .channelAccountId()
             * .integrationThreadId()
             * .messageDirection()
             * .recipients()
             * .senders()
             * .text()
             * .timestamp()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var attachments: JsonField<MutableList<Attachment>>? = null
            private var channelAccountId: JsonField<String>? = null
            private var integrationThreadId: JsonField<String>? = null
            private var messageDirection: JsonField<MessageDirection>? = null
            private var recipients: JsonField<MutableList<Recipient>>? = null
            private var senders: JsonField<MutableList<Sender>>? = null
            private var text: JsonField<String>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var inReplyToId: JsonField<String> = JsonMissing.of()
            private var integrationIdempotencyId: JsonField<String> = JsonMissing.of()
            private var preResolvedContacts: JsonField<PreResolvedContacts> = JsonMissing.of()
            private var richText: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                attachments = body.attachments.map { it.toMutableList() }
                channelAccountId = body.channelAccountId
                integrationThreadId = body.integrationThreadId
                messageDirection = body.messageDirection
                recipients = body.recipients.map { it.toMutableList() }
                senders = body.senders.map { it.toMutableList() }
                text = body.text
                timestamp = body.timestamp
                inReplyToId = body.inReplyToId
                integrationIdempotencyId = body.integrationIdempotencyId
                preResolvedContacts = body.preResolvedContacts
                richText = body.richText
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun attachments(attachments: List<Attachment>) = attachments(JsonField.of(attachments))

            /**
             * Sets [Builder.attachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachments] with a well-typed `List<Attachment>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsFile(conversationsCustomchannelsFile)`.
             */
            fun addAttachment(
                conversationsCustomchannelsFile:
                    Attachment.ConversationsCustomchannelsFileAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsFile(conversationsCustomchannelsFile)
                )

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsLocation(conversationsCustomchannelsLocation)`.
             */
            fun addAttachment(
                conversationsCustomchannelsLocation:
                    Attachment.ConversationsCustomchannelsLocationAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsLocation(
                        conversationsCustomchannelsLocation
                    )
                )

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsContact(conversationsCustomchannelsContact)`.
             */
            fun addAttachment(
                conversationsCustomchannelsContact:
                    Attachment.ConversationsCustomchannelsContactAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsContact(
                        conversationsCustomchannelsContact
                    )
                )

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsUnsupportedContent(conversationsCustomchannelsUnsupportedContent)`.
             */
            fun addAttachment(
                conversationsCustomchannelsUnsupportedContent:
                    Attachment.ConversationsCustomchannelsUnsupportedContentAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsUnsupportedContent(
                        conversationsCustomchannelsUnsupportedContent
                    )
                )

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsMessageHeader(conversationsCustomchannelsMessageHeader)`.
             */
            fun addAttachment(
                conversationsCustomchannelsMessageHeader:
                    Attachment.ConversationsCustomchannelsMessageHeaderAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsMessageHeader(
                        conversationsCustomchannelsMessageHeader
                    )
                )

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsQuickReplies(conversationsCustomchannelsQuickReplies)`.
             */
            fun addAttachment(
                conversationsCustomchannelsQuickReplies:
                    Attachment.ConversationsCustomchannelsQuickRepliesAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsQuickReplies(
                        conversationsCustomchannelsQuickReplies
                    )
                )

            /**
             * Alias for calling [addAttachment] with
             * `Attachment.ofConversationsCustomchannelsSocialMetadataIntegration(conversationsCustomchannelsSocialMetadataIntegration)`.
             */
            fun addAttachment(
                conversationsCustomchannelsSocialMetadataIntegration:
                    Attachment.ConversationsCustomchannelsSocialMetadataIntegrationAttachment
            ) =
                addAttachment(
                    Attachment.ofConversationsCustomchannelsSocialMetadataIntegration(
                        conversationsCustomchannelsSocialMetadataIntegration
                    )
                )

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

            fun integrationThreadId(integrationThreadId: String) =
                integrationThreadId(JsonField.of(integrationThreadId))

            /**
             * Sets [Builder.integrationThreadId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationThreadId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun integrationThreadId(integrationThreadId: JsonField<String>) = apply {
                this.integrationThreadId = integrationThreadId
            }

            fun messageDirection(messageDirection: MessageDirection) =
                messageDirection(JsonField.of(messageDirection))

            /**
             * Sets [Builder.messageDirection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageDirection] with a well-typed
             * [MessageDirection] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun messageDirection(messageDirection: JsonField<MessageDirection>) = apply {
                this.messageDirection = messageDirection
            }

            fun recipients(recipients: List<Recipient>) = recipients(JsonField.of(recipients))

            /**
             * Sets [Builder.recipients] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipients] with a well-typed `List<Recipient>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun recipients(recipients: JsonField<List<Recipient>>) = apply {
                this.recipients = recipients.map { it.toMutableList() }
            }

            /**
             * Adds a single [Recipient] to [recipients].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRecipient(recipient: Recipient) = apply {
                recipients =
                    (recipients ?: JsonField.of(mutableListOf())).also {
                        checkKnown("recipients", it).add(recipient)
                    }
            }

            fun senders(senders: List<Sender>) = senders(JsonField.of(senders))

            /**
             * Sets [Builder.senders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senders] with a well-typed `List<Sender>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senders(senders: JsonField<List<Sender>>) = apply {
                this.senders = senders.map { it.toMutableList() }
            }

            /**
             * Adds a single [Sender] to [senders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSender(sender: Sender) = apply {
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun inReplyToId(inReplyToId: String) = inReplyToId(JsonField.of(inReplyToId))

            /**
             * Sets [Builder.inReplyToId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inReplyToId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inReplyToId(inReplyToId: JsonField<String>) = apply {
                this.inReplyToId = inReplyToId
            }

            fun integrationIdempotencyId(integrationIdempotencyId: String) =
                integrationIdempotencyId(JsonField.of(integrationIdempotencyId))

            /**
             * Sets [Builder.integrationIdempotencyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationIdempotencyId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun integrationIdempotencyId(integrationIdempotencyId: JsonField<String>) = apply {
                this.integrationIdempotencyId = integrationIdempotencyId
            }

            fun preResolvedContacts(preResolvedContacts: PreResolvedContacts) =
                preResolvedContacts(JsonField.of(preResolvedContacts))

            /**
             * Sets [Builder.preResolvedContacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preResolvedContacts] with a well-typed
             * [PreResolvedContacts] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun preResolvedContacts(preResolvedContacts: JsonField<PreResolvedContacts>) = apply {
                this.preResolvedContacts = preResolvedContacts
            }

            fun richText(richText: String) = richText(JsonField.of(richText))

            /**
             * Sets [Builder.richText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.richText] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun richText(richText: JsonField<String>) = apply { this.richText = richText }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .attachments()
             * .channelAccountId()
             * .integrationThreadId()
             * .messageDirection()
             * .recipients()
             * .senders()
             * .text()
             * .timestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("attachments", attachments).map { it.toImmutable() },
                    checkRequired("channelAccountId", channelAccountId),
                    checkRequired("integrationThreadId", integrationThreadId),
                    checkRequired("messageDirection", messageDirection),
                    checkRequired("recipients", recipients).map { it.toImmutable() },
                    checkRequired("senders", senders).map { it.toImmutable() },
                    checkRequired("text", text),
                    checkRequired("timestamp", timestamp),
                    inReplyToId,
                    integrationIdempotencyId,
                    preResolvedContacts,
                    richText,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attachments().forEach { it.validate() }
            channelAccountId()
            integrationThreadId()
            messageDirection().validate()
            recipients().forEach { it.validate() }
            senders().forEach { it.validate() }
            text()
            timestamp()
            inReplyToId()
            integrationIdempotencyId()
            preResolvedContacts().ifPresent { it.validate() }
            richText()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (channelAccountId.asKnown().isPresent) 1 else 0) +
                (if (integrationThreadId.asKnown().isPresent) 1 else 0) +
                (messageDirection.asKnown().getOrNull()?.validity() ?: 0) +
                (recipients.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (senders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (text.asKnown().isPresent) 1 else 0) +
                (if (timestamp.asKnown().isPresent) 1 else 0) +
                (if (inReplyToId.asKnown().isPresent) 1 else 0) +
                (if (integrationIdempotencyId.asKnown().isPresent) 1 else 0) +
                (preResolvedContacts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (richText.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                attachments == other.attachments &&
                channelAccountId == other.channelAccountId &&
                integrationThreadId == other.integrationThreadId &&
                messageDirection == other.messageDirection &&
                recipients == other.recipients &&
                senders == other.senders &&
                text == other.text &&
                timestamp == other.timestamp &&
                inReplyToId == other.inReplyToId &&
                integrationIdempotencyId == other.integrationIdempotencyId &&
                preResolvedContacts == other.preResolvedContacts &&
                richText == other.richText &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachments,
                channelAccountId,
                integrationThreadId,
                messageDirection,
                recipients,
                senders,
                text,
                timestamp,
                inReplyToId,
                integrationIdempotencyId,
                preResolvedContacts,
                richText,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attachments=$attachments, channelAccountId=$channelAccountId, integrationThreadId=$integrationThreadId, messageDirection=$messageDirection, recipients=$recipients, senders=$senders, text=$text, timestamp=$timestamp, inReplyToId=$inReplyToId, integrationIdempotencyId=$integrationIdempotencyId, preResolvedContacts=$preResolvedContacts, richText=$richText, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Attachment.Deserializer::class)
    @JsonSerialize(using = Attachment.Serializer::class)
    class Attachment
    private constructor(
        private val conversationsCustomchannelsFile: ConversationsCustomchannelsFileAttachment? =
            null,
        private val conversationsCustomchannelsLocation:
            ConversationsCustomchannelsLocationAttachment? =
            null,
        private val conversationsCustomchannelsContact:
            ConversationsCustomchannelsContactAttachment? =
            null,
        private val conversationsCustomchannelsUnsupportedContent:
            ConversationsCustomchannelsUnsupportedContentAttachment? =
            null,
        private val conversationsCustomchannelsMessageHeader:
            ConversationsCustomchannelsMessageHeaderAttachment? =
            null,
        private val conversationsCustomchannelsQuickReplies:
            ConversationsCustomchannelsQuickRepliesAttachment? =
            null,
        private val conversationsCustomchannelsSocialMetadataIntegration:
            ConversationsCustomchannelsSocialMetadataIntegrationAttachment? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun conversationsCustomchannelsFile(): Optional<ConversationsCustomchannelsFileAttachment> =
            Optional.ofNullable(conversationsCustomchannelsFile)

        fun conversationsCustomchannelsLocation():
            Optional<ConversationsCustomchannelsLocationAttachment> =
            Optional.ofNullable(conversationsCustomchannelsLocation)

        fun conversationsCustomchannelsContact():
            Optional<ConversationsCustomchannelsContactAttachment> =
            Optional.ofNullable(conversationsCustomchannelsContact)

        fun conversationsCustomchannelsUnsupportedContent():
            Optional<ConversationsCustomchannelsUnsupportedContentAttachment> =
            Optional.ofNullable(conversationsCustomchannelsUnsupportedContent)

        fun conversationsCustomchannelsMessageHeader():
            Optional<ConversationsCustomchannelsMessageHeaderAttachment> =
            Optional.ofNullable(conversationsCustomchannelsMessageHeader)

        fun conversationsCustomchannelsQuickReplies():
            Optional<ConversationsCustomchannelsQuickRepliesAttachment> =
            Optional.ofNullable(conversationsCustomchannelsQuickReplies)

        fun conversationsCustomchannelsSocialMetadataIntegration():
            Optional<ConversationsCustomchannelsSocialMetadataIntegrationAttachment> =
            Optional.ofNullable(conversationsCustomchannelsSocialMetadataIntegration)

        fun isConversationsCustomchannelsFile(): Boolean = conversationsCustomchannelsFile != null

        fun isConversationsCustomchannelsLocation(): Boolean =
            conversationsCustomchannelsLocation != null

        fun isConversationsCustomchannelsContact(): Boolean =
            conversationsCustomchannelsContact != null

        fun isConversationsCustomchannelsUnsupportedContent(): Boolean =
            conversationsCustomchannelsUnsupportedContent != null

        fun isConversationsCustomchannelsMessageHeader(): Boolean =
            conversationsCustomchannelsMessageHeader != null

        fun isConversationsCustomchannelsQuickReplies(): Boolean =
            conversationsCustomchannelsQuickReplies != null

        fun isConversationsCustomchannelsSocialMetadataIntegration(): Boolean =
            conversationsCustomchannelsSocialMetadataIntegration != null

        fun asConversationsCustomchannelsFile(): ConversationsCustomchannelsFileAttachment =
            conversationsCustomchannelsFile.getOrThrow("conversationsCustomchannelsFile")

        fun asConversationsCustomchannelsLocation(): ConversationsCustomchannelsLocationAttachment =
            conversationsCustomchannelsLocation.getOrThrow("conversationsCustomchannelsLocation")

        fun asConversationsCustomchannelsContact(): ConversationsCustomchannelsContactAttachment =
            conversationsCustomchannelsContact.getOrThrow("conversationsCustomchannelsContact")

        fun asConversationsCustomchannelsUnsupportedContent():
            ConversationsCustomchannelsUnsupportedContentAttachment =
            conversationsCustomchannelsUnsupportedContent.getOrThrow(
                "conversationsCustomchannelsUnsupportedContent"
            )

        fun asConversationsCustomchannelsMessageHeader():
            ConversationsCustomchannelsMessageHeaderAttachment =
            conversationsCustomchannelsMessageHeader.getOrThrow(
                "conversationsCustomchannelsMessageHeader"
            )

        fun asConversationsCustomchannelsQuickReplies():
            ConversationsCustomchannelsQuickRepliesAttachment =
            conversationsCustomchannelsQuickReplies.getOrThrow(
                "conversationsCustomchannelsQuickReplies"
            )

        fun asConversationsCustomchannelsSocialMetadataIntegration():
            ConversationsCustomchannelsSocialMetadataIntegrationAttachment =
            conversationsCustomchannelsSocialMetadataIntegration.getOrThrow(
                "conversationsCustomchannelsSocialMetadataIntegration"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                conversationsCustomchannelsFile != null ->
                    visitor.visitConversationsCustomchannelsFile(conversationsCustomchannelsFile)
                conversationsCustomchannelsLocation != null ->
                    visitor.visitConversationsCustomchannelsLocation(
                        conversationsCustomchannelsLocation
                    )
                conversationsCustomchannelsContact != null ->
                    visitor.visitConversationsCustomchannelsContact(
                        conversationsCustomchannelsContact
                    )
                conversationsCustomchannelsUnsupportedContent != null ->
                    visitor.visitConversationsCustomchannelsUnsupportedContent(
                        conversationsCustomchannelsUnsupportedContent
                    )
                conversationsCustomchannelsMessageHeader != null ->
                    visitor.visitConversationsCustomchannelsMessageHeader(
                        conversationsCustomchannelsMessageHeader
                    )
                conversationsCustomchannelsQuickReplies != null ->
                    visitor.visitConversationsCustomchannelsQuickReplies(
                        conversationsCustomchannelsQuickReplies
                    )
                conversationsCustomchannelsSocialMetadataIntegration != null ->
                    visitor.visitConversationsCustomchannelsSocialMetadataIntegration(
                        conversationsCustomchannelsSocialMetadataIntegration
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitConversationsCustomchannelsFile(
                        conversationsCustomchannelsFile: ConversationsCustomchannelsFileAttachment
                    ) {
                        conversationsCustomchannelsFile.validate()
                    }

                    override fun visitConversationsCustomchannelsLocation(
                        conversationsCustomchannelsLocation:
                            ConversationsCustomchannelsLocationAttachment
                    ) {
                        conversationsCustomchannelsLocation.validate()
                    }

                    override fun visitConversationsCustomchannelsContact(
                        conversationsCustomchannelsContact:
                            ConversationsCustomchannelsContactAttachment
                    ) {
                        conversationsCustomchannelsContact.validate()
                    }

                    override fun visitConversationsCustomchannelsUnsupportedContent(
                        conversationsCustomchannelsUnsupportedContent:
                            ConversationsCustomchannelsUnsupportedContentAttachment
                    ) {
                        conversationsCustomchannelsUnsupportedContent.validate()
                    }

                    override fun visitConversationsCustomchannelsMessageHeader(
                        conversationsCustomchannelsMessageHeader:
                            ConversationsCustomchannelsMessageHeaderAttachment
                    ) {
                        conversationsCustomchannelsMessageHeader.validate()
                    }

                    override fun visitConversationsCustomchannelsQuickReplies(
                        conversationsCustomchannelsQuickReplies:
                            ConversationsCustomchannelsQuickRepliesAttachment
                    ) {
                        conversationsCustomchannelsQuickReplies.validate()
                    }

                    override fun visitConversationsCustomchannelsSocialMetadataIntegration(
                        conversationsCustomchannelsSocialMetadataIntegration:
                            ConversationsCustomchannelsSocialMetadataIntegrationAttachment
                    ) {
                        conversationsCustomchannelsSocialMetadataIntegration.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitConversationsCustomchannelsFile(
                        conversationsCustomchannelsFile: ConversationsCustomchannelsFileAttachment
                    ) = conversationsCustomchannelsFile.validity()

                    override fun visitConversationsCustomchannelsLocation(
                        conversationsCustomchannelsLocation:
                            ConversationsCustomchannelsLocationAttachment
                    ) = conversationsCustomchannelsLocation.validity()

                    override fun visitConversationsCustomchannelsContact(
                        conversationsCustomchannelsContact:
                            ConversationsCustomchannelsContactAttachment
                    ) = conversationsCustomchannelsContact.validity()

                    override fun visitConversationsCustomchannelsUnsupportedContent(
                        conversationsCustomchannelsUnsupportedContent:
                            ConversationsCustomchannelsUnsupportedContentAttachment
                    ) = conversationsCustomchannelsUnsupportedContent.validity()

                    override fun visitConversationsCustomchannelsMessageHeader(
                        conversationsCustomchannelsMessageHeader:
                            ConversationsCustomchannelsMessageHeaderAttachment
                    ) = conversationsCustomchannelsMessageHeader.validity()

                    override fun visitConversationsCustomchannelsQuickReplies(
                        conversationsCustomchannelsQuickReplies:
                            ConversationsCustomchannelsQuickRepliesAttachment
                    ) = conversationsCustomchannelsQuickReplies.validity()

                    override fun visitConversationsCustomchannelsSocialMetadataIntegration(
                        conversationsCustomchannelsSocialMetadataIntegration:
                            ConversationsCustomchannelsSocialMetadataIntegrationAttachment
                    ) = conversationsCustomchannelsSocialMetadataIntegration.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                conversationsCustomchannelsFile == other.conversationsCustomchannelsFile &&
                conversationsCustomchannelsLocation == other.conversationsCustomchannelsLocation &&
                conversationsCustomchannelsContact == other.conversationsCustomchannelsContact &&
                conversationsCustomchannelsUnsupportedContent ==
                    other.conversationsCustomchannelsUnsupportedContent &&
                conversationsCustomchannelsMessageHeader ==
                    other.conversationsCustomchannelsMessageHeader &&
                conversationsCustomchannelsQuickReplies ==
                    other.conversationsCustomchannelsQuickReplies &&
                conversationsCustomchannelsSocialMetadataIntegration ==
                    other.conversationsCustomchannelsSocialMetadataIntegration
        }

        override fun hashCode(): Int =
            Objects.hash(
                conversationsCustomchannelsFile,
                conversationsCustomchannelsLocation,
                conversationsCustomchannelsContact,
                conversationsCustomchannelsUnsupportedContent,
                conversationsCustomchannelsMessageHeader,
                conversationsCustomchannelsQuickReplies,
                conversationsCustomchannelsSocialMetadataIntegration,
            )

        override fun toString(): String =
            when {
                conversationsCustomchannelsFile != null ->
                    "Attachment{conversationsCustomchannelsFile=$conversationsCustomchannelsFile}"
                conversationsCustomchannelsLocation != null ->
                    "Attachment{conversationsCustomchannelsLocation=$conversationsCustomchannelsLocation}"
                conversationsCustomchannelsContact != null ->
                    "Attachment{conversationsCustomchannelsContact=$conversationsCustomchannelsContact}"
                conversationsCustomchannelsUnsupportedContent != null ->
                    "Attachment{conversationsCustomchannelsUnsupportedContent=$conversationsCustomchannelsUnsupportedContent}"
                conversationsCustomchannelsMessageHeader != null ->
                    "Attachment{conversationsCustomchannelsMessageHeader=$conversationsCustomchannelsMessageHeader}"
                conversationsCustomchannelsQuickReplies != null ->
                    "Attachment{conversationsCustomchannelsQuickReplies=$conversationsCustomchannelsQuickReplies}"
                conversationsCustomchannelsSocialMetadataIntegration != null ->
                    "Attachment{conversationsCustomchannelsSocialMetadataIntegration=$conversationsCustomchannelsSocialMetadataIntegration}"
                _json != null -> "Attachment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Attachment")
            }

        companion object {

            @JvmStatic
            fun ofConversationsCustomchannelsFile(
                conversationsCustomchannelsFile: ConversationsCustomchannelsFileAttachment
            ) = Attachment(conversationsCustomchannelsFile = conversationsCustomchannelsFile)

            @JvmStatic
            fun ofConversationsCustomchannelsLocation(
                conversationsCustomchannelsLocation: ConversationsCustomchannelsLocationAttachment
            ) =
                Attachment(
                    conversationsCustomchannelsLocation = conversationsCustomchannelsLocation
                )

            @JvmStatic
            fun ofConversationsCustomchannelsContact(
                conversationsCustomchannelsContact: ConversationsCustomchannelsContactAttachment
            ) = Attachment(conversationsCustomchannelsContact = conversationsCustomchannelsContact)

            @JvmStatic
            fun ofConversationsCustomchannelsUnsupportedContent(
                conversationsCustomchannelsUnsupportedContent:
                    ConversationsCustomchannelsUnsupportedContentAttachment
            ) =
                Attachment(
                    conversationsCustomchannelsUnsupportedContent =
                        conversationsCustomchannelsUnsupportedContent
                )

            @JvmStatic
            fun ofConversationsCustomchannelsMessageHeader(
                conversationsCustomchannelsMessageHeader:
                    ConversationsCustomchannelsMessageHeaderAttachment
            ) =
                Attachment(
                    conversationsCustomchannelsMessageHeader =
                        conversationsCustomchannelsMessageHeader
                )

            @JvmStatic
            fun ofConversationsCustomchannelsQuickReplies(
                conversationsCustomchannelsQuickReplies:
                    ConversationsCustomchannelsQuickRepliesAttachment
            ) =
                Attachment(
                    conversationsCustomchannelsQuickReplies =
                        conversationsCustomchannelsQuickReplies
                )

            @JvmStatic
            fun ofConversationsCustomchannelsSocialMetadataIntegration(
                conversationsCustomchannelsSocialMetadataIntegration:
                    ConversationsCustomchannelsSocialMetadataIntegrationAttachment
            ) =
                Attachment(
                    conversationsCustomchannelsSocialMetadataIntegration =
                        conversationsCustomchannelsSocialMetadataIntegration
                )
        }

        /**
         * An interface that defines how to map each variant of [Attachment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitConversationsCustomchannelsFile(
                conversationsCustomchannelsFile: ConversationsCustomchannelsFileAttachment
            ): T

            fun visitConversationsCustomchannelsLocation(
                conversationsCustomchannelsLocation: ConversationsCustomchannelsLocationAttachment
            ): T

            fun visitConversationsCustomchannelsContact(
                conversationsCustomchannelsContact: ConversationsCustomchannelsContactAttachment
            ): T

            fun visitConversationsCustomchannelsUnsupportedContent(
                conversationsCustomchannelsUnsupportedContent:
                    ConversationsCustomchannelsUnsupportedContentAttachment
            ): T

            fun visitConversationsCustomchannelsMessageHeader(
                conversationsCustomchannelsMessageHeader:
                    ConversationsCustomchannelsMessageHeaderAttachment
            ): T

            fun visitConversationsCustomchannelsQuickReplies(
                conversationsCustomchannelsQuickReplies:
                    ConversationsCustomchannelsQuickRepliesAttachment
            ): T

            fun visitConversationsCustomchannelsSocialMetadataIntegration(
                conversationsCustomchannelsSocialMetadataIntegration:
                    ConversationsCustomchannelsSocialMetadataIntegrationAttachment
            ): T

            /**
             * Maps an unknown variant of [Attachment] to a value of type [T].
             *
             * An instance of [Attachment] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Attachment: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Attachment>(Attachment::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Attachment {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ConversationsCustomchannelsFileAttachment>(),
                                )
                                ?.let {
                                    Attachment(conversationsCustomchannelsFile = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ConversationsCustomchannelsLocationAttachment>(),
                                )
                                ?.let {
                                    Attachment(
                                        conversationsCustomchannelsLocation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ConversationsCustomchannelsContactAttachment>(),
                                )
                                ?.let {
                                    Attachment(
                                        conversationsCustomchannelsContact = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        ConversationsCustomchannelsUnsupportedContentAttachment
                                    >(),
                                )
                                ?.let {
                                    Attachment(
                                        conversationsCustomchannelsUnsupportedContent = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        ConversationsCustomchannelsMessageHeaderAttachment
                                    >(),
                                )
                                ?.let {
                                    Attachment(
                                        conversationsCustomchannelsMessageHeader = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        ConversationsCustomchannelsQuickRepliesAttachment
                                    >(),
                                )
                                ?.let {
                                    Attachment(
                                        conversationsCustomchannelsQuickReplies = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        ConversationsCustomchannelsSocialMetadataIntegrationAttachment
                                    >(),
                                )
                                ?.let {
                                    Attachment(
                                        conversationsCustomchannelsSocialMetadataIntegration = it,
                                        _json = json,
                                    )
                                },
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
                    value.conversationsCustomchannelsFile != null ->
                        generator.writeObject(value.conversationsCustomchannelsFile)
                    value.conversationsCustomchannelsLocation != null ->
                        generator.writeObject(value.conversationsCustomchannelsLocation)
                    value.conversationsCustomchannelsContact != null ->
                        generator.writeObject(value.conversationsCustomchannelsContact)
                    value.conversationsCustomchannelsUnsupportedContent != null ->
                        generator.writeObject(value.conversationsCustomchannelsUnsupportedContent)
                    value.conversationsCustomchannelsMessageHeader != null ->
                        generator.writeObject(value.conversationsCustomchannelsMessageHeader)
                    value.conversationsCustomchannelsQuickReplies != null ->
                        generator.writeObject(value.conversationsCustomchannelsQuickReplies)
                    value.conversationsCustomchannelsSocialMetadataIntegration != null ->
                        generator.writeObject(
                            value.conversationsCustomchannelsSocialMetadataIntegration
                        )
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Attachment")
                }
            }
        }

        class ConversationsCustomchannelsFileAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val fileId: JsonField<String>,
            private val type: JsonField<Type>,
            private val fileUsageType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("fileId")
                @ExcludeMissing
                fileId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("fileUsageType")
                @ExcludeMissing
                fileUsageType: JsonField<String> = JsonMissing.of(),
            ) : this(fileId, type, fileUsageType, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fileId(): String = fileId.getRequired("fileId")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fileUsageType(): Optional<String> = fileUsageType.getOptional("fileUsageType")

            /**
             * Returns the raw JSON value of [fileId].
             *
             * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fileId") @ExcludeMissing fun _fileId(): JsonField<String> = fileId

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [fileUsageType].
             *
             * Unlike [fileUsageType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fileUsageType")
            @ExcludeMissing
            fun _fileUsageType(): JsonField<String> = fileUsageType

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
                 * [ConversationsCustomchannelsFileAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .fileId()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsFileAttachment]. */
            class Builder internal constructor() {

                private var fileId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var fileUsageType: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsFileAttachment:
                        ConversationsCustomchannelsFileAttachment
                ) = apply {
                    fileId = conversationsCustomchannelsFileAttachment.fileId
                    type = conversationsCustomchannelsFileAttachment.type
                    fileUsageType = conversationsCustomchannelsFileAttachment.fileUsageType
                    additionalProperties =
                        conversationsCustomchannelsFileAttachment.additionalProperties
                            .toMutableMap()
                }

                fun fileId(fileId: String) = fileId(JsonField.of(fileId))

                /**
                 * Sets [Builder.fileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fileId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun fileUsageType(fileUsageType: String) =
                    fileUsageType(JsonField.of(fileUsageType))

                /**
                 * Sets [Builder.fileUsageType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fileUsageType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fileUsageType(fileUsageType: JsonField<String>) = apply {
                    this.fileUsageType = fileUsageType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ConversationsCustomchannelsFileAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .fileId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsFileAttachment =
                    ConversationsCustomchannelsFileAttachment(
                        checkRequired("fileId", fileId),
                        checkRequired("type", type),
                        fileUsageType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsFileAttachment = apply {
                if (validated) {
                    return@apply
                }

                fileId()
                type().validate()
                fileUsageType()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (fileId.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fileUsageType.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FILE = of("FILE")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    FILE
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FILE,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FILE -> Value.FILE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FILE -> Known.FILE
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsFileAttachment &&
                    fileId == other.fileId &&
                    type == other.type &&
                    fileUsageType == other.fileUsageType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(fileId, type, fileUsageType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsFileAttachment{fileId=$fileId, type=$type, fileUsageType=$fileUsageType, additionalProperties=$additionalProperties}"
        }

        class ConversationsCustomchannelsLocationAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val latitude: JsonField<Double>,
            private val longitude: JsonField<Double>,
            private val type: JsonField<Type>,
            private val address: JsonField<String>,
            private val name: JsonField<String>,
            private val url: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("latitude")
                @ExcludeMissing
                latitude: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("longitude")
                @ExcludeMissing
                longitude: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            ) : this(latitude, longitude, type, address, name, url, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun latitude(): Double = latitude.getRequired("latitude")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun longitude(): Double = longitude.getRequired("longitude")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun address(): Optional<String> = address.getOptional("address")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun url(): Optional<String> = url.getOptional("url")

            /**
             * Returns the raw JSON value of [latitude].
             *
             * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

            /**
             * Returns the raw JSON value of [longitude].
             *
             * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("longitude")
            @ExcludeMissing
            fun _longitude(): JsonField<Double> = longitude

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [url].
             *
             * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
                 * [ConversationsCustomchannelsLocationAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .latitude()
                 * .longitude()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsLocationAttachment]. */
            class Builder internal constructor() {

                private var latitude: JsonField<Double>? = null
                private var longitude: JsonField<Double>? = null
                private var type: JsonField<Type>? = null
                private var address: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var url: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsLocationAttachment:
                        ConversationsCustomchannelsLocationAttachment
                ) = apply {
                    latitude = conversationsCustomchannelsLocationAttachment.latitude
                    longitude = conversationsCustomchannelsLocationAttachment.longitude
                    type = conversationsCustomchannelsLocationAttachment.type
                    address = conversationsCustomchannelsLocationAttachment.address
                    name = conversationsCustomchannelsLocationAttachment.name
                    url = conversationsCustomchannelsLocationAttachment.url
                    additionalProperties =
                        conversationsCustomchannelsLocationAttachment.additionalProperties
                            .toMutableMap()
                }

                fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

                /**
                 * Sets [Builder.latitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.latitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

                fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

                /**
                 * Sets [Builder.longitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.longitude] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun address(address: String) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<String>) = apply { this.address = address }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun url(url: String) = url(JsonField.of(url))

                /**
                 * Sets [Builder.url] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.url] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun url(url: JsonField<String>) = apply { this.url = url }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ConversationsCustomchannelsLocationAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .latitude()
                 * .longitude()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsLocationAttachment =
                    ConversationsCustomchannelsLocationAttachment(
                        checkRequired("latitude", latitude),
                        checkRequired("longitude", longitude),
                        checkRequired("type", type),
                        address,
                        name,
                        url,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsLocationAttachment = apply {
                if (validated) {
                    return@apply
                }

                latitude()
                longitude()
                type().validate()
                address()
                name()
                url()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (latitude.asKnown().isPresent) 1 else 0) +
                    (if (longitude.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (address.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (url.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LOCATION = of("LOCATION")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    LOCATION
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LOCATION,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LOCATION -> Value.LOCATION
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LOCATION -> Known.LOCATION
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsLocationAttachment &&
                    latitude == other.latitude &&
                    longitude == other.longitude &&
                    type == other.type &&
                    address == other.address &&
                    name == other.name &&
                    url == other.url &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(latitude, longitude, type, address, name, url, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsLocationAttachment{latitude=$latitude, longitude=$longitude, type=$type, address=$address, name=$name, url=$url, additionalProperties=$additionalProperties}"
        }

        class ConversationsCustomchannelsContactAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contactProfile: JsonField<ContactProfile>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contactProfile")
                @ExcludeMissing
                contactProfile: JsonField<ContactProfile> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(contactProfile, type, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contactProfile(): ContactProfile = contactProfile.getRequired("contactProfile")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [contactProfile].
             *
             * Unlike [contactProfile], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("contactProfile")
            @ExcludeMissing
            fun _contactProfile(): JsonField<ContactProfile> = contactProfile

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [ConversationsCustomchannelsContactAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .contactProfile()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsContactAttachment]. */
            class Builder internal constructor() {

                private var contactProfile: JsonField<ContactProfile>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsContactAttachment:
                        ConversationsCustomchannelsContactAttachment
                ) = apply {
                    contactProfile = conversationsCustomchannelsContactAttachment.contactProfile
                    type = conversationsCustomchannelsContactAttachment.type
                    additionalProperties =
                        conversationsCustomchannelsContactAttachment.additionalProperties
                            .toMutableMap()
                }

                fun contactProfile(contactProfile: ContactProfile) =
                    contactProfile(JsonField.of(contactProfile))

                /**
                 * Sets [Builder.contactProfile] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactProfile] with a well-typed
                 * [ContactProfile] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun contactProfile(contactProfile: JsonField<ContactProfile>) = apply {
                    this.contactProfile = contactProfile
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ConversationsCustomchannelsContactAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contactProfile()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsContactAttachment =
                    ConversationsCustomchannelsContactAttachment(
                        checkRequired("contactProfile", contactProfile),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsContactAttachment = apply {
                if (validated) {
                    return@apply
                }

                contactProfile().validate()
                type().validate()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (contactProfile.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CONTACT = of("CONTACT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CONTACT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTACT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CONTACT -> Value.CONTACT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CONTACT -> Known.CONTACT
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsContactAttachment &&
                    contactProfile == other.contactProfile &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contactProfile, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsContactAttachment{contactProfile=$contactProfile, type=$type, additionalProperties=$additionalProperties}"
        }

        class ConversationsCustomchannelsUnsupportedContentAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of()
            ) : this(type, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [ConversationsCustomchannelsUnsupportedContentAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsUnsupportedContentAttachment]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsUnsupportedContentAttachment:
                        ConversationsCustomchannelsUnsupportedContentAttachment
                ) = apply {
                    type = conversationsCustomchannelsUnsupportedContentAttachment.type
                    additionalProperties =
                        conversationsCustomchannelsUnsupportedContentAttachment.additionalProperties
                            .toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of
                 * [ConversationsCustomchannelsUnsupportedContentAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsUnsupportedContentAttachment =
                    ConversationsCustomchannelsUnsupportedContentAttachment(
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsUnsupportedContentAttachment = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
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
            @JvmSynthetic
            internal fun validity(): Int = (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val UNSUPPORTED_CONTENT = of("UNSUPPORTED_CONTENT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    UNSUPPORTED_CONTENT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UNSUPPORTED_CONTENT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UNSUPPORTED_CONTENT -> Value.UNSUPPORTED_CONTENT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        UNSUPPORTED_CONTENT -> Known.UNSUPPORTED_CONTENT
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsUnsupportedContentAttachment &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsUnsupportedContentAttachment{type=$type, additionalProperties=$additionalProperties}"
        }

        class ConversationsCustomchannelsMessageHeaderAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val fileId: JsonField<Long>,
            private val text: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("fileId") @ExcludeMissing fileId: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            ) : this(type, fileId, text, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fileId(): Optional<Long> = fileId.getOptional("fileId")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [fileId].
             *
             * Unlike [fileId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fileId") @ExcludeMissing fun _fileId(): JsonField<Long> = fileId

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

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
                 * [ConversationsCustomchannelsMessageHeaderAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsMessageHeaderAttachment]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var fileId: JsonField<Long> = JsonMissing.of()
                private var text: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsMessageHeaderAttachment:
                        ConversationsCustomchannelsMessageHeaderAttachment
                ) = apply {
                    type = conversationsCustomchannelsMessageHeaderAttachment.type
                    fileId = conversationsCustomchannelsMessageHeaderAttachment.fileId
                    text = conversationsCustomchannelsMessageHeaderAttachment.text
                    additionalProperties =
                        conversationsCustomchannelsMessageHeaderAttachment.additionalProperties
                            .toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun fileId(fileId: Long) = fileId(JsonField.of(fileId))

                /**
                 * Sets [Builder.fileId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fileId] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fileId(fileId: JsonField<Long>) = apply { this.fileId = fileId }

                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) = apply { this.text = text }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of
                 * [ConversationsCustomchannelsMessageHeaderAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsMessageHeaderAttachment =
                    ConversationsCustomchannelsMessageHeaderAttachment(
                        checkRequired("type", type),
                        fileId,
                        text,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsMessageHeaderAttachment = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                fileId()
                text()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (fileId.asKnown().isPresent) 1 else 0) +
                    (if (text.asKnown().isPresent) 1 else 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MESSAGE_HEADER = of("MESSAGE_HEADER")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    MESSAGE_HEADER
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MESSAGE_HEADER,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MESSAGE_HEADER -> Value.MESSAGE_HEADER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MESSAGE_HEADER -> Known.MESSAGE_HEADER
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsMessageHeaderAttachment &&
                    type == other.type &&
                    fileId == other.fileId &&
                    text == other.text &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, fileId, text, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsMessageHeaderAttachment{type=$type, fileId=$fileId, text=$text, additionalProperties=$additionalProperties}"
        }

        class ConversationsCustomchannelsQuickRepliesAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val quickReplies: JsonField<List<QuickReply>>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("quickReplies")
                @ExcludeMissing
                quickReplies: JsonField<List<QuickReply>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(quickReplies, type, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quickReplies(): List<QuickReply> = quickReplies.getRequired("quickReplies")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [quickReplies].
             *
             * Unlike [quickReplies], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quickReplies")
            @ExcludeMissing
            fun _quickReplies(): JsonField<List<QuickReply>> = quickReplies

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [ConversationsCustomchannelsQuickRepliesAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .quickReplies()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsQuickRepliesAttachment]. */
            class Builder internal constructor() {

                private var quickReplies: JsonField<MutableList<QuickReply>>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsQuickRepliesAttachment:
                        ConversationsCustomchannelsQuickRepliesAttachment
                ) = apply {
                    quickReplies =
                        conversationsCustomchannelsQuickRepliesAttachment.quickReplies.map {
                            it.toMutableList()
                        }
                    type = conversationsCustomchannelsQuickRepliesAttachment.type
                    additionalProperties =
                        conversationsCustomchannelsQuickRepliesAttachment.additionalProperties
                            .toMutableMap()
                }

                fun quickReplies(quickReplies: List<QuickReply>) =
                    quickReplies(JsonField.of(quickReplies))

                /**
                 * Sets [Builder.quickReplies] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quickReplies] with a well-typed
                 * `List<QuickReply>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun quickReplies(quickReplies: JsonField<List<QuickReply>>) = apply {
                    this.quickReplies = quickReplies.map { it.toMutableList() }
                }

                /**
                 * Adds a single [QuickReply] to [quickReplies].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addQuickReply(quickReply: QuickReply) = apply {
                    quickReplies =
                        (quickReplies ?: JsonField.of(mutableListOf())).also {
                            checkKnown("quickReplies", it).add(quickReply)
                        }
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of
                 * [ConversationsCustomchannelsQuickRepliesAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .quickReplies()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsQuickRepliesAttachment =
                    ConversationsCustomchannelsQuickRepliesAttachment(
                        checkRequired("quickReplies", quickReplies).map { it.toImmutable() },
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsQuickRepliesAttachment = apply {
                if (validated) {
                    return@apply
                }

                quickReplies().forEach { it.validate() }
                type().validate()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (quickReplies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val QUICK_REPLIES = of("QUICK_REPLIES")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    QUICK_REPLIES
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUICK_REPLIES,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        QUICK_REPLIES -> Value.QUICK_REPLIES
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        QUICK_REPLIES -> Known.QUICK_REPLIES
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsQuickRepliesAttachment &&
                    quickReplies == other.quickReplies &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(quickReplies, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsQuickRepliesAttachment{quickReplies=$quickReplies, type=$type, additionalProperties=$additionalProperties}"
        }

        class ConversationsCustomchannelsSocialMetadataIntegrationAttachment
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val socialMetadata: JsonField<SocialMetadata>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("socialMetadata")
                @ExcludeMissing
                socialMetadata: JsonField<SocialMetadata> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(socialMetadata, type, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun socialMetadata(): SocialMetadata = socialMetadata.getRequired("socialMetadata")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [socialMetadata].
             *
             * Unlike [socialMetadata], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("socialMetadata")
            @ExcludeMissing
            fun _socialMetadata(): JsonField<SocialMetadata> = socialMetadata

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
                 * [ConversationsCustomchannelsSocialMetadataIntegrationAttachment].
                 *
                 * The following fields are required:
                 * ```java
                 * .socialMetadata()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ConversationsCustomchannelsSocialMetadataIntegrationAttachment]. */
            class Builder internal constructor() {

                private var socialMetadata: JsonField<SocialMetadata>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    conversationsCustomchannelsSocialMetadataIntegrationAttachment:
                        ConversationsCustomchannelsSocialMetadataIntegrationAttachment
                ) = apply {
                    socialMetadata =
                        conversationsCustomchannelsSocialMetadataIntegrationAttachment
                            .socialMetadata
                    type = conversationsCustomchannelsSocialMetadataIntegrationAttachment.type
                    additionalProperties =
                        conversationsCustomchannelsSocialMetadataIntegrationAttachment
                            .additionalProperties
                            .toMutableMap()
                }

                fun socialMetadata(socialMetadata: SocialMetadata) =
                    socialMetadata(JsonField.of(socialMetadata))

                /**
                 * Sets [Builder.socialMetadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.socialMetadata] with a well-typed
                 * [SocialMetadata] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun socialMetadata(socialMetadata: JsonField<SocialMetadata>) = apply {
                    this.socialMetadata = socialMetadata
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of
                 * [ConversationsCustomchannelsSocialMetadataIntegrationAttachment].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .socialMetadata()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ConversationsCustomchannelsSocialMetadataIntegrationAttachment =
                    ConversationsCustomchannelsSocialMetadataIntegrationAttachment(
                        checkRequired("socialMetadata", socialMetadata),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ConversationsCustomchannelsSocialMetadataIntegrationAttachment = apply {
                if (validated) {
                    return@apply
                }

                socialMetadata().validate()
                type().validate()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (socialMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SOCIAL_MEDIA_METADATA = of("SOCIAL_MEDIA_METADATA")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    SOCIAL_MEDIA_METADATA
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SOCIAL_MEDIA_METADATA,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SOCIAL_MEDIA_METADATA -> Value.SOCIAL_MEDIA_METADATA
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SOCIAL_MEDIA_METADATA -> Known.SOCIAL_MEDIA_METADATA
                        else -> throw HubspotInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws HubspotInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        HubspotInvalidDataException("Value is not a String")
                    }

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

                return other is ConversationsCustomchannelsSocialMetadataIntegrationAttachment &&
                    socialMetadata == other.socialMetadata &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(socialMetadata, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ConversationsCustomchannelsSocialMetadataIntegrationAttachment{socialMetadata=$socialMetadata, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    class MessageDirection @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INCOMING = of("INCOMING")

            @JvmField val OUTGOING = of("OUTGOING")

            @JvmStatic fun of(value: String) = MessageDirection(JsonField.of(value))
        }

        /** An enum containing [MessageDirection]'s known values. */
        enum class Known {
            INCOMING,
            OUTGOING,
        }

        /**
         * An enum containing [MessageDirection]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [MessageDirection] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING,
            OUTGOING,
            /**
             * An enum member indicating that [MessageDirection] was instantiated with an unknown
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INCOMING -> Known.INCOMING
                OUTGOING -> Known.OUTGOING
                else -> throw HubspotInvalidDataException("Unknown MessageDirection: $value")
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

        fun validate(): MessageDirection = apply {
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

            return other is MessageDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Recipient
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("deliveryIdentifier")
            @ExcludeMissing
            deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(deliveryIdentifier, name, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryIdentifier(): PublicDeliveryIdentifier =
            deliveryIdentifier.getRequired("deliveryIdentifier")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [deliveryIdentifier].
         *
         * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = deliveryIdentifier

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Recipient].
             *
             * The following fields are required:
             * ```java
             * .deliveryIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Recipient]. */
        class Builder internal constructor() {

            private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recipient: Recipient) = apply {
                deliveryIdentifier = recipient.deliveryIdentifier
                name = recipient.name
                additionalProperties = recipient.additionalProperties.toMutableMap()
            }

            fun deliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) =
                deliveryIdentifier(JsonField.of(deliveryIdentifier))

            /**
             * Sets [Builder.deliveryIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryIdentifier] with a well-typed
             * [PublicDeliveryIdentifier] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun deliveryIdentifier(deliveryIdentifier: JsonField<PublicDeliveryIdentifier>) =
                apply {
                    this.deliveryIdentifier = deliveryIdentifier
                }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Recipient].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deliveryIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Recipient =
                Recipient(
                    checkRequired("deliveryIdentifier", deliveryIdentifier),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Recipient = apply {
            if (validated) {
                return@apply
            }

            deliveryIdentifier().validate()
            name()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Recipient &&
                deliveryIdentifier == other.deliveryIdentifier &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deliveryIdentifier, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Recipient{deliveryIdentifier=$deliveryIdentifier, name=$name, additionalProperties=$additionalProperties}"
    }

    class Sender
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val deliveryIdentifier: JsonField<PublicDeliveryIdentifier>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("deliveryIdentifier")
            @ExcludeMissing
            deliveryIdentifier: JsonField<PublicDeliveryIdentifier> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(deliveryIdentifier, name, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryIdentifier(): PublicDeliveryIdentifier =
            deliveryIdentifier.getRequired("deliveryIdentifier")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [deliveryIdentifier].
         *
         * Unlike [deliveryIdentifier], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("deliveryIdentifier")
        @ExcludeMissing
        fun _deliveryIdentifier(): JsonField<PublicDeliveryIdentifier> = deliveryIdentifier

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Sender].
             *
             * The following fields are required:
             * ```java
             * .deliveryIdentifier()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sender]. */
        class Builder internal constructor() {

            private var deliveryIdentifier: JsonField<PublicDeliveryIdentifier>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sender: Sender) = apply {
                deliveryIdentifier = sender.deliveryIdentifier
                name = sender.name
                additionalProperties = sender.additionalProperties.toMutableMap()
            }

            fun deliveryIdentifier(deliveryIdentifier: PublicDeliveryIdentifier) =
                deliveryIdentifier(JsonField.of(deliveryIdentifier))

            /**
             * Sets [Builder.deliveryIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryIdentifier] with a well-typed
             * [PublicDeliveryIdentifier] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun deliveryIdentifier(deliveryIdentifier: JsonField<PublicDeliveryIdentifier>) =
                apply {
                    this.deliveryIdentifier = deliveryIdentifier
                }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Sender].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .deliveryIdentifier()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Sender =
                Sender(
                    checkRequired("deliveryIdentifier", deliveryIdentifier),
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Sender = apply {
            if (validated) {
                return@apply
            }

            deliveryIdentifier().validate()
            name()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (deliveryIdentifier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sender &&
                deliveryIdentifier == other.deliveryIdentifier &&
                name == other.name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(deliveryIdentifier, name, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sender{deliveryIdentifier=$deliveryIdentifier, name=$name, additionalProperties=$additionalProperties}"
    }

    class PreResolvedContacts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contacts: JsonField<List<Contact>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<List<Contact>> = JsonMissing.of()
        ) : this(contacts, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contacts(): List<Contact> = contacts.getRequired("contacts")

        /**
         * Returns the raw JSON value of [contacts].
         *
         * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contacts")
        @ExcludeMissing
        fun _contacts(): JsonField<List<Contact>> = contacts

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
             * Returns a mutable builder for constructing an instance of [PreResolvedContacts].
             *
             * The following fields are required:
             * ```java
             * .contacts()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PreResolvedContacts]. */
        class Builder internal constructor() {

            private var contacts: JsonField<MutableList<Contact>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(preResolvedContacts: PreResolvedContacts) = apply {
                contacts = preResolvedContacts.contacts.map { it.toMutableList() }
                additionalProperties = preResolvedContacts.additionalProperties.toMutableMap()
            }

            fun contacts(contacts: List<Contact>) = contacts(JsonField.of(contacts))

            /**
             * Sets [Builder.contacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contacts] with a well-typed `List<Contact>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contacts(contacts: JsonField<List<Contact>>) = apply {
                this.contacts = contacts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Contact] to [contacts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContact(contact: Contact) = apply {
                contacts =
                    (contacts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contacts", it).add(contact)
                    }
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
             * Returns an immutable instance of [PreResolvedContacts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contacts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PreResolvedContacts =
                PreResolvedContacts(
                    checkRequired("contacts", contacts).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PreResolvedContacts = apply {
            if (validated) {
                return@apply
            }

            contacts().forEach { it.validate() }
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
        @JvmSynthetic
        internal fun validity(): Int =
            (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Contact
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contactPropertiesLeadingToMatch: JsonField<List<String>>,
            private val contactVid: JsonField<Int>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contactPropertiesLeadingToMatch")
                @ExcludeMissing
                contactPropertiesLeadingToMatch: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("contactVid")
                @ExcludeMissing
                contactVid: JsonField<Int> = JsonMissing.of(),
            ) : this(contactPropertiesLeadingToMatch, contactVid, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contactPropertiesLeadingToMatch(): List<String> =
                contactPropertiesLeadingToMatch.getRequired("contactPropertiesLeadingToMatch")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contactVid(): Int = contactVid.getRequired("contactVid")

            /**
             * Returns the raw JSON value of [contactPropertiesLeadingToMatch].
             *
             * Unlike [contactPropertiesLeadingToMatch], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("contactPropertiesLeadingToMatch")
            @ExcludeMissing
            fun _contactPropertiesLeadingToMatch(): JsonField<List<String>> =
                contactPropertiesLeadingToMatch

            /**
             * Returns the raw JSON value of [contactVid].
             *
             * Unlike [contactVid], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contactVid")
            @ExcludeMissing
            fun _contactVid(): JsonField<Int> = contactVid

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
                 * Returns a mutable builder for constructing an instance of [Contact].
                 *
                 * The following fields are required:
                 * ```java
                 * .contactPropertiesLeadingToMatch()
                 * .contactVid()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contact]. */
            class Builder internal constructor() {

                private var contactPropertiesLeadingToMatch: JsonField<MutableList<String>>? = null
                private var contactVid: JsonField<Int>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contact: Contact) = apply {
                    contactPropertiesLeadingToMatch =
                        contact.contactPropertiesLeadingToMatch.map { it.toMutableList() }
                    contactVid = contact.contactVid
                    additionalProperties = contact.additionalProperties.toMutableMap()
                }

                fun contactPropertiesLeadingToMatch(contactPropertiesLeadingToMatch: List<String>) =
                    contactPropertiesLeadingToMatch(JsonField.of(contactPropertiesLeadingToMatch))

                /**
                 * Sets [Builder.contactPropertiesLeadingToMatch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactPropertiesLeadingToMatch] with a
                 * well-typed `List<String>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun contactPropertiesLeadingToMatch(
                    contactPropertiesLeadingToMatch: JsonField<List<String>>
                ) = apply {
                    this.contactPropertiesLeadingToMatch =
                        contactPropertiesLeadingToMatch.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.contactPropertiesLeadingToMatch].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addContactPropertiesLeadingToMatch(contactPropertiesLeadingToMatch: String) =
                    apply {
                        this.contactPropertiesLeadingToMatch =
                            (this.contactPropertiesLeadingToMatch ?: JsonField.of(mutableListOf()))
                                .also {
                                    checkKnown("contactPropertiesLeadingToMatch", it)
                                        .add(contactPropertiesLeadingToMatch)
                                }
                    }

                fun contactVid(contactVid: Int) = contactVid(JsonField.of(contactVid))

                /**
                 * Sets [Builder.contactVid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contactVid] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contactVid(contactVid: JsonField<Int>) = apply { this.contactVid = contactVid }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Contact].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contactPropertiesLeadingToMatch()
                 * .contactVid()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Contact =
                    Contact(
                        checkRequired(
                                "contactPropertiesLeadingToMatch",
                                contactPropertiesLeadingToMatch,
                            )
                            .map { it.toImmutable() },
                        checkRequired("contactVid", contactVid),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Contact = apply {
                if (validated) {
                    return@apply
                }

                contactPropertiesLeadingToMatch()
                contactVid()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (contactPropertiesLeadingToMatch.asKnown().getOrNull()?.size ?: 0) +
                    (if (contactVid.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contact &&
                    contactPropertiesLeadingToMatch == other.contactPropertiesLeadingToMatch &&
                    contactVid == other.contactVid &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contactPropertiesLeadingToMatch, contactVid, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Contact{contactPropertiesLeadingToMatch=$contactPropertiesLeadingToMatch, contactVid=$contactVid, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PreResolvedContacts &&
                contacts == other.contacts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(contacts, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PreResolvedContacts{contacts=$contacts, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MessageCreateParams &&
            channelId == other.channelId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(channelId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MessageCreateParams{channelId=$channelId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
