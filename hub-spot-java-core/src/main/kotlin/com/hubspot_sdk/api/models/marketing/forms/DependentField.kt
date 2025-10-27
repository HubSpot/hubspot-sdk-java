// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

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
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A form field that will be displayed based on what the customer entered in another field. */
class DependentField
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dependentCondition: JsonField<DependentFieldFilter>,
    private val dependentField: JsonField<InnerDependentField>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dependentCondition")
        @ExcludeMissing
        dependentCondition: JsonField<DependentFieldFilter> = JsonMissing.of(),
        @JsonProperty("dependentField")
        @ExcludeMissing
        dependentField: JsonField<InnerDependentField> = JsonMissing.of(),
    ) : this(dependentCondition, dependentField, mutableMapOf())

    /**
     * A condition based on customer input
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependentCondition(): DependentFieldFilter =
        dependentCondition.getRequired("dependentCondition")

    /**
     * A form field used for collecting an email address.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dependentField(): InnerDependentField = dependentField.getRequired("dependentField")

    /**
     * Returns the raw JSON value of [dependentCondition].
     *
     * Unlike [dependentCondition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dependentCondition")
    @ExcludeMissing
    fun _dependentCondition(): JsonField<DependentFieldFilter> = dependentCondition

    /**
     * Returns the raw JSON value of [dependentField].
     *
     * Unlike [dependentField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dependentField")
    @ExcludeMissing
    fun _dependentField(): JsonField<InnerDependentField> = dependentField

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
         * Returns a mutable builder for constructing an instance of [DependentField].
         *
         * The following fields are required:
         * ```java
         * .dependentCondition()
         * .dependentField()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DependentField]. */
    class Builder internal constructor() {

        private var dependentCondition: JsonField<DependentFieldFilter>? = null
        private var dependentField: JsonField<InnerDependentField>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dependentField: DependentField) = apply {
            dependentCondition = dependentField.dependentCondition
            this.dependentField = dependentField.dependentField
            additionalProperties = dependentField.additionalProperties.toMutableMap()
        }

        /** A condition based on customer input */
        fun dependentCondition(dependentCondition: DependentFieldFilter) =
            dependentCondition(JsonField.of(dependentCondition))

        /**
         * Sets [Builder.dependentCondition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependentCondition] with a well-typed
         * [DependentFieldFilter] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dependentCondition(dependentCondition: JsonField<DependentFieldFilter>) = apply {
            this.dependentCondition = dependentCondition
        }

        /** A form field used for collecting an email address. */
        fun dependentField(dependentField: InnerDependentField) =
            dependentField(JsonField.of(dependentField))

        /**
         * Sets [Builder.dependentField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dependentField] with a well-typed [InnerDependentField]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dependentField(dependentField: JsonField<InnerDependentField>) = apply {
            this.dependentField = dependentField
        }

        /** Alias for calling [dependentField] with `InnerDependentField.ofEmail(email)`. */
        fun dependentField(email: EmailField) = dependentField(InnerDependentField.ofEmail(email))

        /** Alias for calling [dependentField] with `InnerDependentField.ofPhone(phone)`. */
        fun dependentField(phone: PhoneField) = dependentField(InnerDependentField.ofPhone(phone))

        /**
         * Alias for calling [dependentField] with `InnerDependentField.ofMobilePhone(mobilePhone)`.
         */
        fun dependentField(mobilePhone: MobilePhoneField) =
            dependentField(InnerDependentField.ofMobilePhone(mobilePhone))

        /**
         * Alias for calling [dependentField] with
         * `InnerDependentField.ofSingleLineText(singleLineText)`.
         */
        fun dependentField(singleLineText: SingleLineTextField) =
            dependentField(InnerDependentField.ofSingleLineText(singleLineText))

        /**
         * Alias for calling [dependentField] with
         * `InnerDependentField.ofMultiLineText(multiLineText)`.
         */
        fun dependentField(multiLineText: MultiLineTextField) =
            dependentField(InnerDependentField.ofMultiLineText(multiLineText))

        /** Alias for calling [dependentField] with `InnerDependentField.ofNumber(number)`. */
        fun dependentField(number: NumberField) =
            dependentField(InnerDependentField.ofNumber(number))

        /**
         * Alias for calling [dependentField] with
         * `InnerDependentField.ofSingleCheckbox(singleCheckbox)`.
         */
        fun dependentField(singleCheckbox: SingleCheckboxField) =
            dependentField(InnerDependentField.ofSingleCheckbox(singleCheckbox))

        /**
         * Alias for calling [dependentField] with
         * `InnerDependentField.ofMultipleCheckboxes(multipleCheckboxes)`.
         */
        fun dependentField(multipleCheckboxes: MultipleCheckboxesField) =
            dependentField(InnerDependentField.ofMultipleCheckboxes(multipleCheckboxes))

        /** Alias for calling [dependentField] with `InnerDependentField.ofDropdown(dropdown)`. */
        fun dependentField(dropdown: DropdownField) =
            dependentField(InnerDependentField.ofDropdown(dropdown))

        /** Alias for calling [dependentField] with `InnerDependentField.ofRadio(radio)`. */
        fun dependentField(radio: RadioField) = dependentField(InnerDependentField.ofRadio(radio))

        /**
         * Alias for calling [dependentField] with `InnerDependentField.ofDatepicker(datepicker)`.
         */
        fun dependentField(datepicker: DatepickerField) =
            dependentField(InnerDependentField.ofDatepicker(datepicker))

        /** Alias for calling [dependentField] with `InnerDependentField.ofFile(file)`. */
        fun dependentField(file: FileField) = dependentField(InnerDependentField.ofFile(file))

        /**
         * Alias for calling [dependentField] with
         * `InnerDependentField.ofPaymentLinkRadio(paymentLinkRadio)`.
         */
        fun dependentField(paymentLinkRadio: PaymentLinkRadioField) =
            dependentField(InnerDependentField.ofPaymentLinkRadio(paymentLinkRadio))

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
         * Returns an immutable instance of [DependentField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dependentCondition()
         * .dependentField()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DependentField =
            DependentField(
                checkRequired("dependentCondition", dependentCondition),
                checkRequired("dependentField", dependentField),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DependentField = apply {
        if (validated) {
            return@apply
        }

        dependentCondition().validate()
        dependentField().validate()
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
        (dependentCondition.asKnown().getOrNull()?.validity() ?: 0) +
            (dependentField.asKnown().getOrNull()?.validity() ?: 0)

    /** A form field used for collecting an email address. */
    @JsonDeserialize(using = InnerDependentField.Deserializer::class)
    @JsonSerialize(using = InnerDependentField.Serializer::class)
    class InnerDependentField
    private constructor(
        private val email: EmailField? = null,
        private val phone: PhoneField? = null,
        private val mobilePhone: MobilePhoneField? = null,
        private val singleLineText: SingleLineTextField? = null,
        private val multiLineText: MultiLineTextField? = null,
        private val number: NumberField? = null,
        private val singleCheckbox: SingleCheckboxField? = null,
        private val multipleCheckboxes: MultipleCheckboxesField? = null,
        private val dropdown: DropdownField? = null,
        private val radio: RadioField? = null,
        private val datepicker: DatepickerField? = null,
        private val file: FileField? = null,
        private val paymentLinkRadio: PaymentLinkRadioField? = null,
        private val _json: JsonValue? = null,
    ) {

        /** A form field used for collecting an email address. */
        fun email(): Optional<EmailField> = Optional.ofNullable(email)

        /** A form field used for collecting a phone number. */
        fun phone(): Optional<PhoneField> = Optional.ofNullable(phone)

        /** A form field used for collecting a mobile phone number. */
        fun mobilePhone(): Optional<MobilePhoneField> = Optional.ofNullable(mobilePhone)

        /** A form field consisting of a single-line text box. */
        fun singleLineText(): Optional<SingleLineTextField> = Optional.ofNullable(singleLineText)

        /** A form field consisting of a multiple-line text box. */
        fun multiLineText(): Optional<MultiLineTextField> = Optional.ofNullable(multiLineText)

        /** A form field used for collecting a numeric value. */
        fun number(): Optional<NumberField> = Optional.ofNullable(number)

        /** A form field consisting of a single checkbox. */
        fun singleCheckbox(): Optional<SingleCheckboxField> = Optional.ofNullable(singleCheckbox)

        /**
         * A form field consisting of a set of checkboxes allowing multiple choices to be selected
         * at one time.
         */
        fun multipleCheckboxes(): Optional<MultipleCheckboxesField> =
            Optional.ofNullable(multipleCheckboxes)

        /** A field consisting of a drop down with multiple choices. */
        fun dropdown(): Optional<DropdownField> = Optional.ofNullable(dropdown)

        /**
         * A form field consisting of a set of radio options, out of which one can be selected at a
         * time.
         */
        fun radio(): Optional<RadioField> = Optional.ofNullable(radio)

        /** A form field used to select a date */
        fun datepicker(): Optional<DatepickerField> = Optional.ofNullable(datepicker)

        /** A form field used for uploading one or more files. */
        fun file(): Optional<FileField> = Optional.ofNullable(file)

        fun paymentLinkRadio(): Optional<PaymentLinkRadioField> =
            Optional.ofNullable(paymentLinkRadio)

        fun isEmail(): Boolean = email != null

        fun isPhone(): Boolean = phone != null

        fun isMobilePhone(): Boolean = mobilePhone != null

        fun isSingleLineText(): Boolean = singleLineText != null

        fun isMultiLineText(): Boolean = multiLineText != null

        fun isNumber(): Boolean = number != null

        fun isSingleCheckbox(): Boolean = singleCheckbox != null

        fun isMultipleCheckboxes(): Boolean = multipleCheckboxes != null

        fun isDropdown(): Boolean = dropdown != null

        fun isRadio(): Boolean = radio != null

        fun isDatepicker(): Boolean = datepicker != null

        fun isFile(): Boolean = file != null

        fun isPaymentLinkRadio(): Boolean = paymentLinkRadio != null

        /** A form field used for collecting an email address. */
        fun asEmail(): EmailField = email.getOrThrow("email")

        /** A form field used for collecting a phone number. */
        fun asPhone(): PhoneField = phone.getOrThrow("phone")

        /** A form field used for collecting a mobile phone number. */
        fun asMobilePhone(): MobilePhoneField = mobilePhone.getOrThrow("mobilePhone")

        /** A form field consisting of a single-line text box. */
        fun asSingleLineText(): SingleLineTextField = singleLineText.getOrThrow("singleLineText")

        /** A form field consisting of a multiple-line text box. */
        fun asMultiLineText(): MultiLineTextField = multiLineText.getOrThrow("multiLineText")

        /** A form field used for collecting a numeric value. */
        fun asNumber(): NumberField = number.getOrThrow("number")

        /** A form field consisting of a single checkbox. */
        fun asSingleCheckbox(): SingleCheckboxField = singleCheckbox.getOrThrow("singleCheckbox")

        /**
         * A form field consisting of a set of checkboxes allowing multiple choices to be selected
         * at one time.
         */
        fun asMultipleCheckboxes(): MultipleCheckboxesField =
            multipleCheckboxes.getOrThrow("multipleCheckboxes")

        /** A field consisting of a drop down with multiple choices. */
        fun asDropdown(): DropdownField = dropdown.getOrThrow("dropdown")

        /**
         * A form field consisting of a set of radio options, out of which one can be selected at a
         * time.
         */
        fun asRadio(): RadioField = radio.getOrThrow("radio")

        /** A form field used to select a date */
        fun asDatepicker(): DatepickerField = datepicker.getOrThrow("datepicker")

        /** A form field used for uploading one or more files. */
        fun asFile(): FileField = file.getOrThrow("file")

        fun asPaymentLinkRadio(): PaymentLinkRadioField =
            paymentLinkRadio.getOrThrow("paymentLinkRadio")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                email != null -> visitor.visitEmail(email)
                phone != null -> visitor.visitPhone(phone)
                mobilePhone != null -> visitor.visitMobilePhone(mobilePhone)
                singleLineText != null -> visitor.visitSingleLineText(singleLineText)
                multiLineText != null -> visitor.visitMultiLineText(multiLineText)
                number != null -> visitor.visitNumber(number)
                singleCheckbox != null -> visitor.visitSingleCheckbox(singleCheckbox)
                multipleCheckboxes != null -> visitor.visitMultipleCheckboxes(multipleCheckboxes)
                dropdown != null -> visitor.visitDropdown(dropdown)
                radio != null -> visitor.visitRadio(radio)
                datepicker != null -> visitor.visitDatepicker(datepicker)
                file != null -> visitor.visitFile(file)
                paymentLinkRadio != null -> visitor.visitPaymentLinkRadio(paymentLinkRadio)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): InnerDependentField = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitEmail(email: EmailField) {
                        email.validate()
                    }

                    override fun visitPhone(phone: PhoneField) {
                        phone.validate()
                    }

                    override fun visitMobilePhone(mobilePhone: MobilePhoneField) {
                        mobilePhone.validate()
                    }

                    override fun visitSingleLineText(singleLineText: SingleLineTextField) {
                        singleLineText.validate()
                    }

                    override fun visitMultiLineText(multiLineText: MultiLineTextField) {
                        multiLineText.validate()
                    }

                    override fun visitNumber(number: NumberField) {
                        number.validate()
                    }

                    override fun visitSingleCheckbox(singleCheckbox: SingleCheckboxField) {
                        singleCheckbox.validate()
                    }

                    override fun visitMultipleCheckboxes(
                        multipleCheckboxes: MultipleCheckboxesField
                    ) {
                        multipleCheckboxes.validate()
                    }

                    override fun visitDropdown(dropdown: DropdownField) {
                        dropdown.validate()
                    }

                    override fun visitRadio(radio: RadioField) {
                        radio.validate()
                    }

                    override fun visitDatepicker(datepicker: DatepickerField) {
                        datepicker.validate()
                    }

                    override fun visitFile(file: FileField) {
                        file.validate()
                    }

                    override fun visitPaymentLinkRadio(paymentLinkRadio: PaymentLinkRadioField) {
                        paymentLinkRadio.validate()
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
                    override fun visitEmail(email: EmailField) = email.validity()

                    override fun visitPhone(phone: PhoneField) = phone.validity()

                    override fun visitMobilePhone(mobilePhone: MobilePhoneField) =
                        mobilePhone.validity()

                    override fun visitSingleLineText(singleLineText: SingleLineTextField) =
                        singleLineText.validity()

                    override fun visitMultiLineText(multiLineText: MultiLineTextField) =
                        multiLineText.validity()

                    override fun visitNumber(number: NumberField) = number.validity()

                    override fun visitSingleCheckbox(singleCheckbox: SingleCheckboxField) =
                        singleCheckbox.validity()

                    override fun visitMultipleCheckboxes(
                        multipleCheckboxes: MultipleCheckboxesField
                    ) = multipleCheckboxes.validity()

                    override fun visitDropdown(dropdown: DropdownField) = dropdown.validity()

                    override fun visitRadio(radio: RadioField) = radio.validity()

                    override fun visitDatepicker(datepicker: DatepickerField) =
                        datepicker.validity()

                    override fun visitFile(file: FileField) = file.validity()

                    override fun visitPaymentLinkRadio(paymentLinkRadio: PaymentLinkRadioField) =
                        paymentLinkRadio.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InnerDependentField &&
                email == other.email &&
                phone == other.phone &&
                mobilePhone == other.mobilePhone &&
                singleLineText == other.singleLineText &&
                multiLineText == other.multiLineText &&
                number == other.number &&
                singleCheckbox == other.singleCheckbox &&
                multipleCheckboxes == other.multipleCheckboxes &&
                dropdown == other.dropdown &&
                radio == other.radio &&
                datepicker == other.datepicker &&
                file == other.file &&
                paymentLinkRadio == other.paymentLinkRadio
        }

        override fun hashCode(): Int =
            Objects.hash(
                email,
                phone,
                mobilePhone,
                singleLineText,
                multiLineText,
                number,
                singleCheckbox,
                multipleCheckboxes,
                dropdown,
                radio,
                datepicker,
                file,
                paymentLinkRadio,
            )

        override fun toString(): String =
            when {
                email != null -> "InnerDependentField{email=$email}"
                phone != null -> "InnerDependentField{phone=$phone}"
                mobilePhone != null -> "InnerDependentField{mobilePhone=$mobilePhone}"
                singleLineText != null -> "InnerDependentField{singleLineText=$singleLineText}"
                multiLineText != null -> "InnerDependentField{multiLineText=$multiLineText}"
                number != null -> "InnerDependentField{number=$number}"
                singleCheckbox != null -> "InnerDependentField{singleCheckbox=$singleCheckbox}"
                multipleCheckboxes != null ->
                    "InnerDependentField{multipleCheckboxes=$multipleCheckboxes}"
                dropdown != null -> "InnerDependentField{dropdown=$dropdown}"
                radio != null -> "InnerDependentField{radio=$radio}"
                datepicker != null -> "InnerDependentField{datepicker=$datepicker}"
                file != null -> "InnerDependentField{file=$file}"
                paymentLinkRadio != null ->
                    "InnerDependentField{paymentLinkRadio=$paymentLinkRadio}"
                _json != null -> "InnerDependentField{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InnerDependentField")
            }

        companion object {

            /** A form field used for collecting an email address. */
            @JvmStatic fun ofEmail(email: EmailField) = InnerDependentField(email = email)

            /** A form field used for collecting a phone number. */
            @JvmStatic fun ofPhone(phone: PhoneField) = InnerDependentField(phone = phone)

            /** A form field used for collecting a mobile phone number. */
            @JvmStatic
            fun ofMobilePhone(mobilePhone: MobilePhoneField) =
                InnerDependentField(mobilePhone = mobilePhone)

            /** A form field consisting of a single-line text box. */
            @JvmStatic
            fun ofSingleLineText(singleLineText: SingleLineTextField) =
                InnerDependentField(singleLineText = singleLineText)

            /** A form field consisting of a multiple-line text box. */
            @JvmStatic
            fun ofMultiLineText(multiLineText: MultiLineTextField) =
                InnerDependentField(multiLineText = multiLineText)

            /** A form field used for collecting a numeric value. */
            @JvmStatic fun ofNumber(number: NumberField) = InnerDependentField(number = number)

            /** A form field consisting of a single checkbox. */
            @JvmStatic
            fun ofSingleCheckbox(singleCheckbox: SingleCheckboxField) =
                InnerDependentField(singleCheckbox = singleCheckbox)

            /**
             * A form field consisting of a set of checkboxes allowing multiple choices to be
             * selected at one time.
             */
            @JvmStatic
            fun ofMultipleCheckboxes(multipleCheckboxes: MultipleCheckboxesField) =
                InnerDependentField(multipleCheckboxes = multipleCheckboxes)

            /** A field consisting of a drop down with multiple choices. */
            @JvmStatic
            fun ofDropdown(dropdown: DropdownField) = InnerDependentField(dropdown = dropdown)

            /**
             * A form field consisting of a set of radio options, out of which one can be selected
             * at a time.
             */
            @JvmStatic fun ofRadio(radio: RadioField) = InnerDependentField(radio = radio)

            /** A form field used to select a date */
            @JvmStatic
            fun ofDatepicker(datepicker: DatepickerField) =
                InnerDependentField(datepicker = datepicker)

            /** A form field used for uploading one or more files. */
            @JvmStatic fun ofFile(file: FileField) = InnerDependentField(file = file)

            @JvmStatic
            fun ofPaymentLinkRadio(paymentLinkRadio: PaymentLinkRadioField) =
                InnerDependentField(paymentLinkRadio = paymentLinkRadio)
        }

        /**
         * An interface that defines how to map each variant of [InnerDependentField] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            /** A form field used for collecting an email address. */
            fun visitEmail(email: EmailField): T

            /** A form field used for collecting a phone number. */
            fun visitPhone(phone: PhoneField): T

            /** A form field used for collecting a mobile phone number. */
            fun visitMobilePhone(mobilePhone: MobilePhoneField): T

            /** A form field consisting of a single-line text box. */
            fun visitSingleLineText(singleLineText: SingleLineTextField): T

            /** A form field consisting of a multiple-line text box. */
            fun visitMultiLineText(multiLineText: MultiLineTextField): T

            /** A form field used for collecting a numeric value. */
            fun visitNumber(number: NumberField): T

            /** A form field consisting of a single checkbox. */
            fun visitSingleCheckbox(singleCheckbox: SingleCheckboxField): T

            /**
             * A form field consisting of a set of checkboxes allowing multiple choices to be
             * selected at one time.
             */
            fun visitMultipleCheckboxes(multipleCheckboxes: MultipleCheckboxesField): T

            /** A field consisting of a drop down with multiple choices. */
            fun visitDropdown(dropdown: DropdownField): T

            /**
             * A form field consisting of a set of radio options, out of which one can be selected
             * at a time.
             */
            fun visitRadio(radio: RadioField): T

            /** A form field used to select a date */
            fun visitDatepicker(datepicker: DatepickerField): T

            /** A form field used for uploading one or more files. */
            fun visitFile(file: FileField): T

            fun visitPaymentLinkRadio(paymentLinkRadio: PaymentLinkRadioField): T

            /**
             * Maps an unknown variant of [InnerDependentField] to a value of type [T].
             *
             * An instance of [InnerDependentField] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown InnerDependentField: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<InnerDependentField>(InnerDependentField::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InnerDependentField {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<EmailField>())?.let {
                                InnerDependentField(email = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PhoneField>())?.let {
                                InnerDependentField(phone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MobilePhoneField>())?.let {
                                InnerDependentField(mobilePhone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SingleLineTextField>())?.let {
                                InnerDependentField(singleLineText = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultiLineTextField>())?.let {
                                InnerDependentField(multiLineText = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberField>())?.let {
                                InnerDependentField(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SingleCheckboxField>())?.let {
                                InnerDependentField(singleCheckbox = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultipleCheckboxesField>())?.let {
                                InnerDependentField(multipleCheckboxes = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DropdownField>())?.let {
                                InnerDependentField(dropdown = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RadioField>())?.let {
                                InnerDependentField(radio = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DatepickerField>())?.let {
                                InnerDependentField(datepicker = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FileField>())?.let {
                                InnerDependentField(file = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentLinkRadioField>())?.let {
                                InnerDependentField(paymentLinkRadio = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> InnerDependentField(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<InnerDependentField>(InnerDependentField::class) {

            override fun serialize(
                value: InnerDependentField,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.email != null -> generator.writeObject(value.email)
                    value.phone != null -> generator.writeObject(value.phone)
                    value.mobilePhone != null -> generator.writeObject(value.mobilePhone)
                    value.singleLineText != null -> generator.writeObject(value.singleLineText)
                    value.multiLineText != null -> generator.writeObject(value.multiLineText)
                    value.number != null -> generator.writeObject(value.number)
                    value.singleCheckbox != null -> generator.writeObject(value.singleCheckbox)
                    value.multipleCheckboxes != null ->
                        generator.writeObject(value.multipleCheckboxes)
                    value.dropdown != null -> generator.writeObject(value.dropdown)
                    value.radio != null -> generator.writeObject(value.radio)
                    value.datepicker != null -> generator.writeObject(value.datepicker)
                    value.file != null -> generator.writeObject(value.file)
                    value.paymentLinkRadio != null -> generator.writeObject(value.paymentLinkRadio)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InnerDependentField")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DependentField &&
            dependentCondition == other.dependentCondition &&
            dependentField == other.dependentField &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dependentCondition, dependentField, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DependentField{dependentCondition=$dependentCondition, dependentField=$dependentField, additionalProperties=$additionalProperties}"
}
