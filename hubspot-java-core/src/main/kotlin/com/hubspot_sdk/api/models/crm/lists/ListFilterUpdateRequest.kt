// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

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
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ListFilterUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val filterBranch: JsonField<FilterBranch>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("filterBranch")
        @ExcludeMissing
        filterBranch: JsonField<FilterBranch> = JsonMissing.of()
    ) : this(filterBranch, mutableMapOf())

    /**
     * Updated filtering criteria for the list
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filterBranch(): FilterBranch = filterBranch.getRequired("filterBranch")

    /**
     * Returns the raw JSON value of [filterBranch].
     *
     * Unlike [filterBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filterBranch")
    @ExcludeMissing
    fun _filterBranch(): JsonField<FilterBranch> = filterBranch

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
         * Returns a mutable builder for constructing an instance of [ListFilterUpdateRequest].
         *
         * The following fields are required:
         * ```java
         * .filterBranch()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListFilterUpdateRequest]. */
    class Builder internal constructor() {

        private var filterBranch: JsonField<FilterBranch>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listFilterUpdateRequest: ListFilterUpdateRequest) = apply {
            filterBranch = listFilterUpdateRequest.filterBranch
            additionalProperties = listFilterUpdateRequest.additionalProperties.toMutableMap()
        }

        /** Updated filtering criteria for the list */
        fun filterBranch(filterBranch: FilterBranch) = filterBranch(JsonField.of(filterBranch))

        /**
         * Sets [Builder.filterBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filterBranch] with a well-typed [FilterBranch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun filterBranch(filterBranch: JsonField<FilterBranch>) = apply {
            this.filterBranch = filterBranch
        }

        /** Alias for calling [filterBranch] with `FilterBranch.ofOr(or)`. */
        fun filterBranch(or: PublicOrFilterBranch) = filterBranch(FilterBranch.ofOr(or))

        /** Alias for calling [filterBranch] with `FilterBranch.ofAnd(and)`. */
        fun filterBranch(and: PublicAndFilterBranch) = filterBranch(FilterBranch.ofAnd(and))

        /** Alias for calling [filterBranch] with `FilterBranch.ofNotAll(notAll)`. */
        fun filterBranch(notAll: PublicNotAllFilterBranch) =
            filterBranch(FilterBranch.ofNotAll(notAll))

        /** Alias for calling [filterBranch] with `FilterBranch.ofNotAny(notAny)`. */
        fun filterBranch(notAny: PublicNotAnyFilterBranch) =
            filterBranch(FilterBranch.ofNotAny(notAny))

        /** Alias for calling [filterBranch] with `FilterBranch.ofRestricted(restricted)`. */
        fun filterBranch(restricted: PublicRestrictedFilterBranch) =
            filterBranch(FilterBranch.ofRestricted(restricted))

        /** Alias for calling [filterBranch] with `FilterBranch.ofUnifiedEvents(unifiedEvents)`. */
        fun filterBranch(unifiedEvents: PublicUnifiedEventsFilterBranch) =
            filterBranch(FilterBranch.ofUnifiedEvents(unifiedEvents))

        /**
         * Alias for calling [filterBranch] with
         * `FilterBranch.ofPropertyAssociation(propertyAssociation)`.
         */
        fun filterBranch(propertyAssociation: PublicPropertyAssociationFilterBranch) =
            filterBranch(FilterBranch.ofPropertyAssociation(propertyAssociation))

        /** Alias for calling [filterBranch] with `FilterBranch.ofAssociation(association)`. */
        fun filterBranch(association: PublicAssociationFilterBranch) =
            filterBranch(FilterBranch.ofAssociation(association))

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
         * Returns an immutable instance of [ListFilterUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .filterBranch()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ListFilterUpdateRequest =
            ListFilterUpdateRequest(
                checkRequired("filterBranch", filterBranch),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ListFilterUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        filterBranch().validate()
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
    internal fun validity(): Int = (filterBranch.asKnown().getOrNull()?.validity() ?: 0)

    /** Updated filtering criteria for the list */
    @JsonDeserialize(using = FilterBranch.Deserializer::class)
    @JsonSerialize(using = FilterBranch.Serializer::class)
    class FilterBranch
    private constructor(
        private val or: PublicOrFilterBranch? = null,
        private val and: PublicAndFilterBranch? = null,
        private val notAll: PublicNotAllFilterBranch? = null,
        private val notAny: PublicNotAnyFilterBranch? = null,
        private val restricted: PublicRestrictedFilterBranch? = null,
        private val unifiedEvents: PublicUnifiedEventsFilterBranch? = null,
        private val propertyAssociation: PublicPropertyAssociationFilterBranch? = null,
        private val association: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun or(): Optional<PublicOrFilterBranch> = Optional.ofNullable(or)

        fun and(): Optional<PublicAndFilterBranch> = Optional.ofNullable(and)

        fun notAll(): Optional<PublicNotAllFilterBranch> = Optional.ofNullable(notAll)

        fun notAny(): Optional<PublicNotAnyFilterBranch> = Optional.ofNullable(notAny)

        fun restricted(): Optional<PublicRestrictedFilterBranch> = Optional.ofNullable(restricted)

        fun unifiedEvents(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(unifiedEvents)

        fun propertyAssociation(): Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(propertyAssociation)

        fun association(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(association)

        fun isOr(): Boolean = or != null

        fun isAnd(): Boolean = and != null

        fun isNotAll(): Boolean = notAll != null

        fun isNotAny(): Boolean = notAny != null

        fun isRestricted(): Boolean = restricted != null

        fun isUnifiedEvents(): Boolean = unifiedEvents != null

        fun isPropertyAssociation(): Boolean = propertyAssociation != null

        fun isAssociation(): Boolean = association != null

        fun asOr(): PublicOrFilterBranch = or.getOrThrow("or")

        fun asAnd(): PublicAndFilterBranch = and.getOrThrow("and")

        fun asNotAll(): PublicNotAllFilterBranch = notAll.getOrThrow("notAll")

        fun asNotAny(): PublicNotAnyFilterBranch = notAny.getOrThrow("notAny")

        fun asRestricted(): PublicRestrictedFilterBranch = restricted.getOrThrow("restricted")

        fun asUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            unifiedEvents.getOrThrow("unifiedEvents")

        fun asPropertyAssociation(): PublicPropertyAssociationFilterBranch =
            propertyAssociation.getOrThrow("propertyAssociation")

        fun asAssociation(): PublicAssociationFilterBranch = association.getOrThrow("association")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                or != null -> visitor.visitOr(or)
                and != null -> visitor.visitAnd(and)
                notAll != null -> visitor.visitNotAll(notAll)
                notAny != null -> visitor.visitNotAny(notAny)
                restricted != null -> visitor.visitRestricted(restricted)
                unifiedEvents != null -> visitor.visitUnifiedEvents(unifiedEvents)
                propertyAssociation != null -> visitor.visitPropertyAssociation(propertyAssociation)
                association != null -> visitor.visitAssociation(association)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): FilterBranch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOr(or: PublicOrFilterBranch) {
                        or.validate()
                    }

                    override fun visitAnd(and: PublicAndFilterBranch) {
                        and.validate()
                    }

                    override fun visitNotAll(notAll: PublicNotAllFilterBranch) {
                        notAll.validate()
                    }

                    override fun visitNotAny(notAny: PublicNotAnyFilterBranch) {
                        notAny.validate()
                    }

                    override fun visitRestricted(restricted: PublicRestrictedFilterBranch) {
                        restricted.validate()
                    }

                    override fun visitUnifiedEvents(
                        unifiedEvents: PublicUnifiedEventsFilterBranch
                    ) {
                        unifiedEvents.validate()
                    }

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationFilterBranch
                    ) {
                        propertyAssociation.validate()
                    }

                    override fun visitAssociation(association: PublicAssociationFilterBranch) {
                        association.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitOr(or: PublicOrFilterBranch) = or.validity()

                    override fun visitAnd(and: PublicAndFilterBranch) = and.validity()

                    override fun visitNotAll(notAll: PublicNotAllFilterBranch) = notAll.validity()

                    override fun visitNotAny(notAny: PublicNotAnyFilterBranch) = notAny.validity()

                    override fun visitRestricted(restricted: PublicRestrictedFilterBranch) =
                        restricted.validity()

                    override fun visitUnifiedEvents(
                        unifiedEvents: PublicUnifiedEventsFilterBranch
                    ) = unifiedEvents.validity()

                    override fun visitPropertyAssociation(
                        propertyAssociation: PublicPropertyAssociationFilterBranch
                    ) = propertyAssociation.validity()

                    override fun visitAssociation(association: PublicAssociationFilterBranch) =
                        association.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FilterBranch &&
                or == other.or &&
                and == other.and &&
                notAll == other.notAll &&
                notAny == other.notAny &&
                restricted == other.restricted &&
                unifiedEvents == other.unifiedEvents &&
                propertyAssociation == other.propertyAssociation &&
                association == other.association
        }

        override fun hashCode(): Int =
            Objects.hash(
                or,
                and,
                notAll,
                notAny,
                restricted,
                unifiedEvents,
                propertyAssociation,
                association,
            )

        override fun toString(): String =
            when {
                or != null -> "FilterBranch{or=$or}"
                and != null -> "FilterBranch{and=$and}"
                notAll != null -> "FilterBranch{notAll=$notAll}"
                notAny != null -> "FilterBranch{notAny=$notAny}"
                restricted != null -> "FilterBranch{restricted=$restricted}"
                unifiedEvents != null -> "FilterBranch{unifiedEvents=$unifiedEvents}"
                propertyAssociation != null ->
                    "FilterBranch{propertyAssociation=$propertyAssociation}"
                association != null -> "FilterBranch{association=$association}"
                _json != null -> "FilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FilterBranch")
            }

        companion object {

            @JvmStatic fun ofOr(or: PublicOrFilterBranch) = FilterBranch(or = or)

            @JvmStatic fun ofAnd(and: PublicAndFilterBranch) = FilterBranch(and = and)

            @JvmStatic
            fun ofNotAll(notAll: PublicNotAllFilterBranch) = FilterBranch(notAll = notAll)

            @JvmStatic
            fun ofNotAny(notAny: PublicNotAnyFilterBranch) = FilterBranch(notAny = notAny)

            @JvmStatic
            fun ofRestricted(restricted: PublicRestrictedFilterBranch) =
                FilterBranch(restricted = restricted)

            @JvmStatic
            fun ofUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilterBranch) =
                FilterBranch(unifiedEvents = unifiedEvents)

            @JvmStatic
            fun ofPropertyAssociation(propertyAssociation: PublicPropertyAssociationFilterBranch) =
                FilterBranch(propertyAssociation = propertyAssociation)

            @JvmStatic
            fun ofAssociation(association: PublicAssociationFilterBranch) =
                FilterBranch(association = association)
        }

        /**
         * An interface that defines how to map each variant of [FilterBranch] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitOr(or: PublicOrFilterBranch): T

            fun visitAnd(and: PublicAndFilterBranch): T

            fun visitNotAll(notAll: PublicNotAllFilterBranch): T

            fun visitNotAny(notAny: PublicNotAnyFilterBranch): T

            fun visitRestricted(restricted: PublicRestrictedFilterBranch): T

            fun visitUnifiedEvents(unifiedEvents: PublicUnifiedEventsFilterBranch): T

            fun visitPropertyAssociation(
                propertyAssociation: PublicPropertyAssociationFilterBranch
            ): T

            fun visitAssociation(association: PublicAssociationFilterBranch): T

            /**
             * Maps an unknown variant of [FilterBranch] to a value of type [T].
             *
             * An instance of [FilterBranch] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown FilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FilterBranch>(FilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FilterBranch {
                val json = JsonValue.fromJsonNode(node)
                val filterBranchType =
                    json.asObject().getOrNull()?.get("filterBranchType")?.asString()?.getOrNull()

                when (filterBranchType) {
                    "OR" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                            FilterBranch(or = it, _json = json)
                        } ?: FilterBranch(_json = json)
                    }
                    "AND" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                            FilterBranch(and = it, _json = json)
                        } ?: FilterBranch(_json = json)
                    }
                    "NOT_ALL" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())
                            ?.let { FilterBranch(notAll = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "NOT_ANY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())
                            ?.let { FilterBranch(notAny = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "RESTRICTED" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                            ?.let { FilterBranch(restricted = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "UNIFIED_EVENTS" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicUnifiedEventsFilterBranch>(),
                            )
                            ?.let { FilterBranch(unifiedEvents = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "PROPERTY_ASSOCIATION" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                            )
                            ?.let { FilterBranch(propertyAssociation = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                    "ASSOCIATION" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                            ?.let { FilterBranch(association = it, _json = json) }
                            ?: FilterBranch(_json = json)
                    }
                }

                return FilterBranch(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<FilterBranch>(FilterBranch::class) {

            override fun serialize(
                value: FilterBranch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.or != null -> generator.writeObject(value.or)
                    value.and != null -> generator.writeObject(value.and)
                    value.notAll != null -> generator.writeObject(value.notAll)
                    value.notAny != null -> generator.writeObject(value.notAny)
                    value.restricted != null -> generator.writeObject(value.restricted)
                    value.unifiedEvents != null -> generator.writeObject(value.unifiedEvents)
                    value.propertyAssociation != null ->
                        generator.writeObject(value.propertyAssociation)
                    value.association != null -> generator.writeObject(value.association)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FilterBranch")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListFilterUpdateRequest &&
            filterBranch == other.filterBranch &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(filterBranch, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListFilterUpdateRequest{filterBranch=$filterBranch, additionalProperties=$additionalProperties}"
}
