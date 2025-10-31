// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.timeline

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** State of the token definition for update requests. */
class TimelineEventTemplateTokenUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val label: JsonField<String>,
    private val objectPropertyName: JsonField<String>,
    private val options: JsonField<List<TimelineEventTemplateTokenOption>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectPropertyName")
        @ExcludeMissing
        objectPropertyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        options: JsonField<List<TimelineEventTemplateTokenOption>> = JsonMissing.of(),
    ) : this(label, objectPropertyName, options, mutableMapOf())

    /**
     * Used for list segmentation and reporting.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun label(): String = label.getRequired("label")

    /**
     * The name of the CRM object property. This will populate the CRM object property associated
     * with the event. With enough of these, you can fully build CRM objects via the Timeline API.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectPropertyName(): Optional<String> =
        objectPropertyName.getOptional("objectPropertyName")

    /**
     * If type is `enumeration`, we should have a list of options to choose from.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<List<TimelineEventTemplateTokenOption>> = options.getOptional("options")

    /**
     * Returns the raw JSON value of [label].
     *
     * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

    /**
     * Returns the raw JSON value of [objectPropertyName].
     *
     * Unlike [objectPropertyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectPropertyName")
    @ExcludeMissing
    fun _objectPropertyName(): JsonField<String> = objectPropertyName

    /**
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("options")
    @ExcludeMissing
    fun _options(): JsonField<List<TimelineEventTemplateTokenOption>> = options

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
         * [TimelineEventTemplateTokenUpdateRequest].
         *
         * The following fields are required:
         * ```java
         * .label()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TimelineEventTemplateTokenUpdateRequest]. */
    class Builder internal constructor() {

        private var label: JsonField<String>? = null
        private var objectPropertyName: JsonField<String> = JsonMissing.of()
        private var options: JsonField<MutableList<TimelineEventTemplateTokenOption>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            timelineEventTemplateTokenUpdateRequest: TimelineEventTemplateTokenUpdateRequest
        ) = apply {
            label = timelineEventTemplateTokenUpdateRequest.label
            objectPropertyName = timelineEventTemplateTokenUpdateRequest.objectPropertyName
            options = timelineEventTemplateTokenUpdateRequest.options.map { it.toMutableList() }
            additionalProperties =
                timelineEventTemplateTokenUpdateRequest.additionalProperties.toMutableMap()
        }

        /** Used for list segmentation and reporting. */
        fun label(label: String) = label(JsonField.of(label))

        /**
         * Sets [Builder.label] to an arbitrary JSON value.
         *
         * You should usually call [Builder.label] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun label(label: JsonField<String>) = apply { this.label = label }

        /**
         * The name of the CRM object property. This will populate the CRM object property
         * associated with the event. With enough of these, you can fully build CRM objects via the
         * Timeline API.
         */
        fun objectPropertyName(objectPropertyName: String) =
            objectPropertyName(JsonField.of(objectPropertyName))

        /**
         * Sets [Builder.objectPropertyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectPropertyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectPropertyName(objectPropertyName: JsonField<String>) = apply {
            this.objectPropertyName = objectPropertyName
        }

        /** If type is `enumeration`, we should have a list of options to choose from. */
        fun options(options: List<TimelineEventTemplateTokenOption>) =
            options(JsonField.of(options))

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed
         * `List<TimelineEventTemplateTokenOption>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<List<TimelineEventTemplateTokenOption>>) = apply {
            this.options = options.map { it.toMutableList() }
        }

        /**
         * Adds a single [TimelineEventTemplateTokenOption] to [options].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOption(option: TimelineEventTemplateTokenOption) = apply {
            options =
                (options ?: JsonField.of(mutableListOf())).also {
                    checkKnown("options", it).add(option)
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
         * Returns an immutable instance of [TimelineEventTemplateTokenUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .label()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TimelineEventTemplateTokenUpdateRequest =
            TimelineEventTemplateTokenUpdateRequest(
                checkRequired("label", label),
                objectPropertyName,
                (options ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TimelineEventTemplateTokenUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        label()
        objectPropertyName()
        options().ifPresent { it.forEach { it.validate() } }
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
        (if (label.asKnown().isPresent) 1 else 0) +
            (if (objectPropertyName.asKnown().isPresent) 1 else 0) +
            (options.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TimelineEventTemplateTokenUpdateRequest &&
            label == other.label &&
            objectPropertyName == other.objectPropertyName &&
            options == other.options &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(label, objectPropertyName, options, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TimelineEventTemplateTokenUpdateRequest{label=$label, objectPropertyName=$objectPropertyName, options=$options, additionalProperties=$additionalProperties}"
}
