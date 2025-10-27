// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowGetParamsTest {

    @Test
    fun create() {
        WorkflowGetParams.builder().flowId("flowId").build()
    }

    @Test
    fun pathParams() {
        val params = WorkflowGetParams.builder().flowId("flowId").build()

        assertThat(params._pathParam(0)).isEqualTo("flowId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
