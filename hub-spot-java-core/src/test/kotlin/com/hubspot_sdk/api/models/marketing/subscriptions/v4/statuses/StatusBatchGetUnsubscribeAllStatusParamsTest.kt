// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses

import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusBatchGetUnsubscribeAllStatusParamsTest {

    @Test
    fun create() {
        StatusBatchGetUnsubscribeAllStatusParams.builder()
            .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
            .businessUnitId(0L)
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            StatusBatchGetUnsubscribeAllStatusParams.builder()
                .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .businessUnitId(0L)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("channel", "EMAIL").put("businessUnitId", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            StatusBatchGetUnsubscribeAllStatusParams.builder()
                .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("channel", "EMAIL").build())
    }

    @Test
    fun body() {
        val params =
            StatusBatchGetUnsubscribeAllStatusParams.builder()
                .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .businessUnitId(0L)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StatusBatchGetUnsubscribeAllStatusParams.builder()
                .channel(StatusBatchGetUnsubscribeAllStatusParams.Channel.EMAIL)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
