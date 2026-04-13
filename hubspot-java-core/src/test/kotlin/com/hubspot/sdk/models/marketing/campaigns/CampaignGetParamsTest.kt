// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignGetParamsTest {

    @Test
    fun create() {
        CampaignGetParams.builder()
            .campaignGuid("campaignGuid")
            .endDate("endDate")
            .addProperty("string")
            .startDate("startDate")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignGetParams.builder().campaignGuid("campaignGuid").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CampaignGetParams.builder()
                .campaignGuid("campaignGuid")
                .endDate("endDate")
                .addProperty("string")
                .startDate("startDate")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "endDate")
                    .put("properties", listOf("string").joinToString(","))
                    .put("startDate", "startDate")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignGetParams.builder().campaignGuid("campaignGuid").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
