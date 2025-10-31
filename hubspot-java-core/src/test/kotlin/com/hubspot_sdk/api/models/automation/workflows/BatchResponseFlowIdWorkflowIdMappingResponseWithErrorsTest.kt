// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseFlowIdWorkflowIdMappingResponseWithErrorsTest {

    @Test
    fun create() {
        val batchResponseFlowIdWorkflowIdMappingResponseWithErrors =
            BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.results())
            .containsExactly(
                FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()
            )
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.status())
            .isEqualTo(BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.Status.PENDING)
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.links())
            .contains(
                BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.numErrors()).contains(0)
        assertThat(batchResponseFlowIdWorkflowIdMappingResponseWithErrors.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseFlowIdWorkflowIdMappingResponseWithErrors =
            BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    FlowIdWorkflowIdMappingResponse.builder().flowId(0).workflowId(0).build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseFlowIdWorkflowIdMappingResponseWithErrors.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseFlowIdWorkflowIdMappingResponseWithErrors =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    batchResponseFlowIdWorkflowIdMappingResponseWithErrors
                ),
                jacksonTypeRef<BatchResponseFlowIdWorkflowIdMappingResponseWithErrors>(),
            )

        assertThat(roundtrippedBatchResponseFlowIdWorkflowIdMappingResponseWithErrors)
            .isEqualTo(batchResponseFlowIdWorkflowIdMappingResponseWithErrors)
    }
}
