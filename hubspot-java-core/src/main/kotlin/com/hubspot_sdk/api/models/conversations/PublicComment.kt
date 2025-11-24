// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

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
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicComment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val attachments: JsonField<List<Attachment>>,
    private val client: JsonField<PublicClient>,
    private val conversationsThreadId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val recipients: JsonField<List<PublicRecipient>>,
    private val richText: JsonField<String>,
    private val senders: JsonField<List<PublicSender>>,
    private val text: JsonField<String>,
    private val type: JsonField<Type>,
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
        @JsonProperty("client") @ExcludeMissing client: JsonField<PublicClient> = JsonMissing.of(),
        @JsonProperty("conversationsThreadId")
        @ExcludeMissing
        conversationsThreadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipients")
        @ExcludeMissing
        recipients: JsonField<List<PublicRecipient>> = JsonMissing.of(),
        @JsonProperty("richText") @ExcludeMissing richText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("senders")
        @ExcludeMissing
        senders: JsonField<List<PublicSender>> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        attachments,
        client,
        conversationsThreadId,
        createdAt,
        createdBy,
        recipients,
        richText,
        senders,
        text,
        type,
        updatedAt,
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
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attachments(): List<Attachment> = attachments.getRequired("attachments")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun client(): PublicClient = client.getRequired("client")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun conversationsThreadId(): String = conversationsThreadId.getRequired("conversationsThreadId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): String = createdBy.getRequired("createdBy")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipients(): List<PublicRecipient> = recipients.getRequired("recipients")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun richText(): String = richText.getRequired("richText")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senders(): List<PublicSender> = senders.getRequired("senders")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun text(): String = text.getRequired("text")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Returns the raw JSON value of [recipients].
     *
     * Unlike [recipients], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipients")
    @ExcludeMissing
    fun _recipients(): JsonField<List<PublicRecipient>> = recipients

    /**
     * Returns the raw JSON value of [richText].
     *
     * Unlike [richText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("richText") @ExcludeMissing fun _richText(): JsonField<String> = richText

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [PublicComment].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .attachments()
         * .client()
         * .conversationsThreadId()
         * .createdAt()
         * .createdBy()
         * .recipients()
         * .richText()
         * .senders()
         * .text()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicComment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean>? = null
        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var client: JsonField<PublicClient>? = null
        private var conversationsThreadId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String>? = null
        private var recipients: JsonField<MutableList<PublicRecipient>>? = null
        private var richText: JsonField<String>? = null
        private var senders: JsonField<MutableList<PublicSender>>? = null
        private var text: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicComment: PublicComment) = apply {
            id = publicComment.id
            archived = publicComment.archived
            attachments = publicComment.attachments.map { it.toMutableList() }
            client = publicComment.client
            conversationsThreadId = publicComment.conversationsThreadId
            createdAt = publicComment.createdAt
            createdBy = publicComment.createdBy
            recipients = publicComment.recipients.map { it.toMutableList() }
            richText = publicComment.richText
            senders = publicComment.senders.map { it.toMutableList() }
            text = publicComment.text
            type = publicComment.type
            updatedAt = publicComment.updatedAt
            additionalProperties = publicComment.additionalProperties.toMutableMap()
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

        fun richText(richText: String) = richText(JsonField.of(richText))

        /**
         * Sets [Builder.richText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun richText(richText: JsonField<String>) = apply { this.richText = richText }

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

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [PublicComment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .attachments()
         * .client()
         * .conversationsThreadId()
         * .createdAt()
         * .createdBy()
         * .recipients()
         * .richText()
         * .senders()
         * .text()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicComment =
            PublicComment(
                checkRequired("id", id),
                checkRequired("archived", archived),
                checkRequired("attachments", attachments).map { it.toImmutable() },
                checkRequired("client", client),
                checkRequired("conversationsThreadId", conversationsThreadId),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("recipients", recipients).map { it.toImmutable() },
                checkRequired("richText", richText),
                checkRequired("senders", senders).map { it.toImmutable() },
                checkRequired("text", text),
                checkRequired("type", type),
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicComment = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        attachments().forEach { it.validate() }
        client().validate()
        conversationsThreadId()
        createdAt()
        createdBy()
        recipients().forEach { it.validate() }
        richText()
        senders().forEach { it.validate() }
        text()
        type().validate()
        updatedAt()
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
            (if (archived.asKnown().isPresent) 1 else 0) +
            (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (client.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conversationsThreadId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (recipients.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (richText.asKnown().isPresent) 1 else 0) +
            (senders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
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

            @JvmField val COMMENT = of("COMMENT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            COMMENT
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
            COMMENT,
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
                COMMENT -> Value.COMMENT
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
                COMMENT -> Known.COMMENT
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

        return other is PublicComment &&
            id == other.id &&
            archived == other.archived &&
            attachments == other.attachments &&
            client == other.client &&
            conversationsThreadId == other.conversationsThreadId &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            recipients == other.recipients &&
            richText == other.richText &&
            senders == other.senders &&
            text == other.text &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            attachments,
            client,
            conversationsThreadId,
            createdAt,
            createdBy,
            recipients,
            richText,
            senders,
            text,
            type,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicComment{id=$id, archived=$archived, attachments=$attachments, client=$client, conversationsThreadId=$conversationsThreadId, createdAt=$createdAt, createdBy=$createdBy, recipients=$recipients, richText=$richText, senders=$senders, text=$text, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
