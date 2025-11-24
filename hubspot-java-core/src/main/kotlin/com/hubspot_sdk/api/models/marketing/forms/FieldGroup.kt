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
import com.hubspot_sdk.api.core.Enum
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A collection of up to three form fields usually displayed in a row. */
class FieldGroup
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fields: JsonField<List<Field>>,
    private val groupType: JsonField<GroupType>,
    private val richTextType: JsonField<RichTextType>,
    private val richText: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fields") @ExcludeMissing fields: JsonField<List<Field>> = JsonMissing.of(),
        @JsonProperty("groupType")
        @ExcludeMissing
        groupType: JsonField<GroupType> = JsonMissing.of(),
        @JsonProperty("richTextType")
        @ExcludeMissing
        richTextType: JsonField<RichTextType> = JsonMissing.of(),
        @JsonProperty("richText") @ExcludeMissing richText: JsonField<String> = JsonMissing.of(),
    ) : this(fields, groupType, richTextType, richText, mutableMapOf())

    /**
     * The form fields included in the group
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fields(): List<Field> = fields.getRequired("fields")

    /**
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun groupType(): GroupType = groupType.getRequired("groupType")

    /**
     * The type of rich text included. The default value is text.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun richTextType(): RichTextType = richTextType.getRequired("richTextType")

    /**
     * A block of rich text or an image. Those can be used to add extra information for the
     * customers filling in the form. If the field group includes fields, the rich text will be
     * displayed before the fields.
     *
     * @throws HubspotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun richText(): Optional<String> = richText.getOptional("richText")

    /**
     * Returns the raw JSON value of [fields].
     *
     * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<List<Field>> = fields

    /**
     * Returns the raw JSON value of [groupType].
     *
     * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupType") @ExcludeMissing fun _groupType(): JsonField<GroupType> = groupType

    /**
     * Returns the raw JSON value of [richTextType].
     *
     * Unlike [richTextType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("richTextType")
    @ExcludeMissing
    fun _richTextType(): JsonField<RichTextType> = richTextType

    /**
     * Returns the raw JSON value of [richText].
     *
     * Unlike [richText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("richText") @ExcludeMissing fun _richText(): JsonField<String> = richText

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
         * Returns a mutable builder for constructing an instance of [FieldGroup].
         *
         * The following fields are required:
         * ```java
         * .fields()
         * .groupType()
         * .richTextType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FieldGroup]. */
    class Builder internal constructor() {

        private var fields: JsonField<MutableList<Field>>? = null
        private var groupType: JsonField<GroupType>? = null
        private var richTextType: JsonField<RichTextType>? = null
        private var richText: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fieldGroup: FieldGroup) = apply {
            fields = fieldGroup.fields.map { it.toMutableList() }
            groupType = fieldGroup.groupType
            richTextType = fieldGroup.richTextType
            richText = fieldGroup.richText
            additionalProperties = fieldGroup.additionalProperties.toMutableMap()
        }

        /** The form fields included in the group */
        fun fields(fields: List<Field>) = fields(JsonField.of(fields))

        /**
         * Sets [Builder.fields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fields] with a well-typed `List<Field>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fields(fields: JsonField<List<Field>>) = apply {
            this.fields = fields.map { it.toMutableList() }
        }

        /**
         * Adds a single [Field] to [fields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addField(field: Field) = apply {
            fields =
                (fields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fields", it).add(field)
                }
        }

        /** Alias for calling [addField] with `Field.ofEmail(email)`. */
        fun addField(email: EmailField) = addField(Field.ofEmail(email))

        /** Alias for calling [addField] with `Field.ofPhone(phone)`. */
        fun addField(phone: PhoneField) = addField(Field.ofPhone(phone))

        /** Alias for calling [addField] with `Field.ofMobilePhone(mobilePhone)`. */
        fun addField(mobilePhone: MobilePhoneField) = addField(Field.ofMobilePhone(mobilePhone))

        /** Alias for calling [addField] with `Field.ofSingleLineText(singleLineText)`. */
        fun addField(singleLineText: SingleLineTextField) =
            addField(Field.ofSingleLineText(singleLineText))

        /** Alias for calling [addField] with `Field.ofMultiLineText(multiLineText)`. */
        fun addField(multiLineText: MultiLineTextField) =
            addField(Field.ofMultiLineText(multiLineText))

        /** Alias for calling [addField] with `Field.ofNumber(number)`. */
        fun addField(number: NumberField) = addField(Field.ofNumber(number))

        /** Alias for calling [addField] with `Field.ofSingleCheckbox(singleCheckbox)`. */
        fun addField(singleCheckbox: SingleCheckboxField) =
            addField(Field.ofSingleCheckbox(singleCheckbox))

        /** Alias for calling [addField] with `Field.ofMultipleCheckboxes(multipleCheckboxes)`. */
        fun addField(multipleCheckboxes: MultipleCheckboxesField) =
            addField(Field.ofMultipleCheckboxes(multipleCheckboxes))

        /** Alias for calling [addField] with `Field.ofDropdown(dropdown)`. */
        fun addField(dropdown: DropdownField) = addField(Field.ofDropdown(dropdown))

        /** Alias for calling [addField] with `Field.ofRadio(radio)`. */
        fun addField(radio: RadioField) = addField(Field.ofRadio(radio))

        /** Alias for calling [addField] with `Field.ofDatepicker(datepicker)`. */
        fun addField(datepicker: DatepickerField) = addField(Field.ofDatepicker(datepicker))

        /** Alias for calling [addField] with `Field.ofFile(file)`. */
        fun addField(file: FileField) = addField(Field.ofFile(file))

        /** Alias for calling [addField] with `Field.ofPaymentLinkRadio(paymentLinkRadio)`. */
        fun addField(paymentLinkRadio: PaymentLinkRadioField) =
            addField(Field.ofPaymentLinkRadio(paymentLinkRadio))

        fun groupType(groupType: GroupType) = groupType(JsonField.of(groupType))

        /**
         * Sets [Builder.groupType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupType] with a well-typed [GroupType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupType(groupType: JsonField<GroupType>) = apply { this.groupType = groupType }

        /** The type of rich text included. The default value is text. */
        fun richTextType(richTextType: RichTextType) = richTextType(JsonField.of(richTextType))

        /**
         * Sets [Builder.richTextType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richTextType] with a well-typed [RichTextType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun richTextType(richTextType: JsonField<RichTextType>) = apply {
            this.richTextType = richTextType
        }

        /**
         * A block of rich text or an image. Those can be used to add extra information for the
         * customers filling in the form. If the field group includes fields, the rich text will be
         * displayed before the fields.
         */
        fun richText(richText: String) = richText(JsonField.of(richText))

        /**
         * Sets [Builder.richText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.richText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun richText(richText: JsonField<String>) = apply { this.richText = richText }

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
         * Returns an immutable instance of [FieldGroup].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fields()
         * .groupType()
         * .richTextType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FieldGroup =
            FieldGroup(
                checkRequired("fields", fields).map { it.toImmutable() },
                checkRequired("groupType", groupType),
                checkRequired("richTextType", richTextType),
                richText,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FieldGroup = apply {
        if (validated) {
            return@apply
        }

        fields().forEach { it.validate() }
        groupType().validate()
        richTextType().validate()
        richText()
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
        (fields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (groupType.asKnown().getOrNull()?.validity() ?: 0) +
            (richTextType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (richText.asKnown().isPresent) 1 else 0)

    /** A form field used for collecting an email address. */
    @JsonDeserialize(using = Field.Deserializer::class)
    @JsonSerialize(using = Field.Serializer::class)
    class Field
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

        fun validate(): Field = apply {
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

            return other is Field &&
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
                email != null -> "Field{email=$email}"
                phone != null -> "Field{phone=$phone}"
                mobilePhone != null -> "Field{mobilePhone=$mobilePhone}"
                singleLineText != null -> "Field{singleLineText=$singleLineText}"
                multiLineText != null -> "Field{multiLineText=$multiLineText}"
                number != null -> "Field{number=$number}"
                singleCheckbox != null -> "Field{singleCheckbox=$singleCheckbox}"
                multipleCheckboxes != null -> "Field{multipleCheckboxes=$multipleCheckboxes}"
                dropdown != null -> "Field{dropdown=$dropdown}"
                radio != null -> "Field{radio=$radio}"
                datepicker != null -> "Field{datepicker=$datepicker}"
                file != null -> "Field{file=$file}"
                paymentLinkRadio != null -> "Field{paymentLinkRadio=$paymentLinkRadio}"
                _json != null -> "Field{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Field")
            }

        companion object {

            /** A form field used for collecting an email address. */
            @JvmStatic fun ofEmail(email: EmailField) = Field(email = email)

            /** A form field used for collecting a phone number. */
            @JvmStatic fun ofPhone(phone: PhoneField) = Field(phone = phone)

            /** A form field used for collecting a mobile phone number. */
            @JvmStatic
            fun ofMobilePhone(mobilePhone: MobilePhoneField) = Field(mobilePhone = mobilePhone)

            /** A form field consisting of a single-line text box. */
            @JvmStatic
            fun ofSingleLineText(singleLineText: SingleLineTextField) =
                Field(singleLineText = singleLineText)

            /** A form field consisting of a multiple-line text box. */
            @JvmStatic
            fun ofMultiLineText(multiLineText: MultiLineTextField) =
                Field(multiLineText = multiLineText)

            /** A form field used for collecting a numeric value. */
            @JvmStatic fun ofNumber(number: NumberField) = Field(number = number)

            /** A form field consisting of a single checkbox. */
            @JvmStatic
            fun ofSingleCheckbox(singleCheckbox: SingleCheckboxField) =
                Field(singleCheckbox = singleCheckbox)

            /**
             * A form field consisting of a set of checkboxes allowing multiple choices to be
             * selected at one time.
             */
            @JvmStatic
            fun ofMultipleCheckboxes(multipleCheckboxes: MultipleCheckboxesField) =
                Field(multipleCheckboxes = multipleCheckboxes)

            /** A field consisting of a drop down with multiple choices. */
            @JvmStatic fun ofDropdown(dropdown: DropdownField) = Field(dropdown = dropdown)

            /**
             * A form field consisting of a set of radio options, out of which one can be selected
             * at a time.
             */
            @JvmStatic fun ofRadio(radio: RadioField) = Field(radio = radio)

            /** A form field used to select a date */
            @JvmStatic
            fun ofDatepicker(datepicker: DatepickerField) = Field(datepicker = datepicker)

            /** A form field used for uploading one or more files. */
            @JvmStatic fun ofFile(file: FileField) = Field(file = file)

            @JvmStatic
            fun ofPaymentLinkRadio(paymentLinkRadio: PaymentLinkRadioField) =
                Field(paymentLinkRadio = paymentLinkRadio)
        }

        /** An interface that defines how to map each variant of [Field] to a value of type [T]. */
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
             * Maps an unknown variant of [Field] to a value of type [T].
             *
             * An instance of [Field] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubspotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubspotInvalidDataException("Unknown Field: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Field>(Field::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Field {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<EmailField>())?.let {
                                Field(email = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PhoneField>())?.let {
                                Field(phone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MobilePhoneField>())?.let {
                                Field(mobilePhone = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SingleLineTextField>())?.let {
                                Field(singleLineText = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultiLineTextField>())?.let {
                                Field(multiLineText = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NumberField>())?.let {
                                Field(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SingleCheckboxField>())?.let {
                                Field(singleCheckbox = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<MultipleCheckboxesField>())?.let {
                                Field(multipleCheckboxes = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DropdownField>())?.let {
                                Field(dropdown = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<RadioField>())?.let {
                                Field(radio = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DatepickerField>())?.let {
                                Field(datepicker = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<FileField>())?.let {
                                Field(file = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PaymentLinkRadioField>())?.let {
                                Field(paymentLinkRadio = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Field(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Field>(Field::class) {

            override fun serialize(
                value: Field,
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
                    else -> throw IllegalStateException("Invalid Field")
                }
            }
        }
    }

    class GroupType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DEFAULT_GROUP = of("default_group")

            @JvmField val PROGRESSIVE = of("progressive")

            @JvmField val QUEUED = of("queued")

            @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
        }

        /** An enum containing [GroupType]'s known values. */
        enum class Known {
            DEFAULT_GROUP,
            PROGRESSIVE,
            QUEUED,
        }

        /**
         * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GroupType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DEFAULT_GROUP,
            PROGRESSIVE,
            QUEUED,
            /**
             * An enum member indicating that [GroupType] was instantiated with an unknown value.
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
                DEFAULT_GROUP -> Value.DEFAULT_GROUP
                PROGRESSIVE -> Value.PROGRESSIVE
                QUEUED -> Value.QUEUED
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
                DEFAULT_GROUP -> Known.DEFAULT_GROUP
                PROGRESSIVE -> Known.PROGRESSIVE
                QUEUED -> Known.QUEUED
                else -> throw HubspotInvalidDataException("Unknown GroupType: $value")
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

        fun validate(): GroupType = apply {
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

            return other is GroupType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of rich text included. The default value is text. */
    class RichTextType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val IMAGE = of("image")

            @JvmField val TEXT = of("text")

            @JvmStatic fun of(value: String) = RichTextType(JsonField.of(value))
        }

        /** An enum containing [RichTextType]'s known values. */
        enum class Known {
            IMAGE,
            TEXT,
        }

        /**
         * An enum containing [RichTextType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RichTextType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMAGE,
            TEXT,
            /**
             * An enum member indicating that [RichTextType] was instantiated with an unknown value.
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
                IMAGE -> Value.IMAGE
                TEXT -> Value.TEXT
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
                IMAGE -> Known.IMAGE
                TEXT -> Known.TEXT
                else -> throw HubspotInvalidDataException("Unknown RichTextType: $value")
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

        fun validate(): RichTextType = apply {
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

            return other is RichTextType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FieldGroup &&
            fields == other.fields &&
            groupType == other.groupType &&
            richTextType == other.richTextType &&
            richText == other.richText &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fields, groupType, richTextType, richText, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FieldGroup{fields=$fields, groupType=$groupType, richTextType=$richTextType, richText=$richText, additionalProperties=$additionalProperties}"
}
