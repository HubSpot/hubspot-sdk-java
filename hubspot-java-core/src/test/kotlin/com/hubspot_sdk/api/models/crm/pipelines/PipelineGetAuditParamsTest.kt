// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineGetAuditParamsTest {

    @Test
    fun create() {
        PipelineGetAuditParams.builder()
            .objectType("objectType")
            .pipelineId("pipelineId")
            .stageId("stageId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PipelineGetAuditParams.builder()
                .objectType("objectType")
                .pipelineId("pipelineId")
                .stageId("stageId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("pipelineId")
        assertThat(params._pathParam(2)).isEqualTo("stageId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
