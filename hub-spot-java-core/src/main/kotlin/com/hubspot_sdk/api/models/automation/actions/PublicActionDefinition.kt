// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

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
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicActionDefinition
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actionUrl: JsonField<String>,
    private val functions: JsonField<List<PublicActionFunctionIdentifier>>,
    private val inputFields: JsonField<List<InputFieldDefinition>>,
    private val labels: JsonField<Labels>,
    private val objectTypes: JsonField<List<String>>,
    private val published: JsonField<Boolean>,
    private val revisionId: JsonField<String>,
    private val archivedAt: JsonField<Long>,
    private val executionRules: JsonField<List<PublicExecutionTranslationRule>>,
    private val inputFieldDependencies: JsonField<List<InputFieldDependency>>,
    private val objectRequestOptions: JsonField<PublicObjectRequestOptions>,
    private val outputFields: JsonField<List<OutputFieldDefinition>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionUrl") @ExcludeMissing actionUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("functions")
        @ExcludeMissing
        functions: JsonField<List<PublicActionFunctionIdentifier>> = JsonMissing.of(),
        @JsonProperty("inputFields")
        @ExcludeMissing
        inputFields: JsonField<List<InputFieldDefinition>> = JsonMissing.of(),
        @JsonProperty("labels") @ExcludeMissing labels: JsonField<Labels> = JsonMissing.of(),
        @JsonProperty("objectTypes")
        @ExcludeMissing
        objectTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("published") @ExcludeMissing published: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("revisionId")
        @ExcludeMissing
        revisionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archivedAt") @ExcludeMissing archivedAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("executionRules")
        @ExcludeMissing
        executionRules: JsonField<List<PublicExecutionTranslationRule>> = JsonMissing.of(),
        @JsonProperty("inputFieldDependencies")
        @ExcludeMissing
        inputFieldDependencies: JsonField<List<InputFieldDependency>> = JsonMissing.of(),
        @JsonProperty("objectRequestOptions")
        @ExcludeMissing
        objectRequestOptions: JsonField<PublicObjectRequestOptions> = JsonMissing.of(),
        @JsonProperty("outputFields")
        @ExcludeMissing
        outputFields: JsonField<List<OutputFieldDefinition>> = JsonMissing.of(),
    ) : this(
        id,
        actionUrl,
        functions,
        inputFields,
        labels,
        objectTypes,
        published,
        revisionId,
        archivedAt,
        executionRules,
        inputFieldDependencies,
        objectRequestOptions,
        outputFields,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionUrl(): String = actionUrl.getRequired("actionUrl")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun functions(): List<PublicActionFunctionIdentifier> = functions.getRequired("functions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputFields(): List<InputFieldDefinition> = inputFields.getRequired("inputFields")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun labels(): Labels = labels.getRequired("labels")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun objectTypes(): List<String> = objectTypes.getRequired("objectTypes")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun published(): Boolean = published.getRequired("published")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun revisionId(): String = revisionId.getRequired("revisionId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<Long> = archivedAt.getOptional("archivedAt")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionRules(): Optional<List<PublicExecutionTranslationRule>> =
        executionRules.getOptional("executionRules")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputFieldDependencies(): Optional<List<InputFieldDependency>> =
        inputFieldDependencies.getOptional("inputFieldDependencies")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectRequestOptions(): Optional<PublicObjectRequestOptions> =
        objectRequestOptions.getOptional("objectRequestOptions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputFields(): Optional<List<OutputFieldDefinition>> =
        outputFields.getOptional("outputFields")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actionUrl].
     *
     * Unlike [actionUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionUrl") @ExcludeMissing fun _actionUrl(): JsonField<String> = actionUrl

    /**
     * Returns the raw JSON value of [functions].
     *
     * Unlike [functions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("functions")
    @ExcludeMissing
    fun _functions(): JsonField<List<PublicActionFunctionIdentifier>> = functions

    /**
     * Returns the raw JSON value of [inputFields].
     *
     * Unlike [inputFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputFields")
    @ExcludeMissing
    fun _inputFields(): JsonField<List<InputFieldDefinition>> = inputFields

    /**
     * Returns the raw JSON value of [labels].
     *
     * Unlike [labels], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("labels") @ExcludeMissing fun _labels(): JsonField<Labels> = labels

    /**
     * Returns the raw JSON value of [objectTypes].
     *
     * Unlike [objectTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectTypes")
    @ExcludeMissing
    fun _objectTypes(): JsonField<List<String>> = objectTypes

    /**
     * Returns the raw JSON value of [published].
     *
     * Unlike [published], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published") @ExcludeMissing fun _published(): JsonField<Boolean> = published

    /**
     * Returns the raw JSON value of [revisionId].
     *
     * Unlike [revisionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revisionId") @ExcludeMissing fun _revisionId(): JsonField<String> = revisionId

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivedAt") @ExcludeMissing fun _archivedAt(): JsonField<Long> = archivedAt

    /**
     * Returns the raw JSON value of [executionRules].
     *
     * Unlike [executionRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executionRules")
    @ExcludeMissing
    fun _executionRules(): JsonField<List<PublicExecutionTranslationRule>> = executionRules

    /**
     * Returns the raw JSON value of [inputFieldDependencies].
     *
     * Unlike [inputFieldDependencies], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inputFieldDependencies")
    @ExcludeMissing
    fun _inputFieldDependencies(): JsonField<List<InputFieldDependency>> = inputFieldDependencies

    /**
     * Returns the raw JSON value of [objectRequestOptions].
     *
     * Unlike [objectRequestOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectRequestOptions")
    @ExcludeMissing
    fun _objectRequestOptions(): JsonField<PublicObjectRequestOptions> = objectRequestOptions

    /**
     * Returns the raw JSON value of [outputFields].
     *
     * Unlike [outputFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputFields")
    @ExcludeMissing
    fun _outputFields(): JsonField<List<OutputFieldDefinition>> = outputFields

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
         * Returns a mutable builder for constructing an instance of [PublicActionDefinition].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actionUrl()
         * .functions()
         * .inputFields()
         * .labels()
         * .objectTypes()
         * .published()
         * .revisionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicActionDefinition]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var actionUrl: JsonField<String>? = null
        private var functions: JsonField<MutableList<PublicActionFunctionIdentifier>>? = null
        private var inputFields: JsonField<MutableList<InputFieldDefinition>>? = null
        private var labels: JsonField<Labels>? = null
        private var objectTypes: JsonField<MutableList<String>>? = null
        private var published: JsonField<Boolean>? = null
        private var revisionId: JsonField<String>? = null
        private var archivedAt: JsonField<Long> = JsonMissing.of()
        private var executionRules: JsonField<MutableList<PublicExecutionTranslationRule>>? = null
        private var inputFieldDependencies: JsonField<MutableList<InputFieldDependency>>? = null
        private var objectRequestOptions: JsonField<PublicObjectRequestOptions> = JsonMissing.of()
        private var outputFields: JsonField<MutableList<OutputFieldDefinition>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicActionDefinition: PublicActionDefinition) = apply {
            id = publicActionDefinition.id
            actionUrl = publicActionDefinition.actionUrl
            functions = publicActionDefinition.functions.map { it.toMutableList() }
            inputFields = publicActionDefinition.inputFields.map { it.toMutableList() }
            labels = publicActionDefinition.labels
            objectTypes = publicActionDefinition.objectTypes.map { it.toMutableList() }
            published = publicActionDefinition.published
            revisionId = publicActionDefinition.revisionId
            archivedAt = publicActionDefinition.archivedAt
            executionRules = publicActionDefinition.executionRules.map { it.toMutableList() }
            inputFieldDependencies =
                publicActionDefinition.inputFieldDependencies.map { it.toMutableList() }
            objectRequestOptions = publicActionDefinition.objectRequestOptions
            outputFields = publicActionDefinition.outputFields.map { it.toMutableList() }
            additionalProperties = publicActionDefinition.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun actionUrl(actionUrl: String) = actionUrl(JsonField.of(actionUrl))

        /**
         * Sets [Builder.actionUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionUrl(actionUrl: JsonField<String>) = apply { this.actionUrl = actionUrl }

        fun functions(functions: List<PublicActionFunctionIdentifier>) =
            functions(JsonField.of(functions))

        /**
         * Sets [Builder.functions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.functions] with a well-typed
         * `List<PublicActionFunctionIdentifier>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun functions(functions: JsonField<List<PublicActionFunctionIdentifier>>) = apply {
            this.functions = functions.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicActionFunctionIdentifier] to [functions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFunction(function: PublicActionFunctionIdentifier) = apply {
            functions =
                (functions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("functions", it).add(function)
                }
        }

        fun inputFields(inputFields: List<InputFieldDefinition>) =
            inputFields(JsonField.of(inputFields))

        /**
         * Sets [Builder.inputFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFields] with a well-typed
         * `List<InputFieldDefinition>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun inputFields(inputFields: JsonField<List<InputFieldDefinition>>) = apply {
            this.inputFields = inputFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [InputFieldDefinition] to [inputFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputField(inputField: InputFieldDefinition) = apply {
            inputFields =
                (inputFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputFields", it).add(inputField)
                }
        }

        fun labels(labels: Labels) = labels(JsonField.of(labels))

        /**
         * Sets [Builder.labels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.labels] with a well-typed [Labels] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun labels(labels: JsonField<Labels>) = apply { this.labels = labels }

        fun objectTypes(objectTypes: List<String>) = objectTypes(JsonField.of(objectTypes))

        /**
         * Sets [Builder.objectTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectTypes(objectTypes: JsonField<List<String>>) = apply {
            this.objectTypes = objectTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [objectTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addObjectType(objectType: String) = apply {
            objectTypes =
                (objectTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("objectTypes", it).add(objectType)
                }
        }

        fun published(published: Boolean) = published(JsonField.of(published))

        /**
         * Sets [Builder.published] to an arbitrary JSON value.
         *
         * You should usually call [Builder.published] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun published(published: JsonField<Boolean>) = apply { this.published = published }

        fun revisionId(revisionId: String) = revisionId(JsonField.of(revisionId))

        /**
         * Sets [Builder.revisionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revisionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun revisionId(revisionId: JsonField<String>) = apply { this.revisionId = revisionId }

        fun archivedAt(archivedAt: Long) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun archivedAt(archivedAt: JsonField<Long>) = apply { this.archivedAt = archivedAt }

        fun executionRules(executionRules: List<PublicExecutionTranslationRule>) =
            executionRules(JsonField.of(executionRules))

        /**
         * Sets [Builder.executionRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionRules] with a well-typed
         * `List<PublicExecutionTranslationRule>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun executionRules(executionRules: JsonField<List<PublicExecutionTranslationRule>>) =
            apply {
                this.executionRules = executionRules.map { it.toMutableList() }
            }

        /**
         * Adds a single [PublicExecutionTranslationRule] to [executionRules].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExecutionRule(executionRule: PublicExecutionTranslationRule) = apply {
            executionRules =
                (executionRules ?: JsonField.of(mutableListOf())).also {
                    checkKnown("executionRules", it).add(executionRule)
                }
        }

        fun inputFieldDependencies(inputFieldDependencies: List<InputFieldDependency>) =
            inputFieldDependencies(JsonField.of(inputFieldDependencies))

        /**
         * Sets [Builder.inputFieldDependencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFieldDependencies] with a well-typed
         * `List<InputFieldDependency>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun inputFieldDependencies(inputFieldDependencies: JsonField<List<InputFieldDependency>>) =
            apply {
                this.inputFieldDependencies = inputFieldDependencies.map { it.toMutableList() }
            }

        /**
         * Adds a single [InputFieldDependency] to [inputFieldDependencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputFieldDependency(inputFieldDependency: InputFieldDependency) = apply {
            inputFieldDependencies =
                (inputFieldDependencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("inputFieldDependencies", it).add(inputFieldDependency)
                }
        }

        /**
         * Alias for calling [addInputFieldDependency] with
         * `InputFieldDependency.ofPublicSingle(publicSingle)`.
         */
        fun addInputFieldDependency(publicSingle: PublicSingleFieldDependency) =
            addInputFieldDependency(InputFieldDependency.ofPublicSingle(publicSingle))

        /**
         * Alias for calling [addInputFieldDependency] with
         * `InputFieldDependency.ofPublicConditionalSingle(publicConditionalSingle)`.
         */
        fun addInputFieldDependency(
            publicConditionalSingle: PublicConditionalSingleFieldDependency
        ) =
            addInputFieldDependency(
                InputFieldDependency.ofPublicConditionalSingle(publicConditionalSingle)
            )

        fun objectRequestOptions(objectRequestOptions: PublicObjectRequestOptions) =
            objectRequestOptions(JsonField.of(objectRequestOptions))

        /**
         * Sets [Builder.objectRequestOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectRequestOptions] with a well-typed
         * [PublicObjectRequestOptions] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun objectRequestOptions(objectRequestOptions: JsonField<PublicObjectRequestOptions>) =
            apply {
                this.objectRequestOptions = objectRequestOptions
            }

        fun outputFields(outputFields: List<OutputFieldDefinition>) =
            outputFields(JsonField.of(outputFields))

        /**
         * Sets [Builder.outputFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputFields] with a well-typed
         * `List<OutputFieldDefinition>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun outputFields(outputFields: JsonField<List<OutputFieldDefinition>>) = apply {
            this.outputFields = outputFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [OutputFieldDefinition] to [outputFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutputField(outputField: OutputFieldDefinition) = apply {
            outputFields =
                (outputFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("outputFields", it).add(outputField)
                }
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
         * Returns an immutable instance of [PublicActionDefinition].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actionUrl()
         * .functions()
         * .inputFields()
         * .labels()
         * .objectTypes()
         * .published()
         * .revisionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicActionDefinition =
            PublicActionDefinition(
                checkRequired("id", id),
                checkRequired("actionUrl", actionUrl),
                checkRequired("functions", functions).map { it.toImmutable() },
                checkRequired("inputFields", inputFields).map { it.toImmutable() },
                checkRequired("labels", labels),
                checkRequired("objectTypes", objectTypes).map { it.toImmutable() },
                checkRequired("published", published),
                checkRequired("revisionId", revisionId),
                archivedAt,
                (executionRules ?: JsonMissing.of()).map { it.toImmutable() },
                (inputFieldDependencies ?: JsonMissing.of()).map { it.toImmutable() },
                objectRequestOptions,
                (outputFields ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicActionDefinition = apply {
        if (validated) {
            return@apply
        }

        id()
        actionUrl()
        functions().forEach { it.validate() }
        inputFields().forEach { it.validate() }
        labels().validate()
        objectTypes()
        published()
        revisionId()
        archivedAt()
        executionRules().ifPresent { it.forEach { it.validate() } }
        inputFieldDependencies().ifPresent { it.forEach { it.validate() } }
        objectRequestOptions().ifPresent { it.validate() }
        outputFields().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (actionUrl.asKnown().isPresent) 1 else 0) +
            (functions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (inputFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (labels.asKnown().getOrNull()?.validity() ?: 0) +
            (objectTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (published.asKnown().isPresent) 1 else 0) +
            (if (revisionId.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (executionRules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (inputFieldDependencies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (objectRequestOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (outputFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Labels
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

            /** Returns a mutable builder for constructing an instance of [Labels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Labels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(labels: Labels) = apply {
                additionalProperties = labels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Labels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Labels = Labels(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Labels = apply {
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

            return other is Labels && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Labels{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = InputFieldDependency.Deserializer::class)
    @JsonSerialize(using = InputFieldDependency.Serializer::class)
    class InputFieldDependency
    private constructor(
        private val publicSingle: PublicSingleFieldDependency? = null,
        private val publicConditionalSingle: PublicConditionalSingleFieldDependency? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicSingle(): Optional<PublicSingleFieldDependency> =
            Optional.ofNullable(publicSingle)

        fun publicConditionalSingle(): Optional<PublicConditionalSingleFieldDependency> =
            Optional.ofNullable(publicConditionalSingle)

        fun isPublicSingle(): Boolean = publicSingle != null

        fun isPublicConditionalSingle(): Boolean = publicConditionalSingle != null

        fun asPublicSingle(): PublicSingleFieldDependency = publicSingle.getOrThrow("publicSingle")

        fun asPublicConditionalSingle(): PublicConditionalSingleFieldDependency =
            publicConditionalSingle.getOrThrow("publicConditionalSingle")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicSingle != null -> visitor.visitPublicSingle(publicSingle)
                publicConditionalSingle != null ->
                    visitor.visitPublicConditionalSingle(publicConditionalSingle)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): InputFieldDependency = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicSingle(publicSingle: PublicSingleFieldDependency) {
                        publicSingle.validate()
                    }

                    override fun visitPublicConditionalSingle(
                        publicConditionalSingle: PublicConditionalSingleFieldDependency
                    ) {
                        publicConditionalSingle.validate()
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
                    override fun visitPublicSingle(publicSingle: PublicSingleFieldDependency) =
                        publicSingle.validity()

                    override fun visitPublicConditionalSingle(
                        publicConditionalSingle: PublicConditionalSingleFieldDependency
                    ) = publicConditionalSingle.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputFieldDependency &&
                publicSingle == other.publicSingle &&
                publicConditionalSingle == other.publicConditionalSingle
        }

        override fun hashCode(): Int = Objects.hash(publicSingle, publicConditionalSingle)

        override fun toString(): String =
            when {
                publicSingle != null -> "InputFieldDependency{publicSingle=$publicSingle}"
                publicConditionalSingle != null ->
                    "InputFieldDependency{publicConditionalSingle=$publicConditionalSingle}"
                _json != null -> "InputFieldDependency{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputFieldDependency")
            }

        companion object {

            @JvmStatic
            fun ofPublicSingle(publicSingle: PublicSingleFieldDependency) =
                InputFieldDependency(publicSingle = publicSingle)

            @JvmStatic
            fun ofPublicConditionalSingle(
                publicConditionalSingle: PublicConditionalSingleFieldDependency
            ) = InputFieldDependency(publicConditionalSingle = publicConditionalSingle)
        }

        /**
         * An interface that defines how to map each variant of [InputFieldDependency] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitPublicSingle(publicSingle: PublicSingleFieldDependency): T

            fun visitPublicConditionalSingle(
                publicConditionalSingle: PublicConditionalSingleFieldDependency
            ): T

            /**
             * Maps an unknown variant of [InputFieldDependency] to a value of type [T].
             *
             * An instance of [InputFieldDependency] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown InputFieldDependency: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<InputFieldDependency>(InputFieldDependency::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputFieldDependency {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicSingleFieldDependency>())
                                ?.let { InputFieldDependency(publicSingle = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PublicConditionalSingleFieldDependency>(),
                                )
                                ?.let {
                                    InputFieldDependency(publicConditionalSingle = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> InputFieldDependency(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<InputFieldDependency>(InputFieldDependency::class) {

            override fun serialize(
                value: InputFieldDependency,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicSingle != null -> generator.writeObject(value.publicSingle)
                    value.publicConditionalSingle != null ->
                        generator.writeObject(value.publicConditionalSingle)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InputFieldDependency")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicActionDefinition &&
            id == other.id &&
            actionUrl == other.actionUrl &&
            functions == other.functions &&
            inputFields == other.inputFields &&
            labels == other.labels &&
            objectTypes == other.objectTypes &&
            published == other.published &&
            revisionId == other.revisionId &&
            archivedAt == other.archivedAt &&
            executionRules == other.executionRules &&
            inputFieldDependencies == other.inputFieldDependencies &&
            objectRequestOptions == other.objectRequestOptions &&
            outputFields == other.outputFields &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            actionUrl,
            functions,
            inputFields,
            labels,
            objectTypes,
            published,
            revisionId,
            archivedAt,
            executionRules,
            inputFieldDependencies,
            objectRequestOptions,
            outputFields,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicActionDefinition{id=$id, actionUrl=$actionUrl, functions=$functions, inputFields=$inputFields, labels=$labels, objectTypes=$objectTypes, published=$published, revisionId=$revisionId, archivedAt=$archivedAt, executionRules=$executionRules, inputFieldDependencies=$inputFieldDependencies, objectRequestOptions=$objectRequestOptions, outputFields=$outputFields, additionalProperties=$additionalProperties}"
}
