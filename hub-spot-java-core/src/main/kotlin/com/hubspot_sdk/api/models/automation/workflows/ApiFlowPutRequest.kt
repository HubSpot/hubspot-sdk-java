// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = ApiFlowPutRequest.Deserializer::class)
@JsonSerialize(using = ApiFlowPutRequest.Serializer::class)
class ApiFlowPutRequest
private constructor(
    private val contact: ApiContactFlowPutRequest? = null,
    private val platform: ApiPlatformFlowPutRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun contact(): Optional<ApiContactFlowPutRequest> = Optional.ofNullable(contact)

    fun platform(): Optional<ApiPlatformFlowPutRequest> = Optional.ofNullable(platform)

    fun isContact(): Boolean = contact != null

    fun isPlatform(): Boolean = platform != null

    fun asContact(): ApiContactFlowPutRequest = contact.getOrThrow("contact")

    fun asPlatform(): ApiPlatformFlowPutRequest = platform.getOrThrow("platform")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            contact != null -> visitor.visitContact(contact)
            platform != null -> visitor.visitPlatform(platform)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ApiFlowPutRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitContact(contact: ApiContactFlowPutRequest) {
                    contact.validate()
                }

                override fun visitPlatform(platform: ApiPlatformFlowPutRequest) {
                    platform.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitContact(contact: ApiContactFlowPutRequest) = contact.validity()

                override fun visitPlatform(platform: ApiPlatformFlowPutRequest) =
                    platform.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiFlowPutRequest && contact == other.contact && platform == other.platform
    }

    override fun hashCode(): Int = Objects.hash(contact, platform)

    override fun toString(): String =
        when {
            contact != null -> "ApiFlowPutRequest{contact=$contact}"
            platform != null -> "ApiFlowPutRequest{platform=$platform}"
            _json != null -> "ApiFlowPutRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ApiFlowPutRequest")
        }

    companion object {

        @JvmStatic
        fun ofContact(contact: ApiContactFlowPutRequest) = ApiFlowPutRequest(contact = contact)

        @JvmStatic
        fun ofPlatform(platform: ApiPlatformFlowPutRequest) = ApiFlowPutRequest(platform = platform)
    }

    /**
     * An interface that defines how to map each variant of [ApiFlowPutRequest] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitContact(contact: ApiContactFlowPutRequest): T

        fun visitPlatform(platform: ApiPlatformFlowPutRequest): T

        /**
         * Maps an unknown variant of [ApiFlowPutRequest] to a value of type [T].
         *
         * An instance of [ApiFlowPutRequest] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws HubSpotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubSpotInvalidDataException("Unknown ApiFlowPutRequest: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ApiFlowPutRequest>(ApiFlowPutRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ApiFlowPutRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ApiContactFlowPutRequest>())?.let {
                            ApiFlowPutRequest(contact = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ApiPlatformFlowPutRequest>())?.let {
                            ApiFlowPutRequest(platform = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ApiFlowPutRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ApiFlowPutRequest>(ApiFlowPutRequest::class) {

        override fun serialize(
            value: ApiFlowPutRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.contact != null -> generator.writeObject(value.contact)
                value.platform != null -> generator.writeObject(value.platform)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ApiFlowPutRequest")
            }
        }
    }
}
