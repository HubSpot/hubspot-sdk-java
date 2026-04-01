// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineCreateStageParamsTest {

    @Test
    fun create() {
        PipelineCreateStageParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .pipelineStageInput(
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineCreateStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineStageInput(
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

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PipelineCreateStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineStageInput(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineCreateStageParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineStageInput(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }
}
