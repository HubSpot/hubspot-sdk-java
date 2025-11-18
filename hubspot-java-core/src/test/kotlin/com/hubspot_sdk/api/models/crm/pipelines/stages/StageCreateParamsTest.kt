// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines.stages

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.crm.pipelines.PipelineStageInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StageCreateParamsTest {

    @Test
    fun create() {
        StageCreateParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
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
            StageCreateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
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

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StageCreateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
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
}
