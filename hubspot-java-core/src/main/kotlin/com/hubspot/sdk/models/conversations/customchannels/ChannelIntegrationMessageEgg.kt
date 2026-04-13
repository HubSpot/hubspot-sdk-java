// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.allMaxBy
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ChannelIntegrationMessageEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attachments: JsonField<List<Attachment>>,
    private val channelAccountId: JsonField<String>,
    private val messageDirection: JsonField<MessageDirection>,
    private val recipients: JsonField<List<ChannelIntegrationParticipant>>,
    private val senders: JsonField<List<ChannelIntegrationParticipant>>,
    private val text: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val associateWithContactId: JsonField<Long>,
    private val inReplyToId: JsonField<String>,
    private val integrationIdempotencyId: JsonField<String>,
    private val integrationThreadId: JsonField<String>,
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
        @JsonProperty("messageDirection")
        @ExcludeMissing
        messageDirection: JsonField<MessageDirection> = JsonMissing.of(),
        @JsonProperty("recipients")
        @ExcludeMissing
        recipients: JsonField<List<ChannelIntegrationParticipant>> = JsonMissing.of(),
        @JsonProperty("senders")
        @ExcludeMissing
        senders: JsonField<List<ChannelIntegrationParticipant>> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("associateWithContactId")
        @ExcludeMissing
        associateWithContactId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inReplyToId")
        @ExcludeMissing
        inReplyToId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integrationIdempotencyId")
        @ExcludeMissing
        integrationIdempotencyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integrationThreadId")
        @ExcludeMissing
        integrationThreadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preResolvedContacts")
        @ExcludeMissing
        preResolvedContacts: JsonField<PreResolvedContacts> = JsonMissing.of(),
        @JsonProperty("richText") @ExcludeMissing richText: JsonField<String> = JsonMissing.of(),
    ) : this(
        attachments,
        channelAccountId,
        messageDirection,
        recipients,
        senders,
        text,
        timestamp,
        associateWithContactId,
        inReplyToId,
        integrationIdempotencyId,
        integrationThreadId,
        preResolvedContacts,
        richText,
        mutableMapOf(),
    )

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
    fun messageDirection(): MessageDirection = messageDirection.getRequired("messageDirection")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipients(): List<ChannelIntegrationParticipant> = recipients.getRequired("recipients")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senders(): List<ChannelIntegrationParticipant> = senders.getRequired("senders")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun associateWithContactId(): Optional<Long> =
        associateWithContactId.getOptional("associateWithContactId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inReplyToId(): Optional<String> = inReplyToId.getOptional("inReplyToId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationIdempotencyId(): Optional<String> =
        integrationIdempotencyId.getOptional("integrationIdempotencyId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationThreadId(): Optional<String> =
        integrationThreadId.getOptional("integrationThreadId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preResolvedContacts(): Optional<PreResolvedContacts> =
        preResolvedContacts.getOptional("preResolvedContacts")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
    fun _recipients(): JsonField<List<ChannelIntegrationParticipant>> = recipients

    /**
     * Returns the raw JSON value of [senders].
     *
     * Unlike [senders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senders")
    @ExcludeMissing
    fun _senders(): JsonField<List<ChannelIntegrationParticipant>> = senders

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
     * Returns the raw JSON value of [associateWithContactId].
     *
     * Unlike [associateWithContactId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("associateWithContactId")
    @ExcludeMissing
    fun _associateWithContactId(): JsonField<Long> = associateWithContactId

    /**
     * Returns the raw JSON value of [inReplyToId].
     *
     * Unlike [inReplyToId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inReplyToId") @ExcludeMissing fun _inReplyToId(): JsonField<String> = inReplyToId

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
     * Returns the raw JSON value of [integrationThreadId].
     *
     * Unlike [integrationThreadId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integrationThreadId")
    @ExcludeMissing
    fun _integrationThreadId(): JsonField<String> = integrationThreadId

    /**
     * Returns the raw JSON value of [preResolvedContacts].
     *
     * Unlike [preResolvedContacts], this method doesn't throw if the JSON field has an unexpected
     * type.
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
         * Returns a mutable builder for constructing an instance of [ChannelIntegrationMessageEgg].
         *
         * The following fields are required:
         * ```java
         * .attachments()
         * .channelAccountId()
         * .messageDirection()
         * .recipients()
         * .senders()
         * .text()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelIntegrationMessageEgg]. */
    class Builder internal constructor() {

        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var channelAccountId: JsonField<String>? = null
        private var messageDirection: JsonField<MessageDirection>? = null
        private var recipients: JsonField<MutableList<ChannelIntegrationParticipant>>? = null
        private var senders: JsonField<MutableList<ChannelIntegrationParticipant>>? = null
        private var text: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var associateWithContactId: JsonField<Long> = JsonMissing.of()
        private var inReplyToId: JsonField<String> = JsonMissing.of()
        private var integrationIdempotencyId: JsonField<String> = JsonMissing.of()
        private var integrationThreadId: JsonField<String> = JsonMissing.of()
        private var preResolvedContacts: JsonField<PreResolvedContacts> = JsonMissing.of()
        private var richText: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(channelIntegrationMessageEgg: ChannelIntegrationMessageEgg) = apply {
            attachments = channelIntegrationMessageEgg.attachments.map { it.toMutableList() }
            channelAccountId = channelIntegrationMessageEgg.channelAccountId
            messageDirection = channelIntegrationMessageEgg.messageDirection
            recipients = channelIntegrationMessageEgg.recipients.map { it.toMutableList() }
            senders = channelIntegrationMessageEgg.senders.map { it.toMutableList() }
            text = channelIntegrationMessageEgg.text
            timestamp = channelIntegrationMessageEgg.timestamp
            associateWithContactId = channelIntegrationMessageEgg.associateWithContactId
            inReplyToId = channelIntegrationMessageEgg.inReplyToId
            integrationIdempotencyId = channelIntegrationMessageEgg.integrationIdempotencyId
            integrationThreadId = channelIntegrationMessageEgg.integrationThreadId
            preResolvedContacts = channelIntegrationMessageEgg.preResolvedContacts
            richText = channelIntegrationMessageEgg.richText
            additionalProperties = channelIntegrationMessageEgg.additionalProperties.toMutableMap()
        }

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

        /** Alias for calling [addAttachment] with `Attachment.ofFile(file)`. */
        fun addAttachment(file: FileAttachment) = addAttachment(Attachment.ofFile(file))

        /** Alias for calling [addAttachment] with `Attachment.ofLocation(location)`. */
        fun addAttachment(location: LocationAttachment) =
            addAttachment(Attachment.ofLocation(location))

        /** Alias for calling [addAttachment] with `Attachment.ofContact(contact)`. */
        fun addAttachment(contact: ContactAttachment) = addAttachment(Attachment.ofContact(contact))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofUnsupportedContent(unsupportedContent)`.
         */
        fun addAttachment(unsupportedContent: UnsupportedContentAttachment) =
            addAttachment(Attachment.ofUnsupportedContent(unsupportedContent))

        /** Alias for calling [addAttachment] with `Attachment.ofMessageHeader(messageHeader)`. */
        fun addAttachment(messageHeader: MessageHeaderAttachment) =
            addAttachment(Attachment.ofMessageHeader(messageHeader))

        /** Alias for calling [addAttachment] with `Attachment.ofQuickReplies(quickReplies)`. */
        fun addAttachment(quickReplies: QuickRepliesAttachment) =
            addAttachment(Attachment.ofQuickReplies(quickReplies))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofSocialMetadataIntegration(socialMetadataIntegration)`.
         */
        fun addAttachment(socialMetadataIntegration: SocialMetadataIntegrationAttachment) =
            addAttachment(Attachment.ofSocialMetadataIntegration(socialMetadataIntegration))

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

        fun messageDirection(messageDirection: MessageDirection) =
            messageDirection(JsonField.of(messageDirection))

        /**
         * Sets [Builder.messageDirection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messageDirection] with a well-typed [MessageDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun messageDirection(messageDirection: JsonField<MessageDirection>) = apply {
            this.messageDirection = messageDirection
        }

        fun recipients(recipients: List<ChannelIntegrationParticipant>) =
            recipients(JsonField.of(recipients))

        /**
         * Sets [Builder.recipients] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipients] with a well-typed
         * `List<ChannelIntegrationParticipant>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun recipients(recipients: JsonField<List<ChannelIntegrationParticipant>>) = apply {
            this.recipients = recipients.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelIntegrationParticipant] to [recipients].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecipient(recipient: ChannelIntegrationParticipant) = apply {
            recipients =
                (recipients ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recipients", it).add(recipient)
                }
        }

        fun senders(senders: List<ChannelIntegrationParticipant>) = senders(JsonField.of(senders))

        /**
         * Sets [Builder.senders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senders] with a well-typed
         * `List<ChannelIntegrationParticipant>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun senders(senders: JsonField<List<ChannelIntegrationParticipant>>) = apply {
            this.senders = senders.map { it.toMutableList() }
        }

        /**
         * Adds a single [ChannelIntegrationParticipant] to [senders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSender(sender: ChannelIntegrationParticipant) = apply {
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

        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun associateWithContactId(associateWithContactId: Long) =
            associateWithContactId(JsonField.of(associateWithContactId))

        /**
         * Sets [Builder.associateWithContactId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.associateWithContactId] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun associateWithContactId(associateWithContactId: JsonField<Long>) = apply {
            this.associateWithContactId = associateWithContactId
        }

        fun inReplyToId(inReplyToId: String) = inReplyToId(JsonField.of(inReplyToId))

        /**
         * Sets [Builder.inReplyToId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inReplyToId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inReplyToId(inReplyToId: JsonField<String>) = apply { this.inReplyToId = inReplyToId }

        fun integrationIdempotencyId(integrationIdempotencyId: String) =
            integrationIdempotencyId(JsonField.of(integrationIdempotencyId))

        /**
         * Sets [Builder.integrationIdempotencyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationIdempotencyId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrationIdempotencyId(integrationIdempotencyId: JsonField<String>) = apply {
            this.integrationIdempotencyId = integrationIdempotencyId
        }

        fun integrationThreadId(integrationThreadId: String) =
            integrationThreadId(JsonField.of(integrationThreadId))

        /**
         * Sets [Builder.integrationThreadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationThreadId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integrationThreadId(integrationThreadId: JsonField<String>) = apply {
            this.integrationThreadId = integrationThreadId
        }

        fun preResolvedContacts(preResolvedContacts: PreResolvedContacts) =
            preResolvedContacts(JsonField.of(preResolvedContacts))

        /**
         * Sets [Builder.preResolvedContacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preResolvedContacts] with a well-typed
         * [PreResolvedContacts] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun preResolvedContacts(preResolvedContacts: JsonField<PreResolvedContacts>) = apply {
            this.preResolvedContacts = preResolvedContacts
        }

        fun richText(richText: String) = richText(JsonField.of(richText))

        /**
         * Sets [Builder.richText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [ChannelIntegrationMessageEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attachments()
         * .channelAccountId()
         * .messageDirection()
         * .recipients()
         * .senders()
         * .text()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelIntegrationMessageEgg =
            ChannelIntegrationMessageEgg(
                checkRequired("attachments", attachments).map { it.toImmutable() },
                checkRequired("channelAccountId", channelAccountId),
                checkRequired("messageDirection", messageDirection),
                checkRequired("recipients", recipients).map { it.toImmutable() },
                checkRequired("senders", senders).map { it.toImmutable() },
                checkRequired("text", text),
                checkRequired("timestamp", timestamp),
                associateWithContactId,
                inReplyToId,
                integrationIdempotencyId,
                integrationThreadId,
                preResolvedContacts,
                richText,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChannelIntegrationMessageEgg = apply {
        if (validated) {
            return@apply
        }

        attachments().forEach { it.validate() }
        channelAccountId()
        messageDirection().validate()
        recipients().forEach { it.validate() }
        senders().forEach { it.validate() }
        text()
        timestamp()
        associateWithContactId()
        inReplyToId()
        integrationIdempotencyId()
        integrationThreadId()
        preResolvedContacts().ifPresent { it.validate() }
        richText()
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
        (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (channelAccountId.asKnown().isPresent) 1 else 0) +
            (messageDirection.asKnown().getOrNull()?.validity() ?: 0) +
            (recipients.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (senders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (associateWithContactId.asKnown().isPresent) 1 else 0) +
            (if (inReplyToId.asKnown().isPresent) 1 else 0) +
            (if (integrationIdempotencyId.asKnown().isPresent) 1 else 0) +
            (if (integrationThreadId.asKnown().isPresent) 1 else 0) +
            (preResolvedContacts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (richText.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Attachment.Deserializer::class)
    @JsonSerialize(using = Attachment.Serializer::class)
    class Attachment
    private constructor(
        private val file: FileAttachment? = null,
        private val location: LocationAttachment? = null,
        private val contact: ContactAttachment? = null,
        private val unsupportedContent: UnsupportedContentAttachment? = null,
        private val messageHeader: MessageHeaderAttachment? = null,
        private val quickReplies: QuickRepliesAttachment? = null,
        private val socialMetadataIntegration: SocialMetadataIntegrationAttachment? = null,
        private val _json: JsonValue? = null,
    ) {

        fun file(): Optional<FileAttachment> = Optional.ofNullable(file)

        fun location(): Optional<LocationAttachment> = Optional.ofNullable(location)

        fun contact(): Optional<ContactAttachment> = Optional.ofNullable(contact)

        fun unsupportedContent(): Optional<UnsupportedContentAttachment> =
            Optional.ofNullable(unsupportedContent)

        fun messageHeader(): Optional<MessageHeaderAttachment> = Optional.ofNullable(messageHeader)

        fun quickReplies(): Optional<QuickRepliesAttachment> = Optional.ofNullable(quickReplies)

        fun socialMetadataIntegration(): Optional<SocialMetadataIntegrationAttachment> =
            Optional.ofNullable(socialMetadataIntegration)

        fun isFile(): Boolean = file != null

        fun isLocation(): Boolean = location != null

        fun isContact(): Boolean = contact != null

        fun isUnsupportedContent(): Boolean = unsupportedContent != null

        fun isMessageHeader(): Boolean = messageHeader != null

        fun isQuickReplies(): Boolean = quickReplies != null

        fun isSocialMetadataIntegration(): Boolean = socialMetadataIntegration != null

        fun asFile(): FileAttachment = file.getOrThrow("file")

        fun asLocation(): LocationAttachment = location.getOrThrow("location")

        fun asContact(): ContactAttachment = contact.getOrThrow("contact")

        fun asUnsupportedContent(): UnsupportedContentAttachment =
            unsupportedContent.getOrThrow("unsupportedContent")

        fun asMessageHeader(): MessageHeaderAttachment = messageHeader.getOrThrow("messageHeader")

        fun asQuickReplies(): QuickRepliesAttachment = quickReplies.getOrThrow("quickReplies")

        fun asSocialMetadataIntegration(): SocialMetadataIntegrationAttachment =
            socialMetadataIntegration.getOrThrow("socialMetadataIntegration")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                file != null -> visitor.visitFile(file)
                location != null -> visitor.visitLocation(location)
                contact != null -> visitor.visitContact(contact)
                unsupportedContent != null -> visitor.visitUnsupportedContent(unsupportedContent)
                messageHeader != null -> visitor.visitMessageHeader(messageHeader)
                quickReplies != null -> visitor.visitQuickReplies(quickReplies)
                socialMetadataIntegration != null ->
                    visitor.visitSocialMetadataIntegration(socialMetadataIntegration)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitFile(file: FileAttachment) {
                        file.validate()
                    }

                    override fun visitLocation(location: LocationAttachment) {
                        location.validate()
                    }

                    override fun visitContact(contact: ContactAttachment) {
                        contact.validate()
                    }

                    override fun visitUnsupportedContent(
                        unsupportedContent: UnsupportedContentAttachment
                    ) {
                        unsupportedContent.validate()
                    }

                    override fun visitMessageHeader(messageHeader: MessageHeaderAttachment) {
                        messageHeader.validate()
                    }

                    override fun visitQuickReplies(quickReplies: QuickRepliesAttachment) {
                        quickReplies.validate()
                    }

                    override fun visitSocialMetadataIntegration(
                        socialMetadataIntegration: SocialMetadataIntegrationAttachment
                    ) {
                        socialMetadataIntegration.validate()
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
                    override fun visitFile(file: FileAttachment) = file.validity()

                    override fun visitLocation(location: LocationAttachment) = location.validity()

                    override fun visitContact(contact: ContactAttachment) = contact.validity()

                    override fun visitUnsupportedContent(
                        unsupportedContent: UnsupportedContentAttachment
                    ) = unsupportedContent.validity()

                    override fun visitMessageHeader(messageHeader: MessageHeaderAttachment) =
                        messageHeader.validity()

                    override fun visitQuickReplies(quickReplies: QuickRepliesAttachment) =
                        quickReplies.validity()

                    override fun visitSocialMetadataIntegration(
                        socialMetadataIntegration: SocialMetadataIntegrationAttachment
                    ) = socialMetadataIntegration.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                file == other.file &&
                location == other.location &&
                contact == other.contact &&
                unsupportedContent == other.unsupportedContent &&
                messageHeader == other.messageHeader &&
                quickReplies == other.quickReplies &&
                socialMetadataIntegration == other.socialMetadataIntegration
        }

        override fun hashCode(): Int =
            Objects.hash(
                file,
                location,
                contact,
                unsupportedContent,
                messageHeader,
                quickReplies,
                socialMetadataIntegration,
            )

        override fun toString(): String =
            when {
                file != null -> "Attachment{file=$file}"
                location != null -> "Attachment{location=$location}"
                contact != null -> "Attachment{contact=$contact}"
                unsupportedContent != null -> "Attachment{unsupportedContent=$unsupportedContent}"
                messageHeader != null -> "Attachment{messageHeader=$messageHeader}"
                quickReplies != null -> "Attachment{quickReplies=$quickReplies}"
                socialMetadataIntegration != null ->
                    "Attachment{socialMetadataIntegration=$socialMetadataIntegration}"
                _json != null -> "Attachment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Attachment")
            }

        companion object {

            @JvmStatic fun ofFile(file: FileAttachment) = Attachment(file = file)

            @JvmStatic
            fun ofLocation(location: LocationAttachment) = Attachment(location = location)

            @JvmStatic fun ofContact(contact: ContactAttachment) = Attachment(contact = contact)

            @JvmStatic
            fun ofUnsupportedContent(unsupportedContent: UnsupportedContentAttachment) =
                Attachment(unsupportedContent = unsupportedContent)

            @JvmStatic
            fun ofMessageHeader(messageHeader: MessageHeaderAttachment) =
                Attachment(messageHeader = messageHeader)

            @JvmStatic
            fun ofQuickReplies(quickReplies: QuickRepliesAttachment) =
                Attachment(quickReplies = quickReplies)

            @JvmStatic
            fun ofSocialMetadataIntegration(
                socialMetadataIntegration: SocialMetadataIntegrationAttachment
            ) = Attachment(socialMetadataIntegration = socialMetadataIntegration)
        }

        /**
         * An interface that defines how to map each variant of [Attachment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitFile(file: FileAttachment): T

            fun visitLocation(location: LocationAttachment): T

            fun visitContact(contact: ContactAttachment): T

            fun visitUnsupportedContent(unsupportedContent: UnsupportedContentAttachment): T

            fun visitMessageHeader(messageHeader: MessageHeaderAttachment): T

            fun visitQuickReplies(quickReplies: QuickRepliesAttachment): T

            fun visitSocialMetadataIntegration(
                socialMetadataIntegration: SocialMetadataIntegrationAttachment
            ): T

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
                            tryDeserialize(node, jacksonTypeRef<FileAttachment>())?.let {
                                Attachment(file = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LocationAttachment>())?.let {
                                Attachment(location = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ContactAttachment>())?.let {
                                Attachment(contact = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<UnsupportedContentAttachment>())
                                ?.let { Attachment(unsupportedContent = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<MessageHeaderAttachment>())?.let {
                                Attachment(messageHeader = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<QuickRepliesAttachment>())?.let {
                                Attachment(quickReplies = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<SocialMetadataIntegrationAttachment>(),
                                )
                                ?.let { Attachment(socialMetadataIntegration = it, _json = json) },
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
                    value.file != null -> generator.writeObject(value.file)
                    value.location != null -> generator.writeObject(value.location)
                    value.contact != null -> generator.writeObject(value.contact)
                    value.unsupportedContent != null ->
                        generator.writeObject(value.unsupportedContent)
                    value.messageHeader != null -> generator.writeObject(value.messageHeader)
                    value.quickReplies != null -> generator.writeObject(value.quickReplies)
                    value.socialMetadataIntegration != null ->
                        generator.writeObject(value.socialMetadataIntegration)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Attachment")
                }
            }
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INCOMING -> Known.INCOMING
                OUTGOING -> Known.OUTGOING
                else -> throw HubSpotInvalidDataException("Unknown MessageDirection: $value")
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

            return other is MessageDirection && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChannelIntegrationMessageEgg &&
            attachments == other.attachments &&
            channelAccountId == other.channelAccountId &&
            messageDirection == other.messageDirection &&
            recipients == other.recipients &&
            senders == other.senders &&
            text == other.text &&
            timestamp == other.timestamp &&
            associateWithContactId == other.associateWithContactId &&
            inReplyToId == other.inReplyToId &&
            integrationIdempotencyId == other.integrationIdempotencyId &&
            integrationThreadId == other.integrationThreadId &&
            preResolvedContacts == other.preResolvedContacts &&
            richText == other.richText &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attachments,
            channelAccountId,
            messageDirection,
            recipients,
            senders,
            text,
            timestamp,
            associateWithContactId,
            inReplyToId,
            integrationIdempotencyId,
            integrationThreadId,
            preResolvedContacts,
            richText,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChannelIntegrationMessageEgg{attachments=$attachments, channelAccountId=$channelAccountId, messageDirection=$messageDirection, recipients=$recipients, senders=$senders, text=$text, timestamp=$timestamp, associateWithContactId=$associateWithContactId, inReplyToId=$inReplyToId, integrationIdempotencyId=$integrationIdempotencyId, integrationThreadId=$integrationThreadId, preResolvedContacts=$preResolvedContacts, richText=$richText, additionalProperties=$additionalProperties}"
}
