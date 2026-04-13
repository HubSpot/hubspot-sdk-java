// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChirpAiContextObjectTest {

    @Test
    fun create() {
        val chirpAiContextObject =
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
                .featureId("featureId")
                .inferenceId("inferenceId")
                .trajectoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(chirpAiContextObject.applicationGroup()).isEqualTo("applicationGroup")
        assertThat(chirpAiContextObject.applicationId()).isEqualTo("applicationId")
        assertThat(chirpAiContextObject.metadata())
            .isEqualTo(
                ChirpAiContextObject.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chirpAiContextObject.otelContextHolder())
            .isEqualTo(
                ChirpAiContextObject.OtelContextHolder.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(chirpAiContextObject.unstructuredSources())
            .containsExactly(ChirpAiContextObject.UnstructuredSource.NONE)
        assertThat(chirpAiContextObject.complianceIds())
            .contains(
                ComplianceIds.builder()
                    .addContactId(ContactId.builder().portalId(0).email("email").vid(0L).build())
                    .addPortalId(0)
                    .addUserId(0)
                    .noContactIdReason("noContactIdReason")
                    .noPortalIdReason("noPortalIdReason")
                    .noUserIdReason("noUserIdReason")
                    .build()
            )
        assertThat(chirpAiContextObject.featureId()).contains("featureId")
        assertThat(chirpAiContextObject.inferenceId()).contains("inferenceId")
        assertThat(chirpAiContextObject.trajectoryId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chirpAiContextObject =
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
                .featureId("featureId")
                .inferenceId("inferenceId")
                .trajectoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedChirpAiContextObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chirpAiContextObject),
                jacksonTypeRef<ChirpAiContextObject>(),
            )

        assertThat(roundtrippedChirpAiContextObject).isEqualTo(chirpAiContextObject)
    }
}
