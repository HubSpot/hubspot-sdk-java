// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents.participations

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationListBreakdownByContactParamsTest {

    @Test
    fun create() {
        ParticipationListBreakdownByContactParams.builder()
            .contactIdentifier("contactIdentifier")
            .after("after")
            .limit(0)
            .state("state")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipationListBreakdownByContactParams.builder()
                .contactIdentifier("contactIdentifier")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("contactIdentifier")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ParticipationListBreakdownByContactParams.builder()
                .contactIdentifier("contactIdentifier")
                .after("after")
                .limit(0)
                .state("state")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("state", "state")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ParticipationListBreakdownByContactParams.builder()
                .contactIdentifier("contactIdentifier")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
