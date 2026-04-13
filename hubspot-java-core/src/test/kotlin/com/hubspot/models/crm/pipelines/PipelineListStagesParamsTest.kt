// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineListStagesParamsTest {

    @Test
    fun create() {
        PipelineListStagesParams.builder().objectType("objectType").pipelineId("pipelineId").build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineListStagesParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
