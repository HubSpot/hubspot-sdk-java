// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.transactional.smtptokens

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmtpTokenListParamsTest {

    @Test
    fun create() {
        SmtpTokenListParams.builder()
            .after("after")
            .campaignName("campaignName")
            .emailCampaignId("emailCampaignId")
            .limit(0)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SmtpTokenListParams.builder()
                .after("after")
                .campaignName("campaignName")
                .emailCampaignId("emailCampaignId")
                .limit(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("campaignName", "campaignName")
                    .put("emailCampaignId", "emailCampaignId")
                    .put("limit", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SmtpTokenListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
