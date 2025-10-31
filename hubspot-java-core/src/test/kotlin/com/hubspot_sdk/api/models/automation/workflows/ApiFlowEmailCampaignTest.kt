// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiFlowEmailCampaignTest {

    @Test
    fun create() {
        val apiFlowEmailCampaign =
            ApiFlowEmailCampaign.builder()
                .emailCampaignId("emailCampaignId")
                .emailContentId("emailContentId")
                .flowId("flowId")
                .build()

        assertThat(apiFlowEmailCampaign.emailCampaignId()).isEqualTo("emailCampaignId")
        assertThat(apiFlowEmailCampaign.emailContentId()).isEqualTo("emailContentId")
        assertThat(apiFlowEmailCampaign.flowId()).isEqualTo("flowId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiFlowEmailCampaign =
            ApiFlowEmailCampaign.builder()
                .emailCampaignId("emailCampaignId")
                .emailContentId("emailContentId")
                .flowId("flowId")
                .build()

        val roundtrippedApiFlowEmailCampaign =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiFlowEmailCampaign),
                jacksonTypeRef<ApiFlowEmailCampaign>(),
            )

        assertThat(roundtrippedApiFlowEmailCampaign).isEqualTo(apiFlowEmailCampaign)
    }
}
