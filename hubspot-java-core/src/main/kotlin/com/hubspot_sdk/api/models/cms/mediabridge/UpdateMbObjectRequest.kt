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

@JsonDeserialize(using = UpdateMbObjectRequest.Deserializer::class)
@JsonSerialize(using = UpdateMbObjectRequest.Serializer::class)
class UpdateMbObjectRequest
private constructor(
    private val video: UpdateVideoObjectRequest? = null,
    private val other: UpdateOtherObjectRequest? = null,
    private val audio: UpdateAudioObjectRequest? = null,
    private val image: UpdateImageObjectRequest? = null,
    private val document: UpdateDocumentObjectRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun video(): Optional<UpdateVideoObjectRequest> = Optional.ofNullable(video)

    fun other(): Optional<UpdateOtherObjectRequest> = Optional.ofNullable(other)

    fun audio(): Optional<UpdateAudioObjectRequest> = Optional.ofNullable(audio)

    fun image(): Optional<UpdateImageObjectRequest> = Optional.ofNullable(image)

    fun document(): Optional<UpdateDocumentObjectRequest> = Optional.ofNullable(document)

    fun isVideo(): Boolean = video != null

    fun isOther(): Boolean = other != null

    fun isAudio(): Boolean = audio != null

    fun isImage(): Boolean = image != null

    fun isDocument(): Boolean = document != null

    fun asVideo(): UpdateVideoObjectRequest = video.getOrThrow("video")

    fun asOther(): UpdateOtherObjectRequest = other.getOrThrow("other")

    fun asAudio(): UpdateAudioObjectRequest = audio.getOrThrow("audio")

    fun asImage(): UpdateImageObjectRequest = image.getOrThrow("image")

    fun asDocument(): UpdateDocumentObjectRequest = document.getOrThrow("document")

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

    fun validate(): UpdateMbObjectRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitVideo(video: UpdateVideoObjectRequest) {
                    video.validate()
                }

                override fun visitOther(other: UpdateOtherObjectRequest) {
                    other.validate()
                }

                override fun visitAudio(audio: UpdateAudioObjectRequest) {
                    audio.validate()
                }

                override fun visitImage(image: UpdateImageObjectRequest) {
                    image.validate()
                }

                override fun visitDocument(document: UpdateDocumentObjectRequest) {
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
                override fun visitVideo(video: UpdateVideoObjectRequest) = video.validity()

                override fun visitOther(other: UpdateOtherObjectRequest) = other.validity()

                override fun visitAudio(audio: UpdateAudioObjectRequest) = audio.validity()

                override fun visitImage(image: UpdateImageObjectRequest) = image.validity()

                override fun visitDocument(document: UpdateDocumentObjectRequest) =
                    document.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UpdateMbObjectRequest &&
            video == other.video &&
            this.other == other.other &&
            audio == other.audio &&
            image == other.image &&
            document == other.document
    }

    override fun hashCode(): Int = Objects.hash(video, other, audio, image, document)

    override fun toString(): String =
        when {
            video != null -> "UpdateMbObjectRequest{video=$video}"
            other != null -> "UpdateMbObjectRequest{other=$other}"
            audio != null -> "UpdateMbObjectRequest{audio=$audio}"
            image != null -> "UpdateMbObjectRequest{image=$image}"
            document != null -> "UpdateMbObjectRequest{document=$document}"
            _json != null -> "UpdateMbObjectRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UpdateMbObjectRequest")
        }

    companion object {

        @JvmStatic
        fun ofVideo(video: UpdateVideoObjectRequest) = UpdateMbObjectRequest(video = video)

        @JvmStatic
        fun ofOther(other: UpdateOtherObjectRequest) = UpdateMbObjectRequest(other = other)

        @JvmStatic
        fun ofAudio(audio: UpdateAudioObjectRequest) = UpdateMbObjectRequest(audio = audio)

        @JvmStatic
        fun ofImage(image: UpdateImageObjectRequest) = UpdateMbObjectRequest(image = image)

        @JvmStatic
        fun ofDocument(document: UpdateDocumentObjectRequest) =
            UpdateMbObjectRequest(document = document)
    }

    /**
     * An interface that defines how to map each variant of [UpdateMbObjectRequest] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitVideo(video: UpdateVideoObjectRequest): T

        fun visitOther(other: UpdateOtherObjectRequest): T

        fun visitAudio(audio: UpdateAudioObjectRequest): T

        fun visitImage(image: UpdateImageObjectRequest): T

        fun visitDocument(document: UpdateDocumentObjectRequest): T

        /**
         * Maps an unknown variant of [UpdateMbObjectRequest] to a value of type [T].
         *
         * An instance of [UpdateMbObjectRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown UpdateMbObjectRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<UpdateMbObjectRequest>(UpdateMbObjectRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UpdateMbObjectRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UpdateVideoObjectRequest>())?.let {
                            UpdateMbObjectRequest(video = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UpdateOtherObjectRequest>())?.let {
                            UpdateMbObjectRequest(other = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UpdateAudioObjectRequest>())?.let {
                            UpdateMbObjectRequest(audio = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UpdateImageObjectRequest>())?.let {
                            UpdateMbObjectRequest(image = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UpdateDocumentObjectRequest>())?.let {
                            UpdateMbObjectRequest(document = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UpdateMbObjectRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<UpdateMbObjectRequest>(UpdateMbObjectRequest::class) {

        override fun serialize(
            value: UpdateMbObjectRequest,
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
                else -> throw IllegalStateException("Invalid UpdateMbObjectRequest")
            }
        }
    }
}
