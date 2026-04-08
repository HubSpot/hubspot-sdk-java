// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

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

@JsonDeserialize(using = SubscriptionUpsertRequest.Deserializer::class)
@JsonSerialize(using = SubscriptionUpsertRequest.Serializer::class)
class SubscriptionUpsertRequest
private constructor(
    private val objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest? = null,
    private val association: AssociationSubscriptionUpsertRequest? = null,
    private val appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest? = null,
    private val listMembership: ListMembershipSubscriptionUpsertRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun objectSubscriptionUpsertRequest(): Optional<ObjectSubscriptionUpsertRequest> =
        Optional.ofNullable(objectSubscriptionUpsertRequest)

    fun association(): Optional<AssociationSubscriptionUpsertRequest> =
        Optional.ofNullable(association)

    fun appLifecycleEvent(): Optional<AppLifecycleEventSubscriptionUpsertRequest> =
        Optional.ofNullable(appLifecycleEvent)

    fun listMembership(): Optional<ListMembershipSubscriptionUpsertRequest> =
        Optional.ofNullable(listMembership)

    fun isObjectSubscriptionUpsertRequest(): Boolean = objectSubscriptionUpsertRequest != null

    fun isAssociation(): Boolean = association != null

    fun isAppLifecycleEvent(): Boolean = appLifecycleEvent != null

    fun isListMembership(): Boolean = listMembership != null

    fun asObjectSubscriptionUpsertRequest(): ObjectSubscriptionUpsertRequest =
        objectSubscriptionUpsertRequest.getOrThrow("objectSubscriptionUpsertRequest")

    fun asAssociation(): AssociationSubscriptionUpsertRequest =
        association.getOrThrow("association")

    fun asAppLifecycleEvent(): AppLifecycleEventSubscriptionUpsertRequest =
        appLifecycleEvent.getOrThrow("appLifecycleEvent")

    fun asListMembership(): ListMembershipSubscriptionUpsertRequest =
        listMembership.getOrThrow("listMembership")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            objectSubscriptionUpsertRequest != null ->
                visitor.visitObjectSubscriptionUpsertRequest(objectSubscriptionUpsertRequest)
            association != null -> visitor.visitAssociation(association)
            appLifecycleEvent != null -> visitor.visitAppLifecycleEvent(appLifecycleEvent)
            listMembership != null -> visitor.visitListMembership(listMembership)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): SubscriptionUpsertRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
                ) {
                    objectSubscriptionUpsertRequest.validate()
                }

                override fun visitAssociation(association: AssociationSubscriptionUpsertRequest) {
                    association.validate()
                }

                override fun visitAppLifecycleEvent(
                    appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
                ) {
                    appLifecycleEvent.validate()
                }

                override fun visitListMembership(
                    listMembership: ListMembershipSubscriptionUpsertRequest
                ) {
                    listMembership.validate()
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
                override fun visitObjectSubscriptionUpsertRequest(
                    objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
                ) = objectSubscriptionUpsertRequest.validity()

                override fun visitAssociation(association: AssociationSubscriptionUpsertRequest) =
                    association.validity()

                override fun visitAppLifecycleEvent(
                    appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
                ) = appLifecycleEvent.validity()

                override fun visitListMembership(
                    listMembership: ListMembershipSubscriptionUpsertRequest
                ) = listMembership.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpsertRequest &&
            objectSubscriptionUpsertRequest == other.objectSubscriptionUpsertRequest &&
            association == other.association &&
            appLifecycleEvent == other.appLifecycleEvent &&
            listMembership == other.listMembership
    }

    override fun hashCode(): Int =
        Objects.hash(
            objectSubscriptionUpsertRequest,
            association,
            appLifecycleEvent,
            listMembership,
        )

    override fun toString(): String =
        when {
            objectSubscriptionUpsertRequest != null ->
                "SubscriptionUpsertRequest{objectSubscriptionUpsertRequest=$objectSubscriptionUpsertRequest}"
            association != null -> "SubscriptionUpsertRequest{association=$association}"
            appLifecycleEvent != null ->
                "SubscriptionUpsertRequest{appLifecycleEvent=$appLifecycleEvent}"
            listMembership != null -> "SubscriptionUpsertRequest{listMembership=$listMembership}"
            _json != null -> "SubscriptionUpsertRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SubscriptionUpsertRequest")
        }

    companion object {

        @JvmStatic
        fun ofObjectSubscriptionUpsertRequest(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ) =
            SubscriptionUpsertRequest(
                objectSubscriptionUpsertRequest = objectSubscriptionUpsertRequest
            )

        @JvmStatic
        fun ofAssociation(association: AssociationSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(association = association)

        @JvmStatic
        fun ofAppLifecycleEvent(appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(appLifecycleEvent = appLifecycleEvent)

        @JvmStatic
        fun ofListMembership(listMembership: ListMembershipSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(listMembership = listMembership)
    }

    /**
     * An interface that defines how to map each variant of [SubscriptionUpsertRequest] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitObjectSubscriptionUpsertRequest(
            objectSubscriptionUpsertRequest: ObjectSubscriptionUpsertRequest
        ): T

        fun visitAssociation(association: AssociationSubscriptionUpsertRequest): T

        fun visitAppLifecycleEvent(appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest): T

        fun visitListMembership(listMembership: ListMembershipSubscriptionUpsertRequest): T

        /**
         * Maps an unknown variant of [SubscriptionUpsertRequest] to a value of type [T].
         *
         * An instance of [SubscriptionUpsertRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown SubscriptionUpsertRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<SubscriptionUpsertRequest>(SubscriptionUpsertRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SubscriptionUpsertRequest {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ObjectSubscriptionUpsertRequest>())
                            ?.let {
                                SubscriptionUpsertRequest(
                                    objectSubscriptionUpsertRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<AssociationSubscriptionUpsertRequest>())
                            ?.let { SubscriptionUpsertRequest(association = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<AppLifecycleEventSubscriptionUpsertRequest>(),
                            )
                            ?.let {
                                SubscriptionUpsertRequest(appLifecycleEvent = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ListMembershipSubscriptionUpsertRequest>(),
                            )
                            ?.let { SubscriptionUpsertRequest(listMembership = it, _json = json) },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> SubscriptionUpsertRequest(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<SubscriptionUpsertRequest>(SubscriptionUpsertRequest::class) {

        override fun serialize(
            value: SubscriptionUpsertRequest,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.objectSubscriptionUpsertRequest != null ->
                    generator.writeObject(value.objectSubscriptionUpsertRequest)
                value.association != null -> generator.writeObject(value.association)
                value.appLifecycleEvent != null -> generator.writeObject(value.appLifecycleEvent)
                value.listMembership != null -> generator.writeObject(value.listMembership)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid SubscriptionUpsertRequest")
            }
        }
    }
}
