// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines.stages

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStagePatchInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StageUpdateParamsTest {

    @Test
    fun create() {
        StageUpdateParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .stageId("stageId")
            .pipelineStagePatchInput(
                PipelineStagePatchInput.builder()
                    .metadata(
                        PipelineStagePatchInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                            .build()
                    )
                    .archived(true)
                    .displayOrder(1)
                    .label("Done")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StageUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStagePatchInput(
                    PipelineStagePatchInput.builder()
                        .metadata(
                            PipelineStagePatchInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        assertThat(params._pathParam(2)).isEqualTo("stageId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StageUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStagePatchInput(
                    PipelineStagePatchInput.builder()
                        .metadata(
                            PipelineStagePatchInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                .build()
                        )
                        .archived(true)
                        .displayOrder(1)
                        .label("Done")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineStagePatchInput.builder()
                    .metadata(
                        PipelineStagePatchInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                            .build()
                    )
                    .archived(true)
                    .displayOrder(1)
                    .label("Done")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StageUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStagePatchInput(
                    PipelineStagePatchInput.builder()
                        .metadata(
                            PipelineStagePatchInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineStagePatchInput.builder()
                    .metadata(
                        PipelineStagePatchInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                            .build()
                    )
                    .build()
            )
    }
}
