// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.errors.HubSpotInvalidDataException
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
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexReference(): IndexReference = indexReference.getRequired("indexReference")

    /**
     * Defines the type of time (INDEXED).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeType(): TimeType = timeType.getRequired("timeType")

    /**
     * Indicates the identifier for the time zone associated with the indexed time point.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zoneId(): String = zoneId.getRequired("zoneId")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<PublicIndexOffset> = offset.getOptional("offset")

    /**
     * Specifies the source of the time zone information for the indexed time point (CUSTOM, USER,
     * PORTAL).
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
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

        /** Alias for calling [indexReference] with `IndexReference.ofNow(now)`. */
        fun indexReference(now: PublicNowReference) = indexReference(IndexReference.ofNow(now))

        /** Alias for calling [indexReference] with `IndexReference.ofToday(today)`. */
        fun indexReference(today: PublicTodayReference) =
            indexReference(IndexReference.ofToday(today))

        /** Alias for calling [indexReference] with `IndexReference.ofWeek(week)`. */
        fun indexReference(week: PublicWeekReference) = indexReference(IndexReference.ofWeek(week))

        /**
         * Alias for calling [indexReference] with the following:
         * ```java
         * PublicWeekReference.builder()
         *     .referenceType(PublicWeekReference.ReferenceType.WEEK)
         *     .dayOfWeek(dayOfWeek)
         *     .build()
         * ```
         */
        fun weekIndexReference(dayOfWeek: PublicWeekReference.DayOfWeek) =
            indexReference(
                PublicWeekReference.builder()
                    .referenceType(PublicWeekReference.ReferenceType.WEEK)
                    .dayOfWeek(dayOfWeek)
                    .build()
            )

        /**
         * Alias for calling [indexReference] with `IndexReference.ofFiscalQuarter(fiscalQuarter)`.
         */
        fun indexReference(fiscalQuarter: PublicFiscalQuarterReference) =
            indexReference(IndexReference.ofFiscalQuarter(fiscalQuarter))

        /** Alias for calling [indexReference] with `IndexReference.ofFiscalYear(fiscalYear)`. */
        fun indexReference(fiscalYear: PublicFiscalYearReference) =
            indexReference(IndexReference.ofFiscalYear(fiscalYear))

        /** Alias for calling [indexReference] with `IndexReference.ofYear(year)`. */
        fun indexReference(year: PublicYearReference) = indexReference(IndexReference.ofYear(year))

        /** Alias for calling [indexReference] with `IndexReference.ofQuarter(quarter)`. */
        fun indexReference(quarter: PublicQuarterReference) =
            indexReference(IndexReference.ofQuarter(quarter))

        /** Alias for calling [indexReference] with `IndexReference.ofMonth(month)`. */
        fun indexReference(month: PublicMonthReference) =
            indexReference(IndexReference.ofMonth(month))

        /**
         * Alias for calling [indexReference] with the following:
         * ```java
         * PublicMonthReference.builder()
         *     .referenceType(PublicMonthReference.ReferenceType.MONTH)
         *     .day(day)
         *     .build()
         * ```
         */
        fun monthIndexReference(day: Int) =
            indexReference(
                PublicMonthReference.builder()
                    .referenceType(PublicMonthReference.ReferenceType.MONTH)
                    .day(day)
                    .build()
            )

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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
        private val now: PublicNowReference? = null,
        private val today: PublicTodayReference? = null,
        private val week: PublicWeekReference? = null,
        private val fiscalQuarter: PublicFiscalQuarterReference? = null,
        private val fiscalYear: PublicFiscalYearReference? = null,
        private val year: PublicYearReference? = null,
        private val quarter: PublicQuarterReference? = null,
        private val month: PublicMonthReference? = null,
        private val _json: JsonValue? = null,
    ) {

        fun now(): Optional<PublicNowReference> = Optional.ofNullable(now)

        fun today(): Optional<PublicTodayReference> = Optional.ofNullable(today)

        fun week(): Optional<PublicWeekReference> = Optional.ofNullable(week)

        fun fiscalQuarter(): Optional<PublicFiscalQuarterReference> =
            Optional.ofNullable(fiscalQuarter)

        fun fiscalYear(): Optional<PublicFiscalYearReference> = Optional.ofNullable(fiscalYear)

        fun year(): Optional<PublicYearReference> = Optional.ofNullable(year)

        fun quarter(): Optional<PublicQuarterReference> = Optional.ofNullable(quarter)

        fun month(): Optional<PublicMonthReference> = Optional.ofNullable(month)

        fun isNow(): Boolean = now != null

        fun isToday(): Boolean = today != null

        fun isWeek(): Boolean = week != null

        fun isFiscalQuarter(): Boolean = fiscalQuarter != null

        fun isFiscalYear(): Boolean = fiscalYear != null

        fun isYear(): Boolean = year != null

        fun isQuarter(): Boolean = quarter != null

        fun isMonth(): Boolean = month != null

        fun asNow(): PublicNowReference = now.getOrThrow("now")

        fun asToday(): PublicTodayReference = today.getOrThrow("today")

        fun asWeek(): PublicWeekReference = week.getOrThrow("week")

        fun asFiscalQuarter(): PublicFiscalQuarterReference =
            fiscalQuarter.getOrThrow("fiscalQuarter")

        fun asFiscalYear(): PublicFiscalYearReference = fiscalYear.getOrThrow("fiscalYear")

        fun asYear(): PublicYearReference = year.getOrThrow("year")

        fun asQuarter(): PublicQuarterReference = quarter.getOrThrow("quarter")

        fun asMonth(): PublicMonthReference = month.getOrThrow("month")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.hubspot.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = indexReference.accept(new IndexReference.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNow(PublicNowReference now) {
         *         return Optional.of(now.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws HubSpotInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                now != null -> visitor.visitNow(now)
                today != null -> visitor.visitToday(today)
                week != null -> visitor.visitWeek(week)
                fiscalQuarter != null -> visitor.visitFiscalQuarter(fiscalQuarter)
                fiscalYear != null -> visitor.visitFiscalYear(fiscalYear)
                year != null -> visitor.visitYear(year)
                quarter != null -> visitor.visitQuarter(quarter)
                month != null -> visitor.visitMonth(month)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): IndexReference = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNow(now: PublicNowReference) {
                        now.validate()
                    }

                    override fun visitToday(today: PublicTodayReference) {
                        today.validate()
                    }

                    override fun visitWeek(week: PublicWeekReference) {
                        week.validate()
                    }

                    override fun visitFiscalQuarter(fiscalQuarter: PublicFiscalQuarterReference) {
                        fiscalQuarter.validate()
                    }

                    override fun visitFiscalYear(fiscalYear: PublicFiscalYearReference) {
                        fiscalYear.validate()
                    }

                    override fun visitYear(year: PublicYearReference) {
                        year.validate()
                    }

                    override fun visitQuarter(quarter: PublicQuarterReference) {
                        quarter.validate()
                    }

                    override fun visitMonth(month: PublicMonthReference) {
                        month.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNow(now: PublicNowReference) = now.validity()

                    override fun visitToday(today: PublicTodayReference) = today.validity()

                    override fun visitWeek(week: PublicWeekReference) = week.validity()

                    override fun visitFiscalQuarter(fiscalQuarter: PublicFiscalQuarterReference) =
                        fiscalQuarter.validity()

                    override fun visitFiscalYear(fiscalYear: PublicFiscalYearReference) =
                        fiscalYear.validity()

                    override fun visitYear(year: PublicYearReference) = year.validity()

                    override fun visitQuarter(quarter: PublicQuarterReference) = quarter.validity()

                    override fun visitMonth(month: PublicMonthReference) = month.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IndexReference &&
                now == other.now &&
                today == other.today &&
                week == other.week &&
                fiscalQuarter == other.fiscalQuarter &&
                fiscalYear == other.fiscalYear &&
                year == other.year &&
                quarter == other.quarter &&
                month == other.month
        }

        override fun hashCode(): Int =
            Objects.hash(now, today, week, fiscalQuarter, fiscalYear, year, quarter, month)

        override fun toString(): String =
            when {
                now != null -> "IndexReference{now=$now}"
                today != null -> "IndexReference{today=$today}"
                week != null -> "IndexReference{week=$week}"
                fiscalQuarter != null -> "IndexReference{fiscalQuarter=$fiscalQuarter}"
                fiscalYear != null -> "IndexReference{fiscalYear=$fiscalYear}"
                year != null -> "IndexReference{year=$year}"
                quarter != null -> "IndexReference{quarter=$quarter}"
                month != null -> "IndexReference{month=$month}"
                _json != null -> "IndexReference{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid IndexReference")
            }

        companion object {

            @JvmStatic fun ofNow(now: PublicNowReference) = IndexReference(now = now)

            @JvmStatic fun ofToday(today: PublicTodayReference) = IndexReference(today = today)

            @JvmStatic fun ofWeek(week: PublicWeekReference) = IndexReference(week = week)

            @JvmStatic
            fun ofFiscalQuarter(fiscalQuarter: PublicFiscalQuarterReference) =
                IndexReference(fiscalQuarter = fiscalQuarter)

            @JvmStatic
            fun ofFiscalYear(fiscalYear: PublicFiscalYearReference) =
                IndexReference(fiscalYear = fiscalYear)

            @JvmStatic fun ofYear(year: PublicYearReference) = IndexReference(year = year)

            @JvmStatic
            fun ofQuarter(quarter: PublicQuarterReference) = IndexReference(quarter = quarter)

            @JvmStatic fun ofMonth(month: PublicMonthReference) = IndexReference(month = month)
        }

        /**
         * An interface that defines how to map each variant of [IndexReference] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNow(now: PublicNowReference): T

            fun visitToday(today: PublicTodayReference): T

            fun visitWeek(week: PublicWeekReference): T

            fun visitFiscalQuarter(fiscalQuarter: PublicFiscalQuarterReference): T

            fun visitFiscalYear(fiscalYear: PublicFiscalYearReference): T

            fun visitYear(year: PublicYearReference): T

            fun visitQuarter(quarter: PublicQuarterReference): T

            fun visitMonth(month: PublicMonthReference): T

            /**
             * Maps an unknown variant of [IndexReference] to a value of type [T].
             *
             * An instance of [IndexReference] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown IndexReference: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<IndexReference>(IndexReference::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): IndexReference {
                val json = JsonValue.fromJsonNode(node)
                val referenceType =
                    json.asObject().getOrNull()?.get("referenceType")?.asString()?.getOrNull()

                when (referenceType) {
                    "NOW" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicNowReference>())?.let {
                            IndexReference(now = it, _json = json)
                        } ?: IndexReference(_json = json)
                    }
                    "TODAY" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicTodayReference>())?.let {
                            IndexReference(today = it, _json = json)
                        } ?: IndexReference(_json = json)
                    }
                    "WEEK" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicWeekReference>())?.let {
                            IndexReference(week = it, _json = json)
                        } ?: IndexReference(_json = json)
                    }
                    "FISCAL_QUARTER" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicFiscalQuarterReference>())
                            ?.let { IndexReference(fiscalQuarter = it, _json = json) }
                            ?: IndexReference(_json = json)
                    }
                    "FISCAL_YEAR" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicFiscalYearReference>())
                            ?.let { IndexReference(fiscalYear = it, _json = json) }
                            ?: IndexReference(_json = json)
                    }
                    "YEAR" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicYearReference>())?.let {
                            IndexReference(year = it, _json = json)
                        } ?: IndexReference(_json = json)
                    }
                    "QUARTER" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicQuarterReference>())?.let {
                            IndexReference(quarter = it, _json = json)
                        } ?: IndexReference(_json = json)
                    }
                    "MONTH" -> {
                        return tryDeserialize(node, jacksonTypeRef<PublicMonthReference>())?.let {
                            IndexReference(month = it, _json = json)
                        } ?: IndexReference(_json = json)
                    }
                }

                return IndexReference(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<IndexReference>(IndexReference::class) {

            override fun serialize(
                value: IndexReference,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.now != null -> generator.writeObject(value.now)
                    value.today != null -> generator.writeObject(value.today)
                    value.week != null -> generator.writeObject(value.week)
                    value.fiscalQuarter != null -> generator.writeObject(value.fiscalQuarter)
                    value.fiscalYear != null -> generator.writeObject(value.fiscalYear)
                    value.year != null -> generator.writeObject(value.year)
                    value.quarter != null -> generator.writeObject(value.quarter)
                    value.month != null -> generator.writeObject(value.month)
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
         * @throws HubSpotInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                INDEXED -> Known.INDEXED
                else -> throw HubSpotInvalidDataException("Unknown TimeType: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
