// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences.statuses.batch

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUnsubscribeAllParamsTest {

    @Test
    fun create() {
        BatchUnsubscribeAllParams.builder()
            .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
            .businessUnitId(0L)
            .verbose(true)
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BatchUnsubscribeAllParams.builder()
                .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
                .businessUnitId(0L)
                .verbose(true)
                .batchInputString(BatchInputString.builder().addInput("string").build())
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
            BatchUnsubscribeAllParams.builder()
                .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }

    @Test
    fun body() {
        val params =
            BatchUnsubscribeAllParams.builder()
                .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
                .businessUnitId(0L)
                .verbose(true)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchUnsubscribeAllParams.builder()
                .channel(BatchUnsubscribeAllParams.Channel.EMAIL)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
