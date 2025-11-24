// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = PublicMessage.Deserializer::class)
@JsonSerialize(using = PublicMessage.Serializer::class)
class PublicMessage
private constructor(
    private val conversationsPublicConversations: ConversationsPublicConversationsMessage? = null,
    private val comment: PublicComment? = null,
    private val welcome: PublicWelcomeMessage? = null,
    private val assignment: PublicAssignmentMessage? = null,
    private val threadStatusChange: PublicThreadStatusChange? = null,
    private val threadInboxChange: PublicThreadInboxChange? = null,
    private val _json: JsonValue? = null,
) {

    fun conversationsPublicConversations(): Optional<ConversationsPublicConversationsMessage> =
        Optional.ofNullable(conversationsPublicConversations)

    fun comment(): Optional<PublicComment> = Optional.ofNullable(comment)

    fun welcome(): Optional<PublicWelcomeMessage> = Optional.ofNullable(welcome)

    fun assignment(): Optional<PublicAssignmentMessage> = Optional.ofNullable(assignment)

    fun threadStatusChange(): Optional<PublicThreadStatusChange> =
        Optional.ofNullable(threadStatusChange)

    fun threadInboxChange(): Optional<PublicThreadInboxChange> =
        Optional.ofNullable(threadInboxChange)

    fun isConversationsPublicConversations(): Boolean = conversationsPublicConversations != null

    fun isComment(): Boolean = comment != null

    fun isWelcome(): Boolean = welcome != null

    fun isAssignment(): Boolean = assignment != null

    fun isThreadStatusChange(): Boolean = threadStatusChange != null

    fun isThreadInboxChange(): Boolean = threadInboxChange != null

    fun asConversationsPublicConversations(): ConversationsPublicConversationsMessage =
        conversationsPublicConversations.getOrThrow("conversationsPublicConversations")

    fun asComment(): PublicComment = comment.getOrThrow("comment")

    fun asWelcome(): PublicWelcomeMessage = welcome.getOrThrow("welcome")

    fun asAssignment(): PublicAssignmentMessage = assignment.getOrThrow("assignment")

    fun asThreadStatusChange(): PublicThreadStatusChange =
        threadStatusChange.getOrThrow("threadStatusChange")

    fun asThreadInboxChange(): PublicThreadInboxChange =
        threadInboxChange.getOrThrow("threadInboxChange")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            conversationsPublicConversations != null ->
                visitor.visitConversationsPublicConversations(conversationsPublicConversations)
            comment != null -> visitor.visitComment(comment)
            welcome != null -> visitor.visitWelcome(welcome)
            assignment != null -> visitor.visitAssignment(assignment)
            threadStatusChange != null -> visitor.visitThreadStatusChange(threadStatusChange)
            threadInboxChange != null -> visitor.visitThreadInboxChange(threadInboxChange)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PublicMessage = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitConversationsPublicConversations(
                    conversationsPublicConversations: ConversationsPublicConversationsMessage
                ) {
                    conversationsPublicConversations.validate()
                }

                override fun visitComment(comment: PublicComment) {
                    comment.validate()
                }

                override fun visitWelcome(welcome: PublicWelcomeMessage) {
                    welcome.validate()
                }

                override fun visitAssignment(assignment: PublicAssignmentMessage) {
                    assignment.validate()
                }

                override fun visitThreadStatusChange(threadStatusChange: PublicThreadStatusChange) {
                    threadStatusChange.validate()
                }

                override fun visitThreadInboxChange(threadInboxChange: PublicThreadInboxChange) {
                    threadInboxChange.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitConversationsPublicConversations(
                    conversationsPublicConversations: ConversationsPublicConversationsMessage
                ) = conversationsPublicConversations.validity()

                override fun visitComment(comment: PublicComment) = comment.validity()

                override fun visitWelcome(welcome: PublicWelcomeMessage) = welcome.validity()

                override fun visitAssignment(assignment: PublicAssignmentMessage) =
                    assignment.validity()

                override fun visitThreadStatusChange(threadStatusChange: PublicThreadStatusChange) =
                    threadStatusChange.validity()

                override fun visitThreadInboxChange(threadInboxChange: PublicThreadInboxChange) =
                    threadInboxChange.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicMessage &&
            conversationsPublicConversations == other.conversationsPublicConversations &&
            comment == other.comment &&
            welcome == other.welcome &&
            assignment == other.assignment &&
            threadStatusChange == other.threadStatusChange &&
            threadInboxChange == other.threadInboxChange
    }

    override fun hashCode(): Int =
        Objects.hash(
            conversationsPublicConversations,
            comment,
            welcome,
            assignment,
            threadStatusChange,
            threadInboxChange,
        )

    override fun toString(): String =
        when {
            conversationsPublicConversations != null ->
                "PublicMessage{conversationsPublicConversations=$conversationsPublicConversations}"
            comment != null -> "PublicMessage{comment=$comment}"
            welcome != null -> "PublicMessage{welcome=$welcome}"
            assignment != null -> "PublicMessage{assignment=$assignment}"
            threadStatusChange != null -> "PublicMessage{threadStatusChange=$threadStatusChange}"
            threadInboxChange != null -> "PublicMessage{threadInboxChange=$threadInboxChange}"
            _json != null -> "PublicMessage{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicMessage")
        }

    companion object {

        @JvmStatic
        fun ofConversationsPublicConversations(
            conversationsPublicConversations: ConversationsPublicConversationsMessage
        ) = PublicMessage(conversationsPublicConversations = conversationsPublicConversations)

        @JvmStatic fun ofComment(comment: PublicComment) = PublicMessage(comment = comment)

        @JvmStatic fun ofWelcome(welcome: PublicWelcomeMessage) = PublicMessage(welcome = welcome)

        @JvmStatic
        fun ofAssignment(assignment: PublicAssignmentMessage) =
            PublicMessage(assignment = assignment)

        @JvmStatic
        fun ofThreadStatusChange(threadStatusChange: PublicThreadStatusChange) =
            PublicMessage(threadStatusChange = threadStatusChange)

        @JvmStatic
        fun ofThreadInboxChange(threadInboxChange: PublicThreadInboxChange) =
            PublicMessage(threadInboxChange = threadInboxChange)
    }

    /**
     * An interface that defines how to map each variant of [PublicMessage] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitConversationsPublicConversations(
            conversationsPublicConversations: ConversationsPublicConversationsMessage
        ): T

        fun visitComment(comment: PublicComment): T

        fun visitWelcome(welcome: PublicWelcomeMessage): T

        fun visitAssignment(assignment: PublicAssignmentMessage): T

        fun visitThreadStatusChange(threadStatusChange: PublicThreadStatusChange): T

        fun visitThreadInboxChange(threadInboxChange: PublicThreadInboxChange): T

        /**
         * Maps an unknown variant of [PublicMessage] to a value of type [T].
         *
         * An instance of [PublicMessage] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown PublicMessage: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PublicMessage>(PublicMessage::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PublicMessage {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ConversationsPublicConversationsMessage>(),
                            )
                            ?.let {
                                PublicMessage(conversationsPublicConversations = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<PublicComment>())?.let {
                            PublicMessage(comment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicWelcomeMessage>())?.let {
                            PublicMessage(welcome = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicAssignmentMessage>())?.let {
                            PublicMessage(assignment = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicThreadStatusChange>())?.let {
                            PublicMessage(threadStatusChange = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicThreadInboxChange>())?.let {
                            PublicMessage(threadInboxChange = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PublicMessage(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PublicMessage>(PublicMessage::class) {

        override fun serialize(
            value: PublicMessage,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.conversationsPublicConversations != null ->
                    generator.writeObject(value.conversationsPublicConversations)
                value.comment != null -> generator.writeObject(value.comment)
                value.welcome != null -> generator.writeObject(value.welcome)
                value.assignment != null -> generator.writeObject(value.assignment)
                value.threadStatusChange != null -> generator.writeObject(value.threadStatusChange)
                value.threadInboxChange != null -> generator.writeObject(value.threadInboxChange)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicMessage")
            }
        }
    }
}
