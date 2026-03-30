// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

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

class IndexedTimePoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val indexReference: JsonField<IndexReference>,
    private val timeType: JsonField<TimeType>,
    private val timezoneSource: JsonField<TimezoneSource>,
    private val zoneId: JsonField<String>,
    private val offset: JsonField<IndexOffset>,
    private val shouldGenerateRefreshTime: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("indexReference")
        @ExcludeMissing
        indexReference: JsonField<IndexReference> = JsonMissing.of(),
        @JsonProperty("timeType") @ExcludeMissing timeType: JsonField<TimeType> = JsonMissing.of(),
        @JsonProperty("timezoneSource")
        @ExcludeMissing
        timezoneSource: JsonField<TimezoneSource> = JsonMissing.of(),
        @JsonProperty("zoneId") @ExcludeMissing zoneId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offset") @ExcludeMissing offset: JsonField<IndexOffset> = JsonMissing.of(),
        @JsonProperty("shouldGenerateRefreshTime")
        @ExcludeMissing
        shouldGenerateRefreshTime: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        indexReference,
        timeType,
        timezoneSource,
        zoneId,
        offset,
        shouldGenerateRefreshTime,
        mutableMapOf(),
    )

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun indexReference(): IndexReference = indexReference.getRequired("indexReference")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timeType(): TimeType = timeType.getRequired("timeType")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezoneSource(): TimezoneSource = timezoneSource.getRequired("timezoneSource")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun zoneId(): String = zoneId.getRequired("zoneId")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun offset(): Optional<IndexOffset> = offset.getOptional("offset")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shouldGenerateRefreshTime(): Optional<Boolean> =
        shouldGenerateRefreshTime.getOptional("shouldGenerateRefreshTime")

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
     * Returns the raw JSON value of [timezoneSource].
     *
     * Unlike [timezoneSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezoneSource")
    @ExcludeMissing
    fun _timezoneSource(): JsonField<TimezoneSource> = timezoneSource

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
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<IndexOffset> = offset

    /**
     * Returns the raw JSON value of [shouldGenerateRefreshTime].
     *
     * Unlike [shouldGenerateRefreshTime], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("shouldGenerateRefreshTime")
    @ExcludeMissing
    fun _shouldGenerateRefreshTime(): JsonField<Boolean> = shouldGenerateRefreshTime

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
         * Returns a mutable builder for constructing an instance of [IndexedTimePoint].
         *
         * The following fields are required:
         * ```java
         * .indexReference()
         * .timeType()
         * .timezoneSource()
         * .zoneId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IndexedTimePoint]. */
    class Builder internal constructor() {

        private var indexReference: JsonField<IndexReference>? = null
        private var timeType: JsonField<TimeType>? = null
        private var timezoneSource: JsonField<TimezoneSource>? = null
        private var zoneId: JsonField<String>? = null
        private var offset: JsonField<IndexOffset> = JsonMissing.of()
        private var shouldGenerateRefreshTime: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(indexedTimePoint: IndexedTimePoint) = apply {
            indexReference = indexedTimePoint.indexReference
            timeType = indexedTimePoint.timeType
            timezoneSource = indexedTimePoint.timezoneSource
            zoneId = indexedTimePoint.zoneId
            offset = indexedTimePoint.offset
            shouldGenerateRefreshTime = indexedTimePoint.shouldGenerateRefreshTime
            additionalProperties = indexedTimePoint.additionalProperties.toMutableMap()
        }

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
        fun indexReference(now: NowReference) = indexReference(IndexReference.ofNow(now))

        /** Alias for calling [indexReference] with `IndexReference.ofToday(today)`. */
        fun indexReference(today: TodayReference) = indexReference(IndexReference.ofToday(today))

        /** Alias for calling [indexReference] with `IndexReference.ofWeek(week)`. */
        fun indexReference(week: WeekReference) = indexReference(IndexReference.ofWeek(week))

        /** Alias for calling [indexReference] with `IndexReference.ofMonth(month)`. */
        fun indexReference(month: MonthReference) = indexReference(IndexReference.ofMonth(month))

        /** Alias for calling [indexReference] with `IndexReference.ofQuarter(quarter)`. */
        fun indexReference(quarter: QuarterReference) =
            indexReference(IndexReference.ofQuarter(quarter))

        /**
         * Alias for calling [indexReference] with `IndexReference.ofFiscalQuarter(fiscalQuarter)`.
         */
        fun indexReference(fiscalQuarter: FiscalQuarter) =
            indexReference(IndexReference.ofFiscalQuarter(fiscalQuarter))

        /** Alias for calling [indexReference] with `IndexReference.ofYear(year)`. */
        fun indexReference(year: YearReference) = indexReference(IndexReference.ofYear(year))

        /** Alias for calling [indexReference] with `IndexReference.ofFiscalYear(fiscalYear)`. */
        fun indexReference(fiscalYear: FiscalYear) =
            indexReference(IndexReference.ofFiscalYear(fiscalYear))

        fun timeType(timeType: TimeType) = timeType(JsonField.of(timeType))

        /**
         * Sets [Builder.timeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeType] with a well-typed [TimeType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeType(timeType: JsonField<TimeType>) = apply { this.timeType = timeType }

        fun timezoneSource(timezoneSource: TimezoneSource) =
            timezoneSource(JsonField.of(timezoneSource))

        /**
         * Sets [Builder.timezoneSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezoneSource] with a well-typed [TimezoneSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timezoneSource(timezoneSource: JsonField<TimezoneSource>) = apply {
            this.timezoneSource = timezoneSource
        }

        fun zoneId(zoneId: String) = zoneId(JsonField.of(zoneId))

        /**
         * Sets [Builder.zoneId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.zoneId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun zoneId(zoneId: JsonField<String>) = apply { this.zoneId = zoneId }

        fun offset(offset: IndexOffset) = offset(JsonField.of(offset))

        /**
         * Sets [Builder.offset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offset] with a well-typed [IndexOffset] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun offset(offset: JsonField<IndexOffset>) = apply { this.offset = offset }

        fun shouldGenerateRefreshTime(shouldGenerateRefreshTime: Boolean) =
            shouldGenerateRefreshTime(JsonField.of(shouldGenerateRefreshTime))

        /**
         * Sets [Builder.shouldGenerateRefreshTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shouldGenerateRefreshTime] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shouldGenerateRefreshTime(shouldGenerateRefreshTime: JsonField<Boolean>) = apply {
            this.shouldGenerateRefreshTime = shouldGenerateRefreshTime
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
         * Returns an immutable instance of [IndexedTimePoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .indexReference()
         * .timeType()
         * .timezoneSource()
         * .zoneId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IndexedTimePoint =
            IndexedTimePoint(
                checkRequired("indexReference", indexReference),
                checkRequired("timeType", timeType),
                checkRequired("timezoneSource", timezoneSource),
                checkRequired("zoneId", zoneId),
                offset,
                shouldGenerateRefreshTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IndexedTimePoint = apply {
        if (validated) {
            return@apply
        }

        indexReference().validate()
        timeType().validate()
        timezoneSource().validate()
        zoneId()
        offset().ifPresent { it.validate() }
        shouldGenerateRefreshTime()
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
            (timezoneSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (zoneId.asKnown().isPresent) 1 else 0) +
            (offset.asKnown().getOrNull()?.validity() ?: 0) +
            (if (shouldGenerateRefreshTime.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = IndexReference.Deserializer::class)
    @JsonSerialize(using = IndexReference.Serializer::class)
    class IndexReference
    private constructor(
        private val now: NowReference? = null,
        private val today: TodayReference? = null,
        private val week: WeekReference? = null,
        private val month: MonthReference? = null,
        private val quarter: QuarterReference? = null,
        private val fiscalQuarter: FiscalQuarter? = null,
        private val year: YearReference? = null,
        private val fiscalYear: FiscalYear? = null,
        private val _json: JsonValue? = null,
    ) {

        fun now(): Optional<NowReference> = Optional.ofNullable(now)

        fun today(): Optional<TodayReference> = Optional.ofNullable(today)

        fun week(): Optional<WeekReference> = Optional.ofNullable(week)

        fun month(): Optional<MonthReference> = Optional.ofNullable(month)

        fun quarter(): Optional<QuarterReference> = Optional.ofNullable(quarter)

        fun fiscalQuarter(): Optional<FiscalQuarter> = Optional.ofNullable(fiscalQuarter)

        fun year(): Optional<YearReference> = Optional.ofNullable(year)

        fun fiscalYear(): Optional<FiscalYear> = Optional.ofNullable(fiscalYear)

        fun isNow(): Boolean = now != null

        fun isToday(): Boolean = today != null

        fun isWeek(): Boolean = week != null

        fun isMonth(): Boolean = month != null

        fun isQuarter(): Boolean = quarter != null

        fun isFiscalQuarter(): Boolean = fiscalQuarter != null

        fun isYear(): Boolean = year != null

        fun isFiscalYear(): Boolean = fiscalYear != null

        fun asNow(): NowReference = now.getOrThrow("now")

        fun asToday(): TodayReference = today.getOrThrow("today")

        fun asWeek(): WeekReference = week.getOrThrow("week")

        fun asMonth(): MonthReference = month.getOrThrow("month")

        fun asQuarter(): QuarterReference = quarter.getOrThrow("quarter")

        fun asFiscalQuarter(): FiscalQuarter = fiscalQuarter.getOrThrow("fiscalQuarter")

        fun asYear(): YearReference = year.getOrThrow("year")

        fun asFiscalYear(): FiscalYear = fiscalYear.getOrThrow("fiscalYear")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                now != null -> visitor.visitNow(now)
                today != null -> visitor.visitToday(today)
                week != null -> visitor.visitWeek(week)
                month != null -> visitor.visitMonth(month)
                quarter != null -> visitor.visitQuarter(quarter)
                fiscalQuarter != null -> visitor.visitFiscalQuarter(fiscalQuarter)
                year != null -> visitor.visitYear(year)
                fiscalYear != null -> visitor.visitFiscalYear(fiscalYear)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): IndexReference = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNow(now: NowReference) {
                        now.validate()
                    }

                    override fun visitToday(today: TodayReference) {
                        today.validate()
                    }

                    override fun visitWeek(week: WeekReference) {
                        week.validate()
                    }

                    override fun visitMonth(month: MonthReference) {
                        month.validate()
                    }

                    override fun visitQuarter(quarter: QuarterReference) {
                        quarter.validate()
                    }

                    override fun visitFiscalQuarter(fiscalQuarter: FiscalQuarter) {
                        fiscalQuarter.validate()
                    }

                    override fun visitYear(year: YearReference) {
                        year.validate()
                    }

                    override fun visitFiscalYear(fiscalYear: FiscalYear) {
                        fiscalYear.validate()
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
                    override fun visitNow(now: NowReference) = now.validity()

                    override fun visitToday(today: TodayReference) = today.validity()

                    override fun visitWeek(week: WeekReference) = week.validity()

                    override fun visitMonth(month: MonthReference) = month.validity()

                    override fun visitQuarter(quarter: QuarterReference) = quarter.validity()

                    override fun visitFiscalQuarter(fiscalQuarter: FiscalQuarter) =
                        fiscalQuarter.validity()

                    override fun visitYear(year: YearReference) = year.validity()

                    override fun visitFiscalYear(fiscalYear: FiscalYear) = fiscalYear.validity()

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
                month == other.month &&
                quarter == other.quarter &&
                fiscalQuarter == other.fiscalQuarter &&
                year == other.year &&
                fiscalYear == other.fiscalYear
        }

        override fun hashCode(): Int =
            Objects.hash(now, today, week, month, quarter, fiscalQuarter, year, fiscalYear)

        override fun toString(): String =
            when {
                now != null -> "IndexReference{now=$now}"
                today != null -> "IndexReference{today=$today}"
                week != null -> "IndexReference{week=$week}"
                month != null -> "IndexReference{month=$month}"
                quarter != null -> "IndexReference{quarter=$quarter}"
                fiscalQuarter != null -> "IndexReference{fiscalQuarter=$fiscalQuarter}"
                year != null -> "IndexReference{year=$year}"
                fiscalYear != null -> "IndexReference{fiscalYear=$fiscalYear}"
                _json != null -> "IndexReference{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid IndexReference")
            }

        companion object {

            @JvmStatic fun ofNow(now: NowReference) = IndexReference(now = now)

            @JvmStatic fun ofToday(today: TodayReference) = IndexReference(today = today)

            @JvmStatic fun ofWeek(week: WeekReference) = IndexReference(week = week)

            @JvmStatic fun ofMonth(month: MonthReference) = IndexReference(month = month)

            @JvmStatic fun ofQuarter(quarter: QuarterReference) = IndexReference(quarter = quarter)

            @JvmStatic
            fun ofFiscalQuarter(fiscalQuarter: FiscalQuarter) =
                IndexReference(fiscalQuarter = fiscalQuarter)

            @JvmStatic fun ofYear(year: YearReference) = IndexReference(year = year)

            @JvmStatic
            fun ofFiscalYear(fiscalYear: FiscalYear) = IndexReference(fiscalYear = fiscalYear)
        }

        /**
         * An interface that defines how to map each variant of [IndexReference] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitNow(now: NowReference): T

            fun visitToday(today: TodayReference): T

            fun visitWeek(week: WeekReference): T

            fun visitMonth(month: MonthReference): T

            fun visitQuarter(quarter: QuarterReference): T

            fun visitFiscalQuarter(fiscalQuarter: FiscalQuarter): T

            fun visitYear(year: YearReference): T

            fun visitFiscalYear(fiscalYear: FiscalYear): T

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
                            tryDeserialize(node, jacksonTypeRef<NowReference>())?.let {
                                IndexReference(now = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TodayReference>())?.let {
                                IndexReference(today = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<WeekReference>())?.let {
                                IndexReference(week = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MonthReference>())?.let {
                                IndexReference(month = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<QuarterReference>())?.let {
                                IndexReference(quarter = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FiscalQuarter>())?.let {
                                IndexReference(fiscalQuarter = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<YearReference>())?.let {
                                IndexReference(year = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FiscalYear>())?.let {
                                IndexReference(fiscalYear = it, _json = json)
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
                    value.now != null -> generator.writeObject(value.now)
                    value.today != null -> generator.writeObject(value.today)
                    value.week != null -> generator.writeObject(value.week)
                    value.month != null -> generator.writeObject(value.month)
                    value.quarter != null -> generator.writeObject(value.quarter)
                    value.fiscalQuarter != null -> generator.writeObject(value.fiscalQuarter)
                    value.year != null -> generator.writeObject(value.year)
                    value.fiscalYear != null -> generator.writeObject(value.fiscalYear)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid IndexReference")
                }
            }
        }
    }

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

    class TimezoneSource @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmField val PORTAL = of("PORTAL")

            @JvmField val USER = of("USER")

            @JvmStatic fun of(value: String) = TimezoneSource(JsonField.of(value))
        }

        /** An enum containing [TimezoneSource]'s known values. */
        enum class Known {
            CUSTOM,
            PORTAL,
            USER,
        }

        /**
         * An enum containing [TimezoneSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimezoneSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOM,
            PORTAL,
            USER,
            /**
             * An enum member indicating that [TimezoneSource] was instantiated with an unknown
             * value.
             */
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
                CUSTOM -> Value.CUSTOM
                PORTAL -> Value.PORTAL
                USER -> Value.USER
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
                CUSTOM -> Known.CUSTOM
                PORTAL -> Known.PORTAL
                USER -> Known.USER
                else -> throw HubspotInvalidDataException("Unknown TimezoneSource: $value")
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

        fun validate(): TimezoneSource = apply {
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

            return other is TimezoneSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IndexedTimePoint &&
            indexReference == other.indexReference &&
            timeType == other.timeType &&
            timezoneSource == other.timezoneSource &&
            zoneId == other.zoneId &&
            offset == other.offset &&
            shouldGenerateRefreshTime == other.shouldGenerateRefreshTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            indexReference,
            timeType,
            timezoneSource,
            zoneId,
            offset,
            shouldGenerateRefreshTime,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IndexedTimePoint{indexReference=$indexReference, timeType=$timeType, timezoneSource=$timezoneSource, zoneId=$zoneId, offset=$offset, shouldGenerateRefreshTime=$shouldGenerateRefreshTime, additionalProperties=$additionalProperties}"
}
