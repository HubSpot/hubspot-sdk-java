// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseFlowIdWorkflowIdMappingResponseTest {

    @Test
    fun create() {
        val batchResponseFlowIdWorkflowIdMappingResponse =
            BatchResponseFlowIdWorkflowIdMappingResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseFlowIdWorkflowIdMappingResponse.Status.PENDING)
                .links(
                    BatchResponseFlowIdWorkflowIdMappingResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseFlowIdWorkflowIdMappingResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseFlowIdWorkflowIdMappingResponse.results())
            .containsExactly(
                FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()
            )
        assertThat(batchResponseFlowIdWorkflowIdMappingResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseFlowIdWorkflowIdMappingResponse.status())
            .isEqualTo(BatchResponseFlowIdWorkflowIdMappingResponse.Status.PENDING)
        assertThat(batchResponseFlowIdWorkflowIdMappingResponse.links())
            .contains(
                BatchResponseFlowIdWorkflowIdMappingResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseFlowIdWorkflowIdMappingResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseFlowIdWorkflowIdMappingResponse =
            BatchResponseFlowIdWorkflowIdMappingResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseFlowIdWorkflowIdMappingResponse.Status.PENDING)
                .links(
                    BatchResponseFlowIdWorkflowIdMappingResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseFlowIdWorkflowIdMappingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseFlowIdWorkflowIdMappingResponse),
                jacksonTypeRef<BatchResponseFlowIdWorkflowIdMappingResponse>(),
            )

        assertThat(roundtrippedBatchResponseFlowIdWorkflowIdMappingResponse)
            .isEqualTo(batchResponseFlowIdWorkflowIdMappingResponse)
    }
}
