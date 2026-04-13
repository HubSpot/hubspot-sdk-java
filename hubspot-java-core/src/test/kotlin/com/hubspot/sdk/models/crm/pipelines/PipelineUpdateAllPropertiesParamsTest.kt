// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.pipelines

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineUpdateAllPropertiesParamsTest {

    @Test
    fun create() {
        PipelineUpdateAllPropertiesParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .validateDealStageUsagesBeforeDelete(true)
            .validateReferencesBeforeDelete(true)
            .pipelineReplaceInput(
                PipelineReplaceInput.builder()
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
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineUpdateAllPropertiesParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineReplaceInput(
                    PipelineReplaceInput.builder()
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
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PipelineUpdateAllPropertiesParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
                .pipelineReplaceInput(
                    PipelineReplaceInput.builder()
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
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("validateDealStageUsagesBeforeDelete", "true")
                    .put("validateReferencesBeforeDelete", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PipelineUpdateAllPropertiesParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineReplaceInput(
                    PipelineReplaceInput.builder()
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PipelineUpdateAllPropertiesParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
                .pipelineReplaceInput(
                    PipelineReplaceInput.builder()
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelineReplaceInput.builder()
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
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineUpdateAllPropertiesParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineReplaceInput(
                    PipelineReplaceInput.builder()
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
                PipelineReplaceInput.builder()
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
