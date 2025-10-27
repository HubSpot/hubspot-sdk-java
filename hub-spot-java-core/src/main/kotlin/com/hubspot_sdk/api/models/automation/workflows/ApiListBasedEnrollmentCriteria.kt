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
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
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

class ApiListBasedEnrollmentCriteria
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val listFilterBranch: JsonField<ListFilterBranch>,
    private val reEnrollmentTriggersFilterBranches:
        JsonField<List<ReEnrollmentTriggersFilterBranch>>,
    private val shouldReEnroll: JsonField<Boolean>,
    private val type: JsonField<Type>,
    private val unEnrollObjectsNotMeetingCriteria: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("listFilterBranch")
        @ExcludeMissing
        listFilterBranch: JsonField<ListFilterBranch> = JsonMissing.of(),
        @JsonProperty("reEnrollmentTriggersFilterBranches")
        @ExcludeMissing
        reEnrollmentTriggersFilterBranches: JsonField<List<ReEnrollmentTriggersFilterBranch>> =
            JsonMissing.of(),
        @JsonProperty("shouldReEnroll")
        @ExcludeMissing
        shouldReEnroll: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("unEnrollObjectsNotMeetingCriteria")
        @ExcludeMissing
        unEnrollObjectsNotMeetingCriteria: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        listFilterBranch,
        reEnrollmentTriggersFilterBranches,
        shouldReEnroll,
        type,
        unEnrollObjectsNotMeetingCriteria,
        mutableMapOf(),
    )

    /**
     * The list filter branch that represents the enrollment trigger to this flow.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun listFilterBranch(): ListFilterBranch = listFilterBranch.getRequired("listFilterBranch")

    /**
     * A list of filter branches to listen for in order to re-enroll objects into this workflow.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reEnrollmentTriggersFilterBranches(): List<ReEnrollmentTriggersFilterBranch> =
        reEnrollmentTriggersFilterBranches.getRequired("reEnrollmentTriggersFilterBranches")

    /**
     * Whether or not the same object can enroll in this workflow twice.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shouldReEnroll(): Boolean = shouldReEnroll.getRequired("shouldReEnroll")

    /**
     * The type of enrollment criteria this is, this can be "LIST_BASED", "EVENT_BASED", or
     * "MANUAL".
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Whether or not to remove objects from this workflow if they stop meeting the enrollment
     * criteria.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unEnrollObjectsNotMeetingCriteria(): Boolean =
        unEnrollObjectsNotMeetingCriteria.getRequired("unEnrollObjectsNotMeetingCriteria")

    /**
     * Returns the raw JSON value of [listFilterBranch].
     *
     * Unlike [listFilterBranch], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("listFilterBranch")
    @ExcludeMissing
    fun _listFilterBranch(): JsonField<ListFilterBranch> = listFilterBranch

    /**
     * Returns the raw JSON value of [reEnrollmentTriggersFilterBranches].
     *
     * Unlike [reEnrollmentTriggersFilterBranches], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("reEnrollmentTriggersFilterBranches")
    @ExcludeMissing
    fun _reEnrollmentTriggersFilterBranches(): JsonField<List<ReEnrollmentTriggersFilterBranch>> =
        reEnrollmentTriggersFilterBranches

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
     * Returns the raw JSON value of [unEnrollObjectsNotMeetingCriteria].
     *
     * Unlike [unEnrollObjectsNotMeetingCriteria], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("unEnrollObjectsNotMeetingCriteria")
    @ExcludeMissing
    fun _unEnrollObjectsNotMeetingCriteria(): JsonField<Boolean> = unEnrollObjectsNotMeetingCriteria

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
         * [ApiListBasedEnrollmentCriteria].
         *
         * The following fields are required:
         * ```java
         * .listFilterBranch()
         * .reEnrollmentTriggersFilterBranches()
         * .shouldReEnroll()
         * .type()
         * .unEnrollObjectsNotMeetingCriteria()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiListBasedEnrollmentCriteria]. */
    class Builder internal constructor() {

        private var listFilterBranch: JsonField<ListFilterBranch>? = null
        private var reEnrollmentTriggersFilterBranches:
            JsonField<MutableList<ReEnrollmentTriggersFilterBranch>>? =
            null
        private var shouldReEnroll: JsonField<Boolean>? = null
        private var type: JsonField<Type>? = null
        private var unEnrollObjectsNotMeetingCriteria: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiListBasedEnrollmentCriteria: ApiListBasedEnrollmentCriteria) = apply {
            listFilterBranch = apiListBasedEnrollmentCriteria.listFilterBranch
            reEnrollmentTriggersFilterBranches =
                apiListBasedEnrollmentCriteria.reEnrollmentTriggersFilterBranches.map {
                    it.toMutableList()
                }
            shouldReEnroll = apiListBasedEnrollmentCriteria.shouldReEnroll
            type = apiListBasedEnrollmentCriteria.type
            unEnrollObjectsNotMeetingCriteria =
                apiListBasedEnrollmentCriteria.unEnrollObjectsNotMeetingCriteria
            additionalProperties =
                apiListBasedEnrollmentCriteria.additionalProperties.toMutableMap()
        }

        /** The list filter branch that represents the enrollment trigger to this flow. */
        fun listFilterBranch(listFilterBranch: ListFilterBranch) =
            listFilterBranch(JsonField.of(listFilterBranch))

        /**
         * Sets [Builder.listFilterBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.listFilterBranch] with a well-typed [ListFilterBranch]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun listFilterBranch(listFilterBranch: JsonField<ListFilterBranch>) = apply {
            this.listFilterBranch = listFilterBranch
        }

        /** Alias for calling [listFilterBranch] with `ListFilterBranch.ofPublicOr(publicOr)`. */
        fun listFilterBranch(publicOr: PublicOrFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicOr(publicOr))

        /** Alias for calling [listFilterBranch] with `ListFilterBranch.ofPublicAnd(publicAnd)`. */
        fun listFilterBranch(publicAnd: PublicAndFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicAnd(publicAnd))

        /**
         * Alias for calling [listFilterBranch] with
         * `ListFilterBranch.ofPublicNotAll(publicNotAll)`.
         */
        fun listFilterBranch(publicNotAll: PublicNotAllFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicNotAll(publicNotAll))

        /**
         * Alias for calling [listFilterBranch] with
         * `ListFilterBranch.ofPublicNotAny(publicNotAny)`.
         */
        fun listFilterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicNotAny(publicNotAny))

        /**
         * Alias for calling [listFilterBranch] with
         * `ListFilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun listFilterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicRestricted(publicRestricted))

        /**
         * Alias for calling [listFilterBranch] with
         * `ListFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun listFilterBranch(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents))

        /**
         * Alias for calling [listFilterBranch] with
         * `ListFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun listFilterBranch(publicPropertyAssociation: PublicPropertyAssociationFilterBranch) =
            listFilterBranch(
                ListFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)
            )

        /**
         * Alias for calling [listFilterBranch] with
         * `ListFilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun listFilterBranch(publicAssociation: PublicAssociationFilterBranch) =
            listFilterBranch(ListFilterBranch.ofPublicAssociation(publicAssociation))

        /**
         * A list of filter branches to listen for in order to re-enroll objects into this workflow.
         */
        fun reEnrollmentTriggersFilterBranches(
            reEnrollmentTriggersFilterBranches: List<ReEnrollmentTriggersFilterBranch>
        ) = reEnrollmentTriggersFilterBranches(JsonField.of(reEnrollmentTriggersFilterBranches))

        /**
         * Sets [Builder.reEnrollmentTriggersFilterBranches] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reEnrollmentTriggersFilterBranches] with a well-typed
         * `List<ReEnrollmentTriggersFilterBranch>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun reEnrollmentTriggersFilterBranches(
            reEnrollmentTriggersFilterBranches: JsonField<List<ReEnrollmentTriggersFilterBranch>>
        ) = apply {
            this.reEnrollmentTriggersFilterBranches =
                reEnrollmentTriggersFilterBranches.map { it.toMutableList() }
        }

        /**
         * Adds a single [ReEnrollmentTriggersFilterBranch] to [reEnrollmentTriggersFilterBranches].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReEnrollmentTriggersFilterBranch(
            reEnrollmentTriggersFilterBranch: ReEnrollmentTriggersFilterBranch
        ) = apply {
            reEnrollmentTriggersFilterBranches =
                (reEnrollmentTriggersFilterBranches ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reEnrollmentTriggersFilterBranches", it)
                        .add(reEnrollmentTriggersFilterBranch)
                }
        }

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicOr(publicOr)`.
         */
        fun addReEnrollmentTriggersFilterBranch(publicOr: PublicOrFilterBranch) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicOr(publicOr)
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicAnd(publicAnd)`.
         */
        fun addReEnrollmentTriggersFilterBranch(publicAnd: PublicAndFilterBranch) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicAnd(publicAnd)
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicNotAll(publicNotAll)`.
         */
        fun addReEnrollmentTriggersFilterBranch(publicNotAll: PublicNotAllFilterBranch) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicNotAll(publicNotAll)
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicNotAny(publicNotAny)`.
         */
        fun addReEnrollmentTriggersFilterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicNotAny(publicNotAny)
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun addReEnrollmentTriggersFilterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicRestricted(publicRestricted)
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun addReEnrollmentTriggersFilterBranch(
            publicUnifiedEvents: PublicUnifiedEventsFilterBranch
        ) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun addReEnrollmentTriggersFilterBranch(
            publicPropertyAssociation: PublicPropertyAssociationFilterBranch
        ) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicPropertyAssociation(
                    publicPropertyAssociation
                )
            )

        /**
         * Alias for calling [addReEnrollmentTriggersFilterBranch] with
         * `ReEnrollmentTriggersFilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun addReEnrollmentTriggersFilterBranch(publicAssociation: PublicAssociationFilterBranch) =
            addReEnrollmentTriggersFilterBranch(
                ReEnrollmentTriggersFilterBranch.ofPublicAssociation(publicAssociation)
            )

        /** Whether or not the same object can enroll in this workflow twice. */
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

        /**
         * The type of enrollment criteria this is, this can be "LIST_BASED", "EVENT_BASED", or
         * "MANUAL".
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * Whether or not to remove objects from this workflow if they stop meeting the enrollment
         * criteria.
         */
        fun unEnrollObjectsNotMeetingCriteria(unEnrollObjectsNotMeetingCriteria: Boolean) =
            unEnrollObjectsNotMeetingCriteria(JsonField.of(unEnrollObjectsNotMeetingCriteria))

        /**
         * Sets [Builder.unEnrollObjectsNotMeetingCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unEnrollObjectsNotMeetingCriteria] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun unEnrollObjectsNotMeetingCriteria(
            unEnrollObjectsNotMeetingCriteria: JsonField<Boolean>
        ) = apply { this.unEnrollObjectsNotMeetingCriteria = unEnrollObjectsNotMeetingCriteria }

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
         * Returns an immutable instance of [ApiListBasedEnrollmentCriteria].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .listFilterBranch()
         * .reEnrollmentTriggersFilterBranches()
         * .shouldReEnroll()
         * .type()
         * .unEnrollObjectsNotMeetingCriteria()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiListBasedEnrollmentCriteria =
            ApiListBasedEnrollmentCriteria(
                checkRequired("listFilterBranch", listFilterBranch),
                checkRequired(
                        "reEnrollmentTriggersFilterBranches",
                        reEnrollmentTriggersFilterBranches,
                    )
                    .map { it.toImmutable() },
                checkRequired("shouldReEnroll", shouldReEnroll),
                checkRequired("type", type),
                checkRequired(
                    "unEnrollObjectsNotMeetingCriteria",
                    unEnrollObjectsNotMeetingCriteria,
                ),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiListBasedEnrollmentCriteria = apply {
        if (validated) {
            return@apply
        }

        listFilterBranch().validate()
        reEnrollmentTriggersFilterBranches().forEach { it.validate() }
        shouldReEnroll()
        type().validate()
        unEnrollObjectsNotMeetingCriteria()
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
        (listFilterBranch.asKnown().getOrNull()?.validity() ?: 0) +
            (reEnrollmentTriggersFilterBranches.asKnown().getOrNull()?.sumOf {
                it.validity().toInt()
            } ?: 0) +
            (if (shouldReEnroll.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (unEnrollObjectsNotMeetingCriteria.asKnown().isPresent) 1 else 0)

    /** The list filter branch that represents the enrollment trigger to this flow. */
    @JsonDeserialize(using = ListFilterBranch.Deserializer::class)
    @JsonSerialize(using = ListFilterBranch.Serializer::class)
    class ListFilterBranch
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

        fun validate(): ListFilterBranch = apply {
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

            return other is ListFilterBranch &&
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
                publicOr != null -> "ListFilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "ListFilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null -> "ListFilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null -> "ListFilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null -> "ListFilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "ListFilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "ListFilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null ->
                    "ListFilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "ListFilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ListFilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) = ListFilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) =
                ListFilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                ListFilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                ListFilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                ListFilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                ListFilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) = ListFilterBranch(publicPropertyAssociation = publicPropertyAssociation)

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                ListFilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [ListFilterBranch] to a value of
         * type [T].
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
             * Maps an unknown variant of [ListFilterBranch] to a value of type [T].
             *
             * An instance of [ListFilterBranch] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown ListFilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<ListFilterBranch>(ListFilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): ListFilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                ListFilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                ListFilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                ListFilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                ListFilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let { ListFilterBranch(publicRestricted = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let { ListFilterBranch(publicUnifiedEvents = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    ListFilterBranch(publicPropertyAssociation = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let { ListFilterBranch(publicAssociation = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> ListFilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<ListFilterBranch>(ListFilterBranch::class) {

            override fun serialize(
                value: ListFilterBranch,
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
                    else -> throw IllegalStateException("Invalid ListFilterBranch")
                }
            }
        }
    }

    @JsonDeserialize(using = ReEnrollmentTriggersFilterBranch.Deserializer::class)
    @JsonSerialize(using = ReEnrollmentTriggersFilterBranch.Serializer::class)
    class ReEnrollmentTriggersFilterBranch
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

        fun validate(): ReEnrollmentTriggersFilterBranch = apply {
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

            return other is ReEnrollmentTriggersFilterBranch &&
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
                publicOr != null -> "ReEnrollmentTriggersFilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "ReEnrollmentTriggersFilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null ->
                    "ReEnrollmentTriggersFilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null ->
                    "ReEnrollmentTriggersFilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null ->
                    "ReEnrollmentTriggersFilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "ReEnrollmentTriggersFilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "ReEnrollmentTriggersFilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null ->
                    "ReEnrollmentTriggersFilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "ReEnrollmentTriggersFilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid ReEnrollmentTriggersFilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) =
                ReEnrollmentTriggersFilterBranch(
                    publicPropertyAssociation = publicPropertyAssociation
                )

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                ReEnrollmentTriggersFilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [ReEnrollmentTriggersFilterBranch]
         * to a value of type [T].
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
             * Maps an unknown variant of [ReEnrollmentTriggersFilterBranch] to a value of type [T].
             *
             * An instance of [ReEnrollmentTriggersFilterBranch] can contain an unknown variant if
             * it was deserialized from data that doesn't match any known variant. For example, if
             * the SDK is on an older version than the API, then the API may respond with new
             * variants that the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown ReEnrollmentTriggersFilterBranch: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<ReEnrollmentTriggersFilterBranch>(
                ReEnrollmentTriggersFilterBranch::class
            ) {

            override fun ObjectCodec.deserialize(node: JsonNode): ReEnrollmentTriggersFilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                ReEnrollmentTriggersFilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                ReEnrollmentTriggersFilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                ReEnrollmentTriggersFilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                ReEnrollmentTriggersFilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let {
                                    ReEnrollmentTriggersFilterBranch(
                                        publicRestricted = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let {
                                    ReEnrollmentTriggersFilterBranch(
                                        publicUnifiedEvents = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    ReEnrollmentTriggersFilterBranch(
                                        publicPropertyAssociation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let {
                                    ReEnrollmentTriggersFilterBranch(
                                        publicAssociation = it,
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
                    0 -> ReEnrollmentTriggersFilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<ReEnrollmentTriggersFilterBranch>(
                ReEnrollmentTriggersFilterBranch::class
            ) {

            override fun serialize(
                value: ReEnrollmentTriggersFilterBranch,
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
                    else -> throw IllegalStateException("Invalid ReEnrollmentTriggersFilterBranch")
                }
            }
        }
    }

    /**
     * The type of enrollment criteria this is, this can be "LIST_BASED", "EVENT_BASED", or
     * "MANUAL".
     */
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

            @JvmField val LIST_BASED = of("LIST_BASED")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            LIST_BASED
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
            LIST_BASED,
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
                LIST_BASED -> Value.LIST_BASED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LIST_BASED -> Known.LIST_BASED
                else -> throw HubSpotInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubSpotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubSpotInvalidDataException("Value is not a String") }

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
            } catch (e: HubSpotInvalidDataException) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiListBasedEnrollmentCriteria &&
            listFilterBranch == other.listFilterBranch &&
            reEnrollmentTriggersFilterBranches == other.reEnrollmentTriggersFilterBranches &&
            shouldReEnroll == other.shouldReEnroll &&
            type == other.type &&
            unEnrollObjectsNotMeetingCriteria == other.unEnrollObjectsNotMeetingCriteria &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            listFilterBranch,
            reEnrollmentTriggersFilterBranches,
            shouldReEnroll,
            type,
            unEnrollObjectsNotMeetingCriteria,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiListBasedEnrollmentCriteria{listFilterBranch=$listFilterBranch, reEnrollmentTriggersFilterBranches=$reEnrollmentTriggersFilterBranches, shouldReEnroll=$shouldReEnroll, type=$type, unEnrollObjectsNotMeetingCriteria=$unEnrollObjectsNotMeetingCriteria, additionalProperties=$additionalProperties}"
}
