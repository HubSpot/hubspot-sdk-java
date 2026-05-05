// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.emails

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
import kotlin.jvm.optionals.getOrNull

class EmailStatisticsData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val counters: JsonField<Counters>,
    private val deviceBreakdown: JsonField<DeviceBreakdown>,
    private val qualifierStats: JsonField<QualifierStats>,
    private val ratios: JsonField<Ratios>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("counters") @ExcludeMissing counters: JsonField<Counters> = JsonMissing.of(),
        @JsonProperty("deviceBreakdown")
        @ExcludeMissing
        deviceBreakdown: JsonField<DeviceBreakdown> = JsonMissing.of(),
        @JsonProperty("qualifierStats")
        @ExcludeMissing
        qualifierStats: JsonField<QualifierStats> = JsonMissing.of(),
        @JsonProperty("ratios") @ExcludeMissing ratios: JsonField<Ratios> = JsonMissing.of(),
    ) : this(counters, deviceBreakdown, qualifierStats, ratios, mutableMapOf())

    /**
     * Counters like number of `sent`, `open` or `delivered`.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counters(): Counters = counters.getRequired("counters")

    /**
     * Statistics by device.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deviceBreakdown(): DeviceBreakdown = deviceBreakdown.getRequired("deviceBreakdown")

    /**
     * Number of emails that were dropped and bounced.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun qualifierStats(): QualifierStats = qualifierStats.getRequired("qualifierStats")

    /**
     * Ratios like `openratio` or `clickratio`
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ratios(): Ratios = ratios.getRequired("ratios")

    /**
     * Returns the raw JSON value of [counters].
     *
     * Unlike [counters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counters") @ExcludeMissing fun _counters(): JsonField<Counters> = counters

    /**
     * Returns the raw JSON value of [deviceBreakdown].
     *
     * Unlike [deviceBreakdown], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deviceBreakdown")
    @ExcludeMissing
    fun _deviceBreakdown(): JsonField<DeviceBreakdown> = deviceBreakdown

    /**
     * Returns the raw JSON value of [qualifierStats].
     *
     * Unlike [qualifierStats], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qualifierStats")
    @ExcludeMissing
    fun _qualifierStats(): JsonField<QualifierStats> = qualifierStats

    /**
     * Returns the raw JSON value of [ratios].
     *
     * Unlike [ratios], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ratios") @ExcludeMissing fun _ratios(): JsonField<Ratios> = ratios

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
         * Returns a mutable builder for constructing an instance of [EmailStatisticsData].
         *
         * The following fields are required:
         * ```java
         * .counters()
         * .deviceBreakdown()
         * .qualifierStats()
         * .ratios()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EmailStatisticsData]. */
    class Builder internal constructor() {

        private var counters: JsonField<Counters>? = null
        private var deviceBreakdown: JsonField<DeviceBreakdown>? = null
        private var qualifierStats: JsonField<QualifierStats>? = null
        private var ratios: JsonField<Ratios>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(emailStatisticsData: EmailStatisticsData) = apply {
            counters = emailStatisticsData.counters
            deviceBreakdown = emailStatisticsData.deviceBreakdown
            qualifierStats = emailStatisticsData.qualifierStats
            ratios = emailStatisticsData.ratios
            additionalProperties = emailStatisticsData.additionalProperties.toMutableMap()
        }

        /** Counters like number of `sent`, `open` or `delivered`. */
        fun counters(counters: Counters) = counters(JsonField.of(counters))

        /**
         * Sets [Builder.counters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counters] with a well-typed [Counters] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun counters(counters: JsonField<Counters>) = apply { this.counters = counters }

        /** Statistics by device. */
        fun deviceBreakdown(deviceBreakdown: DeviceBreakdown) =
            deviceBreakdown(JsonField.of(deviceBreakdown))

        /**
         * Sets [Builder.deviceBreakdown] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceBreakdown] with a well-typed [DeviceBreakdown]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deviceBreakdown(deviceBreakdown: JsonField<DeviceBreakdown>) = apply {
            this.deviceBreakdown = deviceBreakdown
        }

        /** Number of emails that were dropped and bounced. */
        fun qualifierStats(qualifierStats: QualifierStats) =
            qualifierStats(JsonField.of(qualifierStats))

        /**
         * Sets [Builder.qualifierStats] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qualifierStats] with a well-typed [QualifierStats] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun qualifierStats(qualifierStats: JsonField<QualifierStats>) = apply {
            this.qualifierStats = qualifierStats
        }

        /** Ratios like `openratio` or `clickratio` */
        fun ratios(ratios: Ratios) = ratios(JsonField.of(ratios))

        /**
         * Sets [Builder.ratios] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ratios] with a well-typed [Ratios] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ratios(ratios: JsonField<Ratios>) = apply { this.ratios = ratios }

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
         * Returns an immutable instance of [EmailStatisticsData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .counters()
         * .deviceBreakdown()
         * .qualifierStats()
         * .ratios()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailStatisticsData =
            EmailStatisticsData(
                checkRequired("counters", counters),
                checkRequired("deviceBreakdown", deviceBreakdown),
                checkRequired("qualifierStats", qualifierStats),
                checkRequired("ratios", ratios),
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
    fun validate(): EmailStatisticsData = apply {
        if (validated) {
            return@apply
        }

        counters().validate()
        deviceBreakdown().validate()
        qualifierStats().validate()
        ratios().validate()
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
        (counters.asKnown().getOrNull()?.validity() ?: 0) +
            (deviceBreakdown.asKnown().getOrNull()?.validity() ?: 0) +
            (qualifierStats.asKnown().getOrNull()?.validity() ?: 0) +
            (ratios.asKnown().getOrNull()?.validity() ?: 0)

    /** Counters like number of `sent`, `open` or `delivered`. */
    class Counters
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

            /** Returns a mutable builder for constructing an instance of [Counters]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Counters]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counters: Counters) = apply {
                additionalProperties = counters.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Counters].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Counters = Counters(additionalProperties.toImmutable())
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
        fun validate(): Counters = apply {
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

            return other is Counters && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Counters{additionalProperties=$additionalProperties}"
    }

    /** Statistics by device. */
    class DeviceBreakdown
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

            /** Returns a mutable builder for constructing an instance of [DeviceBreakdown]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DeviceBreakdown]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(deviceBreakdown: DeviceBreakdown) = apply {
                additionalProperties = deviceBreakdown.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [DeviceBreakdown].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): DeviceBreakdown = DeviceBreakdown(additionalProperties.toImmutable())
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
        fun validate(): DeviceBreakdown = apply {
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

            return other is DeviceBreakdown && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "DeviceBreakdown{additionalProperties=$additionalProperties}"
    }

    /** Number of emails that were dropped and bounced. */
    class QualifierStats
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

            /** Returns a mutable builder for constructing an instance of [QualifierStats]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [QualifierStats]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(qualifierStats: QualifierStats) = apply {
                additionalProperties = qualifierStats.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [QualifierStats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): QualifierStats = QualifierStats(additionalProperties.toImmutable())
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
        fun validate(): QualifierStats = apply {
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

            return other is QualifierStats && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "QualifierStats{additionalProperties=$additionalProperties}"
    }

    /** Ratios like `openratio` or `clickratio` */
    class Ratios
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

            /** Returns a mutable builder for constructing an instance of [Ratios]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ratios]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ratios: Ratios) = apply {
                additionalProperties = ratios.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Ratios].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Ratios = Ratios(additionalProperties.toImmutable())
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
        fun validate(): Ratios = apply {
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

            return other is Ratios && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Ratios{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EmailStatisticsData &&
            counters == other.counters &&
            deviceBreakdown == other.deviceBreakdown &&
            qualifierStats == other.qualifierStats &&
            ratios == other.ratios &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(counters, deviceBreakdown, qualifierStats, ratios, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailStatisticsData{counters=$counters, deviceBreakdown=$deviceBreakdown, qualifierStats=$qualifierStats, ratios=$ratios, additionalProperties=$additionalProperties}"
}
