// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineReplaceParamsTest {

    @Test
    fun create() {
        PipelineReplaceParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .validateDealStageUsagesBeforeDelete(true)
            .validateReferencesBeforeDelete(true)
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
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineInput(
                    PipelineInput.builder()
                        .displayOrder(0)
                        .label("My replaced pipeline")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("In Progress")
                                .build()
                        )
                        .addStage(
                            PipelineStageInput.builder().displayOrder(1).label("Done").build()
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
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
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
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineInput(
                    PipelineInput.builder()
                        .displayOrder(0)
                        .label("My replaced pipeline")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("In Progress")
                                .build()
                        )
                        .addStage(
                            PipelineStageInput.builder().displayOrder(1).label("Done").build()
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
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineReplaceParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelineInput(
                    PipelineInput.builder()
                        .displayOrder(0)
                        .label("My replaced pipeline")
                        .addStage(
                            PipelineStageInput.builder()
                                .displayOrder(0)
                                .label("In Progress")
                                .build()
                        )
                        .addStage(
                            PipelineStageInput.builder().displayOrder(1).label("Done").build()
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
                        PipelineStageInput.builder().displayOrder(0).label("In Progress").build()
                    )
                    .addStage(PipelineStageInput.builder().displayOrder(1).label("Done").build())
                    .build()
            )
    }
}
