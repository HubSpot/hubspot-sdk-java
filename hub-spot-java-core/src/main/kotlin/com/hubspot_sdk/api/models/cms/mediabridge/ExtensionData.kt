// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.hubspot_sdk.api.core.ExcludeMissing
import com.hubspot_sdk.api.core.JsonField
import com.hubspot_sdk.api.core.JsonMissing
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExtensionData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val extensionStatusMap: JsonField<ExtensionStatusMap>,
    private val tags: JsonField<List<String>>,
    private val caseChangeTestExtensionData: JsonField<CaseChangeTestExtensionData>,
    private val optionDecoratorsExtensionData: JsonField<OptionDecoratorsExtensionData>,
    private val requiredPropertiesExtensionData: JsonField<RequiredPropertiesExtensionData>,
    private val softRequiredPropertiesExtensionData: JsonField<SoftRequiredPropertiesExtensionData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("extensionStatusMap")
        @ExcludeMissing
        extensionStatusMap: JsonField<ExtensionStatusMap> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("caseChangeTestExtensionData")
        @ExcludeMissing
        caseChangeTestExtensionData: JsonField<CaseChangeTestExtensionData> = JsonMissing.of(),
        @JsonProperty("optionDecoratorsExtensionData")
        @ExcludeMissing
        optionDecoratorsExtensionData: JsonField<OptionDecoratorsExtensionData> = JsonMissing.of(),
        @JsonProperty("requiredPropertiesExtensionData")
        @ExcludeMissing
        requiredPropertiesExtensionData: JsonField<RequiredPropertiesExtensionData> =
            JsonMissing.of(),
        @JsonProperty("softRequiredPropertiesExtensionData")
        @ExcludeMissing
        softRequiredPropertiesExtensionData: JsonField<SoftRequiredPropertiesExtensionData> =
            JsonMissing.of(),
    ) : this(
        extensionStatusMap,
        tags,
        caseChangeTestExtensionData,
        optionDecoratorsExtensionData,
        requiredPropertiesExtensionData,
        softRequiredPropertiesExtensionData,
        mutableMapOf(),
    )

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun extensionStatusMap(): ExtensionStatusMap =
        extensionStatusMap.getRequired("extensionStatusMap")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String> = tags.getRequired("tags")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun caseChangeTestExtensionData(): Optional<CaseChangeTestExtensionData> =
        caseChangeTestExtensionData.getOptional("caseChangeTestExtensionData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun optionDecoratorsExtensionData(): Optional<OptionDecoratorsExtensionData> =
        optionDecoratorsExtensionData.getOptional("optionDecoratorsExtensionData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requiredPropertiesExtensionData(): Optional<RequiredPropertiesExtensionData> =
        requiredPropertiesExtensionData.getOptional("requiredPropertiesExtensionData")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun softRequiredPropertiesExtensionData(): Optional<SoftRequiredPropertiesExtensionData> =
        softRequiredPropertiesExtensionData.getOptional("softRequiredPropertiesExtensionData")

    /**
     * Returns the raw JSON value of [extensionStatusMap].
     *
     * Unlike [extensionStatusMap], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("extensionStatusMap")
    @ExcludeMissing
    fun _extensionStatusMap(): JsonField<ExtensionStatusMap> = extensionStatusMap

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [caseChangeTestExtensionData].
     *
     * Unlike [caseChangeTestExtensionData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("caseChangeTestExtensionData")
    @ExcludeMissing
    fun _caseChangeTestExtensionData(): JsonField<CaseChangeTestExtensionData> =
        caseChangeTestExtensionData

    /**
     * Returns the raw JSON value of [optionDecoratorsExtensionData].
     *
     * Unlike [optionDecoratorsExtensionData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("optionDecoratorsExtensionData")
    @ExcludeMissing
    fun _optionDecoratorsExtensionData(): JsonField<OptionDecoratorsExtensionData> =
        optionDecoratorsExtensionData

    /**
     * Returns the raw JSON value of [requiredPropertiesExtensionData].
     *
     * Unlike [requiredPropertiesExtensionData], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("requiredPropertiesExtensionData")
    @ExcludeMissing
    fun _requiredPropertiesExtensionData(): JsonField<RequiredPropertiesExtensionData> =
        requiredPropertiesExtensionData

    /**
     * Returns the raw JSON value of [softRequiredPropertiesExtensionData].
     *
     * Unlike [softRequiredPropertiesExtensionData], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("softRequiredPropertiesExtensionData")
    @ExcludeMissing
    fun _softRequiredPropertiesExtensionData(): JsonField<SoftRequiredPropertiesExtensionData> =
        softRequiredPropertiesExtensionData

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
         * Returns a mutable builder for constructing an instance of [ExtensionData].
         *
         * The following fields are required:
         * ```java
         * .extensionStatusMap()
         * .tags()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExtensionData]. */
    class Builder internal constructor() {

        private var extensionStatusMap: JsonField<ExtensionStatusMap>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var caseChangeTestExtensionData: JsonField<CaseChangeTestExtensionData> =
            JsonMissing.of()
        private var optionDecoratorsExtensionData: JsonField<OptionDecoratorsExtensionData> =
            JsonMissing.of()
        private var requiredPropertiesExtensionData: JsonField<RequiredPropertiesExtensionData> =
            JsonMissing.of()
        private var softRequiredPropertiesExtensionData:
            JsonField<SoftRequiredPropertiesExtensionData> =
            JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(extensionData: ExtensionData) = apply {
            extensionStatusMap = extensionData.extensionStatusMap
            tags = extensionData.tags.map { it.toMutableList() }
            caseChangeTestExtensionData = extensionData.caseChangeTestExtensionData
            optionDecoratorsExtensionData = extensionData.optionDecoratorsExtensionData
            requiredPropertiesExtensionData = extensionData.requiredPropertiesExtensionData
            softRequiredPropertiesExtensionData = extensionData.softRequiredPropertiesExtensionData
            additionalProperties = extensionData.additionalProperties.toMutableMap()
        }

        fun extensionStatusMap(extensionStatusMap: ExtensionStatusMap) =
            extensionStatusMap(JsonField.of(extensionStatusMap))

        /**
         * Sets [Builder.extensionStatusMap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extensionStatusMap] with a well-typed
         * [ExtensionStatusMap] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun extensionStatusMap(extensionStatusMap: JsonField<ExtensionStatusMap>) = apply {
            this.extensionStatusMap = extensionStatusMap
        }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun caseChangeTestExtensionData(caseChangeTestExtensionData: CaseChangeTestExtensionData) =
            caseChangeTestExtensionData(JsonField.of(caseChangeTestExtensionData))

        /**
         * Sets [Builder.caseChangeTestExtensionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.caseChangeTestExtensionData] with a well-typed
         * [CaseChangeTestExtensionData] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun caseChangeTestExtensionData(
            caseChangeTestExtensionData: JsonField<CaseChangeTestExtensionData>
        ) = apply { this.caseChangeTestExtensionData = caseChangeTestExtensionData }

        fun optionDecoratorsExtensionData(
            optionDecoratorsExtensionData: OptionDecoratorsExtensionData
        ) = optionDecoratorsExtensionData(JsonField.of(optionDecoratorsExtensionData))

        /**
         * Sets [Builder.optionDecoratorsExtensionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.optionDecoratorsExtensionData] with a well-typed
         * [OptionDecoratorsExtensionData] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun optionDecoratorsExtensionData(
            optionDecoratorsExtensionData: JsonField<OptionDecoratorsExtensionData>
        ) = apply { this.optionDecoratorsExtensionData = optionDecoratorsExtensionData }

        fun requiredPropertiesExtensionData(
            requiredPropertiesExtensionData: RequiredPropertiesExtensionData
        ) = requiredPropertiesExtensionData(JsonField.of(requiredPropertiesExtensionData))

        /**
         * Sets [Builder.requiredPropertiesExtensionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requiredPropertiesExtensionData] with a well-typed
         * [RequiredPropertiesExtensionData] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun requiredPropertiesExtensionData(
            requiredPropertiesExtensionData: JsonField<RequiredPropertiesExtensionData>
        ) = apply { this.requiredPropertiesExtensionData = requiredPropertiesExtensionData }

        fun softRequiredPropertiesExtensionData(
            softRequiredPropertiesExtensionData: SoftRequiredPropertiesExtensionData
        ) = softRequiredPropertiesExtensionData(JsonField.of(softRequiredPropertiesExtensionData))

        /**
         * Sets [Builder.softRequiredPropertiesExtensionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.softRequiredPropertiesExtensionData] with a well-typed
         * [SoftRequiredPropertiesExtensionData] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun softRequiredPropertiesExtensionData(
            softRequiredPropertiesExtensionData: JsonField<SoftRequiredPropertiesExtensionData>
        ) = apply { this.softRequiredPropertiesExtensionData = softRequiredPropertiesExtensionData }

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
         * Returns an immutable instance of [ExtensionData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .extensionStatusMap()
         * .tags()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExtensionData =
            ExtensionData(
                checkRequired("extensionStatusMap", extensionStatusMap),
                checkRequired("tags", tags).map { it.toImmutable() },
                caseChangeTestExtensionData,
                optionDecoratorsExtensionData,
                requiredPropertiesExtensionData,
                softRequiredPropertiesExtensionData,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExtensionData = apply {
        if (validated) {
            return@apply
        }

        extensionStatusMap().validate()
        tags()
        caseChangeTestExtensionData().ifPresent { it.validate() }
        optionDecoratorsExtensionData().ifPresent { it.validate() }
        requiredPropertiesExtensionData().ifPresent { it.validate() }
        softRequiredPropertiesExtensionData().ifPresent { it.validate() }
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
        (extensionStatusMap.asKnown().getOrNull()?.validity() ?: 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (caseChangeTestExtensionData.asKnown().getOrNull()?.validity() ?: 0) +
            (optionDecoratorsExtensionData.asKnown().getOrNull()?.validity() ?: 0) +
            (requiredPropertiesExtensionData.asKnown().getOrNull()?.validity() ?: 0) +
            (softRequiredPropertiesExtensionData.asKnown().getOrNull()?.validity() ?: 0)

    class ExtensionStatusMap
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

            /** Returns a mutable builder for constructing an instance of [ExtensionStatusMap]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExtensionStatusMap]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extensionStatusMap: ExtensionStatusMap) = apply {
                additionalProperties = extensionStatusMap.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ExtensionStatusMap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExtensionStatusMap = ExtensionStatusMap(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ExtensionStatusMap = apply {
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

            return other is ExtensionStatusMap && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ExtensionStatusMap{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExtensionData &&
            extensionStatusMap == other.extensionStatusMap &&
            tags == other.tags &&
            caseChangeTestExtensionData == other.caseChangeTestExtensionData &&
            optionDecoratorsExtensionData == other.optionDecoratorsExtensionData &&
            requiredPropertiesExtensionData == other.requiredPropertiesExtensionData &&
            softRequiredPropertiesExtensionData == other.softRequiredPropertiesExtensionData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            extensionStatusMap,
            tags,
            caseChangeTestExtensionData,
            optionDecoratorsExtensionData,
            requiredPropertiesExtensionData,
            softRequiredPropertiesExtensionData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExtensionData{extensionStatusMap=$extensionStatusMap, tags=$tags, caseChangeTestExtensionData=$caseChangeTestExtensionData, optionDecoratorsExtensionData=$optionDecoratorsExtensionData, requiredPropertiesExtensionData=$requiredPropertiesExtensionData, softRequiredPropertiesExtensionData=$softRequiredPropertiesExtensionData, additionalProperties=$additionalProperties}"
}
