// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.participations

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipationListBreakdownByIdParamsTest {

    @Test
    fun create() {
        ParticipationListBreakdownByIdParams.builder()
            .marketingEventId(0L)
            .after("after")
            .contactIdentifier("contactIdentifier")
            .limit(0)
            .state("state")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ParticipationListBreakdownByIdParams.builder().marketingEventId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ParticipationListBreakdownByIdParams.builder()
                .marketingEventId(0L)
                .after("after")
                .contactIdentifier("contactIdentifier")
                .limit(0)
                .state("state")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("contactIdentifier", "contactIdentifier")
                    .put("limit", "0")
                    .put("state", "state")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ParticipationListBreakdownByIdParams.builder().marketingEventId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
