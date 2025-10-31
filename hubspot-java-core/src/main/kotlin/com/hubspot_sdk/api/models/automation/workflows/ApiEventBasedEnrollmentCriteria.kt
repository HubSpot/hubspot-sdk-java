// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

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
import com.hubspot_sdk.api.models.PublicAndFilterBranch
import com.hubspot_sdk.api.models.PublicAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicNotAllFilterBranch
import com.hubspot_sdk.api.models.PublicNotAnyFilterBranch
import com.hubspot_sdk.api.models.PublicOrFilterBranch
import com.hubspot_sdk.api.models.PublicPropertyAssociationFilterBranch
import com.hubspot_sdk.api.models.PublicRestrictedFilterBranch
import com.hubspot_sdk.api.models.PublicUnifiedEventsFilterBranch
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ApiEventBasedEnrollmentCriteria
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventFilterBranches: JsonField<List<PublicUnifiedEventsFilterBranch>>,
    private val listMembershipFilterBranches: JsonField<List<ListMembershipFilterBranch>>,
    private val shouldReEnroll: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val refinementCriteria: JsonField<RefinementCriteria>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("eventFilterBranches")
        @ExcludeMissing
        eventFilterBranches: JsonField<List<PublicUnifiedEventsFilterBranch>> = JsonMissing.of(),
        @JsonProperty("listMembershipFilterBranches")
        @ExcludeMissing
        listMembershipFilterBranches: JsonField<List<ListMembershipFilterBranch>> =
            JsonMissing.of(),
        @JsonProperty("shouldReEnroll")
        @ExcludeMissing
        shouldReEnroll: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("refinementCriteria")
        @ExcludeMissing
        refinementCriteria: JsonField<RefinementCriteria> = JsonMissing.of(),
    ) : this(
        eventFilterBranches,
        listMembershipFilterBranches,
        shouldReEnroll,
        type,
        refinementCriteria,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventFilterBranches(): List<PublicUnifiedEventsFilterBranch> =
        eventFilterBranches.getRequired("eventFilterBranches")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listMembershipFilterBranches(): List<ListMembershipFilterBranch> =
        listMembershipFilterBranches.getRequired("listMembershipFilterBranches")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shouldReEnroll(): Boolean = shouldReEnroll.getRequired("shouldReEnroll")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun refinementCriteria(): Optional<RefinementCriteria> =
        refinementCriteria.getOptional("refinementCriteria")

    /**
     * Returns the raw JSON value of [eventFilterBranches].
     *
     * Unlike [eventFilterBranches], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eventFilterBranches")
    @ExcludeMissing
    fun _eventFilterBranches(): JsonField<List<PublicUnifiedEventsFilterBranch>> =
        eventFilterBranches

    /**
     * Returns the raw JSON value of [listMembershipFilterBranches].
     *
     * Unlike [listMembershipFilterBranches], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("listMembershipFilterBranches")
    @ExcludeMissing
    fun _listMembershipFilterBranches(): JsonField<List<ListMembershipFilterBranch>> =
        listMembershipFilterBranches

    /**
     * Returns the raw JSON value of [shouldReEnroll].
     *
     * Unlike [shouldReEnroll], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shouldReEnroll")
    @ExcludeMissing
    fun _shouldReEnroll(): JsonField<Boolean> = shouldReEnroll

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [refinementCriteria].
     *
     * Unlike [refinementCriteria], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("refinementCriteria")
    @ExcludeMissing
    fun _refinementCriteria(): JsonField<RefinementCriteria> = refinementCriteria

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
         * [ApiEventBasedEnrollmentCriteria].
         *
         * The following fields are required:
         * ```java
         * .eventFilterBranches()
         * .listMembershipFilterBranches()
         * .shouldReEnroll()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiEventBasedEnrollmentCriteria]. */
    class Builder internal constructor() {

        private var eventFilterBranches: JsonField<MutableList<PublicUnifiedEventsFilterBranch>>? =
            null
        private var listMembershipFilterBranches:
            JsonField<MutableList<ListMembershipFilterBranch>>? =
            null
        private var shouldReEnroll: JsonField<Boolean>? = null
        private var type: JsonField<Type>? = null
        private var refinementCriteria: JsonField<RefinementCriteria> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiEventBasedEnrollmentCriteria: ApiEventBasedEnrollmentCriteria) =
            apply {
                eventFilterBranches =
                    apiEventBasedEnrollmentCriteria.eventFilterBranches.map { it.toMutableList() }
                listMembershipFilterBranches =
                    apiEventBasedEnrollmentCriteria.listMembershipFilterBranches.map {
                        it.toMutableList()
                    }
                shouldReEnroll = apiEventBasedEnrollmentCriteria.shouldReEnroll
                type = apiEventBasedEnrollmentCriteria.type
                refinementCriteria = apiEventBasedEnrollmentCriteria.refinementCriteria
                additionalProperties =
                    apiEventBasedEnrollmentCriteria.additionalProperties.toMutableMap()
            }

        fun eventFilterBranches(eventFilterBranches: List<PublicUnifiedEventsFilterBranch>) =
            eventFilterBranches(JsonField.of(eventFilterBranches))

        /**
         * Sets [Builder.eventFilterBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventFilterBranches] with a well-typed
         * `List<PublicUnifiedEventsFilterBranch>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun eventFilterBranches(
            eventFilterBranches: JsonField<List<PublicUnifiedEventsFilterBranch>>
        ) = apply { this.eventFilterBranches = eventFilterBranches.map { it.toMutableList() } }

        /**
         * Adds a single [PublicUnifiedEventsFilterBranch] to [eventFilterBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventFilterBranch(eventFilterBranch: PublicUnifiedEventsFilterBranch) = apply {
            eventFilterBranches =
                (eventFilterBranches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("eventFilterBranches", it).add(eventFilterBranch)
                }
        }

        fun listMembershipFilterBranches(
            listMembershipFilterBranches: List<ListMembershipFilterBranch>
        ) = listMembershipFilterBranches(JsonField.of(listMembershipFilterBranches))

        /**
         * Sets [Builder.listMembershipFilterBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listMembershipFilterBranches] with a well-typed
         * `List<ListMembershipFilterBranch>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun listMembershipFilterBranches(
            listMembershipFilterBranches: JsonField<List<ListMembershipFilterBranch>>
        ) = apply {
            this.listMembershipFilterBranches =
                listMembershipFilterBranches.map { it.toMutableList() }
        }

        /**
         * Adds a single [ListMembershipFilterBranch] to [listMembershipFilterBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addListMembershipFilterBranch(listMembershipFilterBranch: ListMembershipFilterBranch) =
            apply {
                listMembershipFilterBranches =
                    (listMembershipFilterBranches ?: JsonField.of(mutableListOf())).also {
                        checkKnown("listMembershipFilterBranches", it)
                            .add(listMembershipFilterBranch)
                    }
            }

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicOr(publicOr)`.
         */
        fun addListMembershipFilterBranch(publicOr: PublicOrFilterBranch) =
            addListMembershipFilterBranch(ListMembershipFilterBranch.ofPublicOr(publicOr))

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicAnd(publicAnd)`.
         */
        fun addListMembershipFilterBranch(publicAnd: PublicAndFilterBranch) =
            addListMembershipFilterBranch(ListMembershipFilterBranch.ofPublicAnd(publicAnd))

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicNotAll(publicNotAll)`.
         */
        fun addListMembershipFilterBranch(publicNotAll: PublicNotAllFilterBranch) =
            addListMembershipFilterBranch(ListMembershipFilterBranch.ofPublicNotAll(publicNotAll))

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicNotAny(publicNotAny)`.
         */
        fun addListMembershipFilterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            addListMembershipFilterBranch(ListMembershipFilterBranch.ofPublicNotAny(publicNotAny))

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun addListMembershipFilterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            addListMembershipFilterBranch(
                ListMembershipFilterBranch.ofPublicRestricted(publicRestricted)
            )

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun addListMembershipFilterBranch(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
            addListMembershipFilterBranch(
                ListMembershipFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)
            )

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun addListMembershipFilterBranch(
            publicPropertyAssociation: PublicPropertyAssociationFilterBranch
        ) =
            addListMembershipFilterBranch(
                ListMembershipFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)
            )

        /**
         * Alias for calling [addListMembershipFilterBranch] with
         * `ListMembershipFilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun addListMembershipFilterBranch(publicAssociation: PublicAssociationFilterBranch) =
            addListMembershipFilterBranch(
                ListMembershipFilterBranch.ofPublicAssociation(publicAssociation)
            )

        fun shouldReEnroll(shouldReEnroll: Boolean) = shouldReEnroll(JsonField.of(shouldReEnroll))

        /**
         * Sets [Builder.shouldReEnroll] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldReEnroll] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shouldReEnroll(shouldReEnroll: JsonField<Boolean>) = apply {
            this.shouldReEnroll = shouldReEnroll
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun refinementCriteria(refinementCriteria: RefinementCriteria) =
            refinementCriteria(JsonField.of(refinementCriteria))

        /**
         * Sets [Builder.refinementCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refinementCriteria] with a well-typed
         * [RefinementCriteria] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun refinementCriteria(refinementCriteria: JsonField<RefinementCriteria>) = apply {
            this.refinementCriteria = refinementCriteria
        }

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicOrFilterBranch(publicOrFilterBranch)`.
         */
        fun refinementCriteria(publicOrFilterBranch: PublicOrFilterBranch) =
            refinementCriteria(RefinementCriteria.ofPublicOrFilterBranch(publicOrFilterBranch))

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicAndFilterBranch(publicAndFilterBranch)`.
         */
        fun refinementCriteria(publicAndFilterBranch: PublicAndFilterBranch) =
            refinementCriteria(RefinementCriteria.ofPublicAndFilterBranch(publicAndFilterBranch))

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicNotAllFilterBranch(publicNotAllFilterBranch)`.
         */
        fun refinementCriteria(publicNotAllFilterBranch: PublicNotAllFilterBranch) =
            refinementCriteria(
                RefinementCriteria.ofPublicNotAllFilterBranch(publicNotAllFilterBranch)
            )

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicNotAnyFilterBranch(publicNotAnyFilterBranch)`.
         */
        fun refinementCriteria(publicNotAnyFilterBranch: PublicNotAnyFilterBranch) =
            refinementCriteria(
                RefinementCriteria.ofPublicNotAnyFilterBranch(publicNotAnyFilterBranch)
            )

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicRestrictedFilterBranch(publicRestrictedFilterBranch)`.
         */
        fun refinementCriteria(publicRestrictedFilterBranch: PublicRestrictedFilterBranch) =
            refinementCriteria(
                RefinementCriteria.ofPublicRestrictedFilterBranch(publicRestrictedFilterBranch)
            )

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicUnifiedEventsFilterBranch(publicUnifiedEventsFilterBranch)`.
         */
        fun refinementCriteria(publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch) =
            refinementCriteria(
                RefinementCriteria.ofPublicUnifiedEventsFilterBranch(
                    publicUnifiedEventsFilterBranch
                )
            )

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicPropertyAssociationFilterBranch(publicPropertyAssociationFilterBranch)`.
         */
        fun refinementCriteria(
            publicPropertyAssociationFilterBranch: PublicPropertyAssociationFilterBranch
        ) =
            refinementCriteria(
                RefinementCriteria.ofPublicPropertyAssociationFilterBranch(
                    publicPropertyAssociationFilterBranch
                )
            )

        /**
         * Alias for calling [refinementCriteria] with
         * `RefinementCriteria.ofPublicAssociationFilterBranch(publicAssociationFilterBranch)`.
         */
        fun refinementCriteria(publicAssociationFilterBranch: PublicAssociationFilterBranch) =
            refinementCriteria(
                RefinementCriteria.ofPublicAssociationFilterBranch(publicAssociationFilterBranch)
            )

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
         * Returns an immutable instance of [ApiEventBasedEnrollmentCriteria].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventFilterBranches()
         * .listMembershipFilterBranches()
         * .shouldReEnroll()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiEventBasedEnrollmentCriteria =
            ApiEventBasedEnrollmentCriteria(
                checkRequired("eventFilterBranches", eventFilterBranches).map { it.toImmutable() },
                checkRequired("listMembershipFilterBranches", listMembershipFilterBranches).map {
                    it.toImmutable()
                },
                checkRequired("shouldReEnroll", shouldReEnroll),
                checkRequired("type", type),
                refinementCriteria,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiEventBasedEnrollmentCriteria = apply {
        if (validated) {
            return@apply
        }

        eventFilterBranches().forEach { it.validate() }
        listMembershipFilterBranches().forEach { it.validate() }
        shouldReEnroll()
        type().validate()
        refinementCriteria().ifPresent { it.validate() }
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
        (eventFilterBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (listMembershipFilterBranches.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (if (shouldReEnroll.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (refinementCriteria.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = ListMembershipFilterBranch.Deserializer::class)
    @JsonSerialize(using = ListMembershipFilterBranch.Serializer::class)
    class ListMembershipFilterBranch
    private constructor(
        private val publicOr: PublicOrFilterBranch? = null,
        private val publicAnd: PublicAndFilterBranch? = null,
        private val publicNotAll: PublicNotAllFilterBranch? = null,
        private val publicNotAny: PublicNotAnyFilterBranch? = null,
        private val publicRestricted: PublicRestrictedFilterBranch? = null,
        private val publicUnifiedEvents: PublicUnifiedEventsFilterBranch? = null,
        private val publicPropertyAssociation: PublicPropertyAssociationFilterBranch? = null,
        private val publicAssociation: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicOr(): Optional<PublicOrFilterBranch> = Optional.ofNullable(publicOr)

        fun publicAnd(): Optional<PublicAndFilterBranch> = Optional.ofNullable(publicAnd)

        fun publicNotAll(): Optional<PublicNotAllFilterBranch> = Optional.ofNullable(publicNotAll)

        fun publicNotAny(): Optional<PublicNotAnyFilterBranch> = Optional.ofNullable(publicNotAny)

        fun publicRestricted(): Optional<PublicRestrictedFilterBranch> =
            Optional.ofNullable(publicRestricted)

        fun publicUnifiedEvents(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(publicUnifiedEvents)

        fun publicPropertyAssociation(): Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(publicPropertyAssociation)

        fun publicAssociation(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(publicAssociation)

        fun isPublicOr(): Boolean = publicOr != null

        fun isPublicAnd(): Boolean = publicAnd != null

        fun isPublicNotAll(): Boolean = publicNotAll != null

        fun isPublicNotAny(): Boolean = publicNotAny != null

        fun isPublicRestricted(): Boolean = publicRestricted != null

        fun isPublicUnifiedEvents(): Boolean = publicUnifiedEvents != null

        fun isPublicPropertyAssociation(): Boolean = publicPropertyAssociation != null

        fun isPublicAssociation(): Boolean = publicAssociation != null

        fun asPublicOr(): PublicOrFilterBranch = publicOr.getOrThrow("publicOr")

        fun asPublicAnd(): PublicAndFilterBranch = publicAnd.getOrThrow("publicAnd")

        fun asPublicNotAll(): PublicNotAllFilterBranch = publicNotAll.getOrThrow("publicNotAll")

        fun asPublicNotAny(): PublicNotAnyFilterBranch = publicNotAny.getOrThrow("publicNotAny")

        fun asPublicRestricted(): PublicRestrictedFilterBranch =
            publicRestricted.getOrThrow("publicRestricted")

        fun asPublicUnifiedEvents(): PublicUnifiedEventsFilterBranch =
            publicUnifiedEvents.getOrThrow("publicUnifiedEvents")

        fun asPublicPropertyAssociation(): PublicPropertyAssociationFilterBranch =
            publicPropertyAssociation.getOrThrow("publicPropertyAssociation")

        fun asPublicAssociation(): PublicAssociationFilterBranch =
            publicAssociation.getOrThrow("publicAssociation")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicOr != null -> visitor.visitPublicOr(publicOr)
                publicAnd != null -> visitor.visitPublicAnd(publicAnd)
                publicNotAll != null -> visitor.visitPublicNotAll(publicNotAll)
                publicNotAny != null -> visitor.visitPublicNotAny(publicNotAny)
                publicRestricted != null -> visitor.visitPublicRestricted(publicRestricted)
                publicUnifiedEvents != null -> visitor.visitPublicUnifiedEvents(publicUnifiedEvents)
                publicPropertyAssociation != null ->
                    visitor.visitPublicPropertyAssociation(publicPropertyAssociation)
                publicAssociation != null -> visitor.visitPublicAssociation(publicAssociation)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): ListMembershipFilterBranch = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicOr(publicOr: PublicOrFilterBranch) {
                        publicOr.validate()
                    }

                    override fun visitPublicAnd(publicAnd: PublicAndFilterBranch) {
                        publicAnd.validate()
                    }

                    override fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch) {
                        publicNotAll.validate()
                    }

                    override fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) {
                        publicNotAny.validate()
                    }

                    override fun visitPublicRestricted(
                        publicRestricted: PublicRestrictedFilterBranch
                    ) {
                        publicRestricted.validate()
                    }

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilterBranch
                    ) {
                        publicUnifiedEvents.validate()
                    }

                    override fun visitPublicPropertyAssociation(
                        publicPropertyAssociation: PublicPropertyAssociationFilterBranch
                    ) {
                        publicPropertyAssociation.validate()
                    }

                    override fun visitPublicAssociation(
                        publicAssociation: PublicAssociationFilterBranch
                    ) {
                        publicAssociation.validate()
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
                    override fun visitPublicOr(publicOr: PublicOrFilterBranch) = publicOr.validity()

                    override fun visitPublicAnd(publicAnd: PublicAndFilterBranch) =
                        publicAnd.validity()

                    override fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                        publicNotAll.validity()

                    override fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                        publicNotAny.validity()

                    override fun visitPublicRestricted(
                        publicRestricted: PublicRestrictedFilterBranch
                    ) = publicRestricted.validity()

                    override fun visitPublicUnifiedEvents(
                        publicUnifiedEvents: PublicUnifiedEventsFilterBranch
                    ) = publicUnifiedEvents.validity()

                    override fun visitPublicPropertyAssociation(
                        publicPropertyAssociation: PublicPropertyAssociationFilterBranch
                    ) = publicPropertyAssociation.validity()

                    override fun visitPublicAssociation(
                        publicAssociation: PublicAssociationFilterBranch
                    ) = publicAssociation.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ListMembershipFilterBranch &&
                publicOr == other.publicOr &&
                publicAnd == other.publicAnd &&
                publicNotAll == other.publicNotAll &&
                publicNotAny == other.publicNotAny &&
                publicRestricted == other.publicRestricted &&
                publicUnifiedEvents == other.publicUnifiedEvents &&
                publicPropertyAssociation == other.publicPropertyAssociation &&
                publicAssociation == other.publicAssociation
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicOr,
                publicAnd,
                publicNotAll,
                publicNotAny,
                publicRestricted,
                publicUnifiedEvents,
                publicPropertyAssociation,
                publicAssociation,
            )

        override fun toString(): String =
            when {
                publicOr != null -> "ListMembershipFilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "ListMembershipFilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null -> "ListMembershipFilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null -> "ListMembershipFilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null ->
                    "ListMembershipFilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "ListMembershipFilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "ListMembershipFilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null ->
                    "ListMembershipFilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "ListMembershipFilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ListMembershipFilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) =
                ListMembershipFilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) =
                ListMembershipFilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                ListMembershipFilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                ListMembershipFilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                ListMembershipFilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                ListMembershipFilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) = ListMembershipFilterBranch(publicPropertyAssociation = publicPropertyAssociation)

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                ListMembershipFilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [ListMembershipFilterBranch] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitPublicOr(publicOr: PublicOrFilterBranch): T

            fun visitPublicAnd(publicAnd: PublicAndFilterBranch): T

            fun visitPublicNotAll(publicNotAll: PublicNotAllFilterBranch): T

            fun visitPublicNotAny(publicNotAny: PublicNotAnyFilterBranch): T

            fun visitPublicRestricted(publicRestricted: PublicRestrictedFilterBranch): T

            fun visitPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch): T

            fun visitPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ): T

            fun visitPublicAssociation(publicAssociation: PublicAssociationFilterBranch): T

            /**
             * Maps an unknown variant of [ListMembershipFilterBranch] to a value of type [T].
             *
             * An instance of [ListMembershipFilterBranch] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown ListMembershipFilterBranch: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<ListMembershipFilterBranch>(ListMembershipFilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ListMembershipFilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                ListMembershipFilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                ListMembershipFilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                ListMembershipFilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                ListMembershipFilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let {
                                    ListMembershipFilterBranch(publicRestricted = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let {
                                    ListMembershipFilterBranch(
                                        publicUnifiedEvents = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    ListMembershipFilterBranch(
                                        publicPropertyAssociation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let {
                                    ListMembershipFilterBranch(publicAssociation = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ListMembershipFilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<ListMembershipFilterBranch>(ListMembershipFilterBranch::class) {

            override fun serialize(
                value: ListMembershipFilterBranch,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicOr != null -> generator.writeObject(value.publicOr)
                    value.publicAnd != null -> generator.writeObject(value.publicAnd)
                    value.publicNotAll != null -> generator.writeObject(value.publicNotAll)
                    value.publicNotAny != null -> generator.writeObject(value.publicNotAny)
                    value.publicRestricted != null -> generator.writeObject(value.publicRestricted)
                    value.publicUnifiedEvents != null ->
                        generator.writeObject(value.publicUnifiedEvents)
                    value.publicPropertyAssociation != null ->
                        generator.writeObject(value.publicPropertyAssociation)
                    value.publicAssociation != null ->
                        generator.writeObject(value.publicAssociation)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid ListMembershipFilterBranch")
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

            @JvmField val EVENT_BASED = of("EVENT_BASED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            EVENT_BASED
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
            EVENT_BASED,
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
                EVENT_BASED -> Value.EVENT_BASED
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
                EVENT_BASED -> Known.EVENT_BASED
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

    @JsonDeserialize(using = RefinementCriteria.Deserializer::class)
    @JsonSerialize(using = RefinementCriteria.Serializer::class)
    class RefinementCriteria
    private constructor(
        private val publicOrFilterBranch: PublicOrFilterBranch? = null,
        private val publicAndFilterBranch: PublicAndFilterBranch? = null,
        private val publicNotAllFilterBranch: PublicNotAllFilterBranch? = null,
        private val publicNotAnyFilterBranch: PublicNotAnyFilterBranch? = null,
        private val publicRestrictedFilterBranch: PublicRestrictedFilterBranch? = null,
        private val publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch? = null,
        private val publicPropertyAssociationFilterBranch: PublicPropertyAssociationFilterBranch? =
            null,
        private val publicAssociationFilterBranch: PublicAssociationFilterBranch? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicOrFilterBranch(): Optional<PublicOrFilterBranch> =
            Optional.ofNullable(publicOrFilterBranch)

        fun publicAndFilterBranch(): Optional<PublicAndFilterBranch> =
            Optional.ofNullable(publicAndFilterBranch)

        fun publicNotAllFilterBranch(): Optional<PublicNotAllFilterBranch> =
            Optional.ofNullable(publicNotAllFilterBranch)

        fun publicNotAnyFilterBranch(): Optional<PublicNotAnyFilterBranch> =
            Optional.ofNullable(publicNotAnyFilterBranch)

        fun publicRestrictedFilterBranch(): Optional<PublicRestrictedFilterBranch> =
            Optional.ofNullable(publicRestrictedFilterBranch)

        fun publicUnifiedEventsFilterBranch(): Optional<PublicUnifiedEventsFilterBranch> =
            Optional.ofNullable(publicUnifiedEventsFilterBranch)

        fun publicPropertyAssociationFilterBranch():
            Optional<PublicPropertyAssociationFilterBranch> =
            Optional.ofNullable(publicPropertyAssociationFilterBranch)

        fun publicAssociationFilterBranch(): Optional<PublicAssociationFilterBranch> =
            Optional.ofNullable(publicAssociationFilterBranch)

        fun isPublicOrFilterBranch(): Boolean = publicOrFilterBranch != null

        fun isPublicAndFilterBranch(): Boolean = publicAndFilterBranch != null

        fun isPublicNotAllFilterBranch(): Boolean = publicNotAllFilterBranch != null

        fun isPublicNotAnyFilterBranch(): Boolean = publicNotAnyFilterBranch != null

        fun isPublicRestrictedFilterBranch(): Boolean = publicRestrictedFilterBranch != null

        fun isPublicUnifiedEventsFilterBranch(): Boolean = publicUnifiedEventsFilterBranch != null

        fun isPublicPropertyAssociationFilterBranch(): Boolean =
            publicPropertyAssociationFilterBranch != null

        fun isPublicAssociationFilterBranch(): Boolean = publicAssociationFilterBranch != null

        fun asPublicOrFilterBranch(): PublicOrFilterBranch =
            publicOrFilterBranch.getOrThrow("publicOrFilterBranch")

        fun asPublicAndFilterBranch(): PublicAndFilterBranch =
            publicAndFilterBranch.getOrThrow("publicAndFilterBranch")

        fun asPublicNotAllFilterBranch(): PublicNotAllFilterBranch =
            publicNotAllFilterBranch.getOrThrow("publicNotAllFilterBranch")

        fun asPublicNotAnyFilterBranch(): PublicNotAnyFilterBranch =
            publicNotAnyFilterBranch.getOrThrow("publicNotAnyFilterBranch")

        fun asPublicRestrictedFilterBranch(): PublicRestrictedFilterBranch =
            publicRestrictedFilterBranch.getOrThrow("publicRestrictedFilterBranch")

        fun asPublicUnifiedEventsFilterBranch(): PublicUnifiedEventsFilterBranch =
            publicUnifiedEventsFilterBranch.getOrThrow("publicUnifiedEventsFilterBranch")

        fun asPublicPropertyAssociationFilterBranch(): PublicPropertyAssociationFilterBranch =
            publicPropertyAssociationFilterBranch.getOrThrow(
                "publicPropertyAssociationFilterBranch"
            )

        fun asPublicAssociationFilterBranch(): PublicAssociationFilterBranch =
            publicAssociationFilterBranch.getOrThrow("publicAssociationFilterBranch")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicOrFilterBranch != null ->
                    visitor.visitPublicOrFilterBranch(publicOrFilterBranch)
                publicAndFilterBranch != null ->
                    visitor.visitPublicAndFilterBranch(publicAndFilterBranch)
                publicNotAllFilterBranch != null ->
                    visitor.visitPublicNotAllFilterBranch(publicNotAllFilterBranch)
                publicNotAnyFilterBranch != null ->
                    visitor.visitPublicNotAnyFilterBranch(publicNotAnyFilterBranch)
                publicRestrictedFilterBranch != null ->
                    visitor.visitPublicRestrictedFilterBranch(publicRestrictedFilterBranch)
                publicUnifiedEventsFilterBranch != null ->
                    visitor.visitPublicUnifiedEventsFilterBranch(publicUnifiedEventsFilterBranch)
                publicPropertyAssociationFilterBranch != null ->
                    visitor.visitPublicPropertyAssociationFilterBranch(
                        publicPropertyAssociationFilterBranch
                    )
                publicAssociationFilterBranch != null ->
                    visitor.visitPublicAssociationFilterBranch(publicAssociationFilterBranch)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): RefinementCriteria = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicOrFilterBranch(
                        publicOrFilterBranch: PublicOrFilterBranch
                    ) {
                        publicOrFilterBranch.validate()
                    }

                    override fun visitPublicAndFilterBranch(
                        publicAndFilterBranch: PublicAndFilterBranch
                    ) {
                        publicAndFilterBranch.validate()
                    }

                    override fun visitPublicNotAllFilterBranch(
                        publicNotAllFilterBranch: PublicNotAllFilterBranch
                    ) {
                        publicNotAllFilterBranch.validate()
                    }

                    override fun visitPublicNotAnyFilterBranch(
                        publicNotAnyFilterBranch: PublicNotAnyFilterBranch
                    ) {
                        publicNotAnyFilterBranch.validate()
                    }

                    override fun visitPublicRestrictedFilterBranch(
                        publicRestrictedFilterBranch: PublicRestrictedFilterBranch
                    ) {
                        publicRestrictedFilterBranch.validate()
                    }

                    override fun visitPublicUnifiedEventsFilterBranch(
                        publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch
                    ) {
                        publicUnifiedEventsFilterBranch.validate()
                    }

                    override fun visitPublicPropertyAssociationFilterBranch(
                        publicPropertyAssociationFilterBranch: PublicPropertyAssociationFilterBranch
                    ) {
                        publicPropertyAssociationFilterBranch.validate()
                    }

                    override fun visitPublicAssociationFilterBranch(
                        publicAssociationFilterBranch: PublicAssociationFilterBranch
                    ) {
                        publicAssociationFilterBranch.validate()
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
                    override fun visitPublicOrFilterBranch(
                        publicOrFilterBranch: PublicOrFilterBranch
                    ) = publicOrFilterBranch.validity()

                    override fun visitPublicAndFilterBranch(
                        publicAndFilterBranch: PublicAndFilterBranch
                    ) = publicAndFilterBranch.validity()

                    override fun visitPublicNotAllFilterBranch(
                        publicNotAllFilterBranch: PublicNotAllFilterBranch
                    ) = publicNotAllFilterBranch.validity()

                    override fun visitPublicNotAnyFilterBranch(
                        publicNotAnyFilterBranch: PublicNotAnyFilterBranch
                    ) = publicNotAnyFilterBranch.validity()

                    override fun visitPublicRestrictedFilterBranch(
                        publicRestrictedFilterBranch: PublicRestrictedFilterBranch
                    ) = publicRestrictedFilterBranch.validity()

                    override fun visitPublicUnifiedEventsFilterBranch(
                        publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch
                    ) = publicUnifiedEventsFilterBranch.validity()

                    override fun visitPublicPropertyAssociationFilterBranch(
                        publicPropertyAssociationFilterBranch: PublicPropertyAssociationFilterBranch
                    ) = publicPropertyAssociationFilterBranch.validity()

                    override fun visitPublicAssociationFilterBranch(
                        publicAssociationFilterBranch: PublicAssociationFilterBranch
                    ) = publicAssociationFilterBranch.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RefinementCriteria &&
                publicOrFilterBranch == other.publicOrFilterBranch &&
                publicAndFilterBranch == other.publicAndFilterBranch &&
                publicNotAllFilterBranch == other.publicNotAllFilterBranch &&
                publicNotAnyFilterBranch == other.publicNotAnyFilterBranch &&
                publicRestrictedFilterBranch == other.publicRestrictedFilterBranch &&
                publicUnifiedEventsFilterBranch == other.publicUnifiedEventsFilterBranch &&
                publicPropertyAssociationFilterBranch ==
                    other.publicPropertyAssociationFilterBranch &&
                publicAssociationFilterBranch == other.publicAssociationFilterBranch
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicOrFilterBranch,
                publicAndFilterBranch,
                publicNotAllFilterBranch,
                publicNotAnyFilterBranch,
                publicRestrictedFilterBranch,
                publicUnifiedEventsFilterBranch,
                publicPropertyAssociationFilterBranch,
                publicAssociationFilterBranch,
            )

        override fun toString(): String =
            when {
                publicOrFilterBranch != null ->
                    "RefinementCriteria{publicOrFilterBranch=$publicOrFilterBranch}"
                publicAndFilterBranch != null ->
                    "RefinementCriteria{publicAndFilterBranch=$publicAndFilterBranch}"
                publicNotAllFilterBranch != null ->
                    "RefinementCriteria{publicNotAllFilterBranch=$publicNotAllFilterBranch}"
                publicNotAnyFilterBranch != null ->
                    "RefinementCriteria{publicNotAnyFilterBranch=$publicNotAnyFilterBranch}"
                publicRestrictedFilterBranch != null ->
                    "RefinementCriteria{publicRestrictedFilterBranch=$publicRestrictedFilterBranch}"
                publicUnifiedEventsFilterBranch != null ->
                    "RefinementCriteria{publicUnifiedEventsFilterBranch=$publicUnifiedEventsFilterBranch}"
                publicPropertyAssociationFilterBranch != null ->
                    "RefinementCriteria{publicPropertyAssociationFilterBranch=$publicPropertyAssociationFilterBranch}"
                publicAssociationFilterBranch != null ->
                    "RefinementCriteria{publicAssociationFilterBranch=$publicAssociationFilterBranch}"
                _json != null -> "RefinementCriteria{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid RefinementCriteria")
            }

        companion object {

            @JvmStatic
            fun ofPublicOrFilterBranch(publicOrFilterBranch: PublicOrFilterBranch) =
                RefinementCriteria(publicOrFilterBranch = publicOrFilterBranch)

            @JvmStatic
            fun ofPublicAndFilterBranch(publicAndFilterBranch: PublicAndFilterBranch) =
                RefinementCriteria(publicAndFilterBranch = publicAndFilterBranch)

            @JvmStatic
            fun ofPublicNotAllFilterBranch(publicNotAllFilterBranch: PublicNotAllFilterBranch) =
                RefinementCriteria(publicNotAllFilterBranch = publicNotAllFilterBranch)

            @JvmStatic
            fun ofPublicNotAnyFilterBranch(publicNotAnyFilterBranch: PublicNotAnyFilterBranch) =
                RefinementCriteria(publicNotAnyFilterBranch = publicNotAnyFilterBranch)

            @JvmStatic
            fun ofPublicRestrictedFilterBranch(
                publicRestrictedFilterBranch: PublicRestrictedFilterBranch
            ) = RefinementCriteria(publicRestrictedFilterBranch = publicRestrictedFilterBranch)

            @JvmStatic
            fun ofPublicUnifiedEventsFilterBranch(
                publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch
            ) =
                RefinementCriteria(
                    publicUnifiedEventsFilterBranch = publicUnifiedEventsFilterBranch
                )

            @JvmStatic
            fun ofPublicPropertyAssociationFilterBranch(
                publicPropertyAssociationFilterBranch: PublicPropertyAssociationFilterBranch
            ) =
                RefinementCriteria(
                    publicPropertyAssociationFilterBranch = publicPropertyAssociationFilterBranch
                )

            @JvmStatic
            fun ofPublicAssociationFilterBranch(
                publicAssociationFilterBranch: PublicAssociationFilterBranch
            ) = RefinementCriteria(publicAssociationFilterBranch = publicAssociationFilterBranch)
        }

        /**
         * An interface that defines how to map each variant of [RefinementCriteria] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitPublicOrFilterBranch(publicOrFilterBranch: PublicOrFilterBranch): T

            fun visitPublicAndFilterBranch(publicAndFilterBranch: PublicAndFilterBranch): T

            fun visitPublicNotAllFilterBranch(publicNotAllFilterBranch: PublicNotAllFilterBranch): T

            fun visitPublicNotAnyFilterBranch(publicNotAnyFilterBranch: PublicNotAnyFilterBranch): T

            fun visitPublicRestrictedFilterBranch(
                publicRestrictedFilterBranch: PublicRestrictedFilterBranch
            ): T

            fun visitPublicUnifiedEventsFilterBranch(
                publicUnifiedEventsFilterBranch: PublicUnifiedEventsFilterBranch
            ): T

            fun visitPublicPropertyAssociationFilterBranch(
                publicPropertyAssociationFilterBranch: PublicPropertyAssociationFilterBranch
            ): T

            fun visitPublicAssociationFilterBranch(
                publicAssociationFilterBranch: PublicAssociationFilterBranch
            ): T

            /**
             * Maps an unknown variant of [RefinementCriteria] to a value of type [T].
             *
             * An instance of [RefinementCriteria] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown RefinementCriteria: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<RefinementCriteria>(RefinementCriteria::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): RefinementCriteria {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                RefinementCriteria(publicOrFilterBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                RefinementCriteria(publicAndFilterBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                RefinementCriteria(publicNotAllFilterBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                RefinementCriteria(publicNotAnyFilterBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let {
                                    RefinementCriteria(
                                        publicRestrictedFilterBranch = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let {
                                    RefinementCriteria(
                                        publicUnifiedEventsFilterBranch = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    RefinementCriteria(
                                        publicPropertyAssociationFilterBranch = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let {
                                    RefinementCriteria(
                                        publicAssociationFilterBranch = it,
                                        _json = json,
                                    )
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> RefinementCriteria(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<RefinementCriteria>(RefinementCriteria::class) {

            override fun serialize(
                value: RefinementCriteria,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicOrFilterBranch != null ->
                        generator.writeObject(value.publicOrFilterBranch)
                    value.publicAndFilterBranch != null ->
                        generator.writeObject(value.publicAndFilterBranch)
                    value.publicNotAllFilterBranch != null ->
                        generator.writeObject(value.publicNotAllFilterBranch)
                    value.publicNotAnyFilterBranch != null ->
                        generator.writeObject(value.publicNotAnyFilterBranch)
                    value.publicRestrictedFilterBranch != null ->
                        generator.writeObject(value.publicRestrictedFilterBranch)
                    value.publicUnifiedEventsFilterBranch != null ->
                        generator.writeObject(value.publicUnifiedEventsFilterBranch)
                    value.publicPropertyAssociationFilterBranch != null ->
                        generator.writeObject(value.publicPropertyAssociationFilterBranch)
                    value.publicAssociationFilterBranch != null ->
                        generator.writeObject(value.publicAssociationFilterBranch)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid RefinementCriteria")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiEventBasedEnrollmentCriteria &&
            eventFilterBranches == other.eventFilterBranches &&
            listMembershipFilterBranches == other.listMembershipFilterBranches &&
            shouldReEnroll == other.shouldReEnroll &&
            type == other.type &&
            refinementCriteria == other.refinementCriteria &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            eventFilterBranches,
            listMembershipFilterBranches,
            shouldReEnroll,
            type,
            refinementCriteria,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiEventBasedEnrollmentCriteria{eventFilterBranches=$eventFilterBranches, listMembershipFilterBranches=$listMembershipFilterBranches, shouldReEnroll=$shouldReEnroll, type=$type, refinementCriteria=$refinementCriteria, additionalProperties=$additionalProperties}"
}
