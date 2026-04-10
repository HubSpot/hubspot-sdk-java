// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PublicEmailContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val flexAreas: JsonField<FlexAreas>,
    private val plainTextVersion: JsonField<String>,
    private val smartFields: JsonField<SmartFields>,
    private val styleSettings: JsonField<PublicEmailStyleSettings>,
    private val templatePath: JsonField<String>,
    private val themeSettingsValues: JsonField<ThemeSettingsValues>,
    private val widgetContainers: JsonField<WidgetContainers>,
    private val widgets: JsonField<Widgets>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("flexAreas")
        @ExcludeMissing
        flexAreas: JsonField<FlexAreas> = JsonMissing.of(),
        @JsonProperty("plainTextVersion")
        @ExcludeMissing
        plainTextVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("smartFields")
        @ExcludeMissing
        smartFields: JsonField<SmartFields> = JsonMissing.of(),
        @JsonProperty("styleSettings")
        @ExcludeMissing
        styleSettings: JsonField<PublicEmailStyleSettings> = JsonMissing.of(),
        @JsonProperty("templatePath")
        @ExcludeMissing
        templatePath: JsonField<String> = JsonMissing.of(),
        @JsonProperty("themeSettingsValues")
        @ExcludeMissing
        themeSettingsValues: JsonField<ThemeSettingsValues> = JsonMissing.of(),
        @JsonProperty("widgetContainers")
        @ExcludeMissing
        widgetContainers: JsonField<WidgetContainers> = JsonMissing.of(),
        @JsonProperty("widgets") @ExcludeMissing widgets: JsonField<Widgets> = JsonMissing.of(),
    ) : this(
        flexAreas,
        plainTextVersion,
        smartFields,
        styleSettings,
        templatePath,
        themeSettingsValues,
        widgetContainers,
        widgets,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flexAreas(): Optional<FlexAreas> = flexAreas.getOptional("flexAreas")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun plainTextVersion(): Optional<String> = plainTextVersion.getOptional("plainTextVersion")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun smartFields(): Optional<SmartFields> = smartFields.getOptional("smartFields")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun styleSettings(): Optional<PublicEmailStyleSettings> =
        styleSettings.getOptional("styleSettings")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templatePath(): Optional<String> = templatePath.getOptional("templatePath")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun themeSettingsValues(): Optional<ThemeSettingsValues> =
        themeSettingsValues.getOptional("themeSettingsValues")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun widgetContainers(): Optional<WidgetContainers> =
        widgetContainers.getOptional("widgetContainers")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun widgets(): Optional<Widgets> = widgets.getOptional("widgets")

    /**
     * Returns the raw JSON value of [flexAreas].
     *
     * Unlike [flexAreas], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flexAreas") @ExcludeMissing fun _flexAreas(): JsonField<FlexAreas> = flexAreas

    /**
     * Returns the raw JSON value of [plainTextVersion].
     *
     * Unlike [plainTextVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("plainTextVersion")
    @ExcludeMissing
    fun _plainTextVersion(): JsonField<String> = plainTextVersion

    /**
     * Returns the raw JSON value of [smartFields].
     *
     * Unlike [smartFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("smartFields")
    @ExcludeMissing
    fun _smartFields(): JsonField<SmartFields> = smartFields

    /**
     * Returns the raw JSON value of [styleSettings].
     *
     * Unlike [styleSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("styleSettings")
    @ExcludeMissing
    fun _styleSettings(): JsonField<PublicEmailStyleSettings> = styleSettings

    /**
     * Returns the raw JSON value of [templatePath].
     *
     * Unlike [templatePath], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("templatePath")
    @ExcludeMissing
    fun _templatePath(): JsonField<String> = templatePath

    /**
     * Returns the raw JSON value of [themeSettingsValues].
     *
     * Unlike [themeSettingsValues], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("themeSettingsValues")
    @ExcludeMissing
    fun _themeSettingsValues(): JsonField<ThemeSettingsValues> = themeSettingsValues

    /**
     * Returns the raw JSON value of [widgetContainers].
     *
     * Unlike [widgetContainers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("widgetContainers")
    @ExcludeMissing
    fun _widgetContainers(): JsonField<WidgetContainers> = widgetContainers

    /**
     * Returns the raw JSON value of [widgets].
     *
     * Unlike [widgets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("widgets") @ExcludeMissing fun _widgets(): JsonField<Widgets> = widgets

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

        /** Returns a mutable builder for constructing an instance of [PublicEmailContent]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PublicEmailContent]. */
    class Builder internal constructor() {

        private var flexAreas: JsonField<FlexAreas> = JsonMissing.of()
        private var plainTextVersion: JsonField<String> = JsonMissing.of()
        private var smartFields: JsonField<SmartFields> = JsonMissing.of()
        private var styleSettings: JsonField<PublicEmailStyleSettings> = JsonMissing.of()
        private var templatePath: JsonField<String> = JsonMissing.of()
        private var themeSettingsValues: JsonField<ThemeSettingsValues> = JsonMissing.of()
        private var widgetContainers: JsonField<WidgetContainers> = JsonMissing.of()
        private var widgets: JsonField<Widgets> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicEmailContent: PublicEmailContent) = apply {
            flexAreas = publicEmailContent.flexAreas
            plainTextVersion = publicEmailContent.plainTextVersion
            smartFields = publicEmailContent.smartFields
            styleSettings = publicEmailContent.styleSettings
            templatePath = publicEmailContent.templatePath
            themeSettingsValues = publicEmailContent.themeSettingsValues
            widgetContainers = publicEmailContent.widgetContainers
            widgets = publicEmailContent.widgets
            additionalProperties = publicEmailContent.additionalProperties.toMutableMap()
        }

        fun flexAreas(flexAreas: FlexAreas) = flexAreas(JsonField.of(flexAreas))

        /**
         * Sets [Builder.flexAreas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flexAreas] with a well-typed [FlexAreas] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flexAreas(flexAreas: JsonField<FlexAreas>) = apply { this.flexAreas = flexAreas }

        fun plainTextVersion(plainTextVersion: String) =
            plainTextVersion(JsonField.of(plainTextVersion))

        /**
         * Sets [Builder.plainTextVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plainTextVersion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun plainTextVersion(plainTextVersion: JsonField<String>) = apply {
            this.plainTextVersion = plainTextVersion
        }

        fun smartFields(smartFields: SmartFields) = smartFields(JsonField.of(smartFields))

        /**
         * Sets [Builder.smartFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.smartFields] with a well-typed [SmartFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun smartFields(smartFields: JsonField<SmartFields>) = apply {
            this.smartFields = smartFields
        }

        fun styleSettings(styleSettings: PublicEmailStyleSettings) =
            styleSettings(JsonField.of(styleSettings))

        /**
         * Sets [Builder.styleSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.styleSettings] with a well-typed
         * [PublicEmailStyleSettings] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun styleSettings(styleSettings: JsonField<PublicEmailStyleSettings>) = apply {
            this.styleSettings = styleSettings
        }

        fun templatePath(templatePath: String) = templatePath(JsonField.of(templatePath))

        /**
         * Sets [Builder.templatePath] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templatePath] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templatePath(templatePath: JsonField<String>) = apply {
            this.templatePath = templatePath
        }

        fun themeSettingsValues(themeSettingsValues: ThemeSettingsValues) =
            themeSettingsValues(JsonField.of(themeSettingsValues))

        /**
         * Sets [Builder.themeSettingsValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.themeSettingsValues] with a well-typed
         * [ThemeSettingsValues] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun themeSettingsValues(themeSettingsValues: JsonField<ThemeSettingsValues>) = apply {
            this.themeSettingsValues = themeSettingsValues
        }

        fun widgetContainers(widgetContainers: WidgetContainers) =
            widgetContainers(JsonField.of(widgetContainers))

        /**
         * Sets [Builder.widgetContainers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widgetContainers] with a well-typed [WidgetContainers]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun widgetContainers(widgetContainers: JsonField<WidgetContainers>) = apply {
            this.widgetContainers = widgetContainers
        }

        fun widgets(widgets: Widgets) = widgets(JsonField.of(widgets))

        /**
         * Sets [Builder.widgets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.widgets] with a well-typed [Widgets] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun widgets(widgets: JsonField<Widgets>) = apply { this.widgets = widgets }

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
         * Returns an immutable instance of [PublicEmailContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PublicEmailContent =
            PublicEmailContent(
                flexAreas,
                plainTextVersion,
                smartFields,
                styleSettings,
                templatePath,
                themeSettingsValues,
                widgetContainers,
                widgets,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PublicEmailContent = apply {
        if (validated) {
            return@apply
        }

        flexAreas().ifPresent { it.validate() }
        plainTextVersion()
        smartFields().ifPresent { it.validate() }
        styleSettings().ifPresent { it.validate() }
        templatePath()
        themeSettingsValues().ifPresent { it.validate() }
        widgetContainers().ifPresent { it.validate() }
        widgets().ifPresent { it.validate() }
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
        (flexAreas.asKnown().getOrNull()?.validity() ?: 0) +
            (if (plainTextVersion.asKnown().isPresent) 1 else 0) +
            (smartFields.asKnown().getOrNull()?.validity() ?: 0) +
            (styleSettings.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templatePath.asKnown().isPresent) 1 else 0) +
            (themeSettingsValues.asKnown().getOrNull()?.validity() ?: 0) +
            (widgetContainers.asKnown().getOrNull()?.validity() ?: 0) +
            (widgets.asKnown().getOrNull()?.validity() ?: 0)

    class FlexAreas
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

            /** Returns a mutable builder for constructing an instance of [FlexAreas]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FlexAreas]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(flexAreas: FlexAreas) = apply {
                additionalProperties = flexAreas.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FlexAreas].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FlexAreas = FlexAreas(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): FlexAreas = apply {
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

            return other is FlexAreas && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FlexAreas{additionalProperties=$additionalProperties}"
    }

    class SmartFields
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

            /** Returns a mutable builder for constructing an instance of [SmartFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SmartFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(smartFields: SmartFields) = apply {
                additionalProperties = smartFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SmartFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SmartFields = SmartFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): SmartFields = apply {
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

            return other is SmartFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SmartFields{additionalProperties=$additionalProperties}"
    }

    class ThemeSettingsValues
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

            /** Returns a mutable builder for constructing an instance of [ThemeSettingsValues]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ThemeSettingsValues]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(themeSettingsValues: ThemeSettingsValues) = apply {
                additionalProperties = themeSettingsValues.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ThemeSettingsValues].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ThemeSettingsValues =
                ThemeSettingsValues(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ThemeSettingsValues = apply {
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

            return other is ThemeSettingsValues &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ThemeSettingsValues{additionalProperties=$additionalProperties}"
    }

    class WidgetContainers
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

            /** Returns a mutable builder for constructing an instance of [WidgetContainers]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [WidgetContainers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(widgetContainers: WidgetContainers) = apply {
                additionalProperties = widgetContainers.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [WidgetContainers].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): WidgetContainers = WidgetContainers(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): WidgetContainers = apply {
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

            return other is WidgetContainers && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "WidgetContainers{additionalProperties=$additionalProperties}"
    }

    class Widgets
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

            /** Returns a mutable builder for constructing an instance of [Widgets]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Widgets]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(widgets: Widgets) = apply {
                additionalProperties = widgets.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Widgets].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Widgets = Widgets(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Widgets = apply {
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

            return other is Widgets && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Widgets{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicEmailContent &&
            flexAreas == other.flexAreas &&
            plainTextVersion == other.plainTextVersion &&
            smartFields == other.smartFields &&
            styleSettings == other.styleSettings &&
            templatePath == other.templatePath &&
            themeSettingsValues == other.themeSettingsValues &&
            widgetContainers == other.widgetContainers &&
            widgets == other.widgets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            flexAreas,
            plainTextVersion,
            smartFields,
            styleSettings,
            templatePath,
            themeSettingsValues,
            widgetContainers,
            widgets,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PublicEmailContent{flexAreas=$flexAreas, plainTextVersion=$plainTextVersion, smartFields=$smartFields, styleSettings=$styleSettings, templatePath=$templatePath, themeSettingsValues=$themeSettingsValues, widgetContainers=$widgetContainers, widgets=$widgets, additionalProperties=$additionalProperties}"
}
