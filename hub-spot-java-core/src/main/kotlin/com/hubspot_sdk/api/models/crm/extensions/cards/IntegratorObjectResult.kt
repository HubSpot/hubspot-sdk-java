// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.cards

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

class IntegratorObjectResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val actions: JsonField<List<Action>>,
    private val title: JsonField<String>,
    private val tokens: JsonField<List<ObjectToken>>,
    private val linkUrl: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actions")
        @ExcludeMissing
        actions: JsonField<List<Action>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tokens")
        @ExcludeMissing
        tokens: JsonField<List<ObjectToken>> = JsonMissing.of(),
        @JsonProperty("linkUrl") @ExcludeMissing linkUrl: JsonField<String> = JsonMissing.of(),
    ) : this(id, actions, title, tokens, linkUrl, mutableMapOf())

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): List<ObjectToken> = tokens.getRequired("tokens")

    /**
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkUrl(): Optional<String> = linkUrl.getOptional("linkUrl")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<List<Action>> = actions

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

    /**
     * Returns the raw JSON value of [tokens].
     *
     * Unlike [tokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tokens") @ExcludeMissing fun _tokens(): JsonField<List<ObjectToken>> = tokens

    /**
     * Returns the raw JSON value of [linkUrl].
     *
     * Unlike [linkUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("linkUrl") @ExcludeMissing fun _linkUrl(): JsonField<String> = linkUrl

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
         * Returns a mutable builder for constructing an instance of [IntegratorObjectResult].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actions()
         * .title()
         * .tokens()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegratorObjectResult]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var actions: JsonField<MutableList<Action>>? = null
        private var title: JsonField<String>? = null
        private var tokens: JsonField<MutableList<ObjectToken>>? = null
        private var linkUrl: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integratorObjectResult: IntegratorObjectResult) = apply {
            id = integratorObjectResult.id
            actions = integratorObjectResult.actions.map { it.toMutableList() }
            title = integratorObjectResult.title
            tokens = integratorObjectResult.tokens.map { it.toMutableList() }
            linkUrl = integratorObjectResult.linkUrl
            additionalProperties = integratorObjectResult.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun actions(actions: List<Action>) = actions(JsonField.of(actions))

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed `List<Action>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actions(actions: JsonField<List<Action>>) = apply {
            this.actions = actions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Action] to [actions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAction(action: Action) = apply {
            actions =
                (actions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actions", it).add(action)
                }
        }

        /** Alias for calling [addAction] with `Action.ofHookActionBody(hookActionBody)`. */
        fun addAction(hookActionBody: ActionHookActionBody) =
            addAction(Action.ofHookActionBody(hookActionBody))

        /** Alias for calling [addAction] with `Action.ofIFrameActionBody(iFrameActionBody)`. */
        fun addAction(iFrameActionBody: IFrameActionBody) =
            addAction(Action.ofIFrameActionBody(iFrameActionBody))

        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        fun tokens(tokens: List<ObjectToken>) = tokens(JsonField.of(tokens))

        /**
         * Sets [Builder.tokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokens] with a well-typed `List<ObjectToken>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokens(tokens: JsonField<List<ObjectToken>>) = apply {
            this.tokens = tokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [ObjectToken] to [tokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addToken(token: ObjectToken) = apply {
            tokens =
                (tokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("tokens", it).add(token)
                }
        }

        fun linkUrl(linkUrl: String) = linkUrl(JsonField.of(linkUrl))

        /**
         * Sets [Builder.linkUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun linkUrl(linkUrl: JsonField<String>) = apply { this.linkUrl = linkUrl }

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
         * Returns an immutable instance of [IntegratorObjectResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .actions()
         * .title()
         * .tokens()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegratorObjectResult =
            IntegratorObjectResult(
                checkRequired("id", id),
                checkRequired("actions", actions).map { it.toImmutable() },
                checkRequired("title", title),
                checkRequired("tokens", tokens).map { it.toImmutable() },
                linkUrl,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IntegratorObjectResult = apply {
        if (validated) {
            return@apply
        }

        id()
        actions().forEach { it.validate() }
        title()
        tokens().forEach { it.validate() }
        linkUrl()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (actions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0) +
            (tokens.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (linkUrl.asKnown().isPresent) 1 else 0)

    @JsonDeserialize(using = Action.Deserializer::class)
    @JsonSerialize(using = Action.Serializer::class)
    class Action
    private constructor(
        private val hookActionBody: ActionHookActionBody? = null,
        private val iFrameActionBody: IFrameActionBody? = null,
        private val _json: JsonValue? = null,
    ) {

        fun hookActionBody(): Optional<ActionHookActionBody> = Optional.ofNullable(hookActionBody)

        fun iFrameActionBody(): Optional<IFrameActionBody> = Optional.ofNullable(iFrameActionBody)

        fun isHookActionBody(): Boolean = hookActionBody != null

        fun isIFrameActionBody(): Boolean = iFrameActionBody != null

        fun asHookActionBody(): ActionHookActionBody = hookActionBody.getOrThrow("hookActionBody")

        fun asIFrameActionBody(): IFrameActionBody = iFrameActionBody.getOrThrow("iFrameActionBody")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                hookActionBody != null -> visitor.visitHookActionBody(hookActionBody)
                iFrameActionBody != null -> visitor.visitIFrameActionBody(iFrameActionBody)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitHookActionBody(hookActionBody: ActionHookActionBody) {
                        hookActionBody.validate()
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
                    override fun visitHookActionBody(hookActionBody: ActionHookActionBody) =
                        hookActionBody.validity()

                    override fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody) =
                        iFrameActionBody.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action &&
                hookActionBody == other.hookActionBody &&
                iFrameActionBody == other.iFrameActionBody
        }

        override fun hashCode(): Int = Objects.hash(hookActionBody, iFrameActionBody)

        override fun toString(): String =
            when {
                hookActionBody != null -> "Action{hookActionBody=$hookActionBody}"
                iFrameActionBody != null -> "Action{iFrameActionBody=$iFrameActionBody}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic
            fun ofHookActionBody(hookActionBody: ActionHookActionBody) =
                Action(hookActionBody = hookActionBody)

            @JvmStatic
            fun ofIFrameActionBody(iFrameActionBody: IFrameActionBody) =
                Action(iFrameActionBody = iFrameActionBody)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitHookActionBody(hookActionBody: ActionHookActionBody): T

            fun visitIFrameActionBody(iFrameActionBody: IFrameActionBody): T

            /**
             * Maps an unknown variant of [Action] to a value of type [T].
             *
             * An instance of [Action] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws HubSpotInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw HubSpotInvalidDataException("Unknown Action: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Action>(Action::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Action {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<ActionHookActionBody>())?.let {
                                Action(hookActionBody = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<IFrameActionBody>())?.let {
                                Action(iFrameActionBody = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Action(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Action>(Action::class) {

            override fun serialize(
                value: Action,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.hookActionBody != null -> generator.writeObject(value.hookActionBody)
                    value.iFrameActionBody != null -> generator.writeObject(value.iFrameActionBody)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Action")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntegratorObjectResult &&
            id == other.id &&
            actions == other.actions &&
            title == other.title &&
            tokens == other.tokens &&
            linkUrl == other.linkUrl &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, actions, title, tokens, linkUrl, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegratorObjectResult{id=$id, actions=$actions, title=$title, tokens=$tokens, linkUrl=$linkUrl, additionalProperties=$additionalProperties}"
}
