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

class ApiPlatformFlowCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<List<Action>>,
    private val blockedDates: JsonField<List<ApiBlockedDate>>,
    private val customProperties: JsonField<CustomProperties>,
    private val dataSources: JsonField<List<DataSource>>,
    private val flowType: JsonField<FlowType>,
    private val isEnabled: JsonField<Boolean>,
    private val objectTypeId: JsonField<String>,
    private val timeWindows: JsonField<List<ApiTimeWindow>>,
    private val type: JsonField<Type>,
    private val description: JsonField<String>,
    private val enrollmentCriteria: JsonField<EnrollmentCriteria>,
    private val enrollmentSchedule: JsonField<EnrollmentSchedule>,
    private val name: JsonField<String>,
    private val startActionId: JsonField<String>,
    private val suppressionFilterBranch: JsonField<SuppressionFilterBranch>,
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
        @JsonProperty("customProperties")
        @ExcludeMissing
        customProperties: JsonField<CustomProperties> = JsonMissing.of(),
        @JsonProperty("dataSources")
        @ExcludeMissing
        dataSources: JsonField<List<DataSource>> = JsonMissing.of(),
        @JsonProperty("flowType") @ExcludeMissing flowType: JsonField<FlowType> = JsonMissing.of(),
        @JsonProperty("isEnabled") @ExcludeMissing isEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("objectTypeId")
        @ExcludeMissing
        objectTypeId: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startActionId")
        @ExcludeMissing
        startActionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("suppressionFilterBranch")
        @ExcludeMissing
        suppressionFilterBranch: JsonField<SuppressionFilterBranch> = JsonMissing.of(),
        @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
    ) : this(
        actions,
        blockedDates,
        customProperties,
        dataSources,
        flowType,
        isEnabled,
        objectTypeId,
        timeWindows,
        type,
        description,
        enrollmentCriteria,
        enrollmentSchedule,
        name,
        startActionId,
        suppressionFilterBranch,
        uuid,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun blockedDates(): List<ApiBlockedDate> = blockedDates.getRequired("blockedDates")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customProperties(): CustomProperties = customProperties.getRequired("customProperties")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataSources(): List<DataSource> = dataSources.getRequired("dataSources")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun flowType(): FlowType = flowType.getRequired("flowType")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isEnabled(): Boolean = isEnabled.getRequired("isEnabled")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypeId(): String = objectTypeId.getRequired("objectTypeId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeWindows(): List<ApiTimeWindow> = timeWindows.getRequired("timeWindows")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enrollmentCriteria(): Optional<EnrollmentCriteria> =
        enrollmentCriteria.getOptional("enrollmentCriteria")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enrollmentSchedule(): Optional<EnrollmentSchedule> =
        enrollmentSchedule.getOptional("enrollmentSchedule")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startActionId(): Optional<String> = startActionId.getOptional("startActionId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun suppressionFilterBranch(): Optional<SuppressionFilterBranch> =
        suppressionFilterBranch.getOptional("suppressionFilterBranch")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Returns the raw JSON value of [customProperties].
     *
     * Unlike [customProperties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customProperties")
    @ExcludeMissing
    fun _customProperties(): JsonField<CustomProperties> = customProperties

    /**
     * Returns the raw JSON value of [dataSources].
     *
     * Unlike [dataSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataSources")
    @ExcludeMissing
    fun _dataSources(): JsonField<List<DataSource>> = dataSources

    /**
     * Returns the raw JSON value of [flowType].
     *
     * Unlike [flowType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flowType") @ExcludeMissing fun _flowType(): JsonField<FlowType> = flowType

    /**
     * Returns the raw JSON value of [isEnabled].
     *
     * Unlike [isEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isEnabled") @ExcludeMissing fun _isEnabled(): JsonField<Boolean> = isEnabled

    /**
     * Returns the raw JSON value of [objectTypeId].
     *
     * Unlike [objectTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypeId")
    @ExcludeMissing
    fun _objectTypeId(): JsonField<String> = objectTypeId

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
     * Returns the raw JSON value of [suppressionFilterBranch].
     *
     * Unlike [suppressionFilterBranch], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("suppressionFilterBranch")
    @ExcludeMissing
    fun _suppressionFilterBranch(): JsonField<SuppressionFilterBranch> = suppressionFilterBranch

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
         * Returns a mutable builder for constructing an instance of [ApiPlatformFlowCreateRequest].
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .blockedDates()
         * .customProperties()
         * .dataSources()
         * .flowType()
         * .isEnabled()
         * .objectTypeId()
         * .timeWindows()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiPlatformFlowCreateRequest]. */
    class Builder internal constructor() {

        private var actions: JsonField<MutableList<Action>>? = null
        private var blockedDates: JsonField<MutableList<ApiBlockedDate>>? = null
        private var customProperties: JsonField<CustomProperties>? = null
        private var dataSources: JsonField<MutableList<DataSource>>? = null
        private var flowType: JsonField<FlowType>? = null
        private var isEnabled: JsonField<Boolean>? = null
        private var objectTypeId: JsonField<String>? = null
        private var timeWindows: JsonField<MutableList<ApiTimeWindow>>? = null
        private var type: JsonField<Type>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var enrollmentCriteria: JsonField<EnrollmentCriteria> = JsonMissing.of()
        private var enrollmentSchedule: JsonField<EnrollmentSchedule> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var startActionId: JsonField<String> = JsonMissing.of()
        private var suppressionFilterBranch: JsonField<SuppressionFilterBranch> = JsonMissing.of()
        private var uuid: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiPlatformFlowCreateRequest: ApiPlatformFlowCreateRequest) = apply {
            actions = apiPlatformFlowCreateRequest.actions.map { it.toMutableList() }
            blockedDates = apiPlatformFlowCreateRequest.blockedDates.map { it.toMutableList() }
            customProperties = apiPlatformFlowCreateRequest.customProperties
            dataSources = apiPlatformFlowCreateRequest.dataSources.map { it.toMutableList() }
            flowType = apiPlatformFlowCreateRequest.flowType
            isEnabled = apiPlatformFlowCreateRequest.isEnabled
            objectTypeId = apiPlatformFlowCreateRequest.objectTypeId
            timeWindows = apiPlatformFlowCreateRequest.timeWindows.map { it.toMutableList() }
            type = apiPlatformFlowCreateRequest.type
            description = apiPlatformFlowCreateRequest.description
            enrollmentCriteria = apiPlatformFlowCreateRequest.enrollmentCriteria
            enrollmentSchedule = apiPlatformFlowCreateRequest.enrollmentSchedule
            name = apiPlatformFlowCreateRequest.name
            startActionId = apiPlatformFlowCreateRequest.startActionId
            suppressionFilterBranch = apiPlatformFlowCreateRequest.suppressionFilterBranch
            uuid = apiPlatformFlowCreateRequest.uuid
            additionalProperties = apiPlatformFlowCreateRequest.additionalProperties.toMutableMap()
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

        fun dataSources(dataSources: List<DataSource>) = dataSources(JsonField.of(dataSources))

        /**
         * Sets [Builder.dataSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataSources] with a well-typed `List<DataSource>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataSources(dataSources: JsonField<List<DataSource>>) = apply {
            this.dataSources = dataSources.map { it.toMutableList() }
        }

        /**
         * Adds a single [DataSource] to [dataSources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataSource(dataSource: DataSource) = apply {
            dataSources =
                (dataSources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dataSources", it).add(dataSource)
                }
        }

        /** Alias for calling [addDataSource] with `DataSource.ofApiAssociation(apiAssociation)`. */
        fun addDataSource(apiAssociation: ApiAssociationDataSource) =
            addDataSource(DataSource.ofApiAssociation(apiAssociation))

        /**
         * Alias for calling [addDataSource] with
         * `DataSource.ofApiAssociationTimestamp(apiAssociationTimestamp)`.
         */
        fun addDataSource(apiAssociationTimestamp: ApiAssociationTimestampDataSource) =
            addDataSource(DataSource.ofApiAssociationTimestamp(apiAssociationTimestamp))

        /**
         * Alias for calling [addDataSource] with
         * `DataSource.ofApiStaticPropertyFilter(apiStaticPropertyFilter)`.
         */
        fun addDataSource(apiStaticPropertyFilter: ApiStaticPropertyFilterDataSource) =
            addDataSource(DataSource.ofApiStaticPropertyFilter(apiStaticPropertyFilter))

        /**
         * Alias for calling [addDataSource] with
         * `DataSource.ofApiEnrolledRecordPropertyFilter(apiEnrolledRecordPropertyFilter)`.
         */
        fun addDataSource(
            apiEnrolledRecordPropertyFilter: ApiEnrolledRecordPropertyFilterDataSource
        ) =
            addDataSource(
                DataSource.ofApiEnrolledRecordPropertyFilter(apiEnrolledRecordPropertyFilter)
            )

        /**
         * Alias for calling [addDataSource] with
         * `DataSource.ofApiDatasetFieldPropertyFilter(apiDatasetFieldPropertyFilter)`.
         */
        fun addDataSource(apiDatasetFieldPropertyFilter: ApiDatasetFieldPropertyFilterDataSource) =
            addDataSource(DataSource.ofApiDatasetFieldPropertyFilter(apiDatasetFieldPropertyFilter))

        /**
         * Alias for calling [addDataSource] with
         * `DataSource.ofApiEnrolledArgumentPropertyFilter(apiEnrolledArgumentPropertyFilter)`.
         */
        fun addDataSource(
            apiEnrolledArgumentPropertyFilter: ApiEnrolledArgumentPropertyFilterDataSource
        ) =
            addDataSource(
                DataSource.ofApiEnrolledArgumentPropertyFilter(apiEnrolledArgumentPropertyFilter)
            )

        fun flowType(flowType: FlowType) = flowType(JsonField.of(flowType))

        /**
         * Sets [Builder.flowType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flowType] with a well-typed [FlowType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flowType(flowType: JsonField<FlowType>) = apply { this.flowType = flowType }

        fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

        /**
         * Sets [Builder.isEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isEnabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

        fun objectTypeId(objectTypeId: String) = objectTypeId(JsonField.of(objectTypeId))

        /**
         * Sets [Builder.objectTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objectTypeId(objectTypeId: JsonField<String>) = apply {
            this.objectTypeId = objectTypeId
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

        fun suppressionFilterBranch(suppressionFilterBranch: SuppressionFilterBranch) =
            suppressionFilterBranch(JsonField.of(suppressionFilterBranch))

        /**
         * Sets [Builder.suppressionFilterBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suppressionFilterBranch] with a well-typed
         * [SuppressionFilterBranch] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun suppressionFilterBranch(suppressionFilterBranch: JsonField<SuppressionFilterBranch>) =
            apply {
                this.suppressionFilterBranch = suppressionFilterBranch
            }

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicOr(publicOr)`.
         */
        fun suppressionFilterBranch(publicOr: PublicOrFilterBranch) =
            suppressionFilterBranch(SuppressionFilterBranch.ofPublicOr(publicOr))

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicAnd(publicAnd)`.
         */
        fun suppressionFilterBranch(publicAnd: PublicAndFilterBranch) =
            suppressionFilterBranch(SuppressionFilterBranch.ofPublicAnd(publicAnd))

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicNotAll(publicNotAll)`.
         */
        fun suppressionFilterBranch(publicNotAll: PublicNotAllFilterBranch) =
            suppressionFilterBranch(SuppressionFilterBranch.ofPublicNotAll(publicNotAll))

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicNotAny(publicNotAny)`.
         */
        fun suppressionFilterBranch(publicNotAny: PublicNotAnyFilterBranch) =
            suppressionFilterBranch(SuppressionFilterBranch.ofPublicNotAny(publicNotAny))

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicRestricted(publicRestricted)`.
         */
        fun suppressionFilterBranch(publicRestricted: PublicRestrictedFilterBranch) =
            suppressionFilterBranch(SuppressionFilterBranch.ofPublicRestricted(publicRestricted))

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)`.
         */
        fun suppressionFilterBranch(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
            suppressionFilterBranch(
                SuppressionFilterBranch.ofPublicUnifiedEvents(publicUnifiedEvents)
            )

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)`.
         */
        fun suppressionFilterBranch(
            publicPropertyAssociation: PublicPropertyAssociationFilterBranch
        ) =
            suppressionFilterBranch(
                SuppressionFilterBranch.ofPublicPropertyAssociation(publicPropertyAssociation)
            )

        /**
         * Alias for calling [suppressionFilterBranch] with
         * `SuppressionFilterBranch.ofPublicAssociation(publicAssociation)`.
         */
        fun suppressionFilterBranch(publicAssociation: PublicAssociationFilterBranch) =
            suppressionFilterBranch(SuppressionFilterBranch.ofPublicAssociation(publicAssociation))

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
         * Returns an immutable instance of [ApiPlatformFlowCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actions()
         * .blockedDates()
         * .customProperties()
         * .dataSources()
         * .flowType()
         * .isEnabled()
         * .objectTypeId()
         * .timeWindows()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiPlatformFlowCreateRequest =
            ApiPlatformFlowCreateRequest(
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("blockedDates", blockedDates).map { it.toImmutable() },
                checkRequired("customProperties", customProperties),
                checkRequired("dataSources", dataSources).map { it.toImmutable() },
                checkRequired("flowType", flowType),
                checkRequired("isEnabled", isEnabled),
                checkRequired("objectTypeId", objectTypeId),
                checkRequired("timeWindows", timeWindows).map { it.toImmutable() },
                checkRequired("type", type),
                description,
                enrollmentCriteria,
                enrollmentSchedule,
                name,
                startActionId,
                suppressionFilterBranch,
                uuid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiPlatformFlowCreateRequest = apply {
        if (validated) {
            return@apply
        }

        actions().forEach { it.validate() }
        blockedDates().forEach { it.validate() }
        customProperties().validate()
        dataSources().forEach { it.validate() }
        flowType().validate()
        isEnabled()
        objectTypeId()
        timeWindows().forEach { it.validate() }
        type().validate()
        description()
        enrollmentCriteria().ifPresent { it.validate() }
        enrollmentSchedule().ifPresent { it.validate() }
        name()
        startActionId()
        suppressionFilterBranch().ifPresent { it.validate() }
        uuid()
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
        (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (blockedDates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (customProperties.asKnown().getOrNull()?.validity() ?: 0) +
            (dataSources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (flowType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isEnabled.asKnown().isPresent) 1 else 0) +
            (if (objectTypeId.asKnown().isPresent) 1 else 0) +
            (timeWindows.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (enrollmentCriteria.asKnown().getOrNull()?.validity() ?: 0) +
            (enrollmentSchedule.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (startActionId.asKnown().isPresent) 1 else 0) +
            (suppressionFilterBranch.asKnown().getOrNull()?.validity() ?: 0) +
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
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Action: $json")
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

    @JsonDeserialize(using = DataSource.Deserializer::class)
    @JsonSerialize(using = DataSource.Serializer::class)
    class DataSource
    private constructor(
        private val apiAssociation: ApiAssociationDataSource? = null,
        private val apiAssociationTimestamp: ApiAssociationTimestampDataSource? = null,
        private val apiStaticPropertyFilter: ApiStaticPropertyFilterDataSource? = null,
        private val apiEnrolledRecordPropertyFilter: ApiEnrolledRecordPropertyFilterDataSource? =
            null,
        private val apiDatasetFieldPropertyFilter: ApiDatasetFieldPropertyFilterDataSource? = null,
        private val apiEnrolledArgumentPropertyFilter:
            ApiEnrolledArgumentPropertyFilterDataSource? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun apiAssociation(): Optional<ApiAssociationDataSource> =
            Optional.ofNullable(apiAssociation)

        fun apiAssociationTimestamp(): Optional<ApiAssociationTimestampDataSource> =
            Optional.ofNullable(apiAssociationTimestamp)

        fun apiStaticPropertyFilter(): Optional<ApiStaticPropertyFilterDataSource> =
            Optional.ofNullable(apiStaticPropertyFilter)

        fun apiEnrolledRecordPropertyFilter(): Optional<ApiEnrolledRecordPropertyFilterDataSource> =
            Optional.ofNullable(apiEnrolledRecordPropertyFilter)

        fun apiDatasetFieldPropertyFilter(): Optional<ApiDatasetFieldPropertyFilterDataSource> =
            Optional.ofNullable(apiDatasetFieldPropertyFilter)

        fun apiEnrolledArgumentPropertyFilter():
            Optional<ApiEnrolledArgumentPropertyFilterDataSource> =
            Optional.ofNullable(apiEnrolledArgumentPropertyFilter)

        fun isApiAssociation(): Boolean = apiAssociation != null

        fun isApiAssociationTimestamp(): Boolean = apiAssociationTimestamp != null

        fun isApiStaticPropertyFilter(): Boolean = apiStaticPropertyFilter != null

        fun isApiEnrolledRecordPropertyFilter(): Boolean = apiEnrolledRecordPropertyFilter != null

        fun isApiDatasetFieldPropertyFilter(): Boolean = apiDatasetFieldPropertyFilter != null

        fun isApiEnrolledArgumentPropertyFilter(): Boolean =
            apiEnrolledArgumentPropertyFilter != null

        fun asApiAssociation(): ApiAssociationDataSource =
            apiAssociation.getOrThrow("apiAssociation")

        fun asApiAssociationTimestamp(): ApiAssociationTimestampDataSource =
            apiAssociationTimestamp.getOrThrow("apiAssociationTimestamp")

        fun asApiStaticPropertyFilter(): ApiStaticPropertyFilterDataSource =
            apiStaticPropertyFilter.getOrThrow("apiStaticPropertyFilter")

        fun asApiEnrolledRecordPropertyFilter(): ApiEnrolledRecordPropertyFilterDataSource =
            apiEnrolledRecordPropertyFilter.getOrThrow("apiEnrolledRecordPropertyFilter")

        fun asApiDatasetFieldPropertyFilter(): ApiDatasetFieldPropertyFilterDataSource =
            apiDatasetFieldPropertyFilter.getOrThrow("apiDatasetFieldPropertyFilter")

        fun asApiEnrolledArgumentPropertyFilter(): ApiEnrolledArgumentPropertyFilterDataSource =
            apiEnrolledArgumentPropertyFilter.getOrThrow("apiEnrolledArgumentPropertyFilter")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                apiAssociation != null -> visitor.visitApiAssociation(apiAssociation)
                apiAssociationTimestamp != null ->
                    visitor.visitApiAssociationTimestamp(apiAssociationTimestamp)
                apiStaticPropertyFilter != null ->
                    visitor.visitApiStaticPropertyFilter(apiStaticPropertyFilter)
                apiEnrolledRecordPropertyFilter != null ->
                    visitor.visitApiEnrolledRecordPropertyFilter(apiEnrolledRecordPropertyFilter)
                apiDatasetFieldPropertyFilter != null ->
                    visitor.visitApiDatasetFieldPropertyFilter(apiDatasetFieldPropertyFilter)
                apiEnrolledArgumentPropertyFilter != null ->
                    visitor.visitApiEnrolledArgumentPropertyFilter(
                        apiEnrolledArgumentPropertyFilter
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): DataSource = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApiAssociation(apiAssociation: ApiAssociationDataSource) {
                        apiAssociation.validate()
                    }

                    override fun visitApiAssociationTimestamp(
                        apiAssociationTimestamp: ApiAssociationTimestampDataSource
                    ) {
                        apiAssociationTimestamp.validate()
                    }

                    override fun visitApiStaticPropertyFilter(
                        apiStaticPropertyFilter: ApiStaticPropertyFilterDataSource
                    ) {
                        apiStaticPropertyFilter.validate()
                    }

                    override fun visitApiEnrolledRecordPropertyFilter(
                        apiEnrolledRecordPropertyFilter: ApiEnrolledRecordPropertyFilterDataSource
                    ) {
                        apiEnrolledRecordPropertyFilter.validate()
                    }

                    override fun visitApiDatasetFieldPropertyFilter(
                        apiDatasetFieldPropertyFilter: ApiDatasetFieldPropertyFilterDataSource
                    ) {
                        apiDatasetFieldPropertyFilter.validate()
                    }

                    override fun visitApiEnrolledArgumentPropertyFilter(
                        apiEnrolledArgumentPropertyFilter:
                            ApiEnrolledArgumentPropertyFilterDataSource
                    ) {
                        apiEnrolledArgumentPropertyFilter.validate()
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
                    override fun visitApiAssociation(apiAssociation: ApiAssociationDataSource) =
                        apiAssociation.validity()

                    override fun visitApiAssociationTimestamp(
                        apiAssociationTimestamp: ApiAssociationTimestampDataSource
                    ) = apiAssociationTimestamp.validity()

                    override fun visitApiStaticPropertyFilter(
                        apiStaticPropertyFilter: ApiStaticPropertyFilterDataSource
                    ) = apiStaticPropertyFilter.validity()

                    override fun visitApiEnrolledRecordPropertyFilter(
                        apiEnrolledRecordPropertyFilter: ApiEnrolledRecordPropertyFilterDataSource
                    ) = apiEnrolledRecordPropertyFilter.validity()

                    override fun visitApiDatasetFieldPropertyFilter(
                        apiDatasetFieldPropertyFilter: ApiDatasetFieldPropertyFilterDataSource
                    ) = apiDatasetFieldPropertyFilter.validity()

                    override fun visitApiEnrolledArgumentPropertyFilter(
                        apiEnrolledArgumentPropertyFilter:
                            ApiEnrolledArgumentPropertyFilterDataSource
                    ) = apiEnrolledArgumentPropertyFilter.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataSource &&
                apiAssociation == other.apiAssociation &&
                apiAssociationTimestamp == other.apiAssociationTimestamp &&
                apiStaticPropertyFilter == other.apiStaticPropertyFilter &&
                apiEnrolledRecordPropertyFilter == other.apiEnrolledRecordPropertyFilter &&
                apiDatasetFieldPropertyFilter == other.apiDatasetFieldPropertyFilter &&
                apiEnrolledArgumentPropertyFilter == other.apiEnrolledArgumentPropertyFilter
        }

        override fun hashCode(): Int =
            Objects.hash(
                apiAssociation,
                apiAssociationTimestamp,
                apiStaticPropertyFilter,
                apiEnrolledRecordPropertyFilter,
                apiDatasetFieldPropertyFilter,
                apiEnrolledArgumentPropertyFilter,
            )

        override fun toString(): String =
            when {
                apiAssociation != null -> "DataSource{apiAssociation=$apiAssociation}"
                apiAssociationTimestamp != null ->
                    "DataSource{apiAssociationTimestamp=$apiAssociationTimestamp}"
                apiStaticPropertyFilter != null ->
                    "DataSource{apiStaticPropertyFilter=$apiStaticPropertyFilter}"
                apiEnrolledRecordPropertyFilter != null ->
                    "DataSource{apiEnrolledRecordPropertyFilter=$apiEnrolledRecordPropertyFilter}"
                apiDatasetFieldPropertyFilter != null ->
                    "DataSource{apiDatasetFieldPropertyFilter=$apiDatasetFieldPropertyFilter}"
                apiEnrolledArgumentPropertyFilter != null ->
                    "DataSource{apiEnrolledArgumentPropertyFilter=$apiEnrolledArgumentPropertyFilter}"
                _json != null -> "DataSource{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DataSource")
            }

        companion object {

            @JvmStatic
            fun ofApiAssociation(apiAssociation: ApiAssociationDataSource) =
                DataSource(apiAssociation = apiAssociation)

            @JvmStatic
            fun ofApiAssociationTimestamp(
                apiAssociationTimestamp: ApiAssociationTimestampDataSource
            ) = DataSource(apiAssociationTimestamp = apiAssociationTimestamp)

            @JvmStatic
            fun ofApiStaticPropertyFilter(
                apiStaticPropertyFilter: ApiStaticPropertyFilterDataSource
            ) = DataSource(apiStaticPropertyFilter = apiStaticPropertyFilter)

            @JvmStatic
            fun ofApiEnrolledRecordPropertyFilter(
                apiEnrolledRecordPropertyFilter: ApiEnrolledRecordPropertyFilterDataSource
            ) = DataSource(apiEnrolledRecordPropertyFilter = apiEnrolledRecordPropertyFilter)

            @JvmStatic
            fun ofApiDatasetFieldPropertyFilter(
                apiDatasetFieldPropertyFilter: ApiDatasetFieldPropertyFilterDataSource
            ) = DataSource(apiDatasetFieldPropertyFilter = apiDatasetFieldPropertyFilter)

            @JvmStatic
            fun ofApiEnrolledArgumentPropertyFilter(
                apiEnrolledArgumentPropertyFilter: ApiEnrolledArgumentPropertyFilterDataSource
            ) = DataSource(apiEnrolledArgumentPropertyFilter = apiEnrolledArgumentPropertyFilter)
        }

        /**
         * An interface that defines how to map each variant of [DataSource] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitApiAssociation(apiAssociation: ApiAssociationDataSource): T

            fun visitApiAssociationTimestamp(
                apiAssociationTimestamp: ApiAssociationTimestampDataSource
            ): T

            fun visitApiStaticPropertyFilter(
                apiStaticPropertyFilter: ApiStaticPropertyFilterDataSource
            ): T

            fun visitApiEnrolledRecordPropertyFilter(
                apiEnrolledRecordPropertyFilter: ApiEnrolledRecordPropertyFilterDataSource
            ): T

            fun visitApiDatasetFieldPropertyFilter(
                apiDatasetFieldPropertyFilter: ApiDatasetFieldPropertyFilterDataSource
            ): T

            fun visitApiEnrolledArgumentPropertyFilter(
                apiEnrolledArgumentPropertyFilter: ApiEnrolledArgumentPropertyFilterDataSource
            ): T

            /**
             * Maps an unknown variant of [DataSource] to a value of type [T].
             *
             * An instance of [DataSource] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown DataSource: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<DataSource>(DataSource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): DataSource {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ApiAssociationDataSource>())?.let {
                                DataSource(apiAssociation = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiAssociationTimestampDataSource>(),
                                )
                                ?.let { DataSource(apiAssociationTimestamp = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiStaticPropertyFilterDataSource>(),
                                )
                                ?.let { DataSource(apiStaticPropertyFilter = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiEnrolledRecordPropertyFilterDataSource>(),
                                )
                                ?.let {
                                    DataSource(apiEnrolledRecordPropertyFilter = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiDatasetFieldPropertyFilterDataSource>(),
                                )
                                ?.let {
                                    DataSource(apiDatasetFieldPropertyFilter = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<ApiEnrolledArgumentPropertyFilterDataSource>(),
                                )
                                ?.let {
                                    DataSource(apiEnrolledArgumentPropertyFilter = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> DataSource(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<DataSource>(DataSource::class) {

            override fun serialize(
                value: DataSource,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.apiAssociation != null -> generator.writeObject(value.apiAssociation)
                    value.apiAssociationTimestamp != null ->
                        generator.writeObject(value.apiAssociationTimestamp)
                    value.apiStaticPropertyFilter != null ->
                        generator.writeObject(value.apiStaticPropertyFilter)
                    value.apiEnrolledRecordPropertyFilter != null ->
                        generator.writeObject(value.apiEnrolledRecordPropertyFilter)
                    value.apiDatasetFieldPropertyFilter != null ->
                        generator.writeObject(value.apiDatasetFieldPropertyFilter)
                    value.apiEnrolledArgumentPropertyFilter != null ->
                        generator.writeObject(value.apiEnrolledArgumentPropertyFilter)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DataSource")
                }
            }
        }
    }

    class FlowType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WORKFLOW = of("WORKFLOW")

            @JvmField val ACTION_SET = of("ACTION_SET")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = FlowType(JsonField.of(value))
        }

        /** An enum containing [FlowType]'s known values. */
        enum class Known {
            WORKFLOW,
            ACTION_SET,
            UNKNOWN,
        }

        /**
         * An enum containing [FlowType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FlowType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WORKFLOW,
            ACTION_SET,
            UNKNOWN,
            /** An enum member indicating that [FlowType] was instantiated with an unknown value. */
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
                WORKFLOW -> Value.WORKFLOW
                ACTION_SET -> Value.ACTION_SET
                UNKNOWN -> Value.UNKNOWN
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
                WORKFLOW -> Known.WORKFLOW
                ACTION_SET -> Known.ACTION_SET
                UNKNOWN -> Known.UNKNOWN
                else -> throw HubSpotInvalidDataException("Unknown FlowType: $value")
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

        fun validate(): FlowType = apply {
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

            return other is FlowType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CONTACT_FLOW -> Known.CONTACT_FLOW
                PLATFORM_FLOW -> Known.PLATFORM_FLOW
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
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown EnrollmentCriteria: $json")
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
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown EnrollmentSchedule: $json")
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

    @JsonDeserialize(using = SuppressionFilterBranch.Deserializer::class)
    @JsonSerialize(using = SuppressionFilterBranch.Serializer::class)
    class SuppressionFilterBranch
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

        fun validate(): SuppressionFilterBranch = apply {
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

            return other is SuppressionFilterBranch &&
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
                publicOr != null -> "SuppressionFilterBranch{publicOr=$publicOr}"
                publicAnd != null -> "SuppressionFilterBranch{publicAnd=$publicAnd}"
                publicNotAll != null -> "SuppressionFilterBranch{publicNotAll=$publicNotAll}"
                publicNotAny != null -> "SuppressionFilterBranch{publicNotAny=$publicNotAny}"
                publicRestricted != null ->
                    "SuppressionFilterBranch{publicRestricted=$publicRestricted}"
                publicUnifiedEvents != null ->
                    "SuppressionFilterBranch{publicUnifiedEvents=$publicUnifiedEvents}"
                publicPropertyAssociation != null ->
                    "SuppressionFilterBranch{publicPropertyAssociation=$publicPropertyAssociation}"
                publicAssociation != null ->
                    "SuppressionFilterBranch{publicAssociation=$publicAssociation}"
                _json != null -> "SuppressionFilterBranch{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid SuppressionFilterBranch")
            }

        companion object {

            @JvmStatic
            fun ofPublicOr(publicOr: PublicOrFilterBranch) =
                SuppressionFilterBranch(publicOr = publicOr)

            @JvmStatic
            fun ofPublicAnd(publicAnd: PublicAndFilterBranch) =
                SuppressionFilterBranch(publicAnd = publicAnd)

            @JvmStatic
            fun ofPublicNotAll(publicNotAll: PublicNotAllFilterBranch) =
                SuppressionFilterBranch(publicNotAll = publicNotAll)

            @JvmStatic
            fun ofPublicNotAny(publicNotAny: PublicNotAnyFilterBranch) =
                SuppressionFilterBranch(publicNotAny = publicNotAny)

            @JvmStatic
            fun ofPublicRestricted(publicRestricted: PublicRestrictedFilterBranch) =
                SuppressionFilterBranch(publicRestricted = publicRestricted)

            @JvmStatic
            fun ofPublicUnifiedEvents(publicUnifiedEvents: PublicUnifiedEventsFilterBranch) =
                SuppressionFilterBranch(publicUnifiedEvents = publicUnifiedEvents)

            @JvmStatic
            fun ofPublicPropertyAssociation(
                publicPropertyAssociation: PublicPropertyAssociationFilterBranch
            ) = SuppressionFilterBranch(publicPropertyAssociation = publicPropertyAssociation)

            @JvmStatic
            fun ofPublicAssociation(publicAssociation: PublicAssociationFilterBranch) =
                SuppressionFilterBranch(publicAssociation = publicAssociation)
        }

        /**
         * An interface that defines how to map each variant of [SuppressionFilterBranch] to a value
         * of type [T].
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
             * Maps an unknown variant of [SuppressionFilterBranch] to a value of type [T].
             *
             * An instance of [SuppressionFilterBranch] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown SuppressionFilterBranch: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<SuppressionFilterBranch>(SuppressionFilterBranch::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): SuppressionFilterBranch {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicOrFilterBranch>())?.let {
                                SuppressionFilterBranch(publicOr = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicAndFilterBranch>())?.let {
                                SuppressionFilterBranch(publicAnd = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAllFilterBranch>())?.let {
                                SuppressionFilterBranch(publicNotAll = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicNotAnyFilterBranch>())?.let {
                                SuppressionFilterBranch(publicNotAny = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicRestrictedFilterBranch>())
                                ?.let {
                                    SuppressionFilterBranch(publicRestricted = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicUnifiedEventsFilterBranch>())
                                ?.let {
                                    SuppressionFilterBranch(publicUnifiedEvents = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicPropertyAssociationFilterBranch>(),
                                )
                                ?.let {
                                    SuppressionFilterBranch(
                                        publicPropertyAssociation = it,
                                        _json = json,
                                    )
                                },
                            tryDeserialize(node, jacksonTypeRef<PublicAssociationFilterBranch>())
                                ?.let {
                                    SuppressionFilterBranch(publicAssociation = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> SuppressionFilterBranch(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<SuppressionFilterBranch>(SuppressionFilterBranch::class) {

            override fun serialize(
                value: SuppressionFilterBranch,
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
                    else -> throw IllegalStateException("Invalid SuppressionFilterBranch")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiPlatformFlowCreateRequest &&
            actions == other.actions &&
            blockedDates == other.blockedDates &&
            customProperties == other.customProperties &&
            dataSources == other.dataSources &&
            flowType == other.flowType &&
            isEnabled == other.isEnabled &&
            objectTypeId == other.objectTypeId &&
            timeWindows == other.timeWindows &&
            type == other.type &&
            description == other.description &&
            enrollmentCriteria == other.enrollmentCriteria &&
            enrollmentSchedule == other.enrollmentSchedule &&
            name == other.name &&
            startActionId == other.startActionId &&
            suppressionFilterBranch == other.suppressionFilterBranch &&
            uuid == other.uuid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actions,
            blockedDates,
            customProperties,
            dataSources,
            flowType,
            isEnabled,
            objectTypeId,
            timeWindows,
            type,
            description,
            enrollmentCriteria,
            enrollmentSchedule,
            name,
            startActionId,
            suppressionFilterBranch,
            uuid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiPlatformFlowCreateRequest{actions=$actions, blockedDates=$blockedDates, customProperties=$customProperties, dataSources=$dataSources, flowType=$flowType, isEnabled=$isEnabled, objectTypeId=$objectTypeId, timeWindows=$timeWindows, type=$type, description=$description, enrollmentCriteria=$enrollmentCriteria, enrollmentSchedule=$enrollmentSchedule, name=$name, startActionId=$startActionId, suppressionFilterBranch=$suppressionFilterBranch, uuid=$uuid, additionalProperties=$additionalProperties}"
}
