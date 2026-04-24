// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StandaloneRequestContextTest {

    @Test
    fun create() {
        val standaloneRequestContext =
            StandaloneRequestContext.builder()
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
                .source(StandaloneRequestContext.Source.STANDALONE)
                .trajectoryId("trajectoryId")
                .build()

        assertThat(standaloneRequestContext.chirpAiContextObject())
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
        assertThat(standaloneRequestContext.source())
            .isEqualTo(StandaloneRequestContext.Source.STANDALONE)
        assertThat(standaloneRequestContext.trajectoryId()).contains("trajectoryId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val standaloneRequestContext =
            StandaloneRequestContext.builder()
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
                .source(StandaloneRequestContext.Source.STANDALONE)
                .trajectoryId("trajectoryId")
                .build()

        val roundtrippedStandaloneRequestContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(standaloneRequestContext),
                jacksonTypeRef<StandaloneRequestContext>(),
            )

        assertThat(roundtrippedStandaloneRequestContext).isEqualTo(standaloneRequestContext)
    }
}
