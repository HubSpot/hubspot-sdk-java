// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.dealsplits

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.Params
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.http.Headers
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Create or replace deal splits for deals with the provided IDs. Deal split percentages for each
 * deal must sum up to 1.0 (100%) and may have up to 8 decimal places
 */
class DealSplitBatchUpsertParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputs(): List<Input> = body.inputs()

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inputs(): JsonField<List<Input>> = body._inputs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DealSplitBatchUpsertParams].
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DealSplitBatchUpsertParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dealSplitBatchUpsertParams: DealSplitBatchUpsertParams) = apply {
            body = dealSplitBatchUpsertParams.body.toBuilder()
            additionalHeaders = dealSplitBatchUpsertParams.additionalHeaders.toBuilder()
            additionalQueryParams = dealSplitBatchUpsertParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [inputs]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun inputs(inputs: List<Input>) = apply { body.inputs(inputs) }

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed `List<Input>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inputs(inputs: JsonField<List<Input>>) = apply { body.inputs(inputs) }

        /**
         * Adds a single [Input] to [inputs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInput(input: Input) = apply { body.addInput(input) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DealSplitBatchUpsertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .inputs()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DealSplitBatchUpsertParams =
            DealSplitBatchUpsertParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val inputs: JsonField<List<Input>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("inputs")
            @ExcludeMissing
            inputs: JsonField<List<Input>> = JsonMissing.of()
        ) : this(inputs, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputs(): List<Input> = inputs.getRequired("inputs")

        /**
         * Returns the raw JSON value of [inputs].
         *
         * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<List<Input>> = inputs

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .inputs()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var inputs: JsonField<MutableList<Input>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                inputs = body.inputs.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun inputs(inputs: List<Input>) = inputs(JsonField.of(inputs))

            /**
             * Sets [Builder.inputs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputs] with a well-typed `List<Input>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputs(inputs: JsonField<List<Input>>) = apply {
                this.inputs = inputs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Input] to [inputs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInput(input: Input) = apply {
                inputs =
                    (inputs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("inputs", it).add(input)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .inputs()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("inputs", inputs).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            inputs().forEach { it.validate() }
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
            (inputs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                inputs == other.inputs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(inputs, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{inputs=$inputs, additionalProperties=$additionalProperties}"
    }

    class Input
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<Int>,
        private val splits: JsonField<List<Split>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("splits")
            @ExcludeMissing
            splits: JsonField<List<Split>> = JsonMissing.of(),
        ) : this(id, splits, mutableMapOf())

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Int = id.getRequired("id")

        /**
         * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun splits(): List<Split> = splits.getRequired("splits")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Int> = id

        /**
         * Returns the raw JSON value of [splits].
         *
         * Unlike [splits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("splits") @ExcludeMissing fun _splits(): JsonField<List<Split>> = splits

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
             * Returns a mutable builder for constructing an instance of [Input].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .splits()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Input]. */
        class Builder internal constructor() {

            private var id: JsonField<Int>? = null
            private var splits: JsonField<MutableList<Split>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(input: Input) = apply {
                id = input.id
                splits = input.splits.map { it.toMutableList() }
                additionalProperties = input.additionalProperties.toMutableMap()
            }

            fun id(id: Int) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Int>) = apply { this.id = id }

            fun splits(splits: List<Split>) = splits(JsonField.of(splits))

            /**
             * Sets [Builder.splits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.splits] with a well-typed `List<Split>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun splits(splits: JsonField<List<Split>>) = apply {
                this.splits = splits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Split] to [splits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSplit(split: Split) = apply {
                splits =
                    (splits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("splits", it).add(split)
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
             * Returns an immutable instance of [Input].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .splits()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Input =
                Input(
                    checkRequired("id", id),
                    checkRequired("splits", splits).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Input = apply {
            if (validated) {
                return@apply
            }

            id()
            splits().forEach { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (splits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class Split
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val ownerId: JsonField<Int>,
            private val percentage: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("ownerId") @ExcludeMissing ownerId: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("percentage")
                @ExcludeMissing
                percentage: JsonField<Double> = JsonMissing.of(),
            ) : this(ownerId, percentage, mutableMapOf())

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownerId(): Int = ownerId.getRequired("ownerId")

            /**
             * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun percentage(): Double = percentage.getRequired("percentage")

            /**
             * Returns the raw JSON value of [ownerId].
             *
             * Unlike [ownerId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ownerId") @ExcludeMissing fun _ownerId(): JsonField<Int> = ownerId

            /**
             * Returns the raw JSON value of [percentage].
             *
             * Unlike [percentage], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("percentage")
            @ExcludeMissing
            fun _percentage(): JsonField<Double> = percentage

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
                 * Returns a mutable builder for constructing an instance of [Split].
                 *
                 * The following fields are required:
                 * ```java
                 * .ownerId()
                 * .percentage()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Split]. */
            class Builder internal constructor() {

                private var ownerId: JsonField<Int>? = null
                private var percentage: JsonField<Double>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(split: Split) = apply {
                    ownerId = split.ownerId
                    percentage = split.percentage
                    additionalProperties = split.additionalProperties.toMutableMap()
                }

                fun ownerId(ownerId: Int) = ownerId(JsonField.of(ownerId))

                /**
                 * Sets [Builder.ownerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownerId] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ownerId(ownerId: JsonField<Int>) = apply { this.ownerId = ownerId }

                fun percentage(percentage: Double) = percentage(JsonField.of(percentage))

                /**
                 * Sets [Builder.percentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentage] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun percentage(percentage: JsonField<Double>) = apply {
                    this.percentage = percentage
                }

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
                 * Returns an immutable instance of [Split].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .ownerId()
                 * .percentage()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Split =
                    Split(
                        checkRequired("ownerId", ownerId),
                        checkRequired("percentage", percentage),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Split = apply {
                if (validated) {
                    return@apply
                }

                ownerId()
                percentage()
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
                (if (ownerId.asKnown().isPresent) 1 else 0) +
                    (if (percentage.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Split &&
                    ownerId == other.ownerId &&
                    percentage == other.percentage &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(ownerId, percentage, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Split{ownerId=$ownerId, percentage=$percentage, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Input &&
                id == other.id &&
                splits == other.splits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(id, splits, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Input{id=$id, splits=$splits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DealSplitBatchUpsertParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DealSplitBatchUpsertParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
