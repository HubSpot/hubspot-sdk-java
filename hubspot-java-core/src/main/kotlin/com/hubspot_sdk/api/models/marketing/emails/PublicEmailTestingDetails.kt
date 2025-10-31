// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** AB testing related data. This property is only returned for AB type emails. */
class PublicEmailTestingDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val abSampleSizeDefault: JsonField<AbSampleSizeDefault>,
    private val abSamplingDefault: JsonField<AbSamplingDefault>,
    private val abStatus: JsonField<AbStatus>,
    private val abSuccessMetric: JsonField<AbSuccessMetric>,
    private val abTestPercentage: JsonField<Int>,
    private val hoursToWait: JsonField<Int>,
    private val isAbVariation: JsonField<Boolean>,
    private val testId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("abSampleSizeDefault")
        @ExcludeMissing
        abSampleSizeDefault: JsonField<AbSampleSizeDefault> = JsonMissing.of(),
        @JsonProperty("abSamplingDefault")
        @ExcludeMissing
        abSamplingDefault: JsonField<AbSamplingDefault> = JsonMissing.of(),
        @JsonProperty("abStatus") @ExcludeMissing abStatus: JsonField<AbStatus> = JsonMissing.of(),
        @JsonProperty("abSuccessMetric")
        @ExcludeMissing
        abSuccessMetric: JsonField<AbSuccessMetric> = JsonMissing.of(),
        @JsonProperty("abTestPercentage")
        @ExcludeMissing
        abTestPercentage: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hoursToWait") @ExcludeMissing hoursToWait: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("isAbVariation")
        @ExcludeMissing
        isAbVariation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("testId") @ExcludeMissing testId: JsonField<String> = JsonMissing.of(),
    ) : this(
        abSampleSizeDefault,
        abSamplingDefault,
        abStatus,
        abSuccessMetric,
        abTestPercentage,
        hoursToWait,
        isAbVariation,
        testId,
        mutableMapOf(),
    )

    /**
     * Version of the email that should be sent if there are too few recipients to conduct an AB
     * test.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun abSampleSizeDefault(): Optional<AbSampleSizeDefault> =
        abSampleSizeDefault.getOptional("abSampleSizeDefault")

    /**
     * Version of the email that should be sent if the results are inconclusive after the test
     * period, master or variant.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun abSamplingDefault(): Optional<AbSamplingDefault> =
        abSamplingDefault.getOptional("abSamplingDefault")

    /**
     * Status of the AB test.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun abStatus(): Optional<AbStatus> = abStatus.getOptional("abStatus")

    /**
     * Metric to determine the version that will be sent to the remaining contacts.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun abSuccessMetric(): Optional<AbSuccessMetric> =
        abSuccessMetric.getOptional("abSuccessMetric")

    /**
     * The size of your test group.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun abTestPercentage(): Optional<Int> = abTestPercentage.getOptional("abTestPercentage")

    /**
     * Time limit on gathering test results. After this time is up, the winning version will be sent
     * to the remaining contacts.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hoursToWait(): Optional<Int> = hoursToWait.getOptional("hoursToWait")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isAbVariation(): Optional<Boolean> = isAbVariation.getOptional("isAbVariation")

    /**
     * The ID of the AB test.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun testId(): Optional<String> = testId.getOptional("testId")

    /**
     * Returns the raw JSON value of [abSampleSizeDefault].
     *
     * Unlike [abSampleSizeDefault], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("abSampleSizeDefault")
    @ExcludeMissing
    fun _abSampleSizeDefault(): JsonField<AbSampleSizeDefault> = abSampleSizeDefault

    /**
     * Returns the raw JSON value of [abSamplingDefault].
     *
     * Unlike [abSamplingDefault], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("abSamplingDefault")
    @ExcludeMissing
    fun _abSamplingDefault(): JsonField<AbSamplingDefault> = abSamplingDefault

    /**
     * Returns the raw JSON value of [abStatus].
     *
     * Unlike [abStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abStatus") @ExcludeMissing fun _abStatus(): JsonField<AbStatus> = abStatus

    /**
     * Returns the raw JSON value of [abSuccessMetric].
     *
     * Unlike [abSuccessMetric], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("abSuccessMetric")
    @ExcludeMissing
    fun _abSuccessMetric(): JsonField<AbSuccessMetric> = abSuccessMetric

    /**
     * Returns the raw JSON value of [abTestPercentage].
     *
     * Unlike [abTestPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("abTestPercentage")
    @ExcludeMissing
    fun _abTestPercentage(): JsonField<Int> = abTestPercentage

    /**
     * Returns the raw JSON value of [hoursToWait].
     *
     * Unlike [hoursToWait], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hoursToWait") @ExcludeMissing fun _hoursToWait(): JsonField<Int> = hoursToWait

    /**
     * Returns the raw JSON value of [isAbVariation].
     *
     * Unlike [isAbVariation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isAbVariation")
    @ExcludeMissing
    fun _isAbVariation(): JsonField<Boolean> = isAbVariation

    /**
     * Returns the raw JSON value of [testId].
     *
     * Unlike [testId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("testId") @ExcludeMissing fun _testId(): JsonField<String> = testId

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
         * Returns a mutable builder for constructing an instance of [PublicEmailTestingDetails].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailTestingDetails]. */
    class Builder internal constructor() {

        private var abSampleSizeDefault: JsonField<AbSampleSizeDefault> = JsonMissing.of()
        private var abSamplingDefault: JsonField<AbSamplingDefault> = JsonMissing.of()
        private var abStatus: JsonField<AbStatus> = JsonMissing.of()
        private var abSuccessMetric: JsonField<AbSuccessMetric> = JsonMissing.of()
        private var abTestPercentage: JsonField<Int> = JsonMissing.of()
        private var hoursToWait: JsonField<Int> = JsonMissing.of()
        private var isAbVariation: JsonField<Boolean> = JsonMissing.of()
        private var testId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailTestingDetails: PublicEmailTestingDetails) = apply {
            abSampleSizeDefault = publicEmailTestingDetails.abSampleSizeDefault
            abSamplingDefault = publicEmailTestingDetails.abSamplingDefault
            abStatus = publicEmailTestingDetails.abStatus
            abSuccessMetric = publicEmailTestingDetails.abSuccessMetric
            abTestPercentage = publicEmailTestingDetails.abTestPercentage
            hoursToWait = publicEmailTestingDetails.hoursToWait
            isAbVariation = publicEmailTestingDetails.isAbVariation
            testId = publicEmailTestingDetails.testId
            additionalProperties = publicEmailTestingDetails.additionalProperties.toMutableMap()
        }

        /**
         * Version of the email that should be sent if there are too few recipients to conduct an AB
         * test.
         */
        fun abSampleSizeDefault(abSampleSizeDefault: AbSampleSizeDefault) =
            abSampleSizeDefault(JsonField.of(abSampleSizeDefault))

        /**
         * Sets [Builder.abSampleSizeDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abSampleSizeDefault] with a well-typed
         * [AbSampleSizeDefault] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun abSampleSizeDefault(abSampleSizeDefault: JsonField<AbSampleSizeDefault>) = apply {
            this.abSampleSizeDefault = abSampleSizeDefault
        }

        /**
         * Version of the email that should be sent if the results are inconclusive after the test
         * period, master or variant.
         */
        fun abSamplingDefault(abSamplingDefault: AbSamplingDefault) =
            abSamplingDefault(JsonField.of(abSamplingDefault))

        /**
         * Sets [Builder.abSamplingDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abSamplingDefault] with a well-typed [AbSamplingDefault]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun abSamplingDefault(abSamplingDefault: JsonField<AbSamplingDefault>) = apply {
            this.abSamplingDefault = abSamplingDefault
        }

        /** Status of the AB test. */
        fun abStatus(abStatus: AbStatus) = abStatus(JsonField.of(abStatus))

        /**
         * Sets [Builder.abStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abStatus] with a well-typed [AbStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abStatus(abStatus: JsonField<AbStatus>) = apply { this.abStatus = abStatus }

        /** Metric to determine the version that will be sent to the remaining contacts. */
        fun abSuccessMetric(abSuccessMetric: AbSuccessMetric) =
            abSuccessMetric(JsonField.of(abSuccessMetric))

        /**
         * Sets [Builder.abSuccessMetric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abSuccessMetric] with a well-typed [AbSuccessMetric]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun abSuccessMetric(abSuccessMetric: JsonField<AbSuccessMetric>) = apply {
            this.abSuccessMetric = abSuccessMetric
        }

        /** The size of your test group. */
        fun abTestPercentage(abTestPercentage: Int) =
            abTestPercentage(JsonField.of(abTestPercentage))

        /**
         * Sets [Builder.abTestPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.abTestPercentage] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun abTestPercentage(abTestPercentage: JsonField<Int>) = apply {
            this.abTestPercentage = abTestPercentage
        }

        /**
         * Time limit on gathering test results. After this time is up, the winning version will be
         * sent to the remaining contacts.
         */
        fun hoursToWait(hoursToWait: Int) = hoursToWait(JsonField.of(hoursToWait))

        /**
         * Sets [Builder.hoursToWait] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hoursToWait] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hoursToWait(hoursToWait: JsonField<Int>) = apply { this.hoursToWait = hoursToWait }

        fun isAbVariation(isAbVariation: Boolean) = isAbVariation(JsonField.of(isAbVariation))

        /**
         * Sets [Builder.isAbVariation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isAbVariation] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isAbVariation(isAbVariation: JsonField<Boolean>) = apply {
            this.isAbVariation = isAbVariation
        }

        /** The ID of the AB test. */
        fun testId(testId: String) = testId(JsonField.of(testId))

        /**
         * Sets [Builder.testId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.testId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun testId(testId: JsonField<String>) = apply { this.testId = testId }

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
         * Returns an immutable instance of [PublicEmailTestingDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailTestingDetails =
            PublicEmailTestingDetails(
                abSampleSizeDefault,
                abSamplingDefault,
                abStatus,
                abSuccessMetric,
                abTestPercentage,
                hoursToWait,
                isAbVariation,
                testId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailTestingDetails = apply {
        if (validated) {
            return@apply
        }

        abSampleSizeDefault().ifPresent { it.validate() }
        abSamplingDefault().ifPresent { it.validate() }
        abStatus().ifPresent { it.validate() }
        abSuccessMetric().ifPresent { it.validate() }
        abTestPercentage()
        hoursToWait()
        isAbVariation()
        testId()
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
        (abSampleSizeDefault.asKnown().getOrNull()?.validity() ?: 0) +
            (abSamplingDefault.asKnown().getOrNull()?.validity() ?: 0) +
            (abStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (abSuccessMetric.asKnown().getOrNull()?.validity() ?: 0) +
            (if (abTestPercentage.asKnown().isPresent) 1 else 0) +
            (if (hoursToWait.asKnown().isPresent) 1 else 0) +
            (if (isAbVariation.asKnown().isPresent) 1 else 0) +
            (if (testId.asKnown().isPresent) 1 else 0)

    /**
     * Version of the email that should be sent if there are too few recipients to conduct an AB
     * test.
     */
    class AbSampleSizeDefault
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MASTER = of("master")

            @JvmField val VARIANT = of("variant")

            @JvmField val LOSER_VARIANT = of("loser_variant")

            @JvmField val MAB_MASTER = of("mab_master")

            @JvmField val MAB_VARIANT = of("mab_variant")

            @JvmField val AUTOMATED_MASTER = of("automated_master")

            @JvmField val AUTOMATED_VARIANT = of("automated_variant")

            @JvmField val AUTOMATED_LOSER_VARIANT = of("automated_loser_variant")

            @JvmStatic fun of(value: String) = AbSampleSizeDefault(JsonField.of(value))
        }

        /** An enum containing [AbSampleSizeDefault]'s known values. */
        enum class Known {
            MASTER,
            VARIANT,
            LOSER_VARIANT,
            MAB_MASTER,
            MAB_VARIANT,
            AUTOMATED_MASTER,
            AUTOMATED_VARIANT,
            AUTOMATED_LOSER_VARIANT,
        }

        /**
         * An enum containing [AbSampleSizeDefault]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AbSampleSizeDefault] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MASTER,
            VARIANT,
            LOSER_VARIANT,
            MAB_MASTER,
            MAB_VARIANT,
            AUTOMATED_MASTER,
            AUTOMATED_VARIANT,
            AUTOMATED_LOSER_VARIANT,
            /**
             * An enum member indicating that [AbSampleSizeDefault] was instantiated with an unknown
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
                MASTER -> Value.MASTER
                VARIANT -> Value.VARIANT
                LOSER_VARIANT -> Value.LOSER_VARIANT
                MAB_MASTER -> Value.MAB_MASTER
                MAB_VARIANT -> Value.MAB_VARIANT
                AUTOMATED_MASTER -> Value.AUTOMATED_MASTER
                AUTOMATED_VARIANT -> Value.AUTOMATED_VARIANT
                AUTOMATED_LOSER_VARIANT -> Value.AUTOMATED_LOSER_VARIANT
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
                MASTER -> Known.MASTER
                VARIANT -> Known.VARIANT
                LOSER_VARIANT -> Known.LOSER_VARIANT
                MAB_MASTER -> Known.MAB_MASTER
                MAB_VARIANT -> Known.MAB_VARIANT
                AUTOMATED_MASTER -> Known.AUTOMATED_MASTER
                AUTOMATED_VARIANT -> Known.AUTOMATED_VARIANT
                AUTOMATED_LOSER_VARIANT -> Known.AUTOMATED_LOSER_VARIANT
                else -> throw HubspotInvalidDataException("Unknown AbSampleSizeDefault: $value")
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

        fun validate(): AbSampleSizeDefault = apply {
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

            return other is AbSampleSizeDefault && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Version of the email that should be sent if the results are inconclusive after the test
     * period, master or variant.
     */
    class AbSamplingDefault @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MASTER = of("master")

            @JvmField val VARIANT = of("variant")

            @JvmField val LOSER_VARIANT = of("loser_variant")

            @JvmField val MAB_MASTER = of("mab_master")

            @JvmField val MAB_VARIANT = of("mab_variant")

            @JvmField val AUTOMATED_MASTER = of("automated_master")

            @JvmField val AUTOMATED_VARIANT = of("automated_variant")

            @JvmField val AUTOMATED_LOSER_VARIANT = of("automated_loser_variant")

            @JvmStatic fun of(value: String) = AbSamplingDefault(JsonField.of(value))
        }

        /** An enum containing [AbSamplingDefault]'s known values. */
        enum class Known {
            MASTER,
            VARIANT,
            LOSER_VARIANT,
            MAB_MASTER,
            MAB_VARIANT,
            AUTOMATED_MASTER,
            AUTOMATED_VARIANT,
            AUTOMATED_LOSER_VARIANT,
        }

        /**
         * An enum containing [AbSamplingDefault]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AbSamplingDefault] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MASTER,
            VARIANT,
            LOSER_VARIANT,
            MAB_MASTER,
            MAB_VARIANT,
            AUTOMATED_MASTER,
            AUTOMATED_VARIANT,
            AUTOMATED_LOSER_VARIANT,
            /**
             * An enum member indicating that [AbSamplingDefault] was instantiated with an unknown
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
                MASTER -> Value.MASTER
                VARIANT -> Value.VARIANT
                LOSER_VARIANT -> Value.LOSER_VARIANT
                MAB_MASTER -> Value.MAB_MASTER
                MAB_VARIANT -> Value.MAB_VARIANT
                AUTOMATED_MASTER -> Value.AUTOMATED_MASTER
                AUTOMATED_VARIANT -> Value.AUTOMATED_VARIANT
                AUTOMATED_LOSER_VARIANT -> Value.AUTOMATED_LOSER_VARIANT
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
                MASTER -> Known.MASTER
                VARIANT -> Known.VARIANT
                LOSER_VARIANT -> Known.LOSER_VARIANT
                MAB_MASTER -> Known.MAB_MASTER
                MAB_VARIANT -> Known.MAB_VARIANT
                AUTOMATED_MASTER -> Known.AUTOMATED_MASTER
                AUTOMATED_VARIANT -> Known.AUTOMATED_VARIANT
                AUTOMATED_LOSER_VARIANT -> Known.AUTOMATED_LOSER_VARIANT
                else -> throw HubspotInvalidDataException("Unknown AbSamplingDefault: $value")
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

        fun validate(): AbSamplingDefault = apply {
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

            return other is AbSamplingDefault && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Status of the AB test. */
    class AbStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MASTER = of("master")

            @JvmField val VARIANT = of("variant")

            @JvmField val LOSER_VARIANT = of("loser_variant")

            @JvmField val MAB_MASTER = of("mab_master")

            @JvmField val MAB_VARIANT = of("mab_variant")

            @JvmField val AUTOMATED_MASTER = of("automated_master")

            @JvmField val AUTOMATED_VARIANT = of("automated_variant")

            @JvmField val AUTOMATED_LOSER_VARIANT = of("automated_loser_variant")

            @JvmStatic fun of(value: String) = AbStatus(JsonField.of(value))
        }

        /** An enum containing [AbStatus]'s known values. */
        enum class Known {
            MASTER,
            VARIANT,
            LOSER_VARIANT,
            MAB_MASTER,
            MAB_VARIANT,
            AUTOMATED_MASTER,
            AUTOMATED_VARIANT,
            AUTOMATED_LOSER_VARIANT,
        }

        /**
         * An enum containing [AbStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AbStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MASTER,
            VARIANT,
            LOSER_VARIANT,
            MAB_MASTER,
            MAB_VARIANT,
            AUTOMATED_MASTER,
            AUTOMATED_VARIANT,
            AUTOMATED_LOSER_VARIANT,
            /** An enum member indicating that [AbStatus] was instantiated with an unknown value. */
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
                MASTER -> Value.MASTER
                VARIANT -> Value.VARIANT
                LOSER_VARIANT -> Value.LOSER_VARIANT
                MAB_MASTER -> Value.MAB_MASTER
                MAB_VARIANT -> Value.MAB_VARIANT
                AUTOMATED_MASTER -> Value.AUTOMATED_MASTER
                AUTOMATED_VARIANT -> Value.AUTOMATED_VARIANT
                AUTOMATED_LOSER_VARIANT -> Value.AUTOMATED_LOSER_VARIANT
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
                MASTER -> Known.MASTER
                VARIANT -> Known.VARIANT
                LOSER_VARIANT -> Known.LOSER_VARIANT
                MAB_MASTER -> Known.MAB_MASTER
                MAB_VARIANT -> Known.MAB_VARIANT
                AUTOMATED_MASTER -> Known.AUTOMATED_MASTER
                AUTOMATED_VARIANT -> Known.AUTOMATED_VARIANT
                AUTOMATED_LOSER_VARIANT -> Known.AUTOMATED_LOSER_VARIANT
                else -> throw HubspotInvalidDataException("Unknown AbStatus: $value")
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

        fun validate(): AbStatus = apply {
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

            return other is AbStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Metric to determine the version that will be sent to the remaining contacts. */
    class AbSuccessMetric @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CLICKS_BY_OPENS = of("CLICKS_BY_OPENS")

            @JvmField val CLICKS_BY_DELIVERED = of("CLICKS_BY_DELIVERED")

            @JvmField val OPENS_BY_DELIVERED = of("OPENS_BY_DELIVERED")

            @JvmStatic fun of(value: String) = AbSuccessMetric(JsonField.of(value))
        }

        /** An enum containing [AbSuccessMetric]'s known values. */
        enum class Known {
            CLICKS_BY_OPENS,
            CLICKS_BY_DELIVERED,
            OPENS_BY_DELIVERED,
        }

        /**
         * An enum containing [AbSuccessMetric]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AbSuccessMetric] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CLICKS_BY_OPENS,
            CLICKS_BY_DELIVERED,
            OPENS_BY_DELIVERED,
            /**
             * An enum member indicating that [AbSuccessMetric] was instantiated with an unknown
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
                CLICKS_BY_OPENS -> Value.CLICKS_BY_OPENS
                CLICKS_BY_DELIVERED -> Value.CLICKS_BY_DELIVERED
                OPENS_BY_DELIVERED -> Value.OPENS_BY_DELIVERED
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
                CLICKS_BY_OPENS -> Known.CLICKS_BY_OPENS
                CLICKS_BY_DELIVERED -> Known.CLICKS_BY_DELIVERED
                OPENS_BY_DELIVERED -> Known.OPENS_BY_DELIVERED
                else -> throw HubspotInvalidDataException("Unknown AbSuccessMetric: $value")
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

        fun validate(): AbSuccessMetric = apply {
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

            return other is AbSuccessMetric && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailTestingDetails &&
            abSampleSizeDefault == other.abSampleSizeDefault &&
            abSamplingDefault == other.abSamplingDefault &&
            abStatus == other.abStatus &&
            abSuccessMetric == other.abSuccessMetric &&
            abTestPercentage == other.abTestPercentage &&
            hoursToWait == other.hoursToWait &&
            isAbVariation == other.isAbVariation &&
            testId == other.testId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            abSampleSizeDefault,
            abSamplingDefault,
            abStatus,
            abSuccessMetric,
            abTestPercentage,
            hoursToWait,
            isAbVariation,
            testId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailTestingDetails{abSampleSizeDefault=$abSampleSizeDefault, abSamplingDefault=$abSamplingDefault, abStatus=$abStatus, abSuccessMetric=$abSuccessMetric, abTestPercentage=$abTestPercentage, hoursToWait=$hoursToWait, isAbVariation=$isAbVariation, testId=$testId, additionalProperties=$additionalProperties}"
}
