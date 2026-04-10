// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cardsdev

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
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.core.toImmutable
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TopLevelActions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val secondary: JsonField<List<Secondary>>,
    private val primary: JsonField<Primary>,
    private val settings: JsonField<IFrameActionBody>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("secondary")
        @ExcludeMissing
        secondary: JsonField<List<Secondary>> = JsonMissing.of(),
        @JsonProperty("primary") @ExcludeMissing primary: JsonField<Primary> = JsonMissing.of(),
        @JsonProperty("settings")
        @ExcludeMissing
        settings: JsonField<IFrameActionBody> = JsonMissing.of(),
    ) : this(secondary, primary, settings, mutableMapOf())

    /**
     * Specifies a list of secondary actions for a card, each of which can be an action hook or an
     * iframe.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun secondary(): List<Secondary> = secondary.getRequired("secondary")

    /**
     * Defines the primary action for a card, which can be either an action hook or an iframe.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primary(): Optional<Primary> = primary.getOptional("primary")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settings(): Optional<IFrameActionBody> = settings.getOptional("settings")

    /**
     * Returns the raw JSON value of [secondary].
     *
     * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("secondary")
    @ExcludeMissing
    fun _secondary(): JsonField<List<Secondary>> = secondary

    /**
     * Returns the raw JSON value of [primary].
     *
     * Unlike [primary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary") @ExcludeMissing fun _primary(): JsonField<Primary> = primary

    /**
     * Returns the raw JSON value of [settings].
     *
     * Unlike [settings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settings")
    @ExcludeMissing
    fun _settings(): JsonField<IFrameActionBody> = settings

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
         * Returns a mutable builder for constructing an instance of [TopLevelActions].
         *
         * The following fields are required:
         * ```java
         * .secondary()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TopLevelActions]. */
    class Builder internal constructor() {

        private var secondary: JsonField<MutableList<Secondary>>? = null
        private var primary: JsonField<Primary> = JsonMissing.of()
        private var settings: JsonField<IFrameActionBody> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(topLevelActions: TopLevelActions) = apply {
            secondary = topLevelActions.secondary.map { it.toMutableList() }
            primary = topLevelActions.primary
            settings = topLevelActions.settings
            additionalProperties = topLevelActions.additionalProperties.toMutableMap()
        }

        /**
         * Specifies a list of secondary actions for a card, each of which can be an action hook or
         * an iframe.
         */
        fun secondary(secondary: List<Secondary>) = secondary(JsonField.of(secondary))

        /**
         * Sets [Builder.secondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.secondary] with a well-typed `List<Secondary>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun secondary(secondary: JsonField<List<Secondary>>) = apply {
            this.secondary = secondary.map { it.toMutableList() }
        }

        /**
         * Adds a single [Secondary] to [Builder.secondary].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSecondary(secondary: Secondary) = apply {
            this.secondary =
                (this.secondary ?: JsonField.of(mutableListOf())).also {
                    checkKnown("secondary", it).add(secondary)
                }
        }

        /**
         * Alias for calling [addSecondary] with
         * `Secondary.ofActionHookActionBody(actionHookActionBody)`.
         */
        fun addSecondary(actionHookActionBody: ActionHookActionBody) =
            addSecondary(Secondary.ofActionHookActionBody(actionHookActionBody))

        /**
         * Alias for calling [addSecondary] with `Secondary.ofIFrameActionBody(iFrameActionBody)`.
         */
        fun addSecondary(iFrameActionBody: IFrameActionBody) =
            addSecondary(Secondary.ofIFrameActionBody(iFrameActionBody))

        /**
         * Defines the primary action for a card, which can be either an action hook or an iframe.
         */
        fun primary(primary: Primary) = primary(JsonField.of(primary))

        /**
         * Sets [Builder.primary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primary] with a well-typed [Primary] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun primary(primary: JsonField<Primary>) = apply { this.primary = primary }

        /**
         * Alias for calling [primary] with `Primary.ofActionHookActionBody(actionHookActionBody)`.
         */
        fun primary(actionHookActionBody: ActionHookActionBody) =
            primary(Primary.ofActionHookActionBody(actionHookActionBody))

        /** Alias for calling [primary] with `Primary.ofIFrameActionBody(iFrameActionBody)`. */
        fun primary(iFrameActionBody: IFrameActionBody) =
            primary(Primary.ofIFrameActionBody(iFrameActionBody))

        fun settings(settings: IFrameActionBody) = settings(JsonField.of(settings))

        /**
         * Sets [Builder.settings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settings] with a well-typed [IFrameActionBody] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settings(settings: JsonField<IFrameActionBody>) = apply { this.settings = settings }

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
         * Returns an immutable instance of [TopLevelActions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .secondary()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TopLevelActions =
            TopLevelActions(
                checkRequired("secondary", secondary).map { it.toImmutable() },
                primary,
                settings,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TopLevelActions = apply {
        if (validated) {
            return@apply
        }

        secondary().forEach { it.validate() }
        primary().ifPresent { it.validate() }
        settings().ifPresent { it.validate() }
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
        (secondary.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (primary.asKnown().getOrNull()?.validity() ?: 0) +
            (settings.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Secondary.Deserializer::class)
    @JsonSerialize(using = Secondary.Serializer::class)
    class Secondary
    private constructor(
        private val actionHookActionBody: ActionHookActionBody? = null,
        private val iFrameActionBody: IFrameActionBody? = null,
        private val _json: JsonValue? = null,
    ) {

        fun actionHookActionBody(): Optional<ActionHookActionBody> =
            Optional.ofNullable(actionHookActionBody)

        fun iFrameActionBody(): Optional<IFrameActionBody> = Optional.ofNullable(iFrameActionBody)

        fun isActionHookActionBody(): Boolean = actionHookActionBody != null

        fun isIFrameActionBody(): Boolean = iFrameActionBody != null

        fun asActionHookActionBody(): ActionHookActionBody =
            actionHookActionBody.getOrThrow("actionHookActionBody")

        fun asIFrameActionBody(): IFrameActionBody = iFrameActionBody.getOrThrow("iFrameActionBody")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                actionHookActionBody != null ->
                    visitor.visitActionHookActionBody(actionHookActionBody)
                iFrameActionBody != null -> visitor.visitIFrameActionBody(iFrameActionBody)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Secondary = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitActionHookActionBody(
                        actionHookActionBody: ActionHookActionBody
                    ) {
                        actionHookActionBody.validate()
                    }

                    override fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody) {
                        iFrameActionBody.validate()
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
                    override fun visitActionHookActionBody(
                        actionHookActionBody: ActionHookActionBody
                    ) = actionHookActionBody.validity()

                    override fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody) =
                        iFrameActionBody.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Secondary &&
                actionHookActionBody == other.actionHookActionBody &&
                iFrameActionBody == other.iFrameActionBody
        }

        override fun hashCode(): Int = Objects.hash(actionHookActionBody, iFrameActionBody)

        override fun toString(): String =
            when {
                actionHookActionBody != null ->
                    "Secondary{actionHookActionBody=$actionHookActionBody}"
                iFrameActionBody != null -> "Secondary{iFrameActionBody=$iFrameActionBody}"
                _json != null -> "Secondary{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Secondary")
            }

        companion object {

            @JvmStatic
            fun ofActionHookActionBody(actionHookActionBody: ActionHookActionBody) =
                Secondary(actionHookActionBody = actionHookActionBody)

            @JvmStatic
            fun ofIFrameActionBody(iFrameActionBody: IFrameActionBody) =
                Secondary(iFrameActionBody = iFrameActionBody)
        }

        /**
         * An interface that defines how to map each variant of [Secondary] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitActionHookActionBody(actionHookActionBody: ActionHookActionBody): T

            fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody): T

            /**
             * Maps an unknown variant of [Secondary] to a value of type [T].
             *
             * An instance of [Secondary] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Secondary: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Secondary>(Secondary::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Secondary {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ActionHookActionBody>())?.let {
                                Secondary(actionHookActionBody = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IFrameActionBody>())?.let {
                                Secondary(iFrameActionBody = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Secondary(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Secondary>(Secondary::class) {

            override fun serialize(
                value: Secondary,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.actionHookActionBody != null ->
                        generator.writeObject(value.actionHookActionBody)
                    value.iFrameActionBody != null -> generator.writeObject(value.iFrameActionBody)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Secondary")
                }
            }
        }
    }

    /** Defines the primary action for a card, which can be either an action hook or an iframe. */
    @JsonDeserialize(using = Primary.Deserializer::class)
    @JsonSerialize(using = Primary.Serializer::class)
    class Primary
    private constructor(
        private val actionHookActionBody: ActionHookActionBody? = null,
        private val iFrameActionBody: IFrameActionBody? = null,
        private val _json: JsonValue? = null,
    ) {

        fun actionHookActionBody(): Optional<ActionHookActionBody> =
            Optional.ofNullable(actionHookActionBody)

        fun iFrameActionBody(): Optional<IFrameActionBody> = Optional.ofNullable(iFrameActionBody)

        fun isActionHookActionBody(): Boolean = actionHookActionBody != null

        fun isIFrameActionBody(): Boolean = iFrameActionBody != null

        fun asActionHookActionBody(): ActionHookActionBody =
            actionHookActionBody.getOrThrow("actionHookActionBody")

        fun asIFrameActionBody(): IFrameActionBody = iFrameActionBody.getOrThrow("iFrameActionBody")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                actionHookActionBody != null ->
                    visitor.visitActionHookActionBody(actionHookActionBody)
                iFrameActionBody != null -> visitor.visitIFrameActionBody(iFrameActionBody)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Primary = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitActionHookActionBody(
                        actionHookActionBody: ActionHookActionBody
                    ) {
                        actionHookActionBody.validate()
                    }

                    override fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody) {
                        iFrameActionBody.validate()
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
                    override fun visitActionHookActionBody(
                        actionHookActionBody: ActionHookActionBody
                    ) = actionHookActionBody.validity()

                    override fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody) =
                        iFrameActionBody.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Primary &&
                actionHookActionBody == other.actionHookActionBody &&
                iFrameActionBody == other.iFrameActionBody
        }

        override fun hashCode(): Int = Objects.hash(actionHookActionBody, iFrameActionBody)

        override fun toString(): String =
            when {
                actionHookActionBody != null ->
                    "Primary{actionHookActionBody=$actionHookActionBody}"
                iFrameActionBody != null -> "Primary{iFrameActionBody=$iFrameActionBody}"
                _json != null -> "Primary{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Primary")
            }

        companion object {

            @JvmStatic
            fun ofActionHookActionBody(actionHookActionBody: ActionHookActionBody) =
                Primary(actionHookActionBody = actionHookActionBody)

            @JvmStatic
            fun ofIFrameActionBody(iFrameActionBody: IFrameActionBody) =
                Primary(iFrameActionBody = iFrameActionBody)
        }

        /**
         * An interface that defines how to map each variant of [Primary] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitActionHookActionBody(actionHookActionBody: ActionHookActionBody): T

            fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody): T

            /**
             * Maps an unknown variant of [Primary] to a value of type [T].
             *
             * An instance of [Primary] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Primary: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Primary>(Primary::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Primary {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ActionHookActionBody>())?.let {
                                Primary(actionHookActionBody = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IFrameActionBody>())?.let {
                                Primary(iFrameActionBody = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Primary(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Primary>(Primary::class) {

            override fun serialize(
                value: Primary,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.actionHookActionBody != null ->
                        generator.writeObject(value.actionHookActionBody)
                    value.iFrameActionBody != null -> generator.writeObject(value.iFrameActionBody)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Primary")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TopLevelActions &&
            secondary == other.secondary &&
            primary == other.primary &&
            settings == other.settings &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(secondary, primary, settings, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TopLevelActions{secondary=$secondary, primary=$primary, settings=$settings, additionalProperties=$additionalProperties}"
}
