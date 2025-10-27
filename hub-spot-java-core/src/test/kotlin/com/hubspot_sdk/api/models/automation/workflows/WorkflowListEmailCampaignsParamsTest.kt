// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkflowListEmailCampaignsParamsTest {

    @Test
    fun create() {
        WorkflowListEmailCampaignsParams.builder()
            .after("after")
            .before("before")
            .addFlowId("string")
            .limit(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WorkflowListEmailCampaignsParams.builder()
                .after("after")
                .before("before")
                .addFlowId("string")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("before", "before")
                    .put("flowId", listOf("string").joinToString(","))
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WorkflowListEmailCampaignsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
