// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineReplaceParamsTest {

    @Test
    fun create() {
        PipelineReplaceParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .stageId("stageId")
            .pipelineStageReplaceInput(
                PipelineStageReplaceInput.builder()
                    .displayOrder(0)
                    .label("label")
                    .metadata(
                        PipelineStageReplaceInput.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStageReplaceInput(
                    PipelineStageReplaceInput.builder()
                        .displayOrder(0)
                        .label("label")
                        .metadata(
                            PipelineStageReplaceInput.Metadata.builder()
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
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .pipelineStageReplaceInput(
                    PipelineStageReplaceInput.builder()
                        .displayOrder(0)
                        .label("label")
                        .metadata(
                            PipelineStageReplaceInput.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineStageReplaceInput.builder()
                    .displayOrder(0)
                    .label("label")
                    .metadata(
                        PipelineStageReplaceInput.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
