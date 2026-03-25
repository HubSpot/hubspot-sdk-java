// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailGetAbTestVariationParamsTest {

    @Test
    fun create() {
        EmailGetAbTestVariationParams.builder()
            .emailId("emailId")
            .archived(true)
            .addIncludedProperty("string")
            .includeStats(true)
            .marketingCampaignNames(true)
            .variantStats(true)
            .workflowNames(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = EmailGetAbTestVariationParams.builder().emailId("emailId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            EmailGetAbTestVariationParams.builder()
                .emailId("emailId")
                .archived(true)
                .addIncludedProperty("string")
                .includeStats(true)
                .marketingCampaignNames(true)
                .variantStats(true)
                .workflowNames(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("includedProperties", listOf("string").joinToString(","))
                    .put("includeStats", "true")
                    .put("marketingCampaignNames", "true")
                    .put("variantStats", "true")
                    .put("workflowNames", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailGetAbTestVariationParams.builder().emailId("emailId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
