// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class HubDbTableRowV3
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val childTableId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val path: JsonField<String>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val values: JsonField<Values>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("childTableId")
        @ExcludeMissing
        childTableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("publishedAt")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<Values> = JsonMissing.of(),
    ) : this(
        id,
        childTableId,
        createdAt,
        name,
        path,
        publishedAt,
        updatedAt,
        values,
        mutableMapOf(),
    )

    /**
     * The id of the table row
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Specifies the value for the column child table id
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun childTableId(): String = childTableId.getRequired("childTableId")

    /**
     * Timestamp at which the row is created
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Specifies the value for `hs_name` column, which will be used as title in the dynamic pages
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Specifies the value for `hs_path` column, which will be used as slug in the dynamic pages
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): String = path.getRequired("path")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publishedAt(): OffsetDateTime = publishedAt.getRequired("publishedAt")

    /**
     * Timestamp at which the row is updated last time
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * List of key value pairs with the column name and column value
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun values(): Values = values.getRequired("values")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [childTableId].
     *
     * Unlike [childTableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("childTableId")
    @ExcludeMissing
    fun _childTableId(): JsonField<String> = childTableId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("publishedAt")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<Values> = values

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
         * Returns a mutable builder for constructing an instance of [HubDbTableRowV3].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .childTableId()
         * .createdAt()
         * .name()
         * .path()
         * .publishedAt()
         * .updatedAt()
         * .values()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubDbTableRowV3]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var childTableId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var path: JsonField<String>? = null
        private var publishedAt: JsonField<OffsetDateTime>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var values: JsonField<Values>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubDbTableRowV3: HubDbTableRowV3) = apply {
            id = hubDbTableRowV3.id
            childTableId = hubDbTableRowV3.childTableId
            createdAt = hubDbTableRowV3.createdAt
            name = hubDbTableRowV3.name
            path = hubDbTableRowV3.path
            publishedAt = hubDbTableRowV3.publishedAt
            updatedAt = hubDbTableRowV3.updatedAt
            values = hubDbTableRowV3.values
            additionalProperties = hubDbTableRowV3.additionalProperties.toMutableMap()
        }

        /** The id of the table row */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Specifies the value for the column child table id */
        fun childTableId(childTableId: String) = childTableId(JsonField.of(childTableId))

        /**
         * Sets [Builder.childTableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childTableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun childTableId(childTableId: JsonField<String>) = apply {
            this.childTableId = childTableId
        }

        /** Timestamp at which the row is created */
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

        fun publishedAt(publishedAt: OffsetDateTime) = publishedAt(JsonField.of(publishedAt))

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
            this.publishedAt = publishedAt
        }

        /** Timestamp at which the row is updated last time */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** List of key value pairs with the column name and column value */
        fun values(values: Values) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed [Values] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun values(values: JsonField<Values>) = apply { this.values = values }

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
         * Returns an immutable instance of [HubDbTableRowV3].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .childTableId()
         * .createdAt()
         * .name()
         * .path()
         * .publishedAt()
         * .updatedAt()
         * .values()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HubDbTableRowV3 =
            HubDbTableRowV3(
                checkRequired("id", id),
                checkRequired("childTableId", childTableId),
                checkRequired("createdAt", createdAt),
                checkRequired("name", name),
                checkRequired("path", path),
                checkRequired("publishedAt", publishedAt),
                checkRequired("updatedAt", updatedAt),
                checkRequired("values", values),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubDbTableRowV3 = apply {
        if (validated) {
            return@apply
        }

        id()
        childTableId()
        createdAt()
        name()
        path()
        publishedAt()
        updatedAt()
        values().validate()
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
            (if (childTableId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.validity() ?: 0)

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

        return other is HubDbTableRowV3 &&
            id == other.id &&
            childTableId == other.childTableId &&
            createdAt == other.createdAt &&
            name == other.name &&
            path == other.path &&
            publishedAt == other.publishedAt &&
            updatedAt == other.updatedAt &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            childTableId,
            createdAt,
            name,
            path,
            publishedAt,
            updatedAt,
            values,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubDbTableRowV3{id=$id, childTableId=$childTableId, createdAt=$createdAt, name=$name, path=$path, publishedAt=$publishedAt, updatedAt=$updatedAt, values=$values, additionalProperties=$additionalProperties}"
}
