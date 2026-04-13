// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.account.activity

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActivityListLoginActivitiesParamsTest {

    @Test
    fun create() {
        ActivityListLoginActivitiesParams.builder().after("after").limit(0).userId(0).build()
    }

    @Test
    fun queryParams() {
        val params =
            ActivityListLoginActivitiesParams.builder().after("after").limit(0).userId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("userId", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ActivityListLoginActivitiesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
