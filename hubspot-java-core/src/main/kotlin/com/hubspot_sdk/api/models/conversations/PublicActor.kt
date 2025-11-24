// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.BaseDeserializer
import com.hubspot_sdk.api.core.BaseSerializer
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.allMaxBy
import com.hubspot_sdk.api.core.getOrThrow
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = PublicActor.Deserializer::class)
@JsonSerialize(using = PublicActor.Serializer::class)
class PublicActor
private constructor(
    private val agent: AgentActor? = null,
    private val bot: BotActor? = null,
    private val integrator: IntegratorActor? = null,
    private val system: SystemActor? = null,
    private val visitor: VisitorActor? = null,
    private val email: EmailActor? = null,
    private val llm: LlmActor? = null,
    private val _json: JsonValue? = null,
) {

    fun agent(): Optional<AgentActor> = Optional.ofNullable(agent)

    fun bot(): Optional<BotActor> = Optional.ofNullable(bot)

    fun integrator(): Optional<IntegratorActor> = Optional.ofNullable(integrator)

    fun system(): Optional<SystemActor> = Optional.ofNullable(system)

    fun visitor(): Optional<VisitorActor> = Optional.ofNullable(visitor)

    fun email(): Optional<EmailActor> = Optional.ofNullable(email)

    fun llm(): Optional<LlmActor> = Optional.ofNullable(llm)

    fun isAgent(): Boolean = agent != null

    fun isBot(): Boolean = bot != null

    fun isIntegrator(): Boolean = integrator != null

    fun isSystem(): Boolean = system != null

    fun isVisitor(): Boolean = visitor != null

    fun isEmail(): Boolean = email != null

    fun isLlm(): Boolean = llm != null

    fun asAgent(): AgentActor = agent.getOrThrow("agent")

    fun asBot(): BotActor = bot.getOrThrow("bot")

    fun asIntegrator(): IntegratorActor = integrator.getOrThrow("integrator")

    fun asSystem(): SystemActor = system.getOrThrow("system")

    fun asVisitor(): VisitorActor = visitor.getOrThrow("visitor")

    fun asEmail(): EmailActor = email.getOrThrow("email")

    fun asLlm(): LlmActor = llm.getOrThrow("llm")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            agent != null -> visitor.visitAgent(agent)
            bot != null -> visitor.visitBot(bot)
            integrator != null -> visitor.visitIntegrator(integrator)
            system != null -> visitor.visitSystem(system)
            visitor != null -> visitor.visitVisitor(visitor)
            email != null -> visitor.visitEmail(email)
            llm != null -> visitor.visitLlm(llm)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): PublicActor = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAgent(agent: AgentActor) {
                    agent.validate()
                }

                override fun visitBot(bot: BotActor) {
                    bot.validate()
                }

                override fun visitIntegrator(integrator: IntegratorActor) {
                    integrator.validate()
                }

                override fun visitSystem(system: SystemActor) {
                    system.validate()
                }

                override fun visitVisitor(visitor: VisitorActor) {
                    visitor.validate()
                }

                override fun visitEmail(email: EmailActor) {
                    email.validate()
                }

                override fun visitLlm(llm: LlmActor) {
                    llm.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAgent(agent: AgentActor) = agent.validity()

                override fun visitBot(bot: BotActor) = bot.validity()

                override fun visitIntegrator(integrator: IntegratorActor) = integrator.validity()

                override fun visitSystem(system: SystemActor) = system.validity()

                override fun visitVisitor(visitor: VisitorActor) = visitor.validity()

                override fun visitEmail(email: EmailActor) = email.validity()

                override fun visitLlm(llm: LlmActor) = llm.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicActor &&
            agent == other.agent &&
            bot == other.bot &&
            integrator == other.integrator &&
            system == other.system &&
            visitor == other.visitor &&
            email == other.email &&
            llm == other.llm
    }

    override fun hashCode(): Int = Objects.hash(agent, bot, integrator, system, visitor, email, llm)

    override fun toString(): String =
        when {
            agent != null -> "PublicActor{agent=$agent}"
            bot != null -> "PublicActor{bot=$bot}"
            integrator != null -> "PublicActor{integrator=$integrator}"
            system != null -> "PublicActor{system=$system}"
            visitor != null -> "PublicActor{visitor=$visitor}"
            email != null -> "PublicActor{email=$email}"
            llm != null -> "PublicActor{llm=$llm}"
            _json != null -> "PublicActor{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PublicActor")
        }

    companion object {

        @JvmStatic fun ofAgent(agent: AgentActor) = PublicActor(agent = agent)

        @JvmStatic fun ofBot(bot: BotActor) = PublicActor(bot = bot)

        @JvmStatic
        fun ofIntegrator(integrator: IntegratorActor) = PublicActor(integrator = integrator)

        @JvmStatic fun ofSystem(system: SystemActor) = PublicActor(system = system)

        @JvmStatic fun ofVisitor(visitor: VisitorActor) = PublicActor(visitor = visitor)

        @JvmStatic fun ofEmail(email: EmailActor) = PublicActor(email = email)

        @JvmStatic fun ofLlm(llm: LlmActor) = PublicActor(llm = llm)
    }

    /**
     * An interface that defines how to map each variant of [PublicActor] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitAgent(agent: AgentActor): T

        fun visitBot(bot: BotActor): T

        fun visitIntegrator(integrator: IntegratorActor): T

        fun visitSystem(system: SystemActor): T

        fun visitVisitor(visitor: VisitorActor): T

        fun visitEmail(email: EmailActor): T

        fun visitLlm(llm: LlmActor): T

        /**
         * Maps an unknown variant of [PublicActor] to a value of type [T].
         *
         * An instance of [PublicActor] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws HubspotInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw HubspotInvalidDataException("Unknown PublicActor: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PublicActor>(PublicActor::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PublicActor {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AgentActor>())?.let {
                            PublicActor(agent = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BotActor>())?.let {
                            PublicActor(bot = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<IntegratorActor>())?.let {
                            PublicActor(integrator = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SystemActor>())?.let {
                            PublicActor(system = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<VisitorActor>())?.let {
                            PublicActor(visitor = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<EmailActor>())?.let {
                            PublicActor(email = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LlmActor>())?.let {
                            PublicActor(llm = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PublicActor(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PublicActor>(PublicActor::class) {

        override fun serialize(
            value: PublicActor,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.agent != null -> generator.writeObject(value.agent)
                value.bot != null -> generator.writeObject(value.bot)
                value.integrator != null -> generator.writeObject(value.integrator)
                value.system != null -> generator.writeObject(value.system)
                value.visitor != null -> generator.writeObject(value.visitor)
                value.email != null -> generator.writeObject(value.email)
                value.llm != null -> generator.writeObject(value.llm)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PublicActor")
            }
        }
    }
}
