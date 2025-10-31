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

@JsonDeserialize(using = PublicMessageEgg.Deserializer::class)
@JsonSerialize(using = PublicMessageEgg.Serializer::class)
class PublicMessageEgg
private constructor(
    private val conversations: PublicConversationsMessageEgg? = null,
    private val comment: PublicCommentEgg? = null,
    private val _json: JsonValue? = null,
) {

    fun conversations(): Optional<PublicConversationsMessageEgg> =
        Optional.ofNullable(conversations)

    fun comment(): Optional<PublicCommentEgg> = Optional.ofNullable(comment)

    fun isConversations(): Boolean = conversations != null

    fun isComment(): Boolean = comment != null

    fun asConversations(): PublicConversationsMessageEgg = conversations.getOrThrow("conversations")

    fun asComment(): PublicCommentEgg = comment.getOrThrow("comment")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            conversations != null -> visitor.visitConversations(conversations)
            comment != null -> visitor.visitComment(comment)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PublicMessageEgg = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitConversations(conversations: PublicConversationsMessageEgg) {
                    conversations.validate()
                }

                override fun visitComment(comment: PublicCommentEgg) {
                    comment.validate()
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
                override fun visitConversations(conversations: PublicConversationsMessageEgg) =
                    conversations.validity()

                override fun visitComment(comment: PublicCommentEgg) = comment.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicMessageEgg &&
            conversations == other.conversations &&
            comment == other.comment
    }

    override fun hashCode(): Int = Objects.hash(conversations, comment)

    override fun toString(): String =
        when {
            conversations != null -> "PublicMessageEgg{conversations=$conversations}"
            comment != null -> "PublicMessageEgg{comment=$comment}"
            _json != null -> "PublicMessageEgg{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicMessageEgg")
        }

    companion object {

        @JvmStatic
        fun ofConversations(conversations: PublicConversationsMessageEgg) =
            PublicMessageEgg(conversations = conversations)

        @JvmStatic fun ofComment(comment: PublicCommentEgg) = PublicMessageEgg(comment = comment)
    }

    /**
     * An interface that defines how to map each variant of [PublicMessageEgg] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitConversations(conversations: PublicConversationsMessageEgg): T

        fun visitComment(comment: PublicCommentEgg): T

        /**
         * Maps an unknown variant of [PublicMessageEgg] to a value of type [T].
         *
         * An instance of [PublicMessageEgg] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown PublicMessageEgg: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PublicMessageEgg>(PublicMessageEgg::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PublicMessageEgg {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PublicConversationsMessageEgg>())?.let {
                            PublicMessageEgg(conversations = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicCommentEgg>())?.let {
                            PublicMessageEgg(comment = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PublicMessageEgg(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PublicMessageEgg>(PublicMessageEgg::class) {

        override fun serialize(
            value: PublicMessageEgg,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.conversations != null -> generator.writeObject(value.conversations)
                value.comment != null -> generator.writeObject(value.comment)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicMessageEgg")
            }
        }
    }
}
