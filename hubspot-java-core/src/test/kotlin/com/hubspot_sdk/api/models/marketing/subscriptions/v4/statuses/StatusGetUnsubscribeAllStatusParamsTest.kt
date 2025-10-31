// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusGetUnsubscribeAllStatusParamsTest {

    @Test
    fun create() {
        StatusGetUnsubscribeAllStatusParams.builder()
            .subscriberIdString("subscriberIdString")
            .channel(StatusGetUnsubscribeAllStatusParams.Channel.EMAIL)
            .businessUnitId(0L)
            .verbose(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StatusGetUnsubscribeAllStatusParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(StatusGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscriberIdString")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            StatusGetUnsubscribeAllStatusParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(StatusGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .businessUnitId(0L)
                .verbose(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("channel", "EMAIL")
                    .put("businessUnitId", "0")
                    .put("verbose", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            StatusGetUnsubscribeAllStatusParams.builder()
                .subscriberIdString("subscriberIdString")
                .channel(StatusGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }
}
