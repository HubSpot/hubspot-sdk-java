// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.hubspot.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineUpdateStageParamsTest {

    @Test
    fun create() {
        PipelineUpdateStageParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .stageId("stageId")
            .pipelineStagePatchInput(
                PipelineStagePatchInput.builder()
                    .metadata(
                        PipelineStagePatchInput.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .archived(true)
                    .displayOrder(0)
                    .label("label")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineUpdateStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStagePatchInput(
                    PipelineStagePatchInput.builder()
                        .metadata(
                            PipelineStagePatchInput.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
            PipelineUpdateStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStagePatchInput(
                    PipelineStagePatchInput.builder()
                        .metadata(
                            PipelineStagePatchInput.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .archived(true)
                        .displayOrder(0)
                        .label("label")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineStagePatchInput.builder()
                    .metadata(
                        PipelineStagePatchInput.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .archived(true)
                    .displayOrder(0)
                    .label("label")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineUpdateStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStagePatchInput(
                    PipelineStagePatchInput.builder()
                        .metadata(
                            PipelineStagePatchInput.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
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
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
