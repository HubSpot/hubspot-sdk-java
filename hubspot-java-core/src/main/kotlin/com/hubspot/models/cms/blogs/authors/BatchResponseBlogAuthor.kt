// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.core.Enum
import com.hubspot.core.ExcludeMissing
import com.hubspot.core.JsonField
import com.hubspot.core.JsonMissing
import com.hubspot.core.JsonValue
import com.hubspot.core.checkKnown
import com.hubspot.core.checkRequired
import com.hubspot.core.toImmutable
import com.hubspot.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BatchResponseBlogAuthor
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val completedAt: JsonField<OffsetDateTime>,
    private val results: JsonField<List<BlogAuthor>>,
    private val startedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val links: JsonField<Links>,
    private val requestedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("completedAt")
        @ExcludeMissing
        completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<BlogAuthor>> = JsonMissing.of(),
        @JsonProperty("startedAt")
        @ExcludeMissing
        startedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<Links> = JsonMissing.of(),
        @JsonProperty("requestedAt")
        @ExcludeMissing
        requestedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(completedAt, results, startedAt, status, links, requestedAt, mutableMapOf())

    /**
     * Time of batch operation completion.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun completedAt(): OffsetDateTime = completedAt.getRequired("completedAt")

    /**
     * Results of batch operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun results(): List<BlogAuthor> = results.getRequired("results")

    /**
     * Time of batch operation start.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startedAt(): OffsetDateTime = startedAt.getRequired("startedAt")

    /**
     * Status of batch operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Links associated with batch operation.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun links(): Optional<Links> = links.getOptional("links")

    /**
     * Time of batch operation request.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestedAt(): Optional<OffsetDateTime> = requestedAt.getOptional("requestedAt")

    /**
     * Returns the raw JSON value of [completedAt].
     *
     * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("completedAt")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results") @ExcludeMissing fun _results(): JsonField<List<BlogAuthor>> = results

    /**
     * Returns the raw JSON value of [startedAt].
     *
     * Unlike [startedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startedAt")
    @ExcludeMissing
    fun _startedAt(): JsonField<OffsetDateTime> = startedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<Links> = links

    /**
     * Returns the raw JSON value of [requestedAt].
     *
     * Unlike [requestedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestedAt")
    @ExcludeMissing
    fun _requestedAt(): JsonField<OffsetDateTime> = requestedAt

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
         * Returns a mutable builder for constructing an instance of [BatchResponseBlogAuthor].
         *
         * The following fields are required:
         * ```java
         * .completedAt()
         * .results()
         * .startedAt()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BatchResponseBlogAuthor]. */
    class Builder internal constructor() {

        private var completedAt: JsonField<OffsetDateTime>? = null
        private var results: JsonField<MutableList<BlogAuthor>>? = null
        private var startedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var links: JsonField<Links> = JsonMissing.of()
        private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(batchResponseBlogAuthor: BatchResponseBlogAuthor) = apply {
            completedAt = batchResponseBlogAuthor.completedAt
            results = batchResponseBlogAuthor.results.map { it.toMutableList() }
            startedAt = batchResponseBlogAuthor.startedAt
            status = batchResponseBlogAuthor.status
            links = batchResponseBlogAuthor.links
            requestedAt = batchResponseBlogAuthor.requestedAt
            additionalProperties = batchResponseBlogAuthor.additionalProperties.toMutableMap()
        }

        /** Time of batch operation completion. */
        fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

        /**
         * Sets [Builder.completedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /** Results of batch operation. */
        fun results(results: List<BlogAuthor>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed `List<BlogAuthor>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun results(results: JsonField<List<BlogAuthor>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [BlogAuthor] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: BlogAuthor) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
                }
        }

        /** Time of batch operation start. */
        fun startedAt(startedAt: OffsetDateTime) = startedAt(JsonField.of(startedAt))

        /**
         * Sets [Builder.startedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startedAt(startedAt: JsonField<OffsetDateTime>) = apply { this.startedAt = startedAt }

        /** Status of batch operation. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Links associated with batch operation. */
        fun links(links: Links) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed [Links] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun links(links: JsonField<Links>) = apply { this.links = links }

        /** Time of batch operation request. */
        fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

        /**
         * Sets [Builder.requestedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
            this.requestedAt = requestedAt
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
         * Returns an immutable instance of [BatchResponseBlogAuthor].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .completedAt()
         * .results()
         * .startedAt()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BatchResponseBlogAuthor =
            BatchResponseBlogAuthor(
                checkRequired("completedAt", completedAt),
                checkRequired("results", results).map { it.toImmutable() },
                checkRequired("startedAt", startedAt),
                checkRequired("status", status),
                links,
                requestedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BatchResponseBlogAuthor = apply {
        if (validated) {
            return@apply
        }

        completedAt()
        results().forEach { it.validate() }
        startedAt()
        status().validate()
        links().ifPresent { it.validate() }
        requestedAt()
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
        (if (completedAt.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (startedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (links.asKnown().getOrNull()?.validity() ?: 0) +
            (if (requestedAt.asKnown().isPresent) 1 else 0)

    /** Status of batch operation. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CANCELED = of("CANCELED")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val PENDING = of("PENDING")

            @JvmField val PROCESSING = of("PROCESSING")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CANCELED,
            COMPLETE,
            PENDING,
            PROCESSING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CANCELED,
            COMPLETE,
            PENDING,
            PROCESSING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CANCELED -> Value.CANCELED
                COMPLETE -> Value.COMPLETE
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
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
                CANCELED -> Known.CANCELED
                COMPLETE -> Known.COMPLETE
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                else -> throw HubSpotInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Links associated with batch operation. */
    class Links
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

            /** Returns a mutable builder for constructing an instance of [Links]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Links]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(links: Links) = apply {
                additionalProperties = links.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Links].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Links = Links(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Links = apply {
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

            return other is Links && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Links{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BatchResponseBlogAuthor &&
            completedAt == other.completedAt &&
            results == other.results &&
            startedAt == other.startedAt &&
            status == other.status &&
            links == other.links &&
            requestedAt == other.requestedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            completedAt,
            results,
            startedAt,
            status,
            links,
            requestedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BatchResponseBlogAuthor{completedAt=$completedAt, results=$results, startedAt=$startedAt, status=$status, links=$links, requestedAt=$requestedAt, additionalProperties=$additionalProperties}"
}
