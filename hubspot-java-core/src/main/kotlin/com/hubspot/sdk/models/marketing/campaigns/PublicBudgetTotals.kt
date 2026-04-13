// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot.sdk.core.Enum
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicBudgetTotals
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val budgetItems: JsonField<List<PublicBudgetItem>>,
    private val currencyCode: JsonField<CurrencyCode>,
    private val spendItems: JsonField<List<PublicSpendItem>>,
    private val budgetTotal: JsonField<Double>,
    private val remainingBudget: JsonField<Double>,
    private val spendTotal: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("budgetItems")
        @ExcludeMissing
        budgetItems: JsonField<List<PublicBudgetItem>> = JsonMissing.of(),
        @JsonProperty("currencyCode")
        @ExcludeMissing
        currencyCode: JsonField<CurrencyCode> = JsonMissing.of(),
        @JsonProperty("spendItems")
        @ExcludeMissing
        spendItems: JsonField<List<PublicSpendItem>> = JsonMissing.of(),
        @JsonProperty("budgetTotal")
        @ExcludeMissing
        budgetTotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("remainingBudget")
        @ExcludeMissing
        remainingBudget: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("spendTotal") @ExcludeMissing spendTotal: JsonField<Double> = JsonMissing.of(),
    ) : this(
        budgetItems,
        currencyCode,
        spendItems,
        budgetTotal,
        remainingBudget,
        spendTotal,
        mutableMapOf(),
    )

    /**
     * An array of budget items associated with the campaign. Each item is represented by a
     * PublicBudgetItem object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun budgetItems(): List<PublicBudgetItem> = budgetItems.getRequired("budgetItems")

    /**
     * The currency code used for the budget and spend amounts, following ISO 4217 standards.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyCode(): CurrencyCode = currencyCode.getRequired("currencyCode")

    /**
     * An array of spend items associated with the campaign. Each item is represented by a
     * PublicSpendItem object.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun spendItems(): List<PublicSpendItem> = spendItems.getRequired("spendItems")

    /**
     * The total budget allocated for the campaign.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun budgetTotal(): Optional<Double> = budgetTotal.getOptional("budgetTotal")

    /**
     * The remaining budget available for the campaign after accounting for all spend items.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun remainingBudget(): Optional<Double> = remainingBudget.getOptional("remainingBudget")

    /**
     * The total amount spent across all spend items in the campaign.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendTotal(): Optional<Double> = spendTotal.getOptional("spendTotal")

    /**
     * Returns the raw JSON value of [budgetItems].
     *
     * Unlike [budgetItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budgetItems")
    @ExcludeMissing
    fun _budgetItems(): JsonField<List<PublicBudgetItem>> = budgetItems

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyCode")
    @ExcludeMissing
    fun _currencyCode(): JsonField<CurrencyCode> = currencyCode

    /**
     * Returns the raw JSON value of [spendItems].
     *
     * Unlike [spendItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spendItems")
    @ExcludeMissing
    fun _spendItems(): JsonField<List<PublicSpendItem>> = spendItems

    /**
     * Returns the raw JSON value of [budgetTotal].
     *
     * Unlike [budgetTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("budgetTotal") @ExcludeMissing fun _budgetTotal(): JsonField<Double> = budgetTotal

    /**
     * Returns the raw JSON value of [remainingBudget].
     *
     * Unlike [remainingBudget], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remainingBudget")
    @ExcludeMissing
    fun _remainingBudget(): JsonField<Double> = remainingBudget

    /**
     * Returns the raw JSON value of [spendTotal].
     *
     * Unlike [spendTotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spendTotal") @ExcludeMissing fun _spendTotal(): JsonField<Double> = spendTotal

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
         * Returns a mutable builder for constructing an instance of [PublicBudgetTotals].
         *
         * The following fields are required:
         * ```java
         * .budgetItems()
         * .currencyCode()
         * .spendItems()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicBudgetTotals]. */
    class Builder internal constructor() {

        private var budgetItems: JsonField<MutableList<PublicBudgetItem>>? = null
        private var currencyCode: JsonField<CurrencyCode>? = null
        private var spendItems: JsonField<MutableList<PublicSpendItem>>? = null
        private var budgetTotal: JsonField<Double> = JsonMissing.of()
        private var remainingBudget: JsonField<Double> = JsonMissing.of()
        private var spendTotal: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicBudgetTotals: PublicBudgetTotals) = apply {
            budgetItems = publicBudgetTotals.budgetItems.map { it.toMutableList() }
            currencyCode = publicBudgetTotals.currencyCode
            spendItems = publicBudgetTotals.spendItems.map { it.toMutableList() }
            budgetTotal = publicBudgetTotals.budgetTotal
            remainingBudget = publicBudgetTotals.remainingBudget
            spendTotal = publicBudgetTotals.spendTotal
            additionalProperties = publicBudgetTotals.additionalProperties.toMutableMap()
        }

        /**
         * An array of budget items associated with the campaign. Each item is represented by a
         * PublicBudgetItem object.
         */
        fun budgetItems(budgetItems: List<PublicBudgetItem>) =
            budgetItems(JsonField.of(budgetItems))

        /**
         * Sets [Builder.budgetItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetItems] with a well-typed `List<PublicBudgetItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun budgetItems(budgetItems: JsonField<List<PublicBudgetItem>>) = apply {
            this.budgetItems = budgetItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicBudgetItem] to [budgetItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBudgetItem(budgetItem: PublicBudgetItem) = apply {
            budgetItems =
                (budgetItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("budgetItems", it).add(budgetItem)
                }
        }

        /**
         * The currency code used for the budget and spend amounts, following ISO 4217 standards.
         */
        fun currencyCode(currencyCode: CurrencyCode) = currencyCode(JsonField.of(currencyCode))

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [CurrencyCode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currencyCode(currencyCode: JsonField<CurrencyCode>) = apply {
            this.currencyCode = currencyCode
        }

        /**
         * An array of spend items associated with the campaign. Each item is represented by a
         * PublicSpendItem object.
         */
        fun spendItems(spendItems: List<PublicSpendItem>) = spendItems(JsonField.of(spendItems))

        /**
         * Sets [Builder.spendItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendItems] with a well-typed `List<PublicSpendItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun spendItems(spendItems: JsonField<List<PublicSpendItem>>) = apply {
            this.spendItems = spendItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [PublicSpendItem] to [spendItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpendItem(spendItem: PublicSpendItem) = apply {
            spendItems =
                (spendItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("spendItems", it).add(spendItem)
                }
        }

        /** The total budget allocated for the campaign. */
        fun budgetTotal(budgetTotal: Double) = budgetTotal(JsonField.of(budgetTotal))

        /**
         * Sets [Builder.budgetTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.budgetTotal] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun budgetTotal(budgetTotal: JsonField<Double>) = apply { this.budgetTotal = budgetTotal }

        /** The remaining budget available for the campaign after accounting for all spend items. */
        fun remainingBudget(remainingBudget: Double) =
            remainingBudget(JsonField.of(remainingBudget))

        /**
         * Sets [Builder.remainingBudget] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remainingBudget] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remainingBudget(remainingBudget: JsonField<Double>) = apply {
            this.remainingBudget = remainingBudget
        }

        /** The total amount spent across all spend items in the campaign. */
        fun spendTotal(spendTotal: Double) = spendTotal(JsonField.of(spendTotal))

        /**
         * Sets [Builder.spendTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendTotal] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spendTotal(spendTotal: JsonField<Double>) = apply { this.spendTotal = spendTotal }

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
         * Returns an immutable instance of [PublicBudgetTotals].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .budgetItems()
         * .currencyCode()
         * .spendItems()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PublicBudgetTotals =
            PublicBudgetTotals(
                checkRequired("budgetItems", budgetItems).map { it.toImmutable() },
                checkRequired("currencyCode", currencyCode),
                checkRequired("spendItems", spendItems).map { it.toImmutable() },
                budgetTotal,
                remainingBudget,
                spendTotal,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicBudgetTotals = apply {
        if (validated) {
            return@apply
        }

        budgetItems().forEach { it.validate() }
        currencyCode().validate()
        spendItems().forEach { it.validate() }
        budgetTotal()
        remainingBudget()
        spendTotal()
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
        (budgetItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (currencyCode.asKnown().getOrNull()?.validity() ?: 0) +
            (spendItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (budgetTotal.asKnown().isPresent) 1 else 0) +
            (if (remainingBudget.asKnown().isPresent) 1 else 0) +
            (if (spendTotal.asKnown().isPresent) 1 else 0)

    /** The currency code used for the budget and spend amounts, following ISO 4217 standards. */
    class CurrencyCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val AED = of("AED")

            @JvmField val AFN = of("AFN")

            @JvmField val ALL = of("ALL")

            @JvmField val AMD = of("AMD")

            @JvmField val ANG = of("ANG")

            @JvmField val AOA = of("AOA")

            @JvmField val ARS = of("ARS")

            @JvmField val AUD = of("AUD")

            @JvmField val AWG = of("AWG")

            @JvmField val AZN = of("AZN")

            @JvmField val BAM = of("BAM")

            @JvmField val BBD = of("BBD")

            @JvmField val BDT = of("BDT")

            @JvmField val BGN = of("BGN")

            @JvmField val BHD = of("BHD")

            @JvmField val BIF = of("BIF")

            @JvmField val BMD = of("BMD")

            @JvmField val BND = of("BND")

            @JvmField val BOB = of("BOB")

            @JvmField val BOV = of("BOV")

            @JvmField val BRL = of("BRL")

            @JvmField val BSD = of("BSD")

            @JvmField val BTN = of("BTN")

            @JvmField val BWP = of("BWP")

            @JvmField val BYN = of("BYN")

            @JvmField val BZD = of("BZD")

            @JvmField val CAD = of("CAD")

            @JvmField val CDF = of("CDF")

            @JvmField val CHE = of("CHE")

            @JvmField val CHF = of("CHF")

            @JvmField val CHW = of("CHW")

            @JvmField val CLF = of("CLF")

            @JvmField val CLP = of("CLP")

            @JvmField val CNY = of("CNY")

            @JvmField val COP = of("COP")

            @JvmField val COU = of("COU")

            @JvmField val CRC = of("CRC")

            @JvmField val CUC = of("CUC")

            @JvmField val CUP = of("CUP")

            @JvmField val CVE = of("CVE")

            @JvmField val CZK = of("CZK")

            @JvmField val DJF = of("DJF")

            @JvmField val DKK = of("DKK")

            @JvmField val DOP = of("DOP")

            @JvmField val DZD = of("DZD")

            @JvmField val EGP = of("EGP")

            @JvmField val ERN = of("ERN")

            @JvmField val ETB = of("ETB")

            @JvmField val EUR = of("EUR")

            @JvmField val FJD = of("FJD")

            @JvmField val FKP = of("FKP")

            @JvmField val GBP = of("GBP")

            @JvmField val GEL = of("GEL")

            @JvmField val GHS = of("GHS")

            @JvmField val GIP = of("GIP")

            @JvmField val GMD = of("GMD")

            @JvmField val GNF = of("GNF")

            @JvmField val GTQ = of("GTQ")

            @JvmField val GYD = of("GYD")

            @JvmField val HKD = of("HKD")

            @JvmField val HNL = of("HNL")

            @JvmField val HRK = of("HRK")

            @JvmField val HTG = of("HTG")

            @JvmField val HUF = of("HUF")

            @JvmField val IDR = of("IDR")

            @JvmField val ILS = of("ILS")

            @JvmField val INR = of("INR")

            @JvmField val IQD = of("IQD")

            @JvmField val IRR = of("IRR")

            @JvmField val ISK = of("ISK")

            @JvmField val JMD = of("JMD")

            @JvmField val JOD = of("JOD")

            @JvmField val JPY = of("JPY")

            @JvmField val KES = of("KES")

            @JvmField val KGS = of("KGS")

            @JvmField val KHR = of("KHR")

            @JvmField val KMF = of("KMF")

            @JvmField val KPW = of("KPW")

            @JvmField val KRW = of("KRW")

            @JvmField val KWD = of("KWD")

            @JvmField val KYD = of("KYD")

            @JvmField val KZT = of("KZT")

            @JvmField val LAK = of("LAK")

            @JvmField val LBP = of("LBP")

            @JvmField val LKR = of("LKR")

            @JvmField val LRD = of("LRD")

            @JvmField val LSL = of("LSL")

            @JvmField val LYD = of("LYD")

            @JvmField val MAD = of("MAD")

            @JvmField val MDL = of("MDL")

            @JvmField val MGA = of("MGA")

            @JvmField val MKD = of("MKD")

            @JvmField val MMK = of("MMK")

            @JvmField val MNT = of("MNT")

            @JvmField val MOP = of("MOP")

            @JvmField val MRU = of("MRU")

            @JvmField val MUR = of("MUR")

            @JvmField val MVR = of("MVR")

            @JvmField val MWK = of("MWK")

            @JvmField val MXN = of("MXN")

            @JvmField val MXV = of("MXV")

            @JvmField val MYR = of("MYR")

            @JvmField val MZN = of("MZN")

            @JvmField val NAD = of("NAD")

            @JvmField val NGN = of("NGN")

            @JvmField val NIO = of("NIO")

            @JvmField val NOK = of("NOK")

            @JvmField val NPR = of("NPR")

            @JvmField val NZD = of("NZD")

            @JvmField val OMR = of("OMR")

            @JvmField val PAB = of("PAB")

            @JvmField val PEN = of("PEN")

            @JvmField val PGK = of("PGK")

            @JvmField val PHP = of("PHP")

            @JvmField val PKR = of("PKR")

            @JvmField val PLN = of("PLN")

            @JvmField val PYG = of("PYG")

            @JvmField val QAR = of("QAR")

            @JvmField val RON = of("RON")

            @JvmField val RSD = of("RSD")

            @JvmField val RUB = of("RUB")

            @JvmField val RWF = of("RWF")

            @JvmField val SAR = of("SAR")

            @JvmField val SBD = of("SBD")

            @JvmField val SCR = of("SCR")

            @JvmField val SDG = of("SDG")

            @JvmField val SEK = of("SEK")

            @JvmField val SGD = of("SGD")

            @JvmField val SHP = of("SHP")

            @JvmField val SLL = of("SLL")

            @JvmField val SOS = of("SOS")

            @JvmField val SRD = of("SRD")

            @JvmField val SSP = of("SSP")

            @JvmField val STN = of("STN")

            @JvmField val SVC = of("SVC")

            @JvmField val SYP = of("SYP")

            @JvmField val SZL = of("SZL")

            @JvmField val THB = of("THB")

            @JvmField val TJS = of("TJS")

            @JvmField val TMT = of("TMT")

            @JvmField val TND = of("TND")

            @JvmField val TOP = of("TOP")

            @JvmField val TRY = of("TRY")

            @JvmField val TTD = of("TTD")

            @JvmField val TWD = of("TWD")

            @JvmField val TZS = of("TZS")

            @JvmField val UAH = of("UAH")

            @JvmField val UGX = of("UGX")

            @JvmField val USD = of("USD")

            @JvmField val USN = of("USN")

            @JvmField val UYI = of("UYI")

            @JvmField val UYU = of("UYU")

            @JvmField val UZS = of("UZS")

            @JvmField val VEF = of("VEF")

            @JvmField val VND = of("VND")

            @JvmField val VUV = of("VUV")

            @JvmField val WST = of("WST")

            @JvmField val XAF = of("XAF")

            @JvmField val XAG = of("XAG")

            @JvmField val XAU = of("XAU")

            @JvmField val XBA = of("XBA")

            @JvmField val XBB = of("XBB")

            @JvmField val XBC = of("XBC")

            @JvmField val XBD = of("XBD")

            @JvmField val XCD = of("XCD")

            @JvmField val XDR = of("XDR")

            @JvmField val XOF = of("XOF")

            @JvmField val XPD = of("XPD")

            @JvmField val XPF = of("XPF")

            @JvmField val XPT = of("XPT")

            @JvmField val XSU = of("XSU")

            @JvmField val XUA = of("XUA")

            @JvmField val YER = of("YER")

            @JvmField val ZAR = of("ZAR")

            @JvmField val ZMW = of("ZMW")

            @JvmField val ZWL = of("ZWL")

            @JvmStatic fun of(value: String) = CurrencyCode(JsonField.of(value))
        }

        /** An enum containing [CurrencyCode]'s known values. */
        enum class Known {
            AED,
            AFN,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BOV,
            BRL,
            BSD,
            BTN,
            BWP,
            BYN,
            BZD,
            CAD,
            CDF,
            CHE,
            CHF,
            CHW,
            CLF,
            CLP,
            CNY,
            COP,
            COU,
            CRC,
            CUC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ERN,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            IRR,
            ISK,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KPW,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MXV,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SDG,
            SEK,
            SGD,
            SHP,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SYP,
            SZL,
            THB,
            TJS,
            TMT,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            USN,
            UYI,
            UYU,
            UZS,
            VEF,
            VND,
            VUV,
            WST,
            XAF,
            XAG,
            XAU,
            XBA,
            XBB,
            XBC,
            XBD,
            XCD,
            XDR,
            XOF,
            XPD,
            XPF,
            XPT,
            XSU,
            XUA,
            YER,
            ZAR,
            ZMW,
            ZWL,
        }

        /**
         * An enum containing [CurrencyCode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CurrencyCode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AED,
            AFN,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BOV,
            BRL,
            BSD,
            BTN,
            BWP,
            BYN,
            BZD,
            CAD,
            CDF,
            CHE,
            CHF,
            CHW,
            CLF,
            CLP,
            CNY,
            COP,
            COU,
            CRC,
            CUC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ERN,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            IRR,
            ISK,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KPW,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MXV,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SDG,
            SEK,
            SGD,
            SHP,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SYP,
            SZL,
            THB,
            TJS,
            TMT,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            USN,
            UYI,
            UYU,
            UZS,
            VEF,
            VND,
            VUV,
            WST,
            XAF,
            XAG,
            XAU,
            XBA,
            XBB,
            XBC,
            XBD,
            XCD,
            XDR,
            XOF,
            XPD,
            XPF,
            XPT,
            XSU,
            XUA,
            YER,
            ZAR,
            ZMW,
            ZWL,
            /**
             * An enum member indicating that [CurrencyCode] was instantiated with an unknown value.
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
                AED -> Value.AED
                AFN -> Value.AFN
                ALL -> Value.ALL
                AMD -> Value.AMD
                ANG -> Value.ANG
                AOA -> Value.AOA
                ARS -> Value.ARS
                AUD -> Value.AUD
                AWG -> Value.AWG
                AZN -> Value.AZN
                BAM -> Value.BAM
                BBD -> Value.BBD
                BDT -> Value.BDT
                BGN -> Value.BGN
                BHD -> Value.BHD
                BIF -> Value.BIF
                BMD -> Value.BMD
                BND -> Value.BND
                BOB -> Value.BOB
                BOV -> Value.BOV
                BRL -> Value.BRL
                BSD -> Value.BSD
                BTN -> Value.BTN
                BWP -> Value.BWP
                BYN -> Value.BYN
                BZD -> Value.BZD
                CAD -> Value.CAD
                CDF -> Value.CDF
                CHE -> Value.CHE
                CHF -> Value.CHF
                CHW -> Value.CHW
                CLF -> Value.CLF
                CLP -> Value.CLP
                CNY -> Value.CNY
                COP -> Value.COP
                COU -> Value.COU
                CRC -> Value.CRC
                CUC -> Value.CUC
                CUP -> Value.CUP
                CVE -> Value.CVE
                CZK -> Value.CZK
                DJF -> Value.DJF
                DKK -> Value.DKK
                DOP -> Value.DOP
                DZD -> Value.DZD
                EGP -> Value.EGP
                ERN -> Value.ERN
                ETB -> Value.ETB
                EUR -> Value.EUR
                FJD -> Value.FJD
                FKP -> Value.FKP
                GBP -> Value.GBP
                GEL -> Value.GEL
                GHS -> Value.GHS
                GIP -> Value.GIP
                GMD -> Value.GMD
                GNF -> Value.GNF
                GTQ -> Value.GTQ
                GYD -> Value.GYD
                HKD -> Value.HKD
                HNL -> Value.HNL
                HRK -> Value.HRK
                HTG -> Value.HTG
                HUF -> Value.HUF
                IDR -> Value.IDR
                ILS -> Value.ILS
                INR -> Value.INR
                IQD -> Value.IQD
                IRR -> Value.IRR
                ISK -> Value.ISK
                JMD -> Value.JMD
                JOD -> Value.JOD
                JPY -> Value.JPY
                KES -> Value.KES
                KGS -> Value.KGS
                KHR -> Value.KHR
                KMF -> Value.KMF
                KPW -> Value.KPW
                KRW -> Value.KRW
                KWD -> Value.KWD
                KYD -> Value.KYD
                KZT -> Value.KZT
                LAK -> Value.LAK
                LBP -> Value.LBP
                LKR -> Value.LKR
                LRD -> Value.LRD
                LSL -> Value.LSL
                LYD -> Value.LYD
                MAD -> Value.MAD
                MDL -> Value.MDL
                MGA -> Value.MGA
                MKD -> Value.MKD
                MMK -> Value.MMK
                MNT -> Value.MNT
                MOP -> Value.MOP
                MRU -> Value.MRU
                MUR -> Value.MUR
                MVR -> Value.MVR
                MWK -> Value.MWK
                MXN -> Value.MXN
                MXV -> Value.MXV
                MYR -> Value.MYR
                MZN -> Value.MZN
                NAD -> Value.NAD
                NGN -> Value.NGN
                NIO -> Value.NIO
                NOK -> Value.NOK
                NPR -> Value.NPR
                NZD -> Value.NZD
                OMR -> Value.OMR
                PAB -> Value.PAB
                PEN -> Value.PEN
                PGK -> Value.PGK
                PHP -> Value.PHP
                PKR -> Value.PKR
                PLN -> Value.PLN
                PYG -> Value.PYG
                QAR -> Value.QAR
                RON -> Value.RON
                RSD -> Value.RSD
                RUB -> Value.RUB
                RWF -> Value.RWF
                SAR -> Value.SAR
                SBD -> Value.SBD
                SCR -> Value.SCR
                SDG -> Value.SDG
                SEK -> Value.SEK
                SGD -> Value.SGD
                SHP -> Value.SHP
                SLL -> Value.SLL
                SOS -> Value.SOS
                SRD -> Value.SRD
                SSP -> Value.SSP
                STN -> Value.STN
                SVC -> Value.SVC
                SYP -> Value.SYP
                SZL -> Value.SZL
                THB -> Value.THB
                TJS -> Value.TJS
                TMT -> Value.TMT
                TND -> Value.TND
                TOP -> Value.TOP
                TRY -> Value.TRY
                TTD -> Value.TTD
                TWD -> Value.TWD
                TZS -> Value.TZS
                UAH -> Value.UAH
                UGX -> Value.UGX
                USD -> Value.USD
                USN -> Value.USN
                UYI -> Value.UYI
                UYU -> Value.UYU
                UZS -> Value.UZS
                VEF -> Value.VEF
                VND -> Value.VND
                VUV -> Value.VUV
                WST -> Value.WST
                XAF -> Value.XAF
                XAG -> Value.XAG
                XAU -> Value.XAU
                XBA -> Value.XBA
                XBB -> Value.XBB
                XBC -> Value.XBC
                XBD -> Value.XBD
                XCD -> Value.XCD
                XDR -> Value.XDR
                XOF -> Value.XOF
                XPD -> Value.XPD
                XPF -> Value.XPF
                XPT -> Value.XPT
                XSU -> Value.XSU
                XUA -> Value.XUA
                YER -> Value.YER
                ZAR -> Value.ZAR
                ZMW -> Value.ZMW
                ZWL -> Value.ZWL
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
                AED -> Known.AED
                AFN -> Known.AFN
                ALL -> Known.ALL
                AMD -> Known.AMD
                ANG -> Known.ANG
                AOA -> Known.AOA
                ARS -> Known.ARS
                AUD -> Known.AUD
                AWG -> Known.AWG
                AZN -> Known.AZN
                BAM -> Known.BAM
                BBD -> Known.BBD
                BDT -> Known.BDT
                BGN -> Known.BGN
                BHD -> Known.BHD
                BIF -> Known.BIF
                BMD -> Known.BMD
                BND -> Known.BND
                BOB -> Known.BOB
                BOV -> Known.BOV
                BRL -> Known.BRL
                BSD -> Known.BSD
                BTN -> Known.BTN
                BWP -> Known.BWP
                BYN -> Known.BYN
                BZD -> Known.BZD
                CAD -> Known.CAD
                CDF -> Known.CDF
                CHE -> Known.CHE
                CHF -> Known.CHF
                CHW -> Known.CHW
                CLF -> Known.CLF
                CLP -> Known.CLP
                CNY -> Known.CNY
                COP -> Known.COP
                COU -> Known.COU
                CRC -> Known.CRC
                CUC -> Known.CUC
                CUP -> Known.CUP
                CVE -> Known.CVE
                CZK -> Known.CZK
                DJF -> Known.DJF
                DKK -> Known.DKK
                DOP -> Known.DOP
                DZD -> Known.DZD
                EGP -> Known.EGP
                ERN -> Known.ERN
                ETB -> Known.ETB
                EUR -> Known.EUR
                FJD -> Known.FJD
                FKP -> Known.FKP
                GBP -> Known.GBP
                GEL -> Known.GEL
                GHS -> Known.GHS
                GIP -> Known.GIP
                GMD -> Known.GMD
                GNF -> Known.GNF
                GTQ -> Known.GTQ
                GYD -> Known.GYD
                HKD -> Known.HKD
                HNL -> Known.HNL
                HRK -> Known.HRK
                HTG -> Known.HTG
                HUF -> Known.HUF
                IDR -> Known.IDR
                ILS -> Known.ILS
                INR -> Known.INR
                IQD -> Known.IQD
                IRR -> Known.IRR
                ISK -> Known.ISK
                JMD -> Known.JMD
                JOD -> Known.JOD
                JPY -> Known.JPY
                KES -> Known.KES
                KGS -> Known.KGS
                KHR -> Known.KHR
                KMF -> Known.KMF
                KPW -> Known.KPW
                KRW -> Known.KRW
                KWD -> Known.KWD
                KYD -> Known.KYD
                KZT -> Known.KZT
                LAK -> Known.LAK
                LBP -> Known.LBP
                LKR -> Known.LKR
                LRD -> Known.LRD
                LSL -> Known.LSL
                LYD -> Known.LYD
                MAD -> Known.MAD
                MDL -> Known.MDL
                MGA -> Known.MGA
                MKD -> Known.MKD
                MMK -> Known.MMK
                MNT -> Known.MNT
                MOP -> Known.MOP
                MRU -> Known.MRU
                MUR -> Known.MUR
                MVR -> Known.MVR
                MWK -> Known.MWK
                MXN -> Known.MXN
                MXV -> Known.MXV
                MYR -> Known.MYR
                MZN -> Known.MZN
                NAD -> Known.NAD
                NGN -> Known.NGN
                NIO -> Known.NIO
                NOK -> Known.NOK
                NPR -> Known.NPR
                NZD -> Known.NZD
                OMR -> Known.OMR
                PAB -> Known.PAB
                PEN -> Known.PEN
                PGK -> Known.PGK
                PHP -> Known.PHP
                PKR -> Known.PKR
                PLN -> Known.PLN
                PYG -> Known.PYG
                QAR -> Known.QAR
                RON -> Known.RON
                RSD -> Known.RSD
                RUB -> Known.RUB
                RWF -> Known.RWF
                SAR -> Known.SAR
                SBD -> Known.SBD
                SCR -> Known.SCR
                SDG -> Known.SDG
                SEK -> Known.SEK
                SGD -> Known.SGD
                SHP -> Known.SHP
                SLL -> Known.SLL
                SOS -> Known.SOS
                SRD -> Known.SRD
                SSP -> Known.SSP
                STN -> Known.STN
                SVC -> Known.SVC
                SYP -> Known.SYP
                SZL -> Known.SZL
                THB -> Known.THB
                TJS -> Known.TJS
                TMT -> Known.TMT
                TND -> Known.TND
                TOP -> Known.TOP
                TRY -> Known.TRY
                TTD -> Known.TTD
                TWD -> Known.TWD
                TZS -> Known.TZS
                UAH -> Known.UAH
                UGX -> Known.UGX
                USD -> Known.USD
                USN -> Known.USN
                UYI -> Known.UYI
                UYU -> Known.UYU
                UZS -> Known.UZS
                VEF -> Known.VEF
                VND -> Known.VND
                VUV -> Known.VUV
                WST -> Known.WST
                XAF -> Known.XAF
                XAG -> Known.XAG
                XAU -> Known.XAU
                XBA -> Known.XBA
                XBB -> Known.XBB
                XBC -> Known.XBC
                XBD -> Known.XBD
                XCD -> Known.XCD
                XDR -> Known.XDR
                XOF -> Known.XOF
                XPD -> Known.XPD
                XPF -> Known.XPF
                XPT -> Known.XPT
                XSU -> Known.XSU
                XUA -> Known.XUA
                YER -> Known.YER
                ZAR -> Known.ZAR
                ZMW -> Known.ZMW
                ZWL -> Known.ZWL
                else -> throw HubSpotInvalidDataException("Unknown CurrencyCode: $value")
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

        fun validate(): CurrencyCode = apply {
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

            return other is CurrencyCode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicBudgetTotals &&
            budgetItems == other.budgetItems &&
            currencyCode == other.currencyCode &&
            spendItems == other.spendItems &&
            budgetTotal == other.budgetTotal &&
            remainingBudget == other.remainingBudget &&
            spendTotal == other.spendTotal &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            budgetItems,
            currencyCode,
            spendItems,
            budgetTotal,
            remainingBudget,
            spendTotal,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicBudgetTotals{budgetItems=$budgetItems, currencyCode=$currencyCode, spendItems=$spendItems, budgetTotal=$budgetTotal, remainingBudget=$remainingBudget, spendTotal=$spendTotal, additionalProperties=$additionalProperties}"
}
