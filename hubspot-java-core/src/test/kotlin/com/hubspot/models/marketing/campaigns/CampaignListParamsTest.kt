// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.campaigns

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListParamsTest {

    @Test
    fun create() {
        CampaignListParams.builder()
            .after("after")
            .limit(0)
            .name("name")
            .addProperty("string")
            .sort("sort")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListParams.builder()
                .after("after")
                .limit(0)
                .name("name")
                .addProperty("string")
                .sort("sort")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("name", "name")
                    .put("properties", listOf("string").joinToString(","))
                    .put("sort", "sort")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
