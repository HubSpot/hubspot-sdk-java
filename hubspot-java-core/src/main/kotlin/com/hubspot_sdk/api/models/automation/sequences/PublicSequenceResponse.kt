// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicSequenceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dependencies: JsonField<List<PublicSequenceStepDependencyResponse>>,
    private val name: JsonField<String>,
    private val steps: JsonField<List<PublicSequenceStepResponse>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val userId: JsonField<String>,
    private val folderId: JsonField<String>,
    private val settings: JsonField<PublicSequenceSettingsResponse>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dependencies")
        @ExcludeMissing
        dependencies: JsonField<List<PublicSequenceStepDependencyResponse>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("steps")
        @ExcludeMissing
        steps: JsonField<List<PublicSequenceStepResponse>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folderId") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<PublicSequenceSettingsResponse> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        dependencies,
        name,
        steps,
        updatedAt,
        userId,
        folderId,
        settings,
        mutableMapOf(),
    )

    /**
     * The unique identifier for the sequence.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The date and time when the sequence was created.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * An array of dependencies for the sequence steps, each represented as a
     * PublicSequenceStepDependencyResponse object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependencies(): List<PublicSequenceStepDependencyResponse> =
        dependencies.getRequired("dependencies")

    /**
     * The name of the sequence.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * An array of steps included in the sequence, each represented by a PublicSequenceStepResponse
     * object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun steps(): List<PublicSequenceStepResponse> = steps.getRequired("steps")

    /**
     * The date and time when the sequence was last updated.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The ID of the user associated with the sequence.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("userId")

    /**
     * The identifier of the folder containing the sequence.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = folderId.getOptional("folderId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<PublicSequenceSettingsResponse> = settings.getOptional("settings")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dependencies].
     *
     * Unlike [dependencies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependencies")
    @ExcludeMissing
    fun _dependencies(): JsonField<List<PublicSequenceStepDependencyResponse>> = dependencies

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [steps].
     *
     * Unlike [steps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("steps")
    @ExcludeMissing
    fun _steps(): JsonField<List<PublicSequenceStepResponse>> = steps

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folderId") @ExcludeMissing fun _folderId(): JsonField<String> = folderId

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings")
    @ExcludeMissing
    fun _settings(): JsonField<PublicSequenceSettingsResponse> = settings

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
         * Returns a mutable builder for constructing an instance of [PublicSequenceResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .dependencies()
         * .name()
         * .steps()
         * .updatedAt()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicSequenceResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var dependencies: JsonField<MutableList<PublicSequenceStepDependencyResponse>>? =
            null
        private var name: JsonField<String>? = null
        private var steps: JsonField<MutableList<PublicSequenceStepResponse>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var userId: JsonField<String>? = null
        private var folderId: JsonField<String> = JsonMissing.of()
        private var settings: JsonField<PublicSequenceSettingsResponse> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicSequenceResponse: PublicSequenceResponse) = apply {
            id = publicSequenceResponse.id
            createdAt = publicSequenceResponse.createdAt
            dependencies = publicSequenceResponse.dependencies.map { it.toMutableList() }
            name = publicSequenceResponse.name
            steps = publicSequenceResponse.steps.map { it.toMutableList() }
            updatedAt = publicSequenceResponse.updatedAt
            userId = publicSequenceResponse.userId
            folderId = publicSequenceResponse.folderId
            settings = publicSequenceResponse.settings
            additionalProperties = publicSequenceResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier for the sequence. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date and time when the sequence was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * An array of dependencies for the sequence steps, each represented as a
         * PublicSequenceStepDependencyResponse object.
         */
        fun dependencies(dependencies: List<PublicSequenceStepDependencyResponse>) =
            dependencies(JsonField.of(dependencies))

        /**
         * Sets [Builder.dependencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependencies] with a well-typed
         * `List<PublicSequenceStepDependencyResponse>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun dependencies(dependencies: JsonField<List<PublicSequenceStepDependencyResponse>>) =
            apply {
                this.dependencies = dependencies.map { it.toMutableList() }
            }

        /**
         * Adds a single [PublicSequenceStepDependencyResponse] to [dependencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDependency(dependency: PublicSequenceStepDependencyResponse) = apply {
            dependencies =
                (dependencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dependencies", it).add(dependency)
                }
        }

        /** The name of the sequence. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * An array of steps included in the sequence, each represented by a
         * PublicSequenceStepResponse object.
         */
        fun steps(steps: List<PublicSequenceStepResponse>) = steps(JsonField.of(steps))

        /**
         * Sets [Builder.steps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.steps] with a well-typed
         * `List<PublicSequenceStepResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun steps(steps: JsonField<List<PublicSequenceStepResponse>>) = apply {
            this.steps = steps.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicSequenceStepResponse] to [steps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStep(step: PublicSequenceStepResponse) = apply {
            steps =
                (steps ?: JsonField.of(mutableListOf())).also { checkKnown("steps", it).add(step) }
        }

        /** The date and time when the sequence was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the user associated with the sequence. */
        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        /** The identifier of the folder containing the sequence. */
        fun folderId(folderId: String) = folderId(JsonField.of(folderId))

        /**
         * Sets [Builder.folderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderId(folderId: JsonField<String>) = apply { this.folderId = folderId }

        fun settings(settings: PublicSequenceSettingsResponse) = settings(JsonField.of(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed
         * [PublicSequenceSettingsResponse] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun settings(settings: JsonField<PublicSequenceSettingsResponse>) = apply {
            this.settings = settings
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
         * Returns an immutable instance of [PublicSequenceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .dependencies()
         * .name()
         * .steps()
         * .updatedAt()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicSequenceResponse =
            PublicSequenceResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("dependencies", dependencies).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("steps", steps).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
                checkRequired("userId", userId),
                folderId,
                settings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicSequenceResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        dependencies().forEach { it.validate() }
        name()
        steps().forEach { it.validate() }
        updatedAt()
        userId()
        folderId()
        settings().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dependencies.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (steps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (if (folderId.asKnown().isPresent) 1 else 0) +
            (settings.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicSequenceResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            dependencies == other.dependencies &&
            name == other.name &&
            steps == other.steps &&
            updatedAt == other.updatedAt &&
            userId == other.userId &&
            folderId == other.folderId &&
            settings == other.settings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            dependencies,
            name,
            steps,
            updatedAt,
            userId,
            folderId,
            settings,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicSequenceResponse{id=$id, createdAt=$createdAt, dependencies=$dependencies, name=$name, steps=$steps, updatedAt=$updatedAt, userId=$userId, folderId=$folderId, settings=$settings, additionalProperties=$additionalProperties}"
}
