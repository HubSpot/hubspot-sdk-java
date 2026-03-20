// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a CRM object that has either been created or updated (upserted) */
class SimplePublicUpsertObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val new_: JsonField<Boolean>,
    private val properties: JsonField<Properties>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val objectWriteTraceId: JsonField<String>,
    private val propertiesWithHistory: JsonField<PropertiesWithHistory>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("new") @ExcludeMissing new_: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("archivedAt")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("objectWriteTraceId")
        @ExcludeMissing
        objectWriteTraceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("propertiesWithHistory")
        @ExcludeMissing
        propertiesWithHistory: JsonField<PropertiesWithHistory> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        createdAt,
        new_,
        properties,
        updatedAt,
        archivedAt,
        objectWriteTraceId,
        propertiesWithHistory,
        url,
        mutableMapOf(),
    )

    /**
     * The unique ID of the object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether the object is archived.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun archived(): Boolean = archived.getRequired("archived")

    /**
     * The timestamp when the object was created, in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Whether the property is new.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun new_(): Boolean = new_.getRequired("new")

    /**
     * Key value pairs representing the properties of the object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The timestamp when the object was last updated, in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * The timestamp when the object was archived, in ISO 8601 format.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archivedAt")

    /**
     * An identifier for tracing the creation request.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun objectWriteTraceId(): Optional<String> =
        objectWriteTraceId.getOptional("objectWriteTraceId")

    /**
     * Key-value pairs representing the properties of the object along with their history.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertiesWithHistory(): Optional<PropertiesWithHistory> =
        propertiesWithHistory.getOptional("propertiesWithHistory")

    /**
     * The URL associated with the object.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [new_].
     *
     * Unlike [new_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("new") @ExcludeMissing fun _new_(): JsonField<Boolean> = new_

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archivedAt")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [objectWriteTraceId].
     *
     * Unlike [objectWriteTraceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("objectWriteTraceId")
    @ExcludeMissing
    fun _objectWriteTraceId(): JsonField<String> = objectWriteTraceId

    /**
     * Returns the raw JSON value of [propertiesWithHistory].
     *
     * Unlike [propertiesWithHistory], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("propertiesWithHistory")
    @ExcludeMissing
    fun _propertiesWithHistory(): JsonField<PropertiesWithHistory> = propertiesWithHistory

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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
         * Returns a mutable builder for constructing an instance of [SimplePublicUpsertObject].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .createdAt()
         * .new_()
         * .properties()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SimplePublicUpsertObject]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var new_: JsonField<Boolean>? = null
        private var properties: JsonField<Properties>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var objectWriteTraceId: JsonField<String> = JsonMissing.of()
        private var propertiesWithHistory: JsonField<PropertiesWithHistory> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(simplePublicUpsertObject: SimplePublicUpsertObject) = apply {
            id = simplePublicUpsertObject.id
            archived = simplePublicUpsertObject.archived
            createdAt = simplePublicUpsertObject.createdAt
            new_ = simplePublicUpsertObject.new_
            properties = simplePublicUpsertObject.properties
            updatedAt = simplePublicUpsertObject.updatedAt
            archivedAt = simplePublicUpsertObject.archivedAt
            objectWriteTraceId = simplePublicUpsertObject.objectWriteTraceId
            propertiesWithHistory = simplePublicUpsertObject.propertiesWithHistory
            url = simplePublicUpsertObject.url
            additionalProperties = simplePublicUpsertObject.additionalProperties.toMutableMap()
        }

        /** The unique ID of the object. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Whether the object is archived. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** The timestamp when the object was created, in ISO 8601 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Whether the property is new. */
        fun new_(new_: Boolean) = new_(JsonField.of(new_))

        /**
         * Sets [Builder.new_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.new_] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun new_(new_: JsonField<Boolean>) = apply { this.new_ = new_ }

        /** Key value pairs representing the properties of the object. */
        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /** The timestamp when the object was last updated, in ISO 8601 format. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The timestamp when the object was archived, in ISO 8601 format. */
        fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /** An identifier for tracing the creation request. */
        fun objectWriteTraceId(objectWriteTraceId: String) =
            objectWriteTraceId(JsonField.of(objectWriteTraceId))

        /**
         * Sets [Builder.objectWriteTraceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectWriteTraceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectWriteTraceId(objectWriteTraceId: JsonField<String>) = apply {
            this.objectWriteTraceId = objectWriteTraceId
        }

        /** Key-value pairs representing the properties of the object along with their history. */
        fun propertiesWithHistory(propertiesWithHistory: PropertiesWithHistory) =
            propertiesWithHistory(JsonField.of(propertiesWithHistory))

        /**
         * Sets [Builder.propertiesWithHistory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertiesWithHistory] with a well-typed
         * [PropertiesWithHistory] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun propertiesWithHistory(propertiesWithHistory: JsonField<PropertiesWithHistory>) = apply {
            this.propertiesWithHistory = propertiesWithHistory
        }

        /** The URL associated with the object. */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

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
         * Returns an immutable instance of [SimplePublicUpsertObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .archived()
         * .createdAt()
         * .new_()
         * .properties()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimplePublicUpsertObject =
            SimplePublicUpsertObject(
                checkRequired("id", id),
                checkRequired("archived", archived),
                checkRequired("createdAt", createdAt),
                checkRequired("new_", new_),
                checkRequired("properties", properties),
                checkRequired("updatedAt", updatedAt),
                archivedAt,
                objectWriteTraceId,
                propertiesWithHistory,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SimplePublicUpsertObject = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        createdAt()
        new_()
        properties().validate()
        updatedAt()
        archivedAt()
        objectWriteTraceId()
        propertiesWithHistory().ifPresent { it.validate() }
        url()
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
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (new_.asKnown().isPresent) 1 else 0) +
            (properties.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (if (objectWriteTraceId.asKnown().isPresent) 1 else 0) +
            (propertiesWithHistory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (url.asKnown().isPresent) 1 else 0)

    /** Key value pairs representing the properties of the object. */
    class Properties
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

            /** Returns a mutable builder for constructing an instance of [Properties]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(properties: Properties) = apply {
                additionalProperties = properties.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Properties = Properties(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Properties = apply {
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

            return other is Properties && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Properties{additionalProperties=$additionalProperties}"
    }

    /** Key-value pairs representing the properties of the object along with their history. */
    class PropertiesWithHistory
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
             * Returns a mutable builder for constructing an instance of [PropertiesWithHistory].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PropertiesWithHistory]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(propertiesWithHistory: PropertiesWithHistory) = apply {
                additionalProperties = propertiesWithHistory.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PropertiesWithHistory].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PropertiesWithHistory =
                PropertiesWithHistory(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PropertiesWithHistory = apply {
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

            return other is PropertiesWithHistory &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PropertiesWithHistory{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimplePublicUpsertObject &&
            id == other.id &&
            archived == other.archived &&
            createdAt == other.createdAt &&
            new_ == other.new_ &&
            properties == other.properties &&
            updatedAt == other.updatedAt &&
            archivedAt == other.archivedAt &&
            objectWriteTraceId == other.objectWriteTraceId &&
            propertiesWithHistory == other.propertiesWithHistory &&
            url == other.url &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            createdAt,
            new_,
            properties,
            updatedAt,
            archivedAt,
            objectWriteTraceId,
            propertiesWithHistory,
            url,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimplePublicUpsertObject{id=$id, archived=$archived, createdAt=$createdAt, new_=$new_, properties=$properties, updatedAt=$updatedAt, archivedAt=$archivedAt, objectWriteTraceId=$objectWriteTraceId, propertiesWithHistory=$propertiesWithHistory, url=$url, additionalProperties=$additionalProperties}"
}
