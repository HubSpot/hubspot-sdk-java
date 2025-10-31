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

class ApiContactFlowPutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<List<Action>>,
    private val blockedDates: JsonField<List<ApiBlockedDate>>,
    private val canEnrollFromSalesforce: JsonField<Boolean>,
    private val customProperties: JsonField<CustomProperties>,
    private val isEnabled: JsonField<Boolean>,
    private val revisionId: JsonField<String>,
    private val suppressionListIds: JsonField<List<Int>>,
    private val timeWindows: JsonField<List<ApiTimeWindow>>,
    private val type: JsonField<Type>,
    private val description: JsonField<String>,
    private val enrollmentCriteria: JsonField<EnrollmentCriteria>,
    private val enrollmentSchedule: JsonField<EnrollmentSchedule>,
    private val eventAnchor: JsonField<EventAnchor>,
    private val goalFilterBranch: JsonField<GoalFilterBranch>,
    private val name: JsonField<String>,
    private val startActionId: JsonField<String>,
    private val unEnrollmentSetting: JsonField<ApiUnEnrollmentSetting>,
    private val uuid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("blockedDates")
        @ExcludeMissing
        blockedDates: JsonField<List<ApiBlockedDate>> = JsonMissing.of(),
        @JsonProperty("canEnrollFromSalesforce")
        @ExcludeMissing
        canEnrollFromSalesforce: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<CustomProperties> = JsonMissing.of(),
        @JsonProperty("isEnabled") @ExcludeMissing isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("revisionId")
        @ExcludeMissing
        revisionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suppressionListIds")
        @ExcludeMissing
        suppressionListIds: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("timeWindows")
        @ExcludeMissing
        timeWindows: JsonField<List<ApiTimeWindow>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("enrollmentCriteria")
        @ExcludeMissing
        enrollmentCriteria: JsonField<EnrollmentCriteria> = JsonMissing.of(),
        @JsonProperty("enrollmentSchedule")
        @ExcludeMissing
        enrollmentSchedule: JsonField<EnrollmentSchedule> = JsonMissing.of(),
        @JsonProperty("eventAnchor")
        @ExcludeMissing
        eventAnchor: JsonField<EventAnchor> = JsonMissing.of(),
        @JsonProperty("goalFilterBranch")
        @ExcludeMissing
        goalFilterBranch: JsonField<GoalFilterBranch> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startActionId")
        @ExcludeMissing
        startActionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unEnrollmentSetting")
        @ExcludeMissing
        unEnrollmentSetting: JsonField<ApiUnEnrollmentSetting> = JsonMissing.of(),
        @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
    ) : this(
        actions,
        blockedDates,
        canEnrollFromSalesforce,
        customProperties,
        isEnabled,
        revisionId,
        suppressionListIds,
        timeWindows,
        type,
        description,
        enrollmentCriteria,
        enrollmentSchedule,
        eventAnchor,
        goalFilterBranch,
        name,
        startActionId,
        unEnrollmentSetting,
        uuid,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blockedDates(): List<ApiBlockedDate> = blockedDates.getRequired("blockedDates")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canEnrollFromSalesforce(): Boolean =
        canEnrollFromSalesforce.getRequired("canEnrollFromSalesforce")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customProperties(): CustomProperties = customProperties.getRequired("customProperties")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("isEnabled")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revisionId(): String = revisionId.getRequired("revisionId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun suppressionListIds(): List<Int> = suppressionListIds.getRequired("suppressionListIds")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeWindows(): List<ApiTimeWindow> = timeWindows.getRequired("timeWindows")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enrollmentCriteria(): Optional<EnrollmentCriteria> =
        enrollmentCriteria.getOptional("enrollmentCriteria")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enrollmentSchedule(): Optional<EnrollmentSchedule> =
        enrollmentSchedule.getOptional("enrollmentSchedule")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eventAnchor(): Optional<EventAnchor> = eventAnchor.getOptional("eventAnchor")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun goalFilterBranch(): Optional<GoalFilterBranch> =
        goalFilterBranch.getOptional("goalFilterBranch")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startActionId(): Optional<String> = startActionId.getOptional("startActionId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unEnrollmentSetting(): Optional<ApiUnEnrollmentSetting> =
        unEnrollmentSetting.getOptional("unEnrollmentSetting")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uuid(): Optional<String> = uuid.getOptional("uuid")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [blockedDates].
     *
     * Unlike [blockedDates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blockedDates")
    @ExcludeMissing
    fun _blockedDates(): JsonField<List<ApiBlockedDate>> = blockedDates

    /**
     * Returns the raw JSON value of [canEnrollFromSalesforce].
     *
     * Unlike [canEnrollFromSalesforce], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("canEnrollFromSalesforce")
    @ExcludeMissing
    fun _canEnrollFromSalesforce(): JsonField<Boolean> = canEnrollFromSalesforce

    /**
     * Returns the raw JSON value of [customProperties].
     *
     * Unlike [customProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customProperties")
    @ExcludeMissing
    fun _customProperties(): JsonField<CustomProperties> = customProperties

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isEnabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    /**
     * Returns the raw JSON value of [revisionId].
     *
     * Unlike [revisionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revisionId") @ExcludeMissing fun _revisionId(): JsonField<String> = revisionId

    /**
     * Returns the raw JSON value of [suppressionListIds].
     *
     * Unlike [suppressionListIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("suppressionListIds")
    @ExcludeMissing
    fun _suppressionListIds(): JsonField<List<Int>> = suppressionListIds

    /**
     * Returns the raw JSON value of [timeWindows].
     *
     * Unlike [timeWindows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeWindows")
    @ExcludeMissing
    fun _timeWindows(): JsonField<List<ApiTimeWindow>> = timeWindows

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [enrollmentCriteria].
     *
     * Unlike [enrollmentCriteria], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enrollmentCriteria")
    @ExcludeMissing
    fun _enrollmentCriteria(): JsonField<EnrollmentCriteria> = enrollmentCriteria

    /**
     * Returns the raw JSON value of [enrollmentSchedule].
     *
     * Unlike [enrollmentSchedule], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("enrollmentSchedule")
    @ExcludeMissing
    fun _enrollmentSchedule(): JsonField<EnrollmentSchedule> = enrollmentSchedule

    /**
     * Returns the raw JSON value of [eventAnchor].
     *
     * Unlike [eventAnchor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventAnchor")
    @ExcludeMissing
    fun _eventAnchor(): JsonField<EventAnchor> = eventAnchor

    /**
     * Returns the raw JSON value of [goalFilterBranch].
     *
     * Unlike [goalFilterBranch], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("goalFilterBranch")
    @ExcludeMissing
    fun _goalFilterBranch(): JsonField<GoalFilterBranch> = goalFilterBranch

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [startActionId].
     *
     * Unlike [startActionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startActionId")
    @ExcludeMissing
    fun _startActionId(): JsonField<String> = startActionId

    /**
     * Returns the raw JSON value of [unEnrollmentSetting].
     *
     * Unlike [unEnrollmentSetting], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unEnrollmentSetting")
    @ExcludeMissing
    fun _unEnrollmentSetting(): JsonField<ApiUnEnrollmentSetting> = unEnrollmentSetting

    /**
     * Returns the raw JSON value of [uuid].
     *
     * Unlike [uuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uuid") @ExcludeMissing fun _uuid(): JsonField<String> = uuid

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
         * Returns a mutable builder for constructing an instance of [ApiContactFlowPutRequest].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .blockedDates()
         * .canEnrollFromSalesforce()
         * .customProperties()
         * .isEnabled()
         * .revisionId()
         * .suppressionListIds()
         * .timeWindows()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiContactFlowPutRequest]. */
    class Builder internal constructor() {

        private var actions: JsonField<MutableList<Action>>? = null
        private var blockedDates: JsonField<MutableList<ApiBlockedDate>>? = null
        private var canEnrollFromSalesforce: JsonField<Boolean>? = null
        private var customProperties: JsonField<CustomProperties>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var revisionId: JsonField<String>? = null
        private var suppressionListIds: JsonField<MutableList<Int>>? = null
        private var timeWindows: JsonField<MutableList<ApiTimeWindow>>? = null
        private var type: JsonField<Type>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var enrollmentCriteria: JsonField<EnrollmentCriteria> = JsonMissing.of()
        private var enrollmentSchedule: JsonField<EnrollmentSchedule> = JsonMissing.of()
        private var eventAnchor: JsonField<EventAnchor> = JsonMissing.of()
        private var goalFilterBranch: JsonField<GoalFilterBranch> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var startActionId: JsonField<String> = JsonMissing.of()
        private var unEnrollmentSetting: JsonField<ApiUnEnrollmentSetting> = JsonMissing.of()
        private var uuid: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiContactFlowPutRequest: ApiContactFlowPutRequest) = apply {
            actions = apiContactFlowPutRequest.actions.map { it.toMutableList() }
            blockedDates = apiContactFlowPutRequest.blockedDates.map { it.toMutableList() }
            canEnrollFromSalesforce = apiContactFlowPutRequest.canEnrollFromSalesforce
            customProperties = apiContactFlowPutRequest.customProperties
            isEnabled = apiContactFlowPutRequest.isEnabled
            revisionId = apiContactFlowPutRequest.revisionId
            suppressionListIds =
                apiContactFlowPutRequest.suppressionListIds.map { it.toMutableList() }
            timeWindows = apiContactFlowPutRequest.timeWindows.map { it.toMutableList() }
            type = apiContactFlowPutRequest.type
            description = apiContactFlowPutRequest.description
            enrollmentCriteria = apiContactFlowPutRequest.enrollmentCriteria
            enrollmentSchedule = apiContactFlowPutRequest.enrollmentSchedule
            eventAnchor = apiContactFlowPutRequest.eventAnchor
            goalFilterBranch = apiContactFlowPutRequest.goalFilterBranch
            name = apiContactFlowPutRequest.name
            startActionId = apiContactFlowPutRequest.startActionId
            unEnrollmentSetting = apiContactFlowPutRequest.unEnrollmentSetting
            uuid = apiContactFlowPutRequest.uuid
            additionalProperties = apiContactFlowPutRequest.additionalProperties.toMutableMap()
        }

        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        /** Alias for calling [addAction] with `Action.ofApiStaticBranch(apiStaticBranch)`. */
        fun addAction(apiStaticBranch: ApiStaticBranchAction) =
            addAction(Action.ofApiStaticBranch(apiStaticBranch))

        /** Alias for calling [addAction] with `Action.ofApiListBranch(apiListBranch)`. */
        fun addAction(apiListBranch: ApiListBranchAction) =
            addAction(Action.ofApiListBranch(apiListBranch))

        /** Alias for calling [addAction] with `Action.ofApiAbTestBranch(apiAbTestBranch)`. */
        fun addAction(apiAbTestBranch: ApiAbTestBranchAction) =
            addAction(Action.ofApiAbTestBranch(apiAbTestBranch))

        /** Alias for calling [addAction] with `Action.ofApiCustomCode(apiCustomCode)`. */
        fun addAction(apiCustomCode: ApiCustomCodeAction) =
            addAction(Action.ofApiCustomCode(apiCustomCode))

        /** Alias for calling [addAction] with `Action.ofApiWebhook(apiWebhook)`. */
        fun addAction(apiWebhook: ApiWebhookAction) = addAction(Action.ofApiWebhook(apiWebhook))

        /**
         * Alias for calling [addAction] with `Action.ofApiSingleConnection(apiSingleConnection)`.
         */
        fun addAction(apiSingleConnection: ApiSingleConnectionAction) =
            addAction(Action.ofApiSingleConnection(apiSingleConnection))

        fun blockedDates(blockedDates: List<ApiBlockedDate>) =
            blockedDates(JsonField.of(blockedDates))

        /**
         * Sets [Builder.blockedDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedDates] with a well-typed `List<ApiBlockedDate>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun blockedDates(blockedDates: JsonField<List<ApiBlockedDate>>) = apply {
            this.blockedDates = blockedDates.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiBlockedDate] to [blockedDates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedDate(blockedDate: ApiBlockedDate) = apply {
            blockedDates =
                (blockedDates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedDates", it).add(blockedDate)
                }
        }

        fun canEnrollFromSalesforce(canEnrollFromSalesforce: Boolean) =
            canEnrollFromSalesforce(JsonField.of(canEnrollFromSalesforce))

        /**
         * Sets [Builder.canEnrollFromSalesforce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canEnrollFromSalesforce] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun canEnrollFromSalesforce(canEnrollFromSalesforce: JsonField<Boolean>) = apply {
            this.canEnrollFromSalesforce = canEnrollFromSalesforce
        }

        fun customProperties(customProperties: CustomProperties) =
            customProperties(JsonField.of(customProperties))

        /**
         * Sets [Builder.customProperties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customProperties] with a well-typed [CustomProperties]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customProperties(customProperties: JsonField<CustomProperties>) = apply {
            this.customProperties = customProperties
        }

        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        fun revisionId(revisionId: String) = revisionId(JsonField.of(revisionId))

        /**
         * Sets [Builder.revisionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revisionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revisionId(revisionId: JsonField<String>) = apply { this.revisionId = revisionId }

        fun suppressionListIds(suppressionListIds: List<Int>) =
            suppressionListIds(JsonField.of(suppressionListIds))

        /**
         * Sets [Builder.suppressionListIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suppressionListIds] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suppressionListIds(suppressionListIds: JsonField<List<Int>>) = apply {
            this.suppressionListIds = suppressionListIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [suppressionListIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSuppressionListId(suppressionListId: Int) = apply {
            suppressionListIds =
                (suppressionListIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("suppressionListIds", it).add(suppressionListId)
                }
        }

        fun timeWindows(timeWindows: List<ApiTimeWindow>) = timeWindows(JsonField.of(timeWindows))

        /**
         * Sets [Builder.timeWindows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeWindows] with a well-typed `List<ApiTimeWindow>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun timeWindows(timeWindows: JsonField<List<ApiTimeWindow>>) = apply {
            this.timeWindows = timeWindows.map { it.toMutableList() }
        }

        /**
         * Adds a single [ApiTimeWindow] to [timeWindows].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTimeWindow(timeWindow: ApiTimeWindow) = apply {
            timeWindows =
                (timeWindows ?: JsonField.of(mutableListOf())).also {
                    checkKnown("timeWindows", it).add(timeWindow)
                }
        }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun enrollmentCriteria(enrollmentCriteria: EnrollmentCriteria) =
            enrollmentCriteria(JsonField.of(enrollmentCriteria))

        /**
         * Sets [Builder.enrollmentCriteria] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrollmentCriteria] with a well-typed
         * [EnrollmentCriteria] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun enrollmentCriteria(enrollmentCriteria: JsonField<EnrollmentCriteria>) = apply {
            this.enrollmentCriteria = enrollmentCriteria
        }

        /**
         * Alias for calling [enrollmentCriteria] with
         * `EnrollmentCriteria.ofApiListBased(apiListBased)`.
         */
        fun enrollmentCriteria(apiListBased: ApiListBasedEnrollmentCriteria) =
            enrollmentCriteria(EnrollmentCriteria.ofApiListBased(apiListBased))

        /**
         * Alias for calling [enrollmentCriteria] with
         * `EnrollmentCriteria.ofApiEventBased(apiEventBased)`.
         */
        fun enrollmentCriteria(apiEventBased: ApiEventBasedEnrollmentCriteria) =
            enrollmentCriteria(EnrollmentCriteria.ofApiEventBased(apiEventBased))

        /**
         * Alias for calling [enrollmentCriteria] with `EnrollmentCriteria.ofApiManual(apiManual)`.
         */
        fun enrollmentCriteria(apiManual: ApiManualEnrollmentCriteria) =
            enrollmentCriteria(EnrollmentCriteria.ofApiManual(apiManual))

        fun enrollmentSchedule(enrollmentSchedule: EnrollmentSchedule) =
            enrollmentSchedule(JsonField.of(enrollmentSchedule))

        /**
         * Sets [Builder.enrollmentSchedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enrollmentSchedule] with a well-typed
         * [EnrollmentSchedule] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun enrollmentSchedule(enrollmentSchedule: JsonField<EnrollmentSchedule>) = apply {
            this.enrollmentSchedule = enrollmentSchedule
        }

        /**
         * Alias for calling [enrollmentSchedule] with `EnrollmentSchedule.ofApiDaily(apiDaily)`.
         */
        fun enrollmentSchedule(apiDaily: ApiDailyEnrollmentSchedule) =
            enrollmentSchedule(EnrollmentSchedule.ofApiDaily(apiDaily))

        /**
         * Alias for calling [enrollmentSchedule] with `EnrollmentSchedule.ofApiWeekly(apiWeekly)`.
         */
        fun enrollmentSchedule(apiWeekly: ApiWeeklyEnrollmentSchedule) =
            enrollmentSchedule(EnrollmentSchedule.ofApiWeekly(apiWeekly))

        /**
         * Alias for calling [enrollmentSchedule] with
         * `EnrollmentSchedule.ofApiMonthlySpecificDays(apiMonthlySpecificDays)`.
         */
        fun enrollmentSchedule(apiMonthlySpecificDays: ApiMonthlySpecificDaysEnrollmentSchedule) =
            enrollmentSchedule(EnrollmentSchedule.ofApiMonthlySpecificDays(apiMonthlySpecificDays))

        /**
         * Alias for calling [enrollmentSchedule] with
         * `EnrollmentSchedule.ofApiMonthlyRelativeDays(apiMonthlyRelativeDays)`.
         */
        fun enrollmentSchedule(apiMonthlyRelativeDays: ApiMonthlyRelativeDaysEnrollmentSchedule) =
            enrollmentSchedule(EnrollmentSchedule.ofApiMonthlyRelativeDays(apiMonthlyRelativeDays))

        /**
         * Alias for calling [enrollmentSchedule] with `EnrollmentSchedule.ofApiYearly(apiYearly)`.
         */
        fun enrollmentSchedule(apiYearly: ApiYearlyEnrollmentSchedule) =
            enrollmentSchedule(EnrollmentSchedule.ofApiYearly(apiYearly))

        /**
         * Alias for calling [enrollmentSchedule] with
         * `EnrollmentSchedule.ofApiPropertyBased(apiPropertyBased)`.
         */
        fun enrollmentSchedule(apiPropertyBased: ApiPropertyBasedEnrollmentSchedule) =
            enrollmentSchedule(EnrollmentSchedule.ofApiPropertyBased(apiPropertyBased))

        fun eventAnchor(eventAnchor: EventAnchor) = eventAnchor(JsonField.of(eventAnchor))

        /**
         * Sets [Builder.eventAnchor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventAnchor] with a well-typed [EventAnchor] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventAnchor(eventAnchor: JsonField<EventAnchor>) = apply {
            this.eventAnchor = eventAnchor
        }

        /**
         * Alias for calling [eventAnchor] with
         * `EventAnchor.ofApiContactProperty(apiContactProperty)`.
         */
        fun eventAnchor(apiContactProperty: ApiContactPropertyAnchor) =
            eventAnchor(EventAnchor.ofApiContactProperty(apiContactProperty))

        /** Alias for calling [eventAnchor] with `EventAnchor.ofApiStaticDate(apiStaticDate)`. */
        fun eventAnchor(apiStaticDate: ApiStaticDateAnchor) =
            eventAnchor(EventAnchor.ofApiStaticDate(apiStaticDate))

        fun goalFilterBranch(goalFilterBranch: GoalFilterBranch) =
            goalFilterBranch(JsonField.of(goalFilterBranch))

        /**
         * Sets [Builder.goalFilterBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goalFilterBranch] with a well-typed [GoalFilterBranch]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun goalFilterBranch(goalFilterBranch: JsonField<GoalFilterBranch>) = apply {
            this.goalFilterBranch = goalFilterBranch
        }

        /** Alias for calling [goalFilterBranch] with `GoalFilterBranch.ofPublicOr(publicOr)`. */
        fun goalFilterBranch(publicOr: PublicOrFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicOr(publicOr))

        /** Alias for calling [goalFilterBranch] with `GoalFilterBranch.ofPublicAnd(publicAnd)`. */
        fun goalFilterBranch(publicAnd: PublicAndFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicAnd(publicAnd))

        /**
         * Alias for calling [goalFilterBranch] with
         * `GoalFilterBranch.ofPublicNotAll(publicNotAll)`.
         */
        fun goalFilterBranch(publicNotAll: PublicNotAllFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicNotAll(publicNotAll))

        /**
         * Alias for calling [goalFilterBranch] with
         * `GoalFilterBranch.ofPublicNotAny(publicNotAny)`.
         */
        fun goalFilterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicNotAny(publicNotAny))

        /**
         * Alias for calling [goalFilterBranch] with
         * `GoalFilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun goalFilterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicRestricted(publicRestricted))

        /**
         * Alias for calling [goalFilterBranch] with
         * `GoalFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun goalFilterBranch(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents))

        /**
         * Alias for calling [goalFilterBranch] with
         * `GoalFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun goalFilterBranch(publicPropertyAssociation: PublicPropertyAssociationFilterBranch) =
            goalFilterBranch(
                GoalFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)
            )

        /**
         * Alias for calling [goalFilterBranch] with
         * `GoalFilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun goalFilterBranch(publicAssociation: PublicAssociationFilterBranch) =
            goalFilterBranch(GoalFilterBranch.ofPublicAssociation(publicAssociation))

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun startActionId(startActionId: String) = startActionId(JsonField.of(startActionId))

        /**
         * Sets [Builder.startActionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startActionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startActionId(startActionId: JsonField<String>) = apply {
            this.startActionId = startActionId
        }

        fun unEnrollmentSetting(unEnrollmentSetting: ApiUnEnrollmentSetting) =
            unEnrollmentSetting(JsonField.of(unEnrollmentSetting))

        /**
         * Sets [Builder.unEnrollmentSetting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unEnrollmentSetting] with a well-typed
         * [ApiUnEnrollmentSetting] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun unEnrollmentSetting(unEnrollmentSetting: JsonField<ApiUnEnrollmentSetting>) = apply {
            this.unEnrollmentSetting = unEnrollmentSetting
        }

        fun uuid(uuid: String) = uuid(JsonField.of(uuid))

        /**
         * Sets [Builder.uuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

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
         * Returns an immutable instance of [ApiContactFlowPutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .blockedDates()
         * .canEnrollFromSalesforce()
         * .customProperties()
         * .isEnabled()
         * .revisionId()
         * .suppressionListIds()
         * .timeWindows()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiContactFlowPutRequest =
            ApiContactFlowPutRequest(
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("blockedDates", blockedDates).map { it.toImmutable() },
                checkRequired("canEnrollFromSalesforce", canEnrollFromSalesforce),
                checkRequired("customProperties", customProperties),
                checkRequired("isEnabled", isEnabled),
                checkRequired("revisionId", revisionId),
                checkRequired("suppressionListIds", suppressionListIds).map { it.toImmutable() },
                checkRequired("timeWindows", timeWindows).map { it.toImmutable() },
                checkRequired("type", type),
                description,
                enrollmentCriteria,
                enrollmentSchedule,
                eventAnchor,
                goalFilterBranch,
                name,
                startActionId,
                unEnrollmentSetting,
                uuid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiContactFlowPutRequest = apply {
        if (validated) {
            return@apply
        }

        actions().forEach { it.validate() }
        blockedDates().forEach { it.validate() }
        canEnrollFromSalesforce()
        customProperties().validate()
        isEnabled()
        revisionId()
        suppressionListIds()
        timeWindows().forEach { it.validate() }
        type().validate()
        description()
        enrollmentCriteria().ifPresent { it.validate() }
        enrollmentSchedule().ifPresent { it.validate() }
        eventAnchor().ifPresent { it.validate() }
        goalFilterBranch().ifPresent { it.validate() }
        name()
        startActionId()
        unEnrollmentSetting().ifPresent { it.validate() }
        uuid()
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
        (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (blockedDates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (canEnrollFromSalesforce.asKnown().isPresent) 1 else 0) +
            (customProperties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isEnabled.asKnown().isPresent) 1 else 0) +
            (if (revisionId.asKnown().isPresent) 1 else 0) +
            (suppressionListIds.asKnown().getOrNull()?.size ?: 0) +
            (timeWindows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (enrollmentCriteria.asKnown().getOrNull()?.validity() ?: 0) +
            (enrollmentSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (eventAnchor.asKnown().getOrNull()?.validity() ?: 0) +
            (goalFilterBranch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (startActionId.asKnown().isPresent) 1 else 0) +
            (unEnrollmentSetting.asKnown().getOrNull()?.validity() ?: 0) +
            (if (uuid.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Action.Deserializer::class)
    @JsonSerialize(using = Action.Serializer::class)
    class Action
    private constructor(
        private val apiStaticBranch: ApiStaticBranchAction? = null,
        private val apiListBranch: ApiListBranchAction? = null,
        private val apiAbTestBranch: ApiAbTestBranchAction? = null,
        private val apiCustomCode: ApiCustomCodeAction? = null,
        private val apiWebhook: ApiWebhookAction? = null,
        private val apiSingleConnection: ApiSingleConnectionAction? = null,
        private val _json: JsonValue? = null,
    ) {

        fun apiStaticBranch(): Optional<ApiStaticBranchAction> =
            Optional.ofNullable(apiStaticBranch)

        fun apiListBranch(): Optional<ApiListBranchAction> = Optional.ofNullable(apiListBranch)

        fun apiAbTestBranch(): Optional<ApiAbTestBranchAction> =
            Optional.ofNullable(apiAbTestBranch)

        fun apiCustomCode(): Optional<ApiCustomCodeAction> = Optional.ofNullable(apiCustomCode)

        fun apiWebhook(): Optional<ApiWebhookAction> = Optional.ofNullable(apiWebhook)

        fun apiSingleConnection(): Optional<ApiSingleConnectionAction> =
            Optional.ofNullable(apiSingleConnection)

        fun isApiStaticBranch(): Boolean = apiStaticBranch != null

        fun isApiListBranch(): Boolean = apiListBranch != null

        fun isApiAbTestBranch(): Boolean = apiAbTestBranch != null

        fun isApiCustomCode(): Boolean = apiCustomCode != null

        fun isApiWebhook(): Boolean = apiWebhook != null

        fun isApiSingleConnection(): Boolean = apiSingleConnection != null

        fun asApiStaticBranch(): ApiStaticBranchAction =
            apiStaticBranch.getOrThrow("apiStaticBranch")

        fun asApiListBranch(): ApiListBranchAction = apiListBranch.getOrThrow("apiListBranch")

        fun asApiAbTestBranch(): ApiAbTestBranchAction =
            apiAbTestBranch.getOrThrow("apiAbTestBranch")

        fun asApiCustomCode(): ApiCustomCodeAction = apiCustomCode.getOrThrow("apiCustomCode")

        fun asApiWebhook(): ApiWebhookAction = apiWebhook.getOrThrow("apiWebhook")

        fun asApiSingleConnection(): ApiSingleConnectionAction =
            apiSingleConnection.getOrThrow("apiSingleConnection")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiStaticBranch != null -> visitor.visitApiStaticBranch(apiStaticBranch)
                apiListBranch != null -> visitor.visitApiListBranch(apiListBranch)
                apiAbTestBranch != null -> visitor.visitApiAbTestBranch(apiAbTestBranch)
                apiCustomCode != null -> visitor.visitApiCustomCode(apiCustomCode)
                apiWebhook != null -> visitor.visitApiWebhook(apiWebhook)
                apiSingleConnection != null -> visitor.visitApiSingleConnection(apiSingleConnection)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiStaticBranch(apiStaticBranch: ApiStaticBranchAction) {
                        apiStaticBranch.validate()
                    }

                    override fun visitApiListBranch(apiListBranch: ApiListBranchAction) {
                        apiListBranch.validate()
                    }

                    override fun visitApiAbTestBranch(apiAbTestBranch: ApiAbTestBranchAction) {
                        apiAbTestBranch.validate()
                    }

                    override fun visitApiCustomCode(apiCustomCode: ApiCustomCodeAction) {
                        apiCustomCode.validate()
                    }

                    override fun visitApiWebhook(apiWebhook: ApiWebhookAction) {
                        apiWebhook.validate()
                    }

                    override fun visitApiSingleConnection(
                        apiSingleConnection: ApiSingleConnectionAction
                    ) {
                        apiSingleConnection.validate()
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
                    override fun visitApiStaticBranch(apiStaticBranch: ApiStaticBranchAction) =
                        apiStaticBranch.validity()

                    override fun visitApiListBranch(apiListBranch: ApiListBranchAction) =
                        apiListBranch.validity()

                    override fun visitApiAbTestBranch(apiAbTestBranch: ApiAbTestBranchAction) =
                        apiAbTestBranch.validity()

                    override fun visitApiCustomCode(apiCustomCode: ApiCustomCodeAction) =
                        apiCustomCode.validity()

                    override fun visitApiWebhook(apiWebhook: ApiWebhookAction) =
                        apiWebhook.validity()

                    override fun visitApiSingleConnection(
                        apiSingleConnection: ApiSingleConnectionAction
                    ) = apiSingleConnection.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                apiStaticBranch == other.apiStaticBranch &&
                apiListBranch == other.apiListBranch &&
                apiAbTestBranch == other.apiAbTestBranch &&
                apiCustomCode == other.apiCustomCode &&
                apiWebhook == other.apiWebhook &&
                apiSingleConnection == other.apiSingleConnection
        }

        override fun hashCode(): Int =
            Objects.hash(
                apiStaticBranch,
                apiListBranch,
                apiAbTestBranch,
                apiCustomCode,
                apiWebhook,
                apiSingleConnection,
            )

        override fun toString(): String =
            when {
                apiStaticBranch != null -> "Action{apiStaticBranch=$apiStaticBranch}"
                apiListBranch != null -> "Action{apiListBranch=$apiListBranch}"
                apiAbTestBranch != null -> "Action{apiAbTestBranch=$apiAbTestBranch}"
                apiCustomCode != null -> "Action{apiCustomCode=$apiCustomCode}"
                apiWebhook != null -> "Action{apiWebhook=$apiWebhook}"
                apiSingleConnection != null -> "Action{apiSingleConnection=$apiSingleConnection}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic
            fun ofApiStaticBranch(apiStaticBranch: ApiStaticBranchAction) =
                Action(apiStaticBranch = apiStaticBranch)

            @JvmStatic
            fun ofApiListBranch(apiListBranch: ApiListBranchAction) =
                Action(apiListBranch = apiListBranch)

            @JvmStatic
            fun ofApiAbTestBranch(apiAbTestBranch: ApiAbTestBranchAction) =
                Action(apiAbTestBranch = apiAbTestBranch)

            @JvmStatic
            fun ofApiCustomCode(apiCustomCode: ApiCustomCodeAction) =
                Action(apiCustomCode = apiCustomCode)

            @JvmStatic
            fun ofApiWebhook(apiWebhook: ApiWebhookAction) = Action(apiWebhook = apiWebhook)

            @JvmStatic
            fun ofApiSingleConnection(apiSingleConnection: ApiSingleConnectionAction) =
                Action(apiSingleConnection = apiSingleConnection)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitApiStaticBranch(apiStaticBranch: ApiStaticBranchAction): T

            fun visitApiListBranch(apiListBranch: ApiListBranchAction): T

            fun visitApiAbTestBranch(apiAbTestBranch: ApiAbTestBranchAction): T

            fun visitApiCustomCode(apiCustomCode: ApiCustomCodeAction): T

            fun visitApiWebhook(apiWebhook: ApiWebhookAction): T

            fun visitApiSingleConnection(apiSingleConnection: ApiSingleConnectionAction): T

            /**
             * Maps an unknown variant of [Action] to a value of type [T].
             *
             * An instance of [Action] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Action: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Action>(Action::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Action {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiStaticBranchAction>())?.let {
                                Action(apiStaticBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiListBranchAction>())?.let {
                                Action(apiListBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiAbTestBranchAction>())?.let {
                                Action(apiAbTestBranch = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiCustomCodeAction>())?.let {
                                Action(apiCustomCode = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiWebhookAction>())?.let {
                                Action(apiWebhook = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiSingleConnectionAction>())?.let {
                                Action(apiSingleConnection = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Action(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Action>(Action::class) {

            override fun serialize(
                value: Action,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiStaticBranch != null -> generator.writeObject(value.apiStaticBranch)
                    value.apiListBranch != null -> generator.writeObject(value.apiListBranch)
                    value.apiAbTestBranch != null -> generator.writeObject(value.apiAbTestBranch)
                    value.apiCustomCode != null -> generator.writeObject(value.apiCustomCode)
                    value.apiWebhook != null -> generator.writeObject(value.apiWebhook)
                    value.apiSingleConnection != null ->
                        generator.writeObject(value.apiSingleConnection)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Action")
                }
            }
        }
    }

    class CustomProperties
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomProperties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomProperties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customProperties: CustomProperties) = apply {
                additionalProperties = customProperties.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [CustomProperties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomProperties = CustomProperties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomProperties = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomProperties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomProperties{additionalProperties=$additionalProperties}"
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

            @JvmField val CONTACT_FLOW = of("CONTACT_FLOW")

            @JvmField val PLATFORM_FLOW = of("PLATFORM_FLOW")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CONTACT_FLOW,
            PLATFORM_FLOW,
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
            CONTACT_FLOW,
            PLATFORM_FLOW,
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
                CONTACT_FLOW -> Value.CONTACT_FLOW
                PLATFORM_FLOW -> Value.PLATFORM_FLOW
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
                CONTACT_FLOW -> Known.CONTACT_FLOW
                PLATFORM_FLOW -> Known.PLATFORM_FLOW
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

    @JsonDeserialize(using = EnrollmentCriteria.Deserializer::class)
    @JsonSerialize(using = EnrollmentCriteria.Serializer::class)
    class EnrollmentCriteria
    private constructor(
        private val apiListBased: ApiListBasedEnrollmentCriteria? = null,
        private val apiEventBased: ApiEventBasedEnrollmentCriteria? = null,
        private val apiManual: ApiManualEnrollmentCriteria? = null,
        private val _json: JsonValue? = null,
    ) {

        fun apiListBased(): Optional<ApiListBasedEnrollmentCriteria> =
            Optional.ofNullable(apiListBased)

        fun apiEventBased(): Optional<ApiEventBasedEnrollmentCriteria> =
            Optional.ofNullable(apiEventBased)

        fun apiManual(): Optional<ApiManualEnrollmentCriteria> = Optional.ofNullable(apiManual)

        fun isApiListBased(): Boolean = apiListBased != null

        fun isApiEventBased(): Boolean = apiEventBased != null

        fun isApiManual(): Boolean = apiManual != null

        fun asApiListBased(): ApiListBasedEnrollmentCriteria =
            apiListBased.getOrThrow("apiListBased")

        fun asApiEventBased(): ApiEventBasedEnrollmentCriteria =
            apiEventBased.getOrThrow("apiEventBased")

        fun asApiManual(): ApiManualEnrollmentCriteria = apiManual.getOrThrow("apiManual")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiListBased != null -> visitor.visitApiListBased(apiListBased)
                apiEventBased != null -> visitor.visitApiEventBased(apiEventBased)
                apiManual != null -> visitor.visitApiManual(apiManual)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): EnrollmentCriteria = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiListBased(apiListBased: ApiListBasedEnrollmentCriteria) {
                        apiListBased.validate()
                    }

                    override fun visitApiEventBased(
                        apiEventBased: ApiEventBasedEnrollmentCriteria
                    ) {
                        apiEventBased.validate()
                    }

                    override fun visitApiManual(apiManual: ApiManualEnrollmentCriteria) {
                        apiManual.validate()
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
                    override fun visitApiListBased(apiListBased: ApiListBasedEnrollmentCriteria) =
                        apiListBased.validity()

                    override fun visitApiEventBased(
                        apiEventBased: ApiEventBasedEnrollmentCriteria
                    ) = apiEventBased.validity()

                    override fun visitApiManual(apiManual: ApiManualEnrollmentCriteria) =
                        apiManual.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnrollmentCriteria &&
                apiListBased == other.apiListBased &&
                apiEventBased == other.apiEventBased &&
                apiManual == other.apiManual
        }

        override fun hashCode(): Int = Objects.hash(apiListBased, apiEventBased, apiManual)

        override fun toString(): String =
            when {
                apiListBased != null -> "EnrollmentCriteria{apiListBased=$apiListBased}"
                apiEventBased != null -> "EnrollmentCriteria{apiEventBased=$apiEventBased}"
                apiManual != null -> "EnrollmentCriteria{apiManual=$apiManual}"
                _json != null -> "EnrollmentCriteria{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid EnrollmentCriteria")
            }

        companion object {

            @JvmStatic
            fun ofApiListBased(apiListBased: ApiListBasedEnrollmentCriteria) =
                EnrollmentCriteria(apiListBased = apiListBased)

            @JvmStatic
            fun ofApiEventBased(apiEventBased: ApiEventBasedEnrollmentCriteria) =
                EnrollmentCriteria(apiEventBased = apiEventBased)

            @JvmStatic
            fun ofApiManual(apiManual: ApiManualEnrollmentCriteria) =
                EnrollmentCriteria(apiManual = apiManual)
        }

        /**
         * An interface that defines how to map each variant of [EnrollmentCriteria] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitApiListBased(apiListBased: ApiListBasedEnrollmentCriteria): T

            fun visitApiEventBased(apiEventBased: ApiEventBasedEnrollmentCriteria): T

            fun visitApiManual(apiManual: ApiManualEnrollmentCriteria): T

            /**
             * Maps an unknown variant of [EnrollmentCriteria] to a value of type [T].
             *
             * An instance of [EnrollmentCriteria] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown EnrollmentCriteria: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<EnrollmentCriteria>(EnrollmentCriteria::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): EnrollmentCriteria {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiListBasedEnrollmentCriteria>())
                                ?.let { EnrollmentCriteria(apiListBased = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiEventBasedEnrollmentCriteria>())
                                ?.let { EnrollmentCriteria(apiEventBased = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiManualEnrollmentCriteria>())
                                ?.let { EnrollmentCriteria(apiManual = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> EnrollmentCriteria(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<EnrollmentCriteria>(EnrollmentCriteria::class) {

            override fun serialize(
                value: EnrollmentCriteria,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiListBased != null -> generator.writeObject(value.apiListBased)
                    value.apiEventBased != null -> generator.writeObject(value.apiEventBased)
                    value.apiManual != null -> generator.writeObject(value.apiManual)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EnrollmentCriteria")
                }
            }
        }
    }

    @JsonDeserialize(using = EnrollmentSchedule.Deserializer::class)
    @JsonSerialize(using = EnrollmentSchedule.Serializer::class)
    class EnrollmentSchedule
    private constructor(
        private val apiDaily: ApiDailyEnrollmentSchedule? = null,
        private val apiWeekly: ApiWeeklyEnrollmentSchedule? = null,
        private val apiMonthlySpecificDays: ApiMonthlySpecificDaysEnrollmentSchedule? = null,
        private val apiMonthlyRelativeDays: ApiMonthlyRelativeDaysEnrollmentSchedule? = null,
        private val apiYearly: ApiYearlyEnrollmentSchedule? = null,
        private val apiPropertyBased: ApiPropertyBasedEnrollmentSchedule? = null,
        private val _json: JsonValue? = null,
    ) {

        fun apiDaily(): Optional<ApiDailyEnrollmentSchedule> = Optional.ofNullable(apiDaily)

        fun apiWeekly(): Optional<ApiWeeklyEnrollmentSchedule> = Optional.ofNullable(apiWeekly)

        fun apiMonthlySpecificDays(): Optional<ApiMonthlySpecificDaysEnrollmentSchedule> =
            Optional.ofNullable(apiMonthlySpecificDays)

        fun apiMonthlyRelativeDays(): Optional<ApiMonthlyRelativeDaysEnrollmentSchedule> =
            Optional.ofNullable(apiMonthlyRelativeDays)

        fun apiYearly(): Optional<ApiYearlyEnrollmentSchedule> = Optional.ofNullable(apiYearly)

        fun apiPropertyBased(): Optional<ApiPropertyBasedEnrollmentSchedule> =
            Optional.ofNullable(apiPropertyBased)

        fun isApiDaily(): Boolean = apiDaily != null

        fun isApiWeekly(): Boolean = apiWeekly != null

        fun isApiMonthlySpecificDays(): Boolean = apiMonthlySpecificDays != null

        fun isApiMonthlyRelativeDays(): Boolean = apiMonthlyRelativeDays != null

        fun isApiYearly(): Boolean = apiYearly != null

        fun isApiPropertyBased(): Boolean = apiPropertyBased != null

        fun asApiDaily(): ApiDailyEnrollmentSchedule = apiDaily.getOrThrow("apiDaily")

        fun asApiWeekly(): ApiWeeklyEnrollmentSchedule = apiWeekly.getOrThrow("apiWeekly")

        fun asApiMonthlySpecificDays(): ApiMonthlySpecificDaysEnrollmentSchedule =
            apiMonthlySpecificDays.getOrThrow("apiMonthlySpecificDays")

        fun asApiMonthlyRelativeDays(): ApiMonthlyRelativeDaysEnrollmentSchedule =
            apiMonthlyRelativeDays.getOrThrow("apiMonthlyRelativeDays")

        fun asApiYearly(): ApiYearlyEnrollmentSchedule = apiYearly.getOrThrow("apiYearly")

        fun asApiPropertyBased(): ApiPropertyBasedEnrollmentSchedule =
            apiPropertyBased.getOrThrow("apiPropertyBased")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiDaily != null -> visitor.visitApiDaily(apiDaily)
                apiWeekly != null -> visitor.visitApiWeekly(apiWeekly)
                apiMonthlySpecificDays != null ->
                    visitor.visitApiMonthlySpecificDays(apiMonthlySpecificDays)
                apiMonthlyRelativeDays != null ->
                    visitor.visitApiMonthlyRelativeDays(apiMonthlyRelativeDays)
                apiYearly != null -> visitor.visitApiYearly(apiYearly)
                apiPropertyBased != null -> visitor.visitApiPropertyBased(apiPropertyBased)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): EnrollmentSchedule = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiDaily(apiDaily: ApiDailyEnrollmentSchedule) {
                        apiDaily.validate()
                    }

                    override fun visitApiWeekly(apiWeekly: ApiWeeklyEnrollmentSchedule) {
                        apiWeekly.validate()
                    }

                    override fun visitApiMonthlySpecificDays(
                        apiMonthlySpecificDays: ApiMonthlySpecificDaysEnrollmentSchedule
                    ) {
                        apiMonthlySpecificDays.validate()
                    }

                    override fun visitApiMonthlyRelativeDays(
                        apiMonthlyRelativeDays: ApiMonthlyRelativeDaysEnrollmentSchedule
                    ) {
                        apiMonthlyRelativeDays.validate()
                    }

                    override fun visitApiYearly(apiYearly: ApiYearlyEnrollmentSchedule) {
                        apiYearly.validate()
                    }

                    override fun visitApiPropertyBased(
                        apiPropertyBased: ApiPropertyBasedEnrollmentSchedule
                    ) {
                        apiPropertyBased.validate()
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
                    override fun visitApiDaily(apiDaily: ApiDailyEnrollmentSchedule) =
                        apiDaily.validity()

                    override fun visitApiWeekly(apiWeekly: ApiWeeklyEnrollmentSchedule) =
                        apiWeekly.validity()

                    override fun visitApiMonthlySpecificDays(
                        apiMonthlySpecificDays: ApiMonthlySpecificDaysEnrollmentSchedule
                    ) = apiMonthlySpecificDays.validity()

                    override fun visitApiMonthlyRelativeDays(
                        apiMonthlyRelativeDays: ApiMonthlyRelativeDaysEnrollmentSchedule
                    ) = apiMonthlyRelativeDays.validity()

                    override fun visitApiYearly(apiYearly: ApiYearlyEnrollmentSchedule) =
                        apiYearly.validity()

                    override fun visitApiPropertyBased(
                        apiPropertyBased: ApiPropertyBasedEnrollmentSchedule
                    ) = apiPropertyBased.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EnrollmentSchedule &&
                apiDaily == other.apiDaily &&
                apiWeekly == other.apiWeekly &&
                apiMonthlySpecificDays == other.apiMonthlySpecificDays &&
                apiMonthlyRelativeDays == other.apiMonthlyRelativeDays &&
                apiYearly == other.apiYearly &&
                apiPropertyBased == other.apiPropertyBased
        }

        override fun hashCode(): Int =
            Objects.hash(
                apiDaily,
                apiWeekly,
                apiMonthlySpecificDays,
                apiMonthlyRelativeDays,
                apiYearly,
                apiPropertyBased,
            )

        override fun toString(): String =
            when {
                apiDaily != null -> "EnrollmentSchedule{apiDaily=$apiDaily}"
                apiWeekly != null -> "EnrollmentSchedule{apiWeekly=$apiWeekly}"
                apiMonthlySpecificDays != null ->
                    "EnrollmentSchedule{apiMonthlySpecificDays=$apiMonthlySpecificDays}"
                apiMonthlyRelativeDays != null ->
                    "EnrollmentSchedule{apiMonthlyRelativeDays=$apiMonthlyRelativeDays}"
                apiYearly != null -> "EnrollmentSchedule{apiYearly=$apiYearly}"
                apiPropertyBased != null -> "EnrollmentSchedule{apiPropertyBased=$apiPropertyBased}"
                _json != null -> "EnrollmentSchedule{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid EnrollmentSchedule")
            }

        companion object {

            @JvmStatic
            fun ofApiDaily(apiDaily: ApiDailyEnrollmentSchedule) =
                EnrollmentSchedule(apiDaily = apiDaily)

            @JvmStatic
            fun ofApiWeekly(apiWeekly: ApiWeeklyEnrollmentSchedule) =
                EnrollmentSchedule(apiWeekly = apiWeekly)

            @JvmStatic
            fun ofApiMonthlySpecificDays(
                apiMonthlySpecificDays: ApiMonthlySpecificDaysEnrollmentSchedule
            ) = EnrollmentSchedule(apiMonthlySpecificDays = apiMonthlySpecificDays)

            @JvmStatic
            fun ofApiMonthlyRelativeDays(
                apiMonthlyRelativeDays: ApiMonthlyRelativeDaysEnrollmentSchedule
            ) = EnrollmentSchedule(apiMonthlyRelativeDays = apiMonthlyRelativeDays)

            @JvmStatic
            fun ofApiYearly(apiYearly: ApiYearlyEnrollmentSchedule) =
                EnrollmentSchedule(apiYearly = apiYearly)

            @JvmStatic
            fun ofApiPropertyBased(apiPropertyBased: ApiPropertyBasedEnrollmentSchedule) =
                EnrollmentSchedule(apiPropertyBased = apiPropertyBased)
        }

        /**
         * An interface that defines how to map each variant of [EnrollmentSchedule] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitApiDaily(apiDaily: ApiDailyEnrollmentSchedule): T

            fun visitApiWeekly(apiWeekly: ApiWeeklyEnrollmentSchedule): T

            fun visitApiMonthlySpecificDays(
                apiMonthlySpecificDays: ApiMonthlySpecificDaysEnrollmentSchedule
            ): T

            fun visitApiMonthlyRelativeDays(
                apiMonthlyRelativeDays: ApiMonthlyRelativeDaysEnrollmentSchedule
            ): T

            fun visitApiYearly(apiYearly: ApiYearlyEnrollmentSchedule): T

            fun visitApiPropertyBased(apiPropertyBased: ApiPropertyBasedEnrollmentSchedule): T

            /**
             * Maps an unknown variant of [EnrollmentSchedule] to a value of type [T].
             *
             * An instance of [EnrollmentSchedule] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown EnrollmentSchedule: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<EnrollmentSchedule>(EnrollmentSchedule::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): EnrollmentSchedule {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiDailyEnrollmentSchedule>())
                                ?.let { EnrollmentSchedule(apiDaily = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<ApiWeeklyEnrollmentSchedule>())
                                ?.let { EnrollmentSchedule(apiWeekly = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiMonthlySpecificDaysEnrollmentSchedule>(),
                                )
                                ?.let {
                                    EnrollmentSchedule(apiMonthlySpecificDays = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiMonthlyRelativeDaysEnrollmentSchedule>(),
                                )
                                ?.let {
                                    EnrollmentSchedule(apiMonthlyRelativeDays = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<ApiYearlyEnrollmentSchedule>())
                                ?.let { EnrollmentSchedule(apiYearly = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiPropertyBasedEnrollmentSchedule>(),
                                )
                                ?.let { EnrollmentSchedule(apiPropertyBased = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> EnrollmentSchedule(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<EnrollmentSchedule>(EnrollmentSchedule::class) {

            override fun serialize(
                value: EnrollmentSchedule,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiDaily != null -> generator.writeObject(value.apiDaily)
                    value.apiWeekly != null -> generator.writeObject(value.apiWeekly)
                    value.apiMonthlySpecificDays != null ->
                        generator.writeObject(value.apiMonthlySpecificDays)
                    value.apiMonthlyRelativeDays != null ->
                        generator.writeObject(value.apiMonthlyRelativeDays)
                    value.apiYearly != null -> generator.writeObject(value.apiYearly)
                    value.apiPropertyBased != null -> generator.writeObject(value.apiPropertyBased)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EnrollmentSchedule")
                }
            }
        }
    }

    @JsonDeserialize(using = EventAnchor.Deserializer::class)
    @JsonSerialize(using = EventAnchor.Serializer::class)
    class EventAnchor
    private constructor(
        private val apiContactProperty: ApiContactPropertyAnchor? = null,
        private val apiStaticDate: ApiStaticDateAnchor? = null,
        private val _json: JsonValue? = null,
    ) {

        fun apiContactProperty(): Optional<ApiContactPropertyAnchor> =
            Optional.ofNullable(apiContactProperty)

        fun apiStaticDate(): Optional<ApiStaticDateAnchor> = Optional.ofNullable(apiStaticDate)

        fun isApiContactProperty(): Boolean = apiContactProperty != null

        fun isApiStaticDate(): Boolean = apiStaticDate != null

        fun asApiContactProperty(): ApiContactPropertyAnchor =
            apiContactProperty.getOrThrow("apiContactProperty")

        fun asApiStaticDate(): ApiStaticDateAnchor = apiStaticDate.getOrThrow("apiStaticDate")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiContactProperty != null -> visitor.visitApiContactProperty(apiContactProperty)
                apiStaticDate != null -> visitor.visitApiStaticDate(apiStaticDate)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): EventAnchor = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiContactProperty(
                        apiContactProperty: ApiContactPropertyAnchor
                    ) {
                        apiContactProperty.validate()
                    }

                    override fun visitApiStaticDate(apiStaticDate: ApiStaticDateAnchor) {
                        apiStaticDate.validate()
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
                    override fun visitApiContactProperty(
                        apiContactProperty: ApiContactPropertyAnchor
                    ) = apiContactProperty.validity()

                    override fun visitApiStaticDate(apiStaticDate: ApiStaticDateAnchor) =
                        apiStaticDate.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EventAnchor &&
                apiContactProperty == other.apiContactProperty &&
                apiStaticDate == other.apiStaticDate
        }

        override fun hashCode(): Int = Objects.hash(apiContactProperty, apiStaticDate)

        override fun toString(): String =
            when {
                apiContactProperty != null -> "EventAnchor{apiContactProperty=$apiContactProperty}"
                apiStaticDate != null -> "EventAnchor{apiStaticDate=$apiStaticDate}"
                _json != null -> "EventAnchor{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid EventAnchor")
            }

        companion object {

            @JvmStatic
            fun ofApiContactProperty(apiContactProperty: ApiContactPropertyAnchor) =
                EventAnchor(apiContactProperty = apiContactProperty)

            @JvmStatic
            fun ofApiStaticDate(apiStaticDate: ApiStaticDateAnchor) =
                EventAnchor(apiStaticDate = apiStaticDate)
        }

        /**
         * An interface that defines how to map each variant of [EventAnchor] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitApiContactProperty(apiContactProperty: ApiContactPropertyAnchor): T

            fun visitApiStaticDate(apiStaticDate: ApiStaticDateAnchor): T

            /**
             * Maps an unknown variant of [EventAnchor] to a value of type [T].
             *
             * An instance of [EventAnchor] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown EventAnchor: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<EventAnchor>(EventAnchor::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): EventAnchor {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiContactPropertyAnchor>())?.let {
                                EventAnchor(apiContactProperty = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiStaticDateAnchor>())?.let {
                                EventAnchor(apiStaticDate = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> EventAnchor(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<EventAnchor>(EventAnchor::class) {

            override fun serialize(
                value: EventAnchor,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiContactProperty != null ->
                        generator.writeObject(value.apiContactProperty)
                    value.apiStaticDate != null -> generator.writeObject(value.apiStaticDate)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EventAnchor")
                }
            }
        }
    }

    @JsonDeserialize(using = GoalFilterBranch.Deserializer::class)
    @JsonSerialize(using = GoalFilterBranch.Serializer::class)
    class GoalFilterBranch
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

        fun validate(): GoalFilterBranch = apply {
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

            return other is GoalFilterBranch &&
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
                publicOr != null -> "GoalFilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "GoalFilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null -> "GoalFilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null -> "GoalFilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null -> "GoalFilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "GoalFilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "GoalFilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null ->
                    "GoalFilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "GoalFilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid GoalFilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) = GoalFilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) =
                GoalFilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                GoalFilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                GoalFilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                GoalFilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                GoalFilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) = GoalFilterBranch(publicPropertyAssociation = publicPropertyAssociation)

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                GoalFilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [GoalFilterBranch] to a value of
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
             * Maps an unknown variant of [GoalFilterBranch] to a value of type [T].
             *
             * An instance of [GoalFilterBranch] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown GoalFilterBranch: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<GoalFilterBranch>(GoalFilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): GoalFilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                GoalFilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                GoalFilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                GoalFilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                GoalFilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let { GoalFilterBranch(publicRestricted = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let { GoalFilterBranch(publicUnifiedEvents = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    GoalFilterBranch(publicPropertyAssociation = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let { GoalFilterBranch(publicAssociation = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> GoalFilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<GoalFilterBranch>(GoalFilterBranch::class) {

            override fun serialize(
                value: GoalFilterBranch,
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
                    else -> throw IllegalStateException("Invalid GoalFilterBranch")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiContactFlowPutRequest &&
            actions == other.actions &&
            blockedDates == other.blockedDates &&
            canEnrollFromSalesforce == other.canEnrollFromSalesforce &&
            customProperties == other.customProperties &&
            isEnabled == other.isEnabled &&
            revisionId == other.revisionId &&
            suppressionListIds == other.suppressionListIds &&
            timeWindows == other.timeWindows &&
            type == other.type &&
            description == other.description &&
            enrollmentCriteria == other.enrollmentCriteria &&
            enrollmentSchedule == other.enrollmentSchedule &&
            eventAnchor == other.eventAnchor &&
            goalFilterBranch == other.goalFilterBranch &&
            name == other.name &&
            startActionId == other.startActionId &&
            unEnrollmentSetting == other.unEnrollmentSetting &&
            uuid == other.uuid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actions,
            blockedDates,
            canEnrollFromSalesforce,
            customProperties,
            isEnabled,
            revisionId,
            suppressionListIds,
            timeWindows,
            type,
            description,
            enrollmentCriteria,
            enrollmentSchedule,
            eventAnchor,
            goalFilterBranch,
            name,
            startActionId,
            unEnrollmentSetting,
            uuid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiContactFlowPutRequest{actions=$actions, blockedDates=$blockedDates, canEnrollFromSalesforce=$canEnrollFromSalesforce, customProperties=$customProperties, isEnabled=$isEnabled, revisionId=$revisionId, suppressionListIds=$suppressionListIds, timeWindows=$timeWindows, type=$type, description=$description, enrollmentCriteria=$enrollmentCriteria, enrollmentSchedule=$enrollmentSchedule, eventAnchor=$eventAnchor, goalFilterBranch=$goalFilterBranch, name=$name, startActionId=$startActionId, unEnrollmentSetting=$unEnrollmentSetting, uuid=$uuid, additionalProperties=$additionalProperties}"
}
