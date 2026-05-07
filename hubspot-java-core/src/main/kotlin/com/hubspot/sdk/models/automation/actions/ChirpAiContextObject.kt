// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ChirpAiContextObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationGroup: JsonField<String>,
    private val applicationId: JsonField<String>,
    private val isPrivate: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val otelContextHolder: JsonField<OtelContextHolder>,
    private val unstructuredSources: JsonField<List<UnstructuredSource>>,
    private val complianceIds: JsonField<ComplianceIds>,
    private val conversationId: JsonField<String>,
    private val featureId: JsonField<String>,
    private val inferenceId: JsonField<String>,
    private val trajectoryId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("applicationGroup")
        @ExcludeMissing
        applicationGroup: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applicationId")
        @ExcludeMissing
        applicationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isPrivate") @ExcludeMissing isPrivate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("otelContextHolder")
        @ExcludeMissing
        otelContextHolder: JsonField<OtelContextHolder> = JsonMissing.of(),
        @JsonProperty("unstructuredSources")
        @ExcludeMissing
        unstructuredSources: JsonField<List<UnstructuredSource>> = JsonMissing.of(),
        @JsonProperty("complianceIds")
        @ExcludeMissing
        complianceIds: JsonField<ComplianceIds> = JsonMissing.of(),
        @JsonProperty("conversationId")
        @ExcludeMissing
        conversationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("featureId") @ExcludeMissing featureId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inferenceId")
        @ExcludeMissing
        inferenceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trajectoryId")
        @ExcludeMissing
        trajectoryId: JsonField<String> = JsonMissing.of(),
    ) : this(
        applicationGroup,
        applicationId,
        isPrivate,
        metadata,
        otelContextHolder,
        unstructuredSources,
        complianceIds,
        conversationId,
        featureId,
        inferenceId,
        trajectoryId,
        mutableMapOf(),
    )

    /**
     * The group to which the application belongs.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationGroup(): String = applicationGroup.getRequired("applicationGroup")

    /**
     * The identifier for the application associated with the context.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationId(): String = applicationId.getRequired("applicationId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPrivate(): Boolean = isPrivate.getRequired("isPrivate")

    /**
     * Additional metadata related to the context, represented as key-value pairs.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Holds OpenTelemetry context information as key-value pairs.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun otelContextHolder(): OtelContextHolder = otelContextHolder.getRequired("otelContextHolder")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unstructuredSources(): List<UnstructuredSource> =
        unstructuredSources.getRequired("unstructuredSources")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun complianceIds(): Optional<ComplianceIds> = complianceIds.getOptional("complianceIds")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun conversationId(): Optional<String> = conversationId.getOptional("conversationId")

    /**
     * The identifier for the feature associated with the context.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun featureId(): Optional<String> = featureId.getOptional("featureId")

    /**
     * The identifier for the inference associated with the context.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inferenceId(): Optional<String> = inferenceId.getOptional("inferenceId")

    /**
     * The identifier for the trajectory, formatted as a UUID.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun trajectoryId(): Optional<String> = trajectoryId.getOptional("trajectoryId")

    /**
     * Returns the raw JSON value of [applicationGroup].
     *
     * Unlike [applicationGroup], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicationGroup")
    @ExcludeMissing
    fun _applicationGroup(): JsonField<String> = applicationGroup

    /**
     * Returns the raw JSON value of [applicationId].
     *
     * Unlike [applicationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("applicationId")
    @ExcludeMissing
    fun _applicationId(): JsonField<String> = applicationId

    /**
     * Returns the raw JSON value of [isPrivate].
     *
     * Unlike [isPrivate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isPrivate") @ExcludeMissing fun _isPrivate(): JsonField<Boolean> = isPrivate

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [otelContextHolder].
     *
     * Unlike [otelContextHolder], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("otelContextHolder")
    @ExcludeMissing
    fun _otelContextHolder(): JsonField<OtelContextHolder> = otelContextHolder

    /**
     * Returns the raw JSON value of [unstructuredSources].
     *
     * Unlike [unstructuredSources], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("unstructuredSources")
    @ExcludeMissing
    fun _unstructuredSources(): JsonField<List<UnstructuredSource>> = unstructuredSources

    /**
     * Returns the raw JSON value of [complianceIds].
     *
     * Unlike [complianceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("complianceIds")
    @ExcludeMissing
    fun _complianceIds(): JsonField<ComplianceIds> = complianceIds

    /**
     * Returns the raw JSON value of [conversationId].
     *
     * Unlike [conversationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("conversationId")
    @ExcludeMissing
    fun _conversationId(): JsonField<String> = conversationId

    /**
     * Returns the raw JSON value of [featureId].
     *
     * Unlike [featureId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("featureId") @ExcludeMissing fun _featureId(): JsonField<String> = featureId

    /**
     * Returns the raw JSON value of [inferenceId].
     *
     * Unlike [inferenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inferenceId") @ExcludeMissing fun _inferenceId(): JsonField<String> = inferenceId

    /**
     * Returns the raw JSON value of [trajectoryId].
     *
     * Unlike [trajectoryId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trajectoryId")
    @ExcludeMissing
    fun _trajectoryId(): JsonField<String> = trajectoryId

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
         * Returns a mutable builder for constructing an instance of [ChirpAiContextObject].
         *
         * The following fields are required:
         * ```java
         * .applicationGroup()
         * .applicationId()
         * .isPrivate()
         * .metadata()
         * .otelContextHolder()
         * .unstructuredSources()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChirpAiContextObject]. */
    class Builder internal constructor() {

        private var applicationGroup: JsonField<String>? = null
        private var applicationId: JsonField<String>? = null
        private var isPrivate: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var otelContextHolder: JsonField<OtelContextHolder>? = null
        private var unstructuredSources: JsonField<MutableList<UnstructuredSource>>? = null
        private var complianceIds: JsonField<ComplianceIds> = JsonMissing.of()
        private var conversationId: JsonField<String> = JsonMissing.of()
        private var featureId: JsonField<String> = JsonMissing.of()
        private var inferenceId: JsonField<String> = JsonMissing.of()
        private var trajectoryId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chirpAiContextObject: ChirpAiContextObject) = apply {
            applicationGroup = chirpAiContextObject.applicationGroup
            applicationId = chirpAiContextObject.applicationId
            isPrivate = chirpAiContextObject.isPrivate
            metadata = chirpAiContextObject.metadata
            otelContextHolder = chirpAiContextObject.otelContextHolder
            unstructuredSources =
                chirpAiContextObject.unstructuredSources.map { it.toMutableList() }
            complianceIds = chirpAiContextObject.complianceIds
            conversationId = chirpAiContextObject.conversationId
            featureId = chirpAiContextObject.featureId
            inferenceId = chirpAiContextObject.inferenceId
            trajectoryId = chirpAiContextObject.trajectoryId
            additionalProperties = chirpAiContextObject.additionalProperties.toMutableMap()
        }

        /** The group to which the application belongs. */
        fun applicationGroup(applicationGroup: String) =
            applicationGroup(JsonField.of(applicationGroup))

        /**
         * Sets [Builder.applicationGroup] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationGroup] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationGroup(applicationGroup: JsonField<String>) = apply {
            this.applicationGroup = applicationGroup
        }

        /** The identifier for the application associated with the context. */
        fun applicationId(applicationId: String) = applicationId(JsonField.of(applicationId))

        /**
         * Sets [Builder.applicationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applicationId(applicationId: JsonField<String>) = apply {
            this.applicationId = applicationId
        }

        fun isPrivate(isPrivate: Boolean) = isPrivate(JsonField.of(isPrivate))

        /**
         * Sets [Builder.isPrivate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPrivate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPrivate(isPrivate: JsonField<Boolean>) = apply { this.isPrivate = isPrivate }

        /** Additional metadata related to the context, represented as key-value pairs. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Holds OpenTelemetry context information as key-value pairs. */
        fun otelContextHolder(otelContextHolder: OtelContextHolder) =
            otelContextHolder(JsonField.of(otelContextHolder))

        /**
         * Sets [Builder.otelContextHolder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otelContextHolder] with a well-typed [OtelContextHolder]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otelContextHolder(otelContextHolder: JsonField<OtelContextHolder>) = apply {
            this.otelContextHolder = otelContextHolder
        }

        fun unstructuredSources(unstructuredSources: List<UnstructuredSource>) =
            unstructuredSources(JsonField.of(unstructuredSources))

        /**
         * Sets [Builder.unstructuredSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unstructuredSources] with a well-typed
         * `List<UnstructuredSource>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun unstructuredSources(unstructuredSources: JsonField<List<UnstructuredSource>>) = apply {
            this.unstructuredSources = unstructuredSources.map { it.toMutableList() }
        }

        /**
         * Adds a single [UnstructuredSource] to [unstructuredSources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUnstructuredSource(unstructuredSource: UnstructuredSource) = apply {
            unstructuredSources =
                (unstructuredSources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("unstructuredSources", it).add(unstructuredSource)
                }
        }

        fun complianceIds(complianceIds: ComplianceIds) = complianceIds(JsonField.of(complianceIds))

        /**
         * Sets [Builder.complianceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.complianceIds] with a well-typed [ComplianceIds] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun complianceIds(complianceIds: JsonField<ComplianceIds>) = apply {
            this.complianceIds = complianceIds
        }

        fun conversationId(conversationId: String) = conversationId(JsonField.of(conversationId))

        /**
         * Sets [Builder.conversationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.conversationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun conversationId(conversationId: JsonField<String>) = apply {
            this.conversationId = conversationId
        }

        /** The identifier for the feature associated with the context. */
        fun featureId(featureId: String) = featureId(JsonField.of(featureId))

        /**
         * Sets [Builder.featureId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun featureId(featureId: JsonField<String>) = apply { this.featureId = featureId }

        /** The identifier for the inference associated with the context. */
        fun inferenceId(inferenceId: String) = inferenceId(JsonField.of(inferenceId))

        /**
         * Sets [Builder.inferenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inferenceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inferenceId(inferenceId: JsonField<String>) = apply { this.inferenceId = inferenceId }

        /** The identifier for the trajectory, formatted as a UUID. */
        fun trajectoryId(trajectoryId: String) = trajectoryId(JsonField.of(trajectoryId))

        /**
         * Sets [Builder.trajectoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trajectoryId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trajectoryId(trajectoryId: JsonField<String>) = apply {
            this.trajectoryId = trajectoryId
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
         * Returns an immutable instance of [ChirpAiContextObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .applicationGroup()
         * .applicationId()
         * .isPrivate()
         * .metadata()
         * .otelContextHolder()
         * .unstructuredSources()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChirpAiContextObject =
            ChirpAiContextObject(
                checkRequired("applicationGroup", applicationGroup),
                checkRequired("applicationId", applicationId),
                checkRequired("isPrivate", isPrivate),
                checkRequired("metadata", metadata),
                checkRequired("otelContextHolder", otelContextHolder),
                checkRequired("unstructuredSources", unstructuredSources).map { it.toImmutable() },
                complianceIds,
                conversationId,
                featureId,
                inferenceId,
                trajectoryId,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): ChirpAiContextObject = apply {
        if (validated) {
            return@apply
        }

        applicationGroup()
        applicationId()
        isPrivate()
        metadata().validate()
        otelContextHolder().validate()
        unstructuredSources().forEach { it.validate() }
        complianceIds().ifPresent { it.validate() }
        conversationId()
        featureId()
        inferenceId()
        trajectoryId()
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
        (if (applicationGroup.asKnown().isPresent) 1 else 0) +
            (if (applicationId.asKnown().isPresent) 1 else 0) +
            (if (isPrivate.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (otelContextHolder.asKnown().getOrNull()?.validity() ?: 0) +
            (unstructuredSources.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (complianceIds.asKnown().getOrNull()?.validity() ?: 0) +
            (if (conversationId.asKnown().isPresent) 1 else 0) +
            (if (featureId.asKnown().isPresent) 1 else 0) +
            (if (inferenceId.asKnown().isPresent) 1 else 0) +
            (if (trajectoryId.asKnown().isPresent) 1 else 0)

    /** Additional metadata related to the context, represented as key-value pairs. */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Holds OpenTelemetry context information as key-value pairs. */
    class OtelContextHolder
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

            /** Returns a mutable builder for constructing an instance of [OtelContextHolder]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OtelContextHolder]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(otelContextHolder: OtelContextHolder) = apply {
                additionalProperties = otelContextHolder.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OtelContextHolder].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OtelContextHolder = OtelContextHolder(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): OtelContextHolder = apply {
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

            return other is OtelContextHolder && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OtelContextHolder{additionalProperties=$additionalProperties}"
    }

    class UnstructuredSource
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val NONE = of("NONE")

            @JvmField val USER_INPUT = of("USER_INPUT")

            @JvmField val LOGGED_EMAIL = of("LOGGED_EMAIL")

            @JvmField val VIDEO_CALL = of("VIDEO_CALL")

            @JvmField val AUDIO_CALL = of("AUDIO_CALL")

            @JvmField val CALL_TRANSCRIPT = of("CALL_TRANSCRIPT")

            @JvmField val MEETING_TRANSCRIPT = of("MEETING_TRANSCRIPT")

            @JvmField val FORMS = of("FORMS")

            @JvmField val FEEDBACK_SURVEY = of("FEEDBACK_SURVEY")

            @JvmField val PDF = of("PDF")

            @JvmField val QUOTE = of("QUOTE")

            @JvmField val INVOICE = of("INVOICE")

            @JvmField val OTHER_ATTACHMENT_DOC = of("OTHER_ATTACHMENT_DOC")

            @JvmField val WHATSAPP = of("WHATSAPP")

            @JvmField val SMS = of("SMS")

            @JvmField val CHAT = of("CHAT")

            @JvmField val FACEBOOK_MESSENGER = of("FACEBOOK_MESSENGER")

            @JvmField val CUSTOM_CHANNEL_OR_API = of("CUSTOM_CHANNEL_OR_API")

            @JvmField val MANY = of("MANY")

            @JvmField val NOTE = of("NOTE")

            @JvmField val DERIVED = of("DERIVED")

            @JvmStatic fun of(value: String) = UnstructuredSource(JsonField.of(value))
        }

        /** An enum containing [UnstructuredSource]'s known values. */
        enum class Known {
            NONE,
            USER_INPUT,
            LOGGED_EMAIL,
            VIDEO_CALL,
            AUDIO_CALL,
            CALL_TRANSCRIPT,
            MEETING_TRANSCRIPT,
            FORMS,
            FEEDBACK_SURVEY,
            PDF,
            QUOTE,
            INVOICE,
            OTHER_ATTACHMENT_DOC,
            WHATSAPP,
            SMS,
            CHAT,
            FACEBOOK_MESSENGER,
            CUSTOM_CHANNEL_OR_API,
            MANY,
            NOTE,
            DERIVED,
        }

        /**
         * An enum containing [UnstructuredSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [UnstructuredSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NONE,
            USER_INPUT,
            LOGGED_EMAIL,
            VIDEO_CALL,
            AUDIO_CALL,
            CALL_TRANSCRIPT,
            MEETING_TRANSCRIPT,
            FORMS,
            FEEDBACK_SURVEY,
            PDF,
            QUOTE,
            INVOICE,
            OTHER_ATTACHMENT_DOC,
            WHATSAPP,
            SMS,
            CHAT,
            FACEBOOK_MESSENGER,
            CUSTOM_CHANNEL_OR_API,
            MANY,
            NOTE,
            DERIVED,
            /**
             * An enum member indicating that [UnstructuredSource] was instantiated with an unknown
             * value.
             */
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
                NONE -> Value.NONE
                USER_INPUT -> Value.USER_INPUT
                LOGGED_EMAIL -> Value.LOGGED_EMAIL
                VIDEO_CALL -> Value.VIDEO_CALL
                AUDIO_CALL -> Value.AUDIO_CALL
                CALL_TRANSCRIPT -> Value.CALL_TRANSCRIPT
                MEETING_TRANSCRIPT -> Value.MEETING_TRANSCRIPT
                FORMS -> Value.FORMS
                FEEDBACK_SURVEY -> Value.FEEDBACK_SURVEY
                PDF -> Value.PDF
                QUOTE -> Value.QUOTE
                INVOICE -> Value.INVOICE
                OTHER_ATTACHMENT_DOC -> Value.OTHER_ATTACHMENT_DOC
                WHATSAPP -> Value.WHATSAPP
                SMS -> Value.SMS
                CHAT -> Value.CHAT
                FACEBOOK_MESSENGER -> Value.FACEBOOK_MESSENGER
                CUSTOM_CHANNEL_OR_API -> Value.CUSTOM_CHANNEL_OR_API
                MANY -> Value.MANY
                NOTE -> Value.NOTE
                DERIVED -> Value.DERIVED
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
                NONE -> Known.NONE
                USER_INPUT -> Known.USER_INPUT
                LOGGED_EMAIL -> Known.LOGGED_EMAIL
                VIDEO_CALL -> Known.VIDEO_CALL
                AUDIO_CALL -> Known.AUDIO_CALL
                CALL_TRANSCRIPT -> Known.CALL_TRANSCRIPT
                MEETING_TRANSCRIPT -> Known.MEETING_TRANSCRIPT
                FORMS -> Known.FORMS
                FEEDBACK_SURVEY -> Known.FEEDBACK_SURVEY
                PDF -> Known.PDF
                QUOTE -> Known.QUOTE
                INVOICE -> Known.INVOICE
                OTHER_ATTACHMENT_DOC -> Known.OTHER_ATTACHMENT_DOC
                WHATSAPP -> Known.WHATSAPP
                SMS -> Known.SMS
                CHAT -> Known.CHAT
                FACEBOOK_MESSENGER -> Known.FACEBOOK_MESSENGER
                CUSTOM_CHANNEL_OR_API -> Known.CUSTOM_CHANNEL_OR_API
                MANY -> Known.MANY
                NOTE -> Known.NOTE
                DERIVED -> Known.DERIVED
                else -> throw HubSpotInvalidDataException("Unknown UnstructuredSource: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): UnstructuredSource = apply {
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

            return other is UnstructuredSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChirpAiContextObject &&
            applicationGroup == other.applicationGroup &&
            applicationId == other.applicationId &&
            isPrivate == other.isPrivate &&
            metadata == other.metadata &&
            otelContextHolder == other.otelContextHolder &&
            unstructuredSources == other.unstructuredSources &&
            complianceIds == other.complianceIds &&
            conversationId == other.conversationId &&
            featureId == other.featureId &&
            inferenceId == other.inferenceId &&
            trajectoryId == other.trajectoryId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            applicationGroup,
            applicationId,
            isPrivate,
            metadata,
            otelContextHolder,
            unstructuredSources,
            complianceIds,
            conversationId,
            featureId,
            inferenceId,
            trajectoryId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChirpAiContextObject{applicationGroup=$applicationGroup, applicationId=$applicationId, isPrivate=$isPrivate, metadata=$metadata, otelContextHolder=$otelContextHolder, unstructuredSources=$unstructuredSources, complianceIds=$complianceIds, conversationId=$conversationId, featureId=$featureId, inferenceId=$inferenceId, trajectoryId=$trajectoryId, additionalProperties=$additionalProperties}"
}
