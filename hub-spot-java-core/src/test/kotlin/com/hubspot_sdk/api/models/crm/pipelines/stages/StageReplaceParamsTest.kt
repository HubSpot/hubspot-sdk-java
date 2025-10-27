// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines.stages

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StageReplaceParamsTest {

    @Test
    fun create() {
        StageReplaceParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .stageId("stageId")
            .pipelineStageInput(
                PipelineStageInput.builder()
                    .displayOrder(1)
                    .label("Done")
                    .metadata(
                        PipelineStageInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StageReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStageInput(
                    PipelineStageInput.builder().displayOrder(1).label("Done").build()
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
            StageReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStageInput(
                    PipelineStageInput.builder()
                        .displayOrder(1)
                        .label("Done")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineStageInput.builder()
                    .displayOrder(1)
                    .label("Done")
                    .metadata(
                        PipelineStageInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StageReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStageInput(
                    PipelineStageInput.builder().displayOrder(1).label("Done").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PipelineStageInput.builder().displayOrder(1).label("Done").build())
    }
}
