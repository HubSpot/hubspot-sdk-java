// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineCreateParamsTest {

    @Test
    fun create() {
        PipelineCreateParams.builder()
            .objectType("objectType")
            .pipelineInput(
                PipelineInput.builder()
                    .displayOrder(0)
                    .label("My replaced pipeline")
                    .addStage(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("In Progress")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                                    .build()
                            )
                            .build()
                    )
                    .addStage(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineCreateParams.builder()
                .objectType("objectType")
                .pipelineInput(
                    PipelineInput.builder()
                        .displayOrder(0)
                        .label("My replaced pipeline")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("In Progress")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("OPEN"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(1)
                                .label("Done")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("CLOSED"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PipelineCreateParams.builder()
                .objectType("objectType")
                .pipelineInput(
                    PipelineInput.builder()
                        .displayOrder(0)
                        .label("My replaced pipeline")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("In Progress")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("OPEN"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(1)
                                .label("Done")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("CLOSED"),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineInput.builder()
                    .displayOrder(0)
                    .label("My replaced pipeline")
                    .addStage(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("In Progress")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                                    .build()
                            )
                            .build()
                    )
                    .addStage(
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
            )
    }
}
