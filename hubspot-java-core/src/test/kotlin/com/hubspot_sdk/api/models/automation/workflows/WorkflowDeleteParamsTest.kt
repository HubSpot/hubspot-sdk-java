// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowDeleteParamsTest {

    @Test
    fun create() {
        WorkflowDeleteParams.builder().flowId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = WorkflowDeleteParams.builder().flowId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
