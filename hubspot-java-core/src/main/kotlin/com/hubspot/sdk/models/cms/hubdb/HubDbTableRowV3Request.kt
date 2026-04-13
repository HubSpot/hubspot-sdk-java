// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HubDbTableRowV3Request
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val childTableId: JsonField<Long>,
    private val displayIndex: JsonField<Int>,
    private val values: JsonField<Values>,
    private val name: JsonField<String>,
    private val path: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("childTableId")
        @ExcludeMissing
        childTableId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("displayIndex")
        @ExcludeMissing
        displayIndex: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<Values> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
    ) : this(childTableId, displayIndex, values, name, path, mutableMapOf())

    /**
     * Specifies the value for the column child table id
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun childTableId(): Long = childTableId.getRequired("childTableId")

    /**
     * The index position for displaying the row within the table.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayIndex(): Int = displayIndex.getRequired("displayIndex")

    /**
     * List of key value pairs with the column name and column value
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun values(): Values = values.getRequired("values")

    /**
     * Specifies the value for `hs_name` column, which will be used as title in the dynamic pages
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Specifies the value for `hs_path` column, which will be used as slug in the dynamic pages
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * Returns the raw JSON value of [childTableId].
     *
     * Unlike [childTableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("childTableId")
    @ExcludeMissing
    fun _childTableId(): JsonField<Long> = childTableId

    /**
     * Returns the raw JSON value of [displayIndex].
     *
     * Unlike [displayIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayIndex") @ExcludeMissing fun _displayIndex(): JsonField<Int> = displayIndex

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<Values> = values

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

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
         * Returns a mutable builder for constructing an instance of [HubDbTableRowV3Request].
         *
         * The following fields are required:
         * ```java
         * .childTableId()
         * .displayIndex()
         * .values()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubDbTableRowV3Request]. */
    class Builder internal constructor() {

        private var childTableId: JsonField<Long>? = null
        private var displayIndex: JsonField<Int>? = null
        private var values: JsonField<Values>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubDbTableRowV3Request: HubDbTableRowV3Request) = apply {
            childTableId = hubDbTableRowV3Request.childTableId
            displayIndex = hubDbTableRowV3Request.displayIndex
            values = hubDbTableRowV3Request.values
            name = hubDbTableRowV3Request.name
            path = hubDbTableRowV3Request.path
            additionalProperties = hubDbTableRowV3Request.additionalProperties.toMutableMap()
        }

        /** Specifies the value for the column child table id */
        fun childTableId(childTableId: Long) = childTableId(JsonField.of(childTableId))

        /**
         * Sets [Builder.childTableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childTableId] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun childTableId(childTableId: JsonField<Long>) = apply { this.childTableId = childTableId }

        /** The index position for displaying the row within the table. */
        fun displayIndex(displayIndex: Int) = displayIndex(JsonField.of(displayIndex))

        /**
         * Sets [Builder.displayIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayIndex] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayIndex(displayIndex: JsonField<Int>) = apply { this.displayIndex = displayIndex }

        /** List of key value pairs with the column name and column value */
        fun values(values: Values) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed [Values] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun values(values: JsonField<Values>) = apply { this.values = values }

        /**
         * Specifies the value for `hs_name` column, which will be used as title in the dynamic
         * pages
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Specifies the value for `hs_path` column, which will be used as slug in the dynamic pages
         */
        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

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
         * Returns an immutable instance of [HubDbTableRowV3Request].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .childTableId()
         * .displayIndex()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HubDbTableRowV3Request =
            HubDbTableRowV3Request(
                checkRequired("childTableId", childTableId),
                checkRequired("displayIndex", displayIndex),
                checkRequired("values", values),
                name,
                path,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubDbTableRowV3Request = apply {
        if (validated) {
            return@apply
        }

        childTableId()
        displayIndex()
        values().validate()
        name()
        path()
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
        (if (childTableId.asKnown().isPresent) 1 else 0) +
            (if (displayIndex.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0)

    /** List of key value pairs with the column name and column value */
    class Values
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

            /** Returns a mutable builder for constructing an instance of [Values]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Values]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(values: Values) = apply {
                additionalProperties = values.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Values].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Values = Values(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Values = apply {
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

            return other is Values && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Values{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HubDbTableRowV3Request &&
            childTableId == other.childTableId &&
            displayIndex == other.displayIndex &&
            values == other.values &&
            name == other.name &&
            path == other.path &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(childTableId, displayIndex, values, name, path, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubDbTableRowV3Request{childTableId=$childTableId, displayIndex=$displayIndex, values=$values, name=$name, path=$path, additionalProperties=$additionalProperties}"
}
