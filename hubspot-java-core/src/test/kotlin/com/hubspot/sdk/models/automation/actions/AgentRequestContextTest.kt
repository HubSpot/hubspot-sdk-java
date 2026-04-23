// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRequestContextTest {

    @Test
    fun create() {
        val agentRequestContext =
            AgentRequestContext.builder()
                .agentId(0L)
                .chirpAiContextObject(
                    ChirpAiContextObject.builder()
                        .applicationGroup("applicationGroup")
                        .applicationId("applicationId")
                        .metadata(
                            ChirpAiContextObject.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .otelContextHolder(
                            ChirpAiContextObject.OtelContextHolder.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addUnstructuredSource(ChirpAiContextObject.UnstructuredSource.NONE)
                        .complianceIds(
                            ComplianceIds.builder()
                                .addContactId(
                                    ContactId.builder().portalId(0).email("email").vid(0L).build()
                                )
                                .addPortalId(0)
                                .addUserId(0)
                                .noContactIdReason("noContactIdReason")
                                .noPortalIdReason("noPortalIdReason")
                                .noUserIdReason("noUserIdReason")
                                .build()
                        )
                        .conversationId("conversationId")
                        .featureId("featureId")
                        .inferenceId("inferenceId")
                        .trajectoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .source(AgentRequestContext.Source.AGENTS)
                .trajectoryId("trajectoryId")
                .build()

        assertThat(agentRequestContext.agentId()).isEqualTo(0L)
        assertThat(agentRequestContext.chirpAiContextObject())
            .isEqualTo(
                ChirpAiContextObject.builder()
                    .applicationGroup("applicationGroup")
                    .applicationId("applicationId")
                    .metadata(
                        ChirpAiContextObject.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .otelContextHolder(
                        ChirpAiContextObject.OtelContextHolder.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addUnstructuredSource(ChirpAiContextObject.UnstructuredSource.NONE)
                    .complianceIds(
                        ComplianceIds.builder()
                            .addContactId(
                                ContactId.builder().portalId(0).email("email").vid(0L).build()
                            )
                            .addPortalId(0)
                            .addUserId(0)
                            .noContactIdReason("noContactIdReason")
                            .noPortalIdReason("noPortalIdReason")
                            .noUserIdReason("noUserIdReason")
                            .build()
                    )
                    .conversationId("conversationId")
                    .featureId("featureId")
                    .inferenceId("inferenceId")
                    .trajectoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(agentRequestContext.source()).isEqualTo(AgentRequestContext.Source.AGENTS)
        assertThat(agentRequestContext.trajectoryId()).contains("trajectoryId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentRequestContext =
            AgentRequestContext.builder()
                .agentId(0L)
                .chirpAiContextObject(
                    ChirpAiContextObject.builder()
                        .applicationGroup("applicationGroup")
                        .applicationId("applicationId")
                        .metadata(
                            ChirpAiContextObject.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .otelContextHolder(
                            ChirpAiContextObject.OtelContextHolder.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addUnstructuredSource(ChirpAiContextObject.UnstructuredSource.NONE)
                        .complianceIds(
                            ComplianceIds.builder()
                                .addContactId(
                                    ContactId.builder().portalId(0).email("email").vid(0L).build()
                                )
                                .addPortalId(0)
                                .addUserId(0)
                                .noContactIdReason("noContactIdReason")
                                .noPortalIdReason("noPortalIdReason")
                                .noUserIdReason("noUserIdReason")
                                .build()
                        )
                        .conversationId("conversationId")
                        .featureId("featureId")
                        .inferenceId("inferenceId")
                        .trajectoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .source(AgentRequestContext.Source.AGENTS)
                .trajectoryId("trajectoryId")
                .build()

        val roundtrippedAgentRequestContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentRequestContext),
                jacksonTypeRef<AgentRequestContext>(),
            )

        assertThat(roundtrippedAgentRequestContext).isEqualTo(agentRequestContext)
    }
}
