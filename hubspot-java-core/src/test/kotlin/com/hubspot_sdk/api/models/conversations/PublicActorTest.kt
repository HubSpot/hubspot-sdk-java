// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubspotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PublicActorTest {

    @Test
    fun ofAgent() {
        val agent =
            AgentActor.builder()
                .id("id")
                .type(AgentActor.Type.AGENT)
                .avatar("avatar")
                .email("email")
                .name("name")
                .build()

        val publicActor = PublicActor.ofAgent(agent)

        assertThat(publicActor.agent()).contains(agent)
        assertThat(publicActor.bot()).isEmpty
        assertThat(publicActor.integrator()).isEmpty
        assertThat(publicActor.system()).isEmpty
        assertThat(publicActor.visitor()).isEmpty
        assertThat(publicActor.email()).isEmpty
        assertThat(publicActor.llm()).isEmpty
    }

    @Test
    fun ofAgentRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofAgent(
                AgentActor.builder()
                    .id("id")
                    .type(AgentActor.Type.AGENT)
                    .avatar("avatar")
                    .email("email")
                    .name("name")
                    .build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    @Test
    fun ofBot() {
        val bot =
            BotActor.builder()
                .id("id")
                .type(BotActor.Type.BOT)
                .avatar("avatar")
                .name("name")
                .build()

        val publicActor = PublicActor.ofBot(bot)

        assertThat(publicActor.agent()).isEmpty
        assertThat(publicActor.bot()).contains(bot)
        assertThat(publicActor.integrator()).isEmpty
        assertThat(publicActor.system()).isEmpty
        assertThat(publicActor.visitor()).isEmpty
        assertThat(publicActor.email()).isEmpty
        assertThat(publicActor.llm()).isEmpty
    }

    @Test
    fun ofBotRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofBot(
                BotActor.builder()
                    .id("id")
                    .type(BotActor.Type.BOT)
                    .avatar("avatar")
                    .name("name")
                    .build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    @Test
    fun ofIntegrator() {
        val integrator =
            IntegratorActor.builder()
                .id("id")
                .name("name")
                .type(IntegratorActor.Type.INTEGRATOR)
                .avatar("avatar")
                .build()

        val publicActor = PublicActor.ofIntegrator(integrator)

        assertThat(publicActor.agent()).isEmpty
        assertThat(publicActor.bot()).isEmpty
        assertThat(publicActor.integrator()).contains(integrator)
        assertThat(publicActor.system()).isEmpty
        assertThat(publicActor.visitor()).isEmpty
        assertThat(publicActor.email()).isEmpty
        assertThat(publicActor.llm()).isEmpty
    }

    @Test
    fun ofIntegratorRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofIntegrator(
                IntegratorActor.builder()
                    .id("id")
                    .name("name")
                    .type(IntegratorActor.Type.INTEGRATOR)
                    .avatar("avatar")
                    .build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    @Test
    fun ofSystem() {
        val system = SystemActor.builder().id("id").type(SystemActor.Type.SYSTEM).build()

        val publicActor = PublicActor.ofSystem(system)

        assertThat(publicActor.agent()).isEmpty
        assertThat(publicActor.bot()).isEmpty
        assertThat(publicActor.integrator()).isEmpty
        assertThat(publicActor.system()).contains(system)
        assertThat(publicActor.visitor()).isEmpty
        assertThat(publicActor.email()).isEmpty
        assertThat(publicActor.llm()).isEmpty
    }

    @Test
    fun ofSystemRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofSystem(
                SystemActor.builder().id("id").type(SystemActor.Type.SYSTEM).build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    @Test
    fun ofVisitor() {
        val visitor =
            VisitorActor.builder()
                .id("id")
                .type(VisitorActor.Type.VISITOR)
                .avatar("avatar")
                .email("email")
                .name("name")
                .build()

        val publicActor = PublicActor.ofVisitor(visitor)

        assertThat(publicActor.agent()).isEmpty
        assertThat(publicActor.bot()).isEmpty
        assertThat(publicActor.integrator()).isEmpty
        assertThat(publicActor.system()).isEmpty
        assertThat(publicActor.visitor()).contains(visitor)
        assertThat(publicActor.email()).isEmpty
        assertThat(publicActor.llm()).isEmpty
    }

    @Test
    fun ofVisitorRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofVisitor(
                VisitorActor.builder()
                    .id("id")
                    .type(VisitorActor.Type.VISITOR)
                    .avatar("avatar")
                    .email("email")
                    .name("name")
                    .build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    @Test
    fun ofEmail() {
        val email = EmailActor.builder().id("id").email("email").type(EmailActor.Type.EMAIL).build()

        val publicActor = PublicActor.ofEmail(email)

        assertThat(publicActor.agent()).isEmpty
        assertThat(publicActor.bot()).isEmpty
        assertThat(publicActor.integrator()).isEmpty
        assertThat(publicActor.system()).isEmpty
        assertThat(publicActor.visitor()).isEmpty
        assertThat(publicActor.email()).contains(email)
        assertThat(publicActor.llm()).isEmpty
    }

    @Test
    fun ofEmailRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofEmail(
                EmailActor.builder().id("id").email("email").type(EmailActor.Type.EMAIL).build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    @Test
    fun ofLlm() {
        val llm =
            LlmActor.builder()
                .id("id")
                .type(LlmActor.Type.LLM)
                .avatar("avatar")
                .name("name")
                .build()

        val publicActor = PublicActor.ofLlm(llm)

        assertThat(publicActor.agent()).isEmpty
        assertThat(publicActor.bot()).isEmpty
        assertThat(publicActor.integrator()).isEmpty
        assertThat(publicActor.system()).isEmpty
        assertThat(publicActor.visitor()).isEmpty
        assertThat(publicActor.email()).isEmpty
        assertThat(publicActor.llm()).contains(llm)
    }

    @Test
    fun ofLlmRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicActor =
            PublicActor.ofLlm(
                LlmActor.builder()
                    .id("id")
                    .type(LlmActor.Type.LLM)
                    .avatar("avatar")
                    .name("name")
                    .build()
            )

        val roundtrippedPublicActor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicActor),
                jacksonTypeRef<PublicActor>(),
            )

        assertThat(roundtrippedPublicActor).isEqualTo(publicActor)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val publicActor = jsonMapper().convertValue(testCase.value, jacksonTypeRef<PublicActor>())

        val e = assertThrows<HubspotInvalidDataException> { publicActor.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
