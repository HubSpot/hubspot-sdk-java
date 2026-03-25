// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

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

@JsonDeserialize(using = CreateMbObjectRequest.Deserializer::class)
@JsonSerialize(using = CreateMbObjectRequest.Serializer::class)
class CreateMbObjectRequest
private constructor(
    private val video: CreateVideoObjectRequest? = null,
    private val other: CreateOtherObjectRequest? = null,
    private val audio: CreateAudioObjectRequest? = null,
    private val image: CreateImageObjectRequest? = null,
    private val document: CreateDocumentObjectRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun video(): Optional<CreateVideoObjectRequest> = Optional.ofNullable(video)

    fun other(): Optional<CreateOtherObjectRequest> = Optional.ofNullable(other)

    fun audio(): Optional<CreateAudioObjectRequest> = Optional.ofNullable(audio)

    fun image(): Optional<CreateImageObjectRequest> = Optional.ofNullable(image)

    fun document(): Optional<CreateDocumentObjectRequest> = Optional.ofNullable(document)

    fun isVideo(): Boolean = video != null

    fun isOther(): Boolean = other != null

    fun isAudio(): Boolean = audio != null

    fun isImage(): Boolean = image != null

    fun isDocument(): Boolean = document != null

    fun asVideo(): CreateVideoObjectRequest = video.getOrThrow("video")

    fun asOther(): CreateOtherObjectRequest = other.getOrThrow("other")

    fun asAudio(): CreateAudioObjectRequest = audio.getOrThrow("audio")

    fun asImage(): CreateImageObjectRequest = image.getOrThrow("image")

    fun asDocument(): CreateDocumentObjectRequest = document.getOrThrow("document")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            video != null -> visitor.visitVideo(video)
            other != null -> visitor.visitOther(other)
            audio != null -> visitor.visitAudio(audio)
            image != null -> visitor.visitImage(image)
            document != null -> visitor.visitDocument(document)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CreateMbObjectRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitVideo(video: CreateVideoObjectRequest) {
                    video.validate()
                }

                override fun visitOther(other: CreateOtherObjectRequest) {
                    other.validate()
                }

                override fun visitAudio(audio: CreateAudioObjectRequest) {
                    audio.validate()
                }

                override fun visitImage(image: CreateImageObjectRequest) {
                    image.validate()
                }

                override fun visitDocument(document: CreateDocumentObjectRequest) {
                    document.validate()
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
                override fun visitVideo(video: CreateVideoObjectRequest) = video.validity()

                override fun visitOther(other: CreateOtherObjectRequest) = other.validity()

                override fun visitAudio(audio: CreateAudioObjectRequest) = audio.validity()

                override fun visitImage(image: CreateImageObjectRequest) = image.validity()

                override fun visitDocument(document: CreateDocumentObjectRequest) =
                    document.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreateMbObjectRequest &&
            video == other.video &&
            this.other == other.other &&
            audio == other.audio &&
            image == other.image &&
            document == other.document
    }

    override fun hashCode(): Int = Objects.hash(video, other, audio, image, document)

    override fun toString(): String =
        when {
            video != null -> "CreateMbObjectRequest{video=$video}"
            other != null -> "CreateMbObjectRequest{other=$other}"
            audio != null -> "CreateMbObjectRequest{audio=$audio}"
            image != null -> "CreateMbObjectRequest{image=$image}"
            document != null -> "CreateMbObjectRequest{document=$document}"
            _json != null -> "CreateMbObjectRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CreateMbObjectRequest")
        }

    companion object {

        @JvmStatic
        fun ofVideo(video: CreateVideoObjectRequest) = CreateMbObjectRequest(video = video)

        @JvmStatic
        fun ofOther(other: CreateOtherObjectRequest) = CreateMbObjectRequest(other = other)

        @JvmStatic
        fun ofAudio(audio: CreateAudioObjectRequest) = CreateMbObjectRequest(audio = audio)

        @JvmStatic
        fun ofImage(image: CreateImageObjectRequest) = CreateMbObjectRequest(image = image)

        @JvmStatic
        fun ofDocument(document: CreateDocumentObjectRequest) =
            CreateMbObjectRequest(document = document)
    }

    /**
     * An interface that defines how to map each variant of [CreateMbObjectRequest] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitVideo(video: CreateVideoObjectRequest): T

        fun visitOther(other: CreateOtherObjectRequest): T

        fun visitAudio(audio: CreateAudioObjectRequest): T

        fun visitImage(image: CreateImageObjectRequest): T

        fun visitDocument(document: CreateDocumentObjectRequest): T

        /**
         * Maps an unknown variant of [CreateMbObjectRequest] to a value of type [T].
         *
         * An instance of [CreateMbObjectRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown CreateMbObjectRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CreateMbObjectRequest>(CreateMbObjectRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CreateMbObjectRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<CreateVideoObjectRequest>())?.let {
                            CreateMbObjectRequest(video = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreateOtherObjectRequest>())?.let {
                            CreateMbObjectRequest(other = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreateAudioObjectRequest>())?.let {
                            CreateMbObjectRequest(audio = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreateImageObjectRequest>())?.let {
                            CreateMbObjectRequest(image = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreateDocumentObjectRequest>())?.let {
                            CreateMbObjectRequest(document = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CreateMbObjectRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CreateMbObjectRequest>(CreateMbObjectRequest::class) {

        override fun serialize(
            value: CreateMbObjectRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.video != null -> generator.writeObject(value.video)
                value.other != null -> generator.writeObject(value.other)
                value.audio != null -> generator.writeObject(value.audio)
                value.image != null -> generator.writeObject(value.image)
                value.document != null -> generator.writeObject(value.document)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CreateMbObjectRequest")
            }
        }
    }
}
