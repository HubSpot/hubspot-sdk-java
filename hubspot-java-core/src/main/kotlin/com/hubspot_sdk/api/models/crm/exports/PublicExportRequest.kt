// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.exports

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

@JsonDeserialize(using = PublicExportRequest.Deserializer::class)
@JsonSerialize(using = PublicExportRequest.Serializer::class)
class PublicExportRequest
private constructor(
    private val view: PublicExportViewRequest? = null,
    private val list: PublicExportListRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun view(): Optional<PublicExportViewRequest> = Optional.ofNullable(view)

    fun list(): Optional<PublicExportListRequest> = Optional.ofNullable(list)

    fun isView(): Boolean = view != null

    fun isList(): Boolean = list != null

    fun asView(): PublicExportViewRequest = view.getOrThrow("view")

    fun asList(): PublicExportListRequest = list.getOrThrow("list")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            view != null -> visitor.visitView(view)
            list != null -> visitor.visitList(list)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PublicExportRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitView(view: PublicExportViewRequest) {
                    view.validate()
                }

                override fun visitList(list: PublicExportListRequest) {
                    list.validate()
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
                override fun visitView(view: PublicExportViewRequest) = view.validity()

                override fun visitList(list: PublicExportListRequest) = list.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicExportRequest && view == other.view && list == other.list
    }

    override fun hashCode(): Int = Objects.hash(view, list)

    override fun toString(): String =
        when {
            view != null -> "PublicExportRequest{view=$view}"
            list != null -> "PublicExportRequest{list=$list}"
            _json != null -> "PublicExportRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicExportRequest")
        }

    companion object {

        @JvmStatic fun ofView(view: PublicExportViewRequest) = PublicExportRequest(view = view)

        @JvmStatic fun ofList(list: PublicExportListRequest) = PublicExportRequest(list = list)
    }

    /**
     * An interface that defines how to map each variant of [PublicExportRequest] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitView(view: PublicExportViewRequest): T

        fun visitList(list: PublicExportListRequest): T

        /**
         * Maps an unknown variant of [PublicExportRequest] to a value of type [T].
         *
         * An instance of [PublicExportRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown PublicExportRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<PublicExportRequest>(PublicExportRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PublicExportRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PublicExportViewRequest>())?.let {
                            PublicExportRequest(view = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PublicExportListRequest>())?.let {
                            PublicExportRequest(list = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PublicExportRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PublicExportRequest>(PublicExportRequest::class) {

        override fun serialize(
            value: PublicExportRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.view != null -> generator.writeObject(value.view)
                value.list != null -> generator.writeObject(value.list)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicExportRequest")
            }
        }
    }
}
