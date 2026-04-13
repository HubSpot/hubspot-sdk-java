// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.automation.actions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicActionLabels
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actionName: JsonField<String>,
    private val actionCardContent: JsonField<String>,
    private val actionDescription: JsonField<String>,
    private val appDisplayName: JsonField<String>,
    private val executionRules: JsonField<ExecutionRules>,
    private val inputFieldDescriptions: JsonField<InputFieldDescriptions>,
    private val inputFieldLabels: JsonField<InputFieldLabels>,
    private val inputFieldOptionLabels: JsonField<InputFieldOptionLabels>,
    private val outputFieldLabels: JsonField<OutputFieldLabels>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actionName")
        @ExcludeMissing
        actionName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionCardContent")
        @ExcludeMissing
        actionCardContent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionDescription")
        @ExcludeMissing
        actionDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appDisplayName")
        @ExcludeMissing
        appDisplayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("executionRules")
        @ExcludeMissing
        executionRules: JsonField<ExecutionRules> = JsonMissing.of(),
        @JsonProperty("inputFieldDescriptions")
        @ExcludeMissing
        inputFieldDescriptions: JsonField<InputFieldDescriptions> = JsonMissing.of(),
        @JsonProperty("inputFieldLabels")
        @ExcludeMissing
        inputFieldLabels: JsonField<InputFieldLabels> = JsonMissing.of(),
        @JsonProperty("inputFieldOptionLabels")
        @ExcludeMissing
        inputFieldOptionLabels: JsonField<InputFieldOptionLabels> = JsonMissing.of(),
        @JsonProperty("outputFieldLabels")
        @ExcludeMissing
        outputFieldLabels: JsonField<OutputFieldLabels> = JsonMissing.of(),
    ) : this(
        actionName,
        actionCardContent,
        actionDescription,
        appDisplayName,
        executionRules,
        inputFieldDescriptions,
        inputFieldLabels,
        inputFieldOptionLabels,
        outputFieldLabels,
        mutableMapOf(),
    )

    /**
     * The name of the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actionName(): String = actionName.getRequired("actionName")

    /**
     * Content displayed on the action card.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionCardContent(): Optional<String> = actionCardContent.getOptional("actionCardContent")

    /**
     * A description of what the action does.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionDescription(): Optional<String> = actionDescription.getOptional("actionDescription")

    /**
     * The display name of the application associated with the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appDisplayName(): Optional<String> = appDisplayName.getOptional("appDisplayName")

    /**
     * Rules that govern the execution of the action.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun executionRules(): Optional<ExecutionRules> = executionRules.getOptional("executionRules")

    /**
     * Descriptions for each input field.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputFieldDescriptions(): Optional<InputFieldDescriptions> =
        inputFieldDescriptions.getOptional("inputFieldDescriptions")

    /**
     * Labels for the input fields.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputFieldLabels(): Optional<InputFieldLabels> =
        inputFieldLabels.getOptional("inputFieldLabels")

    /**
     * Labels for the options available in input fields.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputFieldOptionLabels(): Optional<InputFieldOptionLabels> =
        inputFieldOptionLabels.getOptional("inputFieldOptionLabels")

    /**
     * Labels for the output fields.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputFieldLabels(): Optional<OutputFieldLabels> =
        outputFieldLabels.getOptional("outputFieldLabels")

    /**
     * Returns the raw JSON value of [actionName].
     *
     * Unlike [actionName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionName") @ExcludeMissing fun _actionName(): JsonField<String> = actionName

    /**
     * Returns the raw JSON value of [actionCardContent].
     *
     * Unlike [actionCardContent], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actionCardContent")
    @ExcludeMissing
    fun _actionCardContent(): JsonField<String> = actionCardContent

    /**
     * Returns the raw JSON value of [actionDescription].
     *
     * Unlike [actionDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("actionDescription")
    @ExcludeMissing
    fun _actionDescription(): JsonField<String> = actionDescription

    /**
     * Returns the raw JSON value of [appDisplayName].
     *
     * Unlike [appDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appDisplayName")
    @ExcludeMissing
    fun _appDisplayName(): JsonField<String> = appDisplayName

    /**
     * Returns the raw JSON value of [executionRules].
     *
     * Unlike [executionRules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executionRules")
    @ExcludeMissing
    fun _executionRules(): JsonField<ExecutionRules> = executionRules

    /**
     * Returns the raw JSON value of [inputFieldDescriptions].
     *
     * Unlike [inputFieldDescriptions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inputFieldDescriptions")
    @ExcludeMissing
    fun _inputFieldDescriptions(): JsonField<InputFieldDescriptions> = inputFieldDescriptions

    /**
     * Returns the raw JSON value of [inputFieldLabels].
     *
     * Unlike [inputFieldLabels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inputFieldLabels")
    @ExcludeMissing
    fun _inputFieldLabels(): JsonField<InputFieldLabels> = inputFieldLabels

    /**
     * Returns the raw JSON value of [inputFieldOptionLabels].
     *
     * Unlike [inputFieldOptionLabels], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("inputFieldOptionLabels")
    @ExcludeMissing
    fun _inputFieldOptionLabels(): JsonField<InputFieldOptionLabels> = inputFieldOptionLabels

    /**
     * Returns the raw JSON value of [outputFieldLabels].
     *
     * Unlike [outputFieldLabels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("outputFieldLabels")
    @ExcludeMissing
    fun _outputFieldLabels(): JsonField<OutputFieldLabels> = outputFieldLabels

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
         * Returns a mutable builder for constructing an instance of [PublicActionLabels].
         *
         * The following fields are required:
         * ```java
         * .actionName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicActionLabels]. */
    class Builder internal constructor() {

        private var actionName: JsonField<String>? = null
        private var actionCardContent: JsonField<String> = JsonMissing.of()
        private var actionDescription: JsonField<String> = JsonMissing.of()
        private var appDisplayName: JsonField<String> = JsonMissing.of()
        private var executionRules: JsonField<ExecutionRules> = JsonMissing.of()
        private var inputFieldDescriptions: JsonField<InputFieldDescriptions> = JsonMissing.of()
        private var inputFieldLabels: JsonField<InputFieldLabels> = JsonMissing.of()
        private var inputFieldOptionLabels: JsonField<InputFieldOptionLabels> = JsonMissing.of()
        private var outputFieldLabels: JsonField<OutputFieldLabels> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicActionLabels: PublicActionLabels) = apply {
            actionName = publicActionLabels.actionName
            actionCardContent = publicActionLabels.actionCardContent
            actionDescription = publicActionLabels.actionDescription
            appDisplayName = publicActionLabels.appDisplayName
            executionRules = publicActionLabels.executionRules
            inputFieldDescriptions = publicActionLabels.inputFieldDescriptions
            inputFieldLabels = publicActionLabels.inputFieldLabels
            inputFieldOptionLabels = publicActionLabels.inputFieldOptionLabels
            outputFieldLabels = publicActionLabels.outputFieldLabels
            additionalProperties = publicActionLabels.additionalProperties.toMutableMap()
        }

        /** The name of the action. */
        fun actionName(actionName: String) = actionName(JsonField.of(actionName))

        /**
         * Sets [Builder.actionName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actionName(actionName: JsonField<String>) = apply { this.actionName = actionName }

        /** Content displayed on the action card. */
        fun actionCardContent(actionCardContent: String) =
            actionCardContent(JsonField.of(actionCardContent))

        /**
         * Sets [Builder.actionCardContent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionCardContent] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionCardContent(actionCardContent: JsonField<String>) = apply {
            this.actionCardContent = actionCardContent
        }

        /** A description of what the action does. */
        fun actionDescription(actionDescription: String) =
            actionDescription(JsonField.of(actionDescription))

        /**
         * Sets [Builder.actionDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun actionDescription(actionDescription: JsonField<String>) = apply {
            this.actionDescription = actionDescription
        }

        /** The display name of the application associated with the action. */
        fun appDisplayName(appDisplayName: String) = appDisplayName(JsonField.of(appDisplayName))

        /**
         * Sets [Builder.appDisplayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appDisplayName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appDisplayName(appDisplayName: JsonField<String>) = apply {
            this.appDisplayName = appDisplayName
        }

        /** Rules that govern the execution of the action. */
        fun executionRules(executionRules: ExecutionRules) =
            executionRules(JsonField.of(executionRules))

        /**
         * Sets [Builder.executionRules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executionRules] with a well-typed [ExecutionRules] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executionRules(executionRules: JsonField<ExecutionRules>) = apply {
            this.executionRules = executionRules
        }

        /** Descriptions for each input field. */
        fun inputFieldDescriptions(inputFieldDescriptions: InputFieldDescriptions) =
            inputFieldDescriptions(JsonField.of(inputFieldDescriptions))

        /**
         * Sets [Builder.inputFieldDescriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFieldDescriptions] with a well-typed
         * [InputFieldDescriptions] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inputFieldDescriptions(inputFieldDescriptions: JsonField<InputFieldDescriptions>) =
            apply {
                this.inputFieldDescriptions = inputFieldDescriptions
            }

        /** Labels for the input fields. */
        fun inputFieldLabels(inputFieldLabels: InputFieldLabels) =
            inputFieldLabels(JsonField.of(inputFieldLabels))

        /**
         * Sets [Builder.inputFieldLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFieldLabels] with a well-typed [InputFieldLabels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun inputFieldLabels(inputFieldLabels: JsonField<InputFieldLabels>) = apply {
            this.inputFieldLabels = inputFieldLabels
        }

        /** Labels for the options available in input fields. */
        fun inputFieldOptionLabels(inputFieldOptionLabels: InputFieldOptionLabels) =
            inputFieldOptionLabels(JsonField.of(inputFieldOptionLabels))

        /**
         * Sets [Builder.inputFieldOptionLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputFieldOptionLabels] with a well-typed
         * [InputFieldOptionLabels] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inputFieldOptionLabels(inputFieldOptionLabels: JsonField<InputFieldOptionLabels>) =
            apply {
                this.inputFieldOptionLabels = inputFieldOptionLabels
            }

        /** Labels for the output fields. */
        fun outputFieldLabels(outputFieldLabels: OutputFieldLabels) =
            outputFieldLabels(JsonField.of(outputFieldLabels))

        /**
         * Sets [Builder.outputFieldLabels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputFieldLabels] with a well-typed [OutputFieldLabels]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun outputFieldLabels(outputFieldLabels: JsonField<OutputFieldLabels>) = apply {
            this.outputFieldLabels = outputFieldLabels
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
         * Returns an immutable instance of [PublicActionLabels].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .actionName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicActionLabels =
            PublicActionLabels(
                checkRequired("actionName", actionName),
                actionCardContent,
                actionDescription,
                appDisplayName,
                executionRules,
                inputFieldDescriptions,
                inputFieldLabels,
                inputFieldOptionLabels,
                outputFieldLabels,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicActionLabels = apply {
        if (validated) {
            return@apply
        }

        actionName()
        actionCardContent()
        actionDescription()
        appDisplayName()
        executionRules().ifPresent { it.validate() }
        inputFieldDescriptions().ifPresent { it.validate() }
        inputFieldLabels().ifPresent { it.validate() }
        inputFieldOptionLabels().ifPresent { it.validate() }
        outputFieldLabels().ifPresent { it.validate() }
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
        (if (actionName.asKnown().isPresent) 1 else 0) +
            (if (actionCardContent.asKnown().isPresent) 1 else 0) +
            (if (actionDescription.asKnown().isPresent) 1 else 0) +
            (if (appDisplayName.asKnown().isPresent) 1 else 0) +
            (executionRules.asKnown().getOrNull()?.validity() ?: 0) +
            (inputFieldDescriptions.asKnown().getOrNull()?.validity() ?: 0) +
            (inputFieldLabels.asKnown().getOrNull()?.validity() ?: 0) +
            (inputFieldOptionLabels.asKnown().getOrNull()?.validity() ?: 0) +
            (outputFieldLabels.asKnown().getOrNull()?.validity() ?: 0)

    /** Rules that govern the execution of the action. */
    class ExecutionRules
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

            /** Returns a mutable builder for constructing an instance of [ExecutionRules]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExecutionRules]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(executionRules: ExecutionRules) = apply {
                additionalProperties = executionRules.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExecutionRules].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExecutionRules = ExecutionRules(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ExecutionRules = apply {
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

            return other is ExecutionRules && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExecutionRules{additionalProperties=$additionalProperties}"
    }

    /** Descriptions for each input field. */
    class InputFieldDescriptions
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

            /**
             * Returns a mutable builder for constructing an instance of [InputFieldDescriptions].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputFieldDescriptions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputFieldDescriptions: InputFieldDescriptions) = apply {
                additionalProperties = inputFieldDescriptions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InputFieldDescriptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputFieldDescriptions =
                InputFieldDescriptions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): InputFieldDescriptions = apply {
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

            return other is InputFieldDescriptions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InputFieldDescriptions{additionalProperties=$additionalProperties}"
    }

    /** Labels for the input fields. */
    class InputFieldLabels
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

            /** Returns a mutable builder for constructing an instance of [InputFieldLabels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputFieldLabels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputFieldLabels: InputFieldLabels) = apply {
                additionalProperties = inputFieldLabels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InputFieldLabels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputFieldLabels = InputFieldLabels(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): InputFieldLabels = apply {
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

            return other is InputFieldLabels && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "InputFieldLabels{additionalProperties=$additionalProperties}"
    }

    /** Labels for the options available in input fields. */
    class InputFieldOptionLabels
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

            /**
             * Returns a mutable builder for constructing an instance of [InputFieldOptionLabels].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputFieldOptionLabels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputFieldOptionLabels: InputFieldOptionLabels) = apply {
                additionalProperties = inputFieldOptionLabels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InputFieldOptionLabels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputFieldOptionLabels =
                InputFieldOptionLabels(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): InputFieldOptionLabels = apply {
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

            return other is InputFieldOptionLabels &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InputFieldOptionLabels{additionalProperties=$additionalProperties}"
    }

    /** Labels for the output fields. */
    class OutputFieldLabels
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

            /** Returns a mutable builder for constructing an instance of [OutputFieldLabels]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputFieldLabels]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputFieldLabels: OutputFieldLabels) = apply {
                additionalProperties = outputFieldLabels.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OutputFieldLabels].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputFieldLabels = OutputFieldLabels(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): OutputFieldLabels = apply {
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

            return other is OutputFieldLabels && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OutputFieldLabels{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicActionLabels &&
            actionName == other.actionName &&
            actionCardContent == other.actionCardContent &&
            actionDescription == other.actionDescription &&
            appDisplayName == other.appDisplayName &&
            executionRules == other.executionRules &&
            inputFieldDescriptions == other.inputFieldDescriptions &&
            inputFieldLabels == other.inputFieldLabels &&
            inputFieldOptionLabels == other.inputFieldOptionLabels &&
            outputFieldLabels == other.outputFieldLabels &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actionName,
            actionCardContent,
            actionDescription,
            appDisplayName,
            executionRules,
            inputFieldDescriptions,
            inputFieldLabels,
            inputFieldOptionLabels,
            outputFieldLabels,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicActionLabels{actionName=$actionName, actionCardContent=$actionCardContent, actionDescription=$actionDescription, appDisplayName=$appDisplayName, executionRules=$executionRules, inputFieldDescriptions=$inputFieldDescriptions, inputFieldLabels=$inputFieldLabels, inputFieldOptionLabels=$inputFieldOptionLabels, outputFieldLabels=$outputFieldLabels, additionalProperties=$additionalProperties}"
}
