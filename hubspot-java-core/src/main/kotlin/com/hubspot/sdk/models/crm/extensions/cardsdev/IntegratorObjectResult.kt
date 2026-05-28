// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.extensions.cardsdev

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
import com.hubspot.sdk.core.BaseDeserializer
import com.hubspot.sdk.core.BaseSerializer
import com.hubspot.sdk.core.ExcludeMissing
import com.hubspot.sdk.core.JsonField
import com.hubspot.sdk.core.JsonMissing
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.checkKnown
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.getOrThrow
import com.hubspot.sdk.core.toImmutable
import com.hubspot.sdk.errors.HubSpotInvalidDataException
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
     * The unique identifier for the card.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A list of actions associated with the card, which can include action hooks, confirmation
     * action hooks, or iframes.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun actions(): List<Action> = actions.getRequired("actions")

    /**
     * The top-level title for this card. Displayed to users in the CRM UI.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun title(): String = title.getRequired("title")

    /**
     * A collection of tokens representing specific properties related to the card.
     *
     * @throws HubSpotInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokens(): List<ObjectToken> = tokens.getRequired("tokens")

    /**
     * A URL used on the title of the card
     *
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

        /** The unique identifier for the card. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * A list of actions associated with the card, which can include action hooks, confirmation
         * action hooks, or iframes.
         */
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

        /** Alias for calling [addAction] with `Action.ofHook(hook)`. */
        fun addAction(hook: ActionHookActionBody) = addAction(Action.ofHook(hook))

        /** Alias for calling [addAction] with `Action.ofIframe(iframe)`. */
        fun addAction(iframe: IFrameActionBody) = addAction(Action.ofIframe(iframe))

        /** The top-level title for this card. Displayed to users in the CRM UI. */
        fun title(title: String) = title(JsonField.of(title))

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

        /** A collection of tokens representing specific properties related to the card. */
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

        /** A URL used on the title of the card */
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws HubSpotInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
        private val hook: ActionHookActionBody? = null,
        private val iframe: IFrameActionBody? = null,
        private val _json: JsonValue? = null,
    ) {

        fun hook(): Optional<ActionHookActionBody> = Optional.ofNullable(hook)

        fun iframe(): Optional<IFrameActionBody> = Optional.ofNullable(iframe)

        fun isHook(): Boolean = hook != null

        fun isIframe(): Boolean = iframe != null

        fun asHook(): ActionHookActionBody = hook.getOrThrow("hook")

        fun asIframe(): IFrameActionBody = iframe.getOrThrow("iframe")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.hubspot.sdk.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = action.accept(new Action.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitHook(ActionHookActionBody hook) {
         *         return Optional.of(hook.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws HubSpotInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                hook != null -> visitor.visitHook(hook)
                iframe != null -> visitor.visitIframe(iframe)
                else -> visitor.unknown(_json)
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
        fun validate(): Action = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitHook(hook: ActionHookActionBody) {
                        hook.validate()
                    }

                    override fun visitIframe(iframe: IFrameActionBody) {
                        iframe.validate()
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
                    override fun visitHook(hook: ActionHookActionBody) = hook.validity()

                    override fun visitIframe(iframe: IFrameActionBody) = iframe.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Action && hook == other.hook && iframe == other.iframe
        }

        override fun hashCode(): Int = Objects.hash(hook, iframe)

        override fun toString(): String =
            when {
                hook != null -> "Action{hook=$hook}"
                iframe != null -> "Action{iframe=$iframe}"
                _json != null -> "Action{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Action")
            }

        companion object {

            @JvmStatic fun ofHook(hook: ActionHookActionBody) = Action(hook = hook)

            @JvmStatic fun ofIframe(iframe: IFrameActionBody) = Action(iframe = iframe)
        }

        /** An interface that defines how to map each variant of [Action] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitHook(hook: ActionHookActionBody): T

            fun visitIframe(iframe: IFrameActionBody): T

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
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "ACTION_HOOK" -> {
                        return tryDeserialize(node, jacksonTypeRef<ActionHookActionBody>())?.let {
                            Action(hook = it, _json = json)
                        } ?: Action(_json = json)
                    }
                    "IFRAME" -> {
                        return tryDeserialize(node, jacksonTypeRef<IFrameActionBody>())?.let {
                            Action(iframe = it, _json = json)
                        } ?: Action(_json = json)
                    }
                }

                return Action(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Action>(Action::class) {

            override fun serialize(
                value: Action,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.hook != null -> generator.writeObject(value.hook)
                    value.iframe != null -> generator.writeObject(value.iframe)
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
