// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.hubspot.core.JsonValue
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
                    .label("label")
                    .addStage(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .stageId("stageId")
                            .build()
                    )
                    .pipelineId("pipelineId")
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
                        .label("label")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("label")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
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
                        .label("label")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("label")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .stageId("stageId")
                                .build()
                        )
                        .pipelineId("pipelineId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineInput.builder()
                    .displayOrder(0)
                    .label("label")
                    .addStage(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .stageId("stageId")
                            .build()
                    )
                    .pipelineId("pipelineId")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineCreateParams.builder()
                .objectType("objectType")
                .pipelineInput(
                    PipelineInput.builder()
                        .displayOrder(0)
                        .label("label")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("label")
                                .metadata(
                                    PipelineStageInput.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
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
                    .label("label")
                    .addStage(
                        PipelineStageInput.builder()
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStageInput.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
