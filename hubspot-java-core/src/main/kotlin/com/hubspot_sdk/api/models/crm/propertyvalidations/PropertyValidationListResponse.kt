// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.propertyvalidations

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
import kotlin.jvm.optionals.getOrNull

class PropertyValidationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val results: JsonField<List<Result>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("results") @ExcludeMissing results: JsonField<List<Result>> = JsonMissing.of()
    ) : this(results, mutableMapOf())

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<Result> = results.getRequired("results")

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<Result>> = results

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
         * [PropertyValidationListResponse].
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PropertyValidationListResponse]. */
    class Builder internal constructor() {

        private var results: JsonField<MutableList<Result>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(propertyValidationListResponse: PropertyValidationListResponse) = apply {
            results = propertyValidationListResponse.results.map { it.toMutableList() }
            additionalProperties =
                propertyValidationListResponse.additionalProperties.toMutableMap()
        }

        fun results(results: List<Result>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<Result>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun results(results: JsonField<List<Result>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [Result] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: Result) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [PropertyValidationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .results()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PropertyValidationListResponse =
            PropertyValidationListResponse(
                checkRequired("results", results).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PropertyValidationListResponse = apply {
        if (validated) {
            return@apply
        }

        results().forEach { it.validate() }
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
        (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class Result
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val propertyName: JsonField<String>,
        private val propertyValidationRules: JsonField<List<PropertyValidationRule>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("propertyName")
            @ExcludeMissing
            propertyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("propertyValidationRules")
            @ExcludeMissing
            propertyValidationRules: JsonField<List<PropertyValidationRule>> = JsonMissing.of(),
        ) : this(propertyName, propertyValidationRules, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun propertyName(): String = propertyName.getRequired("propertyName")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun propertyValidationRules(): List<PropertyValidationRule> =
            propertyValidationRules.getRequired("propertyValidationRules")

        /**
         * Returns the raw JSON value of [propertyName].
         *
         * Unlike [propertyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("propertyName")
        @ExcludeMissing
        fun _propertyName(): JsonField<String> = propertyName

        /**
         * Returns the raw JSON value of [propertyValidationRules].
         *
         * Unlike [propertyValidationRules], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("propertyValidationRules")
        @ExcludeMissing
        fun _propertyValidationRules(): JsonField<List<PropertyValidationRule>> =
            propertyValidationRules

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
             * Returns a mutable builder for constructing an instance of [Result].
             *
             * The following fields are required:
             * ```java
             * .propertyName()
             * .propertyValidationRules()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Result]. */
        class Builder internal constructor() {

            private var propertyName: JsonField<String>? = null
            private var propertyValidationRules: JsonField<MutableList<PropertyValidationRule>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(result: Result) = apply {
                propertyName = result.propertyName
                propertyValidationRules = result.propertyValidationRules.map { it.toMutableList() }
                additionalProperties = result.additionalProperties.toMutableMap()
            }

            fun propertyName(propertyName: String) = propertyName(JsonField.of(propertyName))

            /**
             * Sets [Builder.propertyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propertyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun propertyName(propertyName: JsonField<String>) = apply {
                this.propertyName = propertyName
            }

            fun propertyValidationRules(propertyValidationRules: List<PropertyValidationRule>) =
                propertyValidationRules(JsonField.of(propertyValidationRules))

            /**
             * Sets [Builder.propertyValidationRules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propertyValidationRules] with a well-typed
             * `List<PropertyValidationRule>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun propertyValidationRules(
                propertyValidationRules: JsonField<List<PropertyValidationRule>>
            ) = apply {
                this.propertyValidationRules = propertyValidationRules.map { it.toMutableList() }
            }

            /**
             * Adds a single [PropertyValidationRule] to [propertyValidationRules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPropertyValidationRule(propertyValidationRule: PropertyValidationRule) = apply {
                propertyValidationRules =
                    (propertyValidationRules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("propertyValidationRules", it).add(propertyValidationRule)
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
             * Returns an immutable instance of [Result].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .propertyName()
             * .propertyValidationRules()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Result =
                Result(
                    checkRequired("propertyName", propertyName),
                    checkRequired("propertyValidationRules", propertyValidationRules).map {
                        it.toImmutable()
                    },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Result = apply {
            if (validated) {
                return@apply
            }

            propertyName()
            propertyValidationRules().forEach { it.validate() }
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
            (if (propertyName.asKnown().isPresent) 1 else 0) +
                (propertyValidationRules.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0)

        class PropertyValidationRule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ruleArguments: JsonField<List<String>>,
            private val ruleType: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ruleArguments")
                @ExcludeMissing
                ruleArguments: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("ruleType")
                @ExcludeMissing
                ruleType: JsonField<String> = JsonMissing.of(),
            ) : this(ruleArguments, ruleType, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ruleArguments(): List<String> = ruleArguments.getRequired("ruleArguments")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ruleType(): String = ruleType.getRequired("ruleType")

            /**
             * Returns the raw JSON value of [ruleArguments].
             *
             * Unlike [ruleArguments], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ruleArguments")
            @ExcludeMissing
            fun _ruleArguments(): JsonField<List<String>> = ruleArguments

            /**
             * Returns the raw JSON value of [ruleType].
             *
             * Unlike [ruleType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ruleType") @ExcludeMissing fun _ruleType(): JsonField<String> = ruleType

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
                 * [PropertyValidationRule].
                 *
                 * The following fields are required:
                 * ```java
                 * .ruleArguments()
                 * .ruleType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PropertyValidationRule]. */
            class Builder internal constructor() {

                private var ruleArguments: JsonField<MutableList<String>>? = null
                private var ruleType: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(propertyValidationRule: PropertyValidationRule) = apply {
                    ruleArguments = propertyValidationRule.ruleArguments.map { it.toMutableList() }
                    ruleType = propertyValidationRule.ruleType
                    additionalProperties =
                        propertyValidationRule.additionalProperties.toMutableMap()
                }

                fun ruleArguments(ruleArguments: List<String>) =
                    ruleArguments(JsonField.of(ruleArguments))

                /**
                 * Sets [Builder.ruleArguments] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ruleArguments] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ruleArguments(ruleArguments: JsonField<List<String>>) = apply {
                    this.ruleArguments = ruleArguments.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [ruleArguments].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRuleArgument(ruleArgument: String) = apply {
                    ruleArguments =
                        (ruleArguments ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ruleArguments", it).add(ruleArgument)
                        }
                }

                fun ruleType(ruleType: String) = ruleType(JsonField.of(ruleType))

                /**
                 * Sets [Builder.ruleType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ruleType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ruleType(ruleType: JsonField<String>) = apply { this.ruleType = ruleType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PropertyValidationRule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .ruleArguments()
                 * .ruleType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PropertyValidationRule =
                    PropertyValidationRule(
                        checkRequired("ruleArguments", ruleArguments).map { it.toImmutable() },
                        checkRequired("ruleType", ruleType),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PropertyValidationRule = apply {
                if (validated) {
                    return@apply
                }

                ruleArguments()
                ruleType()
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
                (ruleArguments.asKnown().getOrNull()?.size ?: 0) +
                    (if (ruleType.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PropertyValidationRule &&
                    ruleArguments == other.ruleArguments &&
                    ruleType == other.ruleType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(ruleArguments, ruleType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PropertyValidationRule{ruleArguments=$ruleArguments, ruleType=$ruleType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result &&
                propertyName == other.propertyName &&
                propertyValidationRules == other.propertyValidationRules &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(propertyName, propertyValidationRules, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Result{propertyName=$propertyName, propertyValidationRules=$propertyValidationRules, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PropertyValidationListResponse &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(results, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PropertyValidationListResponse{results=$results, additionalProperties=$additionalProperties}"
}
