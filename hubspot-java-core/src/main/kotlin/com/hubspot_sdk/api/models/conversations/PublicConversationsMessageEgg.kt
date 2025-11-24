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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicConversationsMessageEgg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attachments: JsonField<List<Attachment>>,
    private val channelAccountId: JsonField<String>,
    private val channelId: JsonField<String>,
    private val recipients: JsonField<List<PublicRecipientEgg>>,
    private val senderActorId: JsonField<String>,
    private val text: JsonField<String>,
    private val type: JsonField<Type>,
    private val richText: JsonField<String>,
    private val subject: JsonField<String>,
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
        @JsonProperty("channelId") @ExcludeMissing channelId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recipients")
        @ExcludeMissing
        recipients: JsonField<List<PublicRecipientEgg>> = JsonMissing.of(),
        @JsonProperty("senderActorId")
        @ExcludeMissing
        senderActorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("richText") @ExcludeMissing richText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subject") @ExcludeMissing subject: JsonField<String> = JsonMissing.of(),
    ) : this(
        attachments,
        channelAccountId,
        channelId,
        recipients,
        senderActorId,
        text,
        type,
        richText,
        subject,
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
    fun channelId(): String = channelId.getRequired("channelId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipients(): List<PublicRecipientEgg> = recipients.getRequired("recipients")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun senderActorId(): String = senderActorId.getRequired("senderActorId")

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
    fun richText(): Optional<String> = richText.getOptional("richText")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subject(): Optional<String> = subject.getOptional("subject")

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
     * Returns the raw JSON value of [recipients].
     *
     * Unlike [recipients], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipients")
    @ExcludeMissing
    fun _recipients(): JsonField<List<PublicRecipientEgg>> = recipients

    /**
     * Returns the raw JSON value of [senderActorId].
     *
     * Unlike [senderActorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senderActorId")
    @ExcludeMissing
    fun _senderActorId(): JsonField<String> = senderActorId

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
     * Returns the raw JSON value of [richText].
     *
     * Unlike [richText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("richText") @ExcludeMissing fun _richText(): JsonField<String> = richText

    /**
     * Returns the raw JSON value of [subject].
     *
     * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

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
         * [PublicConversationsMessageEgg].
         *
         * The following fields are required:
         * ```java
         * .attachments()
         * .channelAccountId()
         * .channelId()
         * .recipients()
         * .senderActorId()
         * .text()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicConversationsMessageEgg]. */
    class Builder internal constructor() {

        private var attachments: JsonField<MutableList<Attachment>>? = null
        private var channelAccountId: JsonField<String>? = null
        private var channelId: JsonField<String>? = null
        private var recipients: JsonField<MutableList<PublicRecipientEgg>>? = null
        private var senderActorId: JsonField<String>? = null
        private var text: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var richText: JsonField<String> = JsonMissing.of()
        private var subject: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicConversationsMessageEgg: PublicConversationsMessageEgg) = apply {
            attachments = publicConversationsMessageEgg.attachments.map { it.toMutableList() }
            channelAccountId = publicConversationsMessageEgg.channelAccountId
            channelId = publicConversationsMessageEgg.channelId
            recipients = publicConversationsMessageEgg.recipients.map { it.toMutableList() }
            senderActorId = publicConversationsMessageEgg.senderActorId
            text = publicConversationsMessageEgg.text
            type = publicConversationsMessageEgg.type
            richText = publicConversationsMessageEgg.richText
            subject = publicConversationsMessageEgg.subject
            additionalProperties = publicConversationsMessageEgg.additionalProperties.toMutableMap()
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

        /** Alias for calling [addAttachment] with `Attachment.ofPublicFileEgg(publicFileEgg)`. */
        fun addAttachment(publicFileEgg: PublicFileEgg) =
            addAttachment(Attachment.ofPublicFileEgg(publicFileEgg))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicQuickRepliesEgg(publicQuickRepliesEgg)`.
         */
        fun addAttachment(publicQuickRepliesEgg: PublicQuickRepliesEgg) =
            addAttachment(Attachment.ofPublicQuickRepliesEgg(publicQuickRepliesEgg))

        /**
         * Alias for calling [addAttachment] with
         * `Attachment.ofPublicSocialMediaEgg(publicSocialMediaEgg)`.
         */
        fun addAttachment(publicSocialMediaEgg: PublicSocialMediaEgg) =
            addAttachment(Attachment.ofPublicSocialMediaEgg(publicSocialMediaEgg))

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

        fun recipients(recipients: List<PublicRecipientEgg>) = recipients(JsonField.of(recipients))

        /**
         * Sets [Builder.recipients] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipients] with a well-typed `List<PublicRecipientEgg>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipients(recipients: JsonField<List<PublicRecipientEgg>>) = apply {
            this.recipients = recipients.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicRecipientEgg] to [recipients].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecipient(recipient: PublicRecipientEgg) = apply {
            recipients =
                (recipients ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recipients", it).add(recipient)
                }
        }

        fun senderActorId(senderActorId: String) = senderActorId(JsonField.of(senderActorId))

        /**
         * Sets [Builder.senderActorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderActorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senderActorId(senderActorId: JsonField<String>) = apply {
            this.senderActorId = senderActorId
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

        fun richText(richText: String) = richText(JsonField.of(richText))

        /**
         * Sets [Builder.richText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun richText(richText: JsonField<String>) = apply { this.richText = richText }

        fun subject(subject: String) = subject(JsonField.of(subject))

        /**
         * Sets [Builder.subject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subject] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subject(subject: JsonField<String>) = apply { this.subject = subject }

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
         * Returns an immutable instance of [PublicConversationsMessageEgg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .attachments()
         * .channelAccountId()
         * .channelId()
         * .recipients()
         * .senderActorId()
         * .text()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicConversationsMessageEgg =
            PublicConversationsMessageEgg(
                checkRequired("attachments", attachments).map { it.toImmutable() },
                checkRequired("channelAccountId", channelAccountId),
                checkRequired("channelId", channelId),
                checkRequired("recipients", recipients).map { it.toImmutable() },
                checkRequired("senderActorId", senderActorId),
                checkRequired("text", text),
                checkRequired("type", type),
                richText,
                subject,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicConversationsMessageEgg = apply {
        if (validated) {
            return@apply
        }

        attachments().forEach { it.validate() }
        channelAccountId()
        channelId()
        recipients().forEach { it.validate() }
        senderActorId()
        text()
        type().validate()
        richText()
        subject()
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
        (attachments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (channelAccountId.asKnown().isPresent) 1 else 0) +
            (if (channelId.asKnown().isPresent) 1 else 0) +
            (recipients.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (senderActorId.asKnown().isPresent) 1 else 0) +
            (if (text.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (richText.asKnown().isPresent) 1 else 0) +
            (if (subject.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Attachment.Deserializer::class)
    @JsonSerialize(using = Attachment.Serializer::class)
    class Attachment
    private constructor(
        private val publicFileEgg: PublicFileEgg? = null,
        private val publicQuickRepliesEgg: PublicQuickRepliesEgg? = null,
        private val publicSocialMediaEgg: PublicSocialMediaEgg? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicFileEgg(): Optional<PublicFileEgg> = Optional.ofNullable(publicFileEgg)

        fun publicQuickRepliesEgg(): Optional<PublicQuickRepliesEgg> =
            Optional.ofNullable(publicQuickRepliesEgg)

        fun publicSocialMediaEgg(): Optional<PublicSocialMediaEgg> =
            Optional.ofNullable(publicSocialMediaEgg)

        fun isPublicFileEgg(): Boolean = publicFileEgg != null

        fun isPublicQuickRepliesEgg(): Boolean = publicQuickRepliesEgg != null

        fun isPublicSocialMediaEgg(): Boolean = publicSocialMediaEgg != null

        fun asPublicFileEgg(): PublicFileEgg = publicFileEgg.getOrThrow("publicFileEgg")

        fun asPublicQuickRepliesEgg(): PublicQuickRepliesEgg =
            publicQuickRepliesEgg.getOrThrow("publicQuickRepliesEgg")

        fun asPublicSocialMediaEgg(): PublicSocialMediaEgg =
            publicSocialMediaEgg.getOrThrow("publicSocialMediaEgg")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicFileEgg != null -> visitor.visitPublicFileEgg(publicFileEgg)
                publicQuickRepliesEgg != null ->
                    visitor.visitPublicQuickRepliesEgg(publicQuickRepliesEgg)
                publicSocialMediaEgg != null ->
                    visitor.visitPublicSocialMediaEgg(publicSocialMediaEgg)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Attachment = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicFileEgg(publicFileEgg: PublicFileEgg) {
                        publicFileEgg.validate()
                    }

                    override fun visitPublicQuickRepliesEgg(
                        publicQuickRepliesEgg: PublicQuickRepliesEgg
                    ) {
                        publicQuickRepliesEgg.validate()
                    }

                    override fun visitPublicSocialMediaEgg(
                        publicSocialMediaEgg: PublicSocialMediaEgg
                    ) {
                        publicSocialMediaEgg.validate()
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
                    override fun visitPublicFileEgg(publicFileEgg: PublicFileEgg) =
                        publicFileEgg.validity()

                    override fun visitPublicQuickRepliesEgg(
                        publicQuickRepliesEgg: PublicQuickRepliesEgg
                    ) = publicQuickRepliesEgg.validity()

                    override fun visitPublicSocialMediaEgg(
                        publicSocialMediaEgg: PublicSocialMediaEgg
                    ) = publicSocialMediaEgg.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Attachment &&
                publicFileEgg == other.publicFileEgg &&
                publicQuickRepliesEgg == other.publicQuickRepliesEgg &&
                publicSocialMediaEgg == other.publicSocialMediaEgg
        }

        override fun hashCode(): Int =
            Objects.hash(publicFileEgg, publicQuickRepliesEgg, publicSocialMediaEgg)

        override fun toString(): String =
            when {
                publicFileEgg != null -> "Attachment{publicFileEgg=$publicFileEgg}"
                publicQuickRepliesEgg != null ->
                    "Attachment{publicQuickRepliesEgg=$publicQuickRepliesEgg}"
                publicSocialMediaEgg != null ->
                    "Attachment{publicSocialMediaEgg=$publicSocialMediaEgg}"
                _json != null -> "Attachment{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Attachment")
            }

        companion object {

            @JvmStatic
            fun ofPublicFileEgg(publicFileEgg: PublicFileEgg) =
                Attachment(publicFileEgg = publicFileEgg)

            @JvmStatic
            fun ofPublicQuickRepliesEgg(publicQuickRepliesEgg: PublicQuickRepliesEgg) =
                Attachment(publicQuickRepliesEgg = publicQuickRepliesEgg)

            @JvmStatic
            fun ofPublicSocialMediaEgg(publicSocialMediaEgg: PublicSocialMediaEgg) =
                Attachment(publicSocialMediaEgg = publicSocialMediaEgg)
        }

        /**
         * An interface that defines how to map each variant of [Attachment] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitPublicFileEgg(publicFileEgg: PublicFileEgg): T

            fun visitPublicQuickRepliesEgg(publicQuickRepliesEgg: PublicQuickRepliesEgg): T

            fun visitPublicSocialMediaEgg(publicSocialMediaEgg: PublicSocialMediaEgg): T

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
                            tryDeserialize(node, jacksonTypeRef<PublicFileEgg>())?.let {
                                Attachment(publicFileEgg = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicQuickRepliesEgg>())?.let {
                                Attachment(publicQuickRepliesEgg = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicSocialMediaEgg>())?.let {
                                Attachment(publicSocialMediaEgg = it, _json = json)
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
                    value.publicFileEgg != null -> generator.writeObject(value.publicFileEgg)
                    value.publicQuickRepliesEgg != null ->
                        generator.writeObject(value.publicQuickRepliesEgg)
                    value.publicSocialMediaEgg != null ->
                        generator.writeObject(value.publicSocialMediaEgg)
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
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                MESSAGE -> Known.MESSAGE
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

        return other is PublicConversationsMessageEgg &&
            attachments == other.attachments &&
            channelAccountId == other.channelAccountId &&
            channelId == other.channelId &&
            recipients == other.recipients &&
            senderActorId == other.senderActorId &&
            text == other.text &&
            type == other.type &&
            richText == other.richText &&
            subject == other.subject &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            attachments,
            channelAccountId,
            channelId,
            recipients,
            senderActorId,
            text,
            type,
            richText,
            subject,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicConversationsMessageEgg{attachments=$attachments, channelAccountId=$channelAccountId, channelId=$channelId, recipients=$recipients, senderActorId=$senderActorId, text=$text, type=$type, richText=$richText, subject=$subject, additionalProperties=$additionalProperties}"
}
