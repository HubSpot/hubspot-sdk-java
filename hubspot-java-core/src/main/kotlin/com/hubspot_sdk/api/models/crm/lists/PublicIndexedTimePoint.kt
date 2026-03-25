// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicIndexedTimePoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val indexReference: JsonField<IndexReference>,
    private val timeType: JsonField<TimeType>,
    private val zoneId: JsonField<String>,
    private val offset: JsonField<PublicIndexOffset>,
    private val timezoneSource: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("indexReference")
        @ExcludeMissing
        indexReference: JsonField<IndexReference> = JsonMissing.of(),
        @JsonProperty("timeType") @ExcludeMissing timeType: JsonField<TimeType> = JsonMissing.of(),
        @JsonProperty("zoneId") @ExcludeMissing zoneId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offset")
        @ExcludeMissing
        offset: JsonField<PublicIndexOffset> = JsonMissing.of(),
        @JsonProperty("timezoneSource")
        @ExcludeMissing
        timezoneSource: JsonField<String> = JsonMissing.of(),
    ) : this(indexReference, timeType, zoneId, offset, timezoneSource, mutableMapOf())

    /**
     * Specifies the reference point in time for the indexed time point.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexReference(): IndexReference = indexReference.getRequired("indexReference")

    /**
     * Defines the type of time (INDEXED).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeType(): TimeType = timeType.getRequired("timeType")

    /**
     * Indicates the identifier for the time zone associated with the indexed time point.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zoneId(): String = zoneId.getRequired("zoneId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<PublicIndexOffset> = offset.getOptional("offset")

    /**
     * Specifies the source of the time zone information for the indexed time point (CUSTOM, USER,
     * PORTAL).
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timezoneSource(): Optional<String> = timezoneSource.getOptional("timezoneSource")

    /**
     * Returns the raw JSON value of [indexReference].
     *
     * Unlike [indexReference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("indexReference")
    @ExcludeMissing
    fun _indexReference(): JsonField<IndexReference> = indexReference

    /**
     * Returns the raw JSON value of [timeType].
     *
     * Unlike [timeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timeType") @ExcludeMissing fun _timeType(): JsonField<TimeType> = timeType

    /**
     * Returns the raw JSON value of [zoneId].
     *
     * Unlike [zoneId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("zoneId") @ExcludeMissing fun _zoneId(): JsonField<String> = zoneId

    /**
     * Returns the raw JSON value of [offset].
     *
     * Unlike [offset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<PublicIndexOffset> = offset

    /**
     * Returns the raw JSON value of [timezoneSource].
     *
     * Unlike [timezoneSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezoneSource")
    @ExcludeMissing
    fun _timezoneSource(): JsonField<String> = timezoneSource

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
         * Returns a mutable builder for constructing an instance of [PublicIndexedTimePoint].
         *
         * The following fields are required:
         * ```java
         * .indexReference()
         * .timeType()
         * .zoneId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicIndexedTimePoint]. */
    class Builder internal constructor() {

        private var indexReference: JsonField<IndexReference>? = null
        private var timeType: JsonField<TimeType>? = null
        private var zoneId: JsonField<String>? = null
        private var offset: JsonField<PublicIndexOffset> = JsonMissing.of()
        private var timezoneSource: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicIndexedTimePoint: PublicIndexedTimePoint) = apply {
            indexReference = publicIndexedTimePoint.indexReference
            timeType = publicIndexedTimePoint.timeType
            zoneId = publicIndexedTimePoint.zoneId
            offset = publicIndexedTimePoint.offset
            timezoneSource = publicIndexedTimePoint.timezoneSource
            additionalProperties = publicIndexedTimePoint.additionalProperties.toMutableMap()
        }

        /** Specifies the reference point in time for the indexed time point. */
        fun indexReference(indexReference: IndexReference) =
            indexReference(JsonField.of(indexReference))

        /**
         * Sets [Builder.indexReference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.indexReference] with a well-typed [IndexReference] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun indexReference(indexReference: JsonField<IndexReference>) = apply {
            this.indexReference = indexReference
        }

        /** Alias for calling [indexReference] with `IndexReference.ofPublicNow(publicNow)`. */
        fun indexReference(publicNow: PublicNowReference) =
            indexReference(IndexReference.ofPublicNow(publicNow))

        /** Alias for calling [indexReference] with `IndexReference.ofPublicToday(publicToday)`. */
        fun indexReference(publicToday: PublicTodayReference) =
            indexReference(IndexReference.ofPublicToday(publicToday))

        /** Alias for calling [indexReference] with `IndexReference.ofPublicWeek(publicWeek)`. */
        fun indexReference(publicWeek: PublicWeekReference) =
            indexReference(IndexReference.ofPublicWeek(publicWeek))

        /**
         * Alias for calling [indexReference] with
         * `IndexReference.ofPublicFiscalQuarter(publicFiscalQuarter)`.
         */
        fun indexReference(publicFiscalQuarter: PublicFiscalQuarterReference) =
            indexReference(IndexReference.ofPublicFiscalQuarter(publicFiscalQuarter))

        /**
         * Alias for calling [indexReference] with
         * `IndexReference.ofPublicFiscalYear(publicFiscalYear)`.
         */
        fun indexReference(publicFiscalYear: PublicFiscalYearReference) =
            indexReference(IndexReference.ofPublicFiscalYear(publicFiscalYear))

        /** Alias for calling [indexReference] with `IndexReference.ofPublicYear(publicYear)`. */
        fun indexReference(publicYear: PublicYearReference) =
            indexReference(IndexReference.ofPublicYear(publicYear))

        /**
         * Alias for calling [indexReference] with `IndexReference.ofPublicQuarter(publicQuarter)`.
         */
        fun indexReference(publicQuarter: PublicQuarterReference) =
            indexReference(IndexReference.ofPublicQuarter(publicQuarter))

        /** Alias for calling [indexReference] with `IndexReference.ofPublicMonth(publicMonth)`. */
        fun indexReference(publicMonth: PublicMonthReference) =
            indexReference(IndexReference.ofPublicMonth(publicMonth))

        /** Defines the type of time (INDEXED). */
        fun timeType(timeType: TimeType) = timeType(JsonField.of(timeType))

        /**
         * Sets [Builder.timeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeType] with a well-typed [TimeType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeType(timeType: JsonField<TimeType>) = apply { this.timeType = timeType }

        /** Indicates the identifier for the time zone associated with the indexed time point. */
        fun zoneId(zoneId: String) = zoneId(JsonField.of(zoneId))

        /**
         * Sets [Builder.zoneId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneId(zoneId: JsonField<String>) = apply { this.zoneId = zoneId }

        fun offset(offset: PublicIndexOffset) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [PublicIndexOffset] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun offset(offset: JsonField<PublicIndexOffset>) = apply { this.offset = offset }

        /**
         * Specifies the source of the time zone information for the indexed time point (CUSTOM,
         * USER, PORTAL).
         */
        fun timezoneSource(timezoneSource: String) = timezoneSource(JsonField.of(timezoneSource))

        /**
         * Sets [Builder.timezoneSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezoneSource] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timezoneSource(timezoneSource: JsonField<String>) = apply {
            this.timezoneSource = timezoneSource
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
         * Returns an immutable instance of [PublicIndexedTimePoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .indexReference()
         * .timeType()
         * .zoneId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicIndexedTimePoint =
            PublicIndexedTimePoint(
                checkRequired("indexReference", indexReference),
                checkRequired("timeType", timeType),
                checkRequired("zoneId", zoneId),
                offset,
                timezoneSource,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicIndexedTimePoint = apply {
        if (validated) {
            return@apply
        }

        indexReference().validate()
        timeType().validate()
        zoneId()
        offset().ifPresent { it.validate() }
        timezoneSource()
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
        (indexReference.asKnown().getOrNull()?.validity() ?: 0) +
            (timeType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (zoneId.asKnown().isPresent) 1 else 0) +
            (offset.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timezoneSource.asKnown().isPresent) 1 else 0)

    /** Specifies the reference point in time for the indexed time point. */
    @JsonDeserialize(using = IndexReference.Deserializer::class)
    @JsonSerialize(using = IndexReference.Serializer::class)
    class IndexReference
    private constructor(
        private val publicNow: PublicNowReference? = null,
        private val publicToday: PublicTodayReference? = null,
        private val publicWeek: PublicWeekReference? = null,
        private val publicFiscalQuarter: PublicFiscalQuarterReference? = null,
        private val publicFiscalYear: PublicFiscalYearReference? = null,
        private val publicYear: PublicYearReference? = null,
        private val publicQuarter: PublicQuarterReference? = null,
        private val publicMonth: PublicMonthReference? = null,
        private val _json: JsonValue? = null,
    ) {

        fun publicNow(): Optional<PublicNowReference> = Optional.ofNullable(publicNow)

        fun publicToday(): Optional<PublicTodayReference> = Optional.ofNullable(publicToday)

        fun publicWeek(): Optional<PublicWeekReference> = Optional.ofNullable(publicWeek)

        fun publicFiscalQuarter(): Optional<PublicFiscalQuarterReference> =
            Optional.ofNullable(publicFiscalQuarter)

        fun publicFiscalYear(): Optional<PublicFiscalYearReference> =
            Optional.ofNullable(publicFiscalYear)

        fun publicYear(): Optional<PublicYearReference> = Optional.ofNullable(publicYear)

        fun publicQuarter(): Optional<PublicQuarterReference> = Optional.ofNullable(publicQuarter)

        fun publicMonth(): Optional<PublicMonthReference> = Optional.ofNullable(publicMonth)

        fun isPublicNow(): Boolean = publicNow != null

        fun isPublicToday(): Boolean = publicToday != null

        fun isPublicWeek(): Boolean = publicWeek != null

        fun isPublicFiscalQuarter(): Boolean = publicFiscalQuarter != null

        fun isPublicFiscalYear(): Boolean = publicFiscalYear != null

        fun isPublicYear(): Boolean = publicYear != null

        fun isPublicQuarter(): Boolean = publicQuarter != null

        fun isPublicMonth(): Boolean = publicMonth != null

        fun asPublicNow(): PublicNowReference = publicNow.getOrThrow("publicNow")

        fun asPublicToday(): PublicTodayReference = publicToday.getOrThrow("publicToday")

        fun asPublicWeek(): PublicWeekReference = publicWeek.getOrThrow("publicWeek")

        fun asPublicFiscalQuarter(): PublicFiscalQuarterReference =
            publicFiscalQuarter.getOrThrow("publicFiscalQuarter")

        fun asPublicFiscalYear(): PublicFiscalYearReference =
            publicFiscalYear.getOrThrow("publicFiscalYear")

        fun asPublicYear(): PublicYearReference = publicYear.getOrThrow("publicYear")

        fun asPublicQuarter(): PublicQuarterReference = publicQuarter.getOrThrow("publicQuarter")

        fun asPublicMonth(): PublicMonthReference = publicMonth.getOrThrow("publicMonth")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                publicNow != null -> visitor.visitPublicNow(publicNow)
                publicToday != null -> visitor.visitPublicToday(publicToday)
                publicWeek != null -> visitor.visitPublicWeek(publicWeek)
                publicFiscalQuarter != null -> visitor.visitPublicFiscalQuarter(publicFiscalQuarter)
                publicFiscalYear != null -> visitor.visitPublicFiscalYear(publicFiscalYear)
                publicYear != null -> visitor.visitPublicYear(publicYear)
                publicQuarter != null -> visitor.visitPublicQuarter(publicQuarter)
                publicMonth != null -> visitor.visitPublicMonth(publicMonth)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): IndexReference = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPublicNow(publicNow: PublicNowReference) {
                        publicNow.validate()
                    }

                    override fun visitPublicToday(publicToday: PublicTodayReference) {
                        publicToday.validate()
                    }

                    override fun visitPublicWeek(publicWeek: PublicWeekReference) {
                        publicWeek.validate()
                    }

                    override fun visitPublicFiscalQuarter(
                        publicFiscalQuarter: PublicFiscalQuarterReference
                    ) {
                        publicFiscalQuarter.validate()
                    }

                    override fun visitPublicFiscalYear(
                        publicFiscalYear: PublicFiscalYearReference
                    ) {
                        publicFiscalYear.validate()
                    }

                    override fun visitPublicYear(publicYear: PublicYearReference) {
                        publicYear.validate()
                    }

                    override fun visitPublicQuarter(publicQuarter: PublicQuarterReference) {
                        publicQuarter.validate()
                    }

                    override fun visitPublicMonth(publicMonth: PublicMonthReference) {
                        publicMonth.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitPublicNow(publicNow: PublicNowReference) =
                        publicNow.validity()

                    override fun visitPublicToday(publicToday: PublicTodayReference) =
                        publicToday.validity()

                    override fun visitPublicWeek(publicWeek: PublicWeekReference) =
                        publicWeek.validity()

                    override fun visitPublicFiscalQuarter(
                        publicFiscalQuarter: PublicFiscalQuarterReference
                    ) = publicFiscalQuarter.validity()

                    override fun visitPublicFiscalYear(
                        publicFiscalYear: PublicFiscalYearReference
                    ) = publicFiscalYear.validity()

                    override fun visitPublicYear(publicYear: PublicYearReference) =
                        publicYear.validity()

                    override fun visitPublicQuarter(publicQuarter: PublicQuarterReference) =
                        publicQuarter.validity()

                    override fun visitPublicMonth(publicMonth: PublicMonthReference) =
                        publicMonth.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IndexReference &&
                publicNow == other.publicNow &&
                publicToday == other.publicToday &&
                publicWeek == other.publicWeek &&
                publicFiscalQuarter == other.publicFiscalQuarter &&
                publicFiscalYear == other.publicFiscalYear &&
                publicYear == other.publicYear &&
                publicQuarter == other.publicQuarter &&
                publicMonth == other.publicMonth
        }

        override fun hashCode(): Int =
            Objects.hash(
                publicNow,
                publicToday,
                publicWeek,
                publicFiscalQuarter,
                publicFiscalYear,
                publicYear,
                publicQuarter,
                publicMonth,
            )

        override fun toString(): String =
            when {
                publicNow != null -> "IndexReference{publicNow=$publicNow}"
                publicToday != null -> "IndexReference{publicToday=$publicToday}"
                publicWeek != null -> "IndexReference{publicWeek=$publicWeek}"
                publicFiscalQuarter != null ->
                    "IndexReference{publicFiscalQuarter=$publicFiscalQuarter}"
                publicFiscalYear != null -> "IndexReference{publicFiscalYear=$publicFiscalYear}"
                publicYear != null -> "IndexReference{publicYear=$publicYear}"
                publicQuarter != null -> "IndexReference{publicQuarter=$publicQuarter}"
                publicMonth != null -> "IndexReference{publicMonth=$publicMonth}"
                _json != null -> "IndexReference{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid IndexReference")
            }

        companion object {

            @JvmStatic
            fun ofPublicNow(publicNow: PublicNowReference) = IndexReference(publicNow = publicNow)

            @JvmStatic
            fun ofPublicToday(publicToday: PublicTodayReference) =
                IndexReference(publicToday = publicToday)

            @JvmStatic
            fun ofPublicWeek(publicWeek: PublicWeekReference) =
                IndexReference(publicWeek = publicWeek)

            @JvmStatic
            fun ofPublicFiscalQuarter(publicFiscalQuarter: PublicFiscalQuarterReference) =
                IndexReference(publicFiscalQuarter = publicFiscalQuarter)

            @JvmStatic
            fun ofPublicFiscalYear(publicFiscalYear: PublicFiscalYearReference) =
                IndexReference(publicFiscalYear = publicFiscalYear)

            @JvmStatic
            fun ofPublicYear(publicYear: PublicYearReference) =
                IndexReference(publicYear = publicYear)

            @JvmStatic
            fun ofPublicQuarter(publicQuarter: PublicQuarterReference) =
                IndexReference(publicQuarter = publicQuarter)

            @JvmStatic
            fun ofPublicMonth(publicMonth: PublicMonthReference) =
                IndexReference(publicMonth = publicMonth)
        }

        /**
         * An interface that defines how to map each variant of [IndexReference] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitPublicNow(publicNow: PublicNowReference): T

            fun visitPublicToday(publicToday: PublicTodayReference): T

            fun visitPublicWeek(publicWeek: PublicWeekReference): T

            fun visitPublicFiscalQuarter(publicFiscalQuarter: PublicFiscalQuarterReference): T

            fun visitPublicFiscalYear(publicFiscalYear: PublicFiscalYearReference): T

            fun visitPublicYear(publicYear: PublicYearReference): T

            fun visitPublicQuarter(publicQuarter: PublicQuarterReference): T

            fun visitPublicMonth(publicMonth: PublicMonthReference): T

            /**
             * Maps an unknown variant of [IndexReference] to a value of type [T].
             *
             * An instance of [IndexReference] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown IndexReference: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<IndexReference>(IndexReference::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): IndexReference {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PublicNowReference>())?.let {
                                IndexReference(publicNow = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicTodayReference>())?.let {
                                IndexReference(publicToday = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicWeekReference>())?.let {
                                IndexReference(publicWeek = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicFiscalQuarterReference>())
                                ?.let { IndexReference(publicFiscalQuarter = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PublicFiscalYearReference>())?.let {
                                IndexReference(publicFiscalYear = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicYearReference>())?.let {
                                IndexReference(publicYear = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicQuarterReference>())?.let {
                                IndexReference(publicQuarter = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PublicMonthReference>())?.let {
                                IndexReference(publicMonth = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> IndexReference(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<IndexReference>(IndexReference::class) {

            override fun serialize(
                value: IndexReference,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.publicNow != null -> generator.writeObject(value.publicNow)
                    value.publicToday != null -> generator.writeObject(value.publicToday)
                    value.publicWeek != null -> generator.writeObject(value.publicWeek)
                    value.publicFiscalQuarter != null ->
                        generator.writeObject(value.publicFiscalQuarter)
                    value.publicFiscalYear != null -> generator.writeObject(value.publicFiscalYear)
                    value.publicYear != null -> generator.writeObject(value.publicYear)
                    value.publicQuarter != null -> generator.writeObject(value.publicQuarter)
                    value.publicMonth != null -> generator.writeObject(value.publicMonth)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid IndexReference")
                }
            }
        }
    }

    /** Defines the type of time (INDEXED). */
    class TimeType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INDEXED = of("INDEXED")

            @JvmStatic fun of(value: String) = TimeType(JsonField.of(value))
        }

        /** An enum containing [TimeType]'s known values. */
        enum class Known {
            INDEXED
        }

        /**
         * An enum containing [TimeType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INDEXED,
            /** An enum member indicating that [TimeType] was instantiated with an unknown value. */
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
                INDEXED -> Value.INDEXED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws HubspotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INDEXED -> Known.INDEXED
                else -> throw HubspotInvalidDataException("Unknown TimeType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws HubspotInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { HubspotInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): TimeType = apply {
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
            } catch (e: HubspotInvalidDataException) {
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

            return other is TimeType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicIndexedTimePoint &&
            indexReference == other.indexReference &&
            timeType == other.timeType &&
            zoneId == other.zoneId &&
            offset == other.offset &&
            timezoneSource == other.timezoneSource &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(indexReference, timeType, zoneId, offset, timezoneSource, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicIndexedTimePoint{indexReference=$indexReference, timeType=$timeType, zoneId=$zoneId, offset=$offset, timezoneSource=$timezoneSource, additionalProperties=$additionalProperties}"
}
