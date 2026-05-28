// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = SubscriptionUpsertRequest.Deserializer::class)
@JsonSerialize(using = SubscriptionUpsertRequest.Serializer::class)
class SubscriptionUpsertRequest
private constructor(
    private val object_: ObjectSubscriptionUpsertRequest? = null,
    private val association: AssociationSubscriptionUpsertRequest? = null,
    private val appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest? = null,
    private val listMembership: ListMembershipSubscriptionUpsertRequest? = null,
    private val gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun object_(): Optional<ObjectSubscriptionUpsertRequest> = Optional.ofNullable(object_)

    fun association(): Optional<AssociationSubscriptionUpsertRequest> =
        Optional.ofNullable(association)

    fun appLifecycleEvent(): Optional<AppLifecycleEventSubscriptionUpsertRequest> =
        Optional.ofNullable(appLifecycleEvent)

    fun listMembership(): Optional<ListMembershipSubscriptionUpsertRequest> =
        Optional.ofNullable(listMembership)

    fun gdprPrivacyDeletion(): Optional<GdprPrivacyDeletionSubscriptionUpsertRequest> =
        Optional.ofNullable(gdprPrivacyDeletion)

    fun isObject(): Boolean = object_ != null

    fun isAssociation(): Boolean = association != null

    fun isAppLifecycleEvent(): Boolean = appLifecycleEvent != null

    fun isListMembership(): Boolean = listMembership != null

    fun isGdprPrivacyDeletion(): Boolean = gdprPrivacyDeletion != null

    fun asObject(): ObjectSubscriptionUpsertRequest = object_.getOrThrow("object_")

    fun asAssociation(): AssociationSubscriptionUpsertRequest =
        association.getOrThrow("association")

    fun asAppLifecycleEvent(): AppLifecycleEventSubscriptionUpsertRequest =
        appLifecycleEvent.getOrThrow("appLifecycleEvent")

    fun asListMembership(): ListMembershipSubscriptionUpsertRequest =
        listMembership.getOrThrow("listMembership")

    fun asGdprPrivacyDeletion(): GdprPrivacyDeletionSubscriptionUpsertRequest =
        gdprPrivacyDeletion.getOrThrow("gdprPrivacyDeletion")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.hubspot.sdk.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = subscriptionUpsertRequest.accept(new SubscriptionUpsertRequest.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitObject(ObjectSubscriptionUpsertRequest object_) {
     *         return Optional.of(object_.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws HubSpotInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            object_ != null -> visitor.visitObject(object_)
            association != null -> visitor.visitAssociation(association)
            appLifecycleEvent != null -> visitor.visitAppLifecycleEvent(appLifecycleEvent)
            listMembership != null -> visitor.visitListMembership(listMembership)
            gdprPrivacyDeletion != null -> visitor.visitGdprPrivacyDeletion(gdprPrivacyDeletion)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SubscriptionUpsertRequest = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitObject(object_: ObjectSubscriptionUpsertRequest) {
                    object_.validate()
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

                override fun visitGdprPrivacyDeletion(
                    gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
                ) {
                    gdprPrivacyDeletion.validate()
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
                override fun visitObject(object_: ObjectSubscriptionUpsertRequest) =
                    object_.validity()

                override fun visitAssociation(association: AssociationSubscriptionUpsertRequest) =
                    association.validity()

                override fun visitAppLifecycleEvent(
                    appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest
                ) = appLifecycleEvent.validity()

                override fun visitListMembership(
                    listMembership: ListMembershipSubscriptionUpsertRequest
                ) = listMembership.validity()

                override fun visitGdprPrivacyDeletion(
                    gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
                ) = gdprPrivacyDeletion.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpsertRequest &&
            object_ == other.object_ &&
            association == other.association &&
            appLifecycleEvent == other.appLifecycleEvent &&
            listMembership == other.listMembership &&
            gdprPrivacyDeletion == other.gdprPrivacyDeletion
    }

    override fun hashCode(): Int =
        Objects.hash(object_, association, appLifecycleEvent, listMembership, gdprPrivacyDeletion)

    override fun toString(): String =
        when {
            object_ != null -> "SubscriptionUpsertRequest{object_=$object_}"
            association != null -> "SubscriptionUpsertRequest{association=$association}"
            appLifecycleEvent != null ->
                "SubscriptionUpsertRequest{appLifecycleEvent=$appLifecycleEvent}"
            listMembership != null -> "SubscriptionUpsertRequest{listMembership=$listMembership}"
            gdprPrivacyDeletion != null ->
                "SubscriptionUpsertRequest{gdprPrivacyDeletion=$gdprPrivacyDeletion}"
            _json != null -> "SubscriptionUpsertRequest{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SubscriptionUpsertRequest")
        }

    companion object {

        @JvmStatic
        fun ofObject(object_: ObjectSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(object_ = object_)

        @JvmStatic
        fun ofAssociation(association: AssociationSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(association = association)

        @JvmStatic
        fun ofAppLifecycleEvent(appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(appLifecycleEvent = appLifecycleEvent)

        @JvmStatic
        fun ofListMembership(listMembership: ListMembershipSubscriptionUpsertRequest) =
            SubscriptionUpsertRequest(listMembership = listMembership)

        @JvmStatic
        fun ofGdprPrivacyDeletion(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ) = SubscriptionUpsertRequest(gdprPrivacyDeletion = gdprPrivacyDeletion)
    }

    /**
     * An interface that defines how to map each variant of [SubscriptionUpsertRequest] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitObject(object_: ObjectSubscriptionUpsertRequest): T

        fun visitAssociation(association: AssociationSubscriptionUpsertRequest): T

        fun visitAppLifecycleEvent(appLifecycleEvent: AppLifecycleEventSubscriptionUpsertRequest): T

        fun visitListMembership(listMembership: ListMembershipSubscriptionUpsertRequest): T

        fun visitGdprPrivacyDeletion(
            gdprPrivacyDeletion: GdprPrivacyDeletionSubscriptionUpsertRequest
        ): T

        /**
         * Maps an unknown variant of [SubscriptionUpsertRequest] to a value of type [T].
         *
         * An instance of [SubscriptionUpsertRequest] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws HubSpotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubSpotInvalidDataException("Unknown SubscriptionUpsertRequest: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<SubscriptionUpsertRequest>(SubscriptionUpsertRequest::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SubscriptionUpsertRequest {
            val json = JsonValue.fromJsonNode(node)
            val subscriptionType =
                json.asObject().getOrNull()?.get("subscriptionType")?.asString()?.getOrNull()

            when (subscriptionType) {
                "OBJECT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ObjectSubscriptionUpsertRequest>())
                        ?.let { SubscriptionUpsertRequest(object_ = it, _json = json) }
                        ?: SubscriptionUpsertRequest(_json = json)
                }
                "ASSOCIATION" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<AssociationSubscriptionUpsertRequest>(),
                        )
                        ?.let { SubscriptionUpsertRequest(association = it, _json = json) }
                        ?: SubscriptionUpsertRequest(_json = json)
                }
                "APP_LIFECYCLE_EVENT" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<AppLifecycleEventSubscriptionUpsertRequest>(),
                        )
                        ?.let { SubscriptionUpsertRequest(appLifecycleEvent = it, _json = json) }
                        ?: SubscriptionUpsertRequest(_json = json)
                }
                "LIST_MEMBERSHIP" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<ListMembershipSubscriptionUpsertRequest>(),
                        )
                        ?.let { SubscriptionUpsertRequest(listMembership = it, _json = json) }
                        ?: SubscriptionUpsertRequest(_json = json)
                }
                "GDPR_PRIVACY_DELETION" -> {
                    return tryDeserialize(
                            node,
                            jacksonTypeRef<GdprPrivacyDeletionSubscriptionUpsertRequest>(),
                        )
                        ?.let { SubscriptionUpsertRequest(gdprPrivacyDeletion = it, _json = json) }
                        ?: SubscriptionUpsertRequest(_json = json)
                }
            }

            return SubscriptionUpsertRequest(_json = json)
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
                value.object_ != null -> generator.writeObject(value.object_)
                value.association != null -> generator.writeObject(value.association)
                value.appLifecycleEvent != null -> generator.writeObject(value.appLifecycleEvent)
                value.listMembership != null -> generator.writeObject(value.listMembership)
                value.gdprPrivacyDeletion != null ->
                    generator.writeObject(value.gdprPrivacyDeletion)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid SubscriptionUpsertRequest")
            }
        }
    }
}
