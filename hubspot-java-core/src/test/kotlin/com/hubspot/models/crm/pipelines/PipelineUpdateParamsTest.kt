// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineUpdateParamsTest {

    @Test
    fun create() {
        PipelineUpdateParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .validateDealStageUsagesBeforeDelete(true)
            .validateReferencesBeforeDelete(true)
            .pipelinePatchInput(
                PipelinePatchInput.builder().archived(true).displayOrder(0).label("label").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelinePatchInput(PipelinePatchInput.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PipelineUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
                .pipelinePatchInput(
                    PipelinePatchInput.builder()
                        .archived(true)
                        .displayOrder(0)
                        .label("label")
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
            PipelineUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelinePatchInput(PipelinePatchInput.builder().build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            PipelineUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .validateDealStageUsagesBeforeDelete(true)
                .validateReferencesBeforeDelete(true)
                .pipelinePatchInput(
                    PipelinePatchInput.builder()
                        .archived(true)
                        .displayOrder(0)
                        .label("label")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PipelinePatchInput.builder().archived(true).displayOrder(0).label("label").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PipelineUpdateParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .pipelinePatchInput(PipelinePatchInput.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PipelinePatchInput.builder().build())
    }
}
