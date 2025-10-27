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
import com.hubspot_sdk.api.core.checkKnown
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class HubSpotFormDefinitionPatchRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val archived: JsonField<Boolean>,
    private val configuration: JsonField<HubSpotFormConfiguration>,
    private val displayOptions: JsonField<FormDisplayOptions>,
    private val fieldGroups: JsonField<List<FieldGroup>>,
    private val legalConsentOptions: JsonField<LegalConsentOptions>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("configuration")
        @ExcludeMissing
        configuration: JsonField<HubSpotFormConfiguration> = JsonMissing.of(),
        @JsonProperty("displayOptions")
        @ExcludeMissing
        displayOptions: JsonField<FormDisplayOptions> = JsonMissing.of(),
        @JsonProperty("fieldGroups")
        @ExcludeMissing
        fieldGroups: JsonField<List<FieldGroup>> = JsonMissing.of(),
        @JsonProperty("legalConsentOptions")
        @ExcludeMissing
        legalConsentOptions: JsonField<LegalConsentOptions> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        archived,
        configuration,
        displayOptions,
        fieldGroups,
        legalConsentOptions,
        name,
        mutableMapOf(),
    )

    /**
     * Whether this form is archived.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configuration(): Optional<HubSpotFormConfiguration> =
        configuration.getOptional("configuration")

    /**
     * Options for styling the form.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayOptions(): Optional<FormDisplayOptions> =
        displayOptions.getOptional("displayOptions")

    /**
     * The fields in the form, grouped in rows.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fieldGroups(): Optional<List<FieldGroup>> = fieldGroups.getOptional("fieldGroups")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalConsentOptions(): Optional<LegalConsentOptions> =
        legalConsentOptions.getOptional("legalConsentOptions")

    /**
     * The name of the form. Expected to be unique for a hub.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /**
     * Returns the raw JSON value of [configuration].
     *
     * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configuration")
    @ExcludeMissing
    fun _configuration(): JsonField<HubSpotFormConfiguration> = configuration

    /**
     * Returns the raw JSON value of [displayOptions].
     *
     * Unlike [displayOptions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("displayOptions")
    @ExcludeMissing
    fun _displayOptions(): JsonField<FormDisplayOptions> = displayOptions

    /**
     * Returns the raw JSON value of [fieldGroups].
     *
     * Unlike [fieldGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fieldGroups")
    @ExcludeMissing
    fun _fieldGroups(): JsonField<List<FieldGroup>> = fieldGroups

    /**
     * Returns the raw JSON value of [legalConsentOptions].
     *
     * Unlike [legalConsentOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("legalConsentOptions")
    @ExcludeMissing
    fun _legalConsentOptions(): JsonField<LegalConsentOptions> = legalConsentOptions

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of
         * [HubSpotFormDefinitionPatchRequest].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HubSpotFormDefinitionPatchRequest]. */
    class Builder internal constructor() {

        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var configuration: JsonField<HubSpotFormConfiguration> = JsonMissing.of()
        private var displayOptions: JsonField<FormDisplayOptions> = JsonMissing.of()
        private var fieldGroups: JsonField<MutableList<FieldGroup>>? = null
        private var legalConsentOptions: JsonField<LegalConsentOptions> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(hubSpotFormDefinitionPatchRequest: HubSpotFormDefinitionPatchRequest) =
            apply {
                archived = hubSpotFormDefinitionPatchRequest.archived
                configuration = hubSpotFormDefinitionPatchRequest.configuration
                displayOptions = hubSpotFormDefinitionPatchRequest.displayOptions
                fieldGroups =
                    hubSpotFormDefinitionPatchRequest.fieldGroups.map { it.toMutableList() }
                legalConsentOptions = hubSpotFormDefinitionPatchRequest.legalConsentOptions
                name = hubSpotFormDefinitionPatchRequest.name
                additionalProperties =
                    hubSpotFormDefinitionPatchRequest.additionalProperties.toMutableMap()
            }

        /** Whether this form is archived. */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        fun configuration(configuration: HubSpotFormConfiguration) =
            configuration(JsonField.of(configuration))

        /**
         * Sets [Builder.configuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configuration] with a well-typed
         * [HubSpotFormConfiguration] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun configuration(configuration: JsonField<HubSpotFormConfiguration>) = apply {
            this.configuration = configuration
        }

        /** Options for styling the form. */
        fun displayOptions(displayOptions: FormDisplayOptions) =
            displayOptions(JsonField.of(displayOptions))

        /**
         * Sets [Builder.displayOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayOptions] with a well-typed [FormDisplayOptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun displayOptions(displayOptions: JsonField<FormDisplayOptions>) = apply {
            this.displayOptions = displayOptions
        }

        /** The fields in the form, grouped in rows. */
        fun fieldGroups(fieldGroups: List<FieldGroup>) = fieldGroups(JsonField.of(fieldGroups))

        /**
         * Sets [Builder.fieldGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldGroups] with a well-typed `List<FieldGroup>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fieldGroups(fieldGroups: JsonField<List<FieldGroup>>) = apply {
            this.fieldGroups = fieldGroups.map { it.toMutableList() }
        }

        /**
         * Adds a single [FieldGroup] to [fieldGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFieldGroup(fieldGroup: FieldGroup) = apply {
            fieldGroups =
                (fieldGroups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fieldGroups", it).add(fieldGroup)
                }
        }

        fun legalConsentOptions(legalConsentOptions: LegalConsentOptions) =
            legalConsentOptions(JsonField.of(legalConsentOptions))

        /**
         * Sets [Builder.legalConsentOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalConsentOptions] with a well-typed
         * [LegalConsentOptions] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun legalConsentOptions(legalConsentOptions: JsonField<LegalConsentOptions>) = apply {
            this.legalConsentOptions = legalConsentOptions
        }

        /** Alias for calling [legalConsentOptions] with `LegalConsentOptions.ofNone(none)`. */
        fun legalConsentOptions(none: LegalConsentOptionsNone) =
            legalConsentOptions(LegalConsentOptions.ofNone(none))

        /**
         * Alias for calling [legalConsentOptions] with
         * `LegalConsentOptions.ofLegitimateInterest(legitimateInterest)`.
         */
        fun legalConsentOptions(legitimateInterest: LegalConsentOptionsLegitimateInterest) =
            legalConsentOptions(LegalConsentOptions.ofLegitimateInterest(legitimateInterest))

        /**
         * Alias for calling [legalConsentOptions] with
         * `LegalConsentOptions.ofExplicitConsentToProcess(explicitConsentToProcess)`.
         */
        fun legalConsentOptions(
            explicitConsentToProcess: LegalConsentOptionsExplicitConsentToProcess
        ) =
            legalConsentOptions(
                LegalConsentOptions.ofExplicitConsentToProcess(explicitConsentToProcess)
            )

        /**
         * Alias for calling [legalConsentOptions] with
         * `LegalConsentOptions.ofImplicitConsentToProcess(implicitConsentToProcess)`.
         */
        fun legalConsentOptions(
            implicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess
        ) =
            legalConsentOptions(
                LegalConsentOptions.ofImplicitConsentToProcess(implicitConsentToProcess)
            )

        /** The name of the form. Expected to be unique for a hub. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [HubSpotFormDefinitionPatchRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HubSpotFormDefinitionPatchRequest =
            HubSpotFormDefinitionPatchRequest(
                archived,
                configuration,
                displayOptions,
                (fieldGroups ?: JsonMissing.of()).map { it.toImmutable() },
                legalConsentOptions,
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HubSpotFormDefinitionPatchRequest = apply {
        if (validated) {
            return@apply
        }

        archived()
        configuration().ifPresent { it.validate() }
        displayOptions().ifPresent { it.validate() }
        fieldGroups().ifPresent { it.forEach { it.validate() } }
        legalConsentOptions().ifPresent { it.validate() }
        name()
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
        (if (archived.asKnown().isPresent) 1 else 0) +
            (configuration.asKnown().getOrNull()?.validity() ?: 0) +
            (displayOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (fieldGroups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (legalConsentOptions.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = LegalConsentOptions.Deserializer::class)
    @JsonSerialize(using = LegalConsentOptions.Serializer::class)
    class LegalConsentOptions
    private constructor(
        private val none: LegalConsentOptionsNone? = null,
        private val legitimateInterest: LegalConsentOptionsLegitimateInterest? = null,
        private val explicitConsentToProcess: LegalConsentOptionsExplicitConsentToProcess? = null,
        private val implicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess? = null,
        private val _json: JsonValue? = null,
    ) {

        fun none(): Optional<LegalConsentOptionsNone> = Optional.ofNullable(none)

        fun legitimateInterest(): Optional<LegalConsentOptionsLegitimateInterest> =
            Optional.ofNullable(legitimateInterest)

        fun explicitConsentToProcess(): Optional<LegalConsentOptionsExplicitConsentToProcess> =
            Optional.ofNullable(explicitConsentToProcess)

        fun implicitConsentToProcess(): Optional<LegalConsentOptionsImplicitConsentToProcess> =
            Optional.ofNullable(implicitConsentToProcess)

        fun isNone(): Boolean = none != null

        fun isLegitimateInterest(): Boolean = legitimateInterest != null

        fun isExplicitConsentToProcess(): Boolean = explicitConsentToProcess != null

        fun isImplicitConsentToProcess(): Boolean = implicitConsentToProcess != null

        fun asNone(): LegalConsentOptionsNone = none.getOrThrow("none")

        fun asLegitimateInterest(): LegalConsentOptionsLegitimateInterest =
            legitimateInterest.getOrThrow("legitimateInterest")

        fun asExplicitConsentToProcess(): LegalConsentOptionsExplicitConsentToProcess =
            explicitConsentToProcess.getOrThrow("explicitConsentToProcess")

        fun asImplicitConsentToProcess(): LegalConsentOptionsImplicitConsentToProcess =
            implicitConsentToProcess.getOrThrow("implicitConsentToProcess")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                none != null -> visitor.visitNone(none)
                legitimateInterest != null -> visitor.visitLegitimateInterest(legitimateInterest)
                explicitConsentToProcess != null ->
                    visitor.visitExplicitConsentToProcess(explicitConsentToProcess)
                implicitConsentToProcess != null ->
                    visitor.visitImplicitConsentToProcess(implicitConsentToProcess)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): LegalConsentOptions = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNone(none: LegalConsentOptionsNone) {
                        none.validate()
                    }

                    override fun visitLegitimateInterest(
                        legitimateInterest: LegalConsentOptionsLegitimateInterest
                    ) {
                        legitimateInterest.validate()
                    }

                    override fun visitExplicitConsentToProcess(
                        explicitConsentToProcess: LegalConsentOptionsExplicitConsentToProcess
                    ) {
                        explicitConsentToProcess.validate()
                    }

                    override fun visitImplicitConsentToProcess(
                        implicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess
                    ) {
                        implicitConsentToProcess.validate()
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
                    override fun visitNone(none: LegalConsentOptionsNone) = none.validity()

                    override fun visitLegitimateInterest(
                        legitimateInterest: LegalConsentOptionsLegitimateInterest
                    ) = legitimateInterest.validity()

                    override fun visitExplicitConsentToProcess(
                        explicitConsentToProcess: LegalConsentOptionsExplicitConsentToProcess
                    ) = explicitConsentToProcess.validity()

                    override fun visitImplicitConsentToProcess(
                        implicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess
                    ) = implicitConsentToProcess.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LegalConsentOptions &&
                none == other.none &&
                legitimateInterest == other.legitimateInterest &&
                explicitConsentToProcess == other.explicitConsentToProcess &&
                implicitConsentToProcess == other.implicitConsentToProcess
        }

        override fun hashCode(): Int =
            Objects.hash(
                none,
                legitimateInterest,
                explicitConsentToProcess,
                implicitConsentToProcess,
            )

        override fun toString(): String =
            when {
                none != null -> "LegalConsentOptions{none=$none}"
                legitimateInterest != null ->
                    "LegalConsentOptions{legitimateInterest=$legitimateInterest}"
                explicitConsentToProcess != null ->
                    "LegalConsentOptions{explicitConsentToProcess=$explicitConsentToProcess}"
                implicitConsentToProcess != null ->
                    "LegalConsentOptions{implicitConsentToProcess=$implicitConsentToProcess}"
                _json != null -> "LegalConsentOptions{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid LegalConsentOptions")
            }

        companion object {

            @JvmStatic fun ofNone(none: LegalConsentOptionsNone) = LegalConsentOptions(none = none)

            @JvmStatic
            fun ofLegitimateInterest(legitimateInterest: LegalConsentOptionsLegitimateInterest) =
                LegalConsentOptions(legitimateInterest = legitimateInterest)

            @JvmStatic
            fun ofExplicitConsentToProcess(
                explicitConsentToProcess: LegalConsentOptionsExplicitConsentToProcess
            ) = LegalConsentOptions(explicitConsentToProcess = explicitConsentToProcess)

            @JvmStatic
            fun ofImplicitConsentToProcess(
                implicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess
            ) = LegalConsentOptions(implicitConsentToProcess = implicitConsentToProcess)
        }

        /**
         * An interface that defines how to map each variant of [LegalConsentOptions] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitNone(none: LegalConsentOptionsNone): T

            fun visitLegitimateInterest(
                legitimateInterest: LegalConsentOptionsLegitimateInterest
            ): T

            fun visitExplicitConsentToProcess(
                explicitConsentToProcess: LegalConsentOptionsExplicitConsentToProcess
            ): T

            fun visitImplicitConsentToProcess(
                implicitConsentToProcess: LegalConsentOptionsImplicitConsentToProcess
            ): T

            /**
             * Maps an unknown variant of [LegalConsentOptions] to a value of type [T].
             *
             * An instance of [LegalConsentOptions] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown LegalConsentOptions: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<LegalConsentOptions>(LegalConsentOptions::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): LegalConsentOptions {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<LegalConsentOptionsNone>())?.let {
                                LegalConsentOptions(none = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<LegalConsentOptionsLegitimateInterest>(),
                                )
                                ?.let {
                                    LegalConsentOptions(legitimateInterest = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<LegalConsentOptionsExplicitConsentToProcess>(),
                                )
                                ?.let {
                                    LegalConsentOptions(explicitConsentToProcess = it, _json = json)
                                },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<LegalConsentOptionsImplicitConsentToProcess>(),
                                )
                                ?.let {
                                    LegalConsentOptions(implicitConsentToProcess = it, _json = json)
                                },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> LegalConsentOptions(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<LegalConsentOptions>(LegalConsentOptions::class) {

            override fun serialize(
                value: LegalConsentOptions,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.none != null -> generator.writeObject(value.none)
                    value.legitimateInterest != null ->
                        generator.writeObject(value.legitimateInterest)
                    value.explicitConsentToProcess != null ->
                        generator.writeObject(value.explicitConsentToProcess)
                    value.implicitConsentToProcess != null ->
                        generator.writeObject(value.implicitConsentToProcess)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid LegalConsentOptions")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HubSpotFormDefinitionPatchRequest &&
            archived == other.archived &&
            configuration == other.configuration &&
            displayOptions == other.displayOptions &&
            fieldGroups == other.fieldGroups &&
            legalConsentOptions == other.legalConsentOptions &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            archived,
            configuration,
            displayOptions,
            fieldGroups,
            legalConsentOptions,
            name,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HubSpotFormDefinitionPatchRequest{archived=$archived, configuration=$configuration, displayOptions=$displayOptions, fieldGroups=$fieldGroups, legalConsentOptions=$legalConsentOptions, name=$name, additionalProperties=$additionalProperties}"
}
